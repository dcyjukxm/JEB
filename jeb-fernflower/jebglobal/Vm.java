package jebglobal;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;
import jebglobal.TM;
import jebglobal.eI;
import jebglobal.rP;
import org.eclipse.swt.program.Program;

public final class Vm {
   private Proxy dN;
   private String ld;
   private int QE;
   private int wU;

   public Vm() {
      this((Proxy)null);
   }

   public Vm(Proxy var1) {
      this.dN(var1);
      this.dN(String.format(rP.dN(new byte[]{-21, 15, 7, 98, 5, 86}, 1, 161), new Object[]{eI.dN}));
      this.dN('\uea60', 30000);
   }

   public synchronized void dN(Proxy var1) {
      this.dN = var1 == null?Proxy.NO_PROXY:var1;
   }

   public synchronized void dN(String var1) {
      this.ld = var1;
   }

   public synchronized void dN(int var1, int var2) {
      this.QE = var1;
      this.wU = var2;
   }

   public synchronized byte[] ld(String var1) {
      URL var2;
      try {
         var2 = new URL(var1);
      } catch (MalformedURLException var17) {
         return null;
      }

      HttpURLConnection var3;
      try {
         var3 = (HttpURLConnection)var2.openConnection(this.dN);
      } catch (IOException var16) {
         return null;
      }

      var3.setConnectTimeout(this.QE);
      var3.setReadTimeout(this.wU);
      if(this.ld != null) {
         var3.setRequestProperty(rP.dN(new byte[]{22, 28, 21, 11, 95, 40, 0, 13, 26, 84}, 2, 212), this.ld);
      }

      Object var4 = null;

      try {
         var4 = var3.getInputStream();
         if(rP.dN(new byte[]{125, 29, 19, 25}, 1, 26).equals(var3.getContentEncoding())) {
            var4 = new GZIPInputStream((InputStream)var4);
         }

         byte[] var5 = TM.dN((InputStream)var4);
         byte[] var6 = var5;
         return var6;
      } catch (Exception var18) {
         ;
      } finally {
         if(var4 != null) {
            try {
               ((InputStream)var4).close();
            } catch (IOException var15) {
               return null;
            }
         }

      }

      return null;
   }

   public synchronized String dN(String var1, String var2) {
      URL var3;
      try {
         var3 = new URL(var1);
      } catch (MalformedURLException var44) {
         return null;
      }

      HttpURLConnection var4;
      try {
         var4 = (HttpURLConnection)var3.openConnection(this.dN);
      } catch (IOException var43) {
         return null;
      }

      var4.setConnectTimeout(this.QE);
      var4.setReadTimeout(this.wU);
      var4.setDoInput(true);
      var4.setDoOutput(true);
      var4.setUseCaches(false);
      var4.setRequestProperty(rP.dN(new byte[]{0, 0, 30, 13, 23, 7, 19, 69, 32, 89, 88, 6}, 2, 32), rP.dN(new byte[]{34, 31, 0, 21, 27, 10, 6, 28, 29, 79, 70, 76, 81, 13, 70, 78, 78, 30, 74, 79, 64, 93, 28, 70, 94, 76, 42, 28, 2, 12, 8, 0, 68}, 2, 148));
      if(this.ld != null) {
         var4.setRequestProperty(rP.dN(new byte[]{22, 28, 21, 11, 95, 40, 0, 13, 26, 84}, 2, 154), this.ld);
      }

      DataOutputStream var5 = null;
      boolean var36 = false;

      label276: {
         try {
            var36 = true;
            var5 = new DataOutputStream(var4.getOutputStream());
            String var6 = rP.dN(new byte[]{-41, 5, 21, 21, 92}, 1, 179) + URLEncoder.encode(var2, rP.dN(new byte[]{4, 1, 18, 107, 21}, 1, 81));
            var5.writeBytes(var6);
            var5.flush();
            var36 = false;
            break label276;
         } catch (IOException var47) {
            var36 = false;
         } finally {
            if(var36) {
               if(var5 != null) {
                  try {
                     var5.close();
                  } catch (IOException var37) {
                     return null;
                  }
               }

            }
         }

         if(var5 != null) {
            try {
               var5.close();
            } catch (IOException var38) {
               return null;
            }
         }

         return null;
      }

      try {
         var5.close();
      } catch (IOException var42) {
         return null;
      }

      BufferedReader var49 = null;
      boolean var23 = false;

      String var9;
      label277: {
         try {
            var23 = true;
            var49 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
            StringBuilder var7 = new StringBuilder();

            String var8;
            while((var8 = var49.readLine()) != null) {
               var7.append(var8 + "\n");
            }

            var9 = var7.toString();
            var23 = false;
            break label277;
         } catch (IOException var45) {
            var23 = false;
         } finally {
            if(var23) {
               if(var49 != null) {
                  try {
                     var49.close();
                  } catch (IOException var40) {
                     return null;
                  }
               }

            }
         }

         if(var49 != null) {
            try {
               var49.close();
            } catch (IOException var39) {
               return null;
            }
         }

         return null;
      }

      try {
         var49.close();
         return var9;
      } catch (IOException var41) {
         return null;
      }
   }

   public static boolean QE(String var0) {
      try {
         return !var0.startsWith(rP.dN(new byte[]{43, 27, 4, 9, 72, 70, 72}, 2, 155)) && !var0.startsWith(rP.dN(new byte[]{77, 28, 0, 4, 3, 73, 21, 0}, 1, 37))?false:Program.launch(var0);
      } catch (Exception var1) {
         return false;
      }
   }
}
