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
  // (CHARACTERS|ESCAPE_CHARACTERS)+
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    if (!nextTokenIs(b, "<arg>", CHARACTERS, ESCAPE_CHARACTERS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = arg_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!arg_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arg", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CHARACTERS|ESCAPE_CHARACTERS
  private static boolean arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_0")) return false;
    boolean r;
    r = consumeToken(b, CHARACTERS);
    if (!r) r = consumeToken(b, ESCAPE_CHARACTERS);
    return r;
  }

  /* ********************************************************** */
  // (arg|string)+
  public static boolean args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args")) return false;
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

  // arg|string
  private static boolean args_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_0")) return false;
    boolean r;
    r = arg(b, l + 1);
    if (!r) r = string(b, l + 1);
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
  // REDIRECT_SYMBOLE REDIRECT_FILE
  public static boolean redirects(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "redirects")) return false;
    if (!nextTokenIs(b, REDIRECT_SYMBOLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REDIRECT_SYMBOLE, REDIRECT_FILE);
    exit_section_(b, m, REDIRECTS, r);
    return r;
  }

  /* ********************************************************** */
  // COMMAND [args] [redirects*]
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

  // [redirects*]
  private static boolean sentence_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence_2")) return false;
    sentence_2_0(b, l + 1);
    return true;
  }

  // redirects*
  private static boolean sentence_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!redirects(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sentence_2_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // QUOTE (STRING_CHARACTERS|ESCAPE_CHARACTERS)* QUOTE
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTE);
    r = r && string_1(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    exit_section_(b, m, STRING, r);
    return r;
  }

  // (STRING_CHARACTERS|ESCAPE_CHARACTERS)*
  private static boolean string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_1", c)) break;
    }
    return true;
  }

  // STRING_CHARACTERS|ESCAPE_CHARACTERS
  private static boolean string_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_CHARACTERS);
    if (!r) r = consumeToken(b, ESCAPE_CHARACTERS);
    return r;
  }

}
