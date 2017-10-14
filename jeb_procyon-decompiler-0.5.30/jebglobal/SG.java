// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStream;
import java.io.Writer;

public final class SG extends WC implements ZJ
{
    private String QE;
    private boolean wU;
    
    public SG() {
        this.wU = false;
    }
    
    @Override
    public void dN(final String s, final Boolean b) {
        super.dN((s != null) ? s : this.QE, b);
        this.dN();
    }
    
    protected void dN(final String s, final Writer writer) {
        if (s == null) {
            return;
        }
        if (this.wU) {
            writer.write(s);
            return;
        }
        super.dN(s, writer);
    }
    
    @Override
    public void dN(final OutputStream outputStream, final String s) {
        super.dN(outputStream, (s != null) ? s : this.QE);
    }
    
    @Override
    public void dN(final String s, final Object o) {
        if ("DEFAULT_ENCODING".equals(s)) {
            this.QE = (String)o;
        }
        else {
            super.dN(s, o);
        }
    }
    
    @Override
    public ZJ dN() {
        super.ld.write(this.dN);
        return this;
    }
    
    public void dN(final boolean wu) {
        this.wU = wu;
    }
}
