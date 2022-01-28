package com.github.chiroruxx.fishplugin.languages.impl

import com.github.chiroruxx.fishplugin.languages.FishArgs
import com.github.chiroruxx.fishplugin.languages.FishSentence
import com.github.chiroruxx.fishplugin.languages.FishTypes
import com.intellij.lang.ASTNode

object FishPsiImplUtil {
    fun getCommand(element: FishSentence): String? {
        val commandNode: ASTNode? = element.node.findChildByType(FishTypes.COMMAND)
        return commandNode?.text?.replace("\\\\ ".toRegex(), " ")
    }

    fun getArg(element: FishArgs): String? {
        val argNode: ASTNode? = element.node.findChildByType(FishTypes.ARG)
        return argNode?.text
    }
}
