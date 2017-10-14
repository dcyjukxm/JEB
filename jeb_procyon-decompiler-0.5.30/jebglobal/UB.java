// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class UB
{
    private int dN;
    private List ld;
    
    UB(final int dn) {
        this.dN = 0;
        this.ld = null;
        this.dN = dn;
        if (this.ld()) {
            this.ld = new ArrayList();
        }
    }
    
    int dN() {
        return this.dN & 0xF0FFFFFF;
    }
    
    boolean ld() {
        return (this.dN & Integer.MIN_VALUE) != 0x0;
    }
    
    boolean QE() {
        return (this.dN & 0x8000000) != 0x0;
    }
    
    void dN(final boolean b) {
        this.dN = (b ? (this.dN | 0x8000000) : (this.dN & 0xF7FFFFFF));
    }
    
    boolean wU() {
        return (this.dN & 0x4000000) != 0x0;
    }
    
    void ld(final boolean b) {
        this.dN = (b ? (this.dN | 0x4000000) : (this.dN & 0xFBFFFFFF));
    }
    
    boolean dN(final UB ub) {
        if (!this.ld()) {
            throw new RuntimeException();
        }
        return this.ld.add(ub);
    }
    
    boolean ld(final UB ub) {
        if (!this.ld()) {
            throw new RuntimeException();
        }
        return this.ld.remove(ub);
    }
    
    List fa() {
        if (!this.ld()) {
            throw new RuntimeException();
        }
        return this.ld;
    }
    
    public UB dN(final int n, final boolean b) {
        if (!this.ld()) {
            throw new RuntimeException();
        }
        if (!b) {
            for (final UB ub : this.ld) {
                if (ub.dN() == n) {
                    return ub;
                }
            }
            return null;
        }
        return this.dN(this, n);
    }
    
    private UB dN(final UB ub, final int n) {
        for (final UB ub2 : ub.fa()) {
            if (ub2.dN() == n) {
                return ub2;
            }
            if (!ub2.ld()) {
                continue;
            }
            final UB dn = this.dN(ub2, n);
            if (dn != null) {
                return dn;
            }
        }
        return null;
    }
    
    byte[] zs() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (this.ld()) {
                final Iterator<UB> iterator = this.ld.iterator();
                while (iterator.hasNext()) {
                    byteArrayOutputStream.write(iterator.next().zs());
                }
            }
            else {
                byteArrayOutputStream.write(this.mS());
            }
            if (byteArrayOutputStream.size() % 4 != 0) {
                throw new RuntimeException();
            }
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteBuffer byteBuffer = null;
            if (this.wU()) {
                final Deflater deflater = new Deflater();
                deflater.setInput(byteArray);
                deflater.finish();
                final byte[] array = new byte[byteArray.length];
                int deflate = deflater.deflate(array);
                if (deflate == 0 || !deflater.finished()) {
                    this.ld(false);
                }
                else {
                    if (deflate % 4 != 0) {
                        deflate += 4 - deflate % 4;
                    }
                    byteBuffer = ByteBuffer.wrap(new byte[12 + deflate]);
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    byteBuffer.putInt(this.dN);
                    byteBuffer.putInt(4 + deflate);
                    byteBuffer.putInt(byteArray.length);
                    byteBuffer.put(array, 0, deflate);
                }
            }
            if (!this.wU()) {
                byteBuffer = ByteBuffer.wrap(new byte[8 + byteArray.length]);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer.putInt(this.dN);
                byteBuffer.putInt(byteArray.length);
                byteBuffer.put(byteArray);
            }
            if (this.QE()) {
                final byte[] array2 = new byte[8];
                byteBuffer.rewind();
                byteBuffer.get(array2);
                dN(array2, byteBuffer.array(), 8, byteBuffer.array().length);
            }
            return byteBuffer.array();
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    byte[] mS() {
        throw new RuntimeException();
    }
    
    static UB dN(final OZ oz) {
        final int int1 = oz.readInt();
        final byte[] array = new byte[oz.readInt()];
        oz.readFully(array);
        return dN(int1, array);
    }
    
    static UB dN(final int n, byte[] array) {
        if ((n & 0x8000000) != 0x0) {
            final ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(n);
            allocate.putInt(array.length);
            dN(allocate.array(), array, 0, array.length);
        }
        if ((n & 0x4000000) != 0x0) {
            final ByteBuffer wrap = ByteBuffer.wrap(array);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            final int int1 = wrap.getInt();
            final Inflater inflater = new Inflater();
            inflater.setInput(array, 4, array.length - 4);
            final byte[] array2 = new byte[int1];
            try {
                if (inflater.inflate(array2) != int1) {
                    throw new DataFormatException();
                }
            }
            catch (DataFormatException ex) {
                return null;
            }
            inflater.end();
            array = array2;
        }
        final ByteBuffer wrap2 = ByteBuffer.wrap(array);
        wrap2.order(ByteOrder.LITTLE_ENDIAN);
        UB ub = null;
        if ((n & Integer.MIN_VALUE) != 0x0) {
            ub = new UB(n);
            while (wrap2.remaining() > 0) {
                final int int2 = wrap2.getInt();
                final byte[] array3 = new byte[wrap2.getInt()];
                wrap2.get(array3);
                ub.dN(dN(int2, array3));
            }
        }
        else {
            switch (n & 0xF0FFFFFF) {
                case 5391702: {
                    ub = Ji.dN(array);
                    break;
                }
                case 4606278: {
                    ub = k.dN(array);
                    break;
                }
                case 5526849: {
                    ub = kM.dN(array);
                    break;
                }
                case 4541510: {
                    ub = CH.dN(array);
                    break;
                }
                case 5066313: {
                    ub = u.dN(array);
                    break;
                }
                case 5524803: {
                    ub = OD.dN(array);
                    break;
                }
                case 4932181: {
                    ub = Bb.dN(array);
                    break;
                }
                default: {
                    throw new IOException();
                }
            }
        }
        ub.dN((n & 0x8000000) != 0x0);
        ub.ld((n & 0x4000000) != 0x0);
        return ub;
    }
    
    static byte[] ld(final OZ oz) {
        final int int1 = oz.readInt();
        final byte[] array = new byte[int1];
        oz.readFully(array);
        if (int1 % 4 != 0) {
            oz.skipBytes(4 - int1 % 4);
        }
        return array;
    }
    
    static void dN(final Hk hk, final byte[] array) {
        final int length = array.length;
        hk.writeInt(length);
        hk.write(array);
        if (length % 4 != 0) {
            for (int n = 4 - length % 4, i = 0; i < n; ++i) {
                hk.write(0);
            }
        }
    }
    
    static byte[] QE(final OZ oz) {
        final int int1 = oz.readInt();
        final byte[] ld = ld(oz);
        final CRC32 crc32 = new CRC32();
        crc32.update(ld);
        if ((int)crc32.getValue() != int1) {
            throw new IOException();
        }
        return ld;
    }
    
    static void ld(final Hk hk, final byte[] array) {
        final CRC32 crc32 = new CRC32();
        crc32.update(array);
        hk.writeInt((int)crc32.getValue());
        dN(hk, array);
    }
    
    static String wU(final OZ oz) {
        boolean b = false;
        int int1 = oz.readInt();
        if ((int1 & Integer.MIN_VALUE) != 0x0) {
            int1 &= Integer.MAX_VALUE;
            b = ((oz.readInt() & 0x1) != 0x0);
        }
        final byte[] array = new byte[int1];
        oz.readFully(array);
        if (int1 % 4 != 0) {
            oz.skipBytes(4 - int1 % 4);
        }
        return b ? TM.fa(array) : new String(array);
    }
    
    static void dN(final Hk hk, final String s) {
        final byte[] eo = TM.EO(s);
        final int length = eo.length;
        hk.writeInt(length | Integer.MIN_VALUE);
        hk.writeInt(1);
        hk.write(eo);
        if (length % 4 != 0) {
            for (int n = 4 - length % 4, i = 0; i < n; ++i) {
                hk.write(0);
            }
        }
    }
    
    static void dN(final byte[] array, final byte[] array2, final int n, final int n2) {
        final int length = array.length;
        final byte[] array3 = new byte[256];
        for (int i = 0; i < 256; ++i) {
            array3[i] = (byte)i;
        }
        int n3 = 0;
        for (int j = 0; j < 256; ++j) {
            n3 = ((n3 + array3[j] + array[j % length]) % 256 & 0xFF);
            final byte b = array3[j];
            array3[j] = array3[n3];
            array3[n3] = b;
        }
        int n4 = 0;
        int n5 = 0;
        for (int k = n; k < n2; ++k) {
            n4 = ((n4 + 1) % 256 & 0xFF);
            n5 = ((n5 + array3[n4]) % 256 & 0xFF);
            final byte b2 = array3[n4];
            array3[n4] = array3[n5];
            array3[n5] = b2;
            final byte b3 = array3[(array3[n4] + array3[n5]) % 256 & 0xFF];
            final int n6 = k;
            array2[n6] ^= b3;
        }
    }
    
    static int OK() {
        return (int)(System.currentTimeMillis() / 1000L);
    }
}
