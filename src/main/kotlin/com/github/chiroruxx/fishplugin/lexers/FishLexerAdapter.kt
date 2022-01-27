package com.github.chiroruxx.fishplugin.lexers

import com.intellij.lexer.FlexAdapter

class FishLexerAdapter : FlexAdapter(FishLexer(null))
