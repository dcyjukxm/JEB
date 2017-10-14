// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.ArrayList;
import java.util.List;
import jebglobal.ub;

public class DexValue
{
    public static final int VALUE_BYTE = 0;
    public static final int VALUE_SHORT = 2;
    public static final int VALUE_CHAR = 3;
    public static final int VALUE_INT = 4;
    public static final int VALUE_LONG = 6;
    public static final int VALUE_FLOAT = 16;
    public static final int VALUE_DOUBLE = 17;
    public static final int VALUE_STRING = 23;
    public static final int VALUE_TYPE = 24;
    public static final int VALUE_FIELD = 25;
    public static final int VALUE_METHOD = 26;
    public static final int VALUE_ENUM = 27;
    public static final int VALUE_ARRAY = 28;
    public static final int VALUE_ANNOTATION = 29;
    public static final int VALUE_NULL = 30;
    public static final int VALUE_BOOLEAN = 31;
    ub v;
    
    DexValue(final ub v) {
        this.v = v;
    }
    
    public int getType() {
        return this.v.dN();
    }
    
    public boolean isNull() {
        return this.v.ld();
    }
    
    public byte getByte() {
        return this.v.QE();
    }
    
    public short getShort() {
        return this.v.wU();
    }
    
    public char getChar() {
        return this.v.fa();
    }
    
    public int getInt() {
        return this.v.zs();
    }
    
    public long getLong() {
        return this.v.mS();
    }
    
    public float getFloat() {
        return this.v.OK();
    }
    
    public double getDouble() {
        return this.v.LH();
    }
    
    public int getStringIndex() {
        return this.v.KK();
    }
    
    public int getTypeIndex() {
        return this.v.EO();
    }
    
    public int getFieldIndex() {
        return this.v.cb();
    }
    
    public int getMethodIndex() {
        return this.v.PF();
    }
    
    public int getEnumIndex() {
        return this.v.Hw();
    }
    
    public List getArray() {
        final ArrayList<DexValue> list = new ArrayList<DexValue>();
        final ub[] rk = this.v.rK();
        for (int length = rk.length, i = 0; i < length; ++i) {
            list.add(new DexValue(rk[i]));
        }
        return list;
    }
    
    public DexAnnotation getAnnotation() {
        return new DexAnnotation(this.v.Ux());
    }
    
    public boolean getBoolean() {
        return this.v.ZY();
    }
}
