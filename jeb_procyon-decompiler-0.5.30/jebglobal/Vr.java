// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class Vr
{
    private static final long LK = 844563159190538443L;
    private static long dN;
    
    public static long dN() {
        return Vr.dN;
    }
    
    private static long ld() {
        final String property = System.getProperty(rP.dN(new byte[] { -109, 28, 93, 64, 15, 12, 8 }, 1, 252), "");
        String s;
        if (property.startsWith(rP.dN(new byte[] { -86, 62, 7, 10, 11, 24, 4 }, 1, 253))) {
            s = QE();
        }
        else if (property.startsWith(rP.dN(new byte[] { 14, 14, 19 }, 2, 32))) {
            s = wU();
        }
        else if (property.startsWith(rP.dN(new byte[] { 15, 6, 30, 12, 10 }, 2, 203))) {
            s = fa();
            if (s == null) {
                s = zs();
            }
        }
        else {
            s = rP.dN(new byte[] { 15, 14, 29, 27, 22, 8, 43, 9, 25, 66, 76, 2 }, 2, 56);
        }
        try {
            final MessageDigest instance = MessageDigest.getInstance(rP.dN(new byte[] { 14, 43, 69 }, 2, 193));
            instance.update(s.getBytes());
            final ByteBuffer wrap = ByteBuffer.wrap(instance.digest());
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            return wrap.getLong() & Long.MAX_VALUE;
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static String QE() {
        String trim = null;
        final Runtime runtime = Runtime.getRuntime();
        Process exec;
        try {
            exec = runtime.exec(rP.dN(new byte[] { 52, 2, 25, 26, 82, 11, 14, 7, 7, 0, 79, 6, 93, 0, 66, 92, 75, 90, 77, 76, 92, 69, 92, 81, 73, 82 }, 2, 15).split(" "));
        }
        catch (IOException ex) {
            return null;
        }
        final OutputStream outputStream = exec.getOutputStream();
        final InputStream inputStream = exec.getInputStream();
        try {
            outputStream.close();
        }
        catch (IOException ex2) {
            return null;
        }
        final Scanner scanner = new Scanner(inputStream);
        try {
            final String dn = rP.dN(new byte[] { -94, 54, 23, 27, 8, 13, 34, 59, 24, 15, 7, 23 }, 1, 241);
            while (scanner.hasNext()) {
                if (dn.equals(scanner.next())) {
                    trim = scanner.next().trim();
                    break;
                }
            }
        }
        finally {
            scanner.close();
        }
        return trim;
    }
    
    private static String wU() {
        String trim = null;
        final Runtime runtime = Runtime.getRuntime();
        Process exec;
        try {
            exec = runtime.exec(rP.dN(new byte[] { -48, 90, 6, 1, 93, 92, 17, 11, 7, 65, 92, 10, 10, 7, 17, 8, 50, 47, 2, 29, 9, 15, 5, 9, 23, 82, 115, 3, 24, 41, 19, 22, 19, 22, 19, 23, 33, 37, 21, 21, 53, 45, 9, 21 }, 1, 255).split(" "));
        }
        catch (IOException ex) {
            return null;
        }
        final OutputStream outputStream = exec.getOutputStream();
        final InputStream inputStream = exec.getInputStream();
        try {
            outputStream.close();
        }
        catch (IOException ex2) {
            return null;
        }
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        final String dn = rP.dN(new byte[] { 22, 54, 23, 27, 8, 13, 76, 110, 59, 24, 15, 7, 23 }, 1, 69);
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.indexOf(dn) >= 0) {
                    final String s = line.split(dn)[1];
                    final int index = s.indexOf(58);
                    if (index >= 0) {
                        trim = s.substring(index + 1).trim();
                        break;
                    }
                    break;
                }
            }
            try {
                inputStream.close();
            }
            catch (IOException ex3) {
                return null;
            }
        }
        catch (IOException ex4) {
            return null;
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException ex5) {
                return null;
            }
        }
        return trim;
    }
    
    private static String fa() {
        String trim = null;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(rP.dN(new byte[] { 108, 25, 17, 11, 93, 5, 14, 10, 91, 68, 74, 22, 90, 15, 92, 88, 90, 91, 69, 78, 87, 29, 88, 87 }, 2, 195))));
        }
        catch (FileNotFoundException ex) {
            return null;
        }
        try {
            final String line = bufferedReader.readLine();
            if (line != null) {
                trim = line.trim();
            }
            try {
                bufferedReader.close();
            }
            catch (IOException ex2) {
                return null;
            }
        }
        catch (IOException ex3) {
            return null;
        }
        finally {
            try {
                bufferedReader.close();
            }
            catch (IOException ex4) {
                return null;
            }
        }
        return trim;
    }
    
    private static String zs() {
        String s = null;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(rP.dN(new byte[] { 108, 10, 4, 26, 93, 15, 20, 28, 21, 66 }, 2, 224))));
        }
        catch (FileNotFoundException ex) {
            return null;
        }
        try {
            final String dn = rP.dN(new byte[] { 22, 58, 57, 61, 79 }, 2, 54);
            final String dn2 = rP.dN(new byte[] { 15, 46, 50, 60, 62, 84 }, 2, 220);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                final String trim = line.trim();
                if (trim.length() != 0) {
                    if (trim.startsWith("#")) {
                        continue;
                    }
                    final String[] split = trim.split("[ \\t]+");
                    if (split.length < 2) {
                        continue;
                    }
                    if (!split[1].equals("/")) {
                        continue;
                    }
                    final String s2 = split[0];
                    if (s2.startsWith(dn)) {
                        s = s2.substring(5);
                    }
                    else if (s2.startsWith(dn2)) {
                        s = s2.substring(6);
                    }
                    else {
                        s = s2;
                    }
                    if (s != null) {
                        s = s.toLowerCase();
                        break;
                    }
                    break;
                }
            }
            try {
                bufferedReader.close();
            }
            catch (IOException ex2) {
                return null;
            }
        }
        catch (IOException ex3) {
            return null;
        }
        finally {
            try {
                bufferedReader.close();
            }
            catch (IOException ex4) {
                return null;
            }
        }
        return s;
    }
    
    static {
        try {
            Vr.dN = ld();
        }
        catch (Exception ex) {
            Vr.dN = 0L;
        }
    }
}
