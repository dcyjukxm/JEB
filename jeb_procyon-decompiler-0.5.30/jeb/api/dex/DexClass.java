// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import jebglobal.xd;
import jebglobal.ub;
import java.util.ArrayList;
import java.util.List;
import jebglobal.Uk;
import java.util.Arrays;
import jebglobal.yK;

public class DexClass
{
    yK c;
    
    DexClass(final yK c) {
        this.c = c;
    }
    
    public int getClasstypeIndex() {
        return this.c.zs();
    }
    
    public int getAccessFlags() {
        return this.c.LH();
    }
    
    public int getSuperclassIndex() {
        return this.c.Hw();
    }
    
    public int[] getInterfaceIndexes() {
        final int[] rk = this.c.rK();
        return Arrays.copyOf(rk, rk.length);
    }
    
    public int getSourceIndex() {
        return this.c.Ux();
    }
    
    public DexClassData getData() {
        final Uk s = this.c.s();
        if (s == null) {
            return null;
        }
        return new DexClassData(s);
    }
    
    public List getStaticInitializers() {
        final ArrayList<DexValue> list = new ArrayList<DexValue>();
        final ub[] zy = this.c.ZY();
        for (int length = zy.length, i = 0; i < length; ++i) {
            list.add(new DexValue(zy[i]));
        }
        return list;
    }
    
    public DexAnnotationsDirectory getAnnotationsDirectory() {
        final xd hv = this.c.Hv();
        if (hv == null) {
            return null;
        }
        return new DexAnnotationsDirectory(hv);
    }
    
    public int getUserFlags() {
        return this.c.ci();
    }
    
    public void setUserFlags(final int n) {
        this.c.wU(n);
    }
}
