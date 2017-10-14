// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

import jebglobal.YJ;
import jebglobal.lW;
import jebglobal.yn;

public class InteractiveTextView extends TextView
{
    yn v;
    
    InteractiveTextView(final JebUI jebUI, final yn v) {
        super(jebUI, v);
        this.v = v;
    }
    
    public String getActiveItem() {
        return (String)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                final YJ ok = InteractiveTextView.this.v.OK();
                if (ok == null) {
                    this.result = null;
                }
                else {
                    final int ok2 = InteractiveTextView.this.v.OK(InteractiveTextView.this.v.zs());
                    this.result = InteractiveTextView.this.v.bG().substring(ok2 + ok.QE(), ok2 + ok.wU());
                }
            }
        });
    }
}
