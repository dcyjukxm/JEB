package jeb.api.ui;

import jeb.api.ui.JebUI;
import jebglobal.ZE;

public abstract class View {
   JebUI ui;
   ZE v;

   View(JebUI var1, ZE var2) {
      if(var1 != null && var2 != null) {
         this.ui = var1;
         this.v = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void refresh() {
      this.ui.exec(new Runnable() {
         public void run() {
            View.this.v.KK();
         }
      });
   }

   public static enum Type {
      ASSEMBLY,
      JAVA,
      MANIFEST,
      NOTES,
      CLASS_HIERARCHY,
      CONSOLE;
   }
}
