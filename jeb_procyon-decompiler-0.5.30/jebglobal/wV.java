// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.nio.charset.Charset;
import java.nio.charset.CharacterCodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;

public final class wV
{
    private int[] dN;
    private byte[] ld;
    private int[] QE;
    private int[] wU;
    private boolean fa;
    private static final CharsetDecoder zs;
    private static final CharsetDecoder mS;
    
    public static wV dN(final hq hq) {
        hq.ld(1835009);
        final int int1 = hq.readInt();
        final int int2 = hq.readInt();
        final int int3 = hq.readInt();
        final int int4 = hq.readInt();
        final int int5 = hq.readInt();
        final int int6 = hq.readInt();
        final wV wv = new wV();
        wv.fa = ((int4 & 0x100) != 0x0);
        wv.dN = hq.dN(int2);
        if (int3 != 0) {
            wv.QE = hq.dN(int3);
        }
        hq.readFully(wv.ld = new byte[((int6 == 0) ? int1 : int6) - int5]);
        if (int6 != 0) {
            final int n = int1 - int6;
            wv.wU = hq.dN(n / 4);
            int n2 = n % 4;
            if (n2 >= 1) {
                while (n2-- > 0) {
                    hq.readByte();
                }
            }
        }
        return wv;
    }
    
    public String dN(final int n) {
        if (n < 0 || this.dN == null || n >= this.dN.length) {
            return null;
        }
        int n2 = this.dN[n];
        int n3;
        if (!this.fa) {
            n3 = dN(this.ld, n2) * 2;
            n2 += 2;
        }
        else {
            final int n4 = n2 + ld(this.ld, n2)[1];
            final int[] ld = ld(this.ld, n4);
            n2 = n4 + ld[1];
            n3 = ld[0];
        }
        return this.dN(n2, n3);
    }
    
    public String ld(final int n) {
        final String dn = this.dN(n);
        if (dn == null) {
            return dn;
        }
        final int[] qe = this.QE(n);
        if (qe == null) {
            return TM.dN(dn);
        }
        final StringBuilder sb = new StringBuilder(dn.length() + 32);
        final int[] array = new int[qe.length / 3];
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4 = -1;
            for (int i = 0; i != qe.length; i += 3) {
                if (qe[i + 1] != -1) {
                    if (n4 == -1 || qe[n4 + 1] > qe[i + 1]) {
                        n4 = i;
                    }
                }
            }
            final int n5 = (n4 != -1) ? qe[n4 + 1] : dn.length();
            int j;
            for (j = n3 - 1; j >= 0; --j) {
                final int n6 = array[j];
                final int n7 = qe[n6 + 2];
                if (n7 >= n5) {
                    break;
                }
                if (n2 <= n7) {
                    sb.append(TM.dN(dn.substring(n2, n7 + 1)));
                    n2 = n7 + 1;
                }
                this.dN(this.dN(qe[n6]), sb, true);
            }
            n3 = j + 1;
            if (n2 < n5) {
                sb.append(TM.dN(dn.substring(n2, n5)));
                n2 = n5;
            }
            if (n4 == -1) {
                break;
            }
            this.dN(this.dN(qe[n4]), sb, false);
            qe[n4 + 1] = -1;
            array[n3++] = n4;
        }
        return sb.toString();
    }
    
    private void dN(final String s, final StringBuilder sb, final boolean b) {
        sb.append('<');
        if (b) {
            sb.append('/');
        }
        int n = s.indexOf(59);
        if (n == -1) {
            sb.append(s);
        }
        else {
            sb.append(s.substring(0, n));
            if (!b) {
                int i = 1;
                while (i != 0) {
                    final int index = s.indexOf(61, n + 1);
                    sb.append(' ').append(s.substring(n + 1, index)).append("=\"");
                    n = s.indexOf(59, index + 1);
                    String s2;
                    if (n != -1) {
                        s2 = s.substring(index + 1, n);
                    }
                    else {
                        i = 0;
                        s2 = s.substring(index + 1);
                    }
                    sb.append(TM.dN(s2)).append('\"');
                }
            }
        }
        sb.append('>');
    }
    
    private int[] QE(final int n) {
        if (this.QE == null || this.wU == null || n >= this.QE.length) {
            return null;
        }
        final int n2 = this.QE[n] / 4;
        int n3 = 0;
        for (int n4 = n2; n4 < this.wU.length && this.wU[n4] != -1; ++n4) {
            ++n3;
        }
        if (n3 == 0 || n3 % 3 != 0) {
            return null;
        }
        final int[] array = new int[n3];
        for (int n5 = n2, n6 = 0; n5 < this.wU.length && this.wU[n5] != -1; array[n6++] = this.wU[n5++]) {}
        return array;
    }
    
    private String dN(final int n, final int n2) {
        try {
            return (this.fa ? wV.mS : wV.zs).decode(ByteBuffer.wrap(this.ld, n, n2)).toString();
        }
        catch (CharacterCodingException ex) {
            (new Object[1])[0] = ex.toString();
            return null;
        }
    }
    
    private static final int dN(final byte[] array, final int n) {
        return (array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF);
    }
    
    private static final int[] ld(final byte[] array, final int n) {
        final byte b = array[n];
        final boolean b2 = (b & 0x80) != 0x0;
        final byte b3 = (byte)(b & 0x7F);
        if (!b2) {
            return new int[] { b3, 1 };
        }
        return new int[] { b3 << 8 | (array[n + 1] & 0xFF), 2 };
    }
    
    static {
        zs = Charset.forName("UTF-16LE").newDecoder();
        mS = Charset.forName("UTF-8").newDecoder();
    }
}
