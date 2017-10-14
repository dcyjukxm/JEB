package jebglobal;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import jebglobal.Kf;

public class WC implements Kf {
   private String QE = null;
   protected String dN = "\n";
   private String wU;
   public Writer ld;
   private int fa;
   private int zs = 0;
   private String[] mS = new String[2];
   private String[] OK;
   private String[] LH;
   private int[] KK;
   private int EO;
   private String[] cb;
   private String[] PF;
   private boolean Hw;
   private boolean rK;
   private boolean Ux;
   private boolean ZY;
   private boolean s;
   private boolean Hv;
   private boolean VX;
   private static final int ci = Runtime.getRuntime().freeMemory() > 1000000L?8192:256;
   private static String[] bG = new String[32];
   private boolean BQ;
   private int Ee;
   private int De;
   private char[] rn;
   private int LR;
   private boolean Nh;
   private boolean XZ;

   public WC() {
      this.OK = new String[this.mS.length];
      this.LH = new String[this.mS.length];
      this.KK = new int[this.mS.length];
      this.EO = 0;
      this.cb = new String[8];
      this.PF = new String[this.cb.length];
      int var10000 = ci;
      this.BQ = false;
   }

   protected void ld() {
      this.wU = null;
      this.ld = null;
      this.fa = 0;
      this.zs = 0;

      for(int var1 = 0; var1 < this.KK.length; ++var1) {
         this.OK[var1] = null;
         this.LH[var1] = null;
         this.mS[var1] = null;
         this.KK[var1] = 2;
      }

      this.EO = 0;
      this.cb[this.EO] = "xmlns";
      this.PF[this.EO] = "http://www.w3.org/2000/xmlns/";
      ++this.EO;
      this.cb[this.EO] = "xml";
      this.PF[this.EO] = "http://www.w3.org/XML/1998/namespace";
      ++this.EO;
      this.Hw = false;
      this.rK = false;
      this.Ux = false;
      this.s = false;
      this.Hv = false;
      this.VX = false;
   }

   protected void QE() {
      int var1 = this.OK.length;
      int var2 = (this.zs >= 7?2 * this.zs:8) + 2;
      boolean var3 = var1 > 0;
      String[] var4 = new String[var2];
      if(var3) {
         System.arraycopy(this.OK, 0, var4, 0, var1);
      }

      this.OK = var4;
      var4 = new String[var2];
      if(var3) {
         System.arraycopy(this.LH, 0, var4, 0, var1);
      }

      this.LH = var4;
      var4 = new String[var2];
      if(var3) {
         System.arraycopy(this.mS, 0, var4, 0, var1);
      }

      this.mS = var4;
      int[] var5 = new int[var2];
      if(var3) {
         System.arraycopy(this.KK, 0, var5, 0, var1);
      } else {
         var5[0] = 0;
      }

      this.KK = var5;
   }

   protected void wU() {
      int var1 = this.EO > 7?2 * this.EO:8;
      String[] var2 = new String[var1];
      String[] var3 = new String[var1];
      if(this.cb != null) {
         System.arraycopy(this.cb, 0, var2, 0, this.EO);
         System.arraycopy(this.PF, 0, var3, 0, this.EO);
      }

      this.cb = var2;
      this.PF = var3;
   }

   protected void fa() {
      if(this.ZY) {
         int var1 = 0;
         this.Ee = 0;
         if(this.Nh) {
            this.Ee = this.dN.length();
            var1 = 0 + this.Ee;
         }

         this.LR = 0;
         if(this.XZ) {
            this.De = this.QE.length();
            this.LR = 65 / this.De;
            var1 += this.LR * this.De;
         }

         if(this.rn == null || this.rn.length < var1) {
            this.rn = new char[var1 + 8];
         }

         int var2 = 0;
         int var3;
         if(this.Nh) {
            for(var3 = 0; var3 < this.dN.length(); ++var3) {
               this.rn[var2++] = this.dN.charAt(var3);
            }
         }

         if(this.XZ) {
            for(var3 = 0; var3 < this.LR; ++var3) {
               for(int var4 = 0; var4 < this.QE.length(); ++var4) {
                  this.rn[var2++] = this.QE.charAt(var4);
               }
            }
         }

      }
   }

   protected void zs() {
      int var1 = this.Nh?0:this.Ee;
      int var2 = this.zs > this.LR?this.LR:this.zs;
      this.ld.write(this.rn, var1, (var2 - 1) * this.De + this.Ee);
   }

   public void dN(String var1, Object var2) {
      if(var1 == null) {
         throw new IllegalArgumentException("property name can not be null");
      } else {
         if("http://xmlpull.org/v1/doc/properties.html#serializer-indentation".equals(var1)) {
            this.QE = (String)var2;
         } else if("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator".equals(var1)) {
            this.dN = (String)var2;
         } else {
            if(!"http://xmlpull.org/v1/doc/properties.html#location".equals(var1)) {
               throw new IllegalStateException("unsupported property " + var1);
            }

            this.wU = (String)var2;
         }

         this.Nh = this.dN != null && this.dN.length() > 0;
         this.XZ = this.QE != null && this.QE.length() > 0;
         this.ZY = this.QE != null && (this.Nh || this.XZ);
         this.fa();
         this.s = false;
      }
   }

   private String dN() {
      return this.wU != null?" @" + this.wU:"";
   }

   public void dN(OutputStream var1, String var2) {
      if(var1 == null) {
         throw new IllegalArgumentException("output stream can not be null");
      } else {
         this.ld();
         if(var2 != null) {
            this.ld = new OutputStreamWriter(var1, var2);
         } else {
            this.ld = new OutputStreamWriter(var1);
         }

      }
   }

   public void dN(String var1, Boolean var2) {
      this.ld.write("<?xml version=\"1.0\"");
      if(var1 != null) {
         this.ld.write(" encoding=");
         this.ld.write(34);
         this.ld.write(var1);
         this.ld.write(34);
      }

      if(var2 != null) {
         this.ld.write(" standalone=");
         this.ld.write(34);
         if(var2.booleanValue()) {
            this.ld.write("yes");
         } else {
            this.ld.write("no");
         }

         this.ld.write(34);
      }

      this.ld.write("?>");
   }

   public void mS() {
      while(this.zs > 0) {
         this.QE(this.mS[this.zs], this.OK[this.zs]);
      }

      this.Hw = this.Ux = true;
      this.ld.flush();
   }

   public void dN(String var1, String var2) {
      if(this.Ux) {
         this.LH();
      }

      if(var1 == null) {
         var1 = "";
      }

      var1 = var1.intern();

      for(int var3 = this.KK[this.zs]; var3 < this.EO; ++var3) {
         if(var1 == this.cb[var3]) {
            throw new IllegalStateException("duplicated prefix " + LH(var1) + this.dN());
         }
      }

      var2 = var2.intern();
      if(this.EO >= this.cb.length) {
         this.wU();
      }

      this.cb[this.EO] = var1;
      this.PF[this.EO] = var2;
      ++this.EO;
      this.rK = true;
   }

   protected String dN(String var1) {
      return this.dN(var1, true);
   }

   public String dN(String var1, boolean var2) {
      return this.dN(var1, var2, false);
   }

   protected String dN(String var1, boolean var2, boolean var3) {
      var1 = var1.intern();
      if(var1 == null) {
         throw new IllegalArgumentException("namespace must be not null" + this.dN());
      } else if(var1.length() == 0) {
         throw new IllegalArgumentException("default namespace cannot have prefix" + this.dN());
      } else {
         for(int var4 = this.EO - 1; var4 >= 0; --var4) {
            if(var1 == this.PF[var4]) {
               String var5 = this.cb[var4];
               if(!var3 || var5.length() != 0) {
                  for(int var6 = this.EO - 1; var6 > var4; --var6) {
                     String[] var10000 = this.cb;
                  }

                  return var5;
               }
            }
         }

         if(!var2) {
            return null;
         } else {
            return this.KK(var1);
         }
      }
   }

   private String KK(String var1) {
      ++this.fa;
      String var2 = this.fa < bG.length?bG[this.fa]:("n" + this.fa).intern();

      for(int var3 = this.EO - 1; var3 >= 0; --var3) {
         String[] var10000 = this.cb;
      }

      if(this.EO >= this.cb.length) {
         this.wU();
      }

      this.cb[this.EO] = var2;
      this.PF[this.EO] = var1;
      ++this.EO;
      return var2;
   }

   public int OK() {
      return this.zs;
   }

   public Kf ld(String var1, String var2) {
      if(this.Ux) {
         this.LH();
      }

      this.Hv = this.VX = false;
      ++this.zs;
      if(this.ZY && this.zs > 0 && this.s) {
         this.zs();
      }

      this.s = true;
      this.rK = false;
      this.Ux = true;
      if(this.zs + 1 >= this.OK.length) {
         this.QE();
      }

      this.mS[this.zs] = var1 == null?var1:var1.intern();
      this.OK[this.zs] = var2 == null?var2:var2.intern();
      if(this.ld == null) {
         throw new IllegalStateException("setOutput() must called set before serialization can start");
      } else {
         this.ld.write(60);
         if(var1 != null) {
            String var4;
            if(var1.length() > 0) {
               String var3 = null;
               if(this.zs > 0 && this.EO - this.KK[this.zs - 1] == 1) {
                  var4 = this.PF[this.EO - 1];
                  if(var4 == var1 || var4.equals(var1)) {
                     String var5 = this.cb[this.EO - 1];

                     for(int var6 = this.KK[this.zs - 1] - 1; var6 >= 2; --var6) {
                        String var7 = this.cb[var6];
                        if(var7 == var5 || var7.equals(var5)) {
                           String var8 = this.PF[var6];
                           if(var8 == var4 || var8.equals(var4)) {
                              --this.EO;
                              var3 = var5;
                           }
                           break;
                        }
                     }
                  }
               }

               if(var3 == null) {
                  var3 = this.dN(var1);
               }

               if(var3.length() > 0) {
                  this.LH[this.zs] = var3;
                  this.ld.write(var3);
                  this.ld.write(58);
               } else {
                  this.LH[this.zs] = "";
               }
            } else {
               for(int var9 = this.EO - 1; var9 >= 0; --var9) {
                  if(this.cb[var9] == "") {
                     var4 = this.PF[var9];
                     if(var4 == null) {
                        this.dN("", "");
                     } else if(var4.length() > 0) {
                        throw new IllegalStateException("start tag can not be written in empty default namespace as default namespace is currently bound to \'" + var4 + "\'" + this.dN());
                     }
                     break;
                  }
               }

               this.LH[this.zs] = "";
            }
         } else {
            this.LH[this.zs] = "";
         }

         this.ld.write(var2);
         return this;
      }
   }

   public Kf dN(String var1, String var2, String var3) {
      if(!this.Ux) {
         throw new IllegalArgumentException("startTag() must be called before attribute()" + this.dN());
      } else {
         this.ld.write(32);
         if(var1 != null && var1.length() > 0) {
            var1 = var1.intern();
            String var4 = this.dN(var1, false, true);
            if(var4 == null) {
               var4 = this.KK(var1);
            }

            this.ld.write(var4);
            this.ld.write(58);
         }

         this.ld.write(var2);
         this.ld.write(61);
         this.ld.write(34);
         this.dN(var3, this.ld);
         this.ld.write(34);
         return this;
      }
   }

   protected void LH() {
      if(this.Hw) {
         throw new IllegalArgumentException("trying to write past already finished output" + this.dN());
      } else {
         if(this.Hv) {
            this.Hv = this.VX = false;
         }

         if(this.Ux || this.rK) {
            if(this.rK) {
               throw new IllegalArgumentException("startTag() must be called immediately after setPrefix()" + this.dN());
            }

            if(!this.Ux) {
               throw new IllegalArgumentException("trying to close start tag that is not opened" + this.dN());
            }

            this.EO();
            this.ld.write(62);
            this.KK[this.zs] = this.EO;
            this.Ux = false;
         }

      }
   }

   private void EO() {
      for(int var1 = this.KK[this.zs - 1]; var1 < this.EO; ++var1) {
         if(this.ZY && this.PF[var1].length() > 40) {
            this.zs();
            this.ld.write(" ");
         }

         if(this.cb[var1] != "") {
            this.ld.write(" xmlns:");
            this.ld.write(this.cb[var1]);
            this.ld.write(61);
         } else {
            this.ld.write(" xmlns=");
         }

         this.ld.write(34);
         this.dN(this.PF[var1], this.ld);
         this.ld.write(34);
      }

   }

   public Kf QE(String var1, String var2) {
      this.Hv = this.VX = false;
      if(var1 != null) {
         var1 = var1.intern();
      }

      if(var1 != this.mS[this.zs]) {
         throw new IllegalArgumentException("expected namespace " + LH(this.mS[this.zs]) + " and not " + LH(var1) + this.dN());
      } else if(var2 == null) {
         throw new IllegalArgumentException("end tag name can not be null" + this.dN());
      } else {
         String var3 = this.OK[this.zs];
         if(var2.equals(var3)) {
            if(this.Ux) {
               this.EO();
               this.ld.write(" />");
               --this.zs;
            } else {
               if(this.ZY && this.s) {
                  this.zs();
               }

               this.ld.write("</");
               String var4 = this.LH[this.zs];
               if(var4.length() > 0) {
                  this.ld.write(var4);
                  this.ld.write(58);
               }

               this.ld.write(var2);
               this.ld.write(62);
               --this.zs;
            }

            this.EO = this.KK[this.zs];
            this.Ux = false;
            this.s = true;
            return this;
         } else {
            throw new IllegalArgumentException("expected element name " + LH(this.OK[this.zs]) + " and not " + LH(var2) + this.dN());
         }
      }
   }

   public Kf ld(String var1) {
      if(this.Ux || this.rK) {
         this.LH();
      }

      if(this.ZY && this.s) {
         this.s = false;
      }

      this.ld(var1, this.ld);
      return this;
   }

   public void QE(String var1) {
      if(this.Ux || this.rK || this.Hv) {
         this.LH();
      }

      if(this.ZY && this.s) {
         this.s = false;
      }

      this.ld.write("<![CDATA[");
      this.ld.write(var1);
      this.ld.write("]]>");
   }

   public void wU(String var1) {
      if(this.Ux || this.rK || this.Hv) {
         this.LH();
      }

      if(this.ZY && this.s) {
         this.s = false;
      }

      this.ld.write(38);
      this.ld.write(var1);
      this.ld.write(59);
   }

   public void fa(String var1) {
      if(this.Ux || this.rK || this.Hv) {
         this.LH();
      }

      if(this.ZY && this.s) {
         this.s = false;
      }

      this.ld.write("<?");
      this.ld.write(var1);
      this.ld.write("?>");
   }

   public void zs(String var1) {
      if(this.Ux || this.rK || this.Hv) {
         this.LH();
      }

      if(this.ZY && this.s) {
         this.s = false;
      }

      this.ld.write("<!--");
      this.ld.write(var1);
      this.ld.write("-->");
   }

   public void mS(String var1) {
      if(this.Ux || this.rK || this.Hv) {
         this.LH();
      }

      if(this.ZY && this.s) {
         this.s = false;
      }

      this.ld.write("<!DOCTYPE");
      this.ld.write(var1);
      this.ld.write(">");
   }

   public void OK(String var1) {
      if(this.Ux || this.rK || this.Hv) {
         this.LH();
      }

      if(this.ZY && this.s) {
         this.s = false;
      }

      if(var1.length() == 0) {
         throw new IllegalArgumentException("empty string is not allowed for ignorable whitespace" + this.dN());
      } else {
         this.ld.write(var1);
      }
   }

   public void KK() {
      if(!this.Hw && this.Ux) {
         this.LH();
      }

      this.ld.flush();
   }

   public void dN(String var1, Writer var2) {
      String var3 = "&quot;";
      int var4 = 0;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == 38) {
            if(var5 > var4) {
               var2.write(var1.substring(var4, var5));
            }

            var2.write("&amp;");
            var4 = var5 + 1;
         }

         if(var6 == 60) {
            if(var5 > var4) {
               var2.write(var1.substring(var4, var5));
            }

            var2.write("&lt;");
            var4 = var5 + 1;
         } else if(var6 == 34) {
            if(var5 > var4) {
               var2.write(var1.substring(var4, var5));
            }

            var2.write(var3);
            var4 = var5 + 1;
         } else if(var6 < 32) {
            if(var6 != 13 && var6 != 10 && var6 != 9) {
               throw new IllegalStateException("character " + dN(var6) + " (" + Integer.toString(var6) + ") is not allowed in output" + this.dN() + " (attr value=" + LH(var1) + ")");
            }

            if(var5 > var4) {
               var2.write(var1.substring(var4, var5));
            }

            var2.write("&#");
            var2.write(Integer.toString(var6));
            var2.write(59);
            var4 = var5 + 1;
         }
      }

      if(var4 > 0) {
         var2.write(var1.substring(var4));
      } else {
         var2.write(var1);
      }

   }

   protected void ld(String var1, Writer var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if(var5 == 93) {
            if(this.Hv) {
               this.VX = true;
            } else {
               this.Hv = true;
            }
         } else {
            if(var5 == 38) {
               if(var4 > var3) {
                  var2.write(var1.substring(var3, var4));
               }

               var2.write("&amp;");
               var3 = var4 + 1;
            } else if(var5 == 60) {
               if(var4 > var3) {
                  var2.write(var1.substring(var3, var4));
               }

               var2.write("&lt;");
               var3 = var4 + 1;
            } else if(this.VX && var5 == 62) {
               if(var4 > var3) {
                  var2.write(var1.substring(var3, var4));
               }

               var2.write("&gt;");
               var3 = var4 + 1;
            } else if(var5 < 32 && var5 != 9 && var5 != 10 && var5 != 13) {
               throw new IllegalStateException("character " + Integer.toString(var5) + " is not allowed in output" + this.dN() + " (text value=" + LH(var1) + ")");
            }

            if(this.Hv) {
               this.VX = this.Hv = false;
            }
         }
      }

      if(var3 > 0) {
         var2.write(var1.substring(var3));
      } else {
         var2.write(var1);
      }

   }

   protected static final String LH(String var0) {
      if(var0 == null) {
         return "null";
      } else {
         StringBuffer var1 = new StringBuffer(var0.length() + 16);
         var1.append("\'");

         for(int var2 = 0; var2 < var0.length(); ++var2) {
            dN(var1, var0.charAt(var2));
         }

         var1.append("\'");
         return var1.toString();
      }
   }

   protected static final String dN(char var0) {
      StringBuffer var1 = new StringBuffer();
      dN(var1, var0);
      return var1.toString();
   }

   private static void dN(StringBuffer var0, char var1) {
      switch(var1) {
      case '\b':
         var0.append("\\b");
         break;
      case '\t':
         var0.append("\\t");
         break;
      case '\n':
         var0.append("\\n");
         break;
      case '\f':
         var0.append("\\f");
         break;
      case '\r':
         var0.append("\\r");
         break;
      case '\"':
         var0.append("\\\"");
         break;
      case '\'':
         var0.append("\\\'");
         break;
      case '\\':
         var0.append("\\\\");
         break;
      default:
         if(var1 >= 32 && var1 <= 126) {
            var0.append(var1);
         } else {
            String var2 = "0000" + Integer.toString(var1, 16);
            var0.append("\\u" + var2.substring(var2.length() - 4, var2.length()));
         }
      }

   }

   static {
      for(int var0 = 0; var0 < bG.length; ++var0) {
         bG[var0] = ("n" + var0).intern();
      }

   }
}
