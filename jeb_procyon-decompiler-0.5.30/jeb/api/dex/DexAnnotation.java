// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.ArrayList;
import java.util.List;
import jebglobal.kg;

public class DexAnnotation
{
    kg a;
    
    DexAnnotation(final kg a) {
        this.a = a;
    }
    
    public int getTypeIndex() {
        return this.a.dN();
    }
    
    public List getElements() {
        final ArrayList<Element> list = new ArrayList<Element>(this.a.ld().length);
        final kg.uK[] ld = this.a.ld();
        for (int length = ld.length, i = 0; i < length; ++i) {
            list.add(new Element(ld[i]));
        }
        return list;
    }
    
    public static class Element
    {
        kg.uK e;
        
        Element(final kg.uK e) {
            this.e = e;
        }
        
        public int getNameIndex() {
            return this.e.dN();
        }
        
        public DexValue getValue() {
            return new DexValue(this.e.ld());
        }
    }
}
