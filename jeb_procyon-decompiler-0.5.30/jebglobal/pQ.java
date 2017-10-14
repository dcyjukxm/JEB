// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class pQ extends as
{
    private yW KK;
    private String EO;
    
    public pQ(final yW kk, final WX wx) {
        super(null, wx.ld());
        wx.QE();
        this.ld = wx.fa();
        this.QE = wx.zs();
        this.KK = kk;
        this.EO = wx.dN();
    }
    
    @Override
    public boolean OK() {
        return true;
    }
    
    @Override
    public boolean LH() {
        this.KK.fa(this.EO);
        return true;
    }
}
