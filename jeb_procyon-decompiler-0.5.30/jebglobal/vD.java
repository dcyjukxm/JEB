// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;

public final class vD
{
    private int[] dN;
    private HashMap ld;
    private HashMap QE;
    private HashMap wU;
    private HashMap fa;
    private HashSet zs;
    private HashSet mS;
    private HashMap OK;
    
    private vD(final int n) {
        this.dN = new int[n];
        this.ld = new HashMap();
        this.QE = new HashMap();
        this.wU = new HashMap();
        this.fa = new HashMap();
        this.zs = new HashSet();
        this.mS = new HashSet();
        this.OK = new HashMap();
    }
    
    public uK dN(final int n) {
        final uK uk = new uK();
        final Integer n2 = this.ld.get(n);
        uk.dN = ((n2 == null) ? -1 : n2);
        uk.ld = this.QE.get(n);
        uk.QE = this.zs.contains(n);
        uk.wU = this.mS.contains(n);
        final Integer n3 = this.OK.get(n);
        uk.fa = ((n3 == null) ? -1 : n3);
        return uk;
    }
    
    public int[] dN() {
        return this.dN;
    }
    
    static vD dN(final byte[] array, final int n, final int n2) {
        final int[] array2 = { 0 };
        final int ld = AR.ld(array, n, array2);
        final int n3 = n + array2[0];
        final int ld2 = AR.ld(array, n3, array2);
        int n4 = n3 + array2[0];
        final vD vd = new vD(ld2);
        for (int i = 0; i < ld2; ++i) {
            vd.dN[i] = AR.QE(array, n4, array2);
            n4 += array2[0];
        }
        int n5 = 0;
        int n6 = ld;
        int n7 = -2;
        int n8 = 0;
        int n9 = 0;
        while (true) {
            int n10 = array[n4] & 0xFF;
            ++n4;
            if (n10 == 0) {
                break;
            }
            if (n10 == 1) {
                final int ld3 = AR.ld(array, n4, array2);
                n4 += array2[0];
                n5 += ld3;
            }
            else if (n10 == 2) {
                final int dn = AR.dN(array, n4, array2);
                n4 += array2[0];
                n6 += dn;
            }
            else if (n10 == 3) {
                final int ld4 = AR.ld(array, n4, array2);
                final int n11 = n4 + array2[0];
                final int qe = AR.QE(array, n11, array2);
                final int n12 = n11 + array2[0];
                final int qe2 = AR.QE(array, n12, array2);
                n4 = n12 + array2[0];
                dN(vd, new vd(n5, ld4, qe, qe2, -1));
            }
            else if (n10 == 4) {
                final int ld5 = AR.ld(array, n4, array2);
                final int n13 = n4 + array2[0];
                final int qe3 = AR.QE(array, n13, array2);
                final int n14 = n13 + array2[0];
                final int qe4 = AR.QE(array, n14, array2);
                final int n15 = n14 + array2[0];
                final int qe5 = AR.QE(array, n15, array2);
                n4 = n15 + array2[0];
                dN(vd, new vd(n5, ld5, qe3, qe4, qe5));
            }
            else if (n10 == 5) {
                final int ld6 = AR.ld(array, n4, array2);
                n4 += array2[0];
                List<?> list = vd.wU.get(n5);
                if (list == null) {
                    list = new ArrayList<Object>();
                    vd.wU.put(n5, list);
                }
                list.add(ld6);
            }
            else if (n10 == 6) {
                final int ld7 = AR.ld(array, n4, array2);
                n4 += array2[0];
                List<?> list2 = vd.fa.get(n5);
                if (list2 == null) {
                    list2 = new ArrayList<Object>();
                    vd.fa.put(n5, list2);
                }
                list2.add(ld7);
            }
            else if (n10 == 7) {
                n8 = 1;
            }
            else if (n10 == 8) {
                n9 = 1;
            }
            else if (n10 == 9) {
                final int qe6 = AR.QE(array, n4, array2);
                n4 += array2[0];
                n7 = qe6;
            }
            else {
                n10 -= 10;
                n6 += -4 + n10 % 15;
                n5 += n10 / 15;
                vd.ld.put(n5, n6);
                if (n8 != 0) {
                    vd.zs.add(n5);
                    n8 = 0;
                }
                if (n9 != 0) {
                    vd.mS.add(n5);
                    n9 = 0;
                }
                if (n7 < -1) {
                    continue;
                }
                vd.OK.put(n5, n7);
                n7 = -2;
            }
        }
        return vd;
    }
    
    private static void dN(final vD vd, final vd vd2) {
        List<vd> list = vd.QE.get(vd2.dN);
        if (list == null) {
            list = new ArrayList<vd>();
            vd.QE.put(vd2.dN, list);
        }
        list.add(vd2);
    }
    
    public static final class vd
    {
        private int dN;
        private int ld;
        private int QE;
        private int wU;
        private int fa;
        
        vd(final int dn, final int ld, final int qe, final int wu, final int fa) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            this.wU = wu;
            this.fa = fa;
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
        
        public int wU() {
            return this.wU;
        }
        
        public int fa() {
            return this.fa;
        }
    }
    
    public static final class uK
    {
        public int dN;
        public List ld;
        public boolean QE;
        public boolean wU;
        public int fa;
    }
}
