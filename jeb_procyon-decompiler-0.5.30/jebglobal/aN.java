// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public final class aN implements Zq
{
    @Override
    public void dN(final InputStream inputStream, final OutputStream outputStream) {
        try {
            Br.dN(inputStream, outputStream);
        }
        catch (IOException ex) {
            throw new zX();
        }
    }
}
