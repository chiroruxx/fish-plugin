// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.languages.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.chiroruxx.fishplugin.languages.FishTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.chiroruxx.fishplugin.languages.*;

public class FishSentenceImpl extends ASTWrapperPsiElement implements FishSentence {

  public FishSentenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FishVisitor visitor) {
    visitor.visitSentence(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FishVisitor) accept((FishVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FishArgs getArgs() {
    return findChildByClass(FishArgs.class);
  }

  @Override
  @NotNull
  public List<FishRedirects> getRedirectsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FishRedirects.class);
  }

}
