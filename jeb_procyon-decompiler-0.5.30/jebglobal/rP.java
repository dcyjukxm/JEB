// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class rP
{
    private byte[] dN;
    private int ld;
    private int QE;
    
    public static String dN(final byte[] array, final int n, final int n2) {
        return new rP(array, n, n2).dN();
    }
    
    rP(final byte[] dn, final int ld, final int qe) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    String dN() {
        if (this.dN == null) {
            throw new RuntimeException();
        }
        if (this.ld == 0 || this.dN.length == 0) {
            return new String(this.dN);
        }
        if (this.ld == 1) {
            final int length = this.dN.length;
            final byte[] array = new byte[length];
            byte b = (byte)this.QE;
            for (int i = 0; i < length; ++i) {
                array[i] = (byte)(b ^ this.dN[i]);
                b = array[i];
            }
            return new String(array);
        }
        if (this.ld == 2) {
            final int length2 = this.dN.length;
            final byte[] array2 = new byte[length2];
            final String s = "Copyright (c) 1993, 2013, Oracle and/or its affiliates. All rights reserved.";
            int n = 0;
            for (int j = 0; j < length2; ++j) {
                array2[j] = (byte)(this.dN[j] ^ (byte)s.charAt(n));
                n = (n + 1) % s.length();
            }
            return new String(array2);
        }
        throw new RuntimeException();
    }
}
