// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.File;
import java.io.OutputStream;
import java.io.InputStream;

public final class Br
{
    public static byte[] dN(final InputStream inputStream) {
        final RB rb = new RB();
        dN(inputStream, rb);
        return rb.dN();
    }
    
    public static int dN(final InputStream inputStream, final OutputStream outputStream) {
        final long ld = ld(inputStream, outputStream);
        if (ld > 2147483647L) {
            return -1;
        }
        return (int)ld;
    }
    
    public static long ld(final InputStream inputStream, final OutputStream outputStream) {
        return dN(inputStream, outputStream, new byte[4096]);
    }
    
    public static long dN(final InputStream inputStream, final OutputStream outputStream, final byte[] array) {
        long n = 0L;
        int read;
        while (-1 != (read = inputStream.read(array))) {
            outputStream.write(array, 0, read);
            n += read;
        }
        return n;
    }
    
    static {
        final char separatorChar = File.separatorChar;
        final PrintWriter printWriter = new PrintWriter(new GV(4));
        printWriter.println();
        printWriter.close();
    }
}
