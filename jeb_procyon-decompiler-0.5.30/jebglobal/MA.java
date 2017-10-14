// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class MA extends Vi implements Mt
{
    private final fv[] ld;
    private static final String[] QE;
    
    MA(final UD ud, final PS[] array) {
        super(ud);
        this.ld = new fv[6];
        for (int i = 0; i < array.length; ++i) {
            this.ld[(int)array[i].dN - 16777220] = (fv)array[i].ld;
        }
    }
    
    @Override
    public void dN(final Kf kf, final dx dx) {
        kf.ld(null, "plurals");
        kf.dN(null, "name", dx.QE().fa());
        for (int i = 0; i < this.ld.length; ++i) {
            final fv fv = this.ld[i];
            if (fv != null) {
                kf.ld(null, "item");
                kf.dN(null, "quantity", MA.QE[i]);
                kf.ld(fv.mS());
                kf.QE(null, "item");
            }
        }
        kf.QE(null, "plurals");
    }
    
    static {
        QE = new String[] { "other", "zero", "one", "two", "few", "many" };
    }
}
