// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.math.BigInteger;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class DU
{
    private static final long LK = 844563159190538443L;
    private static String dN;
    private static String ld;
    private Vm QE;
    private String wU;
    
    public DU(final Vm qe) {
        if (qe == null) {
            throw new RuntimeException();
        }
        this.QE = qe;
    }
    
    public Hl dN() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            this.dN(hk, eI.KK);
            this.dN(hk, eI.fa);
            this.dN(hk, eI.zs);
            this.dN(hk, eI.mS);
            this.dN(hk, eI.OK);
            this.dN(hk, eI.LH);
            hk.dN();
            final int[] array = { 0 };
            this.wU = PX.dN(PX.dN(byteArrayOutputStream.toByteArray(), array));
            final String dn = this.QE.dN("http://www.android-decompiler.com/jps/checkupdate.php", this.wU);
            if (dn == null || dn.length() == 0) {
                return null;
            }
            final int index = dn.indexOf(88);
            if (index < 0) {
                return null;
            }
            byte[] byteArray = new BigInteger(dn.substring(0, index)).modPow(new BigInteger(DU.ld), new BigInteger(DU.dN)).toByteArray();
            if (byteArray.length > 128) {
                return null;
            }
            if (byteArray.length < 128) {
                final byte[] array2 = new byte[128];
                for (int i = 128 - byteArray.length, n = 0; i < 128; ++i, ++n) {
                    array2[i] = byteArray[n];
                }
                byteArray = array2;
            }
            if (!Arrays.equals(TM.wU(Arrays.copyOf(byteArray, byteArray.length - 32)), Arrays.copyOfRange(byteArray, byteArray.length - 32, byteArray.length))) {
                return null;
            }
            final ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            if (wrap.getInt(4) != array[0]) {
                return null;
            }
            final int int1 = wrap.getInt(8);
            final int int2 = wrap.getInt(12);
            final int int3 = wrap.getInt(16);
            if (20 + int3 > byteArray.length) {
                return null;
            }
            final byte[] copyOfRange = Arrays.copyOfRange(byteArray, 20, 20 + int3);
            final byte[] dn2 = PX.dN(dn.substring(index + 1).trim());
            if (dn2.length != int2) {
                return null;
            }
            TM.dN(copyOfRange, dn2, 0, dn2.length);
            final OZ oz = new OZ(new ByteArrayInputStream(dn2));
            if (oz.readInt() != 0) {
                return null;
            }
            final String dn3 = this.dN(oz);
            final String dn4 = this.dN(oz);
            final String dn5 = this.dN(oz);
            final String dn6 = this.dN(oz);
            if (dn3.isEmpty()) {
                return null;
            }
            return new Hl(int1, new Hl.uK(wk.dN(dn3), dn4, ZF.ld(dn5), dn6));
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    private void dN(final Hk hk, final String s) {
        final byte[] eo = TM.EO(s);
        hk.writeInt(eo.length);
        hk.write(eo);
    }
    
    private String dN(final OZ oz) {
        final int int1 = oz.readInt();
        if (int1 < 0) {
            throw new IOException();
        }
        final byte[] array = new byte[int1];
        if (int1 > 0 && oz.dN(array, 0, int1) != int1) {
            throw new IOException();
        }
        return TM.fa(array);
    }
    
    static {
        DU.dN = rP.dN(new byte[] { 114, 94, 69, 73, 69, 80, 80, 88, 67, 25, 25, 90, 24, 21, 6, 15, 12, 6, 27, 25, 6, 0, 1, 7, 30, 23, 126, 65, 82, 84, 91, 93, 21, 81, 95, 80, 31, 87, 71, 20, 88, 66, 70, 18, 85, 94, 95, 90, 89, 88, 81, 65, 86, 69, 22, 25, 119, 93, 85, 24, 74, 81, 87, 95, 64, 74, 17, 66, 81, 69, 82, 68, 71, 82, 84, 26, 115, 94, 65, 76, 67, 92, 81, 81, 70, 24, 28, 82, 24, 25, 3, 14, 11, 5, 20, 16, 7, 5, 4, 0, 30, 24, 123, 70, 83, 83, 91, 82, 21, 84, 92, 82, 24, 89, 68, 17, 94, 77, 70, 25, 83, 94, 86, 90, 85, 89, 83, 67, 93, 65, 23, 20, 118, 94, 93, 23, 69, 80, 85, 95, 65, 64, 17, 70, 87, 70, 92, 64, 78, 80, 80, 24, 115, 87, 71, 73, 69, 92, 94, 88, 77, 18, 30, 87, 25, 17, 9, 8, 13, 10, 20, 23, 5, 6, 7, 4, 29, 17, 124, 67, 85, 82, 92, 92, 17, 84, 93, 93, 28, 92, 75, 18, 88, 71, 75, 21, 84, 82, 81, 95, 88, 81, 82, 68, 86, 66, 22, 21, 115, 94, 91, 18, 74, 93, 87, 93, 76, 71, 18, 74, 81, 69, 92, 70, 70, 86, 87, 24, 122, 94, 72, 64, 64, 80, 82, 89, 68, 16, 31, 90, 24, 21, 4, 12, 10, 2, 20, 23, 5, 0, 7, 3, 25, 19, 126, 70, 87, 90, 90, 92, 25, 84, 87, 85, 24, 95, 66, 20, 92, 67, 75, 18, 81, 84, 95, 94, 90, 93, 84, 71, 80, 70, 28, 20, 112, 95, 91, 18, 75, 92, 83, 91, 64, 71, 22, 75, 81, 75, 93, 75, 67, 84, 87, 22, 117, 91, 71, 65, 65 }, 2, 32);
        DU.ld = rP.dN(new byte[] { 117, 90, 69, 74, 69 }, 2, 158);
    }
}
