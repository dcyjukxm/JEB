// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import jebglobal.yK;
import jebglobal.AV;
import jebglobal.XV;
import jebglobal.hO;
import jebglobal.gE;
import jebglobal.Bw;
import jebglobal.nh;
import java.util.List;
import java.util.Arrays;
import jebglobal.AR;

public class Dex
{
    public static final int ACC_PUBLIC = 1;
    public static final int ACC_PRIVATE = 2;
    public static final int ACC_PROTECTED = 4;
    public static final int ACC_STATIC = 8;
    public static final int ACC_FINAL = 16;
    public static final int ACC_SYNCHRONIZED = 32;
    public static final int ACC_VOLATILE = 64;
    public static final int ACC_BRIDGE = 64;
    public static final int ACC_TRANSIENT = 128;
    public static final int ACC_VARARGS = 128;
    public static final int ACC_NATIVE = 256;
    public static final int ACC_INTERFACE = 512;
    public static final int ACC_ABSTRACT = 1024;
    public static final int ACC_STRICT = 2048;
    public static final int ACC_SYNTHETIC = 4096;
    public static final int ACC_ANNOTATION = 8192;
    public static final int ACC_ENUM = 16384;
    public static final int ACC_CONSTRUCTOR = 65536;
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
    public static final int FLAG_CONST = 1;
    public static final int FLAG_LIBRARY = 2;
    public static final int FLAG_LIBRARY_EXT = 4;
    public static final int FLAG_ALERT = 8;
    private AR dex;
    
    public Dex(final Object o) {
        if (!(o instanceof AR)) {
            throw new RuntimeException();
        }
        this.dex = (AR)o;
    }
    
    public byte[] getData() {
        final byte[] dn = this.dex.dN();
        return Arrays.copyOf(dn, dn.length);
    }
    
    public String getString(final int n) {
        return this.dex.dN(n);
    }
    
    public List getStrings() {
        return this.dex.wU();
    }
    
    public int getStringCount() {
        return this.dex.ld();
    }
    
    public int getDexStringCount() {
        return this.dex.QE();
    }
    
    public boolean setString(final int n, final String s) {
        return this.dex.dN(n, s);
    }
    
    public String getType(final int n) {
        return this.getType(n, true);
    }
    
    public String getType(final int n, final boolean b) {
        final nh.vd qe = this.dex.QE(n);
        return (qe == null) ? null : qe.dN(b);
    }
    
    public int getTypeCount() {
        return this.dex.mS().dN();
    }
    
    public int getDexTypeCount() {
        return this.dex.mS().ld();
    }
    
    public DexPrototype getPrototype(final int n) {
        final Bw wu = this.dex.wU(n);
        if (wu == null) {
            return null;
        }
        return new DexPrototype(wu);
    }
    
    public int getPrototypeCount() {
        return this.dex.OK();
    }
    
    public DexField getField(final int n) {
        final gE fa = this.dex.fa(n);
        if (fa == null) {
            return null;
        }
        return new DexField(fa);
    }
    
    public int getFieldCount() {
        return this.dex.LH();
    }
    
    public DexMethod getMethod(final int n) {
        final hO ms = this.dex.mS(n);
        if (ms == null) {
            return null;
        }
        return new DexMethod(ms);
    }
    
    public int getMethodCount() {
        return this.dex.EO();
    }
    
    public DexFieldData getFieldData(final String s) {
        final XV ld = this.dex.ld(s);
        if (ld == null) {
            return null;
        }
        return new DexFieldData(ld);
    }
    
    public DexMethodData getMethodData(final String s) {
        final AV wu = this.dex.wU(s);
        if (wu == null) {
            return null;
        }
        return new DexMethodData(wu);
    }
    
    public DexClass getClass(final int n) {
        final yK ok = this.dex.OK(n);
        if (ok == null) {
            return null;
        }
        return new DexClass(ok);
    }
    
    public DexClass getClass(final String s) {
        final yK cb = this.dex.cb(s);
        if (cb == null) {
            return null;
        }
        return new DexClass(cb);
    }
    
    public int getClassCount() {
        return this.dex.PF();
    }
    
    public List getClassSignatures(final boolean b) {
        final ArrayList<String> list = new ArrayList<String>(this.dex.Hw().size());
        final Iterator<yK> iterator = this.dex.Hw().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().ld(b));
        }
        return list;
    }
    
    public List getMethodSignatures(final boolean b) {
        final ArrayList<String> list = new ArrayList<String>(this.dex.cb().size());
        final Iterator<hO> iterator = this.dex.cb().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().wU(b));
        }
        return list;
    }
    
    public List getFieldSignatures(final boolean b) {
        final ArrayList<String> list = new ArrayList<String>(this.dex.KK().size());
        final Iterator<gE> iterator = this.dex.KK().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().fa(b));
        }
        return list;
    }
    
    public Set getConstants() {
        return new HashSet(this.dex.fa());
    }
    
    public List getTypeReferences(final int n) {
        return this.offsetsToMethods(this.dex.zs().dN().get(n));
    }
    
    public List getFieldReferences(final int n) {
        return this.offsetsToMethods(this.dex.zs().ld().get(n));
    }
    
    public List getMethodReferences(final int n) {
        return this.offsetsToMethods(this.dex.zs().QE().get(n));
    }
    
    private List offsetsToMethods(final List list) {
        if (list == null) {
            return null;
        }
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            final hO lh = this.dex.LH(iterator.next());
            if (lh != null) {
                list2.add(lh.dN());
            }
        }
        return list2;
    }
    
    public int addString(final String s) {
        return this.dex.fa(s);
    }
    
    public int addType(final String s) {
        final nh.vd zs = this.dex.zs(s);
        if (zs == null) {
            throw new IllegalArgumentException();
        }
        return zs.dN();
    }
    
    public DexField addFieldReference(final String s) {
        final gE lh = this.dex.LH(s);
        if (lh == null) {
            return null;
        }
        return new DexField(lh);
    }
    
    public DexMethod addMethodReference(final String s) {
        final hO ok = this.dex.OK(s);
        if (ok == null) {
            return null;
        }
        return new DexMethod(ok);
    }
}
