// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.kn;

public class Operator
{
    public static final Operator ADD;
    public static final Operator SUB;
    public static final Operator MUL;
    public static final Operator DIV;
    public static final Operator REM;
    public static final Operator AND;
    public static final Operator OR;
    public static final Operator XOR;
    public static final Operator SHL;
    public static final Operator SHR;
    public static final Operator USHR;
    public static final Operator NEG;
    public static final Operator NOT;
    public static final Operator LOG_IDENT;
    public static final Operator LOG_NOT;
    public static final Operator LOG_OR;
    public static final Operator LOG_AND;
    public static final Operator INSTANCEOF;
    public static final Operator EQ;
    public static final Operator NE;
    public static final Operator LT;
    public static final Operator GE;
    public static final Operator GT;
    public static final Operator LE;
    public static final Operator CAST_TO_BYTE;
    public static final Operator CAST_TO_CHAR;
    public static final Operator CAST_TO_SHORT;
    public static final Operator CAST_TO_INT;
    public static final Operator CAST_TO_LONG;
    public static final Operator CAST_TO_FLOAT;
    public static final Operator CAST_TO_DOUBLE;
    public static final Operator CAST_TO_BOOLEAN;
    kn object;
    
    private Operator(final kn object) {
        this.object = object;
    }
    
    static Operator build(final kn kn) {
        if (kn == kn.dN) {
            return Operator.ADD;
        }
        if (kn == kn.ld) {
            return Operator.SUB;
        }
        if (kn == kn.QE) {
            return Operator.MUL;
        }
        if (kn == kn.wU) {
            return Operator.DIV;
        }
        if (kn == kn.fa) {
            return Operator.REM;
        }
        if (kn == kn.zs) {
            return Operator.AND;
        }
        if (kn == kn.mS) {
            return Operator.OR;
        }
        if (kn == kn.OK) {
            return Operator.XOR;
        }
        if (kn == kn.LH) {
            return Operator.SHL;
        }
        if (kn == kn.KK) {
            return Operator.SHR;
        }
        if (kn == kn.EO) {
            return Operator.USHR;
        }
        if (kn == kn.cb) {
            return Operator.NEG;
        }
        if (kn == kn.PF) {
            return Operator.NOT;
        }
        if (kn == kn.Hw) {
            return Operator.LOG_IDENT;
        }
        if (kn == kn.rK) {
            return Operator.LOG_NOT;
        }
        if (kn == kn.Ux) {
            return Operator.LOG_OR;
        }
        if (kn == kn.ZY) {
            return Operator.LOG_AND;
        }
        if (kn == kn.s) {
            return Operator.INSTANCEOF;
        }
        if (kn == kn.Hv) {
            return Operator.EQ;
        }
        if (kn == kn.VX) {
            return Operator.NE;
        }
        if (kn == kn.ci) {
            return Operator.LT;
        }
        if (kn == kn.bG) {
            return Operator.GE;
        }
        if (kn == kn.BQ) {
            return Operator.GT;
        }
        if (kn == kn.Ee) {
            return Operator.LE;
        }
        if (kn == kn.De) {
            return Operator.CAST_TO_BYTE;
        }
        if (kn == kn.rn) {
            return Operator.CAST_TO_CHAR;
        }
        if (kn == kn.LR) {
            return Operator.CAST_TO_SHORT;
        }
        if (kn == kn.Nh) {
            return Operator.CAST_TO_INT;
        }
        if (kn == kn.XZ) {
            return Operator.CAST_TO_LONG;
        }
        if (kn == kn.nA) {
            return Operator.CAST_TO_FLOAT;
        }
        if (kn == kn.Ai) {
            return Operator.CAST_TO_DOUBLE;
        }
        if (kn == kn.uM) {
            return Operator.CAST_TO_BOOLEAN;
        }
        if (kn.zs()) {
            return new Operator(kn);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public String toString() {
        return this.object.toString();
    }
    
    static {
        ADD = new Operator(kn.dN);
        SUB = new Operator(kn.ld);
        MUL = new Operator(kn.QE);
        DIV = new Operator(kn.wU);
        REM = new Operator(kn.fa);
        AND = new Operator(kn.zs);
        OR = new Operator(kn.mS);
        XOR = new Operator(kn.OK);
        SHL = new Operator(kn.LH);
        SHR = new Operator(kn.KK);
        USHR = new Operator(kn.EO);
        NEG = new Operator(kn.cb);
        NOT = new Operator(kn.PF);
        LOG_IDENT = new Operator(kn.Hw);
        LOG_NOT = new Operator(kn.rK);
        LOG_OR = new Operator(kn.Ux);
        LOG_AND = new Operator(kn.ZY);
        INSTANCEOF = new Operator(kn.s);
        EQ = new Operator(kn.Hv);
        NE = new Operator(kn.VX);
        LT = new Operator(kn.ci);
        GE = new Operator(kn.bG);
        GT = new Operator(kn.BQ);
        LE = new Operator(kn.Ee);
        CAST_TO_BYTE = new Operator(kn.De);
        CAST_TO_CHAR = new Operator(kn.rn);
        CAST_TO_SHORT = new Operator(kn.LR);
        CAST_TO_INT = new Operator(kn.Nh);
        CAST_TO_LONG = new Operator(kn.XZ);
        CAST_TO_FLOAT = new Operator(kn.nA);
        CAST_TO_DOUBLE = new Operator(kn.Ai);
        CAST_TO_BOOLEAN = new Operator(kn.uM);
    }
}
