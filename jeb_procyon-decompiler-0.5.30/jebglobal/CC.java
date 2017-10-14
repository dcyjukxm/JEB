// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import java.util.zip.ZipFile;

public final class CC extends IW
{
    private ZipFile QE;
    private String wU;
    
    public CC(final File file) {
        this(file, "");
    }
    
    public CC(final File file, final String wu) {
        try {
            this.QE = new ZipFile(file);
        }
        catch (IOException ex) {
            throw new oM(ex);
        }
        this.wU = wu;
    }
    
    public CC(final ZipFile qe, final String wu) {
        this.QE = qe;
        this.wU = wu;
    }
    
    @Override
    protected IW KK(final String s) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected InputStream OK(final String s) {
        try {
            return this.mS().getInputStream(new ZipEntry(this.zs() + s));
        }
        catch (IOException ex) {
            throw new By(s, ex);
        }
    }
    
    @Override
    protected OutputStream LH(final String s) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void wU() {
        this.fa();
    }
    
    @Override
    protected void QE() {
        this.fa();
    }
    
    @Override
    protected void EO(final String s) {
        throw new UnsupportedOperationException();
    }
    
    private void fa() {
        this.dN = new LinkedHashSet();
        this.ld = new LinkedHashMap();
        final int length = this.zs().length();
        final Enumeration<? extends ZipEntry> entries = this.mS().entries();
        while (entries.hasMoreElements()) {
            final ZipEntry zipEntry = (ZipEntry)entries.nextElement();
            final String name = zipEntry.getName();
            if (!name.equals(this.zs())) {
                if (!name.startsWith(this.zs())) {
                    continue;
                }
                String s = name.substring(length);
                final int index = s.indexOf(47);
                if (index == -1) {
                    if (!zipEntry.isDirectory()) {
                        this.dN.add(s);
                        continue;
                    }
                }
                else {
                    s = s.substring(0, index);
                }
                if (this.ld.containsKey(s)) {
                    continue;
                }
                this.ld.put(s, new CC(this.mS(), this.zs() + s + '/'));
            }
        }
    }
    
    private String zs() {
        return this.wU;
    }
    
    private ZipFile mS() {
        return this.QE;
    }
}
