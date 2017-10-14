package jeb.api.ui;

import jeb.api.ui.JebUI;
import jeb.api.ui.View;
import jebglobal.lW;

public class TextView extends View {
   lW v;

   TextView(JebUI var1, lW var2) {
      super(var1, var2);
      this.v = var2;
   }

   public String getText() {
      return (String)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = TextView.this.v.bG();
         }
      });
   }

   public int getLineCount() {
      return ((Integer)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = Integer.valueOf(TextView.this.v.BQ());
         }
      })).intValue();
   }

   public String getLine(final int var1) {
      return (String)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            if(var1 >= 0 && var1 < TextView.this.v.BQ()) {
               this.result = TextView.this.v.mS(var1);
            } else {
               this.result = null;
            }

         }
      });
   }

   public boolean gotoLine(final int var1) {
      return ((Boolean)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            if(var1 >= 0 && var1 < TextView.this.v.BQ()) {
               TextView.this.v.dN(var1);
               this.result = Boolean.valueOf(true);
            } else {
               this.result = Boolean.valueOf(false);
            }

         }
      })).booleanValue();
   }

   public int getCaretOffset() {
      return ((Integer)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = Integer.valueOf(TextView.this.v.fa());
         }
      })).intValue();
   }

   public void setCaretOffset(final int var1) {
      this.ui.exec(new Runnable() {
         public void run() {
            TextView.this.v.zs(var1);
         }
      });
   }

   public void setCaretPosition(final int var1, final int var2) {
      this.ui.exec(new Runnable() {
         public void run() {
            TextView.this.v.dN(var1, var2);
         }
      });
   }

   public int getCaretLine() {
      return ((Integer)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = Integer.valueOf(TextView.this.v.zs());
         }
      })).intValue();
   }

   public int getOffsetAtLine(final int var1) {
      return ((Integer)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = Integer.valueOf(TextView.this.v.OK(var1));
         }
      })).intValue();
   }
}
