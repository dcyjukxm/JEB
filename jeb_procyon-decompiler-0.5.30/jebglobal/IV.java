// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class IV extends Uo
{
    public IV(final hV hv, final YK yk, final tu[] array) {
        super(yk, array, hv, null, uK.QE);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("new " + this.dN + "(");
        int n = 0;
        for (final tu tu : this.QE) {
            if (n > 0) {
                sb.append(", ");
            }
            sb.append(tu);
            ++n;
        }
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public Xf dN(final TB tb) {
        this.dN.ld(false);
        final Pi pi = new Pi(this.dN, tb.mS.dN(this.ld.dN(), false));
        final tu[] qe = this.QE;
        for (int length = qe.length, i = 0; i < length; ++i) {
            pi.dN(qe[i].dN(tb));
        }
        return pi;
    }
}
