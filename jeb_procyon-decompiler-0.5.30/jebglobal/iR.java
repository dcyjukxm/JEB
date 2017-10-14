// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.InputStream;

public interface iR
{
    void dN(final String p0, final boolean p1);
    
    boolean ld(final String p0);
    
    Object dN(final String p0);
    
    void dN(final InputStream p0, final String p1);
    
    String Hw();
    
    int dN(final int p0);
    
    String ld(final int p0);
    
    String QE(final int p0);
    
    int zs();
    
    String cb();
    
    int OK();
    
    int rK();
    
    String KK();
    
    String EO();
    
    String LH();
    
    int PF();
    
    String wU(final int p0);
    
    String zs(final int p0);
    
    String OK(final int p0);
    
    int mS();
    
    int fa();
    
    default static {
        final String[] array = { "START_DOCUMENT", "END_DOCUMENT", "START_TAG", "END_TAG", "TEXT", "CDSECT", "ENTITY_REF", "IGNORABLE_WHITESPACE", "PROCESSING_INSTRUCTION", "COMMENT", "DOCDECL" };
    }
}
