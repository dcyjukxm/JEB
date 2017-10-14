// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import jebglobal.kg;
import jebglobal.xd;

public class DexAnnotationItem
{
    public static final int VISIBILITY_BUILD = 0;
    public static final int VISIBILITY_RUNTIME = 1;
    public static final int VISIBILITY_SYSTEM = 2;
    xd.uK ai;
    
    DexAnnotationItem(final xd.uK ai) {
        this.ai = ai;
    }
    
    public int getVisibility() {
        return this.ai.dN();
    }
    
    public DexAnnotation getAnnotation() {
        final kg ld = this.ai.ld();
        if (ld == null) {
            return null;
        }
        return new DexAnnotation(ld);
    }
}
