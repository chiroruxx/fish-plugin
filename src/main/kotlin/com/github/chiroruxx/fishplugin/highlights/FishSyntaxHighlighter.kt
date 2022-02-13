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
            FishTypes.QUOTE -> STRING_KEYS
            FishTypes.STRING_CHARACTERS -> STRING_KEYS
            FishTypes.REDIRECT_SYMBOLE -> REDIRECT_KEYS
            FishTypes.ESCAPE_CHARACTERS -> ESCAPE_SEQUENCE_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        private val COMMAND: TextAttributesKey =
            createTextAttributesKey("FISH_COMMAND", DefaultLanguageHighlighterColors.KEYWORD)
        private val STRING: TextAttributesKey =
            createTextAttributesKey("FISH_STRING", DefaultLanguageHighlighterColors.STRING)
        private val REDIRECT: TextAttributesKey =
            createTextAttributesKey("FISH_REDIRECT", DefaultLanguageHighlighterColors.KEYWORD)
        private val ESCAPE_SEQUENCE: TextAttributesKey =
            createTextAttributesKey("FISH_ESCAPE_SEQUENCE", DefaultLanguageHighlighterColors.KEYWORD)
        private val BAD_CHARACTER: TextAttributesKey =
            createTextAttributesKey("FISH_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val COMMAND_KEYS = arrayOf(COMMAND)
        private val STRING_KEYS = arrayOf(STRING)
        private val REDIRECT_KEYS = arrayOf(REDIRECT)
        private val ESCAPE_SEQUENCE_KEYS = arrayOf(ESCAPE_SEQUENCE)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}
