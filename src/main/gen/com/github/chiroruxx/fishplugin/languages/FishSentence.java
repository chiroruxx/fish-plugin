// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.languages;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FishSentence extends PsiElement {

  @Nullable
  FishArgs getArgs();

  @NotNull
  List<FishRedirects> getRedirectsList();

}
