// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public interface KT
{
    void dN(final uK p0);
    
    public enum vd
    {
        dN("CLASS_BEGIN", 0), 
        ld("METHOD_BEGIN", 1), 
        QE("IR_BUILDER", 2), 
        wU("IR_OPTIMIZER", 3), 
        fa("AST_BUILDER", 4), 
        zs("AST_OPTIMIZER", 5), 
        mS("METHOD_END", 6), 
        OK("CLASS_END", 7);
        
        private vd(final String s, final int n) {
        }
    }
    
    public static final class uK
    {
        public vd dN;
        public String ld;
        
        uK(final vd dn, final String ld) {
            if (dn == null) {
                throw new RuntimeException();
            }
            this.dN = dn;
            this.ld = ld;
        }
        
        uK(final vd vd) {
            this(vd, null);
        }
    }
}
