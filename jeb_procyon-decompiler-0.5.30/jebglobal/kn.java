// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;

public final class kn
{
    private static final HashMap kq;
    private static final HashMap ir;
    private static final HashMap rF;
    public static final kn dN;
    public static final kn ld;
    public static final kn QE;
    public static final kn wU;
    public static final kn fa;
    public static final kn zs;
    public static final kn mS;
    public static final kn OK;
    public static final kn LH;
    public static final kn KK;
    public static final kn EO;
    public static final kn cb;
    public static final kn PF;
    public static final kn Hw;
    public static final kn rK;
    public static final kn Ux;
    public static final kn ZY;
    public static final kn s;
    public static final kn Hv;
    public static final kn VX;
    public static final kn ci;
    public static final kn bG;
    public static final kn BQ;
    public static final kn Ee;
    public static final kn De;
    public static final kn rn;
    public static final kn LR;
    public static final kn Nh;
    public static final kn XZ;
    public static final kn nA;
    public static final kn Ai;
    public static final kn uM;
    private lX IL;
    private hV Db;
    
    private kn(final lX il) {
        this.IL = il;
        this.Db = null;
    }
    
    private kn(final hV db) {
        this.IL = lX.kq;
        this.Db = db;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public hV dN() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 1: {
                return hV.QE;
            }
            case 2: {
                return hV.wU;
            }
            case 3: {
                return hV.fa;
            }
            case 4: {
                return hV.zs;
            }
            case 5: {
                return hV.mS;
            }
            case 6: {
                return hV.OK;
            }
            case 7: {
                return hV.LH;
            }
            case 8: {
                return hV.ld;
            }
            case 9: {
                return this.Db;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public boolean ld() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean QE() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean wU() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean fa() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 12:
            case 13:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean zs() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public String toString() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 14: {
                return "+";
            }
            case 15: {
                return "-";
            }
            case 16: {
                return "*";
            }
            case 17: {
                return "/";
            }
            case 18: {
                return "%";
            }
            case 19: {
                return "&";
            }
            case 20: {
                return "|";
            }
            case 21: {
                return "^";
            }
            case 22: {
                return "<<";
            }
            case 23: {
                return ">>";
            }
            case 24: {
                return ">>>";
            }
            case 10: {
                return "-";
            }
            case 11: {
                return "~";
            }
            case 12: {
                return "";
            }
            case 13: {
                return "!";
            }
            case 25: {
                return "||";
            }
            case 26: {
                return "&&";
            }
            case 27: {
                return " instanceof ";
            }
            case 28: {
                return "==";
            }
            case 29: {
                return "!=";
            }
            case 30: {
                return "<";
            }
            case 31: {
                return ">=";
            }
            case 32: {
                return ">";
            }
            case 33: {
                return "<=";
            }
            case 1: {
                return "(byte)";
            }
            case 2: {
                return "(char)";
            }
            case 3: {
                return "(short)";
            }
            case 4: {
                return "(int)";
            }
            case 5: {
                return "(long)";
            }
            case 6: {
                return "(float)";
            }
            case 7: {
                return "(double)";
            }
            case 8: {
                return "(boolean)";
            }
            case 9: {
                return String.format("(%s)", this.Db);
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public boolean mS() {
        switch (kn$1.dN[this.IL.ordinal()]) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public int dN(final kn kn) {
        final Integer n = kn.kq.get(this.IL);
        final Integer n2 = kn.kq.get(kn.IL);
        if (n == null || n2 == null) {
            throw new Exception();
        }
        return n - n2;
    }
    
    public int OK() {
        final Integer n = kn.kq.get(this.IL);
        if (n == null) {
            throw new Exception();
        }
        return n;
    }
    
    public uK LH() {
        final uK uk = kn.rF.get(this.OK());
        if (uk == null) {
            throw new Exception();
        }
        return uk;
    }
    
    static {
        (kq = new HashMap()).put(lX.cb, 2);
        kn.kq.put(lX.PF, 2);
        kn.kq.put(lX.rK, 2);
        kn.kq.put(lX.QE, 3);
        kn.kq.put(lX.wU, 3);
        kn.kq.put(lX.fa, 3);
        kn.kq.put(lX.dN, 4);
        kn.kq.put(lX.ld, 4);
        kn.kq.put(lX.LH, 5);
        kn.kq.put(lX.KK, 5);
        kn.kq.put(lX.EO, 5);
        kn.kq.put(lX.ci, 6);
        kn.kq.put(lX.Ee, 6);
        kn.kq.put(lX.BQ, 6);
        kn.kq.put(lX.bG, 6);
        kn.kq.put(lX.s, 6);
        kn.kq.put(lX.Hv, 7);
        kn.kq.put(lX.VX, 7);
        kn.kq.put(lX.zs, 8);
        kn.kq.put(lX.OK, 9);
        kn.kq.put(lX.mS, 10);
        kn.kq.put(lX.ZY, 11);
        kn.kq.put(lX.Ux, 12);
        (ir = new HashMap()).put(lX.cb, uK.ld);
        kn.ir.put(lX.PF, uK.ld);
        kn.ir.put(lX.rK, uK.ld);
        kn.ir.put(lX.QE, uK.dN);
        kn.ir.put(lX.wU, uK.dN);
        kn.ir.put(lX.fa, uK.dN);
        kn.ir.put(lX.dN, uK.dN);
        kn.ir.put(lX.ld, uK.dN);
        kn.ir.put(lX.LH, uK.dN);
        kn.ir.put(lX.KK, uK.dN);
        kn.ir.put(lX.EO, uK.dN);
        kn.ir.put(lX.ci, uK.dN);
        kn.ir.put(lX.Ee, uK.dN);
        kn.ir.put(lX.BQ, uK.dN);
        kn.ir.put(lX.bG, uK.dN);
        kn.ir.put(lX.s, uK.dN);
        kn.ir.put(lX.Hv, uK.dN);
        kn.ir.put(lX.VX, uK.dN);
        kn.ir.put(lX.zs, uK.dN);
        kn.ir.put(lX.OK, uK.dN);
        kn.ir.put(lX.mS, uK.dN);
        kn.ir.put(lX.ZY, uK.dN);
        kn.ir.put(lX.Ux, uK.dN);
        (rF = new HashMap()).put(2, uK.ld);
        kn.rF.put(3, uK.dN);
        kn.rF.put(4, uK.dN);
        kn.rF.put(5, uK.dN);
        kn.rF.put(6, uK.dN);
        kn.rF.put(7, uK.dN);
        kn.rF.put(8, uK.dN);
        kn.rF.put(9, uK.dN);
        kn.rF.put(10, uK.dN);
        kn.rF.put(11, uK.dN);
        kn.rF.put(12, uK.dN);
        dN = new kn(lX.dN);
        ld = new kn(lX.ld);
        QE = new kn(lX.QE);
        wU = new kn(lX.wU);
        fa = new kn(lX.fa);
        zs = new kn(lX.zs);
        mS = new kn(lX.mS);
        OK = new kn(lX.OK);
        LH = new kn(lX.LH);
        KK = new kn(lX.KK);
        EO = new kn(lX.EO);
        cb = new kn(lX.cb);
        PF = new kn(lX.PF);
        Hw = new kn(lX.Hw);
        rK = new kn(lX.rK);
        Ux = new kn(lX.Ux);
        ZY = new kn(lX.ZY);
        s = new kn(lX.s);
        Hv = new kn(lX.Hv);
        VX = new kn(lX.VX);
        ci = new kn(lX.ci);
        bG = new kn(lX.bG);
        BQ = new kn(lX.BQ);
        Ee = new kn(lX.Ee);
        De = new kn(lX.De);
        rn = new kn(lX.rn);
        LR = new kn(lX.LR);
        Nh = new kn(lX.Nh);
        XZ = new kn(lX.XZ);
        nA = new kn(lX.nA);
        Ai = new kn(lX.Ai);
        uM = new kn(lX.uM);
    }
    
    public static final class vd
    {
        private HashMap dN;
        
        public vd() {
            this.dN = new HashMap();
        }
        
        public kn dN(final hV hv) {
            if (hv.zs()) {
                kn kn = this.dN.get(hv);
                if (kn == null) {
                    kn = new kn(hv, null);
                    this.dN.put(hv, kn);
                }
                return kn;
            }
            if (hv == hV.QE) {
                return kn.De;
            }
            if (hv == hV.wU) {
                return kn.rn;
            }
            if (hv == hV.fa) {
                return kn.LR;
            }
            if (hv == hV.zs) {
                return kn.Nh;
            }
            if (hv == hV.mS) {
                return kn.XZ;
            }
            if (hv == hV.OK) {
                return kn.nA;
            }
            if (hv == hV.LH) {
                return kn.Ai;
            }
            if (hv == hV.ld) {
                return kn.uM;
            }
            throw new RuntimeException();
        }
    }
    
    enum lX
    {
        dN("ADD", 0), 
        ld("SUB", 1), 
        QE("MUL", 2), 
        wU("DIV", 3), 
        fa("REM", 4), 
        zs("AND", 5), 
        mS("OR", 6), 
        OK("XOR", 7), 
        LH("SHL", 8), 
        KK("SHR", 9), 
        EO("USHR", 10), 
        cb("NEG", 11), 
        PF("NOT", 12), 
        Hw("LOG_IDENT", 13), 
        rK("LOG_NOT", 14), 
        Ux("LOG_OR", 15), 
        ZY("LOG_AND", 16), 
        s("INSTANCEOF", 17), 
        Hv("EQ", 18), 
        VX("NE", 19), 
        ci("LT", 20), 
        bG("GE", 21), 
        BQ("GT", 22), 
        Ee("LE", 23), 
        De("CAST_TO_BYTE", 24), 
        rn("CAST_TO_CHAR", 25), 
        LR("CAST_TO_SHORT", 26), 
        Nh("CAST_TO_INT", 27), 
        XZ("CAST_TO_LONG", 28), 
        nA("CAST_TO_FLOAT", 29), 
        Ai("CAST_TO_DOUBLE", 30), 
        uM("CAST_TO_BOOLEAN", 31), 
        kq("CAST_TO_OBJECT", 32);
        
        private lX(final String s, final int n) {
        }
    }
    
    public enum uK
    {
        dN("LEFT", 0), 
        ld("RIGHT", 1);
        
        private uK(final String s, final int n) {
        }
    }
}
