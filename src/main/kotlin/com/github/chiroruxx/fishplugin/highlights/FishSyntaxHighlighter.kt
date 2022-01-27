package com.github.chiroruxx.fishplugin.highlights

import com.github.chiroruxx.fishplugin.languages.FishLexerAdapter
import com.github.chiroruxx.fishplugin.languages.FishTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class FishSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = FishLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            FishTypes.COMMAND -> COMMAND_KEYS
            FishTypes.ARG -> ARG_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        private val COMMAND: TextAttributesKey =
            createTextAttributesKey("FISH_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        private val ARG: TextAttributesKey =
            createTextAttributesKey("FISH_VALUE", DefaultLanguageHighlighterColors.STRING)
        private val BAD_CHARACTER: TextAttributesKey =
            createTextAttributesKey("FISH_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val COMMAND_KEYS = arrayOf(COMMAND)
        private val ARG_KEYS = arrayOf(ARG)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}
