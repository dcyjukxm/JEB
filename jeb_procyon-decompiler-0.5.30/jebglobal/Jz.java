// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import javax.tools.JavaCompiler;
import java.net.URLClassLoader;
import java.net.URL;
import java.io.OutputStream;
import java.io.InputStream;
import javax.tools.ToolProvider;
import java.io.File;
import jeb.api.IScript;
import jeb.api.JebInstance;

public final class Jz
{
    private Fp dN;
    private eI ld;
    private JebInstance QE;
    private IScript wU;
    
    public Jz(final eI ld) {
        if (ld == null) {
            throw new RuntimeException();
        }
        this.dN = null;
        this.ld = ld;
    }
    
    public boolean dN(final String s) {
        final File file = new File(s);
        if (!file.exists()) {
            cn.dN("Script file was not found");
            return false;
        }
        final String name = file.getName();
        if (name.endsWith(".py")) {
            return this.dN(file, name.substring(0, name.length() - 3));
        }
        if (name.endsWith(".java")) {
            return this.ld(file, name.substring(0, name.length() - 5));
        }
        cn.dN("Unknown script extension, supported extensions are \".py\" and \".java\"");
        return false;
    }
    
    public boolean dN(final File file, final String s) {
        try {
            final XW xw = new XW(this.ld, file.getAbsoluteFile().getParent(), s);
            this.QE = new JebInstance(this.ld);
            this.wU = xw.dN();
            this.dN = Fp.ld;
            return true;
        }
        catch (Exception ex) {
            cn.dN(String.format("Error loading Python script:\n%s", ex.toString()));
            return false;
        }
    }
    
    public boolean ld(final File file, final String s) {
        try {
            final JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
            if (systemJavaCompiler == null) {
                cn.dN("Java scripts require the use of a JDK");
                return false;
            }
            final StringBuilder sb = new StringBuilder();
            final int run = systemJavaCompiler.run(null, null, new OF(sb), file.getAbsolutePath());
            cn.ld(sb.toString());
            if (run != 0) {
                cn.dN("There were compilation errors");
                return false;
            }
            final URLClassLoader instance = URLClassLoader.newInstance(new URL[] { file.getParentFile().toURI().toURL() });
            Class<?> forName;
            try {
                forName = Class.forName(s, true, instance);
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                cn.dN("Error loading Java script, make sure the class is not contained inside any package");
                return false;
            }
            this.QE = new JebInstance(this.ld);
            this.wU = (IScript)forName.newInstance();
            this.dN = Fp.dN;
            return run == 0;
        }
        catch (Exception ex) {
            cn.dN(String.format("Error loading Java script:\n%s", ex.toString()));
            return false;
        }
    }
    
    public boolean dN() {
        try {
            this.wU.run(this.QE);
            return true;
        }
        catch (Exception ex) {
            cn.dN(String.format("Error executing %s script:\n%s", this.dN.toString().toLowerCase(), ex.toString()));
            if (this.dN == Fp.dN) {
                for (final StackTraceElement stackTraceElement : ex.getStackTrace()) {
                    final String className = stackTraceElement.getClassName();
                    if (className.startsWith("jeb.") && !className.startsWith("jeb.api.")) {
                        break;
                    }
                    if (className.startsWith("jebglobal.")) {
                        break;
                    }
                    cn.dN(String.format("    %s", stackTraceElement));
                }
            }
            return false;
        }
    }
}
