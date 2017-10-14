package jeb.api.ui;

import jeb.api.ui.AssemblyView;
import jeb.api.ui.JavaView;
import jeb.api.ui.TextView;
import jeb.api.ui.TreeView;
import jeb.api.ui.View;
import jeb.api.ui.XmlView;
import jebglobal.Ky;
import jebglobal.Os;
import jebglobal.Pl;
import jebglobal.dh;
import jebglobal.lW;
import jebglobal.ly;
import jebglobal.tS;
import jebglobal.uT;
import jebglobal.yK;
import jebglobal.yW;
import jebglobal.yx;
import org.eclipse.swt.widgets.MessageBox;

public class JebUI {
   private yW ctx;
   private yx w;
   private boolean running_on_ui;

   public JebUI(Object var1) {
      if(!(var1 instanceof yW)) {
         throw new RuntimeException();
      } else {
         this.ctx = (yW)var1;
         this.w = this.ctx.uM();
      }
   }

   void exec(Runnable var1) {
      if(this.running_on_ui) {
         var1.run();
      } else {
         this.running_on_ui = true;
         this.ctx.Nh().syncExec(var1);
         this.running_on_ui = false;
      }

   }

   Object execReturn(JebUI.RunnableEx var1) {
      this.exec(var1);
      return var1.result;
   }

   public View getView(final View.Type var1) {
      return (View)this.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = null;
            switch(JebUI.SyntheticClass_1.$SwitchMap$jeb$api$ui$View$Type[var1.ordinal()]) {
            case 1:
               Pl var6 = JebUI.this.w.OK();
               if(var6 != null) {
                  this.result = new AssemblyView(JebUI.this, var6);
               }
               break;
            case 2:
               Os var5 = JebUI.this.w.cb();
               if(var5 != null) {
                  this.result = new JavaView(JebUI.this, var5);
               }
               break;
            case 3:
               tS var4 = JebUI.this.w.Hw();
               if(var4 != null) {
                  this.result = new XmlView(JebUI.this, var4);
               }
               break;
            case 4:
               uT var3 = JebUI.this.w.Ux();
               if(var3 != null) {
                  this.result = new TextView(JebUI.this, var3);
               }
               break;
            case 5:
               ly var2 = JebUI.this.w.mS();
               if(var2 != null) {
                  this.result = new TreeView(JebUI.this, var2);
               }
               break;
            case 6:
               lW var1x = JebUI.this.ctx.kq();
               if(var1x != null) {
                  this.result = new TextView(JebUI.this, var1x);
               }
            }

         }
      });
   }

   public boolean focusView(final View.Type var1) {
      return ((Boolean)this.execReturn(new JebUI.RunnableEx() {
         public void run() {
            switch(JebUI.SyntheticClass_1.$SwitchMap$jeb$api$ui$View$Type[var1.ordinal()]) {
            case 1:
               JebUI.this.w.EO();
               this.result = Boolean.valueOf(true);
               break;
            case 2:
               JebUI.this.w.PF();
               this.result = Boolean.valueOf(true);
               break;
            case 3:
               JebUI.this.w.rK();
               this.result = Boolean.valueOf(true);
               break;
            case 4:
               JebUI.this.w.ZY();
               this.result = Boolean.valueOf(true);
               break;
            case 5:
               this.result = Boolean.valueOf(false);
               break;
            case 6:
               this.result = Boolean.valueOf(false);
            }

         }
      })).booleanValue();
   }

   public boolean isViewVisible(final View.Type var1) {
      return ((Boolean)this.execReturn(new JebUI.RunnableEx() {
         public void run() {
            switch(JebUI.SyntheticClass_1.$SwitchMap$jeb$api$ui$View$Type[var1.ordinal()]) {
            case 1:
               this.result = Boolean.valueOf(JebUI.this.w.OK().isVisible());
               break;
            case 2:
               this.result = Boolean.valueOf(JebUI.this.w.cb().isVisible());
               break;
            case 3:
               this.result = Boolean.valueOf(JebUI.this.w.Hw().isVisible());
               break;
            case 4:
               this.result = Boolean.valueOf(JebUI.this.w.Ux().isVisible());
               break;
            case 5:
               this.result = Boolean.valueOf(true);
               break;
            case 6:
               this.result = Boolean.valueOf(true);
            }

         }
      })).booleanValue();
   }

   public void setStatus(final String var1) {
      this.exec(new Runnable() {
         public void run() {
            JebUI.this.ctx.zs(var1);
         }
      });
   }

   public String getStatus() {
      return (String)this.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = JebUI.this.ctx.IL();
         }
      });
   }

   public void enableStatusUpdates(final boolean var1) {
      this.exec(new Runnable() {
         public void run() {
            JebUI.this.ctx.wU(var1);
         }
      });
   }

   public boolean decompileClass(final String var1, final boolean var2) {
      return ((Boolean)this.execReturn(new JebUI.RunnableEx() {
         public void run() {
            yK var1x = JebUI.this.ctx.ZY().cb(var1);
            if(var1x == null) {
               this.result = Boolean.valueOf(false);
            } else {
               JebUI.this.w.cb().dN(var1x.dN(false), (Ky)null);
               if(var2) {
                  JebUI.this.w.PF();
               }

               this.result = Boolean.valueOf(true);
            }

         }
      })).booleanValue();
   }

   public String displayQuestionBox(final String var1, final String var2, final String var3) {
      return (String)this.execReturn(new JebUI.RunnableEx() {
         public void run() {
            dh var1x = new dh(JebUI.this.ctx.LR(), JebUI.this.ctx.XZ(), 1, var1, var2, var3);
            String var2x = var1x.dN();
            this.result = var2x;
         }
      });
   }

   public int displayMessageBox(final String var1, final String var2, final JebUI.IconType var3, final JebUI.ButtonGroupType var4) {
      return ((Integer)this.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = Integer.valueOf(JebUI.this.displayMessageBoxInternal(var1, var2, var3, var4));
         }
      })).intValue();
   }

   private int displayMessageBoxInternal(String var1, String var2, JebUI.IconType var3, JebUI.ButtonGroupType var4) {
      int var5 = 0;
      if(var3 != null) {
         switch(JebUI.SyntheticClass_1.$SwitchMap$jeb$api$ui$JebUI$IconType[var3.ordinal()]) {
         case 1:
            var5 = 4;
            break;
         case 2:
            var5 = 2;
            break;
         case 3:
            var5 = 8;
            break;
         case 4:
            var5 = 1;
         }
      }

      if(var4 != null) {
         switch(JebUI.SyntheticClass_1.$SwitchMap$jeb$api$ui$JebUI$ButtonGroupType[var4.ordinal()]) {
         case 1:
            var5 |= 32;
            break;
         case 2:
            var5 |= 288;
            break;
         case 3:
            var5 |= 192;
            break;
         case 4:
            var5 |= 448;
         }
      }

      MessageBox var6 = new MessageBox(this.ctx.LR(), var5);
      if(var1 != null) {
         var6.setText(var1);
      }

      if(var2 != null) {
         var6.setMessage(var2);
      }

      int var7 = var6.open();
      switch(var7) {
      case 32:
         return 1;
      case 64:
         return 2;
      case 128:
         return 3;
      case 256:
         return 0;
      default:
         throw new RuntimeException();
      }
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] $SwitchMap$jeb$api$ui$View$Type;
      // $FF: synthetic field
      static final int[] $SwitchMap$jeb$api$ui$JebUI$IconType;
      // $FF: synthetic field
      static final int[] $SwitchMap$jeb$api$ui$JebUI$ButtonGroupType = new int[JebUI.ButtonGroupType.values().length];

      static {
         try {
            $SwitchMap$jeb$api$ui$JebUI$ButtonGroupType[JebUI.ButtonGroupType.OK.ordinal()] = 1;
         } catch (NoSuchFieldError var13) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$JebUI$ButtonGroupType[JebUI.ButtonGroupType.OK_CANCEL.ordinal()] = 2;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$JebUI$ButtonGroupType[JebUI.ButtonGroupType.YES_NO.ordinal()] = 3;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$JebUI$ButtonGroupType[JebUI.ButtonGroupType.YES_NO_CANCEL.ordinal()] = 4;
         } catch (NoSuchFieldError var10) {
            ;
         }

         $SwitchMap$jeb$api$ui$JebUI$IconType = new int[JebUI.IconType.values().length];

         try {
            $SwitchMap$jeb$api$ui$JebUI$IconType[JebUI.IconType.QUESTION.ordinal()] = 1;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$JebUI$IconType[JebUI.IconType.INFORMATION.ordinal()] = 2;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$JebUI$IconType[JebUI.IconType.WARNING.ordinal()] = 3;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$JebUI$IconType[JebUI.IconType.ERROR.ordinal()] = 4;
         } catch (NoSuchFieldError var6) {
            ;
         }

         $SwitchMap$jeb$api$ui$View$Type = new int[View.Type.values().length];

         try {
            $SwitchMap$jeb$api$ui$View$Type[View.Type.ASSEMBLY.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$View$Type[View.Type.JAVA.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$View$Type[View.Type.MANIFEST.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$View$Type[View.Type.NOTES.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$View$Type[View.Type.CLASS_HIERARCHY.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            $SwitchMap$jeb$api$ui$View$Type[View.Type.CONSOLE.ordinal()] = 6;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }

   public static enum ButtonGroupType {
      OK,
      OK_CANCEL,
      YES_NO,
      YES_NO_CANCEL;
   }

   public static enum IconType {
      QUESTION,
      INFORMATION,
      WARNING,
      ERROR;
   }

   abstract static class RunnableEx implements Runnable {
      Object result;
   }
}
