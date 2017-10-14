package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.TM;
import jebglobal.fL;
import jebglobal.lF;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public final class Ss extends fL {
   private static int dN = 8;
   private int ld;
   private int QE;
   private String[] wU;
   private List fa;
   private Integer zs = Integer.valueOf(-1);
   private lF mS;

   public Ss(Shell var1, int var2, List var3, int var4, String var5, String var6, String var7) {
      super(var1, var5, 67696);
      this.ld = var2 >= 1?var2:dN;
      this.QE = var4;
      this.wU = new String[]{var6, var7};
      this.fa = new ArrayList(var3.size());
      Iterator var8 = var3.iterator();

      while(var8.hasNext()) {
         Ss.uK var9 = (Ss.uK)var8.next();
         String[] var10 = new String[]{Integer.toString(var9.ld), var9.QE};
         this.fa.add(var10);
      }

   }

   public Integer dN() {
      super.ld();
      return this.zs;
   }

   public void dN(final Shell var1) {
      var1.setLayout(new GridLayout(1, false));
      this.mS = new lF(var1, true, this.wU, this.fa, this.QE);
      Point var2 = new Point(var1.getClientArea().width, var1.getClientArea().height);
      Point var3 = this.mS.computeSize(-1, -1);
      GridData var4 = new GridData(4, 4, true, true);
      if(var3.x > var2.x) {
         var4.widthHint = var2.x;
      }

      if(this.ld >= 0) {
         var4.heightHint = (this.ld + 1) * this.mS.wU();
         if(var4.heightHint > var2.y) {
            var4.heightHint = var2.y;
         }
      } else if(var3.y > var2.y) {
         var4.heightHint = var2.y;
      }

      this.mS.setLayoutData(var4);
      Composite var5 = new Composite(var1, 0);
      var5.setLayout(new RowLayout(256));
      Button var6 = TM.dN((Composite)var5, (String)"OK", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private Ss ld = Ss.this;

         public void widgetSelected(SelectionEvent var1) {
            this.ld.zs = Integer.valueOf(this.ld.mS.QE());
            this.dN.close();
         }
      }));
      TM.dN((Composite)var5, (String)"Cancel", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.close();
         }
      }));
      var1.setDefaultButton(var6);
      this.mS.dN((SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private Ss ld = Ss.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            this.ld.zs = Integer.valueOf(this.ld.mS.QE());
            this.dN.close();
         }
      }));
   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }

   public static class uK {
      public int dN;
      public int ld;
      public String QE;

      public uK(int var1, int var2, String var3) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
      }
   }
}
