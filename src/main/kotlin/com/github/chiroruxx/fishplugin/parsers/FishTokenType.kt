package com.github.chiroruxx.fishplugin.parsers

import com.github.chiroruxx.fishplugin.languages.FishLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull


class FishTokenType(@NotNull debugName: @NonNls String) : IElementType(debugName, FishLanguage) {
    override fun toString(): String {
        return "FishTokenType." + super.toString()
    }
}
