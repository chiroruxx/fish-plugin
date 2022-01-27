package com.github.chiroruxx.fishplugin.lexers

import com.github.chiroruxx.fishplugin.languages.FishFileType
import com.github.chiroruxx.fishplugin.languages.FishLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.annotations.NotNull

class FishFile(@NotNull viewProvider: FileViewProvider) :
    PsiFileBase(viewProvider, FishLanguage) {
    @NotNull
    override fun getFileType(): FileType {
        return FishFileType
    }

    override fun toString(): String {
        return "Fish File"
    }
}
