package jebglobal;

import java.util.ArrayList;
import java.util.List;

public final class Js {
   public List dN = new ArrayList();
   public List ld = new ArrayList();
   public List QE = new ArrayList();

   public String toString() {
      return String.format("(cnt=%d, dstoff=%s, idstoff=%s)", new Object[]{Integer.valueOf(this.dN.size()), this.ld, this.QE});
   }
}
