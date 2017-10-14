// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api;

public class Mark
{
    private int lineindex;
    private int lineoffset;
    private Tag tag;
    
    Mark(final int lineindex, final int lineoffset, final Tag tag) {
        this.lineindex = lineindex;
        this.lineoffset = lineoffset;
        this.tag = tag;
    }
    
    public int getLineIndex() {
        return this.lineindex;
    }
    
    public int getOffsetInLine() {
        return this.lineoffset;
    }
    
    public Object getTag() {
        return this.tag;
    }
    
    @Override
    public String toString() {
        return String.format("(%d,%d):%s", this.lineindex, this.lineoffset, this.tag);
    }
}
