// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class sm extends Vi implements Mt
{
    private final int ld;
    private final Integer QE;
    private final Integer wU;
    private final Boolean fa;
    
    sm(final UD ud, final int ld, final Integer qe, final Integer wu, final Boolean fa) {
        super(ud);
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
    }
    
    public String dN(final fv fv) {
        return null;
    }
    
    @Override
    public void dN(final Kf kf, final dx dx) {
        final String dn = this.dN();
        kf.ld(null, "attr");
        kf.dN(null, "name", dx.QE().fa());
        if (dn != null) {
            kf.dN(null, "format", dn);
        }
        if (this.QE != null) {
            kf.dN(null, "min", this.QE.toString());
        }
        if (this.wU != null) {
            kf.dN(null, "max", this.wU.toString());
        }
        if (this.fa != null && this.fa) {
            kf.dN(null, "localization", "suggested");
        }
        this.ld(kf, dx);
        kf.QE(null, "attr");
    }
    
    public static sm dN(final UD ud, final PS[] array, final dN dn, final cN cn) {
        final int ld = ((Vp)array[0].ld).ld();
        final int n = ld & 0xFFFF;
        Integer value = null;
        Integer value2 = null;
        Boolean value3 = null;
        int i = 0;
    Label_0160:
        for (i = 1; i < array.length; ++i) {
            switch ((int)array[i].dN) {
                case 16777217: {
                    value = ((Vp)array[i].ld).ld();
                    break;
                }
                case 16777218: {
                    value2 = ((Vp)array[i].ld).ld();
                    break;
                }
                case 16777219: {
                    value3 = (((Vp)array[i].ld).ld() != 0);
                    break;
                }
                default: {
                    break Label_0160;
                }
            }
        }
        if (i == array.length) {
            return new sm(ud, n, value, value2, value3);
        }
        final PS[] array2 = new PS[array.length - i];
        int n2 = 0;
        while (i < array.length) {
            final int intValue = (int)array[i].dN;
            cn.dN(intValue);
            array2[n2++] = new PS(dn.dN(intValue, (String)null), array[i].ld);
            ++i;
        }
        switch (ld & 0xFF0000) {
            case 65536: {
                return new jl(ud, n, value, value2, value3, array2);
            }
            case 131072: {
                return new LI(ud, n, value, value2, value3, array2);
            }
            default: {
                throw new zX();
            }
        }
    }
    
    protected void ld(final Kf kf, final dx dx) {
    }
    
    protected String dN() {
        String s = "";
        if ((this.ld & 0x1) != 0x0) {
            s += "|reference";
        }
        if ((this.ld & 0x2) != 0x0) {
            s += "|string";
        }
        if ((this.ld & 0x4) != 0x0) {
            s += "|integer";
        }
        if ((this.ld & 0x8) != 0x0) {
            s += "|boolean";
        }
        if ((this.ld & 0x10) != 0x0) {
            s += "|color";
        }
        if ((this.ld & 0x20) != 0x0) {
            s += "|float";
        }
        if ((this.ld & 0x40) != 0x0) {
            s += "|dimension";
        }
        if ((this.ld & 0x80) != 0x0) {
            s += "|fraction";
        }
        if (s.isEmpty()) {
            return null;
        }
        return s.substring(1);
    }
}
