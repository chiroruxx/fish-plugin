/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.chiroruxx.fishplugin.languages;

import com.github.chiroruxx.fishplugin.languages.FishTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Fish.flex</tt>
 */
class FishLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_ARGS = 2;
  public static final int WAITING_SINGLE_QUOTE_STRING = 4;
  public static final int WAITING_DOUBLE_QUOTE_STRING = 6;
  public static final int WAITING_REDIRECT_DESTINATION = 8;
  public static final int WAITING_REDIRECT_FILE = 10;
  public static final int WAITING_REDIRECT_FILE_DESCRIPTOR = 12;
  public static final int WAITING_REDIRECTS = 14;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\1\1\5\1\3\22\0\1\7\1\0\1\13\1\6\1\14\1\6\1\21\1\12\3\6\2\0"+
    "\1\22\2\0\3\22\10\0\1\6\1\15\1\0\1\20\1\17\33\0\1\6\1\10\1\6\1\16\2\0\2\11"+
    "\2\0\2\11\7\0\1\11\3\0\1\11\1\0\1\11\1\0\1\11\4\0\1\6\1\0\2\6\6\0\1\1\242"+
    "\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\10\0\2\1\1\2\1\1\1\3\1\4\1\3\1\4"+
    "\2\5\1\3\1\4\1\6\1\7\1\10\2\11\1\12"+
    "\2\13\1\4\1\14\2\15\1\4\2\16\2\17\1\4"+
    "\1\20\2\21\1\12\2\22\1\0\1\1\1\0\1\5"+
    "\1\23\1\11\1\0\1\24\1\0\1\25\1\0\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[56];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\23\0\46\0\71\0\114\0\137\0\162\0\205"+
    "\0\230\0\253\0\276\0\321\0\344\0\367\0\u010a\0\u011d"+
    "\0\u0130\0\u0143\0\u0156\0\u0169\0\367\0\367\0\367\0\u017c"+
    "\0\u018f\0\u01a2\0\u01b5\0\u01c8\0\u01db\0\367\0\u01ee\0\u0201"+
    "\0\u0214\0\u0227\0\u023a\0\276\0\367\0\u024d\0\367\0\276"+
    "\0\367\0\367\0\367\0\276\0\u011d\0\u0260\0\u0273\0\u0286"+
    "\0\367\0\367\0\u0299\0\367\0\u02ac\0\367\0\u024d\0\u02bf";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[56];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\11\1\12\1\13\1\12\1\14\1\15\1\16\1\17"+
    "\1\20\1\11\10\16\1\11\1\21\1\22\1\13\1\22"+
    "\1\23\1\15\1\16\1\17\1\24\1\21\1\25\1\26"+
    "\1\16\1\27\1\30\1\16\1\31\1\16\1\32\1\33"+
    "\1\34\1\13\1\34\1\33\1\34\2\33\1\35\1\33"+
    "\1\36\10\33\1\37\1\40\1\13\1\40\1\37\1\40"+
    "\2\37\1\41\2\37\1\36\7\37\1\42\1\43\1\13"+
    "\1\43\1\42\1\44\1\16\1\45\1\46\1\42\7\16"+
    "\1\47\2\42\1\43\1\13\1\43\1\42\1\50\1\16"+
    "\1\51\1\46\1\42\10\16\1\42\1\16\3\13\1\16"+
    "\1\13\14\16\1\52\1\16\3\13\1\53\1\54\1\16"+
    "\1\53\5\16\1\27\1\30\1\16\1\31\2\16\2\11"+
    "\1\0\2\11\3\0\1\55\1\11\10\0\2\11\1\12"+
    "\1\13\1\12\1\11\1\13\2\0\1\55\1\11\10\0"+
    "\1\11\1\0\3\13\1\0\1\13\15\0\2\11\1\0"+
    "\1\11\1\14\1\17\1\0\1\17\1\55\1\11\10\0"+
    "\1\11\1\0\3\13\1\17\1\15\1\0\1\17\42\0"+
    "\2\17\1\0\1\17\13\0\3\11\1\56\2\11\14\0"+
    "\1\11\2\21\1\0\2\21\3\0\1\57\1\21\10\0"+
    "\2\21\1\22\1\13\1\22\1\21\1\13\2\0\1\57"+
    "\1\21\10\0\3\21\1\0\1\21\1\23\1\17\1\0"+
    "\1\17\1\57\1\21\10\0\4\21\1\60\2\21\14\61"+
    "\1\21\16\0\2\62\22\0\2\62\2\0\15\21\1\0"+
    "\2\21\1\0\2\21\2\33\1\0\5\33\1\63\1\33"+
    "\1\0\11\33\1\34\1\13\1\34\1\33\1\34\2\33"+
    "\1\63\1\33\1\0\20\33\1\64\1\33\1\64\10\33"+
    "\2\37\1\0\5\37\1\65\2\37\1\0\10\37\1\40"+
    "\1\13\1\40\1\37\1\40\2\37\1\65\2\37\1\0"+
    "\11\37\1\66\5\37\1\66\2\37\2\66\6\37\2\42"+
    "\1\0\2\42\3\0\1\67\1\42\10\0\2\42\1\43"+
    "\1\13\1\43\1\42\1\13\2\0\1\67\1\42\10\0"+
    "\4\42\1\70\2\42\14\0\1\42\5\11\3\0\1\55"+
    "\1\11\10\0\1\11\3\21\1\60\2\21\14\0\6\21"+
    "\3\0\1\57\1\21\10\0\1\21\10\33\1\0\1\33"+
    "\1\0\10\33\2\37\1\0\5\37\1\0\2\37\2\0"+
    "\6\37\5\42\3\0\1\67\1\42\10\0\1\42";

  private static int [] zzUnpackTrans() {
    int [] result = new int[722];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\10\0\5\1\1\11\6\1\3\11\6\1\1\11\6\1"+
    "\1\11\1\1\1\11\1\1\3\11\1\1\1\0\1\1"+
    "\1\0\1\1\2\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[56];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  FishLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return FishTypes.COMMAND;
            } 
            // fall through
          case 22: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 23: break;
          case 3: 
            { yybegin(WAITING_ARGS); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 24: break;
          case 4: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 25: break;
          case 5: 
            { yybegin(WAITING_ARGS); return FishTypes.CHARACTERS;
            } 
            // fall through
          case 26: break;
          case 6: 
            { yybegin(WAITING_SINGLE_QUOTE_STRING); return FishTypes.QUOTE;
            } 
            // fall through
          case 27: break;
          case 7: 
            { yybegin(WAITING_DOUBLE_QUOTE_STRING); return FishTypes.QUOTE;
            } 
            // fall through
          case 28: break;
          case 8: 
            { yybegin(WAITING_REDIRECT_FILE); return FishTypes.REDIRECT_SYMBOLE;
            } 
            // fall through
          case 29: break;
          case 9: 
            { yybegin(WAITING_REDIRECT_DESTINATION); return FishTypes.REDIRECT_SYMBOLE;
            } 
            // fall through
          case 30: break;
          case 10: 
            { yybegin(WAITING_REDIRECTS); return FishTypes.FILE_DESCRIPTOR;
            } 
            // fall through
          case 31: break;
          case 11: 
            { yybegin(WAITING_SINGLE_QUOTE_STRING); return FishTypes.STRING_CHARACTERS;
            } 
            // fall through
          case 32: break;
          case 12: 
            { yybegin(WAITING_ARGS); return FishTypes.QUOTE;
            } 
            // fall through
          case 33: break;
          case 13: 
            { yybegin(WAITING_DOUBLE_QUOTE_STRING); return FishTypes.STRING_CHARACTERS;
            } 
            // fall through
          case 34: break;
          case 14: 
            { yybegin(WAITING_REDIRECTS); return FishTypes.REDIRECT_FILE;
            } 
            // fall through
          case 35: break;
          case 15: 
            { yybegin(WAITING_REDIRECT_DESTINATION); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 36: break;
          case 16: 
            { yybegin(WAITING_REDIRECT_FILE_DESCRIPTOR); return FishTypes.FILE_DESCRIPTOR_SYMBOLE;
            } 
            // fall through
          case 37: break;
          case 17: 
            { yybegin(WAITING_REDIRECT_FILE); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 38: break;
          case 18: 
            { yybegin(WAITING_REDIRECTS); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 39: break;
          case 19: 
            { yybegin(WAITING_ARGS); return FishTypes.ESCAPE_CHARACTERS;
            } 
            // fall through
          case 40: break;
          case 20: 
            { yybegin(WAITING_SINGLE_QUOTE_STRING); return FishTypes.ESCAPE_CHARACTERS;
            } 
            // fall through
          case 41: break;
          case 21: 
            { yybegin(WAITING_DOUBLE_QUOTE_STRING); return FishTypes.ESCAPE_CHARACTERS;
            } 
            // fall through
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
