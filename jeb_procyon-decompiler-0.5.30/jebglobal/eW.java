// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Arrays;
import java.io.Writer;

final class eW extends Writer
{
    public eW(final eI ei) {
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        if (n2 > 0) {
            cn.ld(new String(Arrays.copyOfRange(array, n, n + n2)));
        }
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void close() {
    }
}
