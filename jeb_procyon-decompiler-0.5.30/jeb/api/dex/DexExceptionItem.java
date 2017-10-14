// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.Iterator;
import jebglobal.bt;
import java.util.ArrayList;
import java.util.List;
import jebglobal.nm;

public class DexExceptionItem
{
    nm ei;
    
    DexExceptionItem(final nm ei) {
        this.ei = ei;
    }
    
    public int getTryAddress() {
        return this.ei.dN();
    }
    
    public int getTrySize() {
        return this.ei.ld();
    }
    
    public List getHandlers() {
        final ArrayList<Handler> list = new ArrayList<Handler>();
        final Iterator<bt> iterator = this.ei.wU().iterator();
        while (iterator.hasNext()) {
            list.add(new Handler(iterator.next()));
        }
        return list;
    }
    
    public static class Handler
    {
        bt eh;
        
        Handler(final bt eh) {
            this.eh = eh;
        }
        
        public int getTypeIndex() {
            return this.eh.ld();
        }
        
        public int getAddress() {
            return this.eh.QE();
        }
    }
}
