package com.github.chiroruxx.fishplugin.parsers

import com.github.chiroruxx.fishplugin.languages.FishLanguage
import com.github.chiroruxx.fishplugin.lexers.FishFile
import com.github.chiroruxx.fishplugin.lexers.FishLexerAdapter
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.jetbrains.annotations.NotNull


class FishParserDefinition : ParserDefinition {
    @NotNull
    override fun createLexer(project: Project?): Lexer {
        return FishLexerAdapter()
    }

    @NotNull
    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    @NotNull
    override fun getCommentTokens(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun createParser(project: Project?): PsiParser {
        return FishParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return FishFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): SpaceRequirements {
        return SpaceRequirements.MAY
    }

    @NotNull
    override fun createElement(node: ASTNode): PsiElement {
        return FishTypes.Factory.createElement(node)
    }

    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
//        val COMMENTS = TokenSet.create(FishTypes.COMMENT)
        val FILE = IFileElementType(FishLanguage)
    }
}
