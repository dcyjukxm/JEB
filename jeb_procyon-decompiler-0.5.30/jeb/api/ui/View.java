// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

import jebglobal.ZE;

public abstract class View
{
    JebUI ui;
    ZE v;
    
    View(final JebUI ui, final ZE v) {
        if (ui == null || v == null) {
            throw new IllegalArgumentException();
        }
        this.ui = ui;
        this.v = v;
    }
    
    public void refresh() {
        this.ui.exec(new Runnable() {
            @Override
            public void run() {
                View.this.v.KK();
            }
        });
    }
    
    public enum Type
    {
        ASSEMBLY("ASSEMBLY", 0), 
        JAVA("JAVA", 1), 
        MANIFEST("MANIFEST", 2), 
        NOTES("NOTES", 3), 
        CLASS_HIERARCHY("CLASS_HIERARCHY", 4), 
        CONSOLE("CONSOLE", 5);
        
        private Type(final String s, final int n) {
        }
    }
}
