package com.github.chiroruxx.fishplugin.languages

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object FishFileType : LanguageFileType(FishLanguage) {
    override fun getName(): String = "Fish shell file"

    override fun getDescription(): String = "Fish language file"

    override fun getDefaultExtension(): String = "fish"

    override fun getIcon(): Icon = AllIcons.FileTypes.Text
}
