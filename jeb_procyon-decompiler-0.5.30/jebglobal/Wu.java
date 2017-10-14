// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class Wu implements bm
{
    int dN;
    byte[] ld;
    He.uK QE;
    vd[] wU;
    lX fa;
    uK zs;
    
    public Wu() {
        this.dN = 0;
        this.ld = null;
        this.QE = null;
        this.wU = null;
        this.fa = null;
        this.zs = null;
    }
    
    public String wU() {
        return this.QE.QE;
    }
    
    public int fa() {
        return this.QE.dN;
    }
    
    @Override
    public int dN() {
        return this.dN;
    }
    
    @Override
    public int ld() {
        return this.ld.length;
    }
    
    public byte[] zs() {
        return this.ld;
    }
    
    public vd[] mS() {
        return this.wU;
    }
    
    public int OK() {
        return this.wU.length;
    }
    
    public int dN(final int n) {
        return this.wU[n].dN;
    }
    
    public long ld(final int n) {
        return this.wU[n].ld;
    }
    
    public lX LH() {
        if (this.fa == null) {
            throw new RuntimeException();
        }
        return this.fa;
    }
    
    public boolean KK() {
        return this.fa != null;
    }
    
    public boolean EO() {
        return this.zs != null;
    }
    
    public lX.uK[] cb() {
        if (this.fa == null) {
            throw new RuntimeException();
        }
        return this.fa.dN;
    }
    
    public uK PF() {
        if (this.zs == null) {
            throw new RuntimeException();
        }
        return this.zs;
    }
    
    public byte[][] Hw() {
        if (this.zs == null) {
            throw new RuntimeException();
        }
        return this.zs.dN;
    }
    
    @Override
    public boolean dN(final List list) {
        if (list != null) {
            list.clear();
        }
        switch (this.QE.dN) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 39: {
                return true;
            }
            case 40:
            case 41:
            case 42: {
                if (list != null) {
                    list.add(this.dN + 2 * (int)this.wU[0].ld);
                }
                return true;
            }
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61: {
                if (list != null) {
                    list.add(this.dN + this.ld.length);
                    list.add(this.dN + 2 * (int)this.wU[this.wU.length - 1].ld);
                }
                return true;
            }
            case 43:
            case 44: {
                if (list != null) {
                    list.add(this.dN + this.ld.length);
                    final lX.uK[] dn = this.fa.dN;
                    for (int length = dn.length, i = 0; i < length; ++i) {
                        list.add(this.dN + 2 * dn[i].dN);
                    }
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public boolean QE() {
        switch (this.QE.dN) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 39:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 147:
            case 148:
            case 158:
            case 159:
            case 179:
            case 180:
            case 190:
            case 191:
            case 211:
            case 212:
            case 219:
            case 220:
            case 255:
            case 511:
            case 767:
            case 1023:
            case 1279:
            case 1535:
            case 1791:
            case 2047:
            case 2303:
            case 2559:
            case 2815:
            case 3071:
            case 3327:
            case 3583:
            case 3839:
            case 4095:
            case 4351:
            case 4607:
            case 4863:
            case 5119:
            case 5375:
            case 5631:
            case 5887:
            case 6143:
            case 6399:
            case 6655:
            case 6911:
            case 7167:
            case 7423:
            case 7679:
            case 7935:
            case 8191:
            case 8447:
            case 8703:
            case 8959:
            case 9215:
            case 9471:
            case 9727:
            case 9983: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public void dN(final List list, final List list2, final Object o) {
        final int wu = this.QE.wU;
        if (wu < 0) {
            throw new RuntimeException();
        }
        list.clear();
        list2.clear();
        if ((wu & 0x10000) != 0x0) {
            if (this.QE.dN == 36 || (this.QE.dN >= 110 && this.QE.dN <= 114)) {
                for (int i = 1; i < this.wU.length; ++i) {
                    final int n = (int)this.wU[i].ld;
                    if (!list2.contains(n)) {
                        list2.add(n);
                    }
                }
            }
            else {
                if (this.QE.dN != 37 && (this.QE.dN < 116 || this.QE.dN > 120) && this.QE.dN != 1535 && (this.QE.dN < 8959 || this.QE.dN > 9983)) {
                    throw new RuntimeException();
                }
                final int n2 = (int)(this.wU[1].ld & -1L);
                for (int n3 = (int)(this.wU[1].ld >> 32 & -1L), j = n2; j <= n3; ++j) {
                    if (!list2.contains(j)) {
                        list2.add(j);
                    }
                }
            }
        }
        else {
            for (int k = wu >> 4 & 0xF, n4 = 0; k != 0; k >>= 1, ++n4) {
                if ((k & 0x1) != 0x0) {
                    final int n5 = (int)this.wU[n4].ld;
                    if (!list.contains(n5)) {
                        list.add(n5);
                    }
                }
            }
            for (int l = wu & 0xF, n6 = 0; l != 0; l >>= 1, ++n6) {
                if ((l & 0x1) != 0x0) {
                    final int n7 = (int)this.wU[n6].ld;
                    if (!list2.contains(n7)) {
                        list2.add(n7);
                    }
                }
            }
            for (int n8 = wu >> 12 & 0xF, n9 = 0; n8 != 0; n8 >>= 1, ++n9) {
                if ((n8 & 0x1) != 0x0) {
                    final int n10 = (int)this.wU[n9].ld;
                    if (!list.contains(n10)) {
                        list.add(n10);
                    }
                    if (!list.contains(n10 + 1)) {
                        list.add(n10 + 1);
                    }
                }
            }
            for (int n11 = wu >> 8 & 0xF, n12 = 0; n11 != 0; n11 >>= 1, ++n12) {
                if ((n11 & 0x1) != 0x0) {
                    final int n13 = (int)this.wU[n12].ld;
                    if (!list2.contains(n13)) {
                        list2.add(n13);
                    }
                    if (!list2.contains(n13 + 1)) {
                        list2.add(n13 + 1);
                    }
                }
            }
        }
    }
    
    public static boolean QE(final int n) {
        return n == 26 || n == 27;
    }
    
    public static boolean wU(final int n) {
        return n == 28 || n == 31 || n == 32 || n == 34 || n == 35 || n == 36 || n == 37 || n == 255 || n == 511 || n == 767 || n == 1023 || n == 1279 || n == 1535;
    }
    
    public static boolean fa(final int n) {
        return (n >= 82 && n <= 95) || (n >= 96 && n <= 109) || (n >= 1791 && n <= 5119) || (n >= 5375 && n <= 8703);
    }
    
    public static boolean zs(final int n) {
        return (n >= 110 && n <= 114) || (n >= 116 && n <= 120) || (n >= 8959 && n <= 9983);
    }
    
    public static final class vd
    {
        int dN;
        long ld;
        
        public vd(final int dn, final long ld) {
            this.dN = dn;
            this.ld = ld;
        }
        
        public int dN() {
            return this.dN;
        }
        
        public long ld() {
            return this.ld;
        }
    }
    
    public static final class lX
    {
        private int ld;
        uK[] dN;
        
        public lX(final int ld, final int n) {
            this.ld = ld;
            this.dN = new uK[n];
        }
        
        public int dN() {
            return this.ld;
        }
        
        public uK[] ld() {
            return this.dN;
        }
        
        public static final class uK
        {
            private int ld;
            int dN;
            
            public uK(final int ld, final int dn) {
                this.ld = ld;
                this.dN = dn;
            }
            
            public int dN() {
                return this.ld;
            }
            
            public int ld() {
                return this.dN;
            }
        }
    }
    
    public static final class uK
    {
        private int ld;
        byte[][] dN;
        
        public uK(final int ld, final int n, final int n2) {
            this.ld = ld;
            this.dN = new byte[n][n2];
        }
        
        public int dN() {
            return this.ld;
        }
        
        public byte[][] ld() {
            return this.dN;
        }
    }
}
