// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

import jebglobal.yn;

public abstract class CodeView extends InteractiveTextView
{
    CodeView(final JebUI jebUI, final yn yn) {
        super(jebUI, yn);
    }
    
    public abstract CodePosition getCodePosition(final int p0);
    
    public CodePosition getCodePosition() {
        return (CodePosition)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                this.result = CodeView.this.getCodePosition(CodeView.this.v.zs());
            }
        });
    }
}
