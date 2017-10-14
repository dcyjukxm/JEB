// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

import jebglobal.Ky;
import jebglobal.yn;
import jebglobal.Pl;

public class AssemblyView extends CodeView
{
    Pl v;
    
    AssemblyView(final JebUI jebUI, final Pl v) {
        super(jebUI, v);
        this.v = v;
    }
    
    @Override
    public CodePosition getCodePosition(final int n) {
        return (CodePosition)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                final Ky qe = AssemblyView.this.v.QE(n);
                if (qe != null) {
                    this.result = new CodePosition((qe.ld != null) ? qe.ld : qe.dN, (qe.mS >= 0 && qe.zs >= 0) ? qe.zs : -1);
                }
            }
        });
    }
    
    public boolean setCodePosition(final CodePosition codePosition) {
        return (boolean)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                if (codePosition != null) {
                    this.result = AssemblyView.this.v.ld(codePosition.getSignature());
                }
            }
        });
    }
}
