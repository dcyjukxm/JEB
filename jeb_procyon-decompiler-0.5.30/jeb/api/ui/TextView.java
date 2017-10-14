// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

import jebglobal.ZE;
import jebglobal.lW;

public class TextView extends View
{
    lW v;
    
    TextView(final JebUI jebUI, final lW v) {
        super(jebUI, v);
        this.v = v;
    }
    
    public String getText() {
        return (String)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                this.result = TextView.this.v.bG();
            }
        });
    }
    
    public int getLineCount() {
        return (int)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                this.result = TextView.this.v.BQ();
            }
        });
    }
    
    public String getLine(final int n) {
        return (String)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                if (n < 0 || n >= TextView.this.v.BQ()) {
                    this.result = null;
                }
                else {
                    this.result = TextView.this.v.mS(n);
                }
            }
        });
    }
    
    public boolean gotoLine(final int n) {
        return (boolean)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                if (n < 0 || n >= TextView.this.v.BQ()) {
                    this.result = false;
                }
                else {
                    TextView.this.v.dN(n);
                    this.result = true;
                }
            }
        });
    }
    
    public int getCaretOffset() {
        return (int)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                this.result = TextView.this.v.fa();
            }
        });
    }
    
    public void setCaretOffset(final int n) {
        this.ui.exec(new Runnable() {
            @Override
            public void run() {
                TextView.this.v.zs(n);
            }
        });
    }
    
    public void setCaretPosition(final int n, final int n2) {
        this.ui.exec(new Runnable() {
            @Override
            public void run() {
                TextView.this.v.dN(n, n2);
            }
        });
    }
    
    public int getCaretLine() {
        return (int)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                this.result = TextView.this.v.zs();
            }
        });
    }
    
    public int getOffsetAtLine(final int n) {
        return (int)this.ui.execReturn(new JebUI.RunnableEx() {
            @Override
            public void run() {
                this.result = TextView.this.v.OK(n);
            }
        });
    }
}
