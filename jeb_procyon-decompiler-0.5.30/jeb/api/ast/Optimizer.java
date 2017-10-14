// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Yx;
import jeb.api.JebInstance;
import jebglobal.Fu;
import jebglobal.b;

public class Optimizer
{
    b astopt;
    Fu object;
    
    public Optimizer(final JebInstance jebInstance, final Method method) {
        this.astopt = new b((Yx)jebInstance.getGO(), method.object);
        this.object = method.object;
    }
    
    public int runAllOptimizations() {
        return this.astopt.dN();
    }
    
    public int removeUnreferencedLabels() {
        return this.astopt.zs(this.object);
    }
    
    public int removeUselessGotos() {
        return 0 + this.astopt.wU(this.object) + this.astopt.wU(this.object.VX()) + this.astopt.fa(this.object.VX());
    }
}
