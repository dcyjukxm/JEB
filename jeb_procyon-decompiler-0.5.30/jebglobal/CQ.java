// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public enum CQ
{
    dN("ABSTRACT", 0), 
    ld("ANNOTATION", 1), 
    QE("ASSERT", 2), 
    wU("BOOLEAN", 3), 
    fa("BREAK", 4), 
    zs("BRIDGE", 5), 
    mS("BYTE", 6), 
    OK("CASE", 7), 
    LH("CATCH", 8), 
    KK("CHAR", 9), 
    EO("CLASS", 10), 
    cb("CONST", 11), 
    PF("CONSTRUCTOR", 12), 
    Hw("CONTINUE", 13), 
    rK("DECLARED_SYNCHRONIZED", 14), 
    Ux("DEFAULT", 15), 
    ZY("DO", 16), 
    s("DOUBLE", 17), 
    Hv("ELSE", 18), 
    VX("ENUM", 19), 
    ci("EXTENDS", 20), 
    bG("FINAL", 21), 
    BQ("FINALLY", 22), 
    Ee("FLOAT", 23), 
    De("FOR", 24), 
    rn("GOTO", 25), 
    LR("IF", 26), 
    Nh("IMPLEMENTS", 27), 
    XZ("IMPORT", 28), 
    nA("INSTANCEOF", 29), 
    Ai("INT", 30), 
    uM("INTERFACE", 31), 
    kq("LONG", 32), 
    ir("NATIVE", 33), 
    rF("NEW", 34), 
    IL("PACKAGE", 35), 
    Db("PRIVATE", 36), 
    sC("PROTECTED", 37), 
    jp("PUBLIC", 38), 
    bU("RETURN", 39), 
    Qg("SHORT", 40), 
    uB("STATIC", 41), 
    dY("STRICTFP", 42), 
    Rm("SUPER", 43), 
    nb("SWITCH", 44), 
    nI("SYNCHRONIZED", 45), 
    My("SYNTHETIC", 46), 
    kU("THIS", 47), 
    mD("THROW", 48), 
    LV("THROWS", 49), 
    uo("TRANSIENT", 50), 
    H("TRY", 51), 
    go("VARARGS", 52), 
    BP("VOID", 53), 
    bL("VOLATILE", 54), 
    U("WHILE", 55);
    
    private CQ(final String s, final int n) {
    }
    
    public static void dN(final ME me, final int n, final int n2) {
        final int[] array = { 0 };
        dN(me, array, n, 1, CQ.jp);
        dN(me, array, n, 2, CQ.Db);
        dN(me, array, n, 4, CQ.sC);
        dN(me, array, n, 8, CQ.uB);
        dN(me, array, n, 16, CQ.bG);
        dN(me, array, n, 1024, CQ.dN);
        dN(me, array, n, 512, CQ.uM);
        dN(me, array, n, 16384, CQ.VX);
        dN(me, array, n, 32, CQ.nI);
        dN(me, array, n, 64, CQ.bL);
        dN(me, array, n, 64, CQ.zs);
        dN(me, array, n, 128, CQ.uo);
        dN(me, array, n, 128, CQ.go);
        dN(me, array, n, 256, CQ.ir);
        dN(me, array, n, 2048, CQ.dY);
        dN(me, array, n, 4096, CQ.My);
        dN(me, array, n, 8192, CQ.ld);
        dN(me, array, n, 65536, CQ.PF);
        dN(me, array, n, 131072, CQ.rK);
        if (n2 == 1 || (n2 == -1 && array[0] > 0)) {
            me.wU(" ");
        }
    }
    
    private static void dN(final ME me, final int[] array, final int n, final int n2, final CQ cq) {
        if (cq != null && (n & n2) != 0x0) {
            if (array[0] > 0) {
                me.wU(" ");
            }
            me.dN(cq);
            final int n3 = 0;
            ++array[n3];
        }
    }
}
