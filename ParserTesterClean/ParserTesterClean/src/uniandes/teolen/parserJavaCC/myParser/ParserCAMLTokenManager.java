/* Generated By:JavaCC: Do not edit this line. ParserCAMLTokenManager.java */
package uniandes.teolen.parserJavaCC.myParser;
import java.util.*;

/** Token Manager. */
public class ParserCAMLTokenManager implements ParserCAMLConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 44:
         return jjStopAtPos(0, 12);
      case 64:
         return jjMoveStringLiteralDfa1_0(0x3ffe800L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x20L);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x70000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x380000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x180000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2070000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0xc800L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x802000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1020000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 101:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(3, 5);
         break;
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x88000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x804800L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x2040000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x300000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0xa00000L);
      case 102:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 107:
         return jjMoveStringLiteralDfa5_0(active0, 0x4800L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x30000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x500000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x2080000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x908000L);
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x24000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x50000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 123:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(5, 11);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(5, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x1c04000L);
      case 107:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x20a2000L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x108000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x6a000L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000L);
      case 112:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      case 115:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x104000L);
      case 123:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(7, 16);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(7, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa9_0(active0, 0x20000L);
      case 101:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      case 104:
         return jjMoveStringLiteralDfa9_0(active0, 0x100000L);
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0xc00000L);
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x8000L);
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      case 115:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000000L);
      case 123:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(8, 13);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(8, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa10_0(active0, 0x8000L);
      case 100:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x100000L);
      case 103:
         return jjMoveStringLiteralDfa10_0(active0, 0x800000L);
      case 104:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000000L);
      case 114:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000L);
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x400000L);
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa11_0(active0, 0x2008000L);
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x60000L);
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x800000L);
      case 115:
         return jjMoveStringLiteralDfa11_0(active0, 0x100000L);
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000L);
      case 123:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(10, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa12_0(active0, 0x2000000L);
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x100000L);
      case 110:
         return jjMoveStringLiteralDfa12_0(active0, 0x40000L);
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x20000L);
      case 115:
         return jjMoveStringLiteralDfa12_0(active0, 0x800000L);
      case 123:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(11, 15);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(11, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa13_0(active0, 0x40000L);
      case 110:
         return jjMoveStringLiteralDfa13_0(active0, 0x20000L);
      case 115:
         return jjMoveStringLiteralDfa13_0(active0, 0x100000L);
      case 123:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(12, 23);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(12, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa14_0(active0, 0x40000L);
      case 123:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(13, 17);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(13, 20);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 123:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(14, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 9;
                  jjCheckNAddTwoStates(1, 0);
                  break;
               case 2:
                  if (curChar != 46)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if (curChar != 46)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(3, 7);
                  break;
               case 1:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddStates(0, 2);
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAdd(4);
                  break;
               case 5:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 0, 4, 1, 2, 0, 5, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\164\171\160\145", null, null, null, null, null, 
"\100\142\157\157\153\173", "\54", "\100\141\162\164\151\143\154\145\173", 
"\100\142\157\157\153\154\145\164\173", "\100\143\157\156\146\145\162\145\156\143\145\173", 
"\100\151\156\142\157\157\153\173", "\100\151\156\143\157\154\154\145\143\164\151\157\156\173", 
"\100\151\156\160\162\157\143\145\145\144\151\156\147\163\173", "\100\155\141\156\165\141\154\173", 
"\100\155\141\163\164\145\162\164\150\145\163\151\163\173", "\100\155\151\163\143\173", "\100\160\150\144\164\150\145\163\151\163\173", 
"\100\160\162\157\143\145\145\144\151\147\156\163\173", "\100\164\145\143\150\162\145\160\157\162\164\173", 
"\100\165\156\160\165\142\154\151\163\150\145\144\173", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffff21L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[6];
private final int[] jjstateSet = new int[12];
protected char curChar;
/** Constructor. */
public ParserCAMLTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserCAMLTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
