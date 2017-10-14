// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class Ky
{
    public String dN;
    public String ld;
    public String QE;
    public String wU;
    public String fa;
    public int zs;
    public int mS;
    
    public Ky() {
        this.dN = null;
        this.ld = null;
        this.QE = null;
        this.wU = null;
        this.fa = null;
        this.zs = -1;
        this.mS = -1;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("class=%s method=%s field=%s offset=%Xh method_fileoffset=%Xh", this.QE, this.wU, this.fa, this.zs, this.mS));
        return sb.toString();
    }
}
