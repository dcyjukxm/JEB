// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import jebglobal.vD;

public class DexDebugInfo
{
    vD di;
    
    DexDebugInfo(final vD di) {
        this.di = di;
    }
    
    public int[] getParameterNameIndexes() {
        final int[] dn = this.di.dN();
        if (dn == null) {
            return null;
        }
        return Arrays.copyOf(dn, dn.length);
    }
    
    public LineInfo getLineInfo(final int n) {
        final vD.uK dn = this.di.dN(n / 2);
        if (dn == null) {
            return null;
        }
        return new LineInfo(dn);
    }
    
    public static class LineInfo
    {
        vD.uK li;
        
        LineInfo(final vD.uK li) {
            this.li = li;
        }
        
        public int getLine() {
            return this.li.dN;
        }
        
        public List getVariables() {
            final ArrayList<LocalVar> list = new ArrayList<LocalVar>();
            if (this.li.ld != null) {
                final Iterator<vD.vd> iterator = this.li.ld.iterator();
                while (iterator.hasNext()) {
                    list.add(new LocalVar(iterator.next()));
                }
            }
            return list;
        }
        
        public boolean isPrologueEnd() {
            return this.li.QE;
        }
        
        public boolean isEpilogueBegin() {
            return this.li.wU;
        }
        
        public int getSourceIndex() {
            return this.li.fa;
        }
    }
    
    public static class LocalVar
    {
        vD.vd var;
        
        LocalVar(final vD.vd var) {
            this.var = var;
        }
        
        public int getAddress() {
            return this.var.dN() * 2;
        }
        
        public int getRegister() {
            return this.var.ld();
        }
        
        public int getNameIndex() {
            return this.var.QE();
        }
        
        public int getTypeIndex() {
            return this.var.wU();
        }
        
        public int getSignatureIndex() {
            return this.var.fa();
        }
    }
}
