// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.languages;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.chiroruxx.fishplugin.languages.impl.*;

public interface FishTypes {

  IElementType ARG = new FishElementType("ARG");
  IElementType ARGS = new FishElementType("ARGS");
  IElementType DESTINATION = new FishElementType("DESTINATION");
  IElementType REDIRECT = new FishElementType("REDIRECT");
  IElementType REDIRECTS = new FishElementType("REDIRECTS");
  IElementType SENTENCE = new FishElementType("SENTENCE");
  IElementType STRING = new FishElementType("STRING");

  IElementType CHARACTERS = new FishTokenType("CHARACTERS");
  IElementType COMMAND = new FishTokenType("COMMAND");
  IElementType CRLF = new FishTokenType("CRLF");
  IElementType ESCAPE_CHARACTERS = new FishTokenType("ESCAPE_CHARACTERS");
  IElementType FILE_DESCRIPTOR = new FishTokenType("FILE_DESCRIPTOR");
  IElementType FILE_DESCRIPTOR_SYMBOLE = new FishTokenType("FILE_DESCRIPTOR_SYMBOLE");
  IElementType OPTIONAL_FD = new FishTokenType("OPTIONAL_FD");
  IElementType QUOTE = new FishTokenType("QUOTE");
  IElementType REDIRECT_FILE = new FishTokenType("REDIRECT_FILE");
  IElementType REDIRECT_SYMBOLE = new FishTokenType("REDIRECT_SYMBOLE");
  IElementType STRING_CHARACTERS = new FishTokenType("STRING_CHARACTERS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARG) {
        return new FishArgImpl(node);
      }
      else if (type == ARGS) {
        return new FishArgsImpl(node);
      }
      else if (type == DESTINATION) {
        return new FishDestinationImpl(node);
      }
      else if (type == REDIRECT) {
        return new FishRedirectImpl(node);
      }
      else if (type == REDIRECTS) {
        return new FishRedirectsImpl(node);
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
