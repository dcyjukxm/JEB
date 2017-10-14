// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetAdapter;

final class sb extends DropTargetAdapter
{
    private /* synthetic */ yW dN;
    
    sb(final yW dn) {
        this.dN = dn;
    }
    
    public void drop(final DropTargetEvent dropTargetEvent) {
        if (FileTransfer.getInstance().isSupportedType(dropTargetEvent.currentDataType)) {
            final String[] array = (String[])dropTargetEvent.data;
            if (array.length >= 1) {
                this.dN.dN(array[0]);
            }
        }
    }
}
