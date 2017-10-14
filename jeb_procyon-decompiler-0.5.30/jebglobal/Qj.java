// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import jeb.Launcher;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;

public final class Qj
{
    public static boolean dN;
    
    public LP dN(final vl vl) {
        final LP lp = new LP(this);
        this.dN(lp, vl);
        return lp;
    }
    
    public cN dN(final LP lp, final vl vl) {
        final cN[] dn = this.dN(vl, lp, Qj.dN);
        cN cn = null;
        switch (dn.length) {
            case 1: {
                cn = dn[0];
                break;
            }
            case 2: {
                if (dn[0].zs().equals("android")) {
                    cn = dn[1];
                    break;
                }
                break;
            }
        }
        if (cn == null) {
            throw new zX();
        }
        lp.dN(cn, true);
        return cn;
    }
    
    public cN dN(final LP lp, final int n, final String s) {
        final cN[] dn = this.dN(new vl(this.dN(n, s)), lp, true);
        if (dn.length != 1) {
            throw new zX();
        }
        final cN cn = dn[0];
        if (cn.fa() != n) {
            throw new zX();
        }
        lp.dN(cn, false);
        return cn;
    }
    
    public void dN(final LP lp, final vl vl, final File file) {
        final PS dn = this.dN();
        final xp xp = (xp)dn.dN;
        final wb ld = ((zB)dn.ld).ld();
        lp.dN();
        ld.dN(lp.dN().iterator().next());
        Sj fa = null;
        Sj zs;
        try {
            final Sj dn2 = vl.dN();
            final oH oh = new oH(file);
            xp.dN(dn2, "AndroidManifest.xml", oh, "AndroidManifest.xml", "xml");
            if (dn2.ld("res")) {
                fa = dn2.fa("res");
            }
            zs = oh.zs("res");
        }
        catch (oM om) {
            throw new zX(om);
        }
        final SG ld2 = this.ld();
        for (final cN cn : lp.dN()) {
            ld.dN(cn);
            final Iterator iterator2 = cn.ld().iterator();
            while (iterator2.hasNext()) {
                xp.dN(iterator2.next(), fa, zs);
            }
            final Iterator iterator3 = cn.QE().iterator();
            while (iterator3.hasNext()) {
                this.dN(iterator3.next(), zs, ld2);
            }
            this.dN(cn, zs, ld2);
        }
        final zX dn3 = ((zB)dn.ld).dN();
        if (dn3 != null) {
            throw dn3;
        }
    }
    
    public PS dN() {
        final Bl bl = new Bl();
        bl.dN("raw", new aN());
        bl.dN("9patch", new Lw());
        final zB zb = new zB();
        zb.dN(new wb());
        bl.dN("xml", new jq(zb, this.ld()));
        return new PS(new xp(bl), zb);
    }
    
    public SG ld() {
        final SG sg = new SG();
        sg.dN("http://xmlpull.org/v1/doc/properties.html#serializer-indentation", (Object)"    ");
        sg.dN("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", (Object)System.getProperty("line.separator"));
        sg.dN("DEFAULT_ENCODING", (Object)"utf-8");
        sg.dN(true);
        return sg;
    }
    
    private void dN(final Ug ug, final Sj sj, final ZJ zj) {
        try {
            final OutputStream wu = sj.wU(ug.dN());
            zj.dN(wu, null);
            zj.dN(null, (Boolean)null);
            zj.ld(null, "resources");
            for (final dx dx : ug.ld()) {
                if (ug.dN(dx)) {
                    continue;
                }
                ((Mt)dx.wU()).dN(zj, dx);
            }
            zj.QE(null, "resources");
            zj.dN();
            zj.mS();
            zj.KK();
            wu.close();
        }
        catch (IOException ex) {
            throw new zX();
        }
        catch (oM om) {
            throw new zX();
        }
    }
    
    private void dN(final cN cn, final Sj sj, final Kf kf) {
        try {
            final OutputStream wu = sj.wU("values/public.xml");
            kf.dN(wu, null);
            kf.dN(null, (Boolean)null);
            kf.ld(null, "resources");
            for (final UW uw : cn.dN()) {
                kf.ld(null, "public");
                kf.dN(null, "type", uw.mS().dN());
                kf.dN(null, "name", uw.fa());
                kf.dN(null, "id", String.format("0x%08x", uw.wU().ld));
                kf.QE(null, "public");
            }
            kf.QE(null, "resources");
            kf.mS();
            kf.KK();
            wu.close();
        }
        catch (IOException ex) {
            throw new zX();
        }
        catch (oM om) {
            throw new zX();
        }
    }
    
    private cN[] dN(final vl vl, final LP lp, final boolean b) {
        try {
            InputStream inputStream;
            if (vl.dN().dN("resources.arsc")) {
                inputStream = vl.dN().QE("resources.arsc");
            }
            else {
                inputStream = Launcher.ld("android-resources-empty.arsc");
            }
            return aa.dN(inputStream, false, b, lp).dN();
        }
        catch (oM om) {
            throw new zX();
        }
    }
    
    public File dN(final int n, final String s) {
        final File file = new File(eI.OK(), "frameworks");
        if (!file.isDirectory()) {
            TM.zs(file.getAbsolutePath());
        }
        final File file2 = new File(file, String.format("%d.apk", n));
        final File dn = Launcher.dN("android-resources-v19.zip");
        if (file2.exists() && file2.length() == dn.length()) {
            return file2;
        }
        if (n == 1) {
            final InputStream ld = Launcher.ld("android-resources-v19.zip");
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file2, false);
            }
            catch (FileNotFoundException ex) {
                throw new zX(ex);
            }
            try {
                Br.dN(ld, fileOutputStream);
                return file2;
            }
            catch (IOException ex2) {
                throw new zX(ex2);
            }
            finally {
                if (ld != null) {
                    try {
                        ld.close();
                    }
                    catch (IOException ex3) {}
                }
                try {
                    fileOutputStream.close();
                }
                catch (IOException ex4) {}
            }
        }
        throw new cL(n);
    }
    
    static {
        Qj.dN = false;
    }
}
