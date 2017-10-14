// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

public class DexDalvikInstruction
{
    public static final int TYPE_REG = 0;
    public static final int TYPE_IMM = 1;
    public static final int TYPE_IDX = 2;
    public static final int TYPE_BRA = 3;
    public static final int TYPE_RGR = 4;
    private int address;
    private byte[] code;
    private String mnemonic;
    private Parameter[] params;
    private SwitchData switchdata;
    private ArrayData arraydata;
    
    DexDalvikInstruction(final int address, final byte[] code, final String mnemonic, final Parameter[] params, final SwitchData switchdata, final ArrayData arraydata) {
        this.address = address;
        this.code = code;
        this.mnemonic = mnemonic;
        this.params = params;
        this.switchdata = switchdata;
        this.arraydata = arraydata;
    }
    
    public int getOffset() {
        return this.address;
    }
    
    public int getSize() {
        return this.code.length;
    }
    
    public String getMnemonic() {
        return this.mnemonic;
    }
    
    public byte[] getCode() {
        return this.code;
    }
    
    public Parameter[] getParameters() {
        return this.params;
    }
    
    public SwitchData getSwitchData() {
        return this.switchdata;
    }
    
    public ArrayData getArrayData() {
        return this.arraydata;
    }
    
    public static class Parameter
    {
        private int type;
        private long value;
        
        Parameter(final int type, final long value) {
            this.type = type;
            this.value = value;
        }
        
        public int getType() {
            return this.type;
        }
        
        public long getValue() {
            return this.value;
        }
    }
    
    public static class SwitchData
    {
        private int address;
        private KeyTarget[] elements;
        
        SwitchData(final int address, final KeyTarget[] elements) {
            this.address = address;
            this.elements = elements;
        }
        
        public int getOffset() {
            return this.address;
        }
        
        public KeyTarget[] getElements() {
            return this.elements;
        }
        
        public static class KeyTarget
        {
            private int key;
            private int target;
            
            KeyTarget(final int key, final int target) {
                this.key = key;
                this.target = target;
            }
            
            public int getKey() {
                return this.key;
            }
            
            public int getTarget() {
                return this.target;
            }
        }
    }
    
    public static class ArrayData
    {
        private int address;
        private byte[][] elements;
        
        ArrayData(final int address, final byte[][] elements) {
            this.address = address;
            this.elements = elements;
        }
        
        public int getOffset() {
            return this.address;
        }
        
        public byte[][] getElements() {
            return this.elements;
        }
    }
}
