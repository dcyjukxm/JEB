// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Comparator;

final class YU implements Comparator
{
    YU(final LI li) {
    }
    
    public int dN(final LI.uK uk, final LI.uK uk2) {
        return Integer.valueOf(Integer.bitCount(uk2.dN)).compareTo(Integer.valueOf(Integer.bitCount(uk.dN)));
    }
}
