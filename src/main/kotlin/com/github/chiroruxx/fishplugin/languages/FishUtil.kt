package com.github.chiroruxx.fishplugin.languages

import com.google.common.collect.Lists
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import java.util.*

object FishUtil {
//    /**
//     * Searches the entire project for Simple language files with instances of the Simple property with the given key.
//     *
//     * @param project current project
//     * @param command to check
//     * @return matching properties
//     */
//    fun findSentences(project: Project, command: String): List<FishSentence> {
//        val result: MutableList<FishSentence> = ArrayList<FishSentence>()
//        val virtualFiles = FileTypeIndex.getFiles(FishFileType, GlobalSearchScope.allScope(project))
//        for (virtualFile in virtualFiles) {
//            val fishFile: FishFile? = PsiManager.getInstance(project).findFile(virtualFile!!) as FishFile?
//            if (fishFile != null) {
//                val sentences: Array<FishSentence>? = PsiTreeUtil.getChildrenOfType(
//                    fishFile,
//                    FishSentence::class.java
//                )
//                if (sentences != null) {
//                    for (sentence in sentences) {
//                        if (command == sentence.getCommand()) {
//                            result.add(sentence)
//                        }
//                    }
//                }
//            }
//        }
//        return result
//    }
//
//    fun findSentences(project: Project): List<FishSentence> {
//        val result: List<FishSentence> = ArrayList<FishSentence>()
//        val virtualFiles = FileTypeIndex.getFiles(FishFileType, GlobalSearchScope.allScope(project))
//        for (virtualFile in virtualFiles) {
//            val simpleFile: FishFile? = PsiManager.getInstance(project).findFile(virtualFile!!) as FishFile?
//            if (simpleFile != null) {
//                val properties: Array<FishSentence>? = PsiTreeUtil.getChildrenOfType(
//                    simpleFile,
//                    FishSentence::class.java
//                )
//                if (properties != null) {
//                    Collections.addAll(result, properties)
//                }
//            }
//        }
//        return result
//    }
//
//    /**
//     * Attempts to collect any comment elements above the Simple key/value pair.
//     */
//    fun findDocumentationComment(property: FishSentence): String {
//        val result: MutableList<String> = LinkedList()
//        var element: PsiElement = property.getPrevSibling()
//        while (element is PsiComment || element is PsiWhiteSpace) {
//            if (element is PsiComment) {
//                val commentText = element.getText().replaceFirst("[!# ]+".toRegex(), "")
//                result.add(commentText)
//            }
//            element = element.prevSibling
//        }
//        return StringUtil.join(Lists.reverse(result), "\n ")
//    }
}