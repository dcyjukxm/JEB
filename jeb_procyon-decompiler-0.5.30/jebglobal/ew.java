// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.io.File;

public final class ew
{
    private static final long LK = 844563159190538443L;
    private File dN;
    private UB ld;
    private boolean QE;
    private int wU;
    private boolean fa;
    private boolean zs;
    private HashMap mS;
    private HashMap OK;
    private OD LH;
    private HashMap KK;
    private HashMap EO;
    private HashMap cb;
    private HashMap PF;
    
    public ew(final String s) {
        this.QE = false;
        this.wU = -1;
        this.fa = true;
        this.zs = true;
        this.mS = new HashMap();
        this.OK = new HashMap();
        this.KK = new HashMap();
        this.EO = new HashMap();
        this.cb = new HashMap();
        this.PF = new HashMap();
        this.dN = new File(s);
        this.ld = this.cb();
        final Ji wu = this.wU();
        if (wu == null) {
            throw new IOException();
        }
        if (eI.dN.dN(new wk(wu.dN, wu.ld, wu.QE)) >= 0) {
            return;
        }
        throw new IOException();
    }
    
    public ew() {
        this.QE = false;
        this.wU = -1;
        this.fa = true;
        this.zs = true;
        this.mS = new HashMap();
        this.OK = new HashMap();
        this.KK = new HashMap();
        this.EO = new HashMap();
        this.cb = new HashMap();
        this.PF = new HashMap();
        this.dN = null;
        this.ld = new UB(-2143140790);
    }
    
    public void dN(final File dn) {
        this.dN = dn;
        this.QE = true;
    }
    
    public String dN() {
        if (this.dN == null) {
            return null;
        }
        return this.dN.getAbsolutePath();
    }
    
    public void dN(final boolean zs) {
        this.zs = zs;
    }
    
    private UB cb() {
        final OZ oz = new OZ(new FileInputStream(this.dN));
        final UB dn = UB.dN(oz);
        oz.dN();
        if (dn.dN() != -2143140790) {
            throw new IOException();
        }
        return dn;
    }
    
    public boolean ld() {
        try {
            if (this.QE) {
                final FileOutputStream fileOutputStream = new FileOutputStream(this.dN, false);
                fileOutputStream.write(this.ld.zs());
                fileOutputStream.close();
                this.QE = false;
            }
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    UB dN(final UB ub, final UB ub2) {
        ub.dN(ub2);
        this.QE = true;
        return ub2;
    }
    
    boolean ld(final UB ub, final UB ub2) {
        return this.QE = ub.ld(ub2);
    }
    
    public boolean dN(final String s) {
        if (this.ld.dN(4606278, false) != null) {
            return false;
        }
        try {
            this.dN(this.ld, new k(s, TM.LH(s), false));
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public k QE() {
        final UB dn = this.ld.dN(4606278, false);
        if (dn == null) {
            return null;
        }
        return (k)dn;
    }
    
    public boolean dN(final int dn, final int ld, final int qe) {
        final UB dn2 = this.ld.dN(5391702, false);
        if (dn2 == null) {
            this.dN(this.ld, new Ji(dn, ld, qe));
            return true;
        }
        final Ji ji = (Ji)dn2;
        if ((dn > ji.dN || (dn == ji.dN && ld > ji.ld)) && qe > ji.QE) {
            ji.dN = dn;
            ji.ld = ld;
            ji.QE = qe;
            return this.QE = true;
        }
        return false;
    }
    
    public Ji wU() {
        final UB dn = this.ld.dN(5391702, false);
        if (dn == null) {
            return null;
        }
        return (Ji)dn;
    }
    
    public void dN(final long n, final String s, final String s2) {
        UB ub = this.ld.dN(-2142481087, false);
        if (ub == null) {
            ub = this.dN(this.ld, new UB(-2142481087));
        }
        int n2 = 0;
        for (final UB ub2 : ub.fa()) {
            if (ub2.dN() != 5526849) {
                throw new RuntimeException();
            }
            if (((kM)ub2).dN == n) {
                this.wU = n2;
                return;
            }
            ++n2;
        }
        final kM km = new kM(n, s, s2);
        km.dN(this.fa);
        this.dN(ub, km);
        this.wU = n2;
    }
    
    public int fa() {
        final UB dn = this.ld.dN(-2142481087, false);
        if (dn == null) {
            return 0;
        }
        return dn.fa().size();
    }
    
    public kM dN(final int n) {
        final UB dn = this.ld.dN(-2142481087, false);
        if (dn == null || n < 0 || n >= dn.fa().size()) {
            return null;
        }
        return (kM)dn.fa().get(n);
    }
    
    public boolean dN(final String s, final byte[] array) {
        UB ub = this.ld.dN(-2142484154, false);
        if (ub == null) {
            ub = this.dN(this.ld, new UB(-2142484154));
        }
        for (final UB ub2 : ub.fa()) {
            if (ub2.dN() != 4541510) {
                throw new RuntimeException();
            }
            if (((CH)ub2).dN.equals(s)) {
                return false;
            }
        }
        final CH ch = new CH(s, array);
        ch.dN(this.fa);
        ch.ld(this.zs);
        this.dN(ub, ch);
        return true;
    }
    
    public byte[] ld(final String s) {
        final UB dn = this.ld.dN(-2142484154, false);
        if (dn == null) {
            return null;
        }
        for (final UB ub : dn.fa()) {
            if (ub.dN() != 4541510) {
                throw new RuntimeException();
            }
            if (((CH)ub).dN.equals(s)) {
                return ((CH)ub).ld;
            }
        }
        return null;
    }
    
    public List zs() {
        final UB dn = this.ld.dN(-2142485931, false);
        if (dn == null) {
            return null;
        }
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (final UB ub : dn.fa()) {
            if (ub.dN() != 4932181) {
                throw new RuntimeException();
            }
            list.add(((Bb)ub).dN);
        }
        return list;
    }
    
    public byte[] ld(final int n) {
        final UB dn = this.ld.dN(-2142485931, false);
        if (dn == null) {
            return null;
        }
        for (final UB ub : dn.fa()) {
            if (ub.dN() != 4932181) {
                throw new RuntimeException();
            }
            if (((Bb)ub).dN == n) {
                return ((Bb)ub).ld;
            }
        }
        return null;
    }
    
    public boolean dN(final int n, final byte[] ld, final boolean b) {
        UB ub = this.ld.dN(-2142485931, false);
        if (ub == null) {
            ub = this.dN(this.ld, new UB(-2142485931));
        }
        for (final UB ub2 : ub.fa()) {
            if (ub2.dN() != 4932181) {
                throw new RuntimeException();
            }
            if (((Bb)ub2).dN != n) {
                continue;
            }
            if (!b) {
                return false;
            }
            ((Bb)ub2).ld = ld;
            return this.QE = true;
        }
        final Bb bb = new Bb(n, ld);
        bb.dN(this.fa);
        bb.ld(this.zs);
        this.dN(ub, bb);
        return true;
    }
    
    public boolean QE(final int n) {
        final UB dn = this.ld.dN(-2142485931, false);
        if (dn == null) {
            return false;
        }
        UB ub = null;
        for (final UB ub2 : dn.fa()) {
            if (ub2.dN() != 4932181) {
                throw new RuntimeException();
            }
            if (((Bb)ub2).dN == n) {
                ub = ub2;
                break;
            }
        }
        return ub != null && this.ld(dn, ub);
    }
    
    public List mS() {
        final UB dn = this.ld.dN(-2142482871, false);
        if (dn == null) {
            return null;
        }
        final ArrayList<u> list = new ArrayList<u>();
        for (final UB ub : dn.fa()) {
            if (ub instanceof u) {
                list.add((u)ub);
            }
        }
        return list;
    }
    
    public boolean dN(final u.uK uk, final int n, final int n2, final int n3, final String s) {
        UB ub = this.ld.dN(-2142482871, false);
        if (ub == null) {
            ub = this.dN(this.ld, new UB(-2142482871));
        }
        u u = null;
        for (final UB ub2 : ub.fa()) {
            if (ub2 instanceof u) {
                final u u2 = (u)ub2;
                if (u2.KK() != uk || u2.EO() != n || u2.cb() != n2 || u2.PF() != n3) {
                    continue;
                }
                u = u2;
            }
        }
        if (u != null) {
            if (s == null) {
                u.QE(false);
            }
            else {
                u.dN(s, this.wU);
                u.QE(true);
            }
            this.QE = true;
        }
        else {
            if (s == null) {
                return false;
            }
            final u u3 = new u(uk, n, s, n2, n3, this.wU);
            this.dN(ub, u3);
            switch (ew$1.dN[u3.KK().ordinal()]) {
                case 1: {
                    this.mS.put(this.wU(u3.EO(), u3.cb()), u3);
                    break;
                }
                case 2: {
                    final long wu = this.wU(u3.EO(), u3.cb());
                    List<u> list = this.OK.get(wu);
                    if (list == null) {
                        list = new ArrayList<u>();
                        this.OK.put(wu, list);
                    }
                    boolean b = false;
                    for (int i = 0; i < list.size(); ++i) {
                        if (list.get(i).PF() == n3) {
                            list.set(i, u3);
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        list.add(u3);
                        break;
                    }
                    break;
                }
            }
        }
        return true;
    }
    
    public void OK() {
        this.mS.clear();
        this.OK.clear();
        final List ms = this.mS();
        if (ms == null) {
            return;
        }
        for (final u u : ms) {
            switch (ew$1.dN[u.KK().ordinal()]) {
                case 1: {
                    this.mS.put(this.wU(u.EO(), u.cb()), u);
                    continue;
                }
                case 2: {
                    final long wu = this.wU(u.EO(), u.cb());
                    List<u> list = this.OK.get(wu);
                    if (list == null) {
                        list = new ArrayList<u>();
                        this.OK.put(wu, list);
                    }
                    list.add(u);
                    continue;
                }
            }
        }
    }
    
    public u dN(final int n, final int n2) {
        return this.mS.get(this.wU(n, n2));
    }
    
    public List ld(final int n, final int n2) {
        return this.OK.get(this.wU(n, n2));
    }
    
    public ArrayList LH() {
        final UB dn = this.ld.dN(-2142483133, false);
        if (dn == null) {
            return null;
        }
        final ArrayList<OD> list = new ArrayList<OD>();
        for (final UB ub : dn.fa()) {
            if (ub instanceof OD) {
                list.add((OD)ub);
            }
        }
        return list;
    }
    
    public boolean dN(final OD.vd vd, final int n, final int n2, final String s, final byte[] array) {
        UB ub = this.ld.dN(-2142483133, false);
        if (ub == null) {
            ub = this.dN(this.ld, new UB(-2142483133));
        }
        OD od = null;
        for (final UB ub2 : ub.fa()) {
            if (ub2 instanceof OD) {
                final OD od2 = (OD)ub2;
                if (od2.LH() != vd || od2.KK() != n || od2.EO() != n2) {
                    continue;
                }
                od = od2;
            }
        }
        if (od != null) {
            od.dN(s, this.wU);
            od.dN(array, this.wU);
            this.QE = true;
        }
        else {
            final OD lh = new OD(vd, n, n2, s, array, this.wU);
            lh.dN(this.fa);
            lh.ld(this.zs);
            this.dN(ub, lh);
            switch (ew$1.ld[lh.LH().ordinal()]) {
                case 1: {
                    this.LH = lh;
                    break;
                }
                case 2: {
                    this.KK.put(n, lh);
                    break;
                }
                case 3: {
                    this.EO.put(n, lh);
                    break;
                }
                case 4: {
                    this.cb.put(n, lh);
                    break;
                }
                case 5: {
                    this.PF.put(this.wU(n, n2), lh);
                    break;
                }
            }
        }
        return true;
    }
    
    public void KK() {
        this.LH = null;
        this.KK.clear();
        this.EO.clear();
        this.cb.clear();
        this.PF.clear();
        final ArrayList lh = this.LH();
        if (lh == null) {
            return;
        }
        for (final OD lh2 : lh) {
            switch (ew$1.ld[lh2.LH().ordinal()]) {
                case 1: {
                    this.LH = lh2;
                    continue;
                }
                case 2: {
                    this.KK.put(lh2.KK(), lh2);
                    continue;
                }
                case 3: {
                    this.EO.put(lh2.KK(), lh2);
                    continue;
                }
                case 4: {
                    this.cb.put(lh2.KK(), lh2);
                    continue;
                }
                case 5: {
                    this.PF.put(this.wU(lh2.KK(), lh2.EO()), lh2);
                    continue;
                }
            }
        }
    }
    
    public OD EO() {
        return this.LH;
    }
    
    public OD wU(final int n) {
        return this.KK.get(n);
    }
    
    public OD fa(final int n) {
        return this.EO.get(n);
    }
    
    public OD zs(final int n) {
        return this.cb.get(n);
    }
    
    public OD QE(final int n, final int n2) {
        return this.PF.get(this.wU(n, n2));
    }
    
    private long wU(final int n, final int n2) {
        return n << 32 | (n2 & 0xFFFFFFFFL);
    }
}
