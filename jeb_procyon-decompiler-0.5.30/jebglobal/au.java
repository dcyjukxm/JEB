// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.internal.C;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.internal.Callback;

final class au implements Runnable
{
    final /* synthetic */ vv this$0;
    
    au(final vv this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        this.this$0.invoke(vv.proc3Args, "dispose");
    }
}
