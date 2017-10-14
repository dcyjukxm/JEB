package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jeb.Launcher;
import jebglobal.AM;
import jebglobal.AR;
import jebglobal.DU;
import jebglobal.Dc;
import jebglobal.EK;
import jebglobal.Jz;
import jebglobal.PX;
import jebglobal.QA;
import jebglobal.Rg;
import jebglobal.TM;
import jebglobal.Vm;
import jebglobal.Vr;
import jebglobal.WV;
import jebglobal.Xp;
import jebglobal.ZF;
import jebglobal.ZL;
import jebglobal.cn;
import jebglobal.ew;
import jebglobal.fO;
import jebglobal.lS;
import jebglobal.oQ;
import jebglobal.rP;
import jebglobal.sS;
import jebglobal.u;
import jebglobal.uK;
import jebglobal.vd;
import jebglobal.wk;

public abstract class eI implements Xp {
   private static final long LK = 844563159190538443L;
   public static final wk dN = new wk(1, 5, 201404100);
   private static final wk Ux = new wk(1, 5, 201404070);
   protected static EK ld;
   protected static boolean QE = false;
   private static String ZY = "PK";
   protected static int wU = 2;
   public static String fa;
   public static String zs;
   public static String mS;
   public static String OK;
   public static String LH;
   public static String KK;
   private static int s = (int)(System.currentTimeMillis() / 1000L);
   protected static String EO = System.getProperty(rP.dN(new byte[]{54, 28, 21, 11, 92, 13, 14, 26}, 2, 11));
   private static String Hv;
   private static String VX;
   private String ci;
   protected String cb;
   protected String PF;
   private String[] bG;
   protected ZF Hw;
   protected TM rK;
   private Vm BQ;
   private int Ee;
   private DU De;
   private long rn;
   private static final String LR;
   private static final String Nh;

   public eI(String var1, String var2, String var3, String[] var4) {
      this.ci = var1;
      this.cb = var2;
      this.PF = var3;
      this.bG = var4;
      if(this.ci == null) {
         this.ci = String.format("%s/%s", new Object[]{Hv, "jeb-config.txt"});
      }

      this.Hw = new ZF(this.ci);
      this.rK = new TM(this.Hw);
      Proxy var5 = this.rK.ld();
      this.BQ = new Vm(var5);
      this.De = new DU(this.BQ);
   }

   public wk dN() {
      return dN;
   }

   public String ld() {
      return this.cb;
   }

   public String QE() {
      return this.ci;
   }

   public String wU() {
      return this.PF;
   }

   public String[] fa() {
      return this.bG;
   }

   public static int zs() {
      return s;
   }

   public static String mS() {
      return Hv;
   }

   public static String OK() {
      return VX;
   }

   public String LH() {
      return this.dN(WV.Ux);
   }

   public String KK() {
      return this.dN(WV.ZY);
   }

   private String dN(WV var1) {
      String var2 = this.rK.dN(var1);
      if(var2 == null) {
         throw new RuntimeException();
      } else {
         File var3 = new File(var2);
         if(!var3.isAbsolute()) {
            var2 = (new File(VX, var2)).getAbsolutePath();
         }

         return var2;
      }
   }

   public TM EO() {
      return this.rK;
   }

   public boolean cb() {
      return ld.ld();
   }

   public void PF() {
      try {
         cn.dN(true, (String)null, false);
      } catch (IOException var4) {
         throw new RuntimeException("Cannot setup logging system", var4);
      }

      cn.dN(String.format("%s v%s (%s) is starting...", new Object[]{"JEB", dN.toString(), uK.QE()}));
      cn.dN(String.format("Current directory: %s", new Object[]{EO}));
      cn.dN(String.format("Base directory: %s", new Object[]{VX}));
      cn.dN(String.format("Program directory: %s", new Object[]{Hv}));
      PX.dN[4] = 95;
      fO.dN(this.BQ);
      wk var1 = wk.dN(this.rK.dN(WV.zs));
      if(!this.rK.ld(WV.mS) || var1 == null || var1.dN(Ux) <= 0) {
         String var2 = uK.fa();
         if(var2 == null) {
            throw new RuntimeException("The EULA cannot be opened, the program will terminate.");
         }

         if(!this.ld(var2)) {
            cn.dN(rP.dN(new byte[]{-27, 16, 25, 13, 97, 82, 23, 15, 15, 6, 23, 17, 1, 68, 66, 27, 89, 85, 6, 22, 23, 94, 12, 69, 29, 17, 29, 29, 7, 9}, 1, 160));
            this.rK.dN(WV.mS, false);
            this.rK.dN();
            Ee();
         }

         this.rK.dN(WV.mS, true);
         this.rK.dN();
      }

      if(this.rK.QE(WV.wU) == 0) {
         this.rK.dN(WV.wU, s);
      }

      this.rK.dN(WV.fa, s);
      if(var1 != null && var1.dN(dN) >= 0) {
         if(QE) {
            this.rK.dN(WV.ci, true);
            this.rK.dN((WV)WV.De, -1);
         } else if(this.rK.QE(WV.De) < 0) {
            this.rK.dN(WV.ci, true);
            QE = true;
         }
      } else {
         this.ci();
         this.rK.dN(WV.ci, true);
         if(this.rK.QE(WV.De) < 0) {
            this.rK.dN((WV)WV.De, 0);
         }
      }

      this.rK.dN(WV.zs, dN.toString());
      this.rK.dN();
      boolean var5 = this instanceof sS;
      boolean var3 = uK.wU();
      if(var5 && !var3) {
         throw new RuntimeException();
      } else {
         this.rn();
         TM.ld(new Runnable() {
            public void run() {
               if(eI.QE) {
                  eI.wU += 0;
               }

            }
         });
         fO.dN();
      }
   }

   public void Hw() {
      cn.dN("Exiting.");

      try {
         cn.dN();
      } catch (IOException var1) {
         ;
      }

   }

   private void rn() {
      fO.ld();
      long var1 = Vr.dN();
      oQ var3 = new oQ(var1);
      String var4 = this.rK.dN(WV.OK);
      int[] var5 = new int[1];
      if(!var3.dN(var4, var5)) {
         fO.QE();
         String var6 = var3.dN();
         var4 = this.QE(var6);
         fO.ld();
         if(!var3.dN(var4, var5)) {
            cn.dN(rP.dN(new byte[]{15, 6, 19, 28, 28, 26, 2, 72, 31, 69, 81, 67, 76, 82, 67, 86, 75, 29}, 2, 13));
            Ee();
         }

         this.rK.dN(WV.OK, var4.trim());
         this.rK.dN();
      }

      uK.dN(var5[0]);
      int var7 = uK.dN();
      if(var7 > 0 && s < var7) {
         if(this.rK.ld(WV.LH)) {
            this.rK.dN(WV.LH, false);
            this.rK.dN();
         }
      } else {
         if(uK.ld()) {
            cn.dN(rP.dN(new byte[]{7, 10, 29, 22, 82, 12, 31, 24, 29, 82, 77, 7, 7, 0, 114, 86, 87, 71, 77, 67, 70, 16, 68, 64, 12, 70, 32, 0, 65, 2, 76, 3, 85, 13, 2, 72, 15, 26, 28, 76, 0, 25, 26, 84, 4, 2, 70, 5, 5, 10, 4, 26, 22, 22, 0}, 2, 212));
            Ee();
         }

         cn.dN(rP.dN(new byte[]{16, 26, 0, 9, 29, 27, 19, 72, 28, 65, 91, 67, 76, 88, 65, 80, 75, 86, 72, 1, 18, 96, 93, 86, 77, 83, 42, 82, 19, 6, 2, 0, 87, 65, 23, 11, 90, 29, 82, 76, 0, 23, 22, 78, 18, 3, 70, 0, 10, 73, 24, 27, 16, 83, 89, 73, 50, 4, 76, 84, 29, 73, 12, 13, 17, 3, 0, 0, 0, 16, 0, 27, 0, 12, 10, 73, 99, 28, 31, 31, 6, 30, 6, 26, 17, 0, 93, 19, 77, 65, 69, 92, 74, 29}, 2, 183));
         if(!this.rK.ld(WV.LH)) {
            this.bG();
            this.rK.dN(WV.LH, true);
            this.rK.dN();
         }
      }

   }

   public abstract boolean rK();

   public abstract ew Ux();

   public abstract AR ZY();

   public abstract Rg s();

   public abstract boolean dN(String var1);

   public abstract boolean Hv();

   public abstract boolean VX();

   public abstract void ci();

   public abstract void bG();

   public abstract boolean ld(String var1);

   public abstract String QE(String var1);

   public abstract void dN(long var1);

   public static String BQ() {
      StringBuilder var0 = new StringBuilder();
      var0.append(String.format("Licensed to: %s (%s)\nEmail address: %s\nUser ID: %d\nBuild type: %d (%s)\nFloating: %s\n", new Object[]{"              ", "                         ", "                ", Integer.valueOf(0), Integer.valueOf(uK.dN), uK.QE(), Boolean.valueOf(uK.wU())}));
      var0.append(String.format("Valid for %d user%s\n", new Object[]{Integer.valueOf(1), ""}));
      int var1 = uK.dN();
      if(var1 > 0) {
         Calendar var2 = Calendar.getInstance();
         var2.setTime(new Date(1000L * (long)var1));
         var0.append(String.format("%s expires on %04d-%02d-%02d\n", new Object[]{uK.ld()?"Demo":"Support", Integer.valueOf(var2.get(1)), Integer.valueOf(1 + var2.get(2)), Integer.valueOf(var2.get(5))}));
      }

      return var0.toString();
   }

   public static void Ee() {
      try {
         Class.forName(rP.dN(new byte[]{30, 11, 23, 23, 79, 66, 13, 15, 9, 73, 125, 42, 10, 7, 17, 8}, 1, 116)).getMethod(rP.dN(new byte[]{115, 29, 17, 29}, 1, 22), new Class[]{Integer.TYPE}).invoke((Object)null, new Object[]{Integer.valueOf(0)});
      } catch (Exception var0) {
         throw new RuntimeException();
      }
   }

   public int dN(boolean var1) {
      return -1;
   }

   public ew dN(String var1, boolean var2) {
      File var3 = new File(var1);
      if(!var3.isFile()) {
         return null;
      } else {
         ew var4 = new ew();
         var4.dN(this.rK.ld(WV.Ee));
         var4.dN(var1);
         var4.dN(dN.dN(), dN.ld(), dN.QE());
         var4.dN(1862412833L, "              ", "                         ");

         for(int var5 = 0; var5 < wU; ++var5) {
            char var6 = ZY.charAt(var5);
            if(var5 == 0 && var6 != 80 || var5 == 1 && var6 != 75) {
               cn.dN("Invalid PK header");
            }
         }

         byte[] var23 = null;
         int var24 = TM.KK(var1);
         if(var24 == 67324752) {
            try {
               boolean var7 = this.rK.ld(WV.uM);
               vd var8 = new vd(var1, var7);
               boolean var9 = this.rK.ld(WV.Ai);
               if(!var9) {
                  File var10 = TM.OK(var3.getName() + "-EXTRACTED");
                  String var11 = var10.getPath();
                  if(!var8.dN(var10)) {
                     cn.dN("Not all resources were processed");
                  }

                  File var12 = new File(var10, "AndroidManifest.xml");
                  if(var12.exists()) {
                     try {
                        byte[] var13 = TM.QE(var12);
                        var4.dN("manifest.xml", var13);
                     } catch (IOException var21) {
                        cn.dN("Cannot process the manifest");
                     }
                  }

                  String var29 = var11 + "/res";
                  String var14;
                  if((new File(var29)).exists()) {
                     var14 = var11 + "/zres.zip";

                     try {
                        TM.dN(var29, var14);
                        byte[] var15 = TM.LH(var14);
                        var4.dN("zres.zip", var15);
                     } catch (IOException var20) {
                        cn.dN("Cannot process the resources");
                     }
                  }

                  var14 = var11 + "/assets";
                  byte[] var16;
                  if((new File(var14)).exists()) {
                     String var30 = var11 + "/zassets.zip";

                     try {
                        TM.dN(var14, var30);
                        var16 = TM.LH(var30);
                        var4.dN("zassets.zip", var16);
                     } catch (IOException var19) {
                        cn.dN("Cannot process the assets");
                     }
                  }

                  TM.mS(var11);
                  Certificate[] var31;
                  if(var7) {
                     var31 = var8.dN();
                  } else {
                     var31 = this.dN(var8);
                  }

                  if(var31 != null && var31.length >= 1) {
                     try {
                        var16 = var31[0].getEncoded();
                        var4.dN("certificate.enc", var16);
                     } catch (CertificateEncodingException var18) {
                        cn.dN("Cannot process the certificate");
                     }
                  }
               }

               if(var8.dN("classes.dex")) {
                  var23 = var8.ld("classes.dex");
               } else {
                  cn.dN("Resource-only APK, using a placeholder DEX file");
                  var23 = Launcher.QE("Placeholder.dex");
               }
            } catch (Exception var22) {
               cn.dN(String.format("Corrupt APK file: %s", new Object[]{var22}));
               return null;
            }
         } else if(var24 == 175662436) {
            try {
               var23 = TM.LH(var1);
            } catch (IOException var17) {
               cn.dN("Cannot read DEX file");
            }
         } else {
            cn.dN("Invalid file");
         }

         if(var23 == null) {
            cn.dN("Error, no DEX file");
            return null;
         } else {
            var4.dN("classes.dex", var23);
            int var26 = 0;

            File var25;
            do {
               String var27 = var26 == 0?"":"." + var26;
               String var28 = var1 + var27 + ".jdb";
               var25 = new File(var28);
               ++var26;
            } while(!var2 && var25.exists());

            var4.dN(var25);
            return var4;
         }
      }
   }

   private Certificate[] dN(vd var1) {
      String var2 = null;
      Iterator var3 = var1.ld().iterator();

      while(var3.hasNext()) {
         AM.uK var4 = (AM.uK)var3.next();
         String var5 = var4.dN().toUpperCase();
         if(var5 != null && var5.startsWith("META-INF/") && (var5.endsWith(".RSA") || var5.endsWith(".DSA"))) {
            var2 = var4.dN();
            break;
         }
      }

      if(var2 == null) {
         cn.dN("Could not find certificates file");
         return null;
      } else {
         byte[] var11 = var1.ld(var2);
         if(var11 == null) {
            Object[] var10000 = new Object[]{var2};
            return null;
         } else {
            ByteArrayInputStream var12 = new ByteArrayInputStream(var11);

            Collection var13;
            try {
               CertificateFactory var6 = CertificateFactory.getInstance("X.509");
               var13 = var6.generateCertificates(var12);
            } catch (CertificateException var10) {
               cn.dN(String.format("Could not parse certificate data: %s", new Object[]{var10.toString()}));
               return null;
            }

            Certificate[] var14 = new Certificate[var13.size()];
            int var7 = 0;

            Certificate var9;
            for(Iterator var8 = var13.iterator(); var8.hasNext(); var14[var7++] = var9) {
               var9 = (Certificate)var8.next();
            }

            return var14;
         }
      }
   }

   public ew wU(String var1) {
      try {
         ew var2 = new ew(var1);
         var2.dN(this.rK.ld(WV.Ee));
         var2.dN(1862412833L, "              ", "                         ");
         return var2;
      } catch (Exception var3) {
         cn.dN("Invalid JDB file, or your version of JEB is older than the one used to create this JDB.");
         return null;
      }
   }

   public File dN(ew var1) {
      byte[] var2 = var1.ld("zres.zip");
      if(var2 == null) {
         return null;
      } else {
         try {
            File var4 = File.createTempFile("zres.zip", (String)null);
            TM.dN(var4, var2, false);
            File var3 = TM.OK(var4.getName() + "-RESOURCES");
            TM.dN(var4, var3);
            TM.ld(var3);
            var4.delete();
            return var3;
         } catch (IOException var5) {
            return null;
         }
      }
   }

   public QA dN(final String var1, boolean var2, Runnable var3) {
      final Jz var4 = new Jz(this);
      if(!var4.dN(var1)) {
         return null;
      } else {
         Thread var5 = TM.ld(new Runnable() {
            // $FF: synthetic field
            private String dN = var1;
            // $FF: synthetic field
            private Jz ld = var4;

            public void run() {
               cn.dN(String.format("Running script %s...", new Object[]{this.dN}));
               this.ld.dN();
            }
         });
         QA var6 = new QA(var5, true, this, (Runnable)null, var3);
         var6.dN(var2);
         return var6;
      }
   }

   public synchronized long De() {
      return this.rn;
   }

   public synchronized void ld(long var1) {
      this.rn = var1;
   }

   public void dN(ew var1, AR var2) {
      List var3 = var1.mS();
      if(var3 != null) {
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            u var5 = (u)var4.next();
            if(var5.LH()) {
               int var6 = var5.EO();
               String var7 = var5.Hw();
               switch(eI.SyntheticClass_1.dN[var5.KK().ordinal()]) {
               case 1:
                  var2.QE(var6).dN(var7);
                  break;
               case 2:
                  var2.mS(var6).ld(var7);
                  break;
               case 3:
                  var2.fa(var6).dN(var7);
               }
            }
         }
      }

      var1.OK();
      var1.KK();
   }

   public boolean dN(ZL var1) {
      Rg var2 = this.s();
      TM var3 = this.EO();
      if(var2 != null && var3 != null) {
         if(var1 != null) {
            var1.dN(this.Ux());
            var1.wU(var3.QE(WV.qL));
            var1.dN(var3.ld(WV.kz));
            var1.ld(var3.ld(WV.lx));
            var1.QE(var3.ld(WV.cM));
            var3.ld(WV.Vq);
            var1.wU(var3.ld(WV.VV));
            var1.fa(var3.ld(WV.LK));
            var1.zs(var3.ld(WV.Mq));
            var1.mS(var3.ld(WV.FY));
         }

         var2.dN(var3.QE(WV.Db) * 1000);
         var2.ld(var3.ld(WV.sC));
         var2.QE(var3.ld(WV.jp));
         var2.wU(var3.ld(WV.bU));
         var2.fa(var3.ld(WV.Qg));
         var2.zs(var3.ld(WV.uB));
         var2.mS(var3.ld(WV.dY));
         var2.OK(var3.ld(WV.Rm));
         var2.LH(var3.ld(WV.nb));
         var2.KK(var3.ld(WV.nI));
         return true;
      } else {
         return false;
      }
   }

   static {
      if(EO == null) {
         throw new RuntimeException("Could not determine the current directory");
      } else {
         try {
            File var0 = new File(eI.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            if(var0.isFile()) {
               Hv = var0.getParent();
            } else if(var0.isDirectory()) {
               Hv = var0.getAbsolutePath();
            }

            VX = (new File(Hv)).getParent();
            QE = !lS.dN(new Class[]{eI.class, Dc.class});
         } catch (Exception var1) {
            var1.printStackTrace();
         }

         if(Hv == null) {
            throw new RuntimeException("Could not determine the program directory");
         } else if(VX == null) {
            throw new RuntimeException("Could not determine the base directory");
         } else {
            ld = EK.dN();
            Vr.dN();
            fa = System.getProperty(rP.dN(new byte[]{41, 14, 6, 24, 92, 31, 2, 6, 16, 79, 90}, 2, 172), "");
            zs = System.getProperty(rP.dN(new byte[]{110, 11, 23, 23, 79, 88, 19, 23, 1, 26, 6, 1}, 1, 4), "");
            mS = System.getProperty(rP.dN(new byte[]{31, 28, 93, 64, 15, 12, 8}, 1, 112), "");
            OK = System.getProperty(rP.dN(new byte[]{44, 28, 94, 24, 0, 10, 15}, 2, 169), "");
            LH = System.getProperty(rP.dN(new byte[]{118, 28, 93, 88, 19, 23, 1, 26, 6, 1}, 1, 25), "");
            KK = System.getProperty(rP.dN(new byte[]{54, 28, 21, 11, 92, 7, 6, 5, 17}, 2, 186), "");
            LR = rP.dN(new byte[]{54, 31, 20, 24, 6, 12, 73, 18, 29, 80}, 2, 197);
            Nh = rP.dN(new byte[]{54, 31, 20, 24, 6, 12, 73, 24, 3, 68}, 2, 191);
         }
      }
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[u.uK.values().length];

      static {
         try {
            dN[u.uK.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[u.uK.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[u.uK.QE.ordinal()] = 3;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
