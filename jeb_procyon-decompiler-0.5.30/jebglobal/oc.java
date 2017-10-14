// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public enum oc
{
    XZ("ABSTRACT", 0), 
    nA("ASSERT", 1), 
    Ai("BOOLEAN", 2), 
    dN("BREAK", 3), 
    uM("BYTE", 4), 
    ld("CASE", 5), 
    QE("CATCH", 6), 
    kq("CHAR", 7), 
    wU("CLASS", 8), 
    ir("CONST", 9), 
    fa("CONTINUE", 10), 
    zs("DEFAULT", 11), 
    mS("DO", 12), 
    rF("DOUBLE", 13), 
    OK("ELSE", 14), 
    IL("ENUM", 15), 
    LH("EXTENDS", 16), 
    Db("FINAL", 17), 
    KK("FINALLY", 18), 
    sC("FLOAT", 19), 
    EO("FOR", 20), 
    cb("GOTO", 21), 
    PF("IF", 22), 
    Hw("IMPLEMENTS", 23), 
    rK("IMPORT", 24), 
    jp("INSTANCEOF", 25), 
    bU("INT", 26), 
    Qg("INTERFACE", 27), 
    uB("LONG", 28), 
    dY("NATIVE", 29), 
    Ux("NEW", 30), 
    ZY("PACKAGE", 31), 
    Rm("PRIVATE", 32), 
    nb("PROTECTED", 33), 
    nI("PUBLIC", 34), 
    s("RETURN", 35), 
    My("SHORT", 36), 
    kU("STATIC", 37), 
    mD("STRICTFP", 38), 
    Hv("SUPER", 39), 
    VX("SWITCH", 40), 
    LV("SYNCHRONIZED", 41), 
    ci("THIS", 42), 
    bG("THROW", 43), 
    BQ("THROWS", 44), 
    uo("TRANSIENT", 45), 
    Ee("TRY", 46), 
    H("VOID", 47), 
    go("VOLATILE", 48), 
    De("WHILE", 49), 
    rn("TRUE", 50), 
    LR("FALSE", 51), 
    Nh("NULL", 52);
    
    private oc(final String s, final int n) {
    }
    
    public static void dN(final ZL zl, final int n, final int n2) {
        dN(zl, n, n2, hY.dN);
    }
    
    public static void ld(final ZL zl, final int n, final int n2) {
        dN(zl, n, n2, hY.ld);
    }
    
    public static void QE(final ZL zl, final int n, final int n2) {
        dN(zl, n, n2, hY.QE);
    }
    
    public static void dN(final ZL zl, int n, final int n2, final hY hy) {
        final int[] array = { 0 };
        switch (oc$1.dN[hy.ordinal()]) {
            case 1: {
                n &= 0x761F;
                break;
            }
            case 2: {
                n &= 0x31DFF;
                break;
            }
            case 3: {
                n &= 0x50DF;
                break;
            }
        }
        dN(zl, array, n, 1, oc.nI);
        dN(zl, array, n, 2, oc.Rm);
        dN(zl, array, n, 4, oc.nb);
        dN(zl, array, n, 8, oc.kU);
        dN(zl, array, n, 16, oc.Db);
        dN(zl, array, n, 1024, oc.XZ);
        dN(zl, array, n, 512, oc.Qg);
        dN(zl, array, n, 16384, oc.IL);
        dN(zl, array, n, 32, oc.LV);
        if (hy == hY.QE) {
            dN(zl, array, n, 64, oc.go);
            dN(zl, array, n, 128, oc.uo);
        }
        else if (hy == hY.ld) {
            dN(zl, array, n, 64, null);
            dN(zl, array, n, 128, null);
        }
        dN(zl, array, n, 256, oc.dY);
        dN(zl, array, n, 2048, oc.mD);
        dN(zl, array, n, 4096, null);
        dN(zl, array, n, 8192, null);
        dN(zl, array, n, 65536, null);
        dN(zl, array, n, 131072, null);
        if (n2 == 1 || (n2 == -1 && array[0] > 0)) {
            zl.wU(" ");
        }
    }
    
    private static void dN(final ZL zl, final int[] array, final int n, final int n2, final oc oc) {
        if (oc != null && (n & n2) != 0x0) {
            if (array[0] > 0) {
                zl.wU(" ");
            }
            zl.dN(oc);
            final int n3 = 0;
            ++array[n3];
        }
    }
    
    public static void dN(final ZL zl, final hV hv) {
        dN(zl, hv, false);
    }
    
    public static void dN(final ZL zl, final hV hv, final boolean b) {
        if (hv.mS() || (hv.OK() && hv.QE().zs())) {
            final AR ok = zl.OK;
            if (ok == null) {
                zl.wU(hv.toString());
                return;
            }
            final nh.vd vd = (nh.vd)ok.mS().dN(hv.KK());
            if (vd == null) {
                zl.wU(hv.toString());
                return;
            }
            String s = vd.dN(true);
            nh.vd vd2 = vd;
            if (vd.QE()) {
                vd2 = (nh.vd)ok.mS().dN(vd.zs());
                if (vd2 == null) {
                    throw new RuntimeException();
                }
                s = vd2.dN(true);
            }
            Object kk = null;
            if (vd2.ld()) {
                final zd dn = zl.dN();
                boolean b2 = true;
                if (dn != null) {
                    if (vd2.mS()) {
                        if (vd2.ld(false).equals("")) {
                            b2 = true;
                        }
                        else {
                            final String ld = vd2.ld(true);
                            final String dn2 = dn.dN(ld);
                            if (dn2 == null || dn2.equals(s)) {
                                dn.dN(ld, s);
                                s = ld;
                                b2 = false;
                            }
                        }
                    }
                    else {
                        final String substring = s.substring(s.lastIndexOf(47) + 1);
                        final String substring2 = substring.substring(0, substring.length() - 1);
                        final String dn3 = dn.dN(substring2);
                        if (dn3 == null || dn3.equals(s)) {
                            dn.dN(substring2, s);
                            s = substring2;
                            b2 = false;
                        }
                    }
                }
                if (b2) {
                    s = s.substring(1, s.length() - 1).replace('/', '.');
                }
                kk = ok.KK(vd2.dN(false));
            }
            zl.dN(s, (kk instanceof yK) ? Zh.rK : Zh.s, b ? 1 : 0, kk, null);
            if (vd.QE()) {
                for (int i = 0; i < vd.wU(); ++i) {
                    zl.wU("[]");
                }
            }
        }
        else {
            hV qe = hv;
            int ld2 = 0;
            if (hv.OK()) {
                qe = hv.QE();
                ld2 = hv.ld();
            }
            if (qe == hV.ld) {
                zl.dN(oc.Ai);
            }
            else if (qe == hV.QE) {
                zl.dN(oc.uM);
            }
            else if (qe == hV.wU) {
                zl.dN(oc.kq);
            }
            else if (qe == hV.fa) {
                zl.dN(oc.My);
            }
            else if (qe == hV.zs) {
                zl.dN(oc.bU);
            }
            else if (qe == hV.mS) {
                zl.dN(oc.uB);
            }
            else if (qe == hV.OK) {
                zl.dN(oc.sC);
            }
            else if (qe == hV.LH) {
                zl.dN(oc.rF);
            }
            else {
                if (qe != hV.dN) {
                    zl.wU(hv.toString());
                    throw new RuntimeException();
                }
                zl.dN(oc.H);
            }
            for (int j = 0; j < ld2; ++j) {
                zl.wU("[]");
            }
        }
    }
}
