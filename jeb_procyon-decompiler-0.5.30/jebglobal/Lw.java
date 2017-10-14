// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public final class Lw implements Zq
{
    @Override
    public void dN(final InputStream inputStream, final OutputStream outputStream) {
        try {
            outputStream.write(Br.dN(inputStream));
        }
        catch (IOException ex) {
            throw new zX(ex);
        }
    }
}
