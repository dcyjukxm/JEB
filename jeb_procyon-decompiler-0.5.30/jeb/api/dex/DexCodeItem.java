// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.Iterator;
import java.util.Arrays;
import jebglobal.TM;
import jebglobal.Wu;
import jebglobal.vD;
import jebglobal.nm;
import java.util.ArrayList;
import java.util.List;
import jebglobal.OM;

public class DexCodeItem
{
    private OM code;
    
    DexCodeItem(final OM code) {
        this.code = code;
    }
    
    public int getRegisterCount() {
        return this.code.zs();
    }
    
    public int getInputArgumentCount() {
        return this.code.mS();
    }
    
    public int getOutputArgumentCount() {
        return this.code.OK();
    }
    
    public List getExceptionItems() {
        final ArrayList<DexExceptionItem> list = new ArrayList<DexExceptionItem>();
        final nm[] lh = this.code.LH();
        for (int length = lh.length, i = 0; i < length; ++i) {
            list.add(new DexExceptionItem(lh[i]));
        }
        return list;
    }
    
    public DexDebugInfo getDebugInfo() {
        final vD kk = this.code.KK();
        if (kk == null) {
            return null;
        }
        return new DexDebugInfo(kk);
    }
    
    public int getInstructionsOffset() {
        return this.code.ld();
    }
    
    public int getInstructionsSize() {
        return this.code.QE();
    }
    
    public int getInstructionsCount() {
        return this.code.wU().size();
    }
    
    public List getInstructions() {
        final List wu = this.code.wU();
        if (wu == null) {
            return null;
        }
        final ArrayList list = new ArrayList<DexDalvikInstruction>(wu.size());
        for (final Wu wu2 : wu) {
            final Wu.vd[] ms = wu2.mS();
            final DexDalvikInstruction.Parameter[] array = new DexDalvikInstruction.Parameter[ms.length];
            for (int i = 0; i < array.length; ++i) {
                array[i] = new DexDalvikInstruction.Parameter(ms[i].dN(), ms[i].ld());
            }
            DexDalvikInstruction.SwitchData switchData = null;
            if (wu2.KK()) {
                final Wu.lX.uK[] ld = wu2.LH().ld();
                final DexDalvikInstruction.SwitchData.KeyTarget[] array2 = new DexDalvikInstruction.SwitchData.KeyTarget[ld.length];
                int n = 0;
                for (final Wu.lX.uK uk : ld) {
                    array2[n++] = new DexDalvikInstruction.SwitchData.KeyTarget(uk.dN(), uk.ld());
                }
                switchData = new DexDalvikInstruction.SwitchData(wu2.LH().dN(), array2);
            }
            DexDalvikInstruction.ArrayData arrayData = null;
            if (wu2.EO()) {
                arrayData = new DexDalvikInstruction.ArrayData(wu2.PF().dN(), TM.dN(wu2.PF().ld()));
            }
            list.add(new DexDalvikInstruction(wu2.dN(), Arrays.copyOf(wu2.zs(), wu2.zs().length), wu2.wU(), array, switchData, arrayData));
        }
        return list;
    }
}
