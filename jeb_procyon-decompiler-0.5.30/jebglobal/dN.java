// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class dN
{
    private final cN dN;
    
    public dN(final cN dn) {
        this.dN = dn;
    }
    
    public fv dN(final int n, final int n2, final String s) {
        switch (n) {
            case 1: {
                return this.dN(n2, s);
            }
            case 2: {
                return this.dN(n2, s, true);
            }
            case 3: {
                return new kB(s);
            }
            case 4: {
                return new IU(Float.intBitsToFloat(n2), s);
            }
            case 5: {
                return new mS(n2, s);
            }
            case 6: {
                return new ZT(n2, s);
            }
            case 18: {
                return new MS(n2 != 0, s);
            }
            default: {
                if (n >= 28 && n <= 31) {
                    return new D(n2, s);
                }
                if (n >= 16 && n <= 31) {
                    return new Vp(n2, s);
                }
                throw new zX();
            }
        }
    }
    
    public ED dN(final String s) {
        if (s.startsWith("res/")) {
            return new fa(s);
        }
        return new kB(s);
    }
    
    public Vi dN(final int n, final PS[] array) {
        final UD dn = this.dN(n, (String)null);
        if (array.length == 0) {
            return new Vi(dn);
        }
        final int intValue = (int)array[0].dN;
        if (intValue == 16777216) {
            return sm.dN(dn, array, this, this.dN);
        }
        if (intValue == 33554432) {
            return new eA(dn, array);
        }
        if (intValue >= 16777220 && intValue <= 16777225) {
            return new MA(dn, array);
        }
        return new aj(dn, array, this);
    }
    
    public UD dN(final int n, final String s) {
        return this.dN(n, s, false);
    }
    
    public UD dN(final int n, final String s, final boolean b) {
        return new UD(this.dN, n, s, b);
    }
}
