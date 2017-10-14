// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.program.Program;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.Proxy;

public final class Vm
{
    private Proxy dN;
    private String ld;
    private int QE;
    private int wU;
    
    public Vm() {
        this(null);
    }
    
    public Vm(final Proxy proxy) {
        this.dN(proxy);
        this.dN(String.format(rP.dN(new byte[] { -21, 15, 7, 98, 5, 86 }, 1, 161), eI.dN));
        this.dN(60000, 30000);
    }
    
    public synchronized void dN(final Proxy proxy) {
        this.dN = ((proxy == null) ? Proxy.NO_PROXY : proxy);
    }
    
    public synchronized void dN(final String ld) {
        this.ld = ld;
    }
    
    public synchronized void dN(final int qe, final int wu) {
        this.QE = qe;
        this.wU = wu;
    }
    
    public synchronized byte[] ld(final String s) {
        URL url;
        try {
            url = new URL(s);
        }
        catch (MalformedURLException ex) {
            return null;
        }
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection)url.openConnection(this.dN);
        }
        catch (IOException ex2) {
            return null;
        }
        httpURLConnection.setConnectTimeout(this.QE);
        httpURLConnection.setReadTimeout(this.wU);
        if (this.ld != null) {
            httpURLConnection.setRequestProperty(rP.dN(new byte[] { 22, 28, 21, 11, 95, 40, 0, 13, 26, 84 }, 2, 212), this.ld);
        }
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            if (rP.dN(new byte[] { 125, 29, 19, 25 }, 1, 26).equals(httpURLConnection.getContentEncoding())) {
                inputStream = new GZIPInputStream(inputStream);
            }
            return TM.dN(inputStream);
        }
        catch (Exception ex3) {
            return null;
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException ex4) {
                    return null;
                }
            }
        }
    }
    
    public synchronized String dN(final String s, final String s2) {
        URL url;
        try {
            url = new URL(s);
        }
        catch (MalformedURLException ex) {
            return null;
        }
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection)url.openConnection(this.dN);
        }
        catch (IOException ex2) {
            return null;
        }
        httpURLConnection.setConnectTimeout(this.QE);
        httpURLConnection.setReadTimeout(this.wU);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty(rP.dN(new byte[] { 0, 0, 30, 13, 23, 7, 19, 69, 32, 89, 88, 6 }, 2, 32), rP.dN(new byte[] { 34, 31, 0, 21, 27, 10, 6, 28, 29, 79, 70, 76, 81, 13, 70, 78, 78, 30, 74, 79, 64, 93, 28, 70, 94, 76, 42, 28, 2, 12, 8, 0, 68 }, 2, 148));
        if (this.ld != null) {
            httpURLConnection.setRequestProperty(rP.dN(new byte[] { 22, 28, 21, 11, 95, 40, 0, 13, 26, 84 }, 2, 154), this.ld);
        }
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(rP.dN(new byte[] { -41, 5, 21, 21, 92 }, 1, 179) + URLEncoder.encode(s2, rP.dN(new byte[] { 4, 1, 18, 107, 21 }, 1, 81)));
            dataOutputStream.flush();
            try {
                dataOutputStream.close();
            }
            catch (IOException ex3) {
                return null;
            }
        }
        catch (IOException ex4) {
            return null;
        }
        finally {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                }
                catch (IOException ex5) {
                    return null;
                }
            }
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            final StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line + "\n");
            }
            final String string = sb.toString();
            try {
                bufferedReader.close();
            }
            catch (IOException ex6) {
                return null;
            }
            return string;
        }
        catch (IOException ex7) {
            return null;
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException ex8) {
                    return null;
                }
            }
        }
    }
    
    public static boolean QE(final String s) {
        try {
            return (s.startsWith(rP.dN(new byte[] { 43, 27, 4, 9, 72, 70, 72 }, 2, 155)) || s.startsWith(rP.dN(new byte[] { 77, 28, 0, 4, 3, 73, 21, 0 }, 1, 37))) && Program.launch(s);
        }
        catch (Exception ex) {
            return false;
        }
    }
}
