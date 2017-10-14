package jebglobal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jebglobal.AV;
import jebglobal.XV;

public final class Uk {
   private XV[] dN;
   private XV[] ld;
   private AV[] QE;
   private AV[] wU;

   Uk(XV[] var1, XV[] var2, AV[] var3, AV[] var4) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      this.wU = var4;
   }

   public List dN() {
      return new ArrayList(Arrays.asList(this.dN));
   }

   public List ld() {
      return new ArrayList(Arrays.asList(this.ld));
   }

   public List QE() {
      ArrayList var1 = new ArrayList(Arrays.asList(this.dN));
      var1.addAll(Arrays.asList(this.ld));
      return var1;
   }

   public List wU() {
      return new ArrayList(Arrays.asList(this.QE));
   }

   public List fa() {
      return new ArrayList(Arrays.asList(this.wU));
   }

   public List zs() {
      ArrayList var1 = new ArrayList(Arrays.asList(this.QE));
      var1.addAll(Arrays.asList(this.wU));
      return var1;
   }
}
