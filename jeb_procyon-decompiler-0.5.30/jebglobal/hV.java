// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;

public final class hV
{
    private vd Hw;
    private String rK;
    private int Ux;
    private hV ZY;
    private hV s;
    public static final hV dN;
    public static final hV ld;
    public static final hV QE;
    public static final hV wU;
    public static final hV fa;
    public static final hV zs;
    public static final hV mS;
    public static final hV OK;
    public static final hV LH;
    public static final hV KK;
    public static final hV EO;
    public static final hV cb;
    public static final hV PF;
    
    private hV(final hV zy, final int ux, final hV s) {
        this.Hw = vd.PF;
        this.rK = null;
        this.Ux = ux;
        this.ZY = zy;
        this.s = s;
    }
    
    private hV(final String rk) {
        this.Hw = vd.PF;
        this.rK = rk;
        this.Ux = 0;
        this.ZY = null;
        this.s = null;
    }
    
    private hV(final vd hw) {
        if (hw == vd.PF) {
            throw new RuntimeException();
        }
        this.Hw = hw;
        this.rK = null;
        this.Ux = 0;
        this.ZY = null;
        this.s = null;
    }
    
    public static boolean dN(final String s) {
        return s.length() >= 3 && s.charAt(0) == 'L' && s.charAt(s.length() - 1) == ';';
    }
    
    public static String ld(final String s) {
        if (!dN(s)) {
            throw new RuntimeException();
        }
        return s.substring(1, s.length() - 1).replace('/', '.');
    }
    
    public static String QE(final String s) {
        if (!dN(s)) {
            throw new RuntimeException();
        }
        final String substring = s.substring(1, s.length() - 1);
        final int lastIndex = substring.lastIndexOf(47);
        if (lastIndex < 0) {
            return s;
        }
        return "L" + substring.substring(lastIndex + 1) + ";";
    }
    
    public static String wU(final String s) {
        if (!dN(s)) {
            throw new RuntimeException();
        }
        final String substring = s.substring(1, s.length() - 1);
        final int lastIndex = substring.lastIndexOf(47);
        if (lastIndex < 0) {
            return "";
        }
        return substring.substring(0, lastIndex).replace('/', '.');
    }
    
    public String dN() {
        if (!this.mS()) {
            throw new RuntimeException();
        }
        return this.rK;
    }
    
    public int ld() {
        if (!this.OK()) {
            throw new RuntimeException();
        }
        return this.Ux;
    }
    
    public hV QE() {
        if (!this.OK()) {
            throw new RuntimeException();
        }
        return this.ZY;
    }
    
    public hV wU() {
        if (!this.OK()) {
            throw new RuntimeException();
        }
        return this.s;
    }
    
    public boolean fa() {
        return this.Hw != vd.dN && this.Hw != vd.PF && this.Hw != vd.KK && this.Hw != vd.EO;
    }
    
    public boolean zs() {
        return this.Hw == vd.PF;
    }
    
    public boolean mS() {
        return this.Hw == vd.PF && !this.OK();
    }
    
    public boolean OK() {
        return this.Ux >= 1;
    }
    
    public boolean LH() {
        return this.mS() && this.rK.equals("Ljava/lang/String;");
    }
    
    public boolean dN(final boolean b) {
        vd vd = this.Hw;
        if (this.OK()) {
            vd = this.ZY.Hw;
        }
        switch (hV$1.dN[vd.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public void ld(final boolean b) {
        if (!this.dN(b)) {
            throw new RuntimeException();
        }
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public boolean dN(final hV hv) {
        return this.Hw == hv.Hw;
    }
    
    public String KK() {
        final StringBuilder sb = new StringBuilder();
        if (!this.OK()) {
            if (this.rK != null) {
                sb.append(this.rK);
            }
            else {
                sb.append(ld(this.Hw));
            }
        }
        else {
            for (int i = 0; i < this.Ux; ++i) {
                sb.append("[");
            }
            if (this.ZY.rK != null) {
                sb.append(this.ZY.rK);
            }
            else {
                sb.append(ld(this.ZY.Hw));
            }
        }
        return sb.toString();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        if (!this.OK()) {
            if (this.rK != null) {
                sb.append(ld(this.rK));
            }
            else {
                sb.append(this.dN(this.Hw));
            }
        }
        else {
            if (this.ZY.rK != null) {
                sb.append(ld(this.ZY.rK));
            }
            else {
                sb.append(this.dN(this.ZY.Hw));
            }
            for (int i = 0; i < this.Ux; ++i) {
                sb.append("[]");
            }
        }
        return sb.toString();
    }
    
    private String dN(final vd vd) {
        switch (hV$1.dN[vd.ordinal()]) {
            case 1: {
                return "void";
            }
            case 2: {
                return "boolean";
            }
            case 3: {
                return "byte";
            }
            case 4: {
                return "char";
            }
            case 5: {
                return "short";
            }
            case 6: {
                return "int";
            }
            case 7: {
                return "long";
            }
            case 8: {
                return "float";
            }
            case 9: {
                return "double";
            }
            case 11: {
                return "SREG";
            }
            case 12: {
                return "DREG";
            }
            case 13: {
                return "_int";
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public String dN(final String[] array) {
        if (!this.OK() || array.length > this.Ux) {
            if (this.Ux == -3) {
                System.out.println(Long.toString(790735650846998384L));
            }
            throw new RuntimeException();
        }
        final StringBuilder sb = new StringBuilder();
        if (this.ZY.rK != null) {
            sb.append(ld(this.ZY.rK));
        }
        else {
            sb.append(this.dN(this.ZY.Hw));
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(String.format("[%s]", array[i]));
        }
        for (int j = array.length; j < this.Ux; ++j) {
            sb.append("[]");
        }
        return sb.toString();
    }
    
    public boolean EO() {
        return this != hV.dN;
    }
    
    public boolean cb() {
        return this != hV.dN && this != hV.KK && this != hV.EO;
    }
    
    public boolean PF() {
        return this == hV.QE || this == hV.wU || this == hV.fa || this == hV.zs || this == hV.cb;
    }
    
    public boolean Hw() {
        return this == hV.QE || this == hV.wU || this == hV.fa || this == hV.zs || this == hV.mS;
    }
    
    public boolean rK() {
        switch (hV$1.dN[this.Hw.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 13: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean Ux() {
        switch (hV$1.dN[this.Hw.ordinal()]) {
            case 7:
            case 9:
            case 12: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean ld(final hV hv) {
        if (this == hV.dN || hv == null || hv == hV.dN) {
            throw new RuntimeException();
        }
        if (this == hV.cb) {
            switch (hV$1.dN[hv.Hw.ordinal()]) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 13: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        else if (this == hV.KK) {
            switch (hV$1.dN[hv.Hw.ordinal()]) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        else if (this == hV.EO) {
            switch (hV$1.dN[hv.Hw.ordinal()]) {
                case 7:
                case 9:
                case 12: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        else {
            if (this == hV.PF) {
                return hv.zs();
            }
            return this.equals(hv);
        }
    }
    
    public static hV dN(final hV hv, final hV hv2) {
        if (hv.dN(hv2)) {
            if (hv == hV.PF) {
                return hv2;
            }
            if (hv2 == hV.PF) {
                return hv;
            }
            return hv;
        }
        else {
            if (hv == hV.dN) {
                return hv2;
            }
            if (hv2 == hV.dN) {
                return hv;
            }
            if (hv == hV.cb) {
                switch (hV$1.dN[hv2.Hw.ordinal()]) {
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        return hv2;
                    }
                }
            }
            if (hv2 == hV.cb) {
                switch (hV$1.dN[hv.Hw.ordinal()]) {
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        return hv;
                    }
                }
            }
            if (hv == hV.KK) {
                switch (hV$1.dN[hv2.Hw.ordinal()]) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 10:
                    case 13: {
                        return hv2;
                    }
                }
            }
            if (hv2 == hV.KK) {
                switch (hV$1.dN[hv.Hw.ordinal()]) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 10:
                    case 13: {
                        return hv;
                    }
                }
            }
            if (hv == hV.EO) {
                switch (hV$1.dN[hv2.Hw.ordinal()]) {
                    case 7:
                    case 9: {
                        return hv2;
                    }
                }
            }
            if (hv2 == hV.EO) {
                switch (hV$1.dN[hv.Hw.ordinal()]) {
                    case 7:
                    case 9: {
                        return hv2;
                    }
                }
            }
            throw new RuntimeException();
        }
    }
    
    public static hV[] dN(final Bw bw, final uK uk) {
        final String[] ld = bw.ld(false);
        final int n = 1 + ld.length;
        final String[] array = new String[n];
        array[0] = bw.dN(false);
        for (int i = 1; i <= ld.length; ++i) {
            array[i] = ld[i - 1];
        }
        final hV[] array2 = new hV[n];
        for (int j = 0; j < n; ++j) {
            final String s = array[j];
            int n2 = 0;
            final String s2 = s;
            final int n3 = 0;
            ++n2;
            char c = s2.charAt(n3);
            int n4 = 0;
            while (c == '[') {
                ++n4;
                c = s.charAt(n2++);
            }
            hV hv = dN(c);
            if (hv == hV.PF) {
                hv = uk.dN(s.substring(n2 - 1));
            }
            if (n4 >= 1) {
                hv = uk.dN(hv, n4);
            }
            if (j >= 1 && hv == hV.dN) {
                throw new RuntimeException();
            }
            array2[j] = hv;
        }
        return array2;
    }
    
    public static hV dN(final char c) {
        switch (c) {
            case 'V': {
                return hV.dN;
            }
            case 'Z': {
                return hV.ld;
            }
            case 'B': {
                return hV.QE;
            }
            case 'C': {
                return hV.wU;
            }
            case 'S': {
                return hV.fa;
            }
            case 'I': {
                return hV.zs;
            }
            case 'J': {
                return hV.mS;
            }
            case 'F': {
                return hV.OK;
            }
            case 'D': {
                return hV.LH;
            }
            case 'L': {
                return hV.PF;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    private static char ld(final vd vd) {
        switch (hV$1.dN[vd.ordinal()]) {
            case 2: {
                return 'Z';
            }
            case 3: {
                return 'B';
            }
            case 4: {
                return 'C';
            }
            case 5: {
                return 'S';
            }
            case 6: {
                return 'I';
            }
            case 7: {
                return 'J';
            }
            case 8: {
                return 'F';
            }
            case 9: {
                return 'D';
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public static hV dN(final String s, final uK uk) {
        int n = 0;
        final int n2 = 0;
        ++n;
        char c = s.charAt(n2);
        int n3 = 0;
        while (c == '[') {
            ++n3;
            c = s.charAt(n++);
        }
        hV hv = dN(c);
        if (hv == hV.dN) {
            throw new RuntimeException();
        }
        if (hv == hV.PF) {
            hv = uk.dN(s.substring(n - 1));
        }
        if (n3 >= 1) {
            hv = uk.dN(hv, n3);
        }
        return hv;
    }
    
    public static hV dN(final hV hv, final boolean b) {
        if (b && (hv == hV.QE || hv == hV.wU || hv == hV.fa)) {
            return hV.cb;
        }
        if (!b && hv == hV.zs) {
            return hV.cb;
        }
        return hv;
    }
    
    static {
        dN = new hV(vd.dN);
        ld = new hV(vd.ld);
        QE = new hV(vd.QE);
        wU = new hV(vd.wU);
        fa = new hV(vd.fa);
        zs = new hV(vd.zs);
        mS = new hV(vd.mS);
        OK = new hV(vd.OK);
        LH = new hV(vd.LH);
        KK = new hV(vd.KK);
        EO = new hV(vd.EO);
        cb = new hV(vd.cb);
        PF = new hV("Lpnf/this/object/does/not/Exist;");
    }
    
    public static final class uK
    {
        private HashMap dN;
        private HashMap ld;
        
        public uK() {
            this.dN = new HashMap();
            this.ld = new HashMap();
        }
        
        public hV dN(final hV hv, final int n) {
            if (hv == hV.PF) {
                throw new RuntimeException();
            }
            if (hv.OK()) {
                throw new RuntimeException();
            }
            if (n <= 0) {
                throw new RuntimeException();
            }
            hV dn;
            if (n == 1) {
                dn = hv;
            }
            else {
                dn = this.dN(hv, n - 1);
            }
            HashMap<?, ?> hashMap = this.ld.get(hv);
            if (hashMap == null) {
                hashMap = new HashMap<Object, Object>();
                this.ld.put(hv, hashMap);
            }
            hV hv2 = hashMap.get(n);
            if (hv2 == null) {
                hv2 = new hV(hv, n, dn, null);
                hashMap.put(n, hv2);
            }
            return hv2;
        }
        
        public hV dN(final String s) {
            if (!hV.dN(s)) {
                throw new RuntimeException();
            }
            if (s.equals("Lpnf/this/object/does/not/Exist;")) {
                throw new RuntimeException();
            }
            hV hv = this.dN.get(s);
            if (hv == null) {
                hv = new hV(s, null);
                this.dN.put(s, hv);
            }
            return hv;
        }
    }
    
    enum vd
    {
        dN("VOID", 0), 
        ld("BOOLEAN", 1), 
        QE("BYTE", 2), 
        wU("CHAR", 3), 
        fa("SHORT", 4), 
        zs("INT", 5), 
        mS("LONG", 6), 
        OK("FLOAT", 7), 
        LH("DOUBLE", 8), 
        KK("SREG", 9), 
        EO("DREG", 10), 
        cb("SMALLINT", 11), 
        PF("OBJECT", 12);
        
        private vd(final String s, final int n) {
        }
    }
}
