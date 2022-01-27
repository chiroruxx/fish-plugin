package com.github.chiroruxx.fishplugin.languages

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class FishFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, FishLanguage) {
    override fun getFileType(): FileType = FishFileType

    override fun toString(): String {
        return "Fish File"
    }
}
