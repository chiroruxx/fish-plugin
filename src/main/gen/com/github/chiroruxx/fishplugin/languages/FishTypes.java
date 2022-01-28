// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.languages;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.chiroruxx.fishplugin.languages.impl.*;

public interface FishTypes {

  IElementType ARGS = new FishElementType("ARGS");
  IElementType SENTENCE = new FishElementType("SENTENCE");

  IElementType ARG = new FishTokenType("ARG");
  IElementType COMMAND = new FishTokenType("COMMAND");
  IElementType CRLF = new FishTokenType("CRLF");
  IElementType REDIRECT = new FishTokenType("REDIRECT");
  IElementType REDIRECT_FILE = new FishTokenType("REDIRECT_FILE");
  IElementType SEPARATOR = new FishTokenType("SEPARATOR");
  IElementType STRING = new FishTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGS) {
        return new FishArgsImpl(node);
      }
      else if (type == SENTENCE) {
        return new FishSentenceImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
