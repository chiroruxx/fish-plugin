// This is a generated file. Not intended for manual editing.
package com.github.chiroruxx.fishplugin.languages;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.chiroruxx.fishplugin.languages.FishTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FishParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return fishFile(b, l + 1);
  }

  /* ********************************************************** */
  // (ARG|STRING)+
  public static boolean args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args")) return false;
    if (!nextTokenIs(b, "<args>", ARG, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGS, "<args>");
    r = args_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!args_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "args", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ARG|STRING
  private static boolean args_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_0")) return false;
    boolean r;
    r = consumeToken(b, ARG);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean fishFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fishFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fishFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // sentence|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    if (!nextTokenIs(b, "", COMMAND, CRLF)) return false;
    boolean r;
    r = sentence(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // COMMAND [args] [REDIRECT REDIRECT_FILE]
  public static boolean sentence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence")) return false;
    if (!nextTokenIs(b, COMMAND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND);
    r = r && sentence_1(b, l + 1);
    r = r && sentence_2(b, l + 1);
    exit_section_(b, m, SENTENCE, r);
    return r;
  }

  // [args]
  private static boolean sentence_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence_1")) return false;
    args(b, l + 1);
    return true;
  }

  // [REDIRECT REDIRECT_FILE]
  private static boolean sentence_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence_2")) return false;
    parseTokens(b, 0, REDIRECT, REDIRECT_FILE);
    return true;
  }

}
