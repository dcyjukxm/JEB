// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;

public class Dc
{
    private static final long LK = 844563159190538443L;
    private rK ld;
    private GY QE;
    private int[][] wU;
    private HashMap fa;
    private HashMap zs;
    private HashMap mS;
    public boolean dN;
    private static int OK;
    
    public Dc(final rK ld, final byte[] array) {
        this.dN = false;
        this.ld = ld;
        this.QE = this.ld.mS();
        this.wU = new int[this.QE.dN.size()][];
        int n = 0;
        final Iterator<GY.uK> iterator = this.QE.dN.iterator();
        while (iterator.hasNext()) {
            final int ld2 = iterator.next().dN.ld();
            this.wU[n] = new int[ld2];
            for (int i = 0; i < ld2; ++i) {
                this.wU[n][i] = 0;
            }
            ++n;
        }
        int n2 = 0;
        if (array != null) {
            int n3 = 1;
            int n4 = 0;
            for (int j = 0; j < array.length; ++j) {
                n3 = (n3 + (array[j] & 0xFF)) % 65521;
                n4 = (n4 + n3) % 65521;
            }
            n2 = (n4 << 16 | n3);
        }
        if ((n2 + ld.ld() * ld.QE() % 10 & 0xFF) % 10 >= Dc.OK) {
            this.fa = new HashMap();
            this.zs = new HashMap();
            this.mS = new HashMap();
            this.dN = true;
        }
    }
    
    public HashMap dN() {
        if (this.fa != null) {
            return this.fa;
        }
        this.fa = new HashMap();
        int n = 0;
        for (final GY.uK uk : this.QE.dN) {
            final rK dn = uk.dN;
            for (final List<Integer> list : uk.ld.dN) {
                final int intValue = list.get(0);
                int n2 = 0;
                final ArrayList<Integer> list2 = new ArrayList<Integer>();
                for (final int intValue2 : dn.dN(intValue)) {
                    if (list.contains(intValue2)) {
                        list2.add(intValue2);
                        if (intValue2 <= n2) {
                            continue;
                        }
                        n2 = intValue2;
                    }
                }
                if (n2 > 0) {
                    if (n2 < intValue) {
                        throw new RuntimeException();
                    }
                    final int[] array = { intValue, n2 };
                    this.dN(this.QE, n, array);
                    final int n3 = array[0];
                    final int n4 = array[1];
                    if (this.wU[0][n3 - 1] != 0 || this.wU[0][n4 - 1] != 0) {
                        continue;
                    }
                    final ArrayList<Integer> list3 = new ArrayList<Integer>();
                    for (int i = n3; i <= n4; ++i) {
                        list3.add(i);
                    }
                    final int size = this.ld.QE(n3).size();
                    final int size2 = this.ld.QE(n4).size();
                    if (size <= 0 || size2 <= 0) {
                        throw new RuntimeException();
                    }
                    if (size != 1 && size != 2 && size2 != 1 && size2 != 2) {
                        continue;
                    }
                    lX lx;
                    if (size2 == 2) {
                        lx = lX.ld;
                    }
                    else if (size == 2) {
                        final List qe = this.ld.QE(n3);
                        if (list3.contains(qe.get(0)) && list3.contains(qe.get(1))) {
                            lx = lX.QE;
                        }
                        else {
                            lx = lX.dN;
                        }
                    }
                    else {
                        lx = lX.QE;
                    }
                    int n5 = 0;
                    if (lx == lX.ld) {
                        final List qe2 = this.ld.QE(n4);
                        if (qe2.get(0) == n3) {
                            n5 = qe2.get(1);
                        }
                        else {
                            if (qe2.get(1) != n3) {
                                throw new RuntimeException();
                            }
                            n5 = qe2.get(0);
                        }
                    }
                    else if (lx == lX.dN) {
                        final List qe3 = this.ld.QE(n3);
                        if (list3.contains(qe3.get(0))) {
                            n5 = qe3.get(1);
                        }
                        else {
                            if (!list3.contains(qe3.get(1))) {
                                throw new RuntimeException();
                            }
                            n5 = qe3.get(0);
                        }
                    }
                    this.wU[0][n3 - 1] = -1;
                    this.wU[0][n4 - 1] = 1;
                    this.fa.put(n3, new vd(n3, n4, n5, lx, list3));
                }
            }
            ++n;
        }
        return this.fa;
    }
    
    private void dN(final GY gy, int i, final int[] array) {
        int intValue = array[0];
        int n = array[1];
        while (i >= 1) {
            --i;
            final GY.uK uk = gy.dN.get(i);
            final rK dn = uk.dN;
            intValue = ((List<Integer>)uk.ld.dN.get(intValue - 1)).get(0);
            int n2 = 0;
            for (final int intValue2 : uk.ld.dN.get(n - 1)) {
                if (dn.QE(intValue2).contains(intValue) && intValue2 > n2) {
                    n2 = intValue2;
                }
            }
            n = n2;
        }
        array[0] = intValue;
        array[1] = n;
    }
    
    public HashMap ld() {
        if (this.zs != null) {
            return this.zs;
        }
        this.zs = new HashMap();
        final List ld = this.ld.ld(false);
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = this.ld.ld(); i >= 1; --i) {
            if (this.ld.QE(i).size() == 2 && this.wU[0][i - 1] <= 0) {
                int n = 0;
                int n2 = 1;
                final Iterator<Integer> iterator = ld.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() == i && this.ld.dN(n2).size() >= 2 && n2 > n) {
                        n = n2;
                    }
                    ++n2;
                }
                if (n > i) {
                    this.wU[0][i - 1] = 1;
                    this.zs.put(i, new uK(i, n));
                    for (final int intValue : set) {
                        if (intValue < n && this.ld.dN(i, intValue)) {
                            this.wU[0][intValue - 1] = 1;
                            this.zs.put(intValue, new uK(intValue, n));
                        }
                    }
                    set.clear();
                }
                else {
                    set.add(i);
                }
            }
        }
        return this.zs;
    }
    
    public HashMap QE() {
        if (this.mS != null) {
            return this.mS;
        }
        this.mS = new HashMap();
        final List ld = this.ld.ld(false);
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = this.ld.ld(); i >= 1; --i) {
            if (this.ld.QE(i).size() >= 3) {
                final int size = this.ld.QE(i).size();
                if (this.wU[0][i - 1] <= 0) {
                    int n = 0;
                    int n2 = 1;
                    final Iterator<Integer> iterator = ld.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next() == i && this.ld.dN(n2).size() >= size && n2 > n) {
                            n = n2;
                        }
                        ++n2;
                    }
                    if (n > i) {
                        this.wU[0][i - 1] = 1;
                        this.mS.put(i, new uK(i, n));
                        for (final int intValue : set) {
                            if (intValue < n && this.ld.dN(i, intValue)) {
                                this.wU[0][intValue - 1] = 1;
                                this.mS.put(intValue, new uK(intValue, n));
                            }
                        }
                        set.clear();
                    }
                    else {
                        set.add(i);
                    }
                }
            }
        }
        return this.mS;
    }
    
    static {
        Dc.OK = 8;
    }
    
    public enum lX
    {
        dN("PRE_TESTED", 0), 
        ld("POST_TESTED", 1), 
        QE("INFINITE", 2);
        
        private lX(final String s, final int n) {
        }
    }
    
    public static final class vd
    {
        public int dN;
        public lX ld;
        
        vd(final int n, final int dn, final int n2, final lX ld, final List list) {
            if (n <= 0 || dn <= 0) {
                throw new RuntimeException();
            }
            this.dN = dn;
            this.ld = ld;
        }
    }
    
    public static final class uK
    {
        public int dN;
        public int ld;
        
        uK(final int dn, final int ld) {
            if (dn <= 0) {
                throw new RuntimeException();
            }
            this.dN = dn;
            this.ld = ld;
        }
    }
}
