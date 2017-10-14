// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.wz;
import jebglobal.am;

public class ForStm extends Compound
{
    am object;
    
    ForStm(final am object) {
        super(object);
        this.object = object;
    }
    
    public static ForStm build(final Statement statement, final Predicate predicate, final Statement statement2, final Block block) {
        return new ForStm(new am((statement == null) ? null : statement.object, (predicate == null) ? null : predicate.object, (statement2 == null) ? null : statement2.object, block.object));
    }
    
    public Statement getInitializer() {
        return U.wrapStatement(this.object.zs());
    }
    
    public Predicate getPredicate() {
        return new Predicate(this.object.mS());
    }
    
    public Statement getPostStatement() {
        return U.wrapStatement(this.object.OK());
    }
    
    public Block getBody() {
        return new Block(this.object.LH());
    }
    
    public void setInitializer(final Statement statement) {
        this.object.dN((statement == null) ? null : statement.object);
    }
    
    public void setPredicate(final Predicate predicate) {
        this.object.dN((predicate == null) ? null : predicate.object);
    }
    
    public void setPostStatement(final Statement statement) {
        this.object.ld((statement == null) ? null : statement.object);
    }
    
    public void setBody(final Block block) {
        this.object.dN(block.object);
    }
}
