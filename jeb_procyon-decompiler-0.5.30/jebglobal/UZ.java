// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;

public final class UZ
{
    private AR dN;
    private HashMap ld;
    
    public UZ(final AR dn) {
        this.ld = new HashMap();
        this.dN = dn;
        this.dN();
    }
    
    private void dN() {
        final int ld = this.dN.mS().ld("Ljava/lang/Object;");
        final HashSet<Integer> set = new HashSet<Integer>();
        for (final yK yk : this.dN.Hw()) {
            final uK uk = new uK(yk.zs());
            uk.ld = yk.Hw();
            if (uk.ld < 0) {
                uk.ld = ld;
            }
            if (uk.ld >= 0) {
                set.add(uk.ld);
            }
            for (final int n : yk.rK()) {
                uk.QE.add(n);
                set.add(n);
            }
            this.ld.put(uk.dN, uk);
        }
        for (final int intValue : set) {
            if (this.ld.containsKey(intValue)) {
                continue;
            }
            this.ld.put(intValue, new uK(intValue));
        }
        for (final int intValue2 : this.ld.keySet()) {
            final uK uk2 = this.ld.get(intValue2);
            for (final int intValue3 : this.ld.keySet()) {
                if (intValue3 == intValue2) {
                    continue;
                }
                final uK uk3 = this.ld.get(intValue3);
                if (uk3.ld == intValue2) {
                    uk2.wU.add(intValue3);
                }
                final Iterator iterator5 = uk3.QE.iterator();
                while (iterator5.hasNext()) {
                    if (iterator5.next() == intValue2) {
                        uk2.wU.add(intValue3);
                    }
                }
            }
        }
        int n2 = 0;
        final Iterator<hO> iterator6 = (Iterator<hO>)this.dN.cb().iterator();
        while (iterator6.hasNext()) {
            final uK uk4 = this.ld.get(iterator6.next().zs().dN());
            if (uk4 != null) {
                uk4.fa.add(n2);
            }
            ++n2;
        }
        int n3 = 0;
        final Iterator<gE> iterator7 = (Iterator<gE>)this.dN.KK().iterator();
        while (iterator7.hasNext()) {
            final uK uk5 = this.ld.get(iterator7.next().zs().dN());
            if (uk5 != null) {
                uk5.zs.add(n3);
            }
            ++n3;
        }
    }
    
    public uK dN(final int n) {
        return this.ld.get(n);
    }
    
    public static final class uK
    {
        public int dN;
        public int ld;
        public List QE;
        public List wU;
        public List fa;
        public List zs;
        
        uK(final int dn) {
            this.dN = dn;
            this.ld = -1;
            this.QE = new ArrayList();
            this.wU = new ArrayList();
            this.fa = new ArrayList();
            this.zs = new ArrayList();
        }
    }
}
