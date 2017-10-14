// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.custom.VerifyKeyListener;

final class yO implements VerifyKeyListener
{
    private /* synthetic */ l dN;
    
    yO(final l dn) {
        this.dN = dn;
    }
    
    public void verifyKey(final VerifyEvent verifyEvent) {
        switch (verifyEvent.keyCode) {
            case 108: {
                if (verifyEvent.stateMask == 262144) {
                    this.dN.EO();
                    break;
                }
                break;
            }
        }
    }
}
