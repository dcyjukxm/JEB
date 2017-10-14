package jebglobal;

import java.io.OutputStream;

final class OF extends OutputStream {
   private StringBuilder dN;

   public OF(StringBuilder var1) {
      this.dN = var1;
   }

   public void write(int var1) {
      char var2 = (char)var1;
      this.dN.append(var2);
   }
}
