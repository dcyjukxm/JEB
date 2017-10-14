// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

import org.eclipse.swt.widgets.MessageBox;
import jebglobal.dh;
import jebglobal.yK;
import jebglobal.Ky;
import jebglobal.ly;
import jebglobal.uT;
import jebglobal.tS;
import jebglobal.Os;
import jebglobal.Pl;
import jebglobal.ZE;
import jebglobal.lW;
import jebglobal.yx;
import jebglobal.yW;

public class JebUI
{
    private yW ctx;
    private yx w;
    private boolean running_on_ui;
    
    public JebUI(final Object o) {
        if (!(o instanceof yW)) {
            throw new RuntimeException();
        }
        this.ctx = (yW)o;
        this.w = this.ctx.uM();
    }
    
    void exec(final Runnable runnable) {
        if (this.running_on_ui) {
            runnable.run();
        }
        else {
            this.running_on_ui = true;
            this.ctx.Nh().syncExec(runnable);
            this.running_on_ui = false;
        }
    }
    
    Object execReturn(final RunnableEx runnableEx) {
        this.exec(runnableEx);
        return runnableEx.result;
    }
    
    public View getView(final View.Type type) {
        return (View)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = null;
                switch (type) {
                    case ASSEMBLY: {
                        final Pl ok = JebUI.this.w.OK();
                        if (ok != null) {
                            this.result = new AssemblyView(JebUI.this, ok);
                            break;
                        }
                        break;
                    }
                    case JAVA: {
                        final Os cb = JebUI.this.w.cb();
                        if (cb != null) {
                            this.result = new JavaView(JebUI.this, cb);
                            break;
                        }
                        break;
                    }
                    case MANIFEST: {
                        final tS hw = JebUI.this.w.Hw();
                        if (hw != null) {
                            this.result = new XmlView(JebUI.this, hw);
                            break;
                        }
                        break;
                    }
                    case NOTES: {
                        final uT ux = JebUI.this.w.Ux();
                        if (ux != null) {
                            this.result = new TextView(JebUI.this, ux);
                            break;
                        }
                        break;
                    }
                    case CLASS_HIERARCHY: {
                        final ly ms = JebUI.this.w.mS();
                        if (ms != null) {
                            this.result = new TreeView(JebUI.this, ms);
                            break;
                        }
                        break;
                    }
                    case CONSOLE: {
                        final lW kq = JebUI.this.ctx.kq();
                        if (kq != null) {
                            this.result = new TextView(JebUI.this, kq);
                            break;
                        }
                        break;
                    }
                }
            }
        });
    }
    
    public boolean focusView(final View.Type type) {
        return (boolean)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                switch (type) {
                    case ASSEMBLY: {
                        JebUI.this.w.EO();
                        this.result = true;
                        break;
                    }
                    case JAVA: {
                        JebUI.this.w.PF();
                        this.result = true;
                        break;
                    }
                    case MANIFEST: {
                        JebUI.this.w.rK();
                        this.result = true;
                        break;
                    }
                    case NOTES: {
                        JebUI.this.w.ZY();
                        this.result = true;
                        break;
                    }
                    case CLASS_HIERARCHY: {
                        this.result = false;
                        break;
                    }
                    case CONSOLE: {
                        this.result = false;
                        break;
                    }
                }
            }
        });
    }
    
    public boolean isViewVisible(final View.Type type) {
        return (boolean)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                switch (type) {
                    case ASSEMBLY: {
                        this.result = JebUI.this.w.OK().isVisible();
                        break;
                    }
                    case JAVA: {
                        this.result = JebUI.this.w.cb().isVisible();
                        break;
                    }
                    case MANIFEST: {
                        this.result = JebUI.this.w.Hw().isVisible();
                        break;
                    }
                    case NOTES: {
                        this.result = JebUI.this.w.Ux().isVisible();
                        break;
                    }
                    case CLASS_HIERARCHY: {
                        this.result = true;
                        break;
                    }
                    case CONSOLE: {
                        this.result = true;
                        break;
                    }
                }
            }
        });
    }
    
    public void setStatus(final String s) {
        this.exec(new Runnable() {
            @Override
            public void run() {
                JebUI.this.ctx.zs(s);
            }
        });
    }
    
    public String getStatus() {
        return (String)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebUI.this.ctx.IL();
            }
        });
    }
    
    public void enableStatusUpdates(final boolean b) {
        this.exec(new Runnable() {
            @Override
            public void run() {
                JebUI.this.ctx.wU(b);
            }
        });
    }
    
    public boolean decompileClass(final String s, final boolean b) {
        return (boolean)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                final yK cb = JebUI.this.ctx.ZY().cb(s);
                if (cb == null) {
                    this.result = false;
                }
                else {
                    JebUI.this.w.cb().dN(cb.dN(false), null);
                    if (b) {
                        JebUI.this.w.PF();
                    }
                    this.result = true;
                }
            }
        });
    }
    
    public String displayQuestionBox(final String s, final String s2, final String s3) {
        return (String)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = new dh(JebUI.this.ctx.LR(), JebUI.this.ctx.XZ(), 1, s, s2, s3).dN();
            }
        });
    }
    
    public int displayMessageBox(final String s, final String s2, final IconType iconType, final ButtonGroupType buttonGroupType) {
        return (int)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebUI.this.displayMessageBoxInternal(s, s2, iconType, buttonGroupType);
            }
        });
    }
    
    private int displayMessageBoxInternal(final String text, final String message, final IconType iconType, final ButtonGroupType buttonGroupType) {
        int n = 0;
        if (iconType != null) {
            switch (iconType) {
                case QUESTION: {
                    n = 4;
                    break;
                }
                case INFORMATION: {
                    n = 2;
                    break;
                }
                case WARNING: {
                    n = 8;
                    break;
                }
                case ERROR: {
                    n = 1;
                    break;
                }
            }
        }
        if (buttonGroupType != null) {
            switch (buttonGroupType) {
                case OK: {
                    n |= 0x20;
                    break;
                }
                case OK_CANCEL: {
                    n |= 0x120;
                    break;
                }
                case YES_NO: {
                    n |= 0xC0;
                    break;
                }
                case YES_NO_CANCEL: {
                    n |= 0x1C0;
                    break;
                }
            }
        }
        final MessageBox messageBox = new MessageBox(this.ctx.LR(), n);
        if (text != null) {
            messageBox.setText(text);
        }
        if (message != null) {
            messageBox.setMessage(message);
        }
        switch (messageBox.open()) {
            case 256: {
                return 0;
            }
            case 32: {
                return 1;
            }
            case 64: {
                return 2;
            }
            case 128: {
                return 3;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    abstract static class RunnableEx implements Runnable
    {
        Object result;
    }
    
    public enum IconType
    {
        QUESTION("QUESTION", 0), 
        INFORMATION("INFORMATION", 1), 
        WARNING("WARNING", 2), 
        ERROR("ERROR", 3);
        
        private IconType(final String s, final int n) {
        }
    }
    
    public enum ButtonGroupType
    {
        OK("OK", 0), 
        OK_CANCEL("OK_CANCEL", 1), 
        YES_NO("YES_NO", 2), 
        YES_NO_CANCEL("YES_NO_CANCEL", 3);
        
        private ButtonGroupType(final String s, final int n) {
        }
    }
}
