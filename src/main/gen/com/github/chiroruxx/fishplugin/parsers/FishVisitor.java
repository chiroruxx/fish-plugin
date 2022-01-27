// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.parsers;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class FishVisitor extends PsiElementVisitor {

  public void visitArgs(@NotNull FishArgs o) {
    visitPsiElement(o);
  }

  public void visitSentence(@NotNull FishSentence o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
