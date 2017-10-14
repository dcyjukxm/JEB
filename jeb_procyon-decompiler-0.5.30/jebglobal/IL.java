// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public final class IL
{
    private static Class dN;
    private Vector ld;
    private String QE;
    private Hashtable wU;
    
    protected IL() {
        this.wU = new Hashtable();
    }
    
    public iR dN() {
        if (this.ld == null) {
            throw new lb(new StringBuffer().append("Factory initialization was incomplete - has not tried ").append(this.QE).toString());
        }
        if (this.ld.size() == 0) {
            throw new lb(new StringBuffer().append("No valid parser classes found in ").append(this.QE).toString());
        }
        final StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < this.ld.size()) {
            final Class<iR> clazz = this.ld.elementAt(i);
            try {
                final iR ir = clazz.newInstance();
                final Enumeration<String> keys = this.wU.keys();
                while (keys.hasMoreElements()) {
                    final String s = keys.nextElement();
                    final Boolean b = this.wU.get(s);
                    if (b != null && b) {
                        ir.dN(s, true);
                    }
                }
                return ir;
            }
            catch (Exception ex) {
                sb.append(new StringBuffer().append(clazz.getName()).append(": ").append(ex.toString()).append("; ").toString());
                ++i;
                continue;
            }
            break;
        }
        throw new lb(new StringBuffer().append("could not create parser: ").append((Object)sb).toString());
    }
    
    public static IL ld() {
        return dN(null, null);
    }
    
    public static IL dN(String string, Class dn) {
        if (dn == null) {
            dn = IL.dN;
        }
        String qe = null;
        Label_0169: {
            if (string != null && string.length() != 0) {
                if (!"DEFAULT".equals(string)) {
                    qe = new StringBuffer().append("parameter classNames to newInstance() that contained '").append(string).append("'").toString();
                    break Label_0169;
                }
            }
            try {
                final InputStream resourceAsStream = dn.getResourceAsStream("/META-INF/services/org.xmlpull.v1.XmlPullParserFactory");
                if (resourceAsStream == null) {
                    throw new lb("resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available");
                }
                final StringBuffer sb = new StringBuffer();
                while (true) {
                    final int read = resourceAsStream.read();
                    if (read < 0) {
                        break;
                    }
                    if (read <= 32) {
                        continue;
                    }
                    sb.append((char)read);
                }
                resourceAsStream.close();
                string = sb.toString();
            }
            catch (Exception ex) {
                throw new lb(null, null, ex);
            }
            qe = new StringBuffer().append("resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '").append(string).append("'").toString();
        }
        IL il = null;
        final Vector<Class<Object>> ld = new Vector<Class<Object>>();
        final Vector<Class<Object>> vector = new Vector<Class<Object>>();
        int n;
        for (int i = 0; i < string.length(); i = n + 1) {
            n = string.indexOf(44, i);
            if (n == -1) {
                n = string.length();
            }
            final String substring = string.substring(i, n);
            Class<?> forName = null;
            Object instance = null;
            try {
                forName = Class.forName(substring);
                instance = forName.newInstance();
            }
            catch (Exception ex2) {}
            if (forName != null) {
                boolean b = false;
                if (instance instanceof iR) {
                    ld.addElement((Class<Object>)forName);
                    b = true;
                }
                if (instance instanceof Kf) {
                    vector.addElement((Class<Object>)forName);
                    b = true;
                }
                if (instance instanceof IL) {
                    if (il == null) {
                        il = (IL)instance;
                    }
                    b = true;
                }
                if (!b) {
                    throw new lb(new StringBuffer().append("incompatible class: ").append(substring).toString());
                }
            }
        }
        if (il == null) {
            il = new IL();
        }
        il.ld = ld;
        il.QE = qe;
        return il;
    }
    
    static {
        IL.dN = new IL().getClass();
    }
}
