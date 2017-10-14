// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api;

public class Comment
{
    String signature;
    int offset;
    String text;
    
    Comment(final String signature, final int offset, final String text) {
        this.signature = signature;
        this.offset = offset;
        this.text = text;
    }
    
    public String getItemSignature() {
        return this.signature;
    }
    
    public int getMethodOffset() {
        return this.offset;
    }
    
    public String getText() {
        return this.text;
    }
}
