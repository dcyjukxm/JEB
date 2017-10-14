// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class UY extends Thread
{
    private static final long LK = 844563159190538443L;
    
    @Override
    public void run() {
        int n = 0;
        while (true) {
            final long dn = this.dN();
            if (dn == 0L) {
                n = 0;
            }
            else {
                boolean b = false;
                if (dn <= -1L) {
                    if (++n >= 4) {
                        b = true;
                    }
                }
                else {
                    b = true;
                }
                if (b) {
                    null.dN(dn);
                }
            }
            try {
                Thread.sleep(10000L);
            }
            catch (InterruptedException ex) {
                break;
            }
        }
    }
    
    private long dN() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(0);
            hk.writeLong(0L);
            hk.writeLong(0L);
            hk.dN();
            final String dn = null.dN(PX.dN(PX.dN(byteArrayOutputStream.toByteArray(), new int[1])));
            if (dn == null) {
                return -1L;
            }
            final PX ld = PX.ld(PX.dN(dn.trim()));
            if (ld == null) {
                return -1L;
            }
            final OZ oz = new OZ(new ByteArrayInputStream(ld.wU()));
            if (oz.readInt() != 1) {
                return -1L;
            }
            return oz.readLong();
        }
        catch (Exception ex) {
            return -1L;
        }
    }
}
