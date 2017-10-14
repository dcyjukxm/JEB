// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.Arrays;
import jebglobal.Bw;

public class DexPrototype
{
    private Bw p;
    
    DexPrototype(final Bw p) {
        this.p = p;
    }
    
    public int getShortyIndex() {
        return this.p.ld();
    }
    
    public int getReturnTypeIndex() {
        return this.p.wU();
    }
    
    public int[] getParameterTypeIndexes() {
        final int[] zs = this.p.zs();
        return Arrays.copyOf(zs, zs.length);
    }
}
