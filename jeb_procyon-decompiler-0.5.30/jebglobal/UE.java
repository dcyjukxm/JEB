// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

final class UE implements Listener
{
    final /* synthetic */ yW val$context;
    final /* synthetic */ vv this$0;
    
    UE(final vv this$0, final yW val$context) {
        this.this$0 = this$0;
        this.val$context = val$context;
    }
    
    public void handleEvent(final Event event) {
        event.doit = false;
        this.val$context.Ai().zs();
    }
}
