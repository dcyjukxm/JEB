// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;

public class Rg
{
    private AR dN;
    private Yx ld;
    private HashMap QE;
    private HashMap wU;
    private ArrayList fa;
    private boolean zs;
    private boolean mS;
    private boolean OK;
    private boolean LH;
    private int KK;
    private boolean EO;
    private boolean cb;
    private boolean PF;
    private boolean Hw;
    private boolean rK;
    private boolean Ux;
    private boolean ZY;
    private boolean s;
    private int Hv;
    private int VX;
    private String ci;
    private static boolean bG;
    
    public Rg(final AR dn) {
        this.dN = dn;
        this.ld = new Yx(dn);
        this.QE = new HashMap();
        this.wU = new HashMap();
        this.fa = new ArrayList();
        this.zs = false;
        this.OK = true;
        this.LH = true;
        this.KK = 0;
        this.EO = true;
        this.cb = true;
        this.PF = true;
        this.Hw = true;
        this.rK = true;
        this.Ux = true;
        this.s = true;
        this.Hv = 0;
        this.VX = 0;
        this.ci = null;
    }
    
    public Yx dN() {
        return this.ld;
    }
    
    public void dN(int kk) {
        if (kk <= 0) {
            kk = 0;
        }
        this.KK = kk;
    }
    
    public void dN(final KT kt) {
        this.fa.add(kt);
    }
    
    public void ld(final KT kt) {
        this.fa.remove(kt);
    }
    
    private void dN(final KT.uK uk) {
        final Iterator<KT> iterator = this.fa.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(uk);
        }
    }
    
    public void dN(final boolean zs) {
        this.zs = zs;
    }
    
    public void ld(final boolean cb) {
        this.cb = cb;
    }
    
    public void QE(final boolean eo) {
        this.EO = eo;
    }
    
    public void wU(final boolean b) {
        if (b) {
            this.ld.zs.dN(HI.vd.ld);
        }
        else {
            this.ld.zs.dN(HI.vd.dN);
        }
    }
    
    public void fa(final boolean pf) {
        this.PF = pf;
    }
    
    public void zs(final boolean hw) {
        this.Hw = hw;
    }
    
    public void mS(final boolean rk) {
        this.rK = rk;
    }
    
    public void OK(final boolean ux) {
        this.Ux = ux;
    }
    
    public void LH(final boolean zy) {
        this.ZY = zy;
    }
    
    public void KK(final boolean s) {
        this.s = s;
    }
    
    public zd dN(String ld) {
        final yK cb = this.dN.cb(ld);
        if (cb == null) {
            throw new RuntimeException();
        }
        ld = cb.ld(false);
        return this.wU.get(ld);
    }
    
    public Fu ld(String wu) {
        final AV wu2 = this.dN.wU(wu);
        if (wu2 == null) {
            throw new RuntimeException();
        }
        wu = this.dN.mS(wu2.ld()).wU(false);
        return this.QE.get(wu);
    }
    
    private void QE(String wu, final ZL zl) {
        final AV wu2 = this.dN.wU(wu);
        if (wu2 == null) {
            throw new RuntimeException();
        }
        wu = this.dN.mS(wu2.ld()).wU(false);
        if (!Rg.bG) {
            jebglobal.rK.dN = 0;
        }
        Fu fu = this.ld(wu);
        if (fu == null || this.zs) {
            this.dN(new KT.uK(KT.vd.ld, wu));
            int n = 0;
            if (fu != null) {
                fu.ld();
            }
            if (wu2.wU() == null) {
                fu = new ai(this.ld, wu2).dN();
            }
            else {
                wu2.wU().fa().zs();
                final Gz gz = new Gz(this.dN, wu2, this.ld.ld);
                gz.dN(this.cb);
                this.dN(new KT.uK(KT.vd.QE));
                gz.dN();
                final kW kw = new kW(gz.ld());
                kw.dN(this.EO);
                this.dN(new KT.uK(KT.vd.wU));
                kw.dN();
                final ai ai = new ai(this.ld, gz);
                if (this.OK) {
                    this.dN(new KT.uK(KT.vd.fa));
                    fu = ai.QE();
                    if (this.LH) {
                        final b b = new b(this.ld, fu);
                        b.dN(this.PF);
                        b.ld(this.Hw);
                        b.QE(this.rK);
                        b.wU(this.Ux);
                        b.fa(this.ZY);
                        b.zs(this.s);
                        this.dN(new KT.uK(KT.vd.zs));
                        b.dN();
                    }
                    if (ai.dN) {
                        n = 2;
                        ++this.VX;
                    }
                }
                else {
                    this.dN(new KT.uK(KT.vd.fa));
                    fu = ai.ld();
                }
                ++this.Hv;
            }
            fu.dN(n, (String)null);
            this.QE.put(wu, fu);
            this.dN(new KT.uK(KT.vd.mS, wu));
        }
        if (zl != null) {
            zl.dN(this.dN);
            zl.dN((zd.uK)null);
            zl.dN((zd)null);
            fu.ld(zl);
        }
    }
    
    public void dN(final String s, final ZL zl, final int n) {
        Thread ld = null;
        this.ci = null;
        this.mS = false;
        try {
            ld = TM.ld(new SM(this, s, zl));
            ld.join(n);
            if (ld.isAlive()) {
                throw new RuntimeException("Decompilation timeout (stopping)");
            }
        }
        catch (Exception ex) {
            this.mS = (ex instanceof InterruptedException);
            (new Object[1])[0] = TM.dN(ld);
            throw new RuntimeException(ex);
        }
        if (this.ci != null) {
            throw new RuntimeException(this.ci);
        }
    }
    
    public void dN(final String s, final ZL zl) {
        this.dN(s, zl, this.KK);
    }
    
    public boolean ld(String ld, final ZL zl) {
        final yK cb = this.dN.cb(ld);
        if (cb == null) {
            throw new RuntimeException();
        }
        ld = cb.ld(false);
        zd ld2 = this.wU.get(ld);
        if (ld2 == null || this.zs) {
            this.dN(new KT.uK(KT.vd.dN, ld));
            if (ld2 == null) {
                ld2 = this.ld.fa.ld(ld);
            }
            final Uk s = cb.s();
            if (s != null) {
                final Iterator iterator = s.QE().iterator();
                while (iterator.hasNext()) {
                    this.ld.mS.dN(iterator.next().dN());
                }
                for (final AV av : s.zs()) {
                    final String wu = this.dN.mS(av.ld()).wU(false);
                    String dn = null;
                    try {
                        this.dN(wu, null);
                    }
                    catch (Exception ex) {
                        dn = TM.dN(ex);
                    }
                    if (dn != null) {
                        final Fu dn2 = this.ld.zs.dN(av.ld(), av.zs());
                        dn2.dN(1, dn);
                        this.QE.put(wu, dn2);
                        if (this.mS) {
                            return this.mS = false;
                        }
                        continue;
                    }
                }
            }
            final int[] fa = cb.fa();
            if (fa != null) {
                final int[] array = fa;
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (!this.ld(this.dN.dN(array[i], false), null)) {
                        return false;
                    }
                }
            }
            if (s != null) {
                final HashSet<Integer> set = new HashSet<Integer>();
                final Iterator iterator3 = s.zs().iterator();
                while (iterator3.hasNext()) {
                    set.add(iterator3.next().ld());
                }
                for (final yK yk : this.dN.Hw()) {
                    final int qe = yk.QE();
                    if (set.contains(yk.wU())) {
                        if (!this.ld(this.dN.dN(yk.zs(), false), null)) {
                            return false;
                        }
                        continue;
                    }
                    else {
                        if (qe == cb.zs() && !this.ld(this.dN.dN(yk.zs(), false), null)) {
                            return false;
                        }
                        continue;
                    }
                }
            }
            this.wU.put(cb.dN(false), ld2);
            this.dN(new KT.uK(KT.vd.OK, ld));
        }
        if (zl != null) {
            zl.dN(this.dN);
            zl.dN(this.ld.fa);
            zl.dN(ld2);
            ld2.ld(zl);
        }
        return true;
    }
    
    public static boolean dN(final Class clazz) {
        boolean dn = false;
        try {
            dn = dN(Class.forName(rP.dN(new byte[] { 92, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9 }, 1, 54)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42 }, 2, 218))).newInstance(Class.forName(rP.dN(new byte[] { -117, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30 }, 1, 225)).getMethod(rP.dN(new byte[] { -91, 27, 58, 7, 27 }, 1, 209), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86 }, 2, 4)).getMethod(rP.dN(new byte[] { 59, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1 }, 1, 92), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13 }, 2, 233)).getMethod(rP.dN(new byte[] { -115, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6 }, 1, 234), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66 }, 2, 20)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 0, 6, 19, 13, 23, 84, 65, 12, 71, 100, 94, 84, 88, 90, 66 }, 2, 2), (Class<?>[])new Class[0]).invoke(clazz, new Object[0]), new Object[0]), new Object[0]), new Object[0])), clazz);
        }
        catch (Exception ex) {}
        return dn;
    }
    
    private static boolean dN(final Object o, final Class clazz) {
        boolean equals = false;
        try {
            final Object instance = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 126)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6 }, 2, 87)), Boolean.TYPE).newInstance(o, true);
            final byte[] array = new byte[4096];
            final Object invoke = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 200)).getMethod(rP.dN(new byte[] { 36, 10, 4, 60, 28, 29, 21, 17 }, 2, 87), String.class).invoke(instance, clazz.getName().replace('.', '/') + ".class");
            while ((int)Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 61, 78, 88, 22, 93, 115, 69, 75, 92, 82, 65 }, 2, 98)).getMethod(rP.dN(new byte[] { 49, 10, 17, 29 }, 2, 194), byte[].class, Integer.TYPE, Integer.TYPE).invoke(Class.forName(rP.dN(new byte[] { -123, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 239)).getMethod(rP.dN(new byte[] { 121, 2, 17, 61, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12 }, 1, 30), Class.forName(rP.dN(new byte[] { -81, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11 }, 1, 197))).invoke(instance, invoke), array, 0, array.length) != -1) {}
            equals = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 88, 87, 77, 86, 94, 70, 83, 83, 84, 64, 2, 114, 28, 51, 49, 22, 14, 9, 73, 2, 37, 1, 86 }, 2, 101)).getMethod(rP.dN(new byte[] { 36, 10, 4, 52, 29, 13, 18, 4, 1, 83 }, 2, 115), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { -11, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17 }, 1, 159)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26 }, 2, 56), (Class<?>[])new Class[0]).invoke(((Object[])Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73 }, 2, 35)).getMethod(rP.dN(new byte[] { 36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66 }, 2, 5), (Class<?>[])new Class[0]).invoke(invoke, new Object[0]))[0], new Object[0]), new Object[0]).toString().substring(10).substring(15, 30).equals(rP.dN(new byte[] { 122, 94, 66, 76, 69, 91, 87, 91, 67, 23, 31, 81, 30, 22, 9 }, 2, 72));
            Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 17)).getMethod(rP.dN(new byte[] { -25, 15, 3, 28, 22 }, 1, 132), (Class<?>[])new Class[0]).invoke(instance, new Object[0]);
        }
        catch (Exception ex) {}
        return equals;
    }
    
    static {
        Rg.bG = dN(jI.class);
    }
}
