package jebglobal;

import java.io.File;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jebglobal.Xo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class Nz {
   private DocumentBuilderFactory dN = DocumentBuilderFactory.newInstance();
   private HashMap ld = new HashMap();

   public boolean dN(File var1) {
      return this.dN(var1.getAbsolutePath());
   }

   public boolean dN(String var1) {
      Document var2;
      try {
         DocumentBuilder var3 = this.dN.newDocumentBuilder();
         var2 = var3.parse(var1);
      } catch (Exception var13) {
         return false;
      }

      var2.normalize();
      Element var14 = var2.getDocumentElement();
      if(var14 != null && var14.getTagName().equals("resources")) {
         NodeList var4 = var14.getChildNodes();

         for(int var5 = 0; var5 < var4.getLength(); ++var5) {
            Node var6 = var4.item(var5);
            if(var6 instanceof Element) {
               Element var7 = (Element)var6;
               if(var7.getNodeName().equals("public")) {
                  try {
                     String var8 = var7.getAttribute("id");
                     int var9;
                     if(var8.startsWith("0x")) {
                        var9 = Integer.parseInt(var8.substring(2), 16);
                     } else {
                        var9 = Integer.parseInt(var8, 10);
                     }

                     String var10 = var7.getAttribute("type");
                     String var11 = var7.getAttribute("name");
                     if(var9 >= 0 && var10.length() >= 1 && var11.length() >= 1) {
                        this.ld.put(Integer.valueOf(var9), new Xo(var9, var10, var11, "\'"));
                     }
                  } catch (Exception var12) {
                     ;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public Xo dN(int var1) {
      return (Xo)this.ld.get(Integer.valueOf(var1));
   }
}
