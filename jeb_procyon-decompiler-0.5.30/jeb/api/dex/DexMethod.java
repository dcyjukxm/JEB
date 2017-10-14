// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import jebglobal.hO;

public class DexMethod
{
    private hO m;
    
    DexMethod(final hO m) {
        this.m = m;
    }
    
    public int getIndex() {
        return this.m.dN();
    }
    
    public int getClassTypeIndex() {
        return this.m.fa();
    }
    
    public int getPrototypeIndex() {
        return this.m.mS();
    }
    
    public int getNameIndex() {
        return this.m.LH();
    }
    
    public String getName() {
        return this.m.ld(true);
    }
    
    public String getName(final boolean b) {
        return this.m.ld(b);
    }
    
    public String getSignature(final boolean b) {
        return this.m.wU(b);
    }
}
