// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.nio.ByteBuffer;

public final class RI
{
    private static final long LK = 844563159190538443L;
    private final byte[] dN;
    private ByteBuffer ld;
    private HashMap QE;
    private Dn wU;
    private vd fa;
    private boolean zs;
    private int mS;
    private int OK;
    private int LH;
    private int KK;
    private uK EO;
    
    public RI(final byte[] dn, final HashMap qe, final Dn wu, final vd fa, final boolean zs) {
        this.dN = dn;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = zs;
        (this.ld = ByteBuffer.wrap(dn)).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    public oh dN(final int n, final int n2, final nm[] array) {
        this.mS = n;
        this.OK = n + n2;
        if (n < 0 || n >= this.dN.length || this.OK > this.dN.length || this.OK < n || n2 % 2 != 0) {
            throw new yL();
        }
        this.KK = 0;
        this.LH = n;
        Js js = null;
        final ArrayList<Js> list = new ArrayList<Js>();
        final HashMap<Object, Js> hashMap = new HashMap<Object, Js>();
        final HashMap<Integer, Wu> hashMap2 = new HashMap<Integer, Wu>();
        final ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
        arrayDeque.push(this.KK);
        int n3 = 1;
        final HashSet<Integer> set = new HashSet<Integer>();
        int n4 = 0;
        while (true) {
            if (n3 != 0) {
                if (arrayDeque.isEmpty()) {
                    if (array == null) {
                        break;
                    }
                    if (n4 == 0) {
                        for (final nm nm : array) {
                            final int dn = nm.dN();
                            if (dn < n2) {
                                arrayDeque.add(dn);
                            }
                            final int qe = nm.QE();
                            if (qe < n2) {
                                set.add(qe);
                                int j = qe - 2;
                                while (j > dn) {
                                    final Wu wu = hashMap2.get(j);
                                    if (wu != null) {
                                        if (j + wu.ld() != qe) {
                                            break;
                                        }
                                        set.remove(qe);
                                        if (!wu.dN(null)) {
                                            arrayDeque.add(qe);
                                            break;
                                        }
                                        break;
                                    }
                                    else {
                                        j -= 2;
                                    }
                                }
                            }
                        }
                        arrayDeque.addAll(this.dN(array));
                    }
                    else {
                        if (n4 != 1) {
                            break;
                        }
                        for (final int intValue : set) {
                            int k = intValue - 2;
                            while (k > 0) {
                                final Wu wu2 = hashMap2.get(k);
                                if (wu2 != null) {
                                    if (k + wu2.ld() == intValue && !wu2.dN(null)) {
                                        arrayDeque.add(intValue);
                                        break;
                                    }
                                    break;
                                }
                                else {
                                    k -= 2;
                                }
                            }
                        }
                        set.clear();
                    }
                    n3 = 1;
                    ++n4;
                    continue;
                }
                else {
                    this.KK = arrayDeque.pop();
                    this.LH = n + this.KK;
                    js = hashMap.get(this.KK);
                    if (js != null) {
                        if (((Wu)js.dN.get(0)).dN() == this.KK) {
                            continue;
                        }
                        int n5 = -1;
                        int n6 = 0;
                        final Iterator iterator2 = js.dN.iterator();
                        while (iterator2.hasNext()) {
                            if (iterator2.next().dN() == this.KK) {
                                n5 = n6;
                                break;
                            }
                            ++n6;
                        }
                        if (n5 < 0) {
                            throw new RuntimeException();
                        }
                        final Js js2 = new Js();
                        list.add(js2);
                        for (int l = n5; l < js.dN.size(); ++l) {
                            final Wu wu3 = js.dN.get(l);
                            js2.dN.add(wu3);
                            hashMap.put(wu3.dN(), js2);
                        }
                        js2.ld = new ArrayList(js.ld);
                        for (int n7 = js.dN.size() - n5, n8 = 0; n8 < n7; ++n8) {
                            js.dN.remove(n5);
                        }
                        js.ld.clear();
                        js.ld.add(this.KK);
                        continue;
                    }
                    else {
                        js = new Js();
                        list.add(js);
                        n3 = 0;
                    }
                }
            }
            final Js js3 = hashMap.get(this.KK);
            if (js3 != null) {
                if (js.dN.isEmpty()) {
                    throw new RuntimeException();
                }
                js.ld.add(((Wu)js3.dN.get(0)).dN());
                n3 = 1;
            }
            else {
                final Wu dn2 = this.dN();
                if (dn2 == null) {
                    cn.dN(String.format("Offset %Xh (method=%Xh/%Xh): Parsing error (%s)", this.LH, n, n2, this.EO));
                    n3 = 1;
                }
                else {
                    js.dN.add(dn2);
                    hashMap.put(this.KK, js);
                    hashMap2.put(this.KK, dn2);
                    final ArrayList<Integer> list2 = new ArrayList<Integer>();
                    if (dn2.dN(list2)) {
                        for (final int intValue2 : list2) {
                            if (intValue2 >= 0) {
                                if (intValue2 >= n2) {
                                    continue;
                                }
                                js.ld.add(intValue2);
                                arrayDeque.push(intValue2);
                            }
                        }
                        n3 = 1;
                    }
                    else {
                        this.LH += dn2.ld();
                        this.KK += dn2.ld();
                    }
                }
            }
        }
        if (array != null) {
            for (final nm nm2 : array) {
                final int dn3 = nm2.dN();
                final int qe2 = nm2.QE();
                final List fa = nm2.fa();
                for (final Js js4 : list) {
                    if (js4.dN.isEmpty()) {
                        cn.dN("Empty basic block");
                    }
                    else {
                        final int dn4 = js4.dN.get(0).dN();
                        if (dn4 < dn3 || dn4 >= qe2) {
                            continue;
                        }
                        for (final int intValue3 : fa) {
                            if (!js4.QE.contains(intValue3)) {
                                js4.QE.add(intValue3);
                            }
                        }
                    }
                }
            }
        }
        return new oh(list);
    }
    
    private Wu dN() {
        if (this.LH < this.mS || this.LH >= this.OK) {
            this.EO = uK.ld;
            return null;
        }
        int n = this.ld.get(this.LH) & 0xFF;
        He.uK qe = He.dN[n];
        if (n == 255 && this.zs) {
            if (this.LH + 1 >= this.OK) {
                this.EO = uK.ld;
                return null;
            }
            final int n2 = this.ld.get(this.LH + 1) & 0xFF;
            if (n2 >= He.ld.length) {
                this.EO = uK.LH;
                return null;
            }
            n = (this.ld.getShort(this.LH) & 0xFFFF);
            qe = He.ld[n2];
        }
        final int n3 = 2 * dN(qe);
        if (this.LH + n3 <= this.LH || this.LH + n3 > this.OK) {
            this.EO = uK.ld;
            return null;
        }
        final Wu wu = new Wu();
        wu.dN = this.LH - this.mS;
        wu.ld = new byte[n3];
        for (int i = 0; i < n3; ++i) {
            wu.ld[i] = this.ld.get(this.LH + i);
        }
        wu.QE = qe;
        final int n4 = this.ld.get(this.LH + 1) & 0xFF;
        final ArrayList<Wu.vd> list = new ArrayList<Wu.vd>(3);
        if (dN(qe, "10x")) {
            if (n != 0 && n != 14) {
                if (n >= 227 && n <= 254) {
                    this.EO = uK.wU;
                }
                else {
                    this.EO = uK.QE;
                }
                return null;
            }
        }
        else if (dN(qe, "12x", "11n")) {
            final int n5 = n4 & 0xF;
            final int n6 = n4 >> 4 & 0xF;
            list.add(new Wu.vd(0, n5));
            if (dN(qe, "12x")) {
                list.add(new Wu.vd(0, n6));
            }
            else if (dN(qe, "11n")) {
                list.add(new Wu.vd(1, ((n6 & 0x8) == 0x0) ? n6 : (n6 | 0xFFFFFFF0)));
            }
        }
        else if (dN(qe, "11x", "10t")) {
            if (dN(qe, "11x")) {
                list.add(new Wu.vd(0, n4));
            }
            else if (dN(qe, "10t")) {
                list.add(new Wu.vd(3, this.ld.get(this.LH + 1)));
            }
        }
        else if (dN(qe, "20t")) {
            if (n4 != 0) {
                this.EO = uK.fa;
                return null;
            }
            list.add(new Wu.vd(3, this.ld.getShort(this.LH + 2)));
        }
        else {
            if (dN(qe, "20bc")) {
                this.EO = uK.KK;
                return null;
            }
            if (dN(qe, "22x", "21t", "21s", "21h", "21c")) {
                final int n7 = this.ld.get(this.LH + 1) & 0xFF;
                final long n8 = this.ld.getShort(this.LH + 2);
                list.add(new Wu.vd(0, n7));
                if (dN(qe, "22x")) {
                    list.add(new Wu.vd(0, n8 & 0xFFFFL));
                }
                else if (dN(qe, "21t")) {
                    list.add(new Wu.vd(3, n8));
                }
                else if (dN(qe, "21s")) {
                    list.add(new Wu.vd(1, n8));
                }
                else if (dN(qe, "21h")) {
                    if (n == 21) {
                        list.add(new Wu.vd(1, n8 << 16));
                    }
                    else {
                        list.add(new Wu.vd(1, n8 << 48));
                    }
                }
                else {
                    list.add(new Wu.vd(2, n8 & 0xFFFFL));
                }
            }
            else if (dN(qe, "23x", "22b")) {
                final int n9 = this.ld.get(this.LH + 1) & 0xFF;
                final int n10 = this.ld.get(this.LH + 2) & 0xFF;
                list.add(new Wu.vd(0, n9));
                list.add(new Wu.vd(0, n10));
                if (dN(qe, "23x")) {
                    list.add(new Wu.vd(0, this.ld.get(this.LH + 3) & 0xFF));
                }
                else {
                    list.add(new Wu.vd(1, this.ld.get(this.LH + 3)));
                }
            }
            else if (dN(qe, "22t", "22s", "22c", "22cs")) {
                final byte b = (byte)(this.ld.get(this.LH + 1) & 0xF);
                final int n11 = this.ld.get(this.LH + 1) >> 4 & 0xF;
                list.add(new Wu.vd(0, b));
                list.add(new Wu.vd(0, n11));
                final short short1 = this.ld.getShort(this.LH + 2);
                if (dN(qe, "22t")) {
                    list.add(new Wu.vd(3, short1));
                }
                else if (dN(qe, "22s")) {
                    list.add(new Wu.vd(1, short1));
                }
                else {
                    if (!dN(qe, "22c")) {
                        this.EO = uK.KK;
                        return null;
                    }
                    list.add(new Wu.vd(2, short1 & 0xFFFF));
                }
            }
            else if (dN(qe, "30t")) {
                if (this.ld.get(this.LH + 1) != 0) {
                    this.EO = uK.fa;
                    return null;
                }
                list.add(new Wu.vd(3, this.ld.getInt(this.LH + 2)));
            }
            else if (dN(qe, "32x")) {
                if (this.ld.get(this.LH + 1) != 0) {
                    this.EO = uK.fa;
                    return null;
                }
                final int n12 = this.ld.getShort(this.LH + 2) & 0xFFFF;
                final int n13 = this.ld.getShort(this.LH + 4) & 0xFFFF;
                list.add(new Wu.vd(0, n12));
                list.add(new Wu.vd(0, n13));
            }
            else if (dN(qe, "31i", "31t", "31c")) {
                final int n14 = this.ld.get(this.LH + 1) & 0xFF;
                final int int1 = this.ld.getInt(this.LH + 2);
                list.add(new Wu.vd(0, n14));
                if (dN(qe, "31i")) {
                    list.add(new Wu.vd(1, int1));
                }
                else if (dN(qe, "31t")) {
                    list.add(new Wu.vd(3, int1));
                    final int n15 = this.LH + 2 * int1;
                    if (n15 < this.LH || n15 > this.OK) {
                        this.EO = uK.ld;
                        return null;
                    }
                    if (qe.QE.equals("packed-switch")) {
                        final int n16 = n15 + 8;
                        if (n16 < n15 || n16 > this.OK) {
                            this.EO = uK.ld;
                            return null;
                        }
                        if (this.ld.getShort(n15) != 256) {
                            this.EO = uK.zs;
                            return null;
                        }
                        final int n17 = this.ld.getShort(n15 + 2) & 0xFFFF;
                        final int int2 = this.ld.getInt(n15 + 4);
                        final int n18 = n15 + 2 * (n17 * 2 + 4);
                        if (n18 < n15 || n18 > this.OK) {
                            this.EO = uK.ld;
                            return null;
                        }
                        final Wu.lX fa = new Wu.lX(n15 - this.mS, n17);
                        for (int j = 0; j < n17; ++j) {
                            fa.dN[j] = new Wu.lX.uK(int2 + j, this.ld.getInt(n15 + 8 + 4 * j));
                        }
                        wu.fa = fa;
                    }
                    else if (qe.QE.equals("sparse-switch")) {
                        final int n19 = n15 + 4;
                        if (n19 < n15 || n19 > this.OK) {
                            this.EO = uK.ld;
                            return null;
                        }
                        if (this.ld.getShort(n15) != 512) {
                            this.EO = uK.zs;
                            return null;
                        }
                        final int n20 = this.ld.getShort(n15 + 2) & 0xFFFF;
                        final int n21 = n15 + 2 * (n20 * 4 + 2);
                        if (n21 < n15 || n21 > this.OK) {
                            this.EO = uK.ld;
                            return null;
                        }
                        final Wu.lX fa2 = new Wu.lX(n15 - this.mS, n20);
                        final int[] array = new int[n20];
                        for (int k = 0; k < n20; ++k) {
                            array[k] = this.ld.getInt(n15 + 4 + 4 * k);
                        }
                        for (int l = 0; l < n20; ++l) {
                            fa2.dN[l] = new Wu.lX.uK(array[l], this.ld.getInt(n15 + 4 + 4 * n20 + 4 * l));
                        }
                        wu.fa = fa2;
                    }
                    else if (qe.QE.equals("fill-array-data")) {
                        final int n22 = n15 + 8;
                        if (n22 < n15 || n22 > this.OK) {
                            this.EO = uK.ld;
                            return null;
                        }
                        if (this.ld.getShort(n15) != 768) {
                            this.EO = uK.zs;
                            return null;
                        }
                        final int n23 = this.ld.getShort(n15 + 2) & 0xFFFF;
                        final int int3 = this.ld.getInt(n15 + 4);
                        final int n24 = n15 + 2 * ((int3 * n23 + 1) / 2 + 4);
                        if (n24 < n15 || n24 > this.OK) {
                            this.EO = uK.ld;
                            return null;
                        }
                        final Wu.uK zs = new Wu.uK(n15 - this.mS, int3, n23);
                        for (int n25 = 0; n25 < int3; ++n25) {
                            for (int n26 = 0; n26 < n23; ++n26) {
                                zs.dN[n25][n26] = this.ld.get(n15 + 8 + n25 * n23 + n26);
                            }
                        }
                        wu.zs = zs;
                    }
                }
                else {
                    list.add(new Wu.vd(2, int1));
                }
            }
            else if (dN(qe, "35c", "35ms", "35mi")) {
                final int n27 = n4 >> 4;
                if (n27 > 5) {
                    this.EO = uK.mS;
                    return null;
                }
                final int n28 = this.ld.getShort(this.LH + 2) & 0xFFFF;
                final int[] array2 = { 0, 0, 0, 0, 0 };
                final short short2 = this.ld.getShort(this.LH + 4);
                array2[0] = (short2 & 0xF);
                array2[1] = (short2 >> 4 & 0xF);
                array2[2] = (short2 >> 8 & 0xF);
                array2[3] = (short2 >> 12 & 0xF);
                array2[4] = (n4 & 0xF);
                if (!dN(qe, "35c")) {
                    this.EO = uK.KK;
                    return null;
                }
                list.add(new Wu.vd(2, n28));
                for (int n29 = 0; n29 < n27; ++n29) {
                    list.add(new Wu.vd(0, array2[n29]));
                }
            }
            else if (dN(qe, "3rc", "3rms", "3rmi")) {
                final int n30 = this.ld.get(this.LH + 1) & 0xFF;
                final int n31 = this.ld.getShort(this.LH + 2) & 0xFFFF;
                final int n32 = this.ld.getShort(this.LH + 4) & 0xFFFF;
                if (!dN(qe, "3rc")) {
                    this.EO = uK.KK;
                    return null;
                }
                list.add(new Wu.vd(2, n31));
                list.add(new Wu.vd(4, n32 | n32 + n30 - 1 << 32));
            }
            else if (dN(qe, "51l")) {
                final int n33 = this.ld.get(this.LH + 1) & 0xFF;
                final long long1 = this.ld.getLong(this.LH + 2);
                list.add(new Wu.vd(0, n33));
                list.add(new Wu.vd(1, long1));
            }
            else if (dN(qe, "41c")) {
                final int int4 = this.ld.getInt(this.LH + 2);
                list.add(new Wu.vd(0, this.ld.getShort(this.LH + 6) & 0xFFFF));
                list.add(new Wu.vd(2, int4));
            }
            else if (dN(qe, "52c")) {
                final int int5 = this.ld.getInt(this.LH + 2);
                final int n34 = this.ld.getShort(this.LH + 6) & 0xFFFF;
                final int n35 = this.ld.getShort(this.LH + 8) & 0xFFFF;
                list.add(new Wu.vd(0, n34));
                list.add(new Wu.vd(0, n35));
                list.add(new Wu.vd(2, int5));
            }
            else {
                if (!dN(qe, "5rc")) {
                    this.EO = uK.KK;
                    return null;
                }
                final int int6 = this.ld.getInt(this.LH + 2);
                final int n36 = this.ld.getShort(this.LH + 6) & 0xFFFF;
                final int n37 = this.ld.getShort(this.LH + 8) & 0xFFFF;
                list.add(new Wu.vd(2, int6));
                list.add(new Wu.vd(4, n37 | n37 + n36 - 1 << 32));
            }
        }
        if (this.fa != null) {
            for (final Wu.vd vd : list) {
                if (vd.dN == 2) {
                    final int n38 = (int)vd.ld;
                    if (n38 < 0) {
                        this.EO = uK.OK;
                        return null;
                    }
                    if (Wu.QE(n)) {
                        if (n38 >= this.fa.dN) {
                            this.EO = uK.OK;
                            return null;
                        }
                        continue;
                    }
                    else if (Wu.wU(n)) {
                        if (n38 >= this.fa.ld) {
                            this.EO = uK.OK;
                            return null;
                        }
                        continue;
                    }
                    else if (Wu.fa(n)) {
                        if (n38 >= this.fa.QE) {
                            this.EO = uK.OK;
                            return null;
                        }
                        continue;
                    }
                    else {
                        if (!Wu.zs(n)) {
                            throw new RuntimeException();
                        }
                        if (n38 >= this.fa.wU) {
                            this.EO = uK.OK;
                            return null;
                        }
                        continue;
                    }
                }
            }
        }
        list.toArray(wu.wU = new Wu.vd[list.size()]);
        if (this.QE != null) {
            for (final Wu.vd vd2 : list) {
                if (vd2.dN == 1 && !this.QE.containsKey(vd2.ld)) {
                    this.QE.put(vd2.ld, vd2.ld);
                }
            }
        }
        if (this.wU != null) {
            for (final Wu.vd vd3 : list) {
                if (vd3.dN == 2) {
                    final int n39 = (int)vd3.ld;
                    if (Wu.QE(n)) {
                        this.wU.dN(n39, this.LH);
                    }
                    else if (Wu.wU(n)) {
                        this.wU.ld(n39, this.LH);
                    }
                    else if (Wu.fa(n)) {
                        this.wU.QE(n39, this.LH);
                    }
                    else {
                        if (!Wu.zs(n)) {
                            continue;
                        }
                        this.wU.wU(n39, this.LH);
                    }
                }
            }
        }
        this.EO = uK.dN;
        return wu;
    }
    
    private static boolean dN(final He.uK uk, final String s) {
        return uk.ld.equals(s);
    }
    
    private static boolean dN(final He.uK uk, final String s, final String s2) {
        return uk.ld.equals(s) || uk.ld.equals(s2);
    }
    
    private static boolean dN(final He.uK uk, final String s, final String s2, final String s3) {
        return uk.ld.equals(s) || uk.ld.equals(s2) || uk.ld.equals(s3);
    }
    
    private static boolean dN(final He.uK uk, final String s, final String s2, final String s3, final String s4) {
        return uk.ld.equals(s) || uk.ld.equals(s2) || uk.ld.equals(s3) || uk.ld.equals(s4);
    }
    
    private static boolean dN(final He.uK uk, final String s, final String s2, final String s3, final String s4, final String s5) {
        return uk.ld.equals(s) || uk.ld.equals(s2) || uk.ld.equals(s3) || uk.ld.equals(s4) || uk.ld.equals(s5);
    }
    
    private static int dN(final He.uK uk) {
        if (uk.ld.length() != 3 && uk.ld.length() != 4) {
            throw new RuntimeException();
        }
        return uk.ld.codePointAt(0) - 48;
    }
    
    public List dN(final nm[] array) {
        final HashSet<Object> set = new HashSet<Object>();
        for (int length = array.length, i = 0; i < length; ++i) {
            set.addAll(array[i].fa());
        }
        return new ArrayList(set);
    }
    
    public static final class vd
    {
        int dN;
        int ld;
        int QE;
        int wU;
        
        public vd(final int dn, final int ld, final int qe, final int wu) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            this.wU = wu;
        }
    }
    
    enum uK
    {
        dN("NO_ERROR", 0), 
        ld("OUT_OF_BOUNDARIES", 1), 
        QE("RESERVED_OPCODE", 2), 
        wU("OPTIMIZED_OPCODE", 3), 
        fa("INVALID_OPCODE_FORMAT", 4), 
        zs("INVALID_PSEUDO_INSTRUCTION_ID", 5), 
        mS("INVALID_ARGUMENT_COUNT", 6), 
        OK("INVALID_INDEX", 7), 
        LH("INVALID_EXTENDED_OPCODE", 8), 
        KK("UNIMPLEMENTED_ENCODING_FORMAT", 9);
        
        private uK(final String s, final int n) {
        }
        
        @Override
        public String toString() {
            switch (RI$1.dN[this.ordinal()]) {
                case 1: {
                    return "No error";
                }
                case 2: {
                    return "Out of bytecode boundaries";
                }
                case 3: {
                    return "Reserved opcode";
                }
                case 4: {
                    return "Optimized opcode";
                }
                case 5: {
                    return "Invalid opcode format";
                }
                case 6: {
                    return "Invalid pseudo instruction ID";
                }
                case 7: {
                    return "Invalid argument count";
                }
                case 8: {
                    return "Invalid pool index";
                }
                case 9: {
                    return "Invalid extended opcode";
                }
                case 10: {
                    return "Unimplemented encoding format";
                }
                default: {
                    return "Unknown error";
                }
            }
        }
    }
}
