// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

public final class oH extends IW
{
    private File QE;
    
    public oH(final File qe) {
        if (!qe.isDirectory()) {
            throw new oM();
        }
        this.QE = qe;
    }
    
    @Override
    protected IW KK(final String s) {
        final File file = new File(this.cb(s));
        file.mkdir();
        return new oH(file);
    }
    
    @Override
    protected InputStream OK(final String s) {
        try {
            return new FileInputStream(this.cb(s));
        }
        catch (FileNotFoundException ex) {
            throw new oM(ex);
        }
    }
    
    @Override
    protected OutputStream LH(final String s) {
        try {
            return new FileOutputStream(this.cb(s));
        }
        catch (FileNotFoundException ex) {
            throw new oM(ex);
        }
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
        new File(this.cb(s)).delete();
    }
    
    private String cb(final String s) {
        return this.zs().getPath() + '/' + s;
    }
    
    private void fa() {
        this.dN = new LinkedHashSet();
        this.ld = new LinkedHashMap();
        final File[] listFiles = this.zs().listFiles();
        for (int i = 0; i < listFiles.length; ++i) {
            final File file = listFiles[i];
            if (file.isFile()) {
                this.dN.add(file.getName());
            }
            else {
                try {
                    this.ld.put(file.getName(), new oH(file));
                }
                catch (oM om) {}
            }
        }
    }
    
    private File zs() {
        return this.QE;
    }
}
