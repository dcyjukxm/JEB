// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Yx;
import jeb.api.JebInstance;
import jebglobal.hV;
import jebglobal.cI;
import jebglobal.OX;

public class Constant extends NonStatement implements IExpression
{
    OX object;
    
    Constant(final OX object) {
        super(object);
        this.object = object;
    }
    
    public String getType() {
        final hV ld = this.object.ld();
        return (ld == null) ? null : ld.KK();
    }
    
    public boolean isNull() {
        return this.object.ld() == null;
    }
    
    public boolean isString() {
        final hV ld = this.object.ld();
        return ld != null && ld.KK().equals("Ljava/lang/String;");
    }
    
    public boolean getBoolean() {
        if (this.object.ld() != hV.ld) {
            throw new IllegalStateException();
        }
        return this.object.QE();
    }
    
    public byte getByte() {
        if (this.object.ld() != hV.QE) {
            throw new IllegalStateException();
        }
        return this.object.fa();
    }
    
    public char getChar() {
        if (this.object.ld() != hV.wU) {
            throw new IllegalStateException();
        }
        return this.object.zs();
    }
    
    public short getShort() {
        if (this.object.ld() != hV.fa) {
            throw new IllegalStateException();
        }
        return this.object.mS();
    }
    
    public int getInt() {
        if (this.object.ld() != hV.zs) {
            throw new IllegalStateException();
        }
        return this.object.OK();
    }
    
    public long getLong() {
        if (this.object.ld() != hV.mS) {
            throw new IllegalStateException();
        }
        return this.object.LH();
    }
    
    public float getFloat() {
        if (this.object.ld() != hV.OK) {
            throw new IllegalStateException();
        }
        return this.object.KK();
    }
    
    public double getDouble() {
        if (this.object.ld() != hV.LH) {
            throw new IllegalStateException();
        }
        return this.object.EO();
    }
    
    public String getString() {
        if (!this.object.ld().KK().equals("Ljava/lang/String;")) {
            throw new IllegalStateException();
        }
        return this.object.cb();
    }
    
    public boolean isTrue() {
        return this.object.Hw();
    }
    
    public boolean isFalse() {
        return this.object.rK();
    }
    
    public boolean isZero() {
        return this.object.Ux();
    }
    
    public boolean isOne() {
        return this.object.ZY();
    }
    
    public boolean isMinusOne() {
        return this.object.s();
    }
    
    public boolean isPositive() {
        return this.object.Hv();
    }
    
    public boolean isNegative() {
        return this.object.VX();
    }
    
    public static class Builder
    {
        OX.vd cf;
        
        public Builder(final JebInstance jebInstance) {
            this.cf = ((Yx)jebInstance.getGO()).wU();
        }
        
        public Constant buildNull() {
            return new Constant(this.cf.dN());
        }
        
        public Constant buildBoolean(final boolean b) {
            return new Constant(this.cf.dN(b));
        }
        
        public Constant buildByte(final byte b) {
            return new Constant(this.cf.dN(b));
        }
        
        public Constant buildChar(final char c) {
            return new Constant(this.cf.dN(c));
        }
        
        public Constant buildShort(final short n) {
            return new Constant(this.cf.dN(n));
        }
        
        public Constant buildInt(final int n) {
            return new Constant(this.cf.dN(n));
        }
        
        public Constant buildLong(final long n) {
            return new Constant(this.cf.dN(n));
        }
        
        public Constant buildFloat(final float n) {
            return new Constant(this.cf.dN(n));
        }
        
        public Constant buildDouble(final double n) {
            return new Constant(this.cf.dN(n));
        }
        
        public Constant buildString(final String s) {
            return new Constant(this.cf.dN(s));
        }
        
        public Constant buildNegativeValue(final Constant constant) {
            return new Constant(constant.object.dN(this.cf));
        }
    }
}
