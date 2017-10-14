package jebglobal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import jeb.Launcher;
import jebglobal.Bl;
import jebglobal.Br;
import jebglobal.Kf;
import jebglobal.LP;
import jebglobal.Lw;
import jebglobal.Mt;
import jebglobal.PS;
import jebglobal.SG;
import jebglobal.Sj;
import jebglobal.TM;
import jebglobal.UW;
import jebglobal.Ug;
import jebglobal.ZJ;
import jebglobal.aN;
import jebglobal.aa;
import jebglobal.cL;
import jebglobal.cN;
import jebglobal.dx;
import jebglobal.eI;
import jebglobal.jq;
import jebglobal.oH;
import jebglobal.oM;
import jebglobal.vl;
import jebglobal.wb;
import jebglobal.xp;
import jebglobal.zB;
import jebglobal.zX;

public final class Qj {
   public static boolean dN = false;

   public LP dN(vl var1) {
      LP var2 = new LP(this);
      this.dN(var2, var1);
      return var2;
   }

   public cN dN(LP var1, vl var2) {
      cN[] var3 = this.dN(var2, var1, dN);
      cN var4 = null;
      switch(var3.length) {
      case 1:
         var4 = var3[0];
         break;
      case 2:
         if(var3[0].zs().equals("android")) {
            var4 = var3[1];
         }
      }

      if(var4 == null) {
         throw new zX();
      } else {
         var1.dN(var4, true);
         return var4;
      }
   }

   public cN dN(LP var1, int var2, String var3) {
      File var4 = this.dN(var2, var3);
      cN[] var5 = this.dN(new vl(var4), var1, true);
      if(var5.length != 1) {
         throw new zX();
      } else {
         cN var6 = var5[0];
         if(var6.fa() != var2) {
            throw new zX();
         } else {
            var1.dN(var6, false);
            return var6;
         }
      }
   }

   public void dN(LP var1, vl var2, File var3) {
      PS var4 = this.dN();
      xp var5 = (xp)var4.dN;
      wb var6 = ((zB)var4.ld).ld();
      var1.dN();
      var6.dN((cN)var1.dN().iterator().next());
      Sj var8 = null;

      Sj var18;
      try {
         Sj var7 = var2.dN();
         oH var9 = new oH(var3);
         var5.dN(var7, "AndroidManifest.xml", var9, "AndroidManifest.xml", "xml");
         if(var7.ld("res")) {
            var8 = var7.fa("res");
         }

         var18 = var9.zs("res");
      } catch (oM var15) {
         throw new zX(var15);
      }

      SG var10 = this.ld();
      Iterator var11 = var1.dN().iterator();

      while(var11.hasNext()) {
         cN var12 = (cN)var11.next();
         var6.dN(var12);
         Iterator var13 = var12.ld().iterator();

         while(var13.hasNext()) {
            dx var14 = (dx)var13.next();
            var5.dN(var14, var8, var18);
         }

         var13 = var12.QE().iterator();

         while(var13.hasNext()) {
            Ug var17 = (Ug)var13.next();
            this.dN((Ug)var17, (Sj)var18, (ZJ)var10);
         }

         this.dN((cN)var12, (Sj)var18, (Kf)var10);
      }

      zX var16 = ((zB)var4.ld).dN();
      if(var16 != null) {
         throw var16;
      }
   }

   public PS dN() {
      Bl var1 = new Bl();
      var1.dN("raw", new aN());
      var1.dN("9patch", new Lw());
      zB var2 = new zB();
      var2.dN(new wb());
      var1.dN("xml", new jq(var2, this.ld()));
      return new PS(new xp(var1), var2);
   }

   public SG ld() {
      SG var1 = new SG();
      var1.dN((String)"http://xmlpull.org/v1/doc/properties.html#serializer-indentation", (Object)"    ");
      var1.dN((String)"http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", (Object)System.getProperty("line.separator"));
      var1.dN((String)"DEFAULT_ENCODING", (Object)"utf-8");
      var1.dN(true);
      return var1;
   }

   private void dN(Ug var1, Sj var2, ZJ var3) {
      try {
         OutputStream var4 = var2.wU(var1.dN());
         var3.dN(var4, (String)null);
         var3.dN((String)null, (Boolean)null);
         var3.ld((String)null, "resources");
         Iterator var5 = var1.ld().iterator();

         while(var5.hasNext()) {
            dx var6 = (dx)var5.next();
            if(!var1.dN(var6)) {
               ((Mt)var6.wU()).dN(var3, var6);
            }
         }

         var3.QE((String)null, "resources");
         var3.dN();
         var3.mS();
         var3.KK();
         var4.close();
      } catch (IOException var7) {
         throw new zX();
      } catch (oM var8) {
         throw new zX();
      }
   }

   private void dN(cN var1, Sj var2, Kf var3) {
      try {
         OutputStream var4 = var2.wU("values/public.xml");
         var3.dN((OutputStream)var4, (String)null);
         var3.dN((String)null, (Boolean)null);
         var3.ld((String)null, "resources");
         Iterator var5 = var1.dN().iterator();

         while(var5.hasNext()) {
            UW var6 = (UW)var5.next();
            var3.ld((String)null, "public");
            var3.dN((String)null, "type", var6.mS().dN());
            var3.dN((String)null, "name", var6.fa());
            var3.dN((String)null, "id", String.format("0x%08x", new Object[]{Integer.valueOf(var6.wU().ld)}));
            var3.QE((String)null, "public");
         }

         var3.QE((String)null, "resources");
         var3.mS();
         var3.KK();
         var4.close();
      } catch (IOException var7) {
         throw new zX();
      } catch (oM var8) {
         throw new zX();
      }
   }

   private cN[] dN(vl var1, LP var2, boolean var3) {
      try {
         InputStream var4;
         if(var1.dN().dN("resources.arsc")) {
            var4 = var1.dN().QE("resources.arsc");
         } else {
            var4 = Launcher.ld("android-resources-empty.arsc");
         }

         return aa.dN(var4, false, var3, var2).dN();
      } catch (oM var5) {
         throw new zX();
      }
   }

   public File dN(int var1, String var2) {
      File var3 = new File(eI.OK(), "frameworks");
      if(!var3.isDirectory()) {
         TM.zs(var3.getAbsolutePath());
      }

      String var4 = String.format("%d.apk", new Object[]{Integer.valueOf(var1)});
      File var5 = new File(var3, var4);
      File var6 = Launcher.dN("android-resources-v19.zip");
      if(var5.exists() && var5.length() == var6.length()) {
         return var5;
      } else if(var1 == 1) {
         InputStream var7 = Launcher.ld("android-resources-v19.zip");

         FileOutputStream var8;
         try {
            var8 = new FileOutputStream(var5, false);
         } catch (FileNotFoundException var21) {
            throw new zX(var21);
         }

         File var9;
         try {
            Br.dN(var7, var8);
            var9 = var5;
         } catch (IOException var20) {
            throw new zX(var20);
         } finally {
            if(var7 != null) {
               try {
                  var7.close();
               } catch (IOException var19) {
                  ;
               }
            }

            try {
               var8.close();
            } catch (IOException var18) {
               ;
            }

         }

         return var9;
      } else {
         throw new cL(var1);
      }
   }
}
