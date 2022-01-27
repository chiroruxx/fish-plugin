package com.github.chiroruxx.fishplugin.languages

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon


object FishFileType : LanguageFileType(FishLanguage) {
    @NotNull
    override fun getName(): String {
        return "Fish shell file"
    }

    @NotNull
    override fun getDescription(): String {
        return "Fish language file"
    }

    @NotNull
    override fun getDefaultExtension(): String {
        return "fish"
    }

    @Nullable
    override fun getIcon(): Icon {
        return AllIcons.FileTypes.Text
    }
}
