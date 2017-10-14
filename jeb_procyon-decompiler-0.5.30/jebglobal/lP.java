// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;
import java.util.HashSet;

public final class lP
{
    private static final HashSet dN;
    private static HashMap ld;
    private static HashMap QE;
    private static HashMap wU;
    private static HashMap fa;
    
    public static boolean dN(final String s) {
        return lP.dN.contains(s);
    }
    
    public static boolean ld(final String s) {
        return dN(s) || s.equals("null") || s.equals("true") || s.equals("false");
    }
    
    public static boolean QE(final String s) {
        if (s.length() == 0 || ld(s)) {
            return false;
        }
        if (!Character.isJavaIdentifierStart(s.charAt(0))) {
            return false;
        }
        for (int i = 1; i < s.length(); ++i) {
            if (!Character.isJavaIdentifierPart(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static String wU(final String s) {
        return lP.QE.get(s);
    }
    
    public static String fa(final String s) {
        return lP.wU.get(s);
    }
    
    static {
        dN = new HashSet();
        final uK[] values = uK.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            lP.dN.add(values[i].toString().toLowerCase());
        }
        (lP.ld = new HashMap()).put("boolean", "Ljava/lang/Boolean;");
        lP.ld.put("byte", "Ljava/lang/Byte;");
        lP.ld.put("char", "Ljava/lang/Character;");
        lP.ld.put("short", "Ljava/lang/Short;");
        lP.ld.put("int", "Ljava/lang/Integer;");
        lP.ld.put("long", "Ljava/lang/Long;");
        lP.ld.put("float", "Ljava/lang/Float;");
        lP.ld.put("double", "Ljava/lang/Double;");
        (lP.QE = new HashMap()).put("Ljava/lang/Boolean;", "boolean");
        lP.QE.put("Ljava/lang/Byte;", "byte");
        lP.QE.put("Ljava/lang/Character;", "char");
        lP.QE.put("Ljava/lang/Short;", "short");
        lP.QE.put("Ljava/lang/Integer;", "int");
        lP.QE.put("Ljava/lang/Long;", "long");
        lP.QE.put("Ljava/lang/Float;", "float");
        lP.QE.put("Ljava/lang/Double;", "double");
        (lP.wU = new HashMap()).put("boolean", "Z");
        lP.wU.put("byte", "B");
        lP.wU.put("char", "C");
        lP.wU.put("short", "S");
        lP.wU.put("int", "I");
        lP.wU.put("long", "J");
        lP.wU.put("float", "F");
        lP.wU.put("double", "D");
        (lP.fa = new HashMap()).put("Z", "boolean");
        lP.fa.put("B", "byte");
        lP.fa.put("C", "char");
        lP.fa.put("S", "short");
        lP.fa.put("I", "int");
        lP.fa.put("J", "long");
        lP.fa.put("F", "float");
        lP.fa.put("D", "double");
    }
    
    enum uK
    {
        dN("ABSTRACT", 0), 
        ld("ASSERT", 1), 
        QE("BOOLEAN", 2), 
        wU("BREAK", 3), 
        fa("BYTE", 4), 
        zs("CASE", 5), 
        mS("CATCH", 6), 
        OK("CHAR", 7), 
        LH("CLASS", 8), 
        KK("CONST", 9), 
        EO("CONTINUE", 10), 
        cb("DEFAULT", 11), 
        PF("DO", 12), 
        Hw("DOUBLE", 13), 
        rK("ELSE", 14), 
        Ux("ENUM", 15), 
        ZY("EXTENDS", 16), 
        s("FINAL", 17), 
        Hv("FINALLY", 18), 
        VX("FLOAT", 19), 
        ci("FOR", 20), 
        bG("GOTO", 21), 
        BQ("IF", 22), 
        Ee("IMPLEMENTS", 23), 
        De("IMPORT", 24), 
        rn("INSTANCEOF", 25), 
        LR("INT", 26), 
        Nh("INTERFACE", 27), 
        XZ("LONG", 28), 
        nA("NATIVE", 29), 
        Ai("NEW", 30), 
        uM("PACKAGE", 31), 
        kq("PRIVATE", 32), 
        ir("PROTECTED", 33), 
        rF("PUBLIC", 34), 
        IL("RETURN", 35), 
        Db("SHORT", 36), 
        sC("STATIC", 37), 
        jp("STRICTFP", 38), 
        bU("SUPER", 39), 
        Qg("SWITCH", 40), 
        uB("SYNCHRONIZED", 41), 
        dY("THIS", 42), 
        Rm("THROW", 43), 
        nb("THROWS", 44), 
        nI("TRANSIENT", 45), 
        My("TRY", 46), 
        kU("VOID", 47), 
        mD("VOLATILE", 48), 
        LV("WHILE", 49);
        
        private uK(final String s, final int n) {
        }
    }
}
