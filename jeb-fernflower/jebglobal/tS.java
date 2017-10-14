package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.Zh;
import jebglobal.lX;
import jebglobal.yn;
import jebglobal.yx;
import org.eclipse.swt.widgets.Composite;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public final class tS extends yn {
   private DocumentBuilderFactory OK = DocumentBuilderFactory.newInstance();
   private byte[] LH;
   private lX KK;
   private int EO;
   private boolean cb;

   public tS(Composite var1, yx var2) {
      super(var1, var2, var2.dN().XZ(), var2.dN().nA(), var2.dN().Ai());
   }

   public boolean ld(String var1) {
      try {
         byte[] var2 = TM.LH(var1);
         this.LH = var2;
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   public boolean dN(byte[] var1) {
      if(var1 == null) {
         return false;
      } else {
         this.LH = var1;
         return true;
      }
   }

   public void dN(boolean var1) {
      this.EO();
      if(this.Hw()) {
         if(var1) {
            this.dN(this.KK, this.zs.getTopIndex(), this.zs.getCaretOffset());
         } else {
            this.dN(this.KK, 0, 0);
         }

      }
   }

   private boolean Hw() {
      TM var1 = this.dN.dN().EO();
      this.EO = var1.QE(WV.zE);
      this.KK = new lX(this.ld);
      this.KK.wU(this.EO);
      this.KK.ld("    ");
      this.cb = false;
      return this.rK()?true:this.Ux();
   }

   private boolean rK() {
      try {
         DocumentBuilder var1 = this.OK.newDocumentBuilder();
         ByteArrayInputStream var2 = new ByteArrayInputStream(this.LH);
         Document var3 = var1.parse(var2);
         var3.normalize();
         Element var4 = var3.getDocumentElement();
         this.dN(var4);
         this.KK.QE();
         this.KK.wU();
         return true;
      } catch (Exception var5) {
         return false;
      }
   }

   private boolean Ux() {
      if(this.LH == null) {
         return false;
      } else {
         try {
            String[] var1 = (new String(this.LH)).split("\n", -1);
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
               String var4 = var1[var3];
               this.KK.wU(var4);
               this.KK.QE();
            }

            return true;
         } catch (Exception var5) {
            return false;
         }
      }
   }

   private void dN(Element var1) {
      if(this.cb) {
         this.KK.QE();
      }

      String var2 = var1.getTagName();
      this.KK.wU("<");
      this.KK.dN(var2);
      NamedNodeMap var3 = var1.getAttributes();

      String var7;
      for(int var4 = 0; var4 < var3.getLength(); ++var4) {
         Attr var5 = (Attr)var3.item(var4);
         String var6 = var5.getName();
         var7 = var5.getValue();
         this.KK.s();
         this.KK.wU(0);
         this.KK.dN(var6, Zh.VX);
         this.KK.wU("=\"");
         this.KK.dN(var7, Zh.ci);
         this.KK.wU("\"");
         this.KK.wU(this.EO);
      }

      NodeList var16 = var1.getChildNodes();
      if(var16.getLength() == 0) {
         this.KK.wU(" />");
         this.cb = true;
      } else {
         this.KK.wU(">");
         this.cb = true;

         for(int var17 = 0; var17 < var16.getLength(); ++var17) {
            Node var18 = var16.item(var17);
            int var11;
            if(var18 instanceof Text) {
               var7 = ((Text)var18).getWholeText();
               if(!var7.isEmpty()) {
                  boolean var19 = var7.indexOf(60) >= 0 || var7.indexOf(38) >= 0;
                  if(var19) {
                     this.KK.wU("<![CDATA[");
                  }

                  int var20 = this.KK.Hw();
                  this.KK.PF();
                  String[] var21 = var7.split("\n", -1);
                  var11 = 0;
                  String[] var22 = var21;
                  int var13 = var21.length;

                  for(int var14 = 0; var14 < var13; ++var14) {
                     String var15 = var22[var14];
                     this.KK.dN(var15, Zh.bG);
                     ++var11;
                     if(var11 < var21.length) {
                        this.KK.QE();
                     }
                  }

                  this.KK.mS(var20);
                  if(var19) {
                     this.KK.wU("]]>");
                  }

                  this.cb = false;
               }
            } else if(var18 instanceof Element) {
               this.KK.rK();
               this.dN((Element)var18);
               this.KK.Ux();
            } else {
               var7 = var18.toString();
               String[] var8 = var7.split("\n", -1);
               String[] var9 = var8;
               int var10 = var8.length;

               for(var11 = 0; var11 < var10; ++var11) {
                  String var12 = var9[var11];
                  this.KK.wU(var12);
                  this.KK.QE();
               }
            }
         }

         if(this.cb) {
            this.KK.QE();
         }

         this.KK.wU("</");
         this.KK.dN(var2);
         this.KK.wU(">");
         this.cb = true;
      }

   }
}
