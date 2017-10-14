// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.List;

public final class Bw implements Oa
{
    private AR dN;
    private int ld;
    private int QE;
    private int wU;
    private int[] fa;
    
    Bw(final AR dn, final int ld, final int qe, final int wu, final int[] array) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = ((array != null) ? array : new int[0]);
    }
    
    public int dN() {
        return this.ld;
    }
    
    public int ld() {
        return this.QE;
    }
    
    public String QE() {
        return this.dN.dN(this.QE);
    }
    
    public int wU() {
        return this.wU;
    }
    
    public nh.vd fa() {
        return this.dN.QE(this.wU);
    }
    
    public String dN(final boolean b) {
        return this.dN.dN(this.wU, b);
    }
    
    public int[] zs() {
        return this.fa;
    }
    
    public nh.vd[] mS() {
        final nh.vd[] array = new nh.vd[this.fa.length];
        int n = 0;
        final int[] fa = this.fa;
        for (int length = fa.length, i = 0; i < length; ++i) {
            array[n] = this.dN.QE(fa[i]);
            ++n;
        }
        return array;
    }
    
    public String[] ld(final boolean b) {
        final String[] array = new String[this.fa.length];
        int n = 0;
        final int[] fa = this.fa;
        for (int length = fa.length, i = 0; i < length; ++i) {
            array[n] = this.dN.dN(fa[i], b);
            ++n;
        }
        return array;
    }
    
    public String QE(final boolean b) {
        final StringBuffer sb = new StringBuffer();
        sb.append("(");
        final int[] fa = this.fa;
        for (int length = fa.length, i = 0; i < length; ++i) {
            sb.append(this.dN.dN(fa[i], b));
        }
        sb.append(")");
        sb.append(this.dN.dN(this.wU, b));
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    public static List dN(final String s, final String[] array) {
        if (s == null) {
            return null;
        }
        final int length = s.length();
        if (length < 3 || s.charAt(0) != '(') {
            return null;
        }
        final ArrayList<String> list = new ArrayList<String>(16);
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        int i = 1;
        while (i < length) {
            final int n2 = i;
            char c = s.charAt(i++);
            if (c == ')') {
                if (n != 0) {
                    return null;
                }
                n = 1;
            }
            else {
                int n3 = 0;
                while (i < length && c == '[') {
                    ++n3;
                    c = s.charAt(i++);
                }
                if (n3 >= 1 && c == '[') {
                    return null;
                }
                switch (c) {
                    case 66:
                    case 67:
                    case 68:
                    case 70:
                    case 73:
                    case 74:
                    case 83:
                    case 90: {
                        break;
                    }
                    case 76: {
                        final int index = s.indexOf(59, i);
                        if (index <= i + 1) {
                            return null;
                        }
                        i = index + 1;
                        break;
                    }
                    case 86: {
                        if (n == 0) {
                            return null;
                        }
                        break;
                    }
                    default: {
                        return null;
                    }
                }
                if (n3 >= 1) {
                    c = 'L';
                }
                final String substring = s.substring(n2, i);
                if (n != 0) {
                    list.add(0, substring);
                    sb.insert(0, c);
                    break;
                }
                list.add(substring);
                sb.append(c);
            }
        }
        if (n == 0 || i != length) {
            return null;
        }
        if (array != null && array.length >= 1) {
            array[0] = sb.toString();
        }
        return list;
    }
}
