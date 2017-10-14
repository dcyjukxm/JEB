package jebglobal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import jebglobal.AR;
import jebglobal.QA;
import jebglobal.Rg;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.cn;
import jebglobal.eI;
import jebglobal.ew;
import jebglobal.rP;
import jebglobal.uK;

public class cd extends eI {
   private static final long LK = 844563159190538443L;
   private ew Ux;
   private AR ZY;
   private Rg s;

   public static void dN(String var0, String var1, String var2, String[] var3) {
      (new cd(var0, var1, var2, var3)).rn();
      System.exit(0);
   }

   public cd(String var1, String var2, String var3, String[] var4) {
      super(var1, var2, var3, var4);
   }

   public void rn() {
      super.PF();
      if(uK.ld()) {
         cn.dN(rP.dN(new byte[]{107, 60, 13, 69, 65, 20, 1, 27, 2, 12, 21, 29, 6, 1, 78, 77, 2, 11, 1, 69, 73, 26, 83, 68, 13, 26, 18, 3, 14, 9, 1, 68, 73, 7, 78, 68, 1, 8, 2, 79, 66, 23, 28, 5, 8, 23, 82}, 1, 63));
         Ee();
      }

      if(this.rK.ld(WV.bG)) {
         if(!uK.ld()) {
            cn.dN(String.format("(Update checks can be disabled by setting \'%s\' to \'false\' in the configuration file.)", new Object[]{WV.bG.ld()}));
         }

         this.LR();
      }

      if(this.cb != null) {
         this.dN(this.cb);
      }

      if(this.PF != null) {
         QA var1 = this.dN(this.PF, true, (Runnable)null);
         if(var1 == null) {
            cn.dN("An error occurred, the script could not be loaded");
         } else if(var1.dN() != QA.uK.QE) {
            cn.dN("An error occurred, the script could not be terminated");
         }
      }

      super.Hw();
   }

   public boolean rK() {
      return this.ZY != null;
   }

   public ew Ux() {
      return this.Ux;
   }

   public AR ZY() {
      return this.ZY;
   }

   public Rg s() {
      return this.s;
   }

   public boolean dN(String var1) {
      if(this.rK()) {
         return false;
      } else {
         cn.dN(String.format("Opening %s", new Object[]{var1}));
         int var2 = TM.KK(var1);
         if((var2 & 16777215) == 4342858) {
            this.Ux = this.wU(var1);
         } else {
            this.Ux = this.dN(var1, false);
         }

         if(this.Ux == null) {
            cn.dN("Invalid file or file does not exist");
            return false;
         } else {
            this.ZY = new AR(this.Ux.ld("classes.dex"));
            this.ZY.dN(this.rK.ld(WV.kq));
            this.ZY.ld(this.rK.ld(WV.ir));
            this.ZY.QE(this.rK.ld(WV.rF));
            this.ZY.wU(this.rK.ld(WV.IL));

            try {
               this.ZY.Ux();
            } catch (Exception var3) {
               cn.dN("Invalid DEX file");
               this.ZY = null;
            }

            if(this.ZY == null) {
               this.Ux = null;
               return false;
            } else {
               cn.dN("DEX analysis complete");
               this.dN(this.Ux, this.ZY);
               this.s = new Rg(this.ZY);
               this.cb = var1;
               return true;
            }
         }
      }
   }

   public boolean Hv() {
      return !this.rK()?false:this.Ux.ld();
   }

   public boolean VX() {
      if(!this.rK()) {
         return false;
      } else {
         this.cb = null;
         this.Ux = null;
         this.ZY = null;
         this.s = null;
         return true;
      }
   }

   public boolean ld(String var1) {
      System.out.println(var1);
      System.out.println(rP.dN(new byte[]{20, 29, 25, 13, 23, 73, 69, 17, 17, 83, 10, 67, 93, 79, 17, 88, 94, 65, 73, 69, 30, 16, 69, 91, 73, 78, 111, 2, 19, 6, 31, 22, 0, 4, 0, 16, 74, 29, 72, 0}, 2, 212));
      BufferedReader var3 = new BufferedReader(new InputStreamReader(System.in));

      String var2;
      try {
         var2 = var3.readLine();
      } catch (IOException var4) {
         return false;
      }

      return var2 != null && var2.trim().equalsIgnoreCase(rP.dN(new byte[]{20, 28, 22}, 1, 109));
   }

   public void ci() {
      System.out.println(String.format("This is your first run of JEB v%s. The changelist can be found at %s.", new Object[]{dN.toString(), "http://www.android-decompiler.com/changelist.php"}));
   }

   public void bG() {
   }

   public String QE(String var1) {
      System.out.println(String.format(rP.dN(new byte[]{11, 10, 28, 21, 29, 73, 66, 27, 90, 0, 113, 12, 92, 0, 95, 92, 92, 87, 12, 65, 18, 92, 88, 80, 73, 78, 60, 23, 65, 8, 9, 28, 0, 21, 1, 68, 90, 28, 23, 0, 35, 49, 49, 14, 65, 50, 14, 0, 31, 73, 14, 26, 0, 94, 90, 73, 44, 9, 76, 79, 2, 12, 21, 9, 0, 26, 79, 28, 69, 4, 12, 30, 26, 69, 11, 64, 47, 22, 80, 13, 19, 2, 2, 72, 21, 0, 78, 6, 94, 0, 66, 92, 90, 92, 66, 68, 65, 30}, 2, 212), new Object[]{"              "}));
      System.out.println(String.format(rP.dN(new byte[]{62, 60, 9, 4, 18, 22, 69, 86, 31, 26, 26, 29, 84, 5, 86, 95, 12, 65, 15, 10, 68, 85, 6, 22, 69, 84, 28, 13, 69, 70, 9, 3, 0, 3, 24, 30, 7, 9, 71, 2, 78, 5, 10, 6, 11, 29, 22, 69, 68, 5, 21, 21, 67, 2, 66, 14, 3, 13, 66, 84, 27, 79, 71, 2, 11, 11, 23, 19, 21, 17, 69, 65, 65, 75, 14, 28}, 1, 110), new Object[]{"http://www.android-decompiler.com/genlk.php"}));
      System.out.println(String.format(rP.dN(new byte[]{15, 6, 19, 28, 28, 26, 2, 72, 16, 65, 92, 2, 19, 0, 20, 74}, 2, 246), new Object[]{var1}));
      System.out.print(rP.dN(new byte[]{100, 39, 30, 5, 1, 84, 89, 22, 26, 7, 82, 76, 5, 10, 6, 11, 29, 22, 69, 75, 14, 28, 67, 26}, 1, 45));
      BufferedReader var2 = new BufferedReader(new InputStreamReader(System.in));

      try {
         return var2.readLine();
      } catch (IOException var3) {
         return null;
      }
   }

   public void dN(long var1) {
      if(var1 != 0L) {
         if(var1 == -1L) {
            cn.dN(rP.dN(new byte[]{23, 7, 21, 89, 17, 6, 9, 28, 6, 79, 68, 15, 76, 82, 17, 80, 74, 19, 89, 78, 64, 85, 66, 67, 67, 78, 60, 27, 23, 6, 76, 10, 82, 65, 27, 10, 93, 10, 19, 67, 1, 21, 17, 76, 4, 72}, 2, 207));
         } else if(var1 == 1L) {
            cn.dN(rP.dN(new byte[]{13, 0, 80, 20, 29, 27, 2, 72, 7, 69, 73, 23, 90, 0, 80, 75, 92, 19, 77, 86, 83, 89, 93, 82, 78, 76, 42, 82, 21, 12, 76, 23, 85, 15, 78, 46, 106, 45, 92}, 2, 185));
         } else if(var1 == 2L) {
            cn.dN(rP.dN(new byte[]{-12, 60, 13, 69, 67, 15, 5, 12, 11, 26, 84, 73, 26, 83, 84, 27, 0, 79, 79, 3, 8, 72, 12, 80, 28, 9, 4, 18, 22, 69, 85, 5, 20, 5, 21, 17, 69, 106, 15, 7, 108}, 1, 160));
         } else if(var1 == 3L) {
            cn.dN(rP.dN(new byte[]{10, 1, 19, 22, 31, 25, 6, 28, 29, 66, 68, 6, 9, 66, 68, 80, 85, 87, 95, 12, 18, 93, 80, 88, 73, 0, 60, 7, 19, 6, 76, 47, 101, 35, 78, 5, 65, 11, 82, 84, 1, 17, 83, 67, 14, 8, 18, 27, 3, 5, 13, 17, 23, 83, 79, 82, 36, 76, 0, 73, 17, 12, 9, 27, 17, 23, 0, 6, 10, 83, 17, 26, 19, 69, 23, 79, 46, 10, 80, 28, 28, 29, 14, 28, 13, 14}, 2, 176));
         }

         Ee();
      }

   }

   void LR() {
      this.dN(false);
      if(!uK.ld()) {
         int var1 = this.dN(true);
         if(var1 == -2) {
            cn.dN(String.format("A new version is available, but the update could not be downloaded. Please install the update manually. You should have received an email from %s.\n", new Object[]{"updates@android-decompiler.com"}));
         } else if(var1 == 2) {
            cn.dN("A new version is available. The update will be automatically installed after you restart the program. As files will be overwritten, it is recommended you backup your JEB directory.\n");
         }
      }

   }
}
