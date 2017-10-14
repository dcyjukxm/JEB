// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ui;

public class CodePosition
{
    private String signature;
    private int offset;
    
    public CodePosition(final String signature, final int offset) {
        this.signature = signature;
        this.offset = offset;
    }
    
    public CodePosition(final String s) {
        this(s, -1);
    }
    
    public String getSignature() {
        return this.signature;
    }
    
    public int getOffset() {
        return this.offset;
    }
}
