// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.File;

public final class vl extends File
{
    private Sj dN;
    
    public vl(final File file) {
        super(file.getPath());
    }
    
    public Sj dN() {
        if (this.dN == null) {
            if (this.isDirectory()) {
                this.dN = new oH(this);
            }
            else {
                this.dN = new CC(this);
            }
        }
        return this.dN;
    }
}
