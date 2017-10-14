package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import jebglobal.Am;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.PX;
import jebglobal.TM;
import jebglobal.eI;
import jebglobal.rP;
import jebglobal.sS;

public class qm implements Runnable {
   private static final long LK = 844563159190538443L;
   private sS dN;
   private Am ld;
   private Socket QE;

   public void run() {
      this.dN();
   }

   private void dN() {
      rP.dN(new byte[]{16, 10, 2, 15, 27, 7, 0, 72, 23, 76, 65, 6, 71, 84, 17, 28, 74, 9, 9, 68, 28, 30, 31}, 2, 130);
      Object[] var10000 = new Object[]{this.QE.getInetAddress().getHostAddress(), Integer.valueOf(this.QE.getPort())};

      try {
         DataInputStream var1 = new DataInputStream(this.QE.getInputStream());
         DataOutputStream var2 = new DataOutputStream(this.QE.getOutputStream());

         while(true) {
            String var3;
            try {
               var3 = var1.readLine();
            } catch (SocketException var25) {
               break;
            }

            if(var3 == null) {
               break;
            }

            String[] var4 = var3.split("\\s+");
            if(var4.length != 3) {
               break;
            }

            boolean var5;
            if(var4[0].equals("GET")) {
               var5 = false;
            } else {
               if(!var4[0].equals("POST")) {
                  break;
               }

               var5 = true;
            }

            byte var6;
            if(var4[2].equals("HTTP/1.0")) {
               var6 = 0;
            } else {
               if(!var4[2].equals("HTTP/1.1")) {
                  break;
               }

               var6 = 1;
            }

            String var7 = null;
            String var8 = null;

            while(true) {
               var3 = var1.readLine();
               if(var3 == null) {
                  return;
               }

               if(var3.isEmpty()) {
                  if(var6 == 1 && var7 == null || var5 && var8 == null || !var5 && var8 != null) {
                     return;
                  }

                  String var29 = null;
                  if(var8 != null) {
                     int var30;
                     try {
                        var30 = Integer.parseInt(var8);
                     } catch (Exception var26) {
                        return;
                     }

                     if(var30 > 0) {
                        byte[] var33 = new byte[var30];
                        var1.readFully(var33);
                        var29 = this.dN(var33);
                        if(var29 != null && var29.isEmpty()) {
                           return;
                        }
                     }
                  } else if(!var5) {
                     Am.uK var31 = this.ld.dN();
                     StringBuilder var34 = new StringBuilder(rP.dN(new byte[]{127, 7, 4, 20, 30, 87, 109, 84, 28, 69, 73, 7, 23, 42, 13, 77, 80, 71, 64, 69, 12, 122, 116, 113, 12, 99, 32, 28, 21, 17, 3, 9, 76, 4, 28, 88, 0, 27, 27, 84, 5, 17, 77, 42, 93, 73, 14, 12, 13, 13, 95, 126, 89, 17, 65, 68, 56, 82, 102}, 2, 46));
                     var34.append(String.format(rP.dN(new byte[]{-72, 15, 7, 98, 99, 44, 1, 26, 6, 29, 3, 0, 9, 23, 82, 5, 86, 79, 94, 16, 76, 52}, 1, 242), new Object[]{this.dN.dN()}));
                     var34.append(String.format(rP.dN(new byte[]{115, 54, 7, 0, 23, 11, 26, 84, 85, 6, 18, 6, 2, 95, 26, 5, 65, 75, 10, 65, 68, 67, 15, 5, 12, 11, 26, 92, 91, 90, 21, 94, 16, 76, 52}, 1, 48), new Object[]{Integer.valueOf(var31.ld()), Integer.valueOf(var31.dN())}));
                     var34.append(rP.dN(new byte[]{23, 19, 77, 13, 11, 29, 71, 52, 54, 19, 71, 28, 25, 1, 82, 52}, 1, 43));
                     var29 = var34.toString();
                  }

                  short var32 = 400;
                  String var35 = rP.dN(new byte[]{1, 14, 20, 89, 32, 12, 22, 29, 17, 83, 92}, 2, 158);
                  String var12 = rP.dN(new byte[]{32, 3, 31, 10, 23}, 2, 252);
                  int var13 = 0;
                  if(var29 != null) {
                     var32 = 200;
                     var35 = rP.dN(new byte[]{-64, 4}, 1, 143);
                     var12 = rP.dN(new byte[]{-118, 14, 0, 21, 93, 76, 13, 5, 31, 19}, 1, 225);
                     var13 = TM.EO(var29).length;
                  }

                  StringBuffer var14 = new StringBuffer();
                  var14.append(String.format(rP.dN(new byte[]{-93, 28, 0, 4, 127, 30, 31, 11, 65, 68, 5, 65, 68, 5, 86, 126, 7}, 1, 235), new Object[]{Integer.valueOf(var6), Integer.valueOf(var32), var35}));
                  var14.append(String.format(rP.dN(new byte[]{7, 14, 4, 28, 72, 73, 66, 27, 121, 42}, 2, 69), new Object[]{(new SimpleDateFormat(rP.dN(new byte[]{119, 0, 0, 105, 12, 68, 0, 68, 109, 0, 0, 109, 89, 0, 0, 0, 89, 104, 0, 114, 87, 0, 87, 73, 0, 83, 90}, 1, 50))).format(new Date())}));
                  var14.append(String.format(rP.dN(new byte[]{31, 54, 23, 4, 19, 23, 72, 26, 106, 15, 7, 98, 99, 44, 1, 26, 6, 29, 3, 0, 9, 23, 82, 5, 86, 126, 7}, 1, 76), new Object[]{eI.dN}));
                  var14.append(String.format(rP.dN(new byte[]{-98, 44, 1, 0, 11, 6, 23, 29, 6, 1, 84, 26, 5, 86, 126, 7}, 1, 221), new Object[]{var12}));
                  if(var13 > 0) {
                     var14.append(String.format(rP.dN(new byte[]{0, 0, 30, 13, 23, 7, 19, 69, 32, 89, 88, 6, 19, 0, 69, 92, 65, 71, 3, 72, 70, 93, 93, 62, 38}, 2, 89), new Object[0]));
                     var14.append(String.format(rP.dN(new byte[]{0, 0, 30, 13, 23, 7, 19, 69, 56, 69, 70, 4, 93, 72, 11, 25, 28, 87, 33, 42}, 2, 241), new Object[]{Integer.valueOf(var13)}));
                  }

                  var14.append("\r\n");
                  if(var13 > 0) {
                     var14.append(var29);
                  }

                  byte[] var15 = TM.EO(var14.toString());
                  var2.write(var15, 0, var15.length);
                  break;
               }

               char var9 = var3.charAt(0);
               boolean var10 = var9 == 32 || var9 == 9;
               if(var10) {
                  return;
               }

               String[] var11 = var3.split("\\s+", 2);
               if(var11.length != 2) {
                  return;
               }

               if(var11[0].equals("Host:")) {
                  var7 = var11[1];
               } else if(!var11[0].equals("User-Agent:") && !var11[0].equals("Content-Type:") && var11[0].equals("Content-Length:")) {
                  var8 = var11[1];
               }
            }
         }
      } catch (IOException var27) {
         ;
      } finally {
         try {
            this.QE.close();
         } catch (IOException var24) {
            ;
         }

      }

   }

   private String dN(byte[] var1) {
      try {
         String var2 = TM.fa(var1);
         if(var2.startsWith(rP.dN(new byte[]{39, 14, 4, 24, 79}, 2, 4))) {
            var2 = var2.substring(5);
         }

         PX var3 = PX.ld(PX.dN(var2));
         if(var3 == null) {
            return null;
         } else {
            byte[] var4 = var3.wU();
            ByteArrayInputStream var5 = new ByteArrayInputStream(var4);
            OZ var6 = new OZ(var5);
            int var7 = var6.readInt();
            long var8 = var6.readLong();
            long var10 = var6.readLong();
            if(var7 != 0) {
               if(var7 == 2) {
                  this.ld.ld(var8, var10);
                  return "";
               } else {
                  return null;
               }
            } else {
               long var12 = 0L;
               if(var3.ld() == 844563159190538443L && var3.dN() == 0) {
                  if(var3.QE().dN(this.dN.dN()) < 0) {
                     var12 = 2L;
                  } else if(!this.ld.dN(var8, var10)) {
                     var12 = 1L;
                  }
               } else {
                  var12 = 3L;
               }

               ByteArrayOutputStream var14 = new ByteArrayOutputStream();
               Hk var15 = new Hk(var14);
               var15.writeInt(1);
               var15.writeLong(var12);
               var15.dN();
               byte[] var16 = PX.dN((byte[])var14.toByteArray(), (int[])null);
               String var17 = PX.dN(var16);
               return var17;
            }
         }
      } catch (Exception var18) {
         return null;
      }
   }
}
