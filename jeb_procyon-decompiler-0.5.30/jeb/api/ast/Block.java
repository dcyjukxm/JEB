// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.wz;
import jebglobal.EG;

public class Block extends Compound
{
    EG object;
    
    Block(final EG object) {
        super(object);
        this.object = object;
    }
    
    public static Block build() {
        return new Block(new EG());
    }
    
    public int size() {
        return this.object.zs();
    }
    
    public Statement get(final int n) {
        return U.wrapStatement(this.object.ld(n));
    }
    
    public void set(final int n, final Statement statement) {
        this.object.ld(n, statement.object);
    }
    
    public Statement remove(final int n) {
        return U.wrapStatement(this.object.QE(n));
    }
    
    public void add(final Statement statement) {
        this.object.dN(statement.object);
    }
    
    public void insert(final int n, final Statement statement) {
        this.object.QE(n, statement.object);
    }
}
