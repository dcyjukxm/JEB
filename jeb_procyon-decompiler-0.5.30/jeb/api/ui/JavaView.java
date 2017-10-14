// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

import jebglobal.Ky;
import jebglobal.yn;
import jebglobal.Os;

public class JavaView extends CodeView
{
    Os v;
    
    JavaView(final JebUI jebUI, final Os v) {
        super(jebUI, v);
        this.v = v;
    }
    
    @Override
    public CodePosition getCodePosition(final int n) {
        return (CodePosition)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                final Ky qe = JavaView.this.v.QE(n);
                if (qe != null) {
                    this.result = new CodePosition((qe.ld != null) ? qe.ld : qe.dN, (qe.mS >= 0 && qe.zs >= 0) ? qe.zs : -1);
                }
            }
        });
    }
}
