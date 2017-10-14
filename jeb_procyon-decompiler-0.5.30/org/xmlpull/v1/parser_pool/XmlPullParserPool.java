// 
// Decompiled by Procyon v0.5.30
// 

package org.xmlpull.v1.parser_pool;

import jebglobal.iR;
import java.util.ArrayList;
import jebglobal.IL;
import java.util.List;

public class XmlPullParserPool
{
    private List dN;
    private IL ld;
    
    public XmlPullParserPool() {
        this(IL.ld());
    }
    
    public XmlPullParserPool(final IL ld) {
        this.dN = new ArrayList();
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
    }
    
    protected iR dN() {
        return this.ld.dN();
    }
    
    public iR ld() {
        iR dn = null;
        if (this.dN.size() > 0) {
            synchronized (this.dN) {
                if (this.dN.size() > 0) {
                    dn = this.dN.remove(this.dN.size() - 1);
                }
            }
        }
        if (dn == null) {
            dn = this.dN();
        }
        return dn;
    }
    
    public void dN(final iR ir) {
        if (ir == null) {
            throw new IllegalArgumentException();
        }
        synchronized (this.dN) {
            this.dN.add(ir);
        }
    }
    
    public static void main(final String[] array) {
        final XmlPullParserPool xmlPullParserPool = new XmlPullParserPool();
        final iR ld = xmlPullParserPool.ld();
        xmlPullParserPool.dN(ld);
        final iR ld2 = xmlPullParserPool.ld();
        if (ld != ld2) {
            throw new RuntimeException();
        }
        xmlPullParserPool.dN(ld2);
        System.out.println(new StringBuffer().append(xmlPullParserPool.getClass()).append(" OK").toString());
    }
}
