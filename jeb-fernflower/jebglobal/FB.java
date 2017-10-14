package jebglobal;

import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Cx;
import jebglobal.HC;
import jebglobal.OM;
import jebglobal.Pl;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.XV;
import jebglobal.Xa;
import jebglobal.YJ;
import jebglobal.as;
import jebglobal.bm;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.u;
import jebglobal.yK;
import jebglobal.yn;
import org.eclipse.swt.widgets.MessageBox;

public final class FB extends as {
   private Pl KK;

   public FB(Pl var1) {
      super(var1, "Rename item");
      this.KK = var1;
      this.ld = 110;
      this.fa = HC.dN().dN("icon-letter-n.png");
      this.OK = true;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   private boolean dN(boolean var1) {
      YJ var2 = this.KK.OK();
      if(var2 == null) {
         return false;
      } else {
         Object var3 = var2.zs();
         if(var3 == null) {
            return false;
         } else if(var3 instanceof yK) {
            return dN(this.KK, (yK)((yK)var3), var1, (String)null);
         } else if(var3 instanceof hO) {
            return dN(this.KK, (hO)((hO)var3), var1, (String)null);
         } else if(var3 instanceof gE) {
            return dN(this.KK, (gE)((gE)var3), var1, (String)null);
         } else {
            if(var3 instanceof bm) {
               bm var6 = (bm)var3;
               OM var7 = (OM)var2.mS();
               if(var7 != null) {
                  if(var1) {
                     return true;
                  }

                  int var8 = var7.dN();
                  int var9 = var6.dN();
                  u var10 = this.KK.wU().ld().dN(var8, var9);
                  String var5 = var10 != null && var10.LH()?var10.Hw():OM.QE(var9);
                  String var4 = "Rename label";
                  Xa var11 = new Xa(this.KK.getShell(), this.KK.QE().XZ(), var4, var5);
                  var11.ld(true);
                  String var12 = var11.dN();
                  if(var12 != null && this.KK.wU().ld().dN(u.uK.wU, var8, var9, -1, var12.equals("")?null:var12)) {
                     var10 = this.KK.wU().ld().dN(var8, var9);
                     var5 = var10 != null && var10.LH()?var10.Hw():OM.QE(var9);
                     this.KK.dN((String)(":" + var5));
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }

   public static boolean dN(yn var0, yK var1, boolean var2, String var3) {
      if(var1.ld()) {
         return false;
      } else if(var2) {
         return true;
      } else {
         String var4 = var1.QE(true);
         String var5 = "Rename class";
         if(var3 == null) {
            Xa var6 = new Xa(var0.getShell(), var0.QE().XZ(), var5, var4);
            var6.ld(true);
            var3 = var6.dN();
            if(var3 == null) {
               return false;
            }
         }

         TM var11 = var0.QE().EO();
         String var7 = var1.ld(true);
         if(!var1.dN(var3.equals("")?null:var3)) {
            return false;
         } else {
            String var8 = var1.ld(true);
            String var9 = var8.substring(1, var8.length() - 1);
            String var10 = var9.substring(var9.lastIndexOf(47) + 1);
            if(var0 instanceof Pl) {
               var0.dN(var11.ld(WV.bL)?var8:var10);
            } else {
               var0.dN(var1.QE(true));
            }

            if(!var0.wU().mS().dN(var7, var8, var10)) {
               var0.wU().mS().KK();
            }

            var0.wU().ld().dN(u.uK.dN, var1.zs(), -1, -1, var3);
            return true;
         }
      }
   }

   public static boolean dN(yn var0, hO var1, boolean var2, String var3) {
      AV var4 = var1.ld();
      if(var4 != null && !var4.fa()) {
         if(var2) {
            return true;
         } else {
            String var5 = var1.ld(true);
            String var6 = "Rename method";
            if(var3 == null) {
               Xa var7 = new Xa(var0.getShell(), var0.QE().XZ(), var6, var5);
               var7.ld(true);
               var3 = var7.dN();
               if(var3 == null) {
                  return false;
               }
            }

            AR var16 = var0.wU().QE();
            Cx var8 = new Cx(var16);
            List var9 = var8.dN(var1);
            int var10 = var1.dN();
            int var11 = var9.size();
            if(var11 > 0 && var9.contains(Integer.valueOf(var10))) {
               Iterator var12 = var9.iterator();

               while(var12.hasNext()) {
                  int var13 = ((Integer)var12.next()).intValue();
                  hO var14 = var16.mS(var13);
                  if(!var14.dN(var3.equals("")?null:var3)) {
                     return false;
                  }
               }

               var1.ld(var3.equals("")?null:var3);
               var0.wU().ld().dN(u.uK.ld, var10, -1, -1, var3);
               var0.dN(var1.ld(true));
               boolean var17 = false;
               if(var11 >= 2) {
                  MessageBox var18 = new MessageBox(var0.getShell(), 194);
                  var18.setText("Confirmation");
                  var18.setMessage(String.format("To maintain consistency, %d overrides or superclass methods should also be renamed.\nRename these extra items? (If yes, a manual refresh of the view is required.)", new Object[]{Integer.valueOf(var11 - 1)}));
                  if(var18.open() == 64) {
                     var17 = true;
                  }
               }

               if(var17) {
                  Iterator var19 = var9.iterator();

                  while(var19.hasNext()) {
                     int var20 = ((Integer)var19.next()).intValue();
                     if(var20 != var10) {
                        hO var15 = var16.mS(var20);
                        var15.ld(var3.equals("")?null:var3);
                        var0.wU().ld().dN(u.uK.ld, var15.dN(), -1, -1, var3);
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public static boolean dN(yn var0, gE var1, boolean var2, String var3) {
      XV var4 = var1.ld();
      if(var4 == null) {
         return false;
      } else if(var2) {
         return true;
      } else {
         String var5 = var1.QE(true);
         String var6 = "Rename field";
         if(var3 == null) {
            Xa var7 = new Xa(var0.getShell(), var0.QE().XZ(), var6, var5);
            var7.ld(true);
            var3 = var7.dN();
            if(var3 == null) {
               return false;
            }
         }

         if(!var1.dN(var3.equals("")?null:var3)) {
            return false;
         } else {
            var0.dN(var1.QE(true));
            var0.wU().ld().dN(u.uK.QE, var4.dN(), -1, -1, var3);
            return true;
         }
      }
   }
}
