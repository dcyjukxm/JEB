// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class fh
{
    private int[] dN;
    private int ld;
    private int QE;
    private int wU;
    
    public fh() {
        this.dN = new int[32];
    }
    
    public final void dN() {
        this.ld = 0;
        this.QE = 0;
        this.wU = 0;
    }
    
    public final int ld() {
        if (this.ld == 0) {
            return 0;
        }
        return this.dN[this.ld - 1];
    }
    
    public final int dN(int i) {
        if (this.ld == 0 || i < 0) {
            return 0;
        }
        if (i > this.wU) {
            i = this.wU;
        }
        int n = 0;
        int n2 = 0;
        while (i != 0) {
            final int n3 = this.dN[n2];
            n += n3;
            n2 += 2 + n3 * 2;
            --i;
        }
        return n;
    }
    
    public final void dN(final int n, final int n2) {
        if (this.wU == 0) {
            this.fa();
        }
        this.fa(2);
        final int n3 = this.ld - 1;
        final int n4 = this.dN[n3];
        this.dN[n3 - 1 - n4 * 2] = n4 + 1;
        this.dN[n3] = n;
        this.dN[n3 + 1] = n2;
        this.dN[n3 + 2] = n4 + 1;
        this.ld += 2;
        ++this.QE;
    }
    
    public final boolean QE() {
        if (this.ld == 0) {
            return false;
        }
        int n = this.ld - 1;
        int n2 = this.dN[n];
        if (n2 == 0) {
            return false;
        }
        --n2;
        n -= 2;
        this.dN[n] = n2;
        this.dN[n - (1 + n2 * 2)] = n2;
        this.ld -= 2;
        --this.QE;
        return true;
    }
    
    public final int ld(final int n) {
        return this.ld(n, true);
    }
    
    public final int QE(final int n) {
        return this.ld(n, false);
    }
    
    public final int wU(final int n) {
        return this.dN(n, false);
    }
    
    public final int wU() {
        return this.wU;
    }
    
    public final void fa() {
        this.fa(2);
        final int ld = this.ld;
        this.dN[ld] = 0;
        this.dN[ld + 1] = 0;
        this.ld += 2;
        ++this.wU;
    }
    
    public final void zs() {
        if (this.ld == 0) {
            return;
        }
        final int n = this.ld - 1;
        final int n2 = this.dN[n];
        if (n - 1 - n2 * 2 == 0) {
            return;
        }
        this.ld -= 2 + n2 * 2;
        this.QE -= n2;
        --this.wU;
    }
    
    private void fa(final int n) {
        final int n2 = this.dN.length - this.ld;
        if (n2 > n) {
            return;
        }
        final int[] dn = new int[(this.dN.length + n2) * 2];
        System.arraycopy(this.dN, 0, dn, 0, this.ld);
        this.dN = dn;
    }
    
    private final int dN(final int n, final boolean b) {
        if (this.ld == 0) {
            return -1;
        }
        int n2 = this.ld - 1;
        for (int i = this.wU; i != 0; --i) {
            int j = this.dN[n2];
            n2 -= 2;
            while (j != 0) {
                if (b) {
                    if (this.dN[n2] == n) {
                        return this.dN[n2 + 1];
                    }
                }
                else if (this.dN[n2 + 1] == n) {
                    return this.dN[n2];
                }
                n2 -= 2;
                --j;
            }
        }
        return -1;
    }
    
    private final int ld(int n, final boolean b) {
        if (this.ld == 0 || n < 0) {
            return -1;
        }
        int n2 = 0;
        for (int i = this.wU; i != 0; --i) {
            final int n3 = this.dN[n2];
            if (n < n3) {
                int n4 = n2 + (1 + n * 2);
                if (!b) {
                    ++n4;
                }
                return this.dN[n4];
            }
            n -= n3;
            n2 += 2 + n3 * 2;
        }
        return -1;
    }
}
