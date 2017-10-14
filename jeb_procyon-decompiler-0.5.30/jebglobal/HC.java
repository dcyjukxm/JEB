// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import java.io.InputStream;
import org.eclipse.swt.SWTException;
import java.io.IOException;
import org.eclipse.swt.graphics.Device;
import jeb.Launcher;
import org.eclipse.swt.graphics.Image;
import java.util.HashMap;
import org.eclipse.swt.widgets.Display;

public final class HC
{
    private static HC dN;
    private Display ld;
    private HashMap QE;
    private HashMap wU;
    private HashMap fa;
    
    public static HC dN() {
        if (HC.dN == null) {
            HC.dN = new HC();
        }
        return HC.dN;
    }
    
    private HC() {
        this.QE = new HashMap();
        this.wU = new HashMap();
        this.fa = new HashMap();
        this.ld = Display.getDefault();
    }
    
    public Image dN(final String s) {
        if (s == null) {
            return null;
        }
        Image image = this.QE.get(s);
        if (image == null) {
            final InputStream ld = Launcher.ld(s);
            if (ld != null) {
                try {
                    image = new Image((Device)this.ld, ld);
                }
                catch (SWTException ex) {
                    try {
                        ld.close();
                    }
                    catch (IOException ex2) {}
                }
                finally {
                    try {
                        ld.close();
                    }
                    catch (IOException ex3) {}
                }
            }
            this.QE.put(s, image);
        }
        return image;
    }
    
    public Image[] dN(final String... array) {
        final Image[] array2 = new Image[array.length];
        int n = 0;
        for (int length = array.length, i = 0; i < length; ++i) {
            array2[n] = this.dN(array[i]);
            ++n;
        }
        return array2;
    }
    
    public Color dN(final RGB rgb) {
        if (rgb == null) {
            return null;
        }
        Color color = this.wU.get(rgb);
        if (color == null) {
            color = new Color((Device)this.ld, rgb);
            this.wU.put(rgb, color);
        }
        return color;
    }
    
    public Color dN(final int n) {
        return this.dN(new RGB(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF));
    }
    
    public Color dN(final int n, final int n2, final int n3) {
        return this.dN(new RGB(n, n2, n3));
    }
    
    public Font dN(final FontData fontData) {
        if (fontData == null) {
            return null;
        }
        Font font = this.fa.get(fontData);
        if (font == null) {
            font = new Font((Device)this.ld, fontData);
            this.fa.put(fontData, font);
        }
        return font;
    }
    
    public Font dN(final String s, final int n, final int n2) {
        return this.dN(new FontData(s, n, n2));
    }
    
    static {
        HC.dN = null;
    }
}
