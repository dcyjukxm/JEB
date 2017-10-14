// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Comparator;
import java.util.Arrays;

public final class LI extends sm
{
    private final uK[] ld;
    private uK[] QE;
    private uK[] wU;
    
    LI(final UD ud, final int n, final Integer n2, final Integer n3, final Boolean b, final PS[] array) {
        super(ud, n, n2, n3, b);
        this.ld = new uK[array.length];
        for (int i = 0; i < array.length; ++i) {
            this.ld[i] = new uK((UD)array[i].dN, ((Vp)array[i].ld).ld());
        }
    }
    
    @Override
    public String dN(final fv fv) {
        if (!(fv instanceof Vp)) {
            return super.dN(fv);
        }
        this.ld();
        final int ld = ((Vp)fv).ld();
        if (ld == 0) {
            return this.dN(this.QE);
        }
        final uK[] array = new uK[this.wU.length];
        final int[] array2 = new int[this.wU.length];
        int n = 0;
        for (int i = 0; i < this.wU.length; ++i) {
            final uK uk = this.wU[i];
            final int dn = uk.dN;
            if ((ld & dn) == dn) {
                if (!this.dN(dn, array2)) {
                    array2[n] = dn;
                    array[n++] = uk;
                }
            }
        }
        return this.dN(Arrays.copyOf(array, n));
    }
    
    @Override
    protected void ld(final Kf kf, final dx dx) {
        for (int i = 0; i < this.ld.length; ++i) {
            final uK uk = this.ld[i];
            kf.ld(null, "flag");
            kf.dN(null, "name", uk.dN());
            kf.dN(null, "value", String.format("0x%08x", uk.dN));
            kf.QE(null, "flag");
        }
    }
    
    private boolean dN(final int n, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if ((array[i] & n) == n) {
                return true;
            }
        }
        return false;
    }
    
    private String dN(final uK[] array) {
        String string = "";
        for (int i = 0; i < array.length; ++i) {
            string = string + "|" + array[i].dN();
        }
        if (string.isEmpty()) {
            return string;
        }
        return string.substring(1);
    }
    
    private void ld() {
        if (this.wU != null) {
            return;
        }
        final uK[] array = new uK[this.ld.length];
        int n = 0;
        final uK[] array2 = new uK[this.ld.length];
        int n2 = 0;
        for (int i = 0; i < this.ld.length; ++i) {
            final uK uk = this.ld[i];
            if (uk.dN == 0) {
                array[n++] = uk;
            }
            else {
                array2[n2++] = uk;
            }
        }
        this.QE = Arrays.copyOf(array, n);
        Arrays.sort(this.wU = Arrays.copyOf(array2, n2), new YU(this));
    }
    
    static final class uK
    {
        private UD ld;
        public final int dN;
        private String QE;
        
        public uK(final UD ld, final int dn) {
            this.ld = ld;
            this.dN = dn;
        }
        
        public String dN() {
            if (this.QE == null) {
                this.QE = this.ld.QE().fa();
            }
            return this.QE;
        }
    }
}
