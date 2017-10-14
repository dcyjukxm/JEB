package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import jebglobal.AR;
import jebglobal.HC;
import jebglobal.QW;
import jebglobal.TM;
import jebglobal.ZE;
import jebglobal.cn;
import jebglobal.oa;
import jebglobal.yK;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public final class ly extends Composite implements QW, ZE {
   private Tree dN;
   private List ld;
   private TreeItem QE;
   private Button wU;
   private boolean fa;
   private Pattern zs;
   private AR mS;
   private oa OK;

   public ly(Composite var1, Font var2, AR var3, boolean var4, String var5) {
      super(var1, 0);
      this.setLayout(new FillLayout());
      Composite var6 = new Composite(this, 0);
      var6.setLayout(new FormLayout());
      this.wU = new Button(var6, 32);
      this.wU.setText("Show inner classes");
      FormData var7 = new FormData();
      var7.left = new FormAttachment(0);
      var7.right = new FormAttachment(100);
      var7.bottom = new FormAttachment(100);
      var7.height = this.wU.computeSize(-1, -1).y;
      this.wU.setLayoutData(var7);
      this.dN = new Tree(var6, 2048);
      this.dN.setLayout(new FillLayout());
      this.dN.setFont(var2);
      var7 = new FormData();
      var7.left = new FormAttachment(0);
      var7.right = new FormAttachment(100);
      var7.top = new FormAttachment(0);
      var7.bottom = new FormAttachment(this.wU);
      this.dN.setLayoutData(var7);
      this.mS = var3;
      this.ld = new ArrayList();
      this.fa = var4;
      this.zs = null;
      if(var5 != null) {
         try {
            this.zs = Pattern.compile(var5.trim());
         } catch (PatternSyntaxException var8) {
            cn.dN(String.format("Invalid package name blacklist: %s", new Object[]{var5}));
         }
      }

      this.wU.setSelection(var4);
      this.wU.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private ly dN = ly.this;

         public void widgetSelected(SelectionEvent var1) {
            boolean var2 = this.dN.wU.getSelection();
            if(var2 != this.dN.fa) {
               this.dN.fa = var2;
               this.dN.KK();
            }

         }
      });
      this.KK();
   }

   public void setFont(Font var1) {
      this.dN.setFont(var1);
   }

   public boolean dN(String var1, String var2, String var3) {
      Iterator var4 = this.ld.iterator();

      while(var4.hasNext()) {
         TreeItem var5 = (TreeItem)var4.next();
         Boolean var6 = (Boolean)var5.getData("terminal");
         if(var6 != null && var6.booleanValue()) {
            String var7 = (String)var5.getData("signature");
            if(var7 != null && var7.equals(var1)) {
               var5.setText(var3);
               var5.setData("signature", var2);
               return true;
            }
         }
      }

      return false;
   }

   public void KK() {
      this.dN.removeAll();
      this.ld.clear();
      this.QE = null;
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.mS.Hw().iterator();

      while(true) {
         yK var3;
         do {
            if(!var2.hasNext()) {
               TreeMap var13 = new TreeMap();
               Iterator var14 = var1.iterator();

               String var4;
               while(var14.hasNext()) {
                  var4 = (String)var14.next();
                  String[] var5 = var4.substring(1, var4.length() - 1).split("/");
                  TreeMap var6 = var13;
                  int var7 = 1;
                  String[] var8 = var5;
                  int var9 = var5.length;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     String var11 = var8[var10];
                     if(var7++ < var5.length) {
                        var11 = '!' + var11;
                     }

                     if(var6.containsKey(var11)) {
                        var6 = (TreeMap)var6.get(var11);
                     } else {
                        TreeMap var12 = new TreeMap();
                        var6.put(var11, var12);
                        var6 = var12;
                     }
                  }
               }

               var13 = this.ld(var13);
               var14 = var13.keySet().iterator();

               while(var14.hasNext()) {
                  var4 = (String)var14.next();
                  TreeItem var15 = new TreeItem(this.dN, 0);
                  var15.setText(var4.replace("!", ""));
                  this.dN.showItem(var15);
                  dN(this.dN, var15, (Map)var13.get(var4));
               }

               this.dN(this.dN.getItems(), false);
               return;
            }

            var3 = (yK)var2.next();
         } while(!this.fa && var3.dN());

         var1.add(var3.dN(true));
      }
   }

   private void dN(TreeItem[] var1, boolean var2) {
      TreeItem[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         TreeItem var6 = var3[var5];
         var6.setData("index", Integer.valueOf(this.ld.size()));
         String var7 = this.dN(var6);
         var6.setData("signature", var7);
         this.ld.add(var6);
         boolean var8 = false;
         if(var2) {
            var6.setExpanded(false);
            var8 = true;
         } else if(this.zs != null) {
            String var9 = var7.substring(1, var7.length() - 1).replace('/', '.');
            if(this.zs.matcher(var9).matches()) {
               var6.setExpanded(false);
               var8 = true;
            }
         }

         TreeItem[] var10 = var6.getItems();
         if(var10.length == 0) {
            var6.setData("terminal", Boolean.valueOf(true));
         } else {
            this.dN(var10, var8);
         }
      }

   }

   public void dN(SelectionListener var1) {
      this.dN.addSelectionListener(var1);
   }

   private static void dN(Tree var0, TreeItem var1, Map var2) {
      Iterator var3 = var2.keySet().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         TreeItem var5 = new TreeItem(var1, 0);
         var5.setText(var4.replace("!", ""));
         var0.showItem(var5);
         dN(var0, var5, (Map)var2.get(var4));
      }

   }

   private boolean dN(TreeMap var1) {
      return var1 != null && var1.size() == 1 && !((TreeMap)var1.values().iterator().next()).isEmpty();
   }

   private TreeMap ld(TreeMap var1) {
      int var2;
      TreeMap var3;
      TreeMap var6;
      do {
         var2 = 0;
         var3 = new TreeMap();
         Iterator var4 = var1.keySet().iterator();

         while(var4.hasNext()) {
            String var5 = (String)var4.next();
            var6 = (TreeMap)var1.get(var5);
            if(this.dN(var6)) {
               String var7 = (String)var6.keySet().iterator().next();
               var3.put(var5 + "." + var7, var6.get(var7));
               ++var2;
            } else {
               var3.put(var5, var6);
            }
         }

         var1 = var3;
      } while(var2 > 0);

      Iterator var8 = var3.keySet().iterator();

      while(var8.hasNext()) {
         String var9 = (String)var8.next();
         TreeMap var10 = (TreeMap)var1.get(var9);
         var6 = this.ld(var10);
         var1.put(var9, var6);
      }

      return var1;
   }

   public void dN(String var1) {
      if(var1 == null) {
         if(this.QE != null) {
            this.QE.setBackground((Color)null);
            this.QE = null;
         }

      } else if(this.dN != null) {
         String var2 = var1.substring(1, var1.length() - 1);
         var2 = var2.replace('/', '.');
         TreeItem[] var3 = this.dN.getItems();
         TreeItem var4 = null;

         while(var4 == null) {
            boolean var5 = true;
            TreeItem[] var6 = var3;
            int var7 = var3.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               TreeItem var9 = var6[var8];
               String var10 = var9.getText();
               if(var2.startsWith(var10)) {
                  String var11 = var2.substring(var10.length());
                  if(var11.length() == 0) {
                     if(var9 == null || var9.getData("terminal") != null) {
                        var4 = var9;
                        var5 = false;
                        break;
                     }
                  } else if(var11.charAt(0) == 46) {
                     var2 = var11.substring(1);
                     var3 = var9.getItems();
                     var5 = false;
                     break;
                  }
               }
            }

            if(var5) {
               break;
            }
         }

         if(var4 != this.QE) {
            if(this.QE != null) {
               this.QE.setBackground((Color)null);
            }

            TreeItem[] var12 = this.dN.getSelection();
            if(var12 != null && var12.length >= 1) {
               String var13 = (String)var12[0].getData("signature");
               if(var1.equals(var13)) {
                  this.QE = null;
                  return;
               }
            }

            this.QE = var4;
            if(var4 != null) {
               var4.setBackground(HC.dN().dN(255, 192, 192));
            }
         }
      }
   }

   public oa dN() {
      return this.OK;
   }

   public void dN(oa var1) {
      if(var1 == null) {
         var1 = this.OK;
         if(var1 == null) {
            return;
         }
      }

      TreeItem[] var3 = this.dN.getSelection();
      if(var3 != null && var3.length >= 1) {
         TreeItem var2 = var3[0];
         int var4 = -1;
         int var5 = ((Integer)var2.getData("index")).intValue();
         boolean var6 = false;

         while(true) {
            while(true) {
               var5 += var1.QE?-1:1;
               if(var5 < 0 || var5 >= this.ld.size()) {
                  break;
               }

               var2 = (TreeItem)this.ld.get(var5);
               if(var2.getData("terminal") != null) {
                  String var7 = (String)var2.getData("signature");
                  var4 = TM.dN(var7, 0, var1.dN, var1.ld, false);
                  if(var4 >= 0) {
                     this.dN.setSelection(var2);
                     break;
                  }
               }
            }

            if(var4 >= 0 || !var1.wU || var6) {
               if(var4 < 0) {
                  Display.getCurrent().beep();
               }

               this.OK = var1;
               return;
            }

            Display.getCurrent().beep();
            var6 = true;
            var5 = var1.QE?this.ld.size():-1;
         }
      }
   }

   private String dN(TreeItem var1) {
      ArrayList var2;
      for(var2 = new ArrayList(); var1 != null; var1 = var1.getParentItem()) {
         var2.add(0, var1.getText());
      }

      StringBuilder var3 = new StringBuilder("L");

      for(int var4 = 0; var4 < var2.size(); ++var4) {
         var3.append((String)var2.get(var4));
         if(var4 == var2.size() - 1) {
            var3.append(";");
         } else {
            var3.append("/");
         }
      }

      String var5 = var3.toString().replace('.', '/');
      return var5;
   }
}
