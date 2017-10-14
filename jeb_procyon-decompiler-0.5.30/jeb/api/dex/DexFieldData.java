// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import jebglobal.XV;

public class DexFieldData
{
    private XV fd;
    
    DexFieldData(final XV fd) {
        this.fd = fd;
    }
    
    public int getFieldIndex() {
        return this.fd.dN();
    }
    
    public int getAccessFlags() {
        return this.fd.ld();
    }
    
    public int getUserFlags() {
        return this.fd.wU();
    }
    
    public void setUserFlags(final int n) {
        this.fd.dN(n);
    }
}
