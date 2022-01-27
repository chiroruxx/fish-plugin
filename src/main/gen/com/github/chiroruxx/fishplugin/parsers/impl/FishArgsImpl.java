// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.parsers.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.chiroruxx.fishplugin.parsers.FishTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.chiroruxx.fishplugin.parsers.*;

public class FishArgsImpl extends ASTWrapperPsiElement implements FishArgs {

  public FishArgsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FishVisitor visitor) {
    visitor.visitArgs(this);
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

}
