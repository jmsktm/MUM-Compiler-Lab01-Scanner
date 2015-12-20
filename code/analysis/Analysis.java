/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTComment(TComment node);
    void caseTStringLiteral(TStringLiteral node);
    void caseTCharLiteral(TCharLiteral node);
    void caseTEscape(TEscape node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTLessThan(TLessThan node);
    void caseTLessThanOrEq(TLessThanOrEq node);
    void caseTGreaterThan(TGreaterThan node);
    void caseTGreaterThanOrEq(TGreaterThanOrEq node);
    void caseTEquals(TEquals node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTNot(TNot node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTComma(TComma node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTLBkt(TLBkt node);
    void caseTRBkt(TRBkt node);
    void caseTNotEquals(TNotEquals node);
    void caseTEqualTo(TEqualTo node);
    void caseTPointer(TPointer node);
    void caseTWhiteSpace(TWhiteSpace node);
    void caseTBool(TBool node);
    void caseTBreak(TBreak node);
    void caseTChar(TChar node);
    void caseTConst(TConst node);
    void caseTContinue(TContinue node);
    void caseTKclass(TKclass node);
    void caseTDo(TDo node);
    void caseTElse(TElse node);
    void caseTFalse(TFalse node);
    void caseTFloat(TFloat node);
    void caseTIf(TIf node);
    void caseTInt(TInt node);
    void caseTNew(TNew node);
    void caseTNull(TNull node);
    void caseTPrivate(TPrivate node);
    void caseTProtected(TProtected node);
    void caseTPublic(TPublic node);
    void caseTReturn(TReturn node);
    void caseTStatic(TStatic node);
    void caseTString(TString node);
    void caseTStruct(TStruct node);
    void caseTThis(TThis node);
    void caseTTrue(TTrue node);
    void caseTWhile(TWhile node);
    void caseTVoid(TVoid node);
    void caseEOF(EOF node);
}
