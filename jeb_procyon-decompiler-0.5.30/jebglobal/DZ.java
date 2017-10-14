// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;

final class DZ implements TraverseListener
{
    DZ(final Xa xa) {
    }
    
    public void keyTraversed(final TraverseEvent traverseEvent) {
        if (traverseEvent.detail == 16 || traverseEvent.detail == 8) {
            traverseEvent.doit = true;
        }
    }
}
