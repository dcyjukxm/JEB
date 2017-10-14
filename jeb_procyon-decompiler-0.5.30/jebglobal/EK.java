// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public enum EK
{
    ld("UNKNOWN", 0), 
    QE("LINUX32", 1), 
    wU("LINUX64", 2), 
    fa("OSX32", 3), 
    dN("OSX64", 4), 
    zs("WIN32", 5), 
    mS("WIN64", 6);
    
    private EK(final String s, final int n) {
    }
    
    public static EK dN() {
        final String property = System.getProperty("os.arch", "");
        final String property2 = System.getProperty("os.name", "");
        final boolean contains = property.contains("64");
        if (property2.startsWith("Windows")) {
            return contains ? EK.mS : EK.zs;
        }
        if (property2.startsWith("Mac")) {
            return contains ? EK.dN : EK.fa;
        }
        if (property2.startsWith("Linux")) {
            return contains ? EK.wU : EK.QE;
        }
        return EK.ld;
    }
    
    public boolean ld() {
        return this == EK.fa || this == EK.dN;
    }
}
