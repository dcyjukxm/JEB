// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;

final class Fw implements lo
{
    private HashMap dN;
    
    Fw() {
        this.dN = new HashMap();
    }
    
    @Override
    public void dN() {
        this.dN.clear();
    }
    
    @Override
    public String dN(hV qe, final int n) {
        String s = "unk";
        if (qe.dN(false)) {
            int ld = 0;
            if (qe.OK()) {
                ld = qe.ld();
                qe = qe.QE();
            }
            if (qe.fa()) {
                if (qe == hV.ld) {
                    s = "bool";
                }
                else if (qe == hV.QE) {
                    s = "b";
                }
                else if (qe == hV.wU) {
                    s = "ch";
                }
                else if (qe == hV.fa) {
                    s = "s";
                }
                else if (qe == hV.zs) {
                    s = "i";
                }
                else if (qe == hV.mS) {
                    s = "l";
                }
                else if (qe == hV.OK) {
                    s = "f";
                }
                else if (qe == hV.LH) {
                    s = "d";
                }
            }
            else if (qe.mS()) {
                final String qe2 = hV.QE(qe.dN());
                if (qe2.length() >= 3) {
                    s = qe2.substring(1, qe2.length() - 1);
                    final char char1 = s.charAt(0);
                    if (Character.isUpperCase(char1)) {
                        s = Character.toLowerCase(char1) + s.substring(1);
                    }
                }
            }
            if (ld == 1) {
                s = String.format("array_%s", s);
            }
            else if (ld >= 2) {
                s = String.format("array%d_%s", ld, s);
            }
        }
        final Integer n2 = this.dN.get(s);
        if (n2 == null) {
            this.dN.put(s, 0);
            return s;
        }
        final Integer value;
        this.dN.put(s, value = n2 + 1);
        return s + value;
    }
}
