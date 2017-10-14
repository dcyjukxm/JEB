package jebglobal;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.Character.UnicodeBlock;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Br;
import jebglobal.Cx;
import jebglobal.EG;
import jebglobal.Fu;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.KO;
import jebglobal.OD;
import jebglobal.OM;
import jebglobal.OZ;
import jebglobal.QO;
import jebglobal.Qa;
import jebglobal.SP;
import jebglobal.Sj;
import jebglobal.WV;
import jebglobal.XV;
import jebglobal.Xp;
import jebglobal.ZF;
import jebglobal.ew;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.jM;
import jebglobal.oM;
import jebglobal.tE;
import jebglobal.u;
import jebglobal.wz;
import jebglobal.yK;
import jebglobal.zn;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TM {
   ZF dN;
   HashMap ld;

   public static boolean dN(ew var0, yK var1, String var2) {
      return var1.ld()?false:(!var1.dN(var2.equals("")?null:var2)?false:var0.dN(u.uK.dN, var1.zs(), -1, -1, var2));
   }

   public static boolean dN(ew var0, gE var1, String var2) {
      XV var3 = var1.ld();
      return var3 == null?false:(!var1.dN(var2.equals("")?null:var2)?false:var0.dN(u.uK.QE, var3.dN(), -1, -1, var2));
   }

   public static boolean dN(ew var0, AR var1, hO var2, String var3, boolean var4) {
      AV var5 = var2.ld();
      if(var5 != null && !var5.fa()) {
         Cx var6 = new Cx(var1);
         List var7 = var6.dN(var2);
         int var8 = var2.dN();
         int var9 = var7.size();
         if(var9 > 0 && var7.contains(Integer.valueOf(var8))) {
            Iterator var10 = var7.iterator();

            int var11;
            hO var12;
            while(var10.hasNext()) {
               var11 = ((Integer)var10.next()).intValue();
               var12 = var1.mS(var11);
               if(!var12.dN(var3.equals("")?null:var3)) {
                  return false;
               }
            }

            var2.ld(var3.equals("")?null:var3);
            var0.dN(u.uK.ld, var8, -1, -1, var3);
            if(var4) {
               var10 = var7.iterator();

               while(var10.hasNext()) {
                  var11 = ((Integer)var10.next()).intValue();
                  if(var11 != var8) {
                     var12 = var1.mS(var11);
                     var12.ld(var3.equals("")?null:var3);
                     var0.dN(u.uK.ld, var12.dN(), -1, -1, var3);
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean dN(ew var0, OD.uK var1) {
      return var0.dN(OD.vd.dN, -1, -1, var1.dN(), var1.ld());
   }

   public static boolean dN(ew var0, yK var1, OD.uK var2) {
      int var3 = var1.zs();
      return var0.dN(OD.vd.ld, var3, -1, var2.dN(), var2.ld());
   }

   public static boolean dN(ew var0, gE var1, OD.uK var2) {
      XV var3 = var1.ld();
      if(var3 == null) {
         return false;
      } else {
         int var4 = var3.dN();
         return var0.dN(OD.vd.wU, var4, -1, var2.dN(), var2.ld());
      }
   }

   public static boolean dN(ew var0, hO var1, int var2, OD.uK var3) {
      AV var4 = var1.ld();
      if(var4 == null) {
         return false;
      } else {
         OM var5 = var4.wU();
         if(var5 == null) {
            if(var2 >= 0) {
               return false;
            }
         } else if(var2 >= var5.QE()) {
            return false;
         }

         OD.vd var6 = var2 < 0?OD.vd.QE:OD.vd.fa;
         int var7 = var4.ld();
         return var0.dN(var6, var7, var2, var3.dN(), var3.ld());
      }
   }

   public static OD.uK dN(ew var0) {
      OD var1 = var0.EO();
      return var1 == null?null:var1.cb();
   }

   public static OD.uK dN(ew var0, yK var1) {
      int var2 = var1.zs();
      OD var3 = var0.wU(var2);
      return var3 == null?null:var3.cb();
   }

   public static OD.uK dN(ew var0, gE var1) {
      XV var2 = var1.ld();
      if(var2 == null) {
         return null;
      } else {
         int var3 = var2.dN();
         OD var4 = var0.zs(var3);
         return var4 == null?null:var4.cb();
      }
   }

   public static OD.uK dN(ew var0, hO var1, int var2) {
      AV var3 = var1.ld();
      if(var3 == null) {
         return null;
      } else {
         int var4 = var3.ld();
         OD var5 = var2 < 0?var0.fa(var4):var0.QE(var4, var2);
         return var5 == null?null:var5.cb();
      }
   }

   public TM(ZF var1) {
      this.dN = var1;
      this.ld = new HashMap();
   }

   public synchronized String dN(WV var1) {
      Object var2 = this.ld.get(var1);
      return var2 != null?(String)var2:this.dN.ld(var1.ld(), var1.QE());
   }

   public synchronized boolean ld(WV var1) {
      Object var2 = this.ld.get(var1);
      if(var2 != null) {
         return ((Boolean)var2).booleanValue();
      } else {
         boolean var3;
         try {
            var3 = Boolean.parseBoolean(var1.QE());
         } catch (Exception var4) {
            var3 = false;
         }

         return this.dN.ld(var1.ld(), var3);
      }
   }

   public synchronized int QE(WV var1) {
      Object var2 = this.ld.get(var1);
      if(var2 != null) {
         return ((Integer)var2).intValue();
      } else {
         int var3;
         try {
            var3 = Integer.parseInt(var1.QE());
         } catch (Exception var4) {
            var3 = 0;
         }

         return this.dN.ld(var1.ld(), var3);
      }
   }

   public synchronized void dN(WV var1, String var2) {
      this.dN.dN(var1.ld(), var2);
   }

   public synchronized void dN(WV var1, boolean var2) {
      this.dN.dN(var1.ld(), var2);
   }

   public synchronized void dN(WV var1, int var2) {
      this.dN.dN(var1.ld(), var2);
   }

   public synchronized void dN() {
      this.dN.dN();
   }

   public synchronized Proxy ld() {
      String var1 = this.dN(WV.VX);
      if(var1 != null && !var1.equals("")) {
         String[] var2 = var1.split("\\|", -1);
         if(var2.length != 3) {
            return null;
         } else {
            Type var3;
            if(var2[0].equalsIgnoreCase("http")) {
               var3 = Type.HTTP;
            } else {
               if(!var2[0].equalsIgnoreCase("socks")) {
                  return null;
               }

               var3 = Type.SOCKS;
            }

            try {
               String var4 = var2[1];
               int var5 = Integer.parseInt(var2[2]);
               return new Proxy(var3, new InetSocketAddress(var4, var5));
            } catch (Exception var6) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public static Qa dN(II var0) {
      if(!(var0 instanceof tE)) {
         return null;
      } else {
         tE var1 = (tE)var0;
         if(var1.LH() != 1) {
            return null;
         } else {
            EG var2 = var1.QE(0);
            return var2.zs() == 1 && var2.ld(0) instanceof KO?((KO)var2.ld(0)).dN():null;
         }
      }
   }

   public static boolean dN(II var0, Qa var1) {
      return var0 instanceof KO && ((KO)var0).dN() == var1;
   }

   public static boolean ld(II var0) {
      if(var0 instanceof tE) {
         tE var1 = (tE)var0;
         if(var1.LH() == 2 && var1.mS()) {
            return true;
         }
      }

      return false;
   }

   public static boolean QE(II var0) {
      if(var0 instanceof tE) {
         tE var1 = (tE)var0;
         return !var1.mS();
      } else {
         return false;
      }
   }

   public static II dN(EG var0, int var1) {
      if(var1 >= var0.zs()) {
         return null;
      } else {
         II var2 = var0.ld(var1);
         if(!(var2 instanceof wz)) {
            return var2;
         } else {
            II var3;
            if(var2 instanceof jM) {
               var3 = dN((EG)((jM)var2).zs(), 0);
               return var3 == null?var2:var3;
            } else if(var2 instanceof zn) {
               if(!((zn)var2).zs().zs()) {
                  return var2;
               } else {
                  var3 = dN((EG)((zn)var2).mS(), 0);
                  return var3 == null?var2:var3;
               }
            } else if(var2 instanceof tE) {
               if(!((tE)var2).ld(0).zs()) {
                  return var2;
               } else {
                  var3 = dN((EG)((tE)var2).QE(0), 0);
                  return var3 == null?var2:var3;
               }
            } else if(var2 instanceof SP) {
               var3 = dN((EG)((SP)var2).zs(), 0);
               return var3 == null?var2:var3;
            } else {
               return var2;
            }
         }
      }
   }

   public static II dN(Fu var0, II var1) {
      boolean[] var2 = new boolean[]{false};
      return dN(var0.VX(), var1, var2);
   }

   public static II dN(EG var0, II var1, boolean[] var2) {
      for(int var3 = 0; var3 < var0.zs(); ++var3) {
         II var4 = var0.ld(var3);
         if(var2[0]) {
            if(!(var4 instanceof wz)) {
               return var4;
            }

            II var8;
            if(var4 instanceof jM) {
               var8 = dN(((jM)var4).zs(), var1, var2);
               return var8 == null?var4:var8;
            }

            if(var4 instanceof zn) {
               if(!((zn)var4).zs().zs()) {
                  return var4;
               }

               var8 = dN(((zn)var4).mS(), var1, var2);
               return var8 == null?var4:var8;
            }

            if(var4 instanceof tE) {
               if(!((tE)var4).ld(0).zs()) {
                  return var4;
               }

               var8 = dN(((tE)var4).QE(0), var1, var2);
               return var8 == null?var4:var8;
            }

            if(var4 instanceof SP) {
               var8 = dN(((SP)var4).zs(), var1, var2);
               return var8 == null?var4:var8;
            }
         } else if(var4 == var1) {
            var2[0] = true;
         } else if(var4 instanceof wz) {
            Iterator var5 = ((wz)var4).dN().iterator();

            while(var5.hasNext()) {
               EG var6 = (EG)var5.next();
               II var7 = dN(var6, var1, var2);
               if(var7 != null) {
                  return var7;
               }

               if(var2[0]) {
                  break;
               }
            }
         }
      }

      return null;
   }

   public static List dN(IK... var0) {
      ArrayList var1 = new ArrayList(var0.length);
      IK[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         IK var5 = var2[var4];
         if(var5 != null) {
            var1.add(var5);
         }
      }

      return var1;
   }

   public static List dN(Collection var0) {
      return dN((List)(new ArrayList()), (Collection)var0);
   }

   public static List dN(List var0, IK var1) {
      if(var1 != null) {
         var0.add(var1);
      }

      return var0;
   }

   public static List dN(List var0, Collection var1) {
      if(var1 != null) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            IK var3 = (IK)var2.next();
            if(var3 != null) {
               var0.add(var3);
            }
         }
      }

      return var0;
   }

   public static String dN(String var0) {
      return var0.replace("&", "&amp;").replace("<", "&lt;");
   }

   public static String ld(String var0) {
      if(var0.isEmpty()) {
         return var0;
      } else {
         char[] var1 = var0.toCharArray();
         StringBuilder var2 = new StringBuilder(var0.length() + 10);
         switch(var1[0]) {
         case '#':
         case '?':
         case '@':
            var2.append('\\');
         default:
            char[] var3 = var1;
            int var4 = var1.length;
            int var5 = 0;

            for(; var5 < var4; ++var5) {
               char var6 = var3[var5];
               switch(var6) {
               case '\n':
                  var2.append("\\n");
                  continue;
               case '\"':
                  var2.append("&quot;");
                  continue;
               case '\\':
                  var2.append('\\');
                  break;
               default:
                  if(!dN(var6)) {
                     var2.append(String.format("\\u%04x", new Object[]{Integer.valueOf(var6)}));
                     continue;
                  }
               }

               var2.append(var6);
            }

            return var2.toString();
         }
      }
   }

   public static String QE(String var0) {
      if(var0.isEmpty()) {
         return var0;
      } else {
         char[] var1 = var0.toCharArray();
         StringBuilder var2 = new StringBuilder(var0.length() + 10);
         switch(var1[0]) {
         case '#':
         case '?':
         case '@':
            var2.append('\\');
         default:
            boolean var3 = false;
            int var4 = 0;
            boolean var5 = false;
            boolean var6 = true;
            char[] var7 = var1;
            int var8 = var1.length;
            int var9 = 0;

            for(; var9 < var8; ++var9) {
               char var10 = var7[var9];
               if(var3) {
                  if(var10 == 62) {
                     var3 = false;
                     var4 = var2.length() + 1;
                     var5 = false;
                  }
               } else if(var10 == 32) {
                  if(var6) {
                     var5 = true;
                  }

                  var6 = true;
               } else {
                  var6 = false;
                  switch(var10) {
                  case '\n':
                  case '\'':
                     var5 = true;
                     break;
                  case '\"':
                     var2.append('\\');
                     break;
                  case '<':
                     var3 = true;
                     if(var5) {
                        var2.insert(var4, '\"').append('\"');
                     }
                     break;
                  case '\\':
                     var2.append('\\');
                     break;
                  default:
                     if(!dN(var10)) {
                        var2.append(String.format("\\u%04x", new Object[]{Integer.valueOf(var10)}));
                        continue;
                     }
                  }
               }

               var2.append(var10);
            }

            if(var5 || var6) {
               var2.insert(var4, '\"').append('\"');
            }

            return var2.toString();
         }
      }
   }

   public static boolean wU(String var0) {
      return dN((String)var0, 2).size() > 1;
   }

   public static String fa(String var0) {
      List var1 = dN((String)var0, -1);
      if(var1.size() < 2) {
         return var0;
      } else {
         StringBuilder var2 = new StringBuilder();
         int var3 = 0;
         int var4 = 0;

         Integer var6;
         for(Iterator var5 = var1.iterator(); var5.hasNext(); var3 = var6.intValue()) {
            var6 = (Integer)var5.next();
            StringBuilder var10000 = var2.append(var0.substring(var3, (var6 = Integer.valueOf(var6.intValue() + 1)).intValue()));
            ++var4;
            var10000.append(var4).append('$');
         }

         var2.append(var0.substring(var3));
         return var2.toString();
      }
   }

   public static List dN(String var0, int var1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = var0.length();
      ArrayList var6 = new ArrayList();

      int var2;
      while((var3 = (var2 = var0.indexOf(37, var3)) + 1) != 0 && var3 != var5) {
         char var7 = var0.charAt(var3++);
         if(var7 != 37) {
            if(var7 >= 48 && var7 <= 57 && var3 < var5) {
               do {
                  var7 = var0.charAt(var3++);
               } while(var7 >= 48 && var7 <= 57 && var3 < var5);

               if(var7 == 36) {
                  continue;
               }
            }

            var6.add(Integer.valueOf(var2));
            if(var1 != -1) {
               ++var4;
               if(var4 >= var1) {
                  break;
               }
            }
         }
      }

      return var6;
   }

   public static boolean dN(char var0) {
      UnicodeBlock var1 = UnicodeBlock.of(var0);
      return !Character.isISOControl(var0) && var0 != '\uffff' && var1 != null && var1 != UnicodeBlock.SPECIALS;
   }

   public static void dN(Sj var0, File var1) {
      Iterator var2 = var0.dN(true).iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         dN(var0, var1, var3);
      }

   }

   public static void dN(Sj var0, File var1, String[] var2) {
      for(int var3 = 0; var3 < var2.length; ++var3) {
         dN(var0, var1, var2[var3]);
      }

   }

   public static void dN(Sj var0, File var1, String var2) {
      try {
         if(var0.ld(var2)) {
            dN(new File(var1, var2));
            var0.fa(var2).dN(new File(var1, var2));
         } else {
            File var3 = new File(var1, var2);
            var3.getParentFile().mkdirs();
            dN((InputStream)var0.QE(var2), (OutputStream)(new FileOutputStream(var3)));
         }

      } catch (IOException var4) {
         throw new oM();
      } catch (QO var5) {
         throw new oM();
      }
   }

   public static void dN(InputStream var0, OutputStream var1) {
      try {
         Br.dN(var0, var1);
      } finally {
         try {
            var0.close();
            var1.close();
         } catch (IOException var6) {
            ;
         }

      }

   }

   public static void dN(File var0) {
      if(var0.exists()) {
         File[] var1 = var0.listFiles();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            File var3 = var1[var2];
            if(var3.isDirectory()) {
               dN(var3);
            } else {
               var3.delete();
            }
         }

         var0.delete();
      }
   }

   public static Button dN(Composite var0, String var1, SelectionListener var2) {
      Button var3 = new Button(var0, 8);
      var3.setText("     " + var1 + "     ");
      if(var2 != null) {
         var3.addSelectionListener(var2);
      }

      return var3;
   }

   public static Button ld(Composite var0, String var1, SelectionListener var2) {
      Button var3 = new Button(var0, 32);
      var3.setText(var1);
      if(var2 != null) {
         var3.addSelectionListener(var2);
      }

      return var3;
   }

   public static Text dN(Composite var0, int var1, String var2, SelectionListener var3) {
      Text var4 = new Text(var0, 2052);
      if(var0.getLayout() instanceof RowLayout) {
         GC var6 = new GC(var4);

         RowData var5;
         try {
            var6.setFont(var4.getFont());
            FontMetrics var7 = var6.getFontMetrics();
            var5 = new RowData(var1 * var7.getAverageCharWidth(), 1 * var7.getHeight());
         } finally {
            var6.dispose();
         }

         var4.setLayoutData(var5);
      }

      if(var2 != null) {
         var4.setText(var2);
         var4.selectAll();
      }

      var4.pack(false);
      if(var3 != null) {
         var4.addSelectionListener(var3);
      }

      return var4;
   }

   public static RowLayout dN(boolean var0, boolean var1) {
      RowLayout var2 = new RowLayout();
      var2.type = var0?512:256;
      var2.wrap = var1;
      return var2;
   }

   public static RowLayout QE() {
      return dN(false, false);
   }

   public static byte[][] dN(byte[][] var0) {
      byte[][] var1 = (byte[][])((byte[][])var0.clone());

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1[var2] = (byte[])((byte[])var0[var2].clone());
      }

      return var1;
   }

   public static void dN(byte[] var0, byte[] var1, int var2, int var3) {
      int var4 = var0.length;
      byte[] var7 = new byte[256];

      int var5;
      for(var5 = 0; var5 < 256; ++var5) {
         var7[var5] = (byte)var5;
      }

      int var6 = 0;

      for(var5 = 0; var5 < 256; ++var5) {
         var6 = (var6 + var7[var5] + var0[var5 % var4]) % 256 & 255;
         byte var8 = var7[var5];
         var7[var5] = var7[var6];
         var7[var6] = var8;
      }

      var5 = 0;
      var6 = 0;

      for(int var11 = var2; var11 < var3; ++var11) {
         var5 = (var5 + 1) % 256 & 255;
         var6 = (var6 + var7[var5]) % 256 & 255;
         byte var9 = var7[var5];
         var7[var5] = var7[var6];
         var7[var6] = var9;
         byte var10 = var7[(var7[var5] + var7[var6]) % 256 & 255];
         var1[var11] ^= var10;
      }

   }

   public static int dN(byte[] var0) {
      CRC32 var1 = new CRC32();
      var1.update(var0);
      return (int)(var1.getValue() & -1L);
   }

   public static byte[] ld(byte[] var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("MD5");
         return var1.digest(var0);
      } catch (NoSuchAlgorithmException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static byte[] QE(byte[] var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-1");
         return var1.digest(var0);
      } catch (NoSuchAlgorithmException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static byte[] wU(byte[] var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         return var1.digest(var0);
      } catch (NoSuchAlgorithmException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static boolean zs(String var0) {
      File var1 = new File(var0);

      try {
         return var1.mkdir();
      } catch (Exception var2) {
         return false;
      }
   }

   public static boolean mS(String var0) {
      File var1 = new File(var0);
      File[] var2 = var1.listFiles();
      if(var2 != null) {
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if(var6.isDirectory()) {
               mS(var6.getAbsolutePath());
            } else if(!var6.delete()) {
               return false;
            }
         }
      }

      return var1.delete();
   }

   public static File OK(String var0) {
      File var1 = File.createTempFile("jebgettemp", (String)null);
      File var2 = new File(var1.getParent(), var0);
      var1.delete();
      var2.mkdir();
      return var2;
   }

   public static void ld(File var0) {
      var0.deleteOnExit();
      File[] var1 = var0.listFiles();
      if(var1 != null) {
         File[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            File var5 = var2[var4];
            if(var5.isDirectory()) {
               ld(var5);
            } else {
               var5.deleteOnExit();
            }
         }
      }

   }

   public static void dN(File var0, byte[] var1, boolean var2) {
      if(var2) {
         File var3 = var0.getAbsoluteFile().getParentFile();
         if(var3 != null) {
            var3.mkdirs();
         }
      }

      DataOutputStream var4 = new DataOutputStream(new FileOutputStream(var0));
      var4.write(var1);
      var4.close();
   }

   public static byte[] dN(File var0, long var1) {
      long var3 = var0.length();
      if(var1 >= 0L && var3 > var1) {
         throw new IOException();
      } else {
         byte[] var5 = new byte[(int)var3];
         DataInputStream var6 = new DataInputStream(new FileInputStream(var0));
         var6.readFully(var5);
         var6.close();
         return var5;
      }
   }

   public static byte[] QE(File var0) {
      return dN(var0, -1L);
   }

   public static byte[] LH(String var0) {
      return dN(new File(var0), -1L);
   }

   public static byte[] dN(InputStream var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var3 = new byte[16384];

      int var2;
      while((var2 = var0.read(var3, 0, var3.length)) != -1) {
         var1.write(var3, 0, var2);
      }

      var1.flush();
      return var1.toByteArray();
   }

   public static int KK(String var0) {
      try {
         File var1 = new File(var0);
         OZ var2 = new OZ(new FileInputStream(var1));
         int var3 = var2.readInt();
         var2.dN();
         return var3;
      } catch (IOException var4) {
         return 0;
      }
   }

   public static boolean dN(String var0, String var1) {
      File var2 = new File(var0);
      if(!var2.isDirectory()) {
         return false;
      } else {
         ZipOutputStream var3 = null;
         boolean var10 = false;

         label86: {
            try {
               var10 = true;
               var3 = new ZipOutputStream(new FileOutputStream(new File(var1)));
               dN(var3, var2, "/");
               var10 = false;
               break label86;
            } catch (IOException var14) {
               var10 = false;
            } finally {
               if(var10) {
                  if(var3 != null) {
                     try {
                        var3.close();
                     } catch (IOException var11) {
                        return false;
                     }
                  }

               }
            }

            if(var3 != null) {
               try {
                  var3.close();
               } catch (IOException var12) {
                  return false;
               }
            }

            return false;
         }

         try {
            var3.close();
            return true;
         } catch (IOException var13) {
            return false;
         }
      }
   }

   public static void dN(ZipOutputStream var0, File var1, String var2) {
      File var3 = new File(var1, var2);
      if(var3.isFile()) {
         ZipEntry var4 = new ZipEntry(var2);
         var0.putNextEntry(var4);
         byte[] var5 = LH(var3.getAbsolutePath());
         var0.write(var5);
         var0.closeEntry();
      } else if(var3.isDirectory()) {
         String[] var8 = var3.list();
         int var9 = var8.length;

         for(int var6 = 0; var6 < var9; ++var6) {
            String var7 = var8[var6];
            dN(var0, var1, (new File(var2, var7)).getPath());
         }
      }

   }

   public static boolean dN(File var0, File var1) {
      try {
         ZipFile var2 = new ZipFile(var0);
         Enumeration var3 = var2.entries();

         while(var3.hasMoreElements()) {
            ZipEntry var4 = (ZipEntry)var3.nextElement();
            InputStream var5 = var2.getInputStream(var4);
            byte[] var6 = dN(var5);
            File var7 = new File(var1, var4.getName());
            dN(var7, var6, true);
         }

         var2.close();
         return true;
      } catch (IOException var8) {
         return false;
      }
   }

   public static List dN(int[] var0) {
      ArrayList var1 = new ArrayList(var0.length);
      int[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1.add(Integer.valueOf(var5));
      }

      return var1;
   }

   public static String dN(Throwable var0) {
      StringWriter var1 = new StringWriter();
      PrintWriter var2 = new PrintWriter(var1);
      var0.printStackTrace(var2);
      return var1.toString();
   }

   public static byte[] EO(String var0) {
      try {
         return var0.getBytes("UTF-8");
      } catch (UnsupportedEncodingException var1) {
         return var0.getBytes();
      }
   }

   public static String fa(byte[] var0) {
      try {
         return new String(var0, "UTF-8");
      } catch (UnsupportedEncodingException var1) {
         return new String(var0);
      }
   }

   public static int dN(String var0, int var1, String var2, boolean var3, boolean var4) {
      if(var0 != null && var1 >= 0 && var1 < var0.length() && var2 != null) {
         if(var2.isEmpty()) {
            return var1;
         } else if(var3 && !var4) {
            return var0.indexOf(var2, var1);
         } else {
            if(!var3) {
               var2 = var2.toLowerCase();
            }

            char var5 = var2.charAt(0);
            int var6;
            char var7;
            if(!var4) {
               for(var6 = var1; var6 <= var0.length() - var2.length(); ++var6) {
                  var7 = Character.toLowerCase(var0.charAt(var6));
                  if(var7 == var5 && var2.equalsIgnoreCase(var0.substring(var6, var6 + var2.length()))) {
                     return var6;
                  }
               }

               return -1;
            } else {
               if(var1 + var2.length() > var0.length()) {
                  var1 = var0.length() - var2.length();
               }

               if(var3) {
                  for(var6 = var1; var6 >= 0; --var6) {
                     var7 = var0.charAt(var6);
                     if(var7 == var5 && var2.equals(var0.substring(var6, var6 + var2.length()))) {
                        return var6;
                     }
                  }

                  return -1;
               } else {
                  for(var6 = var1; var6 >= 0; --var6) {
                     var7 = Character.toLowerCase(var0.charAt(var6));
                     if(var7 == var5 && var2.equalsIgnoreCase(var0.substring(var6, var6 + var2.length()))) {
                        return var6;
                     }
                  }

                  return -1;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static Thread dN(Runnable var0) {
      Thread var1 = new Thread(var0);
      var1.setDaemon(true);
      return var1;
   }

   public static Thread ld(Runnable var0) {
      Thread var1 = dN(var0);
      var1.start();
      return var1;
   }

   public static boolean dN(Thread var0) {
      if(var0 == null) {
         return false;
      } else if(!var0.isAlive()) {
         return true;
      } else {
         var0.interrupt();

         try {
            var0.join();
         } catch (InterruptedException var1) {
            ;
         }

         return !var0.isAlive();
      }
   }

   public static boolean dN(Thread var0, Xp var1) {
      long var2 = System.currentTimeMillis();

      while(true) {
         try {
            var0.join(3000L);
         } catch (InterruptedException var9) {
            break;
         }

         if(!var0.isAlive()) {
            break;
         }

         long var4 = var1.De();
         if(var4 > 0L) {
            long var6 = System.currentTimeMillis() - var2;
            if(var6 >= var4) {
               var0.interrupt();

               try {
                  var0.join();
               } catch (InterruptedException var8) {
                  ;
               }
               break;
            }
         }
      }

      return !var0.isAlive();
   }
}
