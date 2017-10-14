// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import jebglobal.AV;
import java.util.Iterator;
import java.util.List;
import jebglobal.XV;
import jebglobal.Uk;

public class DexClassData
{
    private Uk cd;
    
    DexClassData(final Uk cd) {
        this.cd = cd;
    }
    
    public DexFieldData[] getStaticFields() {
        final List dn = this.cd.dN();
        final DexFieldData[] array = new DexFieldData[dn.size()];
        int n = 0;
        final Iterator<XV> iterator = dn.iterator();
        while (iterator.hasNext()) {
            array[n++] = new DexFieldData(iterator.next());
        }
        return array;
    }
    
    public DexFieldData[] getInstanceFields() {
        final List ld = this.cd.ld();
        final DexFieldData[] array = new DexFieldData[ld.size()];
        int n = 0;
        final Iterator<XV> iterator = ld.iterator();
        while (iterator.hasNext()) {
            array[n++] = new DexFieldData(iterator.next());
        }
        return array;
    }
    
    public DexMethodData[] getDirectMethods() {
        final List wu = this.cd.wU();
        final DexMethodData[] array = new DexMethodData[wu.size()];
        int n = 0;
        final Iterator<AV> iterator = wu.iterator();
        while (iterator.hasNext()) {
            array[n++] = new DexMethodData(iterator.next());
        }
        return array;
    }
    
    public DexMethodData[] getVirtualMethods() {
        final List fa = this.cd.fa();
        final DexMethodData[] array = new DexMethodData[fa.size()];
        int n = 0;
        final Iterator<AV> iterator = fa.iterator();
        while (iterator.hasNext()) {
            array[n++] = new DexMethodData(iterator.next());
        }
        return array;
    }
}
