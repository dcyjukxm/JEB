// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.net.SocketException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.Socket;

public class qm implements Runnable
{
    private static final long LK = 844563159190538443L;
    private sS dN;
    private Am ld;
    private Socket QE;
    
    @Override
    public void run() {
        this.dN();
    }
    
    private void dN() {
        rP.dN(new byte[] { 16, 10, 2, 15, 27, 7, 0, 72, 23, 76, 65, 6, 71, 84, 17, 28, 74, 9, 9, 68, 28, 30, 31 }, 2, 130);
        final Object[] array = { this.QE.getInetAddress().getHostAddress(), this.QE.getPort() };
        try {
            final DataInputStream dataInputStream = new DataInputStream(this.QE.getInputStream());
            final DataOutputStream dataOutputStream = new DataOutputStream(this.QE.getOutputStream());
            Label_2720: {
                while (true) {
                    String line;
                    try {
                        line = dataInputStream.readLine();
                    }
                    catch (SocketException ex) {
                        break;
                    }
                    if (line == null) {
                        break;
                    }
                    final String[] split = line.split("\\s+");
                    if (split.length != 3) {
                        break;
                    }
                    boolean b;
                    if (split[0].equals("GET")) {
                        b = false;
                    }
                    else {
                        if (!split[0].equals("POST")) {
                            break;
                        }
                        b = true;
                    }
                    int n;
                    if (split[2].equals("HTTP/1.0")) {
                        n = 0;
                    }
                    else {
                        if (!split[2].equals("HTTP/1.1")) {
                            break;
                        }
                        n = 1;
                    }
                    String s = null;
                    String s2 = null;
                    while (true) {
                        final String line2 = dataInputStream.readLine();
                        if (line2 == null) {
                            break Label_2720;
                        }
                        if (line2.isEmpty()) {
                            if (n == 1 && s == null) {
                                break Label_2720;
                            }
                            if (b && s2 == null) {
                                break Label_2720;
                            }
                            if (!b && s2 != null) {
                                break Label_2720;
                            }
                            String s3 = null;
                            if (s2 != null) {
                                int int1;
                                try {
                                    int1 = Integer.parseInt(s2);
                                }
                                catch (Exception ex2) {
                                    break Label_2720;
                                }
                                if (int1 > 0) {
                                    final byte[] array2 = new byte[int1];
                                    dataInputStream.readFully(array2);
                                    s3 = this.dN(array2);
                                    if (s3 != null && s3.isEmpty()) {
                                        break Label_2720;
                                    }
                                }
                            }
                            else if (!b) {
                                final Am.uK dn = this.ld.dN();
                                final StringBuilder sb = new StringBuilder(rP.dN(new byte[] { 127, 7, 4, 20, 30, 87, 109, 84, 28, 69, 73, 7, 23, 42, 13, 77, 80, 71, 64, 69, 12, 122, 116, 113, 12, 99, 32, 28, 21, 17, 3, 9, 76, 4, 28, 88, 0, 27, 27, 84, 5, 17, 77, 42, 93, 73, 14, 12, 13, 13, 95, 126, 89, 17, 65, 68, 56, 82, 102 }, 2, 46));
                                sb.append(String.format(rP.dN(new byte[] { -72, 15, 7, 98, 99, 44, 1, 26, 6, 29, 3, 0, 9, 23, 82, 5, 86, 79, 94, 16, 76, 52 }, 1, 242), this.dN.dN()));
                                sb.append(String.format(rP.dN(new byte[] { 115, 54, 7, 0, 23, 11, 26, 84, 85, 6, 18, 6, 2, 95, 26, 5, 65, 75, 10, 65, 68, 67, 15, 5, 12, 11, 26, 92, 91, 90, 21, 94, 16, 76, 52 }, 1, 48), dn.ld(), dn.dN()));
                                sb.append(rP.dN(new byte[] { 23, 19, 77, 13, 11, 29, 71, 52, 54, 19, 71, 28, 25, 1, 82, 52 }, 1, 43));
                                s3 = sb.toString();
                            }
                            int n2 = 400;
                            String s4 = rP.dN(new byte[] { 1, 14, 20, 89, 32, 12, 22, 29, 17, 83, 92 }, 2, 158);
                            String s5 = rP.dN(new byte[] { 32, 3, 31, 10, 23 }, 2, 252);
                            int length = 0;
                            if (s3 != null) {
                                n2 = 200;
                                s4 = rP.dN(new byte[] { -64, 4 }, 1, 143);
                                s5 = rP.dN(new byte[] { -118, 14, 0, 21, 93, 76, 13, 5, 31, 19 }, 1, 225);
                                length = TM.EO(s3).length;
                            }
                            final StringBuffer sb2 = new StringBuffer();
                            sb2.append(String.format(rP.dN(new byte[] { -93, 28, 0, 4, 127, 30, 31, 11, 65, 68, 5, 65, 68, 5, 86, 126, 7 }, 1, 235), n, n2, s4));
                            sb2.append(String.format(rP.dN(new byte[] { 7, 14, 4, 28, 72, 73, 66, 27, 121, 42 }, 2, 69), new SimpleDateFormat(rP.dN(new byte[] { 119, 0, 0, 105, 12, 68, 0, 68, 109, 0, 0, 109, 89, 0, 0, 0, 89, 104, 0, 114, 87, 0, 87, 73, 0, 83, 90 }, 1, 50)).format(new Date())));
                            sb2.append(String.format(rP.dN(new byte[] { 31, 54, 23, 4, 19, 23, 72, 26, 106, 15, 7, 98, 99, 44, 1, 26, 6, 29, 3, 0, 9, 23, 82, 5, 86, 126, 7 }, 1, 76), eI.dN));
                            sb2.append(String.format(rP.dN(new byte[] { -98, 44, 1, 0, 11, 6, 23, 29, 6, 1, 84, 26, 5, 86, 126, 7 }, 1, 221), s5));
                            if (length > 0) {
                                sb2.append(String.format(rP.dN(new byte[] { 0, 0, 30, 13, 23, 7, 19, 69, 32, 89, 88, 6, 19, 0, 69, 92, 65, 71, 3, 72, 70, 93, 93, 62, 38 }, 2, 89), new Object[0]));
                                sb2.append(String.format(rP.dN(new byte[] { 0, 0, 30, 13, 23, 7, 19, 69, 56, 69, 70, 4, 93, 72, 11, 25, 28, 87, 33, 42 }, 2, 241), length));
                            }
                            sb2.append("\r\n");
                            if (length > 0) {
                                sb2.append(s3);
                            }
                            final byte[] eo = TM.EO(sb2.toString());
                            dataOutputStream.write(eo, 0, eo.length);
                            break;
                        }
                        else {
                            final char char1 = line2.charAt(0);
                            if (char1 == ' ' || char1 == '\t') {
                                break Label_2720;
                            }
                            final String[] split2 = line2.split("\\s+", 2);
                            if (split2.length != 2) {
                                break Label_2720;
                            }
                            if (split2[0].equals("Host:")) {
                                s = split2[1];
                            }
                            else {
                                if (split2[0].equals("User-Agent:")) {
                                    continue;
                                }
                                if (split2[0].equals("Content-Type:")) {
                                    continue;
                                }
                                if (!split2[0].equals("Content-Length:")) {
                                    continue;
                                }
                                s2 = split2[1];
                            }
                        }
                    }
                }
                try {}
                catch (IOException ex3) {}
            }
        }
        catch (IOException ex4) {
            try {
                this.QE.close();
            }
            catch (IOException ex5) {}
        }
        finally {
            try {
                this.QE.close();
            }
            catch (IOException ex6) {}
        }
    }
    
    private String dN(final byte[] array) {
        try {
            String s = TM.fa(array);
            if (s.startsWith(rP.dN(new byte[] { 39, 14, 4, 24, 79 }, 2, 4))) {
                s = s.substring(5);
            }
            final PX ld = PX.ld(PX.dN(s));
            if (ld == null) {
                return null;
            }
            final OZ oz = new OZ(new ByteArrayInputStream(ld.wU()));
            final int int1 = oz.readInt();
            final long long1 = oz.readLong();
            final long long2 = oz.readLong();
            if (int1 == 0) {
                long n = 0L;
                if (ld.ld() != 844563159190538443L || ld.dN() != 0) {
                    n = 3L;
                }
                else if (ld.QE().dN(this.dN.dN()) < 0) {
                    n = 2L;
                }
                else if (!this.ld.dN(long1, long2)) {
                    n = 1L;
                }
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final Hk hk = new Hk(byteArrayOutputStream);
                hk.writeInt(1);
                hk.writeLong(n);
                hk.dN();
                return PX.dN(PX.dN(byteArrayOutputStream.toByteArray(), null));
            }
            if (int1 == 2) {
                this.ld.ld(long1, long2);
                return "";
            }
            return null;
        }
        catch (Exception ex) {
            return null;
        }
    }
}
