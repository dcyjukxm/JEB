// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public abstract class yF extends II
{
    uK dN;
    vd ld;
    
    public static int dN(final List list, final int n) {
        final II ii = list.get(n);
        if (!(ii instanceof yF)) {
            throw new RuntimeException();
        }
        final yF yf = (yF)ii;
        if (yf.ld != vd.dN && yf.ld != vd.ld) {
            throw new RuntimeException();
        }
        int n2 = 1;
        for (int i = n + 1; i < list.size(); ++i) {
            final II ii2 = list.get(i);
            if (ii2 instanceof yF) {
                final yF yf2 = (yF)ii2;
                if (yf2.dN == yf.dN) {
                    if (yf2.ld == vd.dN) {
                        ++n2;
                    }
                    else if (yf2.ld == vd.QE && --n2 == 0) {
                        return i;
                    }
                }
            }
            else if (ii2 instanceof wz) {
                throw new RuntimeException();
            }
        }
        throw new RuntimeException();
    }
    
    @Override
    public void dN(final ZL zl) {
        throw new RuntimeException();
    }
    
    public enum uK
    {
        dN("BLOCK", 0), 
        ld("IF", 1), 
        QE("DOWHILE", 2), 
        wU("WHILE", 3), 
        fa("FOR", 4), 
        zs("SWITCH", 5), 
        mS("TRY", 6), 
        OK("SYNCHRONIZED", 7);
        
        private uK(final String s, final int n) {
        }
    }
    
    public enum vd
    {
        dN("BEGIN", 0), 
        ld("INTERMEDIATE", 1), 
        QE("END", 2);
        
        private vd(final String s, final int n) {
        }
    }
}
