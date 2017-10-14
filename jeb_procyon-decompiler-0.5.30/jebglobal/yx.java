// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.io.IOException;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Control;
import java.util.List;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import java.io.File;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;

public final class yx extends Composite
{
    private static final long LK = 844563159190538443L;
    private yW dN;
    private uK ld;
    private qS QE;
    private SashForm wU;
    private ly fa;
    private Co zs;
    private tS mS;
    private NB OK;
    private NB LH;
    private lW KK;
    private hF EO;
    private Pl cb;
    private Os PF;
    private lF Hw;
    private lF rK;
    private lF Ux;
    private lF ZY;
    private lF s;
    private uT Hv;
    private ew VX;
    private AR ci;
    private Rg bG;
    private File BQ;
    private Nz Ee;
    
    yx(final Composite composite, final yW dn) {
        super(composite, 0);
        this.setLayout((Layout)new FillLayout());
        this.dN = dn;
        this.ld = uK.dN;
    }
    
    public yW dN() {
        return this.dN;
    }
    
    public ew ld() {
        return this.VX;
    }
    
    public AR QE() {
        return this.ci;
    }
    
    public Rg wU() {
        return this.bG;
    }
    
    public Nz fa() {
        return this.Ee;
    }
    
    public List zs() {
        final List ld = this.zs.ld();
        ld.add(this.fa);
        return ld;
    }
    
    public ly mS() {
        return this.fa;
    }
    
    public Pl OK() {
        return this.cb;
    }
    
    public hF LH() {
        return this.EO;
    }
    
    public void KK() {
        this.zs.dN((Control)this.EO, true);
        this.EO.setFocus();
    }
    
    public void EO() {
        this.KK();
        this.cb.setFocus();
    }
    
    public Os cb() {
        return this.PF;
    }
    
    public void PF() {
        this.zs.dN((Control)this.PF, true);
        this.PF.setFocus();
    }
    
    public tS Hw() {
        return this.mS;
    }
    
    public void rK() {
        if (this.mS == null) {
            return;
        }
        this.zs.dN((Control)this.mS, true);
        this.mS.setFocus();
    }
    
    public uT Ux() {
        return this.Hv;
    }
    
    public void ZY() {
        if (this.Hv == null) {
            return;
        }
        this.zs.dN((Control)this.Hv, true);
        this.Hv.setFocus();
    }
    
    public boolean s() {
        return this.ld != uK.dN;
    }
    
    public boolean dN(final int n) {
        if (this.ld == uK.dN) {
            return true;
        }
        if (this.ld != uK.QE) {
            throw new RuntimeException();
        }
        this.ld = uK.wU;
        if (this.zs != null) {
            this.zs.QE();
        }
        final Control[] children = this.getChildren();
        for (int length = children.length, i = 0; i < length; ++i) {
            children[i].dispose();
        }
        this.VX = null;
        this.ci = null;
        this.bG = null;
        this.BQ = null;
        this.Ee = null;
        this.wU = null;
        this.fa = null;
        this.zs = null;
        this.mS = null;
        this.OK = null;
        this.LH = null;
        this.KK = null;
        if (this.cb != null) {
            this.cb.EO();
            this.cb = null;
        }
        this.EO = null;
        if (this.PF != null) {
            this.PF.EO();
            this.PF = null;
        }
        this.Hw = null;
        this.rK = null;
        this.Ux = null;
        this.ZY = null;
        this.s = null;
        this.Hv = null;
        this.QE = new qS(this, HC.dN().dN("icon-jeb-128.png"));
        this.layout();
        this.ld = uK.dN;
        return true;
    }
    
    public boolean Hv() {
        return this.VX.ld();
    }
    
    public String dN(final String s) {
        if (!this.dN(2)) {
            return null;
        }
        if (this.ld != uK.dN) {
            throw new RuntimeException();
        }
        cn.dN(String.format("Opening %s", s));
        this.ld = uK.ld;
        if (this.QE != null) {
            this.QE.dispose();
            this.QE = null;
        }
        if ((TM.KK(s) & 0xFFFFFF) != 0x42444A) {
            this.VX = this.dN.dN(s, false);
        }
        else {
            this.VX = this.dN.wU(s);
        }
        if (this.VX == null) {
            this.ld = uK.dN;
            cn.dN("Invalid file or file does not exist");
            return null;
        }
        final TM eo = this.dN.EO();
        (this.ci = new AR(this.VX.ld("classes.dex"))).dN(eo.ld(WV.kq));
        this.ci.ld(eo.ld(WV.ir));
        this.ci.QE(eo.ld(WV.rF));
        this.ci.wU(eo.ld(WV.IL));
        BusyIndicator.showWhile(this.getDisplay(), (Runnable)new LU(this));
        if (this.ci == null) {
            this.ld = uK.dN;
            return null;
        }
        cn.dN("DEX analysis complete");
        this.dN.zs(true);
        this.dN.dN(this.VX, this.ci);
        this.bG = new Rg(this.ci);
        if (this.BQ == null) {
            this.BQ = this.dN.dN(this.VX);
        }
        if (this.BQ != null) {
            try {
                final File file = new File(this.BQ, "values/public.xml");
                if (file.exists()) {
                    (this.Ee = new Nz()).dN(file);
                }
                else {
                    this.Ee = null;
                }
            }
            catch (Exception ex) {
                this.Ee = null;
                cn.dN("The APK resources public ids were not parsed properly");
            }
        }
        this.wU = new SashForm((Composite)this, 256);
        this.fa = this.dN((Composite)this.wU);
        (this.zs = new Co((Composite)this.wU)).dN(this.dN.Ai());
        final CTabFolder dn = this.zs.dN();
        final tS ld = this.ld((Composite)dn);
        if (ld != null) {
            this.mS = ld;
            this.zs.dN("Manifest", (Control)this.mS);
        }
        this.OK = this.QE((Composite)dn);
        this.zs.dN("Resources", (Control)this.OK);
        this.LH = this.wU((Composite)dn);
        this.zs.dN("Assets", (Control)this.LH);
        this.KK = this.fa((Composite)dn);
        this.zs.dN("Certificate", (Control)this.KK);
        this.EO = new hF((Composite)dn, this.dN);
        this.zs.dN("Assembly", (Control)this.EO);
        this.cb = this.zs(this.EO);
        this.EO.dN(this.cb);
        this.PF = this.mS((Composite)dn);
        this.zs.dN("Decompiled Java", (Control)this.PF);
        this.Hw = this.OK((Composite)dn);
        this.zs.dN("Strings", (Control)this.Hw);
        this.rK = this.LH((Composite)dn);
        this.zs.dN("Constants", (Control)this.rK);
        this.Ux = this.KK((Composite)dn);
        this.zs.dN("External classes", (Control)this.Ux, false);
        this.ZY = this.EO((Composite)dn);
        this.zs.dN("External methods", (Control)this.ZY, false);
        this.s = this.cb((Composite)dn);
        this.zs.dN("External fields", (Control)this.s, false);
        this.Hv = this.PF((Composite)dn);
        this.zs.dN("Notes", (Control)this.Hv);
        this.EO();
        this.wU.setWeights(new int[] { 17, 83 });
        this.layout();
        this.ld = uK.QE;
        return s;
    }
    
    private ly dN(final Composite composite) {
        final TM eo = this.dN.EO();
        final ly ly = new ly(composite, this.dN.XZ(), this.ci, eo.ld(WV.Nh), eo.dN(WV.XZ));
        ly.dN((SelectionListener)new Ea(this));
        return ly;
    }
    
    private tS ld(final Composite composite) {
        final byte[] ld = this.VX.ld("manifest.xml");
        if (ld == null) {
            return null;
        }
        final tS ts = new tS(composite, this);
        ts.dN(ld);
        ts.dN(false);
        return ts;
    }
    
    private NB QE(final Composite composite) {
        NB nb = null;
        if (this.BQ == null) {
            this.BQ = this.dN.dN(this.VX);
        }
        if (this.BQ != null) {
            nb = new NB(composite, this, this.BQ);
        }
        return nb;
    }
    
    private NB wU(final Composite composite) {
        final byte[] ld = this.VX.ld("zassets.zip");
        if (ld == null) {
            return null;
        }
        File ok;
        try {
            final File tempFile = File.createTempFile("zassets.zip", null);
            TM.dN(tempFile, ld, false);
            ok = TM.OK(tempFile.getName() + "-ASSETS");
            TM.dN(tempFile, ok);
            TM.ld(ok);
            tempFile.delete();
        }
        catch (IOException ex) {
            return null;
        }
        return new NB(composite, this, ok);
    }
    
    private lW fa(final Composite composite) {
        final byte[] ld = this.VX.ld("certificate.enc");
        if (ld == null) {
            return null;
        }
        Certificate generateCertificate;
        try {
            generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(ld));
        }
        catch (CertificateException ex) {
            return null;
        }
        final lW lw = new lW(composite, this.dN.XZ(), false);
        lw.QE(this.dN(generateCertificate));
        return lw;
    }
    
    private String dN(final Certificate certificate) {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Type: %s\n", certificate.getType()));
        if (certificate instanceof X509Certificate) {
            final X509Certificate x509Certificate = (X509Certificate)certificate;
            sb.append(String.format("Version: %d\nSerial Number: 0x%s\nIssuer: %s\nValidity: from = %s\n            to = %s\nSubject: %s\n\nPublic Key:\n%s\nSignature:\n  type = %s, OID = %s\n  hexdata = %s\n", x509Certificate.getVersion(), x509Certificate.getSerialNumber().toString(16), x509Certificate.getIssuerDN(), x509Certificate.getNotBefore(), x509Certificate.getNotAfter(), x509Certificate.getSubjectDN(), this.dN(x509Certificate.getPublicKey()), x509Certificate.getSigAlgName(), x509Certificate.getSigAlgOID(), ZF.dN(x509Certificate.getSignature())));
        }
        else {
            sb.append(certificate.toString());
        }
        byte[] encoded = null;
        try {
            encoded = certificate.getEncoded();
        }
        catch (CertificateEncodingException ex) {}
        if (encoded != null) {
            sb.append(String.format("\nMD5 Fingerprint: %s\nSHA-1 Fingerprint: %s\nSHA-256 Fingerprint: %s\n", ZF.dN(TM.ld(encoded)), ZF.dN(TM.QE(encoded)), ZF.dN(TM.wU(encoded))));
        }
        return sb.toString();
    }
    
    private String dN(final PublicKey publicKey) {
        final StringBuilder sb = new StringBuilder();
        if (publicKey instanceof RSAPublicKey) {
            final RSAPublicKey rsaPublicKey = (RSAPublicKey)publicKey;
            sb.append(String.format("  type = %s %d bits\n  exponent = %s\n  modulus = %s", rsaPublicKey.getAlgorithm(), rsaPublicKey.getModulus().bitLength(), rsaPublicKey.getPublicExponent(), rsaPublicKey.getModulus()));
        }
        else if (publicKey instanceof DSAPublicKey) {
            final DSAPublicKey dsaPublicKey = (DSAPublicKey)publicKey;
            sb.append(String.format("  type = %s %d bits\n  y = %s\n  g = %s\n  p = %s\n  q = %s", dsaPublicKey.getAlgorithm(), dsaPublicKey.getY().bitLength(), dsaPublicKey.getY(), dsaPublicKey.getParams().getG(), dsaPublicKey.getParams().getP(), dsaPublicKey.getParams().getQ()));
        }
        else {
            sb.append(String.format("  %s", publicKey.toString()));
        }
        return sb.toString();
    }
    
    private Pl zs(final Composite composite) {
        final Pl pl = new Pl(composite, this);
        cn.dN("Generating disassembly output...");
        pl.dN(false);
        cn.dN("Done");
        return pl;
    }
    
    private Os mS(final Composite composite) {
        final Os os = new Os(composite, this);
        os.dN(false);
        os.QE("How to decompile a class:\n1) Switch to the Assembly view.\n2) Position the caret anywhere within that class.\n3) Press the Tab key.\n");
        return os;
    }
    
    private lF OK(final Composite composite) {
        final ArrayList<String> list = new ArrayList<String>(this.ci.wU());
        final ArrayList list2 = new ArrayList<Comparable[]>(list.size());
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add((Comparable[])new Comparable[] { iterator.next() });
        }
        final lF lf = new lF(composite, true, new String[] { "Value" }, list2, -1);
        lf.dN((SelectionListener)new Gf(this, lf));
        return lf;
    }
    
    private lF LH(final Composite composite) {
        final Set fa = this.ci.fa();
        final ArrayList list = new ArrayList<Comparable[]>(fa.size());
        for (final Long n : fa) {
            list.add((Comparable[])new Comparable[] { n, Long.toHexString(n), Double.longBitsToDouble(n) });
        }
        final lF lf = new lF(composite, false, new String[] { "Value", "Hex value", "FP value" }, list, -1);
        lf.dN((SelectionListener)new uP(this, lf));
        return lf;
    }
    
    private lF KK(final Composite composite) {
        final ArrayList<Comparable[]> list = new ArrayList<Comparable[]>();
        for (final String s : this.ci.rK()) {
            if (this.ci.EO(s) == null) {
                list.add(new Comparable[] { s });
            }
        }
        final lF lf = new lF(composite, false, new String[] { "Name" }, list, -1);
        lf.dN((SelectionListener)new As(this, lf));
        return lf;
    }
    
    private lF EO(final Composite composite) {
        final ArrayList<Comparable[]> list = new ArrayList<Comparable[]>();
        int n = 0;
        for (final hO ho : this.ci.cb()) {
            if (!ho.QE()) {
                list.add(new Comparable[] { new Integer(n), ho.wU(false) });
            }
            ++n;
        }
        final lF lf = new lF(composite, false, new String[] { "Index", "Name" }, list, -1);
        lf.dN((SelectionListener)new QT(this, lf));
        return lf;
    }
    
    private lF cb(final Composite composite) {
        final ArrayList<Comparable[]> list = new ArrayList<Comparable[]>();
        int n = 0;
        for (final gE ge : this.ci.KK()) {
            if (!ge.QE()) {
                list.add(new Comparable[] { new Integer(n), ge.fa(false) });
            }
            ++n;
        }
        final lF lf = new lF(composite, false, new String[] { "Index", "Name" }, list, -1);
        lf.dN((SelectionListener)new E(this, lf));
        return lf;
    }
    
    private uT PF(final Composite composite) {
        final uT ut = new uT(composite, this);
        ut.KK();
        return ut;
    }
    
    public void VX() {
        new PM(this.getShell(), this.dN.XZ(), this.VX).ld();
    }
    
    public enum uK
    {
        dN("EMPTY", 0), 
        ld("LOADING", 1), 
        QE("READY", 2), 
        wU("CLOSING", 3);
        
        private uK(final String s, final int n) {
        }
    }
}
