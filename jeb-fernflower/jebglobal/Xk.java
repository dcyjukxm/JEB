package jebglobal;

import java.io.File;
import java.util.Random;
import jebglobal.rP;

public class Xk {
   private static Xk dN = null;
   private static String ld = rP.dN(new byte[]{-108, 68, 12, 5, 2, 80, 0, 8, 10, 11}, 1, 186);
   private File QE;
   private Random wU;

   private Xk() {
      String var1 = System.getProperty(rP.dN(new byte[]{54, 28, 21, 11, 92, 1, 8, 5, 17}, 2, 104));
      this.QE = new File(var1, ld);
      this.wU = new Random(System.currentTimeMillis());
   }
}
