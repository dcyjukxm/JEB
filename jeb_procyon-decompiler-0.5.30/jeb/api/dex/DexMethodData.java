// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import jebglobal.OM;
import jebglobal.AV;

public class DexMethodData
{
    private AV md;
    
    DexMethodData(final AV md) {
        this.md = md;
    }
    
    public int getMethodIndex() {
        return this.md.ld();
    }
    
    public int getAccessFlags() {
        return this.md.QE();
    }
    
    public DexCodeItem getCodeItem() {
        final OM wu = this.md.wU();
        if (wu == null) {
            return null;
        }
        return new DexCodeItem(wu);
    }
    
    public int getUserFlags() {
        return this.md.KK();
    }
    
    public void setUserFlags(final int n) {
        this.md.dN(n);
    }
}
