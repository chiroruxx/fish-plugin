// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.languages;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class FishVisitor extends PsiElementVisitor {

  public void visitArg(@NotNull FishArg o) {
    visitPsiElement(o);
  }

  public void visitArgs(@NotNull FishArgs o) {
    visitPsiElement(o);
  }

  public void visitDestination(@NotNull FishDestination o) {
    visitPsiElement(o);
  }

  public void visitRedirect(@NotNull FishRedirect o) {
    visitPsiElement(o);
  }

  public void visitRedirects(@NotNull FishRedirects o) {
    visitPsiElement(o);
  }

  public void visitSentence(@NotNull FishSentence o) {
    visitPsiElement(o);
  }

  public void visitString(@NotNull FishString o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
