// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public final class nh extends Cl
{
    private HashMap wU;
    private HashMap fa;
    private boolean zs;
    private HashMap mS;
    
    nh(final AR ar, final int n) {
        super(ar, n);
        this.wU = new HashMap();
        this.fa = new HashMap();
        this.mS = null;
    }
    
    vd ld(final int n) {
        return this.wU(this.dN.dN(n));
    }
    
    private vd wU(final String s) {
        if (this.zs && s.startsWith("[")) {
            throw new RuntimeException();
        }
        String s2 = null;
        if (s.endsWith(";")) {
            int n = 0;
            final int n2 = 0;
            ++n;
            char c;
            for (c = s.charAt(n2); c == '['; c = s.charAt(n++)) {}
            if (c != 'L') {
                throw new RuntimeException();
            }
            final String substring = s.substring(n - 1);
            s2 = (String)this.wU.get(substring);
            if (s2 == null) {
                s2 = substring;
                this.wU.put(s2, s2);
                this.fa.put(s2, new ArrayList());
            }
        }
        final vd vd = new vd(this.ld.size(), s, s2, (TM)null);
        this.ld.add(vd);
        this.QE.put(s, vd);
        if (s2 != null) {
            this.fa.get(s2).add(vd);
        }
        return vd;
    }
    
    void wU() {
        if (this.zs) {
            throw new RuntimeException();
        }
        this.zs = true;
        for (final String s : new String[] { "Ljava/lang/Object;", "Ljava/lang/String;", "Ljava/lang/Class;", "Ljava/lang/Enum;", "Ljava/lang/Throwable;" }) {
            if (this.dN(s) == null) {
                this.dN.fa(s);
                this.wU(s);
            }
        }
        for (final String s2 : this.wU.keySet()) {
            if (this.dN(s2) == null) {
                this.dN.fa(s2);
                this.wU(s2);
            }
        }
        this.mS = new HashMap();
        final List hw = this.dN.Hw();
        for (final yK yk : hw) {
            final int zs = yk.zs();
            final String dn = this.ld.get(zs).ld;
            final String qe = yk.QE(false);
            final String ms = yk.mS();
            if (this.mS.get(zs) == null) {
                this.mS.put(zs, new uK(ms, qe, zs));
            }
            final Iterator<vd> iterator3 = this.fa.get(dn).iterator();
            while (iterator3.hasNext()) {
                iterator3.next().fa = zs;
            }
        }
        for (final yK yk2 : hw) {
            if (!yk2.dN()) {
                continue;
            }
            final uK uk = this.mS.get(yk2.zs());
            final yK dn2 = this.dN.dN(yk2);
            if (dn2 == null) {
                continue;
            }
            final int zs2 = dn2.zs();
            final String dn3 = this.ld.get(zs2).ld;
            final String qe2 = dn2.QE(false);
            final String ms2 = dn2.mS();
            (new Object[1])[0] = dn3;
            uK uk2 = this.mS.get(zs2);
            if (uk2 == null) {
                uk2 = new uK(ms2, qe2, zs2);
                this.mS.put(zs2, uk2);
            }
            uk.dN(uk2);
            uk2.ld(uk);
        }
    }
    
    public String dN(final int n, final boolean b) {
        if (n < 0 || n >= this.ld.size()) {
            return null;
        }
        return this.ld.get(n).dN(b);
    }
    
    public int ld(final String s) {
        final vd vd = this.QE.get(s);
        if (vd == null) {
            return -1;
        }
        return vd.dN();
    }
    
    public Set fa() {
        return this.wU.keySet();
    }
    
    public String QE(final String s) {
        return this.wU.get(s);
    }
    
    final class uK
    {
        private String dN;
        private String ld;
        private int QE;
        private uK wU;
        private List fa;
        private String zs;
        
        uK(final String dn, final String ld, final int qe) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            this.wU = null;
            this.fa = new ArrayList();
            this.zs = null;
        }
        
        void dN(final uK wu) {
            this.wU = wu;
        }
        
        void ld(final uK uk) {
            this.fa.add(uk);
        }
        
        public String dN(final boolean b) {
            if (!b) {
                return ((vd)nh.this.dN(this.QE)).dN(false);
            }
            final StringBuilder sb = new StringBuilder(";");
            sb.insert(0, this.ld(true));
            sb.insert(0, this.dN());
            for (uK uk = this.wU; uk != null; uk = uk.wU) {
                sb.insert(0, "$");
                sb.insert(0, uk.ld(true));
                sb.insert(0, uk.dN());
            }
            sb.insert(0, ((vd)nh.this.dN(this.QE)).OK());
            sb.insert(0, "L");
            return sb.toString();
        }
        
        public String ld(final boolean b) {
            if (!b || this.zs == null) {
                return this.ld;
            }
            return this.zs;
        }
        
        public String dN() {
            return this.dN;
        }
        
        public boolean dN(String zs) {
            if ((zs == null && this.zs == null) || (zs != null && zs.equals(this.zs))) {
                return true;
            }
            if (zs != null && !lP.QE(zs)) {
                return false;
            }
            if (zs != null && zs.equals(this.ld(false))) {
                zs = null;
                if (this.zs == null) {
                    return true;
                }
            }
            if (zs != null) {
                final String ok = ((vd)nh.this.dN(this.QE)).OK();
                int n = 0;
                for (final vd vd : nh.this.ld) {
                    if (n++ != this.QE && vd.ld() && vd.OK().equals(ok) && vd.mS() && (zs.equals(vd.ld(false)) || zs.equals(vd.ld(true)))) {
                        return false;
                    }
                }
            }
            this.zs = zs;
            nh.this.dN.wU = null;
            nh.this.dN.QE = null;
            nh.this.dN.fa = null;
            return true;
        }
        
        public boolean ld() {
            return this.zs != null;
        }
    }
    
    public final class vd implements Oa
    {
        private final int dN;
        private final String ld;
        private final String QE;
        private int wU;
        private int fa;
        
        private vd(final int dn, final String ld, final String qe) {
            this.fa = -1;
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            int wu = 0;
            int n = 0;
            final int n2 = 0;
            ++n;
            char c;
            for (c = ld.charAt(n2); c == '['; c = ld.charAt(n++), ++wu) {}
            this.wU = wu;
            if (c == 'L') {
                if (!ld.endsWith(";")) {
                    throw new RuntimeException();
                }
                if (!ld.substring(n - 1).equals(qe)) {
                    throw new RuntimeException();
                }
            }
        }
        
        public int dN() {
            return this.dN;
        }
        
        public boolean ld() {
            return this.ld.equals(this.QE);
        }
        
        public boolean QE() {
            return this.wU >= 1;
        }
        
        public int wU() {
            return this.wU;
        }
        
        public boolean fa() {
            return this.QE == null && this.wU >= 1;
        }
        
        public String zs() {
            return this.QE;
        }
        
        public boolean mS() {
            return this.fa >= 0;
        }
        
        public String dN(final boolean b) {
            if (!b || this.QE == null) {
                return this.ld;
            }
            if (this.fa < 0) {
                return this.ld;
            }
            return this.ld.substring(0, this.ld.length() - this.QE.length()) + nh.this.mS.get(this.fa).dN(true);
        }
        
        public String OK() {
            if (!this.ld()) {
                throw new RuntimeException();
            }
            final int lastIndex = this.QE.lastIndexOf(47);
            if (lastIndex < 0) {
                return "";
            }
            return this.QE.substring(1, lastIndex + 1);
        }
        
        public String ld(final boolean b) {
            if (this.fa < 0) {
                return null;
            }
            return nh.this.mS.get(this.fa).ld(b);
        }
        
        public boolean dN(final String s) {
            return this.fa >= 0 && nh.this.mS.get(this.fa).dN(s);
        }
        
        public boolean LH() {
            return this.fa >= 0 && nh.this.mS.get(this.fa).ld();
        }
    }
}
