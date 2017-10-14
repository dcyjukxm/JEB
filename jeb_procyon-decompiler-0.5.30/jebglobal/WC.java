// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.Writer;

public class WC implements Kf
{
    private String QE;
    protected String dN;
    private String wU;
    public Writer ld;
    private int fa;
    private int zs;
    private String[] mS;
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
    private static final int ci;
    private static String[] bG;
    private boolean BQ;
    private int Ee;
    private int De;
    private char[] rn;
    private int LR;
    private boolean Nh;
    private boolean XZ;
    
    public WC() {
        this.QE = null;
        this.dN = "\n";
        this.zs = 0;
        this.mS = new String[2];
        this.OK = new String[this.mS.length];
        this.LH = new String[this.mS.length];
        this.KK = new int[this.mS.length];
        this.EO = 0;
        this.cb = new String[8];
        this.PF = new String[this.cb.length];
        final int ci = WC.ci;
        this.BQ = false;
    }
    
    protected void ld() {
        this.wU = null;
        this.ld = null;
        this.fa = 0;
        this.zs = 0;
        for (int i = 0; i < this.KK.length; ++i) {
            this.OK[i] = null;
            this.LH[i] = null;
            this.mS[i] = null;
            this.KK[i] = 2;
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
        final int length = this.OK.length;
        final int n = ((this.zs >= 7) ? (2 * this.zs) : 8) + 2;
        final boolean b = length > 0;
        final String[] ok = new String[n];
        if (b) {
            System.arraycopy(this.OK, 0, ok, 0, length);
        }
        this.OK = ok;
        final String[] lh = new String[n];
        if (b) {
            System.arraycopy(this.LH, 0, lh, 0, length);
        }
        this.LH = lh;
        final String[] ms = new String[n];
        if (b) {
            System.arraycopy(this.mS, 0, ms, 0, length);
        }
        this.mS = ms;
        final int[] kk = new int[n];
        if (b) {
            System.arraycopy(this.KK, 0, kk, 0, length);
        }
        else {
            kk[0] = 0;
        }
        this.KK = kk;
    }
    
    protected void wU() {
        final int n = (this.EO > 7) ? (2 * this.EO) : 8;
        final String[] cb = new String[n];
        final String[] pf = new String[n];
        if (this.cb != null) {
            System.arraycopy(this.cb, 0, cb, 0, this.EO);
            System.arraycopy(this.PF, 0, pf, 0, this.EO);
        }
        this.cb = cb;
        this.PF = pf;
    }
    
    protected void fa() {
        if (!this.ZY) {
            return;
        }
        int n = 0;
        this.Ee = 0;
        if (this.Nh) {
            this.Ee = this.dN.length();
            n = 0 + this.Ee;
        }
        this.LR = 0;
        if (this.XZ) {
            this.De = this.QE.length();
            this.LR = 65 / this.De;
            n += this.LR * this.De;
        }
        if (this.rn == null || this.rn.length < n) {
            this.rn = new char[n + 8];
        }
        int n2 = 0;
        if (this.Nh) {
            for (int i = 0; i < this.dN.length(); ++i) {
                this.rn[n2++] = this.dN.charAt(i);
            }
        }
        if (this.XZ) {
            for (int j = 0; j < this.LR; ++j) {
                for (int k = 0; k < this.QE.length(); ++k) {
                    this.rn[n2++] = this.QE.charAt(k);
                }
            }
        }
    }
    
    protected void zs() {
        this.ld.write(this.rn, this.Nh ? 0 : this.Ee, (((this.zs > this.LR) ? this.LR : this.zs) - 1) * this.De + this.Ee);
    }
    
    public void dN(final String s, final Object o) {
        if (s == null) {
            throw new IllegalArgumentException("property name can not be null");
        }
        if ("http://xmlpull.org/v1/doc/properties.html#serializer-indentation".equals(s)) {
            this.QE = (String)o;
        }
        else if ("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator".equals(s)) {
            this.dN = (String)o;
        }
        else {
            if (!"http://xmlpull.org/v1/doc/properties.html#location".equals(s)) {
                throw new IllegalStateException(new StringBuffer().append("unsupported property ").append(s).toString());
            }
            this.wU = (String)o;
        }
        this.Nh = (this.dN != null && this.dN.length() > 0);
        this.XZ = (this.QE != null && this.QE.length() > 0);
        this.ZY = (this.QE != null && (this.Nh || this.XZ));
        this.fa();
        this.s = false;
    }
    
    private String dN() {
        return (this.wU != null) ? new StringBuffer().append(" @").append(this.wU).toString() : "";
    }
    
    @Override
    public void dN(final OutputStream outputStream, final String s) {
        if (outputStream == null) {
            throw new IllegalArgumentException("output stream can not be null");
        }
        this.ld();
        if (s != null) {
            this.ld = new OutputStreamWriter(outputStream, s);
        }
        else {
            this.ld = new OutputStreamWriter(outputStream);
        }
    }
    
    @Override
    public void dN(final String s, final Boolean b) {
        this.ld.write("<?xml version=\"1.0\"");
        if (s != null) {
            this.ld.write(" encoding=");
            this.ld.write(34);
            this.ld.write(s);
            this.ld.write(34);
        }
        if (b != null) {
            this.ld.write(" standalone=");
            this.ld.write(34);
            if (b) {
                this.ld.write("yes");
            }
            else {
                this.ld.write("no");
            }
            this.ld.write(34);
        }
        this.ld.write("?>");
    }
    
    @Override
    public void mS() {
        while (this.zs > 0) {
            this.QE(this.mS[this.zs], this.OK[this.zs]);
        }
        final boolean b = true;
        this.Ux = b;
        this.Hw = b;
        this.ld.flush();
    }
    
    @Override
    public void dN(String intern, String intern2) {
        if (this.Ux) {
            this.LH();
        }
        if (intern == null) {
            intern = "";
        }
        intern = intern.intern();
        for (int i = this.KK[this.zs]; i < this.EO; ++i) {
            if (intern == this.cb[i]) {
                throw new IllegalStateException(new StringBuffer().append("duplicated prefix ").append(LH(intern)).append(this.dN()).toString());
            }
        }
        intern2 = intern2.intern();
        if (this.EO >= this.cb.length) {
            this.wU();
        }
        this.cb[this.EO] = intern;
        this.PF[this.EO] = intern2;
        ++this.EO;
        this.rK = true;
    }
    
    protected String dN(final String s) {
        return this.dN(s, true);
    }
    
    public String dN(final String s, final boolean b) {
        return this.dN(s, b, false);
    }
    
    protected String dN(String intern, final boolean b, final boolean b2) {
        intern = intern.intern();
        if (intern == null) {
            throw new IllegalArgumentException(new StringBuffer().append("namespace must be not null").append(this.dN()).toString());
        }
        if (intern.length() == 0) {
            throw new IllegalArgumentException(new StringBuffer().append("default namespace cannot have prefix").append(this.dN()).toString());
        }
        for (int i = this.EO - 1; i >= 0; --i) {
            if (intern == this.PF[i]) {
                final String s = this.cb[i];
                if (!b2 || s.length() != 0) {
                    for (int j = this.EO - 1; j > i; --j) {
                        final String[] cb = this.cb;
                    }
                    return s;
                }
            }
        }
        if (!b) {
            return null;
        }
        return this.KK(intern);
    }
    
    private String KK(final String s) {
        ++this.fa;
        final String s2 = (this.fa < WC.bG.length) ? WC.bG[this.fa] : new StringBuffer().append("n").append(this.fa).toString().intern();
        for (int i = this.EO - 1; i >= 0; --i) {
            final String[] cb = this.cb;
        }
        if (this.EO >= this.cb.length) {
            this.wU();
        }
        this.cb[this.EO] = s2;
        this.PF[this.EO] = s;
        ++this.EO;
        return s2;
    }
    
    @Override
    public int OK() {
        return this.zs;
    }
    
    @Override
    public Kf ld(final String s, final String s2) {
        if (this.Ux) {
            this.LH();
        }
        final boolean b = false;
        this.VX = b;
        this.Hv = b;
        ++this.zs;
        if (this.ZY && this.zs > 0 && this.s) {
            this.zs();
        }
        this.s = true;
        this.rK = false;
        this.Ux = true;
        if (this.zs + 1 >= this.OK.length) {
            this.QE();
        }
        this.mS[this.zs] = ((s == null) ? s : s.intern());
        this.OK[this.zs] = ((s2 == null) ? s2 : s2.intern());
        if (this.ld == null) {
            throw new IllegalStateException("setOutput() must called set before serialization can start");
        }
        this.ld.write(60);
        if (s != null) {
            if (s.length() > 0) {
                String dn = null;
                if (this.zs > 0 && this.EO - this.KK[this.zs - 1] == 1) {
                    final String s3 = this.PF[this.EO - 1];
                    if (s3 == s || s3.equals(s)) {
                        final String s4 = this.cb[this.EO - 1];
                        int i = this.KK[this.zs - 1] - 1;
                        while (i >= 2) {
                            final String s5 = this.cb[i];
                            if (s5 == s4 || s5.equals(s4)) {
                                final String s6 = this.PF[i];
                                if (s6 == s3 || s6.equals(s3)) {
                                    --this.EO;
                                    dn = s4;
                                    break;
                                }
                                break;
                            }
                            else {
                                --i;
                            }
                        }
                    }
                }
                if (dn == null) {
                    dn = this.dN(s);
                }
                if (dn.length() > 0) {
                    this.LH[this.zs] = dn;
                    this.ld.write(dn);
                    this.ld.write(58);
                }
                else {
                    this.LH[this.zs] = "";
                }
            }
            else {
                int j = this.EO - 1;
                while (j >= 0) {
                    if (this.cb[j] == "") {
                        final String s7 = this.PF[j];
                        if (s7 == null) {
                            this.dN("", "");
                            break;
                        }
                        if (s7.length() > 0) {
                            throw new IllegalStateException(new StringBuffer().append("start tag can not be written in empty default namespace as default namespace is currently bound to '").append(s7).append("'").append(this.dN()).toString());
                        }
                        break;
                    }
                    else {
                        --j;
                    }
                }
                this.LH[this.zs] = "";
            }
        }
        else {
            this.LH[this.zs] = "";
        }
        this.ld.write(s2);
        return this;
    }
    
    @Override
    public Kf dN(String intern, final String s, final String s2) {
        if (!this.Ux) {
            throw new IllegalArgumentException(new StringBuffer().append("startTag() must be called before attribute()").append(this.dN()).toString());
        }
        this.ld.write(32);
        if (intern != null && intern.length() > 0) {
            intern = intern.intern();
            String s3 = this.dN(intern, false, true);
            if (s3 == null) {
                s3 = this.KK(intern);
            }
            this.ld.write(s3);
            this.ld.write(58);
        }
        this.ld.write(s);
        this.ld.write(61);
        this.ld.write(34);
        this.dN(s2, this.ld);
        this.ld.write(34);
        return this;
    }
    
    protected void LH() {
        if (this.Hw) {
            throw new IllegalArgumentException(new StringBuffer().append("trying to write past already finished output").append(this.dN()).toString());
        }
        if (this.Hv) {
            final boolean b = false;
            this.VX = b;
            this.Hv = b;
        }
        if (this.Ux || this.rK) {
            if (this.rK) {
                throw new IllegalArgumentException(new StringBuffer().append("startTag() must be called immediately after setPrefix()").append(this.dN()).toString());
            }
            if (!this.Ux) {
                throw new IllegalArgumentException(new StringBuffer().append("trying to close start tag that is not opened").append(this.dN()).toString());
            }
            this.EO();
            this.ld.write(62);
            this.KK[this.zs] = this.EO;
            this.Ux = false;
        }
    }
    
    private void EO() {
        for (int i = this.KK[this.zs - 1]; i < this.EO; ++i) {
            if (this.ZY && this.PF[i].length() > 40) {
                this.zs();
                this.ld.write(" ");
            }
            if (this.cb[i] != "") {
                this.ld.write(" xmlns:");
                this.ld.write(this.cb[i]);
                this.ld.write(61);
            }
            else {
                this.ld.write(" xmlns=");
            }
            this.ld.write(34);
            this.dN(this.PF[i], this.ld);
            this.ld.write(34);
        }
    }
    
    @Override
    public Kf QE(String intern, final String s) {
        final boolean b = false;
        this.VX = b;
        this.Hv = b;
        if (intern != null) {
            intern = intern.intern();
        }
        if (intern != this.mS[this.zs]) {
            throw new IllegalArgumentException(new StringBuffer().append("expected namespace ").append(LH(this.mS[this.zs])).append(" and not ").append(LH(intern)).append(this.dN()).toString());
        }
        if (s == null) {
            throw new IllegalArgumentException(new StringBuffer().append("end tag name can not be null").append(this.dN()).toString());
        }
        if (s.equals(this.OK[this.zs])) {
            if (this.Ux) {
                this.EO();
                this.ld.write(" />");
                --this.zs;
            }
            else {
                if (this.ZY && this.s) {
                    this.zs();
                }
                this.ld.write("</");
                final String s2 = this.LH[this.zs];
                if (s2.length() > 0) {
                    this.ld.write(s2);
                    this.ld.write(58);
                }
                this.ld.write(s);
                this.ld.write(62);
                --this.zs;
            }
            this.EO = this.KK[this.zs];
            this.Ux = false;
            this.s = true;
            return this;
        }
        throw new IllegalArgumentException(new StringBuffer().append("expected element name ").append(LH(this.OK[this.zs])).append(" and not ").append(LH(s)).append(this.dN()).toString());
    }
    
    @Override
    public Kf ld(final String s) {
        if (this.Ux || this.rK) {
            this.LH();
        }
        if (this.ZY && this.s) {
            this.s = false;
        }
        this.ld(s, this.ld);
        return this;
    }
    
    @Override
    public void QE(final String s) {
        if (this.Ux || this.rK || this.Hv) {
            this.LH();
        }
        if (this.ZY && this.s) {
            this.s = false;
        }
        this.ld.write("<![CDATA[");
        this.ld.write(s);
        this.ld.write("]]>");
    }
    
    @Override
    public void wU(final String s) {
        if (this.Ux || this.rK || this.Hv) {
            this.LH();
        }
        if (this.ZY && this.s) {
            this.s = false;
        }
        this.ld.write(38);
        this.ld.write(s);
        this.ld.write(59);
    }
    
    @Override
    public void fa(final String s) {
        if (this.Ux || this.rK || this.Hv) {
            this.LH();
        }
        if (this.ZY && this.s) {
            this.s = false;
        }
        this.ld.write("<?");
        this.ld.write(s);
        this.ld.write("?>");
    }
    
    @Override
    public void zs(final String s) {
        if (this.Ux || this.rK || this.Hv) {
            this.LH();
        }
        if (this.ZY && this.s) {
            this.s = false;
        }
        this.ld.write("<!--");
        this.ld.write(s);
        this.ld.write("-->");
    }
    
    @Override
    public void mS(final String s) {
        if (this.Ux || this.rK || this.Hv) {
            this.LH();
        }
        if (this.ZY && this.s) {
            this.s = false;
        }
        this.ld.write("<!DOCTYPE");
        this.ld.write(s);
        this.ld.write(">");
    }
    
    @Override
    public void OK(final String s) {
        if (this.Ux || this.rK || this.Hv) {
            this.LH();
        }
        if (this.ZY && this.s) {
            this.s = false;
        }
        if (s.length() == 0) {
            throw new IllegalArgumentException(new StringBuffer().append("empty string is not allowed for ignorable whitespace").append(this.dN()).toString());
        }
        this.ld.write(s);
    }
    
    @Override
    public void KK() {
        if (!this.Hw && this.Ux) {
            this.LH();
        }
        this.ld.flush();
    }
    
    public void dN(final String s, final Writer writer) {
        final String s2 = "&quot;";
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '&') {
                if (i > n) {
                    writer.write(s.substring(n, i));
                }
                writer.write("&amp;");
                n = i + 1;
            }
            if (char1 == '<') {
                if (i > n) {
                    writer.write(s.substring(n, i));
                }
                writer.write("&lt;");
                n = i + 1;
            }
            else if (char1 == '\"') {
                if (i > n) {
                    writer.write(s.substring(n, i));
                }
                writer.write(s2);
                n = i + 1;
            }
            else if (char1 < ' ') {
                if (char1 != '\r' && char1 != '\n' && char1 != '\t') {
                    throw new IllegalStateException(new StringBuffer().append("character ").append(dN(char1)).append(" (").append(Integer.toString(char1)).append(") is not allowed in output").append(this.dN()).append(" (attr value=").append(LH(s)).append(")").toString());
                }
                if (i > n) {
                    writer.write(s.substring(n, i));
                }
                writer.write("&#");
                writer.write(Integer.toString(char1));
                writer.write(59);
                n = i + 1;
            }
        }
        if (n > 0) {
            writer.write(s.substring(n));
        }
        else {
            writer.write(s);
        }
    }
    
    protected void ld(final String s, final Writer writer) {
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == ']') {
                if (this.Hv) {
                    this.VX = true;
                }
                else {
                    this.Hv = true;
                }
            }
            else {
                if (char1 == '&') {
                    if (i > n) {
                        writer.write(s.substring(n, i));
                    }
                    writer.write("&amp;");
                    n = i + 1;
                }
                else if (char1 == '<') {
                    if (i > n) {
                        writer.write(s.substring(n, i));
                    }
                    writer.write("&lt;");
                    n = i + 1;
                }
                else if (this.VX && char1 == '>') {
                    if (i > n) {
                        writer.write(s.substring(n, i));
                    }
                    writer.write("&gt;");
                    n = i + 1;
                }
                else if (char1 < ' ' && char1 != '\t' && char1 != '\n') {
                    if (char1 != '\r') {
                        throw new IllegalStateException(new StringBuffer().append("character ").append(Integer.toString(char1)).append(" is not allowed in output").append(this.dN()).append(" (text value=").append(LH(s)).append(")").toString());
                    }
                }
                if (this.Hv) {
                    final boolean b = false;
                    this.Hv = b;
                    this.VX = b;
                }
            }
        }
        if (n > 0) {
            writer.write(s.substring(n));
        }
        else {
            writer.write(s);
        }
    }
    
    protected static final String LH(final String s) {
        if (s == null) {
            return "null";
        }
        final StringBuffer sb = new StringBuffer(s.length() + 16);
        sb.append("'");
        for (int i = 0; i < s.length(); ++i) {
            dN(sb, s.charAt(i));
        }
        sb.append("'");
        return sb.toString();
    }
    
    protected static final String dN(final char c) {
        final StringBuffer sb = new StringBuffer();
        dN(sb, c);
        return sb.toString();
    }
    
    private static void dN(final StringBuffer sb, final char c) {
        switch (c) {
            case '\b': {
                sb.append("\\b");
                break;
            }
            case '\t': {
                sb.append("\\t");
                break;
            }
            case '\n': {
                sb.append("\\n");
                break;
            }
            case '\f': {
                sb.append("\\f");
                break;
            }
            case '\r': {
                sb.append("\\r");
                break;
            }
            case '\"': {
                sb.append("\\\"");
                break;
            }
            case '\'': {
                sb.append("\\'");
                break;
            }
            case '\\': {
                sb.append("\\\\");
                break;
            }
            default: {
                if (c < ' ' || c > '~') {
                    final String string = new StringBuffer().append("0000").append(Integer.toString(c, 16)).toString();
                    sb.append(new StringBuffer().append("\\u").append(string.substring(string.length() - 4, string.length())).toString());
                    break;
                }
                sb.append(c);
                break;
            }
        }
    }
    
    static {
        ci = ((Runtime.getRuntime().freeMemory() > 1000000L) ? 8192 : 256);
        WC.bG = new String[32];
        for (int i = 0; i < WC.bG.length; ++i) {
            WC.bG[i] = new StringBuffer().append("n").append(i).toString().intern();
        }
    }
}
