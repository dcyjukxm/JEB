// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.zip.Adler32;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class AR
{
    private static final long LK = 844563159190538443L;
    private boolean zs;
    private boolean mS;
    private boolean OK;
    private boolean LH;
    private boolean KK;
    private byte[] EO;
    private List cb;
    private int PF;
    private nh Hw;
    private bG rK;
    private tJ Ux;
    private Fx ZY;
    private Mx s;
    private HashSet Hv;
    private ArrayList VX;
    private RI ci;
    private HashMap bG;
    private Dn BQ;
    private List Ee;
    private OM[] De;
    HashMap dN;
    HashMap ld;
    private HashMap rn;
    HashMap QE;
    HashMap wU;
    HashMap fa;
    private UZ LR;
    
    public AR(final byte[] eo) {
        this.zs = false;
        this.mS = true;
        this.OK = true;
        this.LH = true;
        this.KK = true;
        this.Hv = new HashSet();
        this.VX = new ArrayList();
        this.QE = null;
        this.wU = null;
        this.fa = null;
        this.EO = eo;
    }
    
    public void dN(final boolean ms) {
        this.mS = ms;
    }
    
    public void ld(final boolean ok) {
        this.OK = ok;
    }
    
    public void QE(final boolean lh) {
        this.LH = lh;
    }
    
    public void wU(final boolean kk) {
        this.KK = kk;
    }
    
    public byte[] dN() {
        return this.EO;
    }
    
    public String dN(final int n) {
        if (n < 0 || n >= this.cb.size()) {
            return null;
        }
        return this.cb.get(n);
    }
    
    public int ld() {
        return this.cb.size();
    }
    
    public int QE() {
        return this.PF;
    }
    
    public String ld(final int n) {
        return (n < 0 || n >= this.cb.size()) ? "" : this.cb.get(n);
    }
    
    public String dN(final int n, String s, final boolean b) {
        if (s == null) {
            s = "";
        }
        final String s2 = (n < 0 || n >= this.cb.size()) ? s : this.cb.get(n);
        return b ? ZF.QE(s2, false) : s2;
    }
    
    public ArrayList wU() {
        return new ArrayList(this.cb);
    }
    
    public boolean dN(final int n, final String s) {
        if (n < 0 || n >= this.cb.size()) {
            return false;
        }
        this.cb.set(n, s);
        return true;
    }
    
    public Set fa() {
        return this.bG.keySet();
    }
    
    public Long dN(final long n) {
        return this.bG.get(n);
    }
    
    public Dn zs() {
        return this.BQ;
    }
    
    public nh mS() {
        return this.Hw;
    }
    
    public nh.vd QE(final int n) {
        return (nh.vd)this.Hw.dN(n);
    }
    
    public String dN(final int n, final boolean b) {
        return this.Hw.dN(n, b);
    }
    
    public Bw wU(final int n) {
        return (Bw)this.rK.dN(n);
    }
    
    public int OK() {
        return this.rK.dN();
    }
    
    public gE fa(final int n) {
        return (gE)this.Ux.dN(n);
    }
    
    public int LH() {
        return this.Ux.dN();
    }
    
    public List KK() {
        return this.Ux.QE();
    }
    
    public XV dN(final String s) {
        final XV xv = this.ld.get(s);
        if (xv != null) {
            return xv;
        }
        this.mS(false);
        final XV xv2 = this.wU.get(s);
        if (xv2 != null) {
            return xv2;
        }
        return xv2;
    }
    
    public XV ld(final String s) {
        XV dn = this.dN(s);
        if (dn != null) {
            return dn;
        }
        for (final String s2 : this.ld.keySet()) {
            if (s2.contains(s)) {
                if (dn != null) {
                    return null;
                }
                dn = (XV)this.ld.get(s2);
            }
        }
        for (final String s3 : this.wU.keySet()) {
            if (s3.contains(s)) {
                if (dn != null) {
                    return null;
                }
                dn = (XV)this.wU.get(s3);
            }
        }
        return dn;
    }
    
    private void mS(final boolean b) {
        if (b || this.wU == null) {
            this.wU = new HashMap();
            for (final XV xv : this.ld.values()) {
                final gE ge = (gE)this.Ux.dN(xv.dN());
                if (ge.wU()) {
                    this.wU.put(ge.fa(true), xv);
                }
            }
        }
    }
    
    public ub zs(final int n) {
        final gE fa = this.fa(n);
        if (fa == null) {
            return null;
        }
        if (!fa.QE()) {
            return null;
        }
        final XV dn = this.dN(fa.fa(false));
        if (dn == null || !dn.QE()) {
            return null;
        }
        final yK eo = this.EO(fa.dN(false));
        if (eo == null || eo.s() == null) {
            return null;
        }
        final ub[] zy = eo.ZY();
        int n2 = 0;
        for (final XV xv : eo.s().dN()) {
            if (n2 >= zy.length) {
                return null;
            }
            if (xv == dn) {
                return zy[n2];
            }
            ++n2;
        }
        throw new RuntimeException();
    }
    
    public hO mS(final int n) {
        return (hO)this.ZY.dN(n);
    }
    
    public int EO() {
        return this.ZY.dN();
    }
    
    public List cb() {
        return this.ZY.QE();
    }
    
    public Set fa(final boolean b) {
        if (!b) {
            return this.dN.keySet();
        }
        final HashSet<String> set = new HashSet<String>();
        final Iterator<AV> iterator = this.dN.values().iterator();
        while (iterator.hasNext()) {
            set.add(((hO)this.ZY.dN(iterator.next().ld())).wU(true));
        }
        return set;
    }
    
    public AV QE(final String s) {
        final AV av = this.dN.get(s);
        if (av != null) {
            return av;
        }
        this.OK(false);
        final AV av2 = this.QE.get(s);
        if (av2 != null) {
            return av2;
        }
        return null;
    }
    
    public AV wU(final String s) {
        AV qe = this.QE(s);
        if (qe != null) {
            return qe;
        }
        for (final String s2 : this.dN.keySet()) {
            if (s2.contains(s)) {
                if (qe != null) {
                    return null;
                }
                qe = (AV)this.dN.get(s2);
            }
        }
        for (final String s3 : this.QE.keySet()) {
            if (s3.contains(s)) {
                if (qe != null) {
                    return null;
                }
                qe = (AV)this.QE.get(s3);
            }
        }
        return qe;
    }
    
    private void OK(final boolean b) {
        if (b || this.QE == null) {
            this.QE = new HashMap();
            for (final AV av : this.dN.values()) {
                final hO ho = (hO)this.ZY.dN(av.ld());
                if (ho.wU()) {
                    this.QE.put(ho.wU(true), av);
                }
            }
        }
    }
    
    public int fa(final String s) {
        int n = this.cb.indexOf(s);
        if (n < 0) {
            n = this.cb.size();
            this.cb.add(s);
        }
        return n;
    }
    
    public nh.vd zs(final String s) {
        final nh.vd vd = (nh.vd)this.Hw.dN(s);
        if (vd != null) {
            return vd;
        }
        return this.Hw.ld(this.fa(s));
    }
    
    public Bw mS(final String s) {
        final Bw bw = (Bw)this.rK.dN(s);
        if (bw != null) {
            return bw;
        }
        final String[] array = { null };
        final List dn = Bw.dN(s, array);
        if (dn == null) {
            return null;
        }
        final int fa = this.fa(array[0]);
        int n = -1;
        final int[] array2 = new int[dn.size() - 1];
        int n2 = 0;
        final Iterator<String> iterator = dn.iterator();
        while (iterator.hasNext()) {
            final nh.vd zs = this.zs(iterator.next());
            if (zs == null) {
                return null;
            }
            final int dn2 = zs.dN();
            if (n2 == 0) {
                n = dn2;
            }
            else {
                array2[n2 - 1] = dn2;
            }
            ++n2;
        }
        return (Bw)this.rK.dN(this.rK.dN(fa, n, array2));
    }
    
    public hO OK(final String s) {
        final hO ho = (hO)this.ZY.dN(s);
        if (ho != null) {
            return ho;
        }
        final String[] split = s.split("->");
        if (split.length != 2) {
            return null;
        }
        final int index = split[1].indexOf(40);
        if (index < 0) {
            return null;
        }
        final String s2 = split[0];
        final String substring = split[1].substring(0, index);
        final String substring2 = split[1].substring(index);
        final nh.vd zs = this.zs(s2);
        if (zs == null) {
            return null;
        }
        final int fa = this.fa(substring);
        final Bw ms = this.mS(substring2);
        if (ms == null) {
            return null;
        }
        return (hO)this.ZY.dN(this.ZY.dN(zs.dN(), ms.dN(), fa));
    }
    
    public gE LH(final String s) {
        final gE ge = (gE)this.Ux.dN(s);
        if (ge != null) {
            return ge;
        }
        final String[] split = s.split("->");
        if (split.length != 2) {
            return null;
        }
        final int index = split[1].indexOf(58);
        if (index < 0) {
            return null;
        }
        final String s2 = split[0];
        final String substring = split[1].substring(0, index);
        final String substring2 = split[1].substring(index + 1);
        final nh.vd zs = this.zs(s2);
        if (zs == null) {
            return null;
        }
        final int fa = this.fa(substring);
        final nh.vd zs2 = this.zs(substring2);
        if (zs2 == null) {
            return null;
        }
        return (gE)this.Ux.dN(this.Ux.dN(zs.dN(), zs2.dN(), fa));
    }
    
    public yK OK(final int n) {
        return (yK)this.s.dN(n);
    }
    
    public int PF() {
        return this.s.dN();
    }
    
    public List Hw() {
        return this.s.QE();
    }
    
    public Set rK() {
        return this.Hw.fa();
    }
    
    public Object KK(final String s) {
        Object o = this.EO(s);
        if (o == null) {
            o = this.Hw.QE(s);
        }
        return o;
    }
    
    public yK EO(final String s) {
        final yK yk = this.rn.get(s);
        if (yk != null) {
            return yk;
        }
        this.LH(false);
        final yK yk2 = this.fa.get(s);
        if (yk2 != null) {
            return yk2;
        }
        return null;
    }
    
    public yK cb(final String s) {
        yK eo = this.EO(s);
        if (eo != null) {
            return eo;
        }
        for (final String s2 : this.rn.keySet()) {
            if (s2.contains(s)) {
                if (eo != null) {
                    return null;
                }
                eo = (yK)this.rn.get(s2);
            }
        }
        for (final String s3 : this.fa.keySet()) {
            if (s3.contains(s)) {
                if (eo != null) {
                    return null;
                }
                eo = (yK)this.fa.get(s3);
            }
        }
        return eo;
    }
    
    private void LH(final boolean b) {
        if (b || this.fa == null) {
            this.fa = new HashMap();
            for (final yK yk : this.rn.values()) {
                if (yk.OK()) {
                    this.fa.put(yk.dN(true), yk);
                }
            }
        }
    }
    
    public yK dN(final yK yk) {
        if (!yk.dN()) {
            throw new RuntimeException();
        }
        final int qe = yk.QE();
        if (qe >= 0) {
            return this.EO(this.dN(qe, false));
        }
        final int wu = yk.wU();
        if (wu < 0) {
            return null;
        }
        return this.EO(((hO)this.ZY.dN(wu)).dN(false));
    }
    
    public hO LH(final int n) {
        int n2 = 0;
        int i = this.De.length;
        int n3 = 0;
        while (i > n2) {
            final int n4 = n2 + (i - n2) / 2;
            final OM om = this.De[n4];
            final int ld = om.ld();
            if (n < ld) {
                i = n4;
            }
            else {
                if (n <= ld) {
                    return (hO)this.ZY.dN(om.dN());
                }
                n2 = n4 + 1;
                n3 = n4;
            }
        }
        if (n3 < this.De.length) {
            final OM om2 = this.De[n3];
            if (n < om2.ld() + om2.QE()) {
                return (hO)this.ZY.dN(om2.dN());
            }
        }
        return null;
    }
    
    static int dN(final byte[] array, final int n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8;
    }
    
    static int ld(final byte[] array, final int n) {
        final int n2 = (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16 | (array[n + 3] & 0xFF) << 24;
        if (n2 < -1) {
            throw new yL();
        }
        return n2;
    }
    
    static int dN(final byte[] array, final int n, final int[] array2) {
        int n2;
        int i;
        int n3;
        for (n2 = 0, i = -1, n3 = 0; i < 0; i = array[n + n3], n2 |= (i & 0x7F) << n3 * 7, ++n3) {}
        if (n3 > 5) {
            throw new yL();
        }
        if ((i & 0x40) != 0x0) {
            if (n3 == 1) {
                n2 |= 0xFFFFFF80;
            }
            if (n3 == 2) {
                n2 |= 0xFFFFC000;
            }
            if (n3 == 3) {
                n2 |= 0xFFE00000;
            }
            if (n3 == 4) {
                n2 |= 0xF0000000;
            }
        }
        array2[0] = n3;
        return n2;
    }
    
    static int ld(final byte[] array, final int n, final int[] array2) {
        int n2;
        int i;
        int n3;
        for (n2 = 0, i = -1, n3 = 0; i < 0; i = array[n + n3], n2 |= (i & 0x7F) << n3 * 7, ++n3) {}
        if (n3 > 5) {
            throw new yL();
        }
        array2[0] = n3;
        return n2;
    }
    
    static int QE(final byte[] array, final int n, final int[] array2) {
        return ld(array, n, array2) - 1;
    }
    
    static String wU(final byte[] array, int n, final int[] array2) {
        final StringBuffer sb = new StringBuffer();
        final int n2 = n;
        int n3 = 0;
        while (true) {
            int n4 = array[n] & 0xFF;
            ++n;
            if (n4 == 0) {
                array2[0] = n - n2;
                return sb.toString();
            }
            if ((n4 & 0x80) != 0x0) {
                if ((n4 & 0xE0) == 0xC0) {
                    final int n5 = array[n] & 0xFF;
                    ++n;
                    if ((n5 & 0xC0) != 0x80) {
                        throw new yL();
                    }
                    n4 = ((n4 & 0x1F) << 6 | (n5 & 0x3F));
                }
                else {
                    if ((n4 & 0xF0) != 0xE0) {
                        throw new yL();
                    }
                    final int n6 = array[n] & 0xFF;
                    ++n;
                    final int n7 = array[n] & 0xFF;
                    ++n;
                    if ((n6 & 0xC0) != 0x80 || (n7 & 0xC0) != 0x80) {
                        throw new yL();
                    }
                    n4 = ((n4 & 0xF) << 12 | (n6 & 0x3F) << 6 | (n7 & 0x3F));
                    if (n4 >= 55296 && n4 <= 56319) {
                        if (n3 != 0) {
                            throw new yL();
                        }
                        n3 = 65536 + (n4 - 55296 << 10);
                        continue;
                    }
                    else if (n4 >= 56320 && n4 <= 57343) {
                        if (n3 == 0) {
                            throw new yL();
                        }
                        n4 = n3 + (n4 - 56320);
                        n3 = 0;
                    }
                }
            }
            if (n3 != 0) {
                throw new yL();
            }
            sb.appendCodePoint(n4);
        }
    }
    
    public static void KK(final int n) {
        if ((n & 0xFFFF89E0) != 0x0) {
            throw new RuntimeException();
        }
    }
    
    public static void EO(final int n) {
        if ((n & 0xFFFFAF20) != 0x0) {
            throw new RuntimeException();
        }
    }
    
    public static void cb(final int n) {
        if ((n & 0xFFFCE200) != 0x0) {
            throw new RuntimeException();
        }
    }
    
    public void Ux() {
        if (this.zs) {
            return;
        }
        this.dN = new HashMap();
        this.ld = new HashMap();
        this.rn = new HashMap();
        this.Ee = new ArrayList();
        if (this.EO.length < 112) {
            throw new yL();
        }
        if (this.EO[0] != 100 || this.EO[1] != 101 || this.EO[2] != 120 || this.EO[3] != 10) {
            if (this.EO[0] == 80 && this.EO[1] == 75 && this.EO[2] == 3 && this.EO[3] == 4) {
                cn.dN("This DEX file appears to be a ZIP/JAR archive.");
            }
            throw new yL();
        }
        if (this.EO[4] != 48 || this.EO[5] != 51 || (this.EO[6] != 53 && this.EO[6] != 54) || this.EO[7] != 0) {
            cn.dN("Unknown DEX version");
            if (this.mS) {
                throw new yL();
            }
        }
        final int n = (this.EO[8] & 0xFF) | (this.EO[9] & 0xFF) << 8 | (this.EO[10] & 0xFF) << 16 | (this.EO[11] & 0xFF) << 24;
        final Adler32 adler32 = new Adler32();
        adler32.update(this.EO, 12, this.EO.length - 12);
        final int n2 = (int)adler32.getValue();
        if (n2 != n) {
            cn.dN(String.format("Invalid DEX checksum (expected=%08X, actual=%08X)", n2, n));
            if (this.OK) {
                throw new yL();
            }
        }
        final byte[] array = new byte[20];
        for (int i = 0; i < 20; ++i) {
            array[i] = this.EO[12 + i];
        }
        MessageDigest instance;
        try {
            instance = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException ex) {
            throw new yL();
        }
        instance.update(this.EO, 32, this.EO.length - 32);
        if (!Arrays.equals(instance.digest(), array)) {
            cn.dN(String.format("Invalid DEX signature (expected=%s, actual=%s)", ZF.dN(array), ZF.dN(instance.digest())));
            if (this.OK) {
                throw new yL();
            }
        }
        if (ld(this.EO, 32) < 0) {
            throw new yL();
        }
        final int ld = ld(this.EO, 36);
        if (ld != 112) {
            cn.dN(String.format("Invalid DEX header size (%Xh)", ld));
        }
        final int ld2 = ld(this.EO, 40);
        if (ld2 == 305419896) {
            ld(this.EO, 44);
            ld(this.EO, 48);
            ld(this.EO, 52);
            final int ld3 = ld(this.EO, 56);
            final int ld4 = ld(this.EO, 60);
            final int ld5 = ld(this.EO, 64);
            final int ld6 = ld(this.EO, 68);
            final int ld7 = ld(this.EO, 72);
            final int ld8 = ld(this.EO, 76);
            final int ld9 = ld(this.EO, 80);
            final int ld10 = ld(this.EO, 84);
            final int ld11 = ld(this.EO, 88);
            final int ld12 = ld(this.EO, 92);
            final int ld13 = ld(this.EO, 96);
            final int ld14 = ld(this.EO, 100);
            ld(this.EO, 104);
            ld(this.EO, 108);
            this.cb = this.dN(ld3, ld4);
            this.PF = this.cb.size();
            this.Hw = this.ld(ld5, ld6);
            this.rK = this.QE(ld7, ld8);
            this.Ux = this.wU(ld9, ld10);
            this.ZY = this.fa(ld11, ld12);
            this.bG = new HashMap();
            this.BQ = new Dn();
            this.ci = new RI(this.EO, this.bG, this.BQ, new RI.vd(this.cb.size(), this.Hw.dN(), this.Ux.dN(), this.ZY.dN()), this.KK);
            this.s = this.zs(ld13, ld14);
            this.Hw.wU();
            this.BQ.dN(this);
            Collections.sort((List<Object>)this.Ee, new Qm(this));
            this.De = new OM[this.Ee.size()];
            this.Ee.toArray(this.De);
            if (!this.VX.isEmpty()) {
                final StringBuilder sb = new StringBuilder(rP.dN(new byte[] { -25, 54, 19, 28, 7, 7, 9, 93, 26, 100, 1, 29, 120, 77, 8, 17, 28, 7, 11, 68, 68, 1, 22, 16, 17, 27, 25, 4, 27, 29, 1, 83, 65, 19, 23, 69, 66, 7, 12, 7, 9, 71, 82, 23, 16, 6, 22, 1, 94, 26 }, 1, 176));
                final HashSet<Integer> set = new HashSet<Integer>();
                int n3 = 0;
                for (final int intValue : this.VX) {
                    if (n3++ >= 1) {
                        sb.append(", ");
                    }
                    sb.append(((hO)this.ZY.dN(intValue)).QE(false));
                    set.add(((hO)this.ZY.dN(intValue)).fa());
                }
                sb.append(rP.dN(new byte[] { 73, 34, 21, 13, 26, 6, 3, 27, 84, 77, 73, 26, 9, 66, 84, 25, 81, 90, 72, 68, 87, 94, 29, 19, 90, 69, 61, 27, 7, 26, 76, 17, 72, 4, 78, 5, 73, 0, 0, 69, 4, 17, 29, 84, 8, 9, 8, 12, 8, 73, 2, 24, 4, 0, 93, 69, 50, 76, 1, 65, 28, 28, 6, 4, 24, 10 }, 2, 117));
                cn.dN(sb.toString());
            }
            this.zs = true;
            return;
        }
        if (ld2 != 2018915346) {
            throw new yL();
        }
        throw new yL();
    }
    
    private ArrayList dN(final int n, int n2) {
        final HashSet<String> set = new HashSet<String>();
        final ArrayList<String> list = new ArrayList<String>(n);
        final int[] array = { 0 };
        for (int i = 0; i < n; ++i) {
            final int ld = ld(this.EO, n2);
            final int ld2 = ld(this.EO, ld, array);
            String s;
            try {
                s = wU(this.EO, ld + array[0], array);
                if (ld2 != s.length()) {
                    throw new yL();
                }
            }
            catch (yL yl) {
                s = String.format("__invalid_string_%X", ld);
            }
            list.add(s);
            if (!set.add(s)) {
                cn.dN(String.format("Duplicate string found: \"%s\"", ZF.QE(s, true)));
            }
            n2 += 4;
        }
        return list;
    }
    
    private nh ld(final int n, final int n2) {
        final nh nh = new nh(this, n);
        for (int i = 0; i < n; ++i) {
            nh.ld(ld(this.EO, n2 + 4 * i));
        }
        return nh;
    }
    
    private bG QE(final int n, final int n2) {
        final bG bg = new bG(this, n);
        for (int i = 0; i < n; ++i) {
            final int ld = ld(this.EO, n2 + 12 * i);
            final int ld2 = ld(this.EO, n2 + 12 * i + 4);
            int[] array = null;
            final int ld3 = ld(this.EO, n2 + 12 * i + 8);
            if (ld3 > 0) {
                final int ld4 = ld(this.EO, ld3);
                array = new int[ld4];
                for (int j = 0; j < ld4; ++j) {
                    array[j] = dN(this.EO, ld3 + 4 + 2 * j);
                }
            }
            bg.dN(ld, ld2, array);
        }
        return bg;
    }
    
    private tJ wU(final int n, final int n2) {
        final tJ tj = new tJ(this, n);
        for (int i = 0; i < n; ++i) {
            tj.dN(dN(this.EO, n2 + 8 * i), dN(this.EO, n2 + 8 * i + 2), ld(this.EO, n2 + 8 * i + 4));
        }
        return tj;
    }
    
    private Fx fa(final int n, final int n2) {
        final Fx fx = new Fx(this, n);
        for (int i = 0; i < n; ++i) {
            fx.dN(dN(this.EO, n2 + 8 * i), dN(this.EO, n2 + 8 * i + 2), ld(this.EO, n2 + 8 * i + 4));
        }
        return fx;
    }
    
    private Mx zs(final int n, int n2) {
        final Mx mx = new Mx(this, n);
        for (int i = 0; i < n; ++i, n2 += 32) {
            final int ld = ld(this.EO, n2);
            final int ld2 = ld(this.EO, n2 + 4);
            final int ld3 = ld(this.EO, n2 + 8);
            int[] array = null;
            final int ld4 = ld(this.EO, n2 + 12);
            if (ld4 > 0) {
                final int ld5 = ld(this.EO, ld4);
                array = new int[ld5];
                for (int j = 0; j < ld5; ++j) {
                    array[j] = dN(this.EO, ld4 + 4 + 2 * j);
                }
            }
            final int ld6 = ld(this.EO, n2 + 16);
            xd dn = null;
            final int ld7 = ld(this.EO, n2 + 20);
            if (ld7 > 0) {
                dn = xd.dN(this.EO, ld7);
            }
            Uk pf = null;
            final int ld8 = ld(this.EO, n2 + 24);
            if (ld8 > 0) {
                pf = this.PF(ld8);
            }
            ub[] ld9 = null;
            final int ld10 = ld(this.EO, n2 + 28);
            if (ld10 > 0) {
                ld9 = ub.ld(this.EO, ld10, new int[1]);
            }
            if (this.LH) {
                KK(ld2);
            }
            this.rn.put(this.dN(ld, false), mx.dN(mx.dN(ld, ld2, ld3, array, ld6, dn, pf, ld9)));
        }
        return mx;
    }
    
    private Uk PF(int n) {
        final int[] array = { 0 };
        final int ld = ld(this.EO, n, array);
        n += array[0];
        final int ld2 = ld(this.EO, n, array);
        n += array[0];
        final int ld3 = ld(this.EO, n, array);
        n += array[0];
        final int ld4 = ld(this.EO, n, array);
        n += array[0];
        final XV[] dn = this.dN(ld, n, array);
        n += array[0];
        final XV[] dn2 = this.dN(ld2, n, array);
        n += array[0];
        final AV[] ld5 = this.ld(ld3, n, array);
        n += array[0];
        return new Uk(dn, dn2, ld5, this.ld(ld4, n, array));
    }
    
    private XV[] dN(final int n, final int n2, final int[] array) {
        final XV[] array2 = new XV[n];
        final int[] array3 = { 0 };
        int n3 = 0;
        int n4 = n2;
        for (int i = 0; i < n; ++i) {
            final int ld = ld(this.EO, n4, array3);
            final int n5 = n4 + array3[0];
            n3 += ld;
            final int ld2 = ld(this.EO, n5, array3);
            n4 = n5 + array3[0];
            if (this.LH) {
                EO(ld2);
            }
            final XV xv = new XV(n3, ld2);
            array2[i] = xv;
            this.ld.put(((gE)this.Ux.dN(n3)).fa(false), xv);
        }
        array[0] = n4 - n2;
        return array2;
    }
    
    private AV[] ld(final int n, final int n2, final int[] array) {
        final AV[] array2 = new AV[n];
        final int[] array3 = { 0 };
        int n3 = 0;
        int n4 = n2;
        for (int i = 0; i < n; ++i) {
            final int ld = ld(this.EO, n4, array3);
            final int n5 = n4 + array3[0];
            n3 += ld;
            if (this.Hv.contains(n3)) {
                this.VX.add(n3);
            }
            else {
                this.Hv.add(n3);
            }
            final int ld2 = ld(this.EO, n5, array3);
            final int n6 = n5 + array3[0];
            final int ld3 = ld(this.EO, n6, array3);
            n4 = n6 + array3[0];
            OM hw = null;
            if (ld3 > 0) {
                hw = this.Hw(ld3);
                hw.dN(n3);
            }
            if (this.LH) {
                cb(ld2);
            }
            final AV av = new AV(n3, ld2, hw);
            array2[i] = av;
            this.dN.put(((hO)this.ZY.dN(n3)).wU(false), av);
        }
        array[0] = n4 - n2;
        return array2;
    }
    
    private OM Hw(final int n) {
        final int dn = dN(this.EO, n);
        final int dn2 = dN(this.EO, n + 2);
        final int dn3 = dN(this.EO, n + 4);
        final int dn4 = dN(this.EO, n + 6);
        final int ld = ld(this.EO, n + 8);
        final int ld2 = ld(this.EO, n + 12);
        final int n2 = n + 16;
        final int n3 = n2 + 2 * ld2;
        nm[] ms = null;
        if (dn4 > 0) {
            ms = this.mS(dn4, n3 + ((dn4 > 0 && ld2 % 2 == 1) ? 2 : 0));
        }
        oh dn5 = null;
        vD dn6 = null;
        List qe;
        try {
            dn5 = this.ci.dN(n2, 2 * ld2, ms);
            qe = dn5.QE();
            if (ld > 0) {
                dn6 = vD.dN(this.EO, ld, 0);
            }
        }
        catch (Exception ex) {
            qe = new ArrayList();
        }
        final OM om = new OM(dn, dn2, dn3, dn6, n2, 2 * ld2, qe, dn5, ms);
        this.Ee.add(om);
        return om;
    }
    
    private nm[] mS(final int n, final int n2) {
        final nm[] array = new nm[n];
        final int n3 = n2 + 8 * n;
        for (int i = 0; i < n; ++i) {
            final int ld = ld(this.EO, n2 + 8 * i);
            final int dn = dN(this.EO, n2 + 8 * i + 4);
            final int n4 = n3 + dN(this.EO, n2 + 8 * i + 6);
            final int[] array2 = { 0 };
            final int dn2 = dN(this.EO, n4, array2);
            int n5 = n4 + array2[0];
            final int n6 = (dn2 >= 0) ? dn2 : (-dn2);
            final ArrayList list = new ArrayList<bt>(n6 + 1);
            for (int j = 0; j < n6; ++j) {
                final int ld2 = ld(this.EO, n5, array2);
                final int n7 = n5 + array2[0];
                final int ld3 = ld(this.EO, n7, array2);
                n5 = n7 + array2[0];
                list.add(new bt(ld2, 2 * ld3));
            }
            if (dn2 <= 0) {
                list.add(new bt(-1, 2 * ld(this.EO, n5, array2)));
            }
            array[i] = new nm(2 * ld, 2 * dn, list);
        }
        return array;
    }
    
    public UZ zs(final boolean b) {
        if (this.LR == null || b) {
            this.LR = new UZ(this);
        }
        return this.LR;
    }
    
    public UZ ZY() {
        return this.zs(false);
    }
}
