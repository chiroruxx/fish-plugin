// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.chiroruxx.fishplugin.lexers;

import com.github.chiroruxx.fishplugin.parsers.FishTypes;
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
CHARACTER=[^\ \n\f\\] | "\\"{CRLF} | "\\".
SEPARATOR={WHITE_SPACE}+

%state WAITING_ARG

%%

<YYINITIAL> {CHARACTER}+                                    { yybegin(YYINITIAL); return FishTypes.COMMAND; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_ARG); return FishTypes.SEPARATOR; }

<WAITING_ARG> {CRLF}                                        { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_ARG> {WHITE_SPACE}+                                { yybegin(WAITING_ARG); return FishTypes.SEPARATOR; }

<WAITING_ARG> {CHARACTER}+                                  { yybegin(WAITING_ARG); return FishTypes.ARG; }

{CRLF}+                                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
