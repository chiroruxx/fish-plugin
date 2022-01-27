package com.github.chiroruxx.fishplugin.languages

import com.intellij.lexer.FlexAdapter

class FishLexerAdapter : FlexAdapter(FishLexer(null))
