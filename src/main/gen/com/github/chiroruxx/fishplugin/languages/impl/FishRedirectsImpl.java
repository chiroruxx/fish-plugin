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

public class FishRedirectsImpl extends ASTWrapperPsiElement implements FishRedirects {

  public FishRedirectsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FishVisitor visitor) {
    visitor.visitRedirects(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FishVisitor) accept((FishVisitor)visitor);
    else super.accept(visitor);
  }

}
