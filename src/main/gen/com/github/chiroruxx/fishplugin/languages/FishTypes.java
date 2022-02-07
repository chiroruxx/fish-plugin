// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.languages;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.chiroruxx.fishplugin.languages.impl.*;

public interface FishTypes {

  IElementType ARGS = new FishElementType("ARGS");
  IElementType SENTENCE = new FishElementType("SENTENCE");
  IElementType STRING = new FishElementType("STRING");

  IElementType ARG = new FishTokenType("ARG");
  IElementType COMMAND = new FishTokenType("COMMAND");
  IElementType CRLF = new FishTokenType("CRLF");
  IElementType OLD_STRING = new FishTokenType("OLD_STRING");
  IElementType QUOTE = new FishTokenType("QUOTE");
  IElementType REDIRECT = new FishTokenType("REDIRECT");
  IElementType REDIRECT_FILE = new FishTokenType("REDIRECT_FILE");
  IElementType STRING_CHARACTERS = new FishTokenType("STRING_CHARACTERS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGS) {
        return new FishArgsImpl(node);
      }
      else if (type == SENTENCE) {
        return new FishSentenceImpl(node);
      }
      else if (type == STRING) {
        return new FishStringImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
