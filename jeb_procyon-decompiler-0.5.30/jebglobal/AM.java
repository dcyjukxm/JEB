// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.security.cert.Certificate;
import java.util.zip.ZipEntry;
import java.util.Collection;
import java.util.Enumeration;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.LinkedHashMap;
import java.util.jar.JarFile;
import java.io.File;

public class AM
{
    protected File dN;
    private JarFile ld;
    private LinkedHashMap QE;
    
    public AM(final File dn, final boolean b) {
        this.dN = dn;
        this.ld = new JarFile(dn, b);
        this.dN();
    }
    
    public AM(final String s, final boolean b) {
        this(new File(s), b);
    }
    
    private void dN() {
        this.QE = new LinkedHashMap();
        final Enumeration<JarEntry> entries = this.ld.entries();
        while (entries.hasMoreElements()) {
            final JarEntry jarEntry = entries.nextElement();
            final String name = jarEntry.getName();
            final long size = jarEntry.getSize();
            if (size > 2147483647L) {
                throw new IOException();
            }
            this.QE.put(name, new uK(name, (int)size));
        }
    }
    
    public Collection ld() {
        return this.QE.values();
    }
    
    public boolean dN(final String s) {
        final ZipEntry entry = this.ld.getEntry(s);
        return entry != null && !entry.isDirectory();
    }
    
    public byte[] ld(final String s) {
        byte[] dn = null;
        try {
            final ZipEntry entry = this.ld.getEntry(s);
            if (entry != null && !entry.isDirectory()) {
                dn = TM.dN(this.ld.getInputStream(entry));
                if (dn.length != entry.getSize()) {
                    throw new IOException();
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
        return dn;
    }
    
    public Certificate[] QE(final String s) {
        final JarEntry jarEntry = this.ld.getJarEntry(s);
        if (jarEntry == null) {
            return null;
        }
        try {
            if (TM.dN(this.ld.getInputStream(jarEntry)).length != jarEntry.getSize()) {
                throw new IOException();
            }
        }
        catch (IOException ex) {
            return null;
        }
        return jarEntry.getCertificates();
    }
    
    public static final class uK
    {
        private String dN;
        
        public uK(final String dn, final int n) {
            this.dN = dn;
        }
        
        public String dN() {
            return this.dN;
        }
    }
}
