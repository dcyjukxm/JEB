// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class xc
{
    private jt dN;
    private boolean ld;
    private String QE;
    private int wU;
    private String fa;
    private List zs;
    private boolean mS;
    private boolean OK;
    private int LH;
    private List KK;
    
    public xc(final jt dn) {
        this.KK = new ArrayList();
        this.dN = dn;
        this.ld = false;
        this.QE = "";
        this.wU = 0;
        this.fa = "";
        (this.zs = new ArrayList()).add(new uK());
        this.mS = false;
        this.OK = true;
    }
    
    public void dN(final jt dn) {
        this.dN = dn;
    }
    
    public boolean OK(final boolean b) {
        final boolean b2 = !this.OK;
        this.OK = !b;
        return b2;
    }
    
    public void wU(final int lh) {
        if (lh <= 0) {
            this.OK = true;
        }
        else {
            this.OK = false;
            this.LH = lh;
        }
    }
    
    public void wU() {
        if (!this.mS) {
            for (final uK uk : this.zs) {
                uk.dN = uk.dN.toString();
                if (uk.ld != null) {
                    uk.ld.trimToSize();
                }
            }
        }
        this.mS = true;
    }
    
    public void fa() {
        if (this.mS) {
            throw new RuntimeException();
        }
    }
    
    public boolean dN(final int n, final int n2, final String s) {
        if (n < 0 || n >= this.OK()) {
            return false;
        }
        final uK uk = this.zs.get(n);
        if (n2 < 0 || n2 >= uk.ld.size()) {
            return false;
        }
        final hv hv = uk.ld.get(n2);
        final int qe = hv.QE();
        final int ld = hv.ld();
        final int length = s.length();
        hv.dN(length);
        final int n3 = length - ld;
        for (int i = n2 + 1; i < uk.ld.size(); ++i) {
            ((hv)uk.ld.get(i)).ld(n3);
        }
        if (this.mS) {
            final String s2 = (String)uk.dN;
            uk.dN = s2.substring(0, qe) + s + s2.substring(qe + ld);
        }
        else {
            ((StringBuilder)uk.dN).replace(qe, qe + ld, s);
        }
        return true;
    }
    
    public String zs() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.OK(); ++i) {
            sb.append(((uK)this.zs.get(i)).dN);
            sb.append('\n');
        }
        sb.trimToSize();
        return sb.toString();
    }
    
    public int[] mS() {
        final int ok = this.OK();
        final int[] array = new int[ok];
        int n = 0;
        for (int i = 0; i < ok; ++i) {
            array[i] = n;
            n += ((uK)this.zs.get(i)).dN.length() + 1;
        }
        return array;
    }
    
    public List fa(final int n) {
        if (n < 0 || n >= this.OK()) {
            return null;
        }
        final uK uk = this.zs.get(n);
        return (uk != null) ? uk.ld : null;
    }
    
    public Oa zs(final int n) {
        if (n < 0 || n >= this.OK()) {
            return null;
        }
        final uK uk = this.zs.get(n);
        return (uk != null) ? uk.QE : null;
    }
    
    public int OK() {
        return this.zs.size() - 1;
    }
    
    public int LH() {
        return this.zs.size() - 1;
    }
    
    public int KK() {
        return this.zs.size() - 2;
    }
    
    private uK dN() {
        return this.zs.get(this.zs.size() - 1);
    }
    
    public void ld(final String fa) {
        this.fa = fa;
    }
    
    public void QE(final String qe) {
        this.QE = qe;
    }
    
    public void EO() {
        this.ld = true;
    }
    
    public void cb() {
        this.ld = false;
    }
    
    public void PF() {
        this.wU = 0;
    }
    
    public int Hw() {
        return this.wU;
    }
    
    public void mS(final int wu) {
        this.wU = wu;
    }
    
    public void rK() {
        ++this.wU;
    }
    
    public void Ux() {
        --this.wU;
    }
    
    public int ZY() {
        return this.dN().dN.length();
    }
    
    private boolean dN(final String s) {
        return s.equals("(") || s.equals(")") || s.equals("[") || s.equals("]") || s.equals("{") || s.equals("}") || s.equals(";") || s.equals(" ") || s.startsWith(",");
    }
    
    public void wU(String replace) {
        this.fa();
        if (replace.indexOf(10) >= 0) {
            replace = replace.replace('\n', '/');
        }
        StringBuilder sb = (StringBuilder)this.dN().dN;
        boolean b = false;
        if (!this.OK && sb.length() >= this.LH && !this.dN(replace)) {
            this.OK = true;
            this.QE();
            this.OK = false;
            sb = (StringBuilder)this.dN().dN;
            b = true;
        }
        if (sb.length() == 0) {
            if (this.ld) {
                sb.append(this.QE);
            }
            for (int i = 0; i < this.wU; ++i) {
                sb.append(this.fa);
            }
            if (b) {
                sb.append(this.fa);
                sb.append(this.fa);
            }
        }
        sb.append(replace);
    }
    
    public void s() {
        this.fa();
        this.wU(" ");
    }
    
    public void OK(final int n) {
        this.fa();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        this.wU(sb.toString());
    }
    
    public void dN(final Oa oa) {
        this.fa();
        this.dN().QE = oa;
        this.zs.add(new uK());
    }
    
    public void QE() {
        this.dN((Oa)null);
    }
    
    public void dN(final String s, final Zh zh, final int n, final Object o, final Object o2) {
        this.wU(s);
        if (this.dN == null) {
            return;
        }
        final uK dn = this.dN();
        if (dn.ld == null) {
            dn.ld = new ArrayList();
        }
        final int length = s.length();
        dn.ld.add(this.dN.dN(dn.dN.length() - length, length, zh, n, o, o2));
    }
    
    public void dN(final String s, final Zh zh, final Object o) {
        this.dN(s, zh, 0, o, null);
    }
    
    public void dN(final String s, final Zh zh) {
        this.dN(s, zh, 0, null, null);
    }
    
    public void dN(final int n, String replace) {
        if (n == this.LH()) {
            this.wU(replace);
            return;
        }
        if (replace.indexOf(10) >= 0) {
            replace = replace.replace('\n', '/');
        }
        if (n < 0 || n > this.KK()) {
            throw new RuntimeException();
        }
        final CharSequence dn = this.zs.get(n).dN;
        if (dn instanceof StringBuilder) {
            ((StringBuilder)dn).append(replace);
        }
        else {
            this.zs.get(n).dN = (Object)dn + replace;
        }
    }
    
    public void dN(final int n, final String s, final Zh zh, final int n2, final Object o, final Object o2) {
        if (n == this.LH()) {
            this.dN(s, zh, n2, o, o2);
        }
        this.dN(n, s);
        if (this.dN == null) {
            return;
        }
        final uK uk = this.zs.get(n);
        if (uk.ld == null) {
            uk.ld = new ArrayList();
        }
        final int length = s.length();
        uk.ld.add(this.dN.dN(uk.dN.length() - length, length, zh, n2, o, o2));
    }
    
    public boolean dN(final int n, final int n2) {
        if (this.OK() <= 1) {
            return false;
        }
        final int lh = this.LH();
        if (n == n2 || n < 0 || n >= lh || n2 < 0 || n2 >= lh) {
            return false;
        }
        final uK uk = this.zs.remove(n);
        if (n2 < n) {
            this.zs.add(n2, uk);
            for (final gn gn : this.KK) {
                if (gn.dN == n) {
                    gn.dN = n2;
                }
                else {
                    if (gn.dN < n2 || gn.dN >= n) {
                        continue;
                    }
                    final gn gn2 = gn;
                    ++gn2.dN;
                }
            }
        }
        else {
            this.zs.add(n2 - 1, uk);
            for (final gn gn3 : this.KK) {
                if (gn3.dN == n) {
                    gn3.dN = n2;
                }
                else {
                    if (gn3.dN <= n || gn3.dN >= n2) {
                        continue;
                    }
                    final gn gn4 = gn3;
                    --gn4.dN;
                }
            }
        }
        return true;
    }
    
    public boolean LH(final int n) {
        return this.dN(this.KK(), n);
    }
    
    public void dN(final bJ bj) {
        this.KK.add(new gn(this.LH(), this.ZY(), bj));
    }
    
    public List Hv() {
        return this.KK;
    }
    
    public static final class uK
    {
        private CharSequence dN;
        private ArrayList ld;
        private Oa QE;
        
        public uK() {
            this.dN = new StringBuilder();
            this.ld = null;
            this.QE = null;
        }
    }
}
