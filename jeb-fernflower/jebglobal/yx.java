package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jebglobal.AR;
import jebglobal.Co;
import jebglobal.HC;
import jebglobal.Ky;
import jebglobal.NB;
import jebglobal.Nz;
import jebglobal.Os;
import jebglobal.PM;
import jebglobal.Pl;
import jebglobal.Rg;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.XQ;
import jebglobal.ZF;
import jebglobal.cn;
import jebglobal.ew;
import jebglobal.gE;
import jebglobal.hF;
import jebglobal.hO;
import jebglobal.lF;
import jebglobal.lW;
import jebglobal.ly;
import jebglobal.qS;
import jebglobal.tS;
import jebglobal.uT;
import jebglobal.yK;
import jebglobal.yW;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TreeItem;

public final class yx extends Composite {
   private static final long LK = 844563159190538443L;
   private yW dN;
   private yx.uK ld;
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

   yx(Composite var1, yW var2) {
      super(var1, 0);
      this.setLayout(new FillLayout());
      this.dN = var2;
      this.ld = yx.uK.dN;
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
      List var1 = this.zs.ld();
      var1.add(this.fa);
      return var1;
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
      if(this.mS != null) {
         this.zs.dN((Control)this.mS, true);
         this.mS.setFocus();
      }
   }

   public uT Ux() {
      return this.Hv;
   }

   public void ZY() {
      if(this.Hv != null) {
         this.zs.dN((Control)this.Hv, true);
         this.Hv.setFocus();
      }
   }

   public boolean s() {
      return this.ld != yx.uK.dN;
   }

   public boolean dN(int var1) {
      if(this.ld == yx.uK.dN) {
         return true;
      } else if(this.ld != yx.uK.QE) {
         throw new RuntimeException();
      } else {
         this.ld = yx.uK.wU;
         if(this.zs != null) {
            this.zs.QE();
         }

         Control[] var2 = this.getChildren();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            Control var5 = var2[var4];
            var5.dispose();
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
         if(this.cb != null) {
            this.cb.EO();
            this.cb = null;
         }

         this.EO = null;
         if(this.PF != null) {
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
         this.ld = yx.uK.dN;
         return true;
      }
   }

   public boolean Hv() {
      return this.VX.ld();
   }

   public String dN(String var1) {
      if(!this.dN(2)) {
         return null;
      } else if(this.ld != yx.uK.dN) {
         throw new RuntimeException();
      } else {
         cn.dN(String.format("Opening %s", new Object[]{var1}));
         this.ld = yx.uK.ld;
         if(this.QE != null) {
            this.QE.dispose();
            this.QE = null;
         }

         int var2 = TM.KK(var1);
         if((var2 & 16777215) != 4342858) {
            this.VX = this.dN.dN(var1, false);
         } else {
            this.VX = this.dN.wU(var1);
         }

         if(this.VX == null) {
            this.ld = yx.uK.dN;
            cn.dN("Invalid file or file does not exist");
            return null;
         } else {
            TM var3 = this.dN.EO();
            this.ci = new AR(this.VX.ld("classes.dex"));
            this.ci.dN(var3.ld(WV.kq));
            this.ci.ld(var3.ld(WV.ir));
            this.ci.QE(var3.ld(WV.rF));
            this.ci.wU(var3.ld(WV.IL));
            BusyIndicator.showWhile(this.getDisplay(), new Runnable() {
               // $FF: synthetic field
               private yx dN = yx.this;

               public void run() {
                  try {
                     this.dN.ci.Ux();
                  } catch (Exception var1) {
                     cn.dN("Invalid DEX file");
                     this.dN.ci = null;
                  }

               }
            });
            if(this.ci == null) {
               this.ld = yx.uK.dN;
               return null;
            } else {
               cn.dN("DEX analysis complete");
               this.dN.zs(true);
               this.dN.dN(this.VX, this.ci);
               this.bG = new Rg(this.ci);
               if(this.BQ == null) {
                  this.BQ = this.dN.dN((ew)this.VX);
               }

               if(this.BQ != null) {
                  try {
                     File var4 = new File(this.BQ, "values/public.xml");
                     if(var4.exists()) {
                        this.Ee = new Nz();
                        this.Ee.dN(var4);
                     } else {
                        this.Ee = null;
                     }
                  } catch (Exception var6) {
                     this.Ee = null;
                     cn.dN("The APK resources public ids were not parsed properly");
                  }
               }

               this.wU = new SashForm(this, 256);
               this.fa = this.dN((Composite)this.wU);
               this.zs = new Co(this.wU);
               this.zs.dN((XQ)this.dN.Ai());
               CTabFolder var7 = this.zs.dN();
               tS var5 = this.ld((Composite)var7);
               if(var5 != null) {
                  this.mS = (tS)var5;
                  this.zs.dN("Manifest", this.mS);
               }

               this.OK = this.QE((Composite)var7);
               this.zs.dN("Resources", this.OK);
               this.LH = this.wU((Composite)var7);
               this.zs.dN("Assets", this.LH);
               this.KK = this.fa(var7);
               this.zs.dN("Certificate", this.KK);
               this.EO = new hF(var7, this.dN);
               this.zs.dN("Assembly", this.EO);
               this.cb = this.zs(this.EO);
               this.EO.dN(this.cb);
               this.PF = this.mS(var7);
               this.zs.dN("Decompiled Java", this.PF);
               this.Hw = this.OK(var7);
               this.zs.dN("Strings", this.Hw);
               this.rK = this.LH(var7);
               this.zs.dN("Constants", this.rK);
               this.Ux = this.KK(var7);
               this.zs.dN("External classes", this.Ux, false);
               this.ZY = this.EO(var7);
               this.zs.dN("External methods", this.ZY, false);
               this.s = this.cb(var7);
               this.zs.dN("External fields", this.s, false);
               this.Hv = this.PF(var7);
               this.zs.dN("Notes", this.Hv);
               this.EO();
               this.wU.setWeights(new int[]{17, 83});
               this.layout();
               this.ld = yx.uK.QE;
               return var1;
            }
         }
      }
   }

   private ly dN(Composite var1) {
      TM var2 = this.dN.EO();
      boolean var3 = var2.ld(WV.Nh);
      String var4 = var2.dN(WV.XZ);
      ly var5 = new ly(var1, this.dN.XZ(), this.ci, var3, var4);
      var5.dN(new SelectionListener() {
         // $FF: synthetic field
         private yx dN = yx.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            String var2 = this.dN(var1);
            if(var2 != null) {
               TreeItem var3 = (TreeItem)var1.item;
               if(this.dN.zs.wU() == this.dN.PF) {
                  this.dN.PF.dN(var2, (Ky)null);
                  this.dN.PF();
               } else {
                  this.dN.EO();
                  var3.setExpanded(true);
               }

            }
         }

         public void widgetSelected(SelectionEvent var1) {
            if(this.dN.zs.wU() != this.dN.PF) {
               String var2 = this.dN(var1);
               if(var2 != null) {
                  yK var3 = this.dN.ci.EO(var2);
                  if(var3 != null) {
                     var2 = var3.ld(false);
                     if(this.dN.cb != null) {
                        this.dN.cb.ld(var2);
                     }
                  }

               }
            }
         }

         private String dN(SelectionEvent var1) {
            TreeItem var2 = (TreeItem)var1.item;
            if(var2 != null && var2.getItems() != null && var2.getItems().length <= 0) {
               ArrayList var3;
               for(var3 = new ArrayList(); var2 != null; var2 = var2.getParentItem()) {
                  var3.add(0, var2.getText());
               }

               StringBuilder var4 = new StringBuilder("L");

               for(int var5 = 0; var5 < var3.size(); ++var5) {
                  var4.append((String)var3.get(var5));
                  if(var5 == var3.size() - 1) {
                     var4.append(";");
                  } else {
                     var4.append("/");
                  }
               }

               String var6 = var4.toString().replace('.', '/');
               return var6;
            } else {
               return null;
            }
         }
      });
      return var5;
   }

   private tS ld(Composite var1) {
      byte[] var2 = this.VX.ld("manifest.xml");
      if(var2 == null) {
         return null;
      } else {
         tS var3 = new tS(var1, this);
         var3.dN(var2);
         var3.dN(false);
         return var3;
      }
   }

   private NB QE(Composite var1) {
      NB var2 = null;
      if(this.BQ == null) {
         this.BQ = this.dN.dN((ew)this.VX);
      }

      if(this.BQ != null) {
         var2 = new NB(var1, this, this.BQ);
      }

      return var2;
   }

   private NB wU(Composite var1) {
      byte[] var2 = this.VX.ld("zassets.zip");
      if(var2 == null) {
         return null;
      } else {
         File var3;
         try {
            File var4 = File.createTempFile("zassets.zip", (String)null);
            TM.dN(var4, var2, false);
            var3 = TM.OK(var4.getName() + "-ASSETS");
            TM.dN(var4, var3);
            TM.ld(var3);
            var4.delete();
         } catch (IOException var5) {
            return null;
         }

         NB var6 = new NB(var1, this, var3);
         return var6;
      }
   }

   private lW fa(Composite var1) {
      byte[] var2 = this.VX.ld("certificate.enc");
      if(var2 == null) {
         return null;
      } else {
         Certificate var3;
         try {
            CertificateFactory var4 = CertificateFactory.getInstance("X.509");
            ByteArrayInputStream var5 = new ByteArrayInputStream(var2);
            var3 = var4.generateCertificate(var5);
         } catch (CertificateException var6) {
            return null;
         }

         lW var8 = new lW(var1, this.dN.XZ(), false);
         String var7 = this.dN(var3);
         var8.QE(var7);
         return var8;
      }
   }

   private String dN(Certificate var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(String.format("Type: %s\n", new Object[]{var1.getType()}));
      String var4;
      if(var1 instanceof X509Certificate) {
         X509Certificate var3 = (X509Certificate)var1;
         var4 = String.format("Version: %d\nSerial Number: 0x%s\nIssuer: %s\nValidity: from = %s\n            to = %s\nSubject: %s\n\nPublic Key:\n%s\nSignature:\n  type = %s, OID = %s\n  hexdata = %s\n", new Object[]{Integer.valueOf(var3.getVersion()), var3.getSerialNumber().toString(16), var3.getIssuerDN(), var3.getNotBefore(), var3.getNotAfter(), var3.getSubjectDN(), this.dN(var3.getPublicKey()), var3.getSigAlgName(), var3.getSigAlgOID(), ZF.dN(var3.getSignature())});
         var2.append(var4);
      } else {
         var2.append(var1.toString());
      }

      byte[] var8 = null;

      try {
         var8 = var1.getEncoded();
      } catch (CertificateEncodingException var7) {
         ;
      }

      if(var8 != null) {
         var4 = ZF.dN(TM.ld(var8));
         String var5 = ZF.dN(TM.QE(var8));
         String var6 = ZF.dN(TM.wU(var8));
         var2.append(String.format("\nMD5 Fingerprint: %s\nSHA-1 Fingerprint: %s\nSHA-256 Fingerprint: %s\n", new Object[]{var4, var5, var6}));
      }

      return var2.toString();
   }

   private String dN(PublicKey var1) {
      StringBuilder var2 = new StringBuilder();
      if(var1 instanceof RSAPublicKey) {
         RSAPublicKey var3 = (RSAPublicKey)var1;
         var2.append(String.format("  type = %s %d bits\n  exponent = %s\n  modulus = %s", new Object[]{var3.getAlgorithm(), Integer.valueOf(var3.getModulus().bitLength()), var3.getPublicExponent(), var3.getModulus()}));
      } else if(var1 instanceof DSAPublicKey) {
         DSAPublicKey var4 = (DSAPublicKey)var1;
         var2.append(String.format("  type = %s %d bits\n  y = %s\n  g = %s\n  p = %s\n  q = %s", new Object[]{var4.getAlgorithm(), Integer.valueOf(var4.getY().bitLength()), var4.getY(), var4.getParams().getG(), var4.getParams().getP(), var4.getParams().getQ()}));
      } else {
         var2.append(String.format("  %s", new Object[]{var1.toString()}));
      }

      return var2.toString();
   }

   private Pl zs(Composite var1) {
      Pl var2 = new Pl(var1, this);
      cn.dN("Generating disassembly output...");
      var2.dN(false);
      cn.dN("Done");
      return var2;
   }

   private Os mS(Composite var1) {
      Os var2 = new Os(var1, this);
      var2.dN(false);
      var2.QE("How to decompile a class:\n1) Switch to the Assembly view.\n2) Position the caret anywhere within that class.\n3) Press the Tab key.\n");
      return var2;
   }

   private lF OK(Composite var1) {
      ArrayList var2 = new ArrayList(this.ci.wU());
      ArrayList var3 = new ArrayList(var2.size());
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         var3.add(new Comparable[]{var5});
      }

      final lF var6 = new lF(var1, true, new String[]{"Value"}, var3, -1);
      var6.dN((SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private lF dN = var6;
         // $FF: synthetic field
         private yx ld = yx.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            int var2 = this.dN.QE();
            this.ld.cb.ld(this.ld.ci.dN(var2));
            this.ld.EO();
         }
      }));
      return var6;
   }

   private lF LH(Composite var1) {
      Set var2 = this.ci.fa();
      ArrayList var3 = new ArrayList(var2.size());
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Long var5 = (Long)var4.next();
         var3.add(new Comparable[]{var5, Long.toHexString(var5.longValue()), Double.valueOf(Double.longBitsToDouble(var5.longValue()))});
      }

      final lF var6 = new lF(var1, false, new String[]{"Value", "Hex value", "FP value"}, var3, -1);
      var6.dN((SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private lF dN = var6;
         // $FF: synthetic field
         private yx ld = yx.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            Comparable[] var2 = this.dN.ld();
            if(var2 != null && var2.length >= 1 && var2[0] instanceof Long) {
               this.ld.cb.ld(this.ld.ci.dN(((Long)var2[0]).longValue()));
               this.ld.EO();
            }

         }
      }));
      return var6;
   }

   private lF KK(Composite var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.ci.rK().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         if(this.ci.EO(var4) == null) {
            var2.add(new Comparable[]{var4});
         }
      }

      final lF var5 = new lF(var1, false, new String[]{"Name"}, var2, -1);
      var5.dN((SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private lF dN = var5;
         // $FF: synthetic field
         private yx ld = yx.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            Comparable[] var2 = this.dN.ld();
            if(var2 != null && var2.length >= 1 && var2[0] instanceof String) {
               String var3 = (String)var2[0];
               this.ld.cb.ld(this.ld.ci.KK(var3));
               this.ld.EO();
            }

         }
      }));
      return var5;
   }

   private lF EO(Composite var1) {
      ArrayList var2 = new ArrayList();
      int var3 = 0;

      for(Iterator var4 = this.ci.cb().iterator(); var4.hasNext(); ++var3) {
         hO var5 = (hO)var4.next();
         if(!var5.QE()) {
            var2.add(new Comparable[]{new Integer(var3), var5.wU(false)});
         }
      }

      final lF var6 = new lF(var1, false, new String[]{"Index", "Name"}, var2, -1);
      var6.dN((SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private lF dN = var6;
         // $FF: synthetic field
         private yx ld = yx.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            Comparable[] var2 = this.dN.ld();
            if(var2 != null && var2.length >= 1 && var2[0] instanceof Integer) {
               hO var3 = this.ld.ci.mS(((Integer)var2[0]).intValue());
               this.ld.cb.ld(var3);
               this.ld.EO();
            }

         }
      }));
      return var6;
   }

   private lF cb(Composite var1) {
      ArrayList var2 = new ArrayList();
      int var3 = 0;

      for(Iterator var4 = this.ci.KK().iterator(); var4.hasNext(); ++var3) {
         gE var5 = (gE)var4.next();
         if(!var5.QE()) {
            var2.add(new Comparable[]{new Integer(var3), var5.fa(false)});
         }
      }

      final lF var6 = new lF(var1, false, new String[]{"Index", "Name"}, var2, -1);
      var6.dN((SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private lF dN = var6;
         // $FF: synthetic field
         private yx ld = yx.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            Comparable[] var2 = this.dN.ld();
            if(var2 != null && var2.length >= 1 && var2[0] instanceof Integer) {
               gE var3 = this.ld.ci.fa(((Integer)var2[0]).intValue());
               this.ld.cb.ld(var3);
               this.ld.EO();
            }

         }
      }));
      return var6;
   }

   private uT PF(Composite var1) {
      uT var2 = new uT(var1, this);
      var2.KK();
      return var2;
   }

   public void VX() {
      PM var1 = new PM(this.getShell(), this.dN.XZ(), this.VX);
      var1.ld();
   }

   public static enum uK {
      dN,
      ld,
      QE,
      wU;
   }
}
