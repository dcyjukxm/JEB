// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import jebglobal.gE;

public class DexField
{
    private gE f;
    
    DexField(final gE f) {
        this.f = f;
    }
    
    public int getIndex() {
        return this.f.dN();
    }
    
    public int getClassTypeIndex() {
        return this.f.fa();
    }
    
    public int getTypeIndex() {
        return this.f.mS().dN();
    }
    
    public int getNameIndex() {
        return this.f.OK();
    }
    
    public String getName() {
        return this.f.QE(true);
    }
    
    public String getName(final boolean b) {
        return this.f.QE(b);
    }
    
    public String getSignature(final boolean b) {
        return this.f.fa(b);
    }
}
