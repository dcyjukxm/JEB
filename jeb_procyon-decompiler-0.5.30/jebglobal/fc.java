// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.graphics.Color;
import java.util.HashMap;

public final class fc
{
    private HC dN;
    private wy ld;
    private wy QE;
    private HashMap wU;
    private HashMap fa;
    private Color zs;
    private Color mS;
    private Color OK;
    
    public fc(final Display display, final String s) {
        this.wU = new HashMap();
        this.fa = new HashMap();
        this.zs = null;
        this.mS = null;
        this.OK = null;
        this.dN = HC.dN();
        this.zs = display.getSystemColor(2);
        this.mS = display.getSystemColor(1);
        this.OK = this.dN.dN(230, 230, 250);
        if (s.equals("<default>")) {
            this.dN(display);
        }
        else {
            this.dN(display, s);
        }
    }
    
    private void dN(final Display display) {
        final Color systemColor = display.getSystemColor(2);
        final Color systemColor2 = display.getSystemColor(9);
        display.getSystemColor(1);
        final Color systemColor3 = display.getSystemColor(16);
        display.getSystemColor(12);
        this.dN.dN(230, 230, 250);
        final Color dn = this.dN.dN(255, 255, 128);
        final Color dn2 = this.dN.dN(63, 127, 95);
        this.dN.dN(255, 153, 0);
        final Color dn3 = this.dN.dN(209, 71, 25);
        final Color dn4 = this.dN.dN(0, 138, 0);
        final Color dn5 = this.dN.dN(127, 0, 85);
        final Color dn6 = this.dN.dN(0, 0, 85);
        final Color dn7 = this.dN.dN(192, 192, 192);
        final Color dn8 = this.dN.dN(140, 100, 255);
        this.ld = new wy(systemColor);
        this.QE = new wy(systemColor);
        this.wU.put(uK.dN, this.ld);
        this.fa.put(uK.dN, this.QE);
        this.wU.put(uK.ld, new wy(dn2));
        this.fa.put(uK.ld, new wy(dn2));
        this.wU.put(uK.QE, new wy(dn7));
        this.fa.put(uK.QE, new wy(dn7));
        this.wU.put(uK.wU, new wy(systemColor3));
        this.fa.put(uK.wU, new wy(systemColor3));
        this.wU.put(uK.fa, new wy(dn5, null, true, false));
        this.fa.put(uK.fa, new wy(dn5, null, true, false));
        this.wU.put(uK.zs, new wy(dn5, null, true, false));
        this.fa.put(uK.zs, new wy(dn5, null, true, false));
        this.wU.put(uK.mS, new wy(systemColor));
        this.fa.put(uK.mS, new wy(systemColor, dn));
        this.wU.put(uK.OK, new wy(systemColor));
        this.fa.put(uK.OK, new wy(systemColor, dn));
        this.wU.put(uK.LH, new wy(systemColor3));
        this.fa.put(uK.LH, new wy(systemColor3, dn));
        this.wU.put(uK.KK, new wy(systemColor));
        this.fa.put(uK.KK, new wy(systemColor));
        this.wU.put(uK.EO, new wy(systemColor));
        this.fa.put(uK.EO, new wy(systemColor, dn));
        this.wU.put(uK.cb, new wy(dn4, null, true, false));
        this.fa.put(uK.cb, new wy(dn4, dn, true, false));
        this.wU.put(uK.PF, new wy(dn3, null, true, false));
        this.fa.put(uK.PF, new wy(dn3, dn, true, false));
        this.wU.put(uK.Hw, new wy(dn3, null, true, false));
        this.fa.put(uK.Hw, new wy(dn3, dn, true, false));
        this.wU.put(uK.rK, new wy(systemColor2));
        this.fa.put(uK.rK, new wy(systemColor2, dn));
        this.wU.put(uK.Ux, new wy(dn6, null, false, true));
        this.fa.put(uK.Ux, new wy(dn6, dn, false, true));
        this.wU.put(uK.ZY, new wy(systemColor));
        this.fa.put(uK.ZY, new wy(systemColor, dn));
        this.wU.put(uK.s, new wy(dn8));
        this.fa.put(uK.s, new wy(dn8, dn));
        this.wU.put(uK.Hv, new wy(systemColor2));
        this.fa.put(uK.Hv, new wy(systemColor2, dn));
        this.wU.put(uK.VX, new wy(systemColor));
        this.fa.put(uK.VX, new wy(systemColor, dn));
        this.wU.put(uK.ci, new wy(dn3));
        this.fa.put(uK.ci, new wy(dn3, dn));
        this.wU.put(uK.bG, new wy(dn2));
        this.fa.put(uK.bG, new wy(dn2, dn));
    }
    
    private void dN(final Display display, final String s) {
        for (final String s2 : s.split("\\|")) {
            final String[] split2 = s2.split("=");
            Label_0275: {
                if (split2.length != 2) {
                    cn.dN(String.format("Invalid style data: %s", ZF.QE(s2, true)));
                }
                else if (split2[0].equals("FGCOLOR")) {
                    this.zs = wy.dN(display, split2[1]);
                }
                else if (split2[0].equals("BGCOLOR")) {
                    this.mS = wy.dN(display, split2[1]);
                }
                else if (split2[0].equals("CURRENT_LINE_BGCOLOR")) {
                    this.OK = wy.dN(display, split2[1]);
                }
                else {
                    uK value;
                    try {
                        value = uK.valueOf(split2[0]);
                    }
                    catch (Exception ex) {
                        cn.dN(String.format("Invalid style type: %s", ZF.QE(split2[0], true)));
                        break Label_0275;
                    }
                    final String[] split3 = split2[1].split(";");
                    if (split3.length != 2) {
                        cn.dN(String.format("Invalid style data: %s", ZF.QE(split2[1], true)));
                    }
                    else {
                        this.wU.put(value, new wy(display, split3[0]));
                        this.fa.put(value, new wy(display, split3[1]));
                    }
                }
            }
        }
        this.ld = this.wU.get(uK.dN);
        if (this.ld == null) {
            this.ld = new wy(display.getSystemColor(2));
            this.wU.put(uK.dN, this.ld);
        }
        this.QE = this.fa.get(uK.dN);
        if (this.QE == null) {
            this.QE = new wy(display.getSystemColor(2));
            this.fa.put(uK.dN, this.QE);
        }
    }
    
    public wy dN(final uK uk) {
        final wy wy = this.wU.get(uk);
        return (wy != null) ? wy : this.ld;
    }
    
    public wy ld(final uK uk) {
        final wy wy = this.fa.get(uk);
        return (wy != null) ? wy : this.QE;
    }
    
    public Color dN() {
        return this.zs;
    }
    
    public void dN(final Color ms) {
        this.mS = ms;
    }
    
    public Color ld() {
        return this.mS;
    }
    
    public void ld(final Color ok) {
        this.OK = ok;
    }
    
    public Color QE() {
        return this.OK;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("FGCOLOR=%s|BGCOLOR=%s|CURRENT_LINE_BGCOLOR=%s|", wy.dN(this.zs), wy.dN(this.mS), wy.dN(this.OK)));
        for (final uK uk : uK.values()) {
            sb.append(String.format("%s=%s;%s|", uk, this.dN(uk), this.ld(uk)));
        }
        return sb.toString();
    }
    
    public enum uK
    {
        dN("DEFAULT", 0), 
        ld("COMMENT", 1), 
        QE("ADDRESS", 2), 
        wU("BYTECODE", 3), 
        fa("DIRECTIVE", 4), 
        zs("KEYWORD", 5), 
        mS("MNEMONIC", 6), 
        OK("OPCODE", 7), 
        LH("LABEL", 8), 
        KK("PARAMETER", 9), 
        EO("IDENTIFIER", 10), 
        cb("NUMBER", 11), 
        PF("CHARACTER", 12), 
        Hw("STRING", 13), 
        rK("CLASS_NAME", 14), 
        Ux("FIELD_NAME", 15), 
        ZY("METHOD_NAME", 16), 
        s("EXTERNAL_CLASS_NAME", 17), 
        Hv("XML_ELEMENT", 18), 
        VX("XML_ATTRIBUTE_NAME", 19), 
        ci("XML_ATTRIBUTE_VALUE", 20), 
        bG("XML_TEXT", 21);
        
        private uK(final String s, final int n) {
        }
    }
}
