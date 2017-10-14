// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;

public enum HJ
{
    fa("UNKNOWN", 0), 
    dN("TEXT", 1), 
    ld("HTML", 2), 
    QE("XML", 3), 
    wU("IMAGE", 4), 
    zs("AUDIO", 5), 
    mS("VIDEO", 6);
    
    private HJ(final String s, final int n) {
    }
    
    public static HJ dN(final String s) {
        String substring = null;
        final String lowerCase = s.toLowerCase();
        final int lastIndex = lowerCase.lastIndexOf(46);
        if (lastIndex >= 0) {
            substring = lowerCase.substring(lastIndex + 1);
        }
        HJ hj = HJ.fa;
        if (substring != null) {
            if (substring.equals("xml")) {
                hj = HJ.QE;
            }
            else if (substring.equals("txt") || substring.equals("csv")) {
                hj = HJ.dN;
            }
            else if (substring.equals("html") || substring.equals("htm")) {
                hj = HJ.ld;
            }
            else if (substring.equals("png") || substring.equals("gif") || substring.equals("jpg") || substring.equals("jpeg") || substring.equals("bmp") || substring.equals("tif") || substring.equals("tiff") || substring.equals("ico")) {
                hj = HJ.wU;
            }
            else if (substring.equals("wav") || substring.equals("mp3")) {
                hj = HJ.zs;
            }
        }
        if (hj == HJ.fa) {
            final int kk = TM.KK(s);
            if (kk != 0 && (kk & 0x80808080) == 0x0) {
                try {
                    if (dN(TM.LH(s))) {
                        hj = HJ.dN;
                    }
                }
                catch (IOException ex) {}
            }
        }
        return hj;
    }
    
    private static boolean dN(final byte[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] <= 0) {
                return false;
            }
        }
        return true;
    }
}
