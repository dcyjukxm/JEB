// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;
import java.util.Locale;
import java.util.List;

public final class OX extends cI implements Xf
{
    private hV dN;
    private boolean ld;
    private byte QE;
    private char wU;
    private short fa;
    private int zs;
    private long mS;
    private float OK;
    private double LH;
    private String KK;
    private uK EO;
    
    private OX() {
        this.dN = null;
    }
    
    private OX(final boolean ld) {
        this.dN = hV.ld;
        this.ld = ld;
    }
    
    private OX(final byte qe) {
        this.dN = hV.QE;
        this.QE = qe;
    }
    
    private OX(final char wu) {
        this.dN = hV.wU;
        this.wU = wu;
    }
    
    private OX(final short fa) {
        this.dN = hV.fa;
        this.fa = fa;
    }
    
    private OX(final int zs) {
        this.dN = hV.zs;
        this.zs = zs;
    }
    
    private OX(final long ms) {
        this.dN = hV.mS;
        this.mS = ms;
    }
    
    private OX(final float ok) {
        this.dN = hV.OK;
        this.OK = ok;
    }
    
    private OX(final double lh) {
        this.dN = hV.LH;
        this.LH = lh;
    }
    
    private OX(final String kk, final hV dn) {
        this.dN = dn;
        this.KK = kk;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public hV ld() {
        return this.dN;
    }
    
    public boolean QE() {
        return this.ld;
    }
    
    public byte fa() {
        return this.QE;
    }
    
    public char zs() {
        return this.wU;
    }
    
    public short mS() {
        return this.fa;
    }
    
    public int OK() {
        return this.zs;
    }
    
    public long LH() {
        return this.mS;
    }
    
    public float KK() {
        return this.OK;
    }
    
    public double EO() {
        return this.LH;
    }
    
    public String cb() {
        return this.KK;
    }
    
    public boolean PF() {
        return this.dN == null;
    }
    
    public boolean Hw() {
        return this.dN == hV.ld && this.ld;
    }
    
    public boolean rK() {
        return this.dN == hV.ld && !this.ld;
    }
    
    public boolean Ux() {
        return (this.dN == hV.QE && this.QE == 0) || (this.dN == hV.wU && this.wU == '\0') || (this.dN == hV.fa && this.fa == 0) || (this.dN == hV.zs && this.zs == 0) || (this.dN == hV.mS && this.mS == 0L) || (this.dN == hV.OK && this.OK == 0.0f) || (this.dN == hV.LH && this.LH == 0.0);
    }
    
    public boolean ZY() {
        return (this.dN == hV.QE && this.QE == 1) || (this.dN == hV.wU && this.wU == '\u0001') || (this.dN == hV.fa && this.fa == 1) || (this.dN == hV.zs && this.zs == 1) || (this.dN == hV.mS && this.mS == 1L) || (this.dN == hV.OK && this.OK == 1.0f) || (this.dN == hV.LH && this.LH == 1.0);
    }
    
    public boolean s() {
        return (this.dN == hV.QE && this.QE == -1) || (this.dN == hV.wU && this.wU == -1) || (this.dN == hV.fa && this.fa == -1) || (this.dN == hV.zs && this.zs == -1) || (this.dN == hV.mS && this.mS == -1L) || (this.dN == hV.OK && this.OK == -1.0f) || (this.dN == hV.LH && this.LH == -1.0);
    }
    
    public boolean Hv() {
        return (this.dN == hV.QE && this.QE > 0) || (this.dN == hV.wU && this.wU > '\0') || (this.dN == hV.fa && this.fa > 0) || (this.dN == hV.zs && this.zs > 0) || (this.dN == hV.mS && this.mS > 0L) || (this.dN == hV.OK && this.OK > 0.0f) || (this.dN == hV.LH && this.LH > 0.0);
    }
    
    public boolean VX() {
        return (this.dN == hV.QE && this.QE < 0) || (this.dN == hV.wU && this.wU < '\0') || (this.dN == hV.fa && this.fa < 0) || (this.dN == hV.zs && this.zs < 0) || (this.dN == hV.mS && this.mS < 0L) || (this.dN == hV.OK && this.OK < 0.0f) || (this.dN == hV.LH && this.LH < 0.0);
    }
    
    public OX dN(final vd vd) {
        if (this.dN == hV.ld) {
            return vd.dN(!this.ld);
        }
        if (this.dN == hV.QE) {
            return vd.dN((byte)(-this.QE));
        }
        if (this.dN == hV.wU) {
            return vd.dN((char)(-this.wU));
        }
        if (this.dN == hV.fa) {
            return vd.dN((short)(-this.fa));
        }
        if (this.dN == hV.zs) {
            return vd.dN(-this.zs);
        }
        if (this.dN == hV.mS) {
            return vd.dN(-this.mS);
        }
        if (this.dN == hV.OK) {
            return vd.dN(-this.OK);
        }
        if (this.dN == hV.LH) {
            return vd.dN(-this.LH);
        }
        return null;
    }
    
    public void dN(final uK eo) {
        this.EO = eo;
    }
    
    public uK ci() {
        return this.EO;
    }
    
    private String dN(final boolean b) {
        if (this.EO == null || b) {
            return "%d";
        }
        if (this.EO == uK.ld) {
            return "%d";
        }
        if (this.EO == uK.QE) {
            return "0x%X";
        }
        if (this.EO == uK.dN) {
            return "0%o";
        }
        throw new RuntimeException();
    }
    
    @Override
    public List wU() {
        return TM.dN(new IK[0]);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.a_(zl);
        if (zl.ld && this.EO == null) {
            this.EO = uK.QE;
        }
        if (this.dN == null) {
            zl.dN(oc.Nh);
        }
        else if (this.dN.LH()) {
            zl.dN(String.format("\"%s\"", ZF.QE(this.KK, true)), Zh.Hw, this);
        }
        else if (this.dN == hV.ld) {
            zl.dN(this.ld ? oc.rn : oc.LR);
        }
        else {
            String s;
            if (this.dN == hV.QE) {
                s = String.format(this.dN(this.QE <= 9), this.QE);
            }
            else if (this.dN == hV.wU) {
                s = String.format("'%s'", ZF.dN(this.wU, true));
            }
            else if (this.dN == hV.fa) {
                s = String.format(this.dN(this.fa <= 9), this.fa);
            }
            else if (this.dN == hV.zs) {
                s = String.format(this.dN(this.zs >= 0 && this.zs <= 9), this.zs);
            }
            else if (this.dN == hV.mS) {
                s = String.format(this.dN(this.mS <= 9L), this.mS);
                if (this.mS < -2147483648L || this.mS > 2147483647L) {
                    s += "L";
                }
            }
            else {
                if (this.dN != hV.OK && this.dN != hV.LH) {
                    throw new RuntimeException();
                }
                final String format = String.format(Locale.US, "%.6f", (this.dN == hV.OK) ? this.OK : this.LH);
                int i = format.length() - 1;
                while (i >= 0) {
                    final char char1 = format.charAt(i);
                    if (char1 != '0') {
                        if (char1 != '.') {
                            ++i;
                            break;
                        }
                        break;
                    }
                    else {
                        --i;
                    }
                }
                s = format.substring(0, i);
                if (this.dN == hV.OK) {
                    s += 'f';
                }
            }
            zl.dN(s, Zh.cb, this);
        }
    }
    
    @Override
    public String toString() {
        if (this.dN == null) {
            return "null";
        }
        if (this.dN.LH()) {
            return String.format("\"%s\"", ZF.QE(this.KK, true));
        }
        if (this.dN == hV.ld) {
            return this.ld ? "true" : "false";
        }
        String s;
        if (this.dN == hV.QE) {
            s = String.format(this.dN(this.QE <= 9), this.QE);
        }
        else if (this.dN == hV.wU) {
            s = String.format("'%s'", ZF.dN(this.wU, true));
        }
        else if (this.dN == hV.fa) {
            s = String.format(this.dN(this.fa <= 9), this.fa);
        }
        else if (this.dN == hV.zs) {
            s = String.format(this.dN(this.zs >= 0 && this.zs <= 9), this.zs);
        }
        else if (this.dN == hV.mS) {
            s = String.format(this.dN(this.mS <= 9L), this.mS);
            if (this.mS < -2147483648L || this.mS > 2147483647L) {
                s += "L";
            }
        }
        else {
            if (this.dN != hV.OK && this.dN != hV.LH) {
                throw new RuntimeException();
            }
            final String format = String.format("%.6f", (this.dN == hV.OK) ? this.OK : this.LH);
            int i = format.length() - 1;
            while (i >= 0) {
                final char char1 = format.charAt(i);
                if (char1 != '0') {
                    if (char1 != '.') {
                        ++i;
                        break;
                    }
                    break;
                }
                else {
                    --i;
                }
            }
            s = format.substring(0, i);
            if (this.dN == hV.OK) {
                s += 'f';
            }
        }
        return s;
    }
    
    public static final class vd
    {
        private hV dN;
        private OX ld;
        private HashMap QE;
        private HashMap wU;
        private HashMap fa;
        private HashMap zs;
        private HashMap mS;
        private HashMap OK;
        private HashMap LH;
        private HashMap KK;
        private HashMap EO;
        
        public vd(final hV.uK uk) {
            this.dN = uk.dN("Ljava/lang/String;");
            this.ld = new OX(null);
            this.QE = new HashMap();
            this.wU = new HashMap();
            this.fa = new HashMap();
            this.zs = new HashMap();
            this.mS = new HashMap();
            this.OK = new HashMap();
            this.LH = new HashMap();
            this.KK = new HashMap();
            this.EO = new HashMap();
        }
        
        public OX dN() {
            return this.ld;
        }
        
        public OX dN(final boolean b) {
            OX ox = this.QE.get(b);
            if (ox == null) {
                ox = new OX(b, null);
                this.QE.put(b, ox);
            }
            return ox;
        }
        
        public OX dN(final byte b) {
            OX ox = this.wU.get(b);
            if (ox == null) {
                ox = new OX(b, null);
                this.wU.put(b, ox);
            }
            return ox;
        }
        
        public OX dN(final char c) {
            OX ox = this.fa.get(c);
            if (ox == null) {
                ox = new OX(c, null);
                this.fa.put(c, ox);
            }
            return ox;
        }
        
        public OX dN(final short n) {
            OX ox = this.zs.get(n);
            if (ox == null) {
                ox = new OX(n, null);
                this.zs.put(n, ox);
            }
            return ox;
        }
        
        public OX dN(final int n) {
            OX ox = this.mS.get(n);
            if (ox == null) {
                ox = new OX(n, null);
                this.mS.put(n, ox);
            }
            return ox;
        }
        
        public OX dN(final long n) {
            OX ox = this.OK.get(n);
            if (ox == null) {
                ox = new OX(n, null);
                this.OK.put(n, ox);
            }
            return ox;
        }
        
        public OX dN(final float n) {
            OX ox = this.LH.get(n);
            if (ox == null) {
                ox = new OX(n, null);
                this.LH.put(n, ox);
            }
            return ox;
        }
        
        public OX dN(final double n) {
            OX ox = this.KK.get(n);
            if (ox == null) {
                ox = new OX(n, null);
                this.KK.put(n, ox);
            }
            return ox;
        }
        
        public OX dN(final String s) {
            OX ox = this.EO.get(s);
            if (ox == null) {
                ox = new OX(s, this.dN, null);
                this.EO.put(s, ox);
            }
            return ox;
        }
    }
    
    public enum uK
    {
        dN("OCTAL", 0), 
        ld("DECIMAL", 1), 
        QE("HEXADECIMAL", 2);
        
        private uK(final String s, final int n) {
        }
    }
}
