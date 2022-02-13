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
CHARACTER=[^'<>\"\ \n\f\\] | "\\"{CRLF} | "\\"[^abefnrtv\ \$\\\*\?\~\%\#\(\)\{\}\[\]\<\>\^\&\;\"\']
ESCAPE_SEQUENCE="\\"[abefnrtv\ \$\\\*\?\~\%\#\(\)\{\}\[\]\<\>\^\&\;\"\']

SEPARATOR={WHITE_SPACE}+
SINGLE_QUOTE="'"
SINGLE_QUOTE_STRING_CHARACTER=[^'\n\\] | "\\"[^'\\]
SINGLE_QUOTE_ESCAPE_SEQUENCE="\\"['\\]
DOUBLE_QUOTE="\""
DOUBLE_QUOTE_STRING_CHARACTER=[^\"\n\\] | "\\"[^\"\$\\\n]
DOUBLE_QUOTE_ESCAPE_SEQUENCE="\\"[\"\$\\\n]

REDIRECT_INPUT_SYMBOLE=<
REDIRECT_SYMBOLE=>
REDIRECT_FILE={CHARACTER}+

ARG_CHARACTERS={CHARACTER}+

%state WAITING_ARGS
%state WAITING_SINGLE_QUOTE_STRING
%state WAITING_DOUBLE_QUOTE_STRING
%state WAITING_REDIRECT_FILE
%state WAITING_REDIRECTS

%%

<YYINITIAL> {CHARACTER}+                                       { yybegin(YYINITIAL); return FishTypes.COMMAND; }
<YYINITIAL> {SEPARATOR}                                        { yybegin(WAITING_ARGS); return TokenType.WHITE_SPACE; }

<WAITING_ARGS> {WHITE_SPACE}+                                  { yybegin(WAITING_ARGS); return TokenType.WHITE_SPACE; }
<WAITING_ARGS> {SINGLE_QUOTE}                                  { yybegin(WAITING_SINGLE_QUOTE_STRING); return FishTypes.QUOTE; }
<WAITING_ARGS> {DOUBLE_QUOTE}                                  { yybegin(WAITING_DOUBLE_QUOTE_STRING); return FishTypes.QUOTE; }
<WAITING_ARGS> {ARG_CHARACTERS}                                { yybegin(WAITING_ARGS); return FishTypes.CHARACTERS; }
<WAITING_ARGS> {ESCAPE_SEQUENCE}                               { yybegin(WAITING_ARGS); return FishTypes.ESCAPE_CHARACTERS; }
<WAITING_ARGS> {REDIRECT_INPUT_SYMBOLE}                        { yybegin(WAITING_REDIRECT_FILE); return FishTypes.REDIRECT_SYMBOLE; }
<WAITING_ARGS> {REDIRECT_SYMBOLE}                              { yybegin(WAITING_REDIRECT_FILE); return FishTypes.REDIRECT_SYMBOLE; }
<WAITING_ARGS> {CRLF}                                          { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_SINGLE_QUOTE_STRING> {SINGLE_QUOTE}                   { yybegin(WAITING_ARGS); return FishTypes.QUOTE; }
<WAITING_SINGLE_QUOTE_STRING> {SINGLE_QUOTE_ESCAPE_SEQUENCE}   { yybegin(WAITING_SINGLE_QUOTE_STRING); return FishTypes.ESCAPE_CHARACTERS; }
<WAITING_SINGLE_QUOTE_STRING> {SINGLE_QUOTE_STRING_CHARACTER}+ { yybegin(WAITING_SINGLE_QUOTE_STRING); return FishTypes.STRING_CHARACTERS; }

<WAITING_DOUBLE_QUOTE_STRING> {DOUBLE_QUOTE}                   { yybegin(WAITING_ARGS); return FishTypes.QUOTE; }
<WAITING_DOUBLE_QUOTE_STRING> {DOUBLE_QUOTE_ESCAPE_SEQUENCE}   { yybegin(WAITING_DOUBLE_QUOTE_STRING); return FishTypes.ESCAPE_CHARACTERS; }
<WAITING_DOUBLE_QUOTE_STRING> {DOUBLE_QUOTE_STRING_CHARACTER}+ { yybegin(WAITING_DOUBLE_QUOTE_STRING); return FishTypes.STRING_CHARACTERS; }

<WAITING_REDIRECT_FILE> {REDIRECT_FILE}                        { yybegin(WAITING_REDIRECTS); return FishTypes.REDIRECT_FILE; }
<WAITING_REDIRECT_FILE> {WHITE_SPACE}                          { yybegin(WAITING_REDIRECT_FILE); return TokenType.WHITE_SPACE; }

<WAITING_REDIRECTS> {REDIRECT_INPUT_SYMBOLE}                   { yybegin(WAITING_REDIRECT_FILE); return FishTypes.REDIRECT_SYMBOLE; }
<WAITING_REDIRECTS> {REDIRECT_SYMBOLE}                         { yybegin(WAITING_REDIRECT_FILE); return FishTypes.REDIRECT_SYMBOLE; }
<WAITING_REDIRECTS> {WHITE_SPACE}                              { yybegin(WAITING_REDIRECTS); return TokenType.WHITE_SPACE; }
<WAITING_REDIRECTS> {CRLF}                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{CRLF}+                                                        { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                            { return TokenType.BAD_CHARACTER; }
