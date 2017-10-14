package jebglobal;

import java.io.File;
import jebglobal.ID;
import jebglobal.LP;
import jebglobal.QO;
import jebglobal.Qj;
import jebglobal.Qu;
import jebglobal.TM;
import jebglobal.oA;
import jebglobal.vl;
import jebglobal.zX;

public final class Uw {
   private final Qu dN;
   private vl ld;
   private File QE;
   private LP wU;
   private short fa;
   private boolean zs;
   private boolean mS;

   public Uw() {
      this(new Qu());
   }

   public Uw(Qu var1) {
      this.fa = 257;
      this.zs = false;
      this.mS = false;
      this.dN = var1;
   }

   public Uw(File var1) {
      this(var1, new Qu());
   }

   public Uw(File var1, Qu var2) {
      this.fa = 257;
      this.zs = false;
      this.mS = false;
      this.dN = var2;
      this.dN(var1);
   }

   public void dN(File var1) {
      this.ld = new vl(var1);
      this.wU = null;
   }

   public void ld(File var1) {
      this.QE = var1;
   }

   public void dN() {
      File var1 = this.QE();
      if(!this.zs && var1.exists()) {
         throw new ID();
      } else if(this.ld.isFile() && this.ld.canRead()) {
         try {
            TM.dN(var1);
         } catch (QO var3) {
            throw new zX(var3);
         }

         var1.mkdirs();
         switch(this.fa) {
         case 256:
            this.dN.dN(this.ld, var1);
            break;
         case 257:
            this.dN.dN(this.ld, var1, this.ld());
         }

         this.dN.ld(this.ld, var1);
      } else {
         throw new oA();
      }
   }

   public void dN(short var1) {
      if(var1 != 0 && var1 != 1 && var1 != 2) {
         throw new zX();
      }
   }

   public void ld(short var1) {
      if(var1 != 256 && var1 != 257) {
         throw new zX();
      } else {
         this.fa = var1;
      }
   }

   public void dN(boolean var1) {
      this.zs = var1;
   }

   public LP ld() {
      if(this.wU == null) {
         Qj.dN = false;
         this.wU = this.dN.dN(this.ld);
         this.wU.dN((String)null);
      }

      return this.wU;
   }

   private File QE() {
      if(this.QE == null) {
         throw new zX();
      } else {
         return this.QE;
      }
   }
}
