// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Enumeration;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.zip.CRC32;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Collection;
import java.util.ArrayList;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;

public class TM
{
    ZF dN;
    HashMap ld;
    
    public static boolean dN(final ew ew, final yK yk, final String s) {
        return !yk.ld() && yk.dN(s.equals("") ? null : s) && ew.dN(u.uK.dN, yk.zs(), -1, -1, s);
    }
    
    public static boolean dN(final ew ew, final gE ge, final String s) {
        final XV ld = ge.ld();
        return ld != null && ge.dN(s.equals("") ? null : s) && ew.dN(u.uK.QE, ld.dN(), -1, -1, s);
    }
    
    public static boolean dN(final ew ew, final AR ar, final hO ho, final String s, final boolean b) {
        final AV ld = ho.ld();
        if (ld == null || ld.fa()) {
            return false;
        }
        final List dn = new Cx(ar).dN(ho);
        final int dn2 = ho.dN();
        if (dn.size() <= 0 || !dn.contains(dn2)) {
            return false;
        }
        final Iterator<Integer> iterator = dn.iterator();
        while (iterator.hasNext()) {
            if (!ar.mS(iterator.next()).dN(s.equals("") ? null : s)) {
                return false;
            }
        }
        ho.ld(s.equals("") ? null : s);
        ew.dN(u.uK.ld, dn2, -1, -1, s);
        if (b) {
            for (final int intValue : dn) {
                if (intValue == dn2) {
                    continue;
                }
                final hO ms = ar.mS(intValue);
                ms.ld(s.equals("") ? null : s);
                ew.dN(u.uK.ld, ms.dN(), -1, -1, s);
            }
        }
        return true;
    }
    
    public static boolean dN(final ew ew, final OD.uK uk) {
        return ew.dN(OD.vd.dN, -1, -1, uk.dN(), uk.ld());
    }
    
    public static boolean dN(final ew ew, final yK yk, final OD.uK uk) {
        return ew.dN(OD.vd.ld, yk.zs(), -1, uk.dN(), uk.ld());
    }
    
    public static boolean dN(final ew ew, final gE ge, final OD.uK uk) {
        final XV ld = ge.ld();
        return ld != null && ew.dN(OD.vd.wU, ld.dN(), -1, uk.dN(), uk.ld());
    }
    
    public static boolean dN(final ew ew, final hO ho, final int n, final OD.uK uk) {
        final AV ld = ho.ld();
        if (ld == null) {
            return false;
        }
        final OM wu = ld.wU();
        if (wu == null) {
            if (n >= 0) {
                return false;
            }
        }
        else if (n >= wu.QE()) {
            return false;
        }
        return ew.dN((n < 0) ? OD.vd.QE : OD.vd.fa, ld.ld(), n, uk.dN(), uk.ld());
    }
    
    public static OD.uK dN(final ew ew) {
        final OD eo = ew.EO();
        if (eo == null) {
            return null;
        }
        return eo.cb();
    }
    
    public static OD.uK dN(final ew ew, final yK yk) {
        final OD wu = ew.wU(yk.zs());
        if (wu == null) {
            return null;
        }
        return wu.cb();
    }
    
    public static OD.uK dN(final ew ew, final gE ge) {
        final XV ld = ge.ld();
        if (ld == null) {
            return null;
        }
        final OD zs = ew.zs(ld.dN());
        if (zs == null) {
            return null;
        }
        return zs.cb();
    }
    
    public static OD.uK dN(final ew ew, final hO ho, final int n) {
        final AV ld = ho.ld();
        if (ld == null) {
            return null;
        }
        final int ld2 = ld.ld();
        final OD od = (n < 0) ? ew.fa(ld2) : ew.QE(ld2, n);
        if (od == null) {
            return null;
        }
        return od.cb();
    }
    
    public TM(final ZF dn) {
        this.dN = dn;
        this.ld = new HashMap();
    }
    
    public synchronized String dN(final WV wv) {
        final String value = this.ld.get(wv);
        if (value != null) {
            return value;
        }
        return this.dN.ld(wv.ld(), wv.QE());
    }
    
    public synchronized boolean ld(final WV wv) {
        final Boolean value = this.ld.get(wv);
        if (value != null) {
            return value;
        }
        boolean boolean1;
        try {
            boolean1 = Boolean.parseBoolean(wv.QE());
        }
        catch (Exception ex) {
            boolean1 = false;
        }
        return this.dN.ld(wv.ld(), boolean1);
    }
    
    public synchronized int QE(final WV wv) {
        final Integer value = this.ld.get(wv);
        if (value != null) {
            return value;
        }
        int int1;
        try {
            int1 = Integer.parseInt(wv.QE());
        }
        catch (Exception ex) {
            int1 = 0;
        }
        return this.dN.ld(wv.ld(), int1);
    }
    
    public synchronized void dN(final WV wv, final String s) {
        this.dN.dN(wv.ld(), s);
    }
    
    public synchronized void dN(final WV wv, final boolean b) {
        this.dN.dN(wv.ld(), b);
    }
    
    public synchronized void dN(final WV wv, final int n) {
        this.dN.dN(wv.ld(), n);
    }
    
    public synchronized void dN() {
        this.dN.dN();
    }
    
    public synchronized Proxy ld() {
        final String dn = this.dN(WV.VX);
        if (dn == null || dn.equals("")) {
            return null;
        }
        final String[] split = dn.split("\\|", -1);
        if (split.length != 3) {
            return null;
        }
        Proxy.Type type;
        if (split[0].equalsIgnoreCase("http")) {
            type = Proxy.Type.HTTP;
        }
        else {
            if (!split[0].equalsIgnoreCase("socks")) {
                return null;
            }
            type = Proxy.Type.SOCKS;
        }
        try {
            return new Proxy(type, new InetSocketAddress(split[1], Integer.parseInt(split[2])));
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Qa dN(final II ii) {
        if (!(ii instanceof tE)) {
            return null;
        }
        final tE te = (tE)ii;
        if (te.LH() != 1) {
            return null;
        }
        final EG qe = te.QE(0);
        if (qe.zs() != 1 || !(qe.ld(0) instanceof KO)) {
            return null;
        }
        return ((KO)qe.ld(0)).dN();
    }
    
    public static boolean dN(final II ii, final Qa qa) {
        return ii instanceof KO && ((KO)ii).dN() == qa;
    }
    
    public static boolean ld(final II ii) {
        if (ii instanceof tE) {
            final tE te = (tE)ii;
            if (te.LH() == 2 && te.mS()) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean QE(final II ii) {
        return ii instanceof tE && !((tE)ii).mS();
    }
    
    public static II dN(final EG eg, final int n) {
        if (n >= eg.zs()) {
            return null;
        }
        final II ld = eg.ld(n);
        if (!(ld instanceof wz)) {
            return ld;
        }
        if (ld instanceof jM) {
            final II dn = dN(((jM)ld).zs(), 0);
            return (dn == null) ? ld : dn;
        }
        if (ld instanceof zn) {
            if (!((zn)ld).zs().zs()) {
                return ld;
            }
            final II dn2 = dN(((zn)ld).mS(), 0);
            return (dn2 == null) ? ld : dn2;
        }
        else if (ld instanceof tE) {
            if (!((tE)ld).ld(0).zs()) {
                return ld;
            }
            final II dn3 = dN(((tE)ld).QE(0), 0);
            return (dn3 == null) ? ld : dn3;
        }
        else {
            if (ld instanceof SP) {
                final II dn4 = dN(((SP)ld).zs(), 0);
                return (dn4 == null) ? ld : dn4;
            }
            return ld;
        }
    }
    
    public static II dN(final Fu fu, final II ii) {
        return dN(fu.VX(), ii, new boolean[] { false });
    }
    
    public static II dN(final EG eg, final II ii, final boolean[] array) {
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (array[0]) {
                if (!(ld instanceof wz)) {
                    return ld;
                }
                if (ld instanceof jM) {
                    final II dn = dN(((jM)ld).zs(), ii, array);
                    return (dn == null) ? ld : dn;
                }
                if (ld instanceof zn) {
                    if (!((zn)ld).zs().zs()) {
                        return ld;
                    }
                    final II dn2 = dN(((zn)ld).mS(), ii, array);
                    return (dn2 == null) ? ld : dn2;
                }
                else if (ld instanceof tE) {
                    if (!((tE)ld).ld(0).zs()) {
                        return ld;
                    }
                    final II dn3 = dN(((tE)ld).QE(0), ii, array);
                    return (dn3 == null) ? ld : dn3;
                }
                else if (ld instanceof SP) {
                    final II dn4 = dN(((SP)ld).zs(), ii, array);
                    return (dn4 == null) ? ld : dn4;
                }
            }
            else if (ld == ii) {
                array[0] = true;
            }
            else if (ld instanceof wz) {
                final Iterator iterator = ((SP)ld).dN().iterator();
                while (iterator.hasNext()) {
                    final II dn5 = dN(iterator.next(), ii, array);
                    if (dn5 != null) {
                        return dn5;
                    }
                    if (array[0]) {
                        break;
                    }
                }
            }
        }
        return null;
    }
    
    public static List dN(final IK... array) {
        final ArrayList<IK> list = new ArrayList<IK>(array.length);
        for (final IK ik : array) {
            if (ik != null) {
                list.add(ik);
            }
        }
        return list;
    }
    
    public static List dN(final Collection collection) {
        return dN(new ArrayList(), collection);
    }
    
    public static List dN(final List list, final IK ik) {
        if (ik != null) {
            list.add(ik);
        }
        return list;
    }
    
    public static List dN(final List list, final Collection collection) {
        if (collection != null) {
            for (final IK ik : collection) {
                if (ik != null) {
                    list.add(ik);
                }
            }
        }
        return list;
    }
    
    public static String dN(final String s) {
        return s.replace("&", "&amp;").replace("<", "&lt;");
    }
    
    public static String ld(final String s) {
        if (s.isEmpty()) {
            return s;
        }
        final char[] charArray = s.toCharArray();
        final StringBuilder sb = new StringBuilder(s.length() + 10);
        switch (charArray[0]) {
            case '#':
            case '?':
            case '@': {
                sb.append('\\');
                break;
            }
        }
        for (final char c : charArray) {
            Label_0202: {
                switch (c) {
                    case 92: {
                        sb.append('\\');
                        break;
                    }
                    case 34: {
                        sb.append("&quot;");
                        break Label_0202;
                    }
                    case 10: {
                        sb.append("\\n");
                        break Label_0202;
                    }
                    default: {
                        if (!dN(c)) {
                            sb.append(String.format("\\u%04x", (int)c));
                            break Label_0202;
                        }
                        break;
                    }
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String QE(final String s) {
        if (s.isEmpty()) {
            return s;
        }
        final char[] charArray = s.toCharArray();
        final StringBuilder sb = new StringBuilder(s.length() + 10);
        switch (charArray[0]) {
            case '#':
            case '?':
            case '@': {
                sb.append('\\');
                break;
            }
        }
        int n = 0;
        int n2 = 0;
        boolean b = false;
        int n3 = 1;
        for (final char c : charArray) {
            Label_0306: {
                if (n != 0) {
                    if (c == '>') {
                        n = 0;
                        n2 = sb.length() + 1;
                        b = false;
                    }
                }
                else if (c == ' ') {
                    if (n3 != 0) {
                        b = true;
                    }
                    n3 = 1;
                }
                else {
                    n3 = 0;
                    switch (c) {
                        case 92: {
                            sb.append('\\');
                            break;
                        }
                        case 10:
                        case 39: {
                            b = true;
                            break;
                        }
                        case 34: {
                            sb.append('\\');
                            break;
                        }
                        case 60: {
                            n = 1;
                            if (b) {
                                sb.insert(n2, '\"').append('\"');
                                break;
                            }
                            break;
                        }
                        default: {
                            if (!dN(c)) {
                                sb.append(String.format("\\u%04x", (int)c));
                                break Label_0306;
                            }
                            break;
                        }
                    }
                }
                sb.append(c);
            }
        }
        if (b || n3 != 0) {
            sb.insert(n2, '\"').append('\"');
        }
        return sb.toString();
    }
    
    public static boolean wU(final String s) {
        return dN(s, 2).size() > 1;
    }
    
    public static String fa(final String s) {
        final List dn = dN(s, -1);
        if (dn.size() < 2) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        int intValue = 0;
        int n = 0;
        final Iterator<Integer> iterator = dn.iterator();
        while (iterator.hasNext()) {
            final Integer value;
            sb.append(s.substring(intValue, value = iterator.next() + 1)).append(++n).append('$');
            intValue = value;
        }
        sb.append(s.substring(intValue));
        return sb.toString();
    }
    
    public static List dN(final String s, final int n) {
        int n2 = 0;
        int n3 = 0;
        final int length = s.length();
        final ArrayList<Integer> list = new ArrayList<Integer>();
        int index;
        while ((n2 = (index = s.indexOf(37, n2)) + 1) != 0) {
            if (n2 == length) {
                break;
            }
            final char char1 = s.charAt(n2++);
            if (char1 == '%') {
                continue;
            }
            if (char1 >= '0' && char1 <= '9' && n2 < length) {
                char char2;
                do {
                    char2 = s.charAt(n2++);
                } while (char2 >= '0' && char2 <= '9' && n2 < length);
                if (char2 == '$') {
                    continue;
                }
            }
            list.add(index);
            if (n != -1 && ++n3 >= n) {
                break;
            }
        }
        return list;
    }
    
    public static boolean dN(final char c) {
        final Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return !Character.isISOControl(c) && c != '\uffff' && of != null && of != Character.UnicodeBlock.SPECIALS;
    }
    
    public static void dN(final Sj sj, final File file) {
        final Iterator<String> iterator = sj.dN(true).iterator();
        while (iterator.hasNext()) {
            dN(sj, file, iterator.next());
        }
    }
    
    public static void dN(final Sj sj, final File file, final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            dN(sj, file, array[i]);
        }
    }
    
    public static void dN(final Sj sj, final File file, final String s) {
        try {
            if (sj.ld(s)) {
                dN(new File(file, s));
                sj.fa(s).dN(new File(file, s));
            }
            else {
                final File file2 = new File(file, s);
                file2.getParentFile().mkdirs();
                dN(sj.QE(s), new FileOutputStream(file2));
            }
        }
        catch (IOException ex) {
            throw new oM();
        }
        catch (QO qo) {
            throw new oM();
        }
    }
    
    public static void dN(final InputStream inputStream, final OutputStream outputStream) {
        try {
            Br.dN(inputStream, outputStream);
        }
        finally {
            try {
                inputStream.close();
                outputStream.close();
            }
            catch (IOException ex) {}
        }
    }
    
    public static void dN(final File file) {
        if (!file.exists()) {
            return;
        }
        final File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; ++i) {
            final File file2 = listFiles[i];
            if (file2.isDirectory()) {
                dN(file2);
            }
            else {
                file2.delete();
            }
        }
        file.delete();
    }
    
    public static Button dN(final Composite composite, final String s, final SelectionListener selectionListener) {
        final Button button = new Button(composite, 8);
        button.setText("     " + s + "     ");
        if (selectionListener != null) {
            button.addSelectionListener(selectionListener);
        }
        return button;
    }
    
    public static Button ld(final Composite composite, final String text, final SelectionListener selectionListener) {
        final Button button = new Button(composite, 32);
        button.setText(text);
        if (selectionListener != null) {
            button.addSelectionListener(selectionListener);
        }
        return button;
    }
    
    public static Text dN(final Composite composite, final int n, final String text, final SelectionListener selectionListener) {
        final Text text2 = new Text(composite, 2052);
        if (composite.getLayout() instanceof RowLayout) {
            final GC gc = new GC((Drawable)text2);
            RowData layoutData;
            try {
                gc.setFont(text2.getFont());
                final FontMetrics fontMetrics = gc.getFontMetrics();
                layoutData = new RowData(n * fontMetrics.getAverageCharWidth(), 1 * fontMetrics.getHeight());
            }
            finally {
                gc.dispose();
            }
            text2.setLayoutData((Object)layoutData);
        }
        if (text != null) {
            text2.setText(text);
            text2.selectAll();
        }
        text2.pack(false);
        if (selectionListener != null) {
            text2.addSelectionListener(selectionListener);
        }
        return text2;
    }
    
    public static RowLayout dN(final boolean b, final boolean wrap) {
        final RowLayout rowLayout = new RowLayout();
        rowLayout.type = (b ? 512 : 256);
        rowLayout.wrap = wrap;
        return rowLayout;
    }
    
    public static RowLayout QE() {
        return dN(false, false);
    }
    
    public static byte[][] dN(final byte[][] array) {
        final byte[][] array2 = array.clone();
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i].clone();
        }
        return array2;
    }
    
    public static void dN(final byte[] array, final byte[] array2, final int n, final int n2) {
        final int length = array.length;
        final byte[] array3 = new byte[256];
        for (int i = 0; i < 256; ++i) {
            array3[i] = (byte)i;
        }
        int n3 = 0;
        for (int j = 0; j < 256; ++j) {
            n3 = ((n3 + array3[j] + array[j % length]) % 256 & 0xFF);
            final byte b = array3[j];
            array3[j] = array3[n3];
            array3[n3] = b;
        }
        int n4 = 0;
        int n5 = 0;
        for (int k = n; k < n2; ++k) {
            n4 = ((n4 + 1) % 256 & 0xFF);
            n5 = ((n5 + array3[n4]) % 256 & 0xFF);
            final byte b2 = array3[n4];
            array3[n4] = array3[n5];
            array3[n5] = b2;
            final byte b3 = array3[(array3[n4] + array3[n5]) % 256 & 0xFF];
            final int n6 = k;
            array2[n6] ^= b3;
        }
    }
    
    public static int dN(final byte[] array) {
        final CRC32 crc32 = new CRC32();
        crc32.update(array);
        return (int)(crc32.getValue() & -1L);
    }
    
    public static byte[] ld(final byte[] array) {
        try {
            return MessageDigest.getInstance("MD5").digest(array);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static byte[] QE(final byte[] array) {
        try {
            return MessageDigest.getInstance("SHA-1").digest(array);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static byte[] wU(final byte[] array) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(array);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static boolean zs(final String s) {
        final File file = new File(s);
        try {
            return file.mkdir();
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static boolean mS(final String s) {
        final File file = new File(s);
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file2 : listFiles) {
                if (file2.isDirectory()) {
                    mS(file2.getAbsolutePath());
                }
                else if (!file2.delete()) {
                    return false;
                }
            }
        }
        return file.delete();
    }
    
    public static File OK(final String s) {
        final File tempFile = File.createTempFile("jebgettemp", null);
        final File file = new File(tempFile.getParent(), s);
        tempFile.delete();
        file.mkdir();
        return file;
    }
    
    public static void ld(final File file) {
        file.deleteOnExit();
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file2 : listFiles) {
                if (file2.isDirectory()) {
                    ld(file2);
                }
                else {
                    file2.deleteOnExit();
                }
            }
        }
    }
    
    public static void dN(final File file, final byte[] array, final boolean b) {
        if (b) {
            final File parentFile = file.getAbsoluteFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        }
        final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        dataOutputStream.write(array);
        dataOutputStream.close();
    }
    
    public static byte[] dN(final File file, final long n) {
        final long length = file.length();
        if (n >= 0L && length > n) {
            throw new IOException();
        }
        final byte[] array = new byte[(int)length];
        final DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        dataInputStream.readFully(array);
        dataInputStream.close();
        return array;
    }
    
    public static byte[] QE(final File file) {
        return dN(file, -1L);
    }
    
    public static byte[] LH(final String s) {
        return dN(new File(s), -1L);
    }
    
    public static byte[] dN(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[16384];
        int read;
        while ((read = inputStream.read(array, 0, array.length)) != -1) {
            byteArrayOutputStream.write(array, 0, read);
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }
    
    public static int KK(final String s) {
        try {
            final OZ oz = new OZ(new FileInputStream(new File(s)));
            final int int1 = oz.readInt();
            oz.dN();
            return int1;
        }
        catch (IOException ex) {
            return 0;
        }
    }
    
    public static boolean dN(final String s, final String s2) {
        final File file = new File(s);
        if (!file.isDirectory()) {
            return false;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(new File(s2)));
            dN(zipOutputStream, file, "/");
            try {
                zipOutputStream.close();
            }
            catch (IOException ex) {
                return false;
            }
            return true;
        }
        catch (IOException ex2) {
            return false;
        }
        finally {
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                }
                catch (IOException ex3) {
                    return false;
                }
            }
        }
    }
    
    public static void dN(final ZipOutputStream zipOutputStream, final File file, final String s) {
        final File file2 = new File(file, s);
        if (file2.isFile()) {
            zipOutputStream.putNextEntry(new ZipEntry(s));
            zipOutputStream.write(LH(file2.getAbsolutePath()));
            zipOutputStream.closeEntry();
        }
        else if (file2.isDirectory()) {
            final String[] list = file2.list();
            for (int length = list.length, i = 0; i < length; ++i) {
                dN(zipOutputStream, file, new File(s, list[i]).getPath());
            }
        }
    }
    
    public static boolean dN(final File file, final File file2) {
        try {
            final ZipFile zipFile = new ZipFile(file);
            final Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                final ZipEntry zipEntry = (ZipEntry)entries.nextElement();
                dN(new File(file2, zipEntry.getName()), dN(zipFile.getInputStream(zipEntry)), true);
            }
            zipFile.close();
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public static List dN(final int[] array) {
        final ArrayList<Integer> list = new ArrayList<Integer>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return list;
    }
    
    public static String dN(final Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
    
    public static byte[] EO(final String s) {
        try {
            return s.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            return s.getBytes();
        }
    }
    
    public static String fa(final byte[] array) {
        try {
            return new String(array, "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            return new String(array);
        }
    }
    
    public static int dN(final String s, int n, String lowerCase, final boolean b, final boolean b2) {
        if (s == null || n < 0 || n >= s.length() || lowerCase == null) {
            throw new IllegalArgumentException();
        }
        if (lowerCase.isEmpty()) {
            return n;
        }
        if (b && !b2) {
            return s.indexOf(lowerCase, n);
        }
        if (!b) {
            lowerCase = lowerCase.toLowerCase();
        }
        final char char1 = lowerCase.charAt(0);
        if (!b2) {
            for (int i = n; i <= s.length() - lowerCase.length(); ++i) {
                if (Character.toLowerCase(s.charAt(i)) == char1 && lowerCase.equalsIgnoreCase(s.substring(i, i + lowerCase.length()))) {
                    return i;
                }
            }
            return -1;
        }
        if (n + lowerCase.length() > s.length()) {
            n = s.length() - lowerCase.length();
        }
        if (b) {
            for (int j = n; j >= 0; --j) {
                if (s.charAt(j) == char1 && lowerCase.equals(s.substring(j, j + lowerCase.length()))) {
                    return j;
                }
            }
            return -1;
        }
        for (int k = n; k >= 0; --k) {
            if (Character.toLowerCase(s.charAt(k)) == char1 && lowerCase.equalsIgnoreCase(s.substring(k, k + lowerCase.length()))) {
                return k;
            }
        }
        return -1;
    }
    
    public static Thread dN(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }
    
    public static Thread ld(final Runnable runnable) {
        final Thread dn = dN(runnable);
        dn.start();
        return dn;
    }
    
    public static boolean dN(final Thread thread) {
        if (thread == null) {
            return false;
        }
        if (!thread.isAlive()) {
            return true;
        }
        thread.interrupt();
        try {
            thread.join();
        }
        catch (InterruptedException ex) {}
        return !thread.isAlive();
    }
    
    public static boolean dN(final Thread thread, final Xp xp) {
        final long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            try {
                thread.join(3000L);
            }
            catch (InterruptedException ex) {
                break;
            }
            if (!thread.isAlive()) {
                break;
            }
            final long de = xp.De();
            if (de > 0L && System.currentTimeMillis() - currentTimeMillis >= de) {
                thread.interrupt();
                try {
                    thread.join();
                }
                catch (InterruptedException ex2) {}
                break;
            }
        }
        return !thread.isAlive();
    }
}
