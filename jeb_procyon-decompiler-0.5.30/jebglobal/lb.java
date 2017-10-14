// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class lb extends Exception
{
    private Throwable dN;
    
    public lb(final String s) {
        super(s);
    }
    
    public lb(final String s, final iR ir, final Throwable dn) {
        super(new StringBuffer().append((s == null) ? "" : new StringBuffer().append(s).append(" ").toString()).append((ir == null) ? "" : new StringBuffer().append("(position:").append(ir.cb()).append(") ").toString()).append((dn == null) ? "" : new StringBuffer().append("caused by: ").append(dn).toString()).toString());
        if (ir != null) {
            ir.OK();
            ir.rK();
        }
        this.dN = dn;
    }
    
    @Override
    public void printStackTrace() {
        if (this.dN == null) {
            super.printStackTrace();
        }
        else {
            synchronized (System.err) {
                System.err.println(new StringBuffer().append(super.getMessage()).append("; nested exception is:").toString());
                this.dN.printStackTrace();
            }
        }
    }
}
