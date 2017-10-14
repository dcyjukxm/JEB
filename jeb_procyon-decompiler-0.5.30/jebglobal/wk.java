// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class wk implements Comparable
{
    private int dN;
    private int ld;
    private int QE;
    
    public wk(final int dn, final int ld, final int qe) {
        if (dn < 0 || ld < 0 || qe < 0) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public int ld() {
        return this.ld;
    }
    
    public int QE() {
        return this.QE;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 + this.QE) + this.dN) + this.ld;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final wk wk = (wk)o;
        return this.dN == wk.dN && this.ld == wk.ld && this.QE == wk.QE;
    }
    
    public int dN(final wk wk) {
        if (this.dN > wk.dN) {
            return 1;
        }
        if (this.dN == wk.dN && this.ld > wk.ld) {
            return 1;
        }
        if (this.dN == wk.dN && this.ld == wk.ld) {
            return this.QE - wk.QE;
        }
        return -1;
    }
    
    @Override
    public String toString() {
        return String.format("%d.%d.%d", this.dN, this.ld, this.QE);
    }
    
    public static wk dN(final String s) {
        final String[] split = s.trim().split("\\.", -1);
        try {
            final int int1 = Integer.parseInt(split[0]);
            final int int2 = Integer.parseInt(split[1]);
            final int int3 = Integer.parseInt(split[2]);
            try {
                return new wk(int1, int2, int3);
            }
            catch (Exception ex) {
                return null;
            }
        }
        catch (NumberFormatException ex2) {
            return null;
        }
    }
}
