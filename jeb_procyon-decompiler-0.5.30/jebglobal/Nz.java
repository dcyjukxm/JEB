// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilderFactory;

public final class Nz
{
    private DocumentBuilderFactory dN;
    private HashMap ld;
    
    public Nz() {
        this.dN = DocumentBuilderFactory.newInstance();
        this.ld = new HashMap();
    }
    
    public boolean dN(final File file) {
        return this.dN(file.getAbsolutePath());
    }
    
    public boolean dN(final String uri) {
        Document parse;
        try {
            parse = this.dN.newDocumentBuilder().parse(uri);
        }
        catch (Exception ex) {
            return false;
        }
        parse.normalize();
        final Element documentElement = parse.getDocumentElement();
        if (documentElement == null || !documentElement.getTagName().equals("resources")) {
            return false;
        }
        final NodeList childNodes = documentElement.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); ++i) {
            final Node item = childNodes.item(i);
            if (item instanceof Element) {
                final Element element = (Element)item;
                if (element.getNodeName().equals("public")) {
                    try {
                        final String attribute = element.getAttribute("id");
                        int n;
                        if (attribute.startsWith("0x")) {
                            n = Integer.parseInt(attribute.substring(2), 16);
                        }
                        else {
                            n = Integer.parseInt(attribute, 10);
                        }
                        final String attribute2 = element.getAttribute("type");
                        final String attribute3 = element.getAttribute("name");
                        if (n >= 0 && attribute2.length() >= 1 && attribute3.length() >= 1) {
                            this.ld.put(n, new Xo(n, attribute2, attribute3, "'"));
                        }
                    }
                    catch (Exception ex2) {}
                }
            }
        }
        return true;
    }
    
    public Xo dN(final int n) {
        return this.ld.get(n);
    }
}
