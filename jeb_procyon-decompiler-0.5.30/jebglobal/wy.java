// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.graphics.Color;

public final class wy
{
    public Color dN;
    public Color ld;
    public boolean QE;
    public boolean wU;
    
    public wy(final Display display, final String s) {
        this.dN = null;
        this.ld = null;
        this.QE = false;
        this.wU = false;
        final String[] split = s.split(",");
        if (split.length != 4) {
            cn.dN(String.format("Invalid style data: %s", ZF.QE(s, true)));
            return;
        }
        this.dN = dN(display, split[0]);
        this.ld = dN(display, split[1]);
        this.QE = Boolean.parseBoolean(split[2]);
        this.wU = Boolean.parseBoolean(split[3]);
    }
    
    public wy(final Color dn, final Color ld, final boolean qe, final boolean wu) {
        this.dN = null;
        this.ld = null;
        this.QE = false;
        this.wU = false;
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
    }
    
    public wy(final Color dn, final Color ld) {
        this.dN = null;
        this.ld = null;
        this.QE = false;
        this.wU = false;
        this.dN = dn;
        this.ld = ld;
        this.QE = false;
        this.wU = false;
    }
    
    public wy(final Color dn) {
        this.dN = null;
        this.ld = null;
        this.QE = false;
        this.wU = false;
        this.dN = dn;
        this.ld = null;
        this.QE = false;
        this.wU = false;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", dN(this.dN), dN(this.ld), this.QE, this.wU);
    }
    
    public static String dN(final Color color) {
        if (color == null) {
            return "-1";
        }
        return String.format("%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }
    
    public static Color dN(final Display display, final String s) {
        int int1;
        try {
            int1 = Integer.parseInt(s, 16);
        }
        catch (NumberFormatException ex) {
            cn.dN(String.format("Invalid color data: %s", ZF.QE(s, true)));
            return null;
        }
        if (int1 < 0) {
            return null;
        }
        return HC.dN().dN(int1);
    }
}
