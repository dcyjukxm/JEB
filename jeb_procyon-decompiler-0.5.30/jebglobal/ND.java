// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Listener;
import java.util.Date;
import java.util.Calendar;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Shell;

public final class ND extends Xa
{
    private static final long LK = 844563159190538443L;
    private boolean ld;
    private boolean QE;
    
    public ND(final Shell shell, final boolean ld) {
        super(shell, null, rP.dN(new byte[] { -96, 33, 8, 2 }, 1, 228), "");
        this.ld = ld;
        final String format = String.format(rP.dN(new byte[] { 23, 7, 25, 10, 82, 0, 20, 72, 21, 0, 76, 6, 68, 79, 17, 86, 95, 19, 102, 101, 112, 16, 71, 22, 95, 0, 35, 27, 2, 6, 2, 22, 69, 5, 78, 16, 64, 79, 87, 83, 73, 92, 86, 83, 72, 108 }, 2, 222), yW.dN.toString(), "              ", "                         ");
        String format2 = "";
        final int dn = uK.dN();
        if (dn > 0) {
            final Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(1000L * dn));
            format2 = String.format(rP.dN(new byte[] { -28, 29, 8, 25, 27, 23, 22, 83, 79, 1, 78, 5, 21, 4, 80, 73, 8, 21, 2, 86, 73, 8, 21, 2, 86, 68, 65, 15, 10, 68 }, 1, 129), instance.get(1), 1 + instance.get(2), instance.get(5));
        }
        this.dN(format + String.format(rP.dN(new byte[] { 23, 7, 25, 10, 82, 25, 21, 7, 19, 82, 73, 14, 9, 5, 66, 74, 81, 82, 64, 76, 18, 94, 94, 71, 12, 66, 42, 82, 19, 6, 8, 12, 83, 21, 28, 13, 77, 26, 6, 69, 13, 90, 121 }, 2, 166), format2) + "\n" + rP.dN(new byte[] { 39, 33, 8, 2, 79, 76, 5, 4, 4, 29, 21, 21, 29, 6, 1, 29, 83, 73, 7, 13, 15, 25, 17, 1, 95, 48 }, 1, 99) + rP.dN(new byte[] { -117, 13, 99, 34, 15, 0, 1, 27, 84, 76, 3, 14, 5, 68, 79, 29, 82, 83, 18, 23, 19, 69, 84, 27, 79, 65, 65, 106, 15, 7, 98, 68, 5, 21, 21, 3, 3, 18, 22, 69, 70, 15, 5, 9, 75, 36 }, 1, 166) + rP.dN(new byte[] { -25, 13, 111, 33, 2, 21, 89, 65, 65, 83, 6, 23, 17, 22, 17, 84, 79, 9, 70, 77, 8, 17, 28, 7, 11, 23, 83, 87, 30, 5, 0, 76, 66, 7, 69, 68, 1, 6, 12, 2, 29, 25, 5, 9, 1, 74, 36 }, 1, 202) + rP.dN(new byte[] { 110, 79, 62, 22, 82, 10, 8, 24, 13, 15, 88, 2, 90, 84, 84, 25, 86, 85, 12, 67, 93, 84, 84, 29, 38 }, 2, 93) + rP.dN(new byte[] { 85, 13, 109, 44, 25, 17, 4, 24, 24, 77, 82, 7, 27, 0, 7, 7, 9, 71, 84, 29, 4, 8, 69, 70, 9, 29, 82, 65, 65, 83, 26, 7, 9, 11, 9, 69, 83, 22, 22, 0, 26, 6, 1, 78, 73, 26, 83, 17, 17, 72, 7, 26, 7, 92, 36 }, 1, 120));
        this.dN(12);
        this.ld(80);
        this.dN(false);
        this.QE(null);
    }
    
    @Override
    public String dN() {
        super.dN();
        return null;
    }
    
    @Override
    public void dN(final Shell shell) {
        super.dN(shell);
        this.dN.setFocus();
        if (this.ld) {
            shell.addListener(31, (Listener)new Fb(this));
            shell.addListener(21, (Listener)new oB(this));
            this.dN.setText(rP.dN(new byte[] { 99, 79, 80, 41, 30, 12, 6, 27, 17, 0, 95, 2, 64, 84, 31, 23, 23, 19, 12, 0 }, 2, 188));
            this.dN.setEnabled(false);
            shell.getDisplay().timerExec(4900, (Runnable)new BY(this));
        }
    }
}
