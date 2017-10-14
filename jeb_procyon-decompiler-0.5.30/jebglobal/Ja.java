// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class Ja
{
    private short ld;
    private short QE;
    private char[] wU;
    private char[] fa;
    private byte zs;
    private byte mS;
    private short OK;
    private byte LH;
    private byte KK;
    private byte EO;
    private short cb;
    private short PF;
    private short Hw;
    private byte rK;
    private byte Ux;
    private short ZY;
    private short s;
    private short Hv;
    public final boolean dN;
    private final String VX;
    private static int ci;
    
    public Ja() {
        this.ld = 0;
        this.QE = 0;
        this.wU = new char[] { '\0', '\0' };
        this.fa = new char[] { '\0', '\0' };
        this.zs = 0;
        this.mS = 0;
        this.OK = 0;
        this.LH = 0;
        this.KK = 0;
        this.EO = 0;
        this.cb = 0;
        this.PF = 0;
        this.Hw = 0;
        this.rK = 0;
        this.Ux = 0;
        this.ZY = 0;
        this.s = 0;
        this.Hv = 0;
        this.dN = false;
        this.VX = "";
    }
    
    public Ja(final short ld, final short qe, final char[] wu, final char[] fa, byte zs, byte ms, short ok, byte lh, byte kk, final byte eo, final short cb, final short pf, final short hw, final byte rk, final byte ux, final short zy, final short s, final short hv, boolean dn) {
        if (zs < 0 || zs > 3) {
            (new Object[1])[0] = zs;
            zs = 0;
            dn = true;
        }
        if (ms < 0 || ms > 3) {
            (new Object[1])[0] = ms;
            ms = 0;
            dn = true;
        }
        if (ok < -1) {
            (new Object[1])[0] = ok;
            ok = 0;
            dn = true;
        }
        if (lh < 0 || lh > 3) {
            (new Object[1])[0] = lh;
            lh = 0;
            dn = true;
        }
        if (kk < 0 || kk > 4) {
            (new Object[1])[0] = kk;
            kk = 0;
            dn = true;
        }
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = zs;
        this.mS = ms;
        this.OK = ok;
        this.LH = lh;
        this.KK = kk;
        this.EO = eo;
        this.cb = cb;
        this.PF = pf;
        this.Hw = hw;
        this.rK = rk;
        this.Ux = ux;
        this.ZY = zy;
        this.s = s;
        this.Hv = hv;
        this.dN = dn;
        this.VX = this.ld();
    }
    
    public String dN() {
        return this.VX;
    }
    
    private String ld() {
        final StringBuilder sb = new StringBuilder();
        if (this.ld != 0) {
            sb.append("-mcc").append(String.format("%03d", this.ld));
            if (this.QE != 0) {
                sb.append("-mnc").append(this.QE);
            }
        }
        if (this.wU[0] != '\0') {
            sb.append('-').append(this.wU);
            if (this.fa[0] != '\0') {
                sb.append("-r").append(this.fa);
            }
        }
        if (this.ZY != 0) {
            sb.append("-sw").append(this.ZY).append("dp");
        }
        if (this.s != 0) {
            sb.append("-w").append(this.s).append("dp");
        }
        if (this.Hv != 0) {
            sb.append("-h").append(this.Hv).append("dp");
        }
        switch (this.rK & 0xF) {
            case 1: {
                sb.append("-small");
                break;
            }
            case 2: {
                sb.append("-normal");
                break;
            }
            case 3: {
                sb.append("-large");
                break;
            }
            case 4: {
                sb.append("-xlarge");
                break;
            }
        }
        switch (this.rK & 0x30) {
            case 32: {
                sb.append("-long");
                break;
            }
            case 16: {
                sb.append("-notlong");
                break;
            }
        }
        switch (this.zs) {
            case 1: {
                sb.append("-port");
                break;
            }
            case 2: {
                sb.append("-land");
                break;
            }
            case 3: {
                sb.append("-square");
                break;
            }
        }
        switch (this.Ux & 0xF) {
            case 3: {
                sb.append("-car");
                break;
            }
            case 2: {
                sb.append("-desk");
                break;
            }
            case 4: {
                sb.append("-television");
                break;
            }
        }
        switch (this.Ux & 0x30) {
            case 32: {
                sb.append("-night");
                break;
            }
            case 16: {
                sb.append("-notnight");
                break;
            }
        }
        switch (this.OK) {
            case 0: {
                break;
            }
            case 120: {
                sb.append("-ldpi");
                break;
            }
            case 160: {
                sb.append("-mdpi");
                break;
            }
            case 240: {
                sb.append("-hdpi");
                break;
            }
            case 320: {
                sb.append("-xhdpi");
                break;
            }
            case -1: {
                sb.append("-nodpi");
                break;
            }
            default: {
                sb.append('-').append(this.OK).append("dpi");
                break;
            }
        }
        switch (this.mS) {
            case 1: {
                sb.append("-notouch");
                break;
            }
            case 2: {
                sb.append("-stylus");
                break;
            }
            case 3: {
                sb.append("-finger");
                break;
            }
        }
        switch (this.EO & 0x3) {
            case 1: {
                sb.append("-keysexposed");
                break;
            }
            case 2: {
                sb.append("-keyshidden");
                break;
            }
            case 3: {
                sb.append("-keyssoft");
                break;
            }
        }
        switch (this.LH) {
            case 1: {
                sb.append("-nokeys");
                break;
            }
            case 2: {
                sb.append("-qwerty");
                break;
            }
            case 3: {
                sb.append("-12key");
                break;
            }
        }
        switch (this.EO & 0xC) {
            case 4: {
                sb.append("-navexposed");
                break;
            }
            case 8: {
                sb.append("-navhidden");
                break;
            }
        }
        switch (this.KK) {
            case 1: {
                sb.append("-nonav");
                break;
            }
            case 2: {
                sb.append("-dpad");
                break;
            }
            case 3: {
                sb.append("-trackball");
                break;
            }
            case 4: {
                sb.append("-wheel");
                break;
            }
        }
        if (this.cb != 0 && this.PF != 0) {
            if (this.cb > this.PF) {
                sb.append(String.format("-%dx%d", this.cb, this.PF));
            }
            else {
                sb.append(String.format("-%dx%d", this.PF, this.cb));
            }
        }
        if (this.Hw > this.QE()) {
            sb.append("-v").append(this.Hw);
        }
        if (this.dN) {
            sb.append("-ERR" + Ja.ci++);
        }
        return sb.toString();
    }
    
    private short QE() {
        if (this.ZY != 0 || this.s != 0 || this.Hv != 0) {
            return 13;
        }
        if ((this.Ux & 0x3F) != 0x0) {
            return 8;
        }
        if ((this.rK & 0x3F) != 0x0 || this.OK != 0) {
            return 4;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return this.dN().equals("") ? "[DEFAULT]" : this.dN();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && this.getClass() == o.getClass() && this.VX.equals(((Ja)o).VX);
    }
    
    @Override
    public int hashCode() {
        return 291 + this.VX.hashCode();
    }
    
    static {
        Ja.ci = 0;
    }
}
