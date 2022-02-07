// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.chiroruxx.fishplugin.languages;

import com.github.chiroruxx.fishplugin.languages.FishTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

%%

%class FishLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \t\f]
CHARACTER=[^'\ \n\f\\] | "\\"{CRLF} | "\\".

SEPARATOR={WHITE_SPACE}+
DOUBLE_QUOTE_STRING="\""({CHARACTER}|{WHITE_SPACE})*"\""
QUOTE="'"
STRING_CHARACTER={CHARACTER}|{WHITE_SPACE}

REDIRECT=[<>]
REDIRECT_FILE={CHARACTER}+
ARG_ONE_CHARACTER=[^'<>\ \n\f\\]
ARG={ARG_ONE_CHARACTER}|{CHARACTER}{CHARACTER}+

%state WAITING_ARGS
%state WAITING_STRING
%state WAITING_REDIRECT_FILE

%%

<YYINITIAL> {CHARACTER}+                { yybegin(YYINITIAL); return FishTypes.COMMAND; }
<YYINITIAL> {SEPARATOR}                 { yybegin(WAITING_ARGS); return TokenType.WHITE_SPACE; }

<WAITING_ARGS> {WHITE_SPACE}+           { yybegin(WAITING_ARGS); return TokenType.WHITE_SPACE; }
<WAITING_ARGS> {DOUBLE_QUOTE_STRING}    { yybegin(WAITING_ARGS); return FishTypes.OLD_STRING; }
<WAITING_ARGS> {QUOTE}                  { yybegin(WAITING_STRING); return FishTypes.QUOTE; }
<WAITING_ARGS> {ARG}+                   { yybegin(WAITING_ARGS); return FishTypes.ARG; }
<WAITING_ARGS> {REDIRECT}               { yybegin(WAITING_REDIRECT_FILE); return FishTypes.REDIRECT; }
<WAITING_ARGS> {CRLF}                   { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_STRING> {QUOTE}                { yybegin(WAITING_ARGS); return FishTypes.QUOTE; }
<WAITING_STRING> {STRING_CHARACTER}+    { yybegin(WAITING_STRING); return FishTypes.STRING_CHARACTERS; }

<WAITING_REDIRECT_FILE> {REDIRECT_FILE} { yybegin(WAITING_REDIRECT_FILE); return FishTypes.REDIRECT_FILE; }
<WAITING_REDIRECT_FILE> {WHITE_SPACE}   { yybegin(WAITING_REDIRECT_FILE); return TokenType.WHITE_SPACE; }
<WAITING_REDIRECT_FILE> {CRLF}          { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{CRLF}+                                 { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                     { return TokenType.BAD_CHARACTER; }
