// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Text;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.eclipse.swt.widgets.Composite;
import javax.xml.parsers.DocumentBuilderFactory;

public final class tS extends yn
{
    private DocumentBuilderFactory OK;
    private byte[] LH;
    private lX KK;
    private int EO;
    private boolean cb;
    
    public tS(final Composite composite, final yx yx) {
        super(composite, yx, yx.dN().XZ(), yx.dN().nA(), yx.dN().Ai());
        this.OK = DocumentBuilderFactory.newInstance();
    }
    
    public boolean ld(final String s) {
        try {
            this.LH = TM.LH(s);
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public boolean dN(final byte[] lh) {
        if (lh == null) {
            return false;
        }
        this.LH = lh;
        return true;
    }
    
    @Override
    public void dN(final boolean b) {
        this.EO();
        if (!this.Hw()) {
            return;
        }
        if (b) {
            this.dN(this.KK, this.zs.getTopIndex(), this.zs.getCaretOffset());
        }
        else {
            this.dN(this.KK, 0, 0);
        }
    }
    
    private boolean Hw() {
        this.EO = this.dN.dN().EO().QE(WV.zE);
        (this.KK = new lX(this.ld)).wU(this.EO);
        this.KK.ld("    ");
        this.cb = false;
        return this.rK() || this.Ux();
    }
    
    private boolean rK() {
        try {
            final Document parse = this.OK.newDocumentBuilder().parse(new ByteArrayInputStream(this.LH));
            parse.normalize();
            this.dN(parse.getDocumentElement());
            this.KK.QE();
            this.KK.wU();
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    private boolean Ux() {
        if (this.LH == null) {
            return false;
        }
        try {
            final String[] split = new String(this.LH).split("\n", -1);
            for (int length = split.length, i = 0; i < length; ++i) {
                this.KK.wU(split[i]);
                this.KK.QE();
            }
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    private void dN(final Element element) {
        if (this.cb) {
            this.KK.QE();
        }
        final String tagName = element.getTagName();
        this.KK.wU("<");
        this.KK.dN(tagName);
        final NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); ++i) {
            final Attr attr = (Attr)attributes.item(i);
            final String name = attr.getName();
            final String value = attr.getValue();
            this.KK.s();
            this.KK.wU(0);
            this.KK.dN(name, Zh.VX);
            this.KK.wU("=\"");
            this.KK.dN(value, Zh.ci);
            this.KK.wU("\"");
            this.KK.wU(this.EO);
        }
        final NodeList childNodes = element.getChildNodes();
        if (childNodes.getLength() == 0) {
            this.KK.wU(" />");
            this.cb = true;
        }
        else {
            this.KK.wU(">");
            this.cb = true;
            for (int j = 0; j < childNodes.getLength(); ++j) {
                final Node item = childNodes.item(j);
                if (item instanceof Text) {
                    final String wholeText = ((Text)item).getWholeText();
                    if (!wholeText.isEmpty()) {
                        final boolean b = wholeText.indexOf(60) >= 0 || wholeText.indexOf(38) >= 0;
                        if (b) {
                            this.KK.wU("<![CDATA[");
                        }
                        final int hw = this.KK.Hw();
                        this.KK.PF();
                        final String[] split = wholeText.split("\n", -1);
                        int n = 0;
                        final String[] array = split;
                        for (int length = array.length, k = 0; k < length; ++k) {
                            this.KK.dN(array[k], Zh.bG);
                            if (++n < split.length) {
                                this.KK.QE();
                            }
                        }
                        this.KK.mS(hw);
                        if (b) {
                            this.KK.wU("]]>");
                        }
                        this.cb = false;
                    }
                }
                else if (item instanceof Element) {
                    this.KK.rK();
                    this.dN((Element)item);
                    this.KK.Ux();
                }
                else {
                    final String[] split2 = item.toString().split("\n", -1);
                    for (int length2 = split2.length, l = 0; l < length2; ++l) {
                        this.KK.wU(split2[l]);
                        this.KK.QE();
                    }
                }
            }
            if (this.cb) {
                this.KK.QE();
            }
            this.KK.wU("</");
            this.KK.dN(tagName);
            this.KK.wU(">");
            this.cb = true;
        }
    }
}
