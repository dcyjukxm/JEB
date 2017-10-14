// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api;

public class Tag
{
    private String name;
    private Object data;
    
    Tag(final String name, final Object data) {
        this.name = name;
        this.data = data;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Object getData() {
        return this.data;
    }
    
    @Override
    public String toString() {
        return String.format("tag:%s-%s", this.name, this.data);
    }
}
