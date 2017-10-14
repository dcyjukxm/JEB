// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.security.cert.CertificateFactory;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import jeb.Launcher;
import java.security.cert.CertificateEncodingException;
import java.util.Date;
import java.util.Calendar;
import java.io.IOException;
import java.io.File;

public abstract class eI implements Xp
{
    private static final long LK = 844563159190538443L;
    public static final wk dN;
    private static final wk Ux;
    protected static EK ld;
    protected static boolean QE;
    private static String ZY;
    protected static int wU;
    public static String fa;
    public static String zs;
    public static String mS;
    public static String OK;
    public static String LH;
    public static String KK;
    private static int s;
    protected static String EO;
    private static String Hv;
    private static String VX;
    private String ci;
    protected String cb;
    protected String PF;
    private String[] bG;
    protected ZF Hw;
    protected TM rK;
    private Vm BQ;
    private int Ee;
    private DU De;
    private long rn;
    private static final String LR;
    private static final String Nh;
    
    public eI(final String ci, final String cb, final String pf, final String[] bg) {
        this.ci = ci;
        this.cb = cb;
        this.PF = pf;
        this.bG = bg;
        if (this.ci == null) {
            this.ci = String.format("%s/%s", eI.Hv, "jeb-config.txt");
        }
        this.Hw = new ZF(this.ci);
        this.rK = new TM(this.Hw);
        this.BQ = new Vm(this.rK.ld());
        this.De = new DU(this.BQ);
    }
    
    public wk dN() {
        return eI.dN;
    }
    
    public String ld() {
        return this.cb;
    }
    
    public String QE() {
        return this.ci;
    }
    
    public String wU() {
        return this.PF;
    }
    
    public String[] fa() {
        return this.bG;
    }
    
    public static int zs() {
        return eI.s;
    }
    
    public static String mS() {
        return eI.Hv;
    }
    
    public static String OK() {
        return eI.VX;
    }
    
    public String LH() {
        return this.dN(WV.Ux);
    }
    
    public String KK() {
        return this.dN(WV.ZY);
    }
    
    private String dN(final WV wv) {
        String s = this.rK.dN(wv);
        if (s == null) {
            throw new RuntimeException();
        }
        if (!new File(s).isAbsolute()) {
            s = new File(eI.VX, s).getAbsolutePath();
        }
        return s;
    }
    
    public TM EO() {
        return this.rK;
    }
    
    public boolean cb() {
        return eI.ld.ld();
    }
    
    public void PF() {
        try {
            cn.dN(true, null, false);
        }
        catch (IOException ex) {
            throw new RuntimeException("Cannot setup logging system", ex);
        }
        cn.dN(String.format("%s v%s (%s) is starting...", "JEB", eI.dN.toString(), uK.QE()));
        cn.dN(String.format("Current directory: %s", eI.EO));
        cn.dN(String.format("Base directory: %s", eI.VX));
        cn.dN(String.format("Program directory: %s", eI.Hv));
        PX.dN[4] = 95;
        fO.dN(this.BQ);
        final wk dn = wk.dN(this.rK.dN(WV.zs));
        if (!this.rK.ld(WV.mS) || dn == null || dn.dN(eI.Ux) <= 0) {
            final String fa = uK.fa();
            if (fa == null) {
                throw new RuntimeException("The EULA cannot be opened, the program will terminate.");
            }
            if (!this.ld(fa)) {
                cn.dN(rP.dN(new byte[] { -27, 16, 25, 13, 97, 82, 23, 15, 15, 6, 23, 17, 1, 68, 66, 27, 89, 85, 6, 22, 23, 94, 12, 69, 29, 17, 29, 29, 7, 9 }, 1, 160));
                this.rK.dN(WV.mS, false);
                this.rK.dN();
                Ee();
            }
            this.rK.dN(WV.mS, true);
            this.rK.dN();
        }
        if (this.rK.QE(WV.wU) == 0) {
            this.rK.dN(WV.wU, eI.s);
        }
        this.rK.dN(WV.fa, eI.s);
        if (dn == null || dn.dN(eI.dN) < 0) {
            this.ci();
            this.rK.dN(WV.ci, true);
            if (this.rK.QE(WV.De) < 0) {
                this.rK.dN(WV.De, 0);
            }
        }
        else if (eI.QE) {
            this.rK.dN(WV.ci, true);
            this.rK.dN(WV.De, -1);
        }
        else if (this.rK.QE(WV.De) < 0) {
            this.rK.dN(WV.ci, true);
            eI.QE = true;
        }
        this.rK.dN(WV.zs, eI.dN.toString());
        this.rK.dN();
        final boolean b = this instanceof sS;
        final boolean wu = uK.wU();
        if (b && !wu) {
            throw new RuntimeException();
        }
        this.rn();
        TM.ld(new vn(this));
        fO.dN();
    }
    
    public void Hw() {
        cn.dN("Exiting.");
        try {
            cn.dN();
        }
        catch (IOException ex) {}
    }
    
    private void rn() {
        fO.ld();
        final oQ oq = new oQ(Vr.dN());
        final String dn = this.rK.dN(WV.OK);
        final int[] array = { 0 };
        if (!oq.dN(dn, array)) {
            fO.QE();
            final String qe = this.QE(oq.dN());
            fO.ld();
            if (!oq.dN(qe, array)) {
                cn.dN(rP.dN(new byte[] { 15, 6, 19, 28, 28, 26, 2, 72, 31, 69, 81, 67, 76, 82, 67, 86, 75, 29 }, 2, 13));
                Ee();
            }
            this.rK.dN(WV.OK, qe.trim());
            this.rK.dN();
        }
        uK.dN(array[0]);
        final int dn2 = uK.dN();
        if (dn2 <= 0 || eI.s >= dn2) {
            if (uK.ld()) {
                cn.dN(rP.dN(new byte[] { 7, 10, 29, 22, 82, 12, 31, 24, 29, 82, 77, 7, 7, 0, 114, 86, 87, 71, 77, 67, 70, 16, 68, 64, 12, 70, 32, 0, 65, 2, 76, 3, 85, 13, 2, 72, 15, 26, 28, 76, 0, 25, 26, 84, 4, 2, 70, 5, 5, 10, 4, 26, 22, 22, 0 }, 2, 212));
                Ee();
            }
            cn.dN(rP.dN(new byte[] { 16, 26, 0, 9, 29, 27, 19, 72, 28, 65, 91, 67, 76, 88, 65, 80, 75, 86, 72, 1, 18, 96, 93, 86, 77, 83, 42, 82, 19, 6, 2, 0, 87, 65, 23, 11, 90, 29, 82, 76, 0, 23, 22, 78, 18, 3, 70, 0, 10, 73, 24, 27, 16, 83, 89, 73, 50, 4, 76, 84, 29, 73, 12, 13, 17, 3, 0, 0, 0, 16, 0, 27, 0, 12, 10, 73, 99, 28, 31, 31, 6, 30, 6, 26, 17, 0, 93, 19, 77, 65, 69, 92, 74, 29 }, 2, 183));
            if (!this.rK.ld(WV.LH)) {
                this.bG();
                this.rK.dN(WV.LH, true);
                this.rK.dN();
            }
        }
        else if (this.rK.ld(WV.LH)) {
            this.rK.dN(WV.LH, false);
            this.rK.dN();
        }
    }
    
    public abstract boolean rK();
    
    public abstract ew Ux();
    
    public abstract AR ZY();
    
    public abstract Rg s();
    
    public abstract boolean dN(final String p0);
    
    public abstract boolean Hv();
    
    public abstract boolean VX();
    
    public abstract void ci();
    
    public abstract void bG();
    
    public abstract boolean ld(final String p0);
    
    public abstract String QE(final String p0);
    
    public abstract void dN(final long p0);
    
    public static String BQ() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Licensed to: %s (%s)\nEmail address: %s\nUser ID: %d\nBuild type: %d (%s)\nFloating: %s\n", "              ", "                         ", "                ", 0, uK.dN, uK.QE(), uK.wU()));
        sb.append(String.format("Valid for %d user%s\n", 1, ""));
        final int dn = uK.dN();
        if (dn > 0) {
            final Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(1000L * dn));
            sb.append(String.format("%s expires on %04d-%02d-%02d\n", uK.ld() ? "Demo" : "Support", instance.get(1), 1 + instance.get(2), instance.get(5)));
        }
        return sb.toString();
    }
    
    public static void Ee() {
        try {
            Class.forName(rP.dN(new byte[] { 30, 11, 23, 23, 79, 66, 13, 15, 9, 73, 125, 42, 10, 7, 17, 8 }, 1, 116)).getMethod(rP.dN(new byte[] { 115, 29, 17, 29 }, 1, 22), Integer.TYPE).invoke(null, 0);
        }
        catch (Exception ex) {
            throw new RuntimeException();
        }
    }
    
    public int dN(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: nop            
        //     1: nop            
        //     2: nop            
        //     3: nop            
        //     4: nop            
        //     5: nop            
        //     6: nop            
        //     7: nop            
        //     8: nop            
        //     9: nop            
        //    10: nop            
        //    11: nop            
        //    12: iconst_m1      
        //    13: ireturn        
        //    14: aload_0        
        //    15: aload_2        
        //    16: invokevirtual   jebglobal/Hl.dN:()I
        //    19: putfield        jebglobal/eI.Ee:I
        //    22: aload_0        
        //    23: getfield        jebglobal/eI.Ee:I
        //    26: iconst_1       
        //    27: if_icmpne       33
        //    30: nop            
        //    31: nop            
        //    32: nop            
        //    33: aload_2        
        //    34: invokevirtual   jebglobal/Hl.ld:()Ljebglobal/Hl$uK;
        //    37: invokevirtual   jebglobal/Hl$uK.dN:()Ljebglobal/wk;
        //    40: getstatic       jebglobal/eI.dN:Ljebglobal/wk;
        //    43: invokevirtual   jebglobal/wk.dN:(Ljebglobal/wk;)I
        //    46: ifgt            51
        //    49: iconst_0       
        //    50: ireturn        
        //    51: iload_1        
        //    52: ifne            57
        //    55: iconst_1       
        //    56: ireturn        
        //    57: new             Ljava/io/File;
        //    60: dup            
        //    61: getstatic       jebglobal/eI.VX:Ljava/lang/String;
        //    64: getstatic       jebglobal/eI.LR:Ljava/lang/String;
        //    67: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    70: astore          4
        //    72: aload           4
        //    74: invokevirtual   java/io/File.exists:()Z
        //    77: ifeq            109
        //    80: aload           4
        //    82: invokestatic    jebglobal/TM.QE:(Ljava/io/File;)[B
        //    85: astore_3       
        //    86: aload_2        
        //    87: invokevirtual   jebglobal/Hl.ld:()Ljebglobal/Hl$uK;
        //    90: invokevirtual   jebglobal/Hl$uK.QE:()[B
        //    93: aload_3        
        //    94: invokestatic    jebglobal/TM.wU:([B)[B
        //    97: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   100: ifeq            105
        //   103: iconst_2       
        //   104: ireturn        
        //   105: goto            109
        //   108: pop            
        //   109: bipush          43
        //   111: newarray        B
        //   113: dup            
        //   114: iconst_0       
        //   115: bipush          7
        //   117: bastore        
        //   118: dup            
        //   119: iconst_1       
        //   120: iconst_0       
        //   121: bastore        
        //   122: dup            
        //   123: iconst_2       
        //   124: bipush          7
        //   126: bastore        
        //   127: dup            
        //   128: iconst_3       
        //   129: bipush          23
        //   131: bastore        
        //   132: dup            
        //   133: iconst_4       
        //   134: bipush          30
        //   136: bastore        
        //   137: dup            
        //   138: iconst_5       
        //   139: bipush          6
        //   141: bastore        
        //   142: dup            
        //   143: bipush          6
        //   145: bipush          6
        //   147: bastore        
        //   148: dup            
        //   149: bipush          7
        //   151: bipush          12
        //   153: bastore        
        //   154: dup            
        //   155: bipush          8
        //   157: bipush          29
        //   159: bastore        
        //   160: dup            
        //   161: bipush          9
        //   163: bipush          78
        //   165: bastore        
        //   166: dup            
        //   167: bipush          10
        //   169: bipush          79
        //   171: bastore        
        //   172: dup            
        //   173: bipush          11
        //   175: bipush          67
        //   177: bastore        
        //   178: dup            
        //   179: bipush          12
        //   181: bipush          93
        //   183: bastore        
        //   184: dup            
        //   185: bipush          13
        //   187: bipush          72
        //   189: bastore        
        //   190: dup            
        //   191: bipush          14
        //   193: bipush          84
        //   195: bastore        
        //   196: dup            
        //   197: bipush          15
        //   199: bipush          25
        //   201: bastore        
        //   202: dup            
        //   203: bipush          16
        //   205: bipush          76
        //   207: bastore        
        //   208: dup            
        //   209: bipush          17
        //   211: bipush          67
        //   213: bastore        
        //   214: dup            
        //   215: bipush          18
        //   217: bipush          72
        //   219: bastore        
        //   220: dup            
        //   221: bipush          19
        //   223: bipush          65
        //   225: bastore        
        //   226: dup            
        //   227: bipush          20
        //   229: bipush          70
        //   231: bastore        
        //   232: dup            
        //   233: bipush          21
        //   235: bipush          85
        //   237: bastore        
        //   238: dup            
        //   239: bipush          22
        //   241: bipush          17
        //   243: bastore        
        //   244: dup            
        //   245: bipush          23
        //   247: bipush          27
        //   249: bastore        
        //   250: dup            
        //   251: bipush          24
        //   253: bipush          9
        //   255: bastore        
        //   256: dup            
        //   257: bipush          25
        //   259: bipush          83
        //   261: bastore        
        //   262: dup            
        //   263: bipush          26
        //   265: bipush          102
        //   267: bastore        
        //   268: dup            
        //   269: bipush          27
        //   271: bipush          94
        //   273: bastore        
        //   274: dup            
        //   275: bipush          28
        //   277: bipush          65
        //   279: bastore        
        //   280: dup            
        //   281: bipush          29
        //   283: bipush          19
        //   285: bastore        
        //   286: dup            
        //   287: bipush          30
        //   289: iconst_0       
        //   290: bastore        
        //   291: dup            
        //   292: bipush          31
        //   294: iconst_0       
        //   295: bastore        
        //   296: dup            
        //   297: bipush          32
        //   299: bipush          65
        //   301: bastore        
        //   302: dup            
        //   303: bipush          33
        //   305: bipush          18
        //   307: bastore        
        //   308: dup            
        //   309: bipush          34
        //   311: bipush          11
        //   313: bastore        
        //   314: dup            
        //   315: bipush          35
        //   317: bipush          68
        //   319: bastore        
        //   320: dup            
        //   321: bipush          36
        //   323: bipush          88
        //   325: bastore        
        //   326: dup            
        //   327: bipush          37
        //   329: bipush          14
        //   331: bastore        
        //   332: dup            
        //   333: bipush          38
        //   335: bipush          27
        //   337: bastore        
        //   338: dup            
        //   339: bipush          39
        //   341: bipush          84
        //   343: bastore        
        //   344: dup            
        //   345: bipush          40
        //   347: bipush          71
        //   349: bastore        
        //   350: dup            
        //   351: bipush          41
        //   353: bipush          90
        //   355: bastore        
        //   356: dup            
        //   357: bipush          42
        //   359: bipush          93
        //   361: bastore        
        //   362: iconst_2       
        //   363: sipush          189
        //   366: invokestatic    jebglobal/rP.dN:([BII)Ljava/lang/String;
        //   369: iconst_1       
        //   370: anewarray       Ljava/lang/Object;
        //   373: dup            
        //   374: iconst_0       
        //   375: aload_2        
        //   376: invokevirtual   jebglobal/Hl.ld:()Ljebglobal/Hl$uK;
        //   379: invokevirtual   jebglobal/Hl$uK.dN:()Ljebglobal/wk;
        //   382: aastore        
        //   383: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   386: invokestatic    jebglobal/cn.dN:(Ljava/lang/String;)V
        //   389: aload_0        
        //   390: getfield        jebglobal/eI.BQ:Ljebglobal/Vm;
        //   393: aload_2        
        //   394: invokevirtual   jebglobal/Hl.ld:()Ljebglobal/Hl$uK;
        //   397: invokevirtual   jebglobal/Hl$uK.ld:()Ljava/lang/String;
        //   400: invokevirtual   jebglobal/Vm.ld:(Ljava/lang/String;)[B
        //   403: astore_3       
        //   404: aload_3        
        //   405: ifnonnull       411
        //   408: bipush          -2
        //   410: ireturn        
        //   411: aload_2        
        //   412: invokevirtual   jebglobal/Hl.ld:()Ljebglobal/Hl$uK;
        //   415: invokevirtual   jebglobal/Hl$uK.QE:()[B
        //   418: aload_3        
        //   419: invokestatic    jebglobal/TM.wU:([B)[B
        //   422: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   425: ifne            431
        //   428: bipush          -2
        //   430: ireturn        
        //   431: aload           4
        //   433: aload_3        
        //   434: iconst_0       
        //   435: invokestatic    jebglobal/TM.dN:(Ljava/io/File;[BZ)V
        //   438: aload_2        
        //   439: invokevirtual   jebglobal/Hl.ld:()Ljebglobal/Hl$uK;
        //   442: invokevirtual   jebglobal/Hl$uK.wU:()Ljava/lang/String;
        //   445: astore          5
        //   447: aload           5
        //   449: ifnull          482
        //   452: aload           5
        //   454: invokevirtual   java/lang/String.length:()I
        //   457: ifle            482
        //   460: new             Ljava/io/File;
        //   463: dup            
        //   464: getstatic       jebglobal/eI.VX:Ljava/lang/String;
        //   467: getstatic       jebglobal/eI.Nh:Ljava/lang/String;
        //   470: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   473: aload           5
        //   475: invokestatic    jebglobal/TM.EO:(Ljava/lang/String;)[B
        //   478: iconst_0       
        //   479: invokestatic    jebglobal/TM.dN:(Ljava/io/File;[BZ)V
        //   482: goto            489
        //   485: pop            
        //   486: bipush          -2
        //   488: ireturn        
        //   489: iconst_2       
        //   490: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  80     104    108    109    Ljava/io/IOException;
        //  431    482    485    489    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ew dN(final String s, final boolean b) {
        final File file = new File(s);
        if (!file.isFile()) {
            return null;
        }
        final ew ew = new ew();
        ew.dN(this.rK.ld(WV.Ee));
        ew.dN(s);
        ew.dN(eI.dN.dN(), eI.dN.ld(), eI.dN.QE());
        ew.dN(1862412833L, "              ", "                         ");
        for (int i = 0; i < eI.wU; ++i) {
            final char char1 = eI.ZY.charAt(i);
            if ((i == 0 && char1 != 'P') || (i == 1 && char1 != 'K')) {
                cn.dN("Invalid PK header");
            }
        }
        byte[] array = null;
        final int kk = TM.KK(s);
        Label_0638: {
            if (kk == 67324752) {
                try {
                    final boolean ld = this.rK.ld(WV.uM);
                    final vd vd = new vd(s, ld);
                    if (!this.rK.ld(WV.Ai)) {
                        final File ok = TM.OK(file.getName() + "-EXTRACTED");
                        final String path = ok.getPath();
                        if (!vd.dN(ok)) {
                            cn.dN("Not all resources were processed");
                        }
                        final File file2 = new File(ok, "AndroidManifest.xml");
                        if (file2.exists()) {
                            try {
                                ew.dN("manifest.xml", TM.QE(file2));
                            }
                            catch (IOException ex2) {
                                cn.dN("Cannot process the manifest");
                            }
                        }
                        final String string = path + "/res";
                        if (new File(string).exists()) {
                            final String string2 = path + "/zres.zip";
                            try {
                                TM.dN(string, string2);
                                ew.dN("zres.zip", TM.LH(string2));
                            }
                            catch (IOException ex3) {
                                cn.dN("Cannot process the resources");
                            }
                        }
                        final String string3 = path + "/assets";
                        if (new File(string3).exists()) {
                            final String string4 = path + "/zassets.zip";
                            try {
                                TM.dN(string3, string4);
                                ew.dN("zassets.zip", TM.LH(string4));
                            }
                            catch (IOException ex4) {
                                cn.dN("Cannot process the assets");
                            }
                        }
                        TM.mS(path);
                        Certificate[] array2;
                        if (ld) {
                            array2 = vd.dN();
                        }
                        else {
                            array2 = this.dN(vd);
                        }
                        if (array2 != null && array2.length >= 1) {
                            try {
                                ew.dN("certificate.enc", array2[0].getEncoded());
                            }
                            catch (CertificateEncodingException ex5) {
                                cn.dN("Cannot process the certificate");
                            }
                        }
                    }
                    if (vd.dN("classes.dex")) {
                        array = vd.ld("classes.dex");
                    }
                    else {
                        cn.dN("Resource-only APK, using a placeholder DEX file");
                        array = Launcher.QE("Placeholder.dex");
                    }
                    break Label_0638;
                }
                catch (Exception ex) {
                    cn.dN(String.format("Corrupt APK file: %s", ex));
                    return null;
                }
            }
            if (kk == 175662436) {
                try {
                    array = TM.LH(s);
                }
                catch (IOException ex6) {
                    cn.dN("Cannot read DEX file");
                }
            }
            else {
                cn.dN("Invalid file");
            }
        }
        if (array == null) {
            cn.dN("Error, no DEX file");
            return null;
        }
        ew.dN("classes.dex", array);
        int n = 0;
        File file3;
        do {
            file3 = new File(s + ((n == 0) ? "" : ("." + n)) + ".jdb");
            ++n;
        } while (!b && file3.exists());
        ew.dN(file3);
        return ew;
    }
    
    private Certificate[] dN(final vd vd) {
        String dn = null;
        for (final AM.uK uk : vd.ld()) {
            final String upperCase = uk.dN().toUpperCase();
            if (upperCase != null && upperCase.startsWith("META-INF/") && (upperCase.endsWith(".RSA") || upperCase.endsWith(".DSA"))) {
                dn = uk.dN();
                break;
            }
        }
        if (dn == null) {
            cn.dN("Could not find certificates file");
            return null;
        }
        final byte[] ld = vd.ld(dn);
        if (ld == null) {
            (new Object[1])[0] = dn;
            return null;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ld);
        Collection<? extends Certificate> generateCertificates;
        try {
            generateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(byteArrayInputStream);
        }
        catch (CertificateException ex) {
            cn.dN(String.format("Could not parse certificate data: %s", ex.toString()));
            return null;
        }
        final Certificate[] array = new Certificate[generateCertificates.size()];
        int n = 0;
        final Iterator<? extends Certificate> iterator2 = generateCertificates.iterator();
        while (iterator2.hasNext()) {
            array[n++] = (Certificate)iterator2.next();
        }
        return array;
    }
    
    public ew wU(final String s) {
        try {
            final ew ew = new ew(s);
            ew.dN(this.rK.ld(WV.Ee));
            ew.dN(1862412833L, "              ", "                         ");
            return ew;
        }
        catch (Exception ex) {
            cn.dN("Invalid JDB file, or your version of JEB is older than the one used to create this JDB.");
            return null;
        }
    }
    
    public File dN(final ew ew) {
        final byte[] ld = ew.ld("zres.zip");
        if (ld == null) {
            return null;
        }
        File ok;
        try {
            final File tempFile = File.createTempFile("zres.zip", null);
            TM.dN(tempFile, ld, false);
            ok = TM.OK(tempFile.getName() + "-RESOURCES");
            TM.dN(tempFile, ok);
            TM.ld(ok);
            tempFile.delete();
        }
        catch (IOException ex) {
            return null;
        }
        return ok;
    }
    
    public QA dN(final String s, final boolean b, final Runnable runnable) {
        final Jz jz = new Jz(this);
        if (!jz.dN(s)) {
            return null;
        }
        final QA qa = new QA(TM.ld(new rC(this, s, jz)), true, this, null, runnable);
        qa.dN(b);
        return qa;
    }
    
    @Override
    public synchronized long De() {
        return this.rn;
    }
    
    @Override
    public synchronized void ld(final long rn) {
        this.rn = rn;
    }
    
    public void dN(final ew ew, final AR ar) {
        final List ms = ew.mS();
        if (ms != null) {
            for (final u u : ms) {
                if (!u.LH()) {
                    continue;
                }
                final int eo = u.EO();
                final String hw = u.Hw();
                switch (eI$1.dN[u.KK().ordinal()]) {
                    case 1: {
                        ar.QE(eo).dN(hw);
                        continue;
                    }
                    case 2: {
                        ar.mS(eo).ld(hw);
                        continue;
                    }
                    case 3: {
                        ar.fa(eo).dN(hw);
                        continue;
                    }
                }
            }
        }
        ew.OK();
        ew.KK();
    }
    
    public boolean dN(final ZL zl) {
        final Rg s = this.s();
        final TM eo = this.EO();
        if (s == null || eo == null) {
            return false;
        }
        if (zl != null) {
            zl.dN(this.Ux());
            zl.wU(eo.QE(WV.qL));
            zl.dN(eo.ld(WV.kz));
            zl.ld(eo.ld(WV.lx));
            zl.QE(eo.ld(WV.cM));
            eo.ld(WV.Vq);
            zl.wU(eo.ld(WV.VV));
            zl.fa(eo.ld(WV.LK));
            zl.zs(eo.ld(WV.Mq));
            zl.mS(eo.ld(WV.FY));
        }
        s.dN(eo.QE(WV.Db) * 1000);
        s.ld(eo.ld(WV.sC));
        s.QE(eo.ld(WV.jp));
        s.wU(eo.ld(WV.bU));
        s.fa(eo.ld(WV.Qg));
        s.zs(eo.ld(WV.uB));
        s.mS(eo.ld(WV.dY));
        s.OK(eo.ld(WV.Rm));
        s.LH(eo.ld(WV.nb));
        s.KK(eo.ld(WV.nI));
        return true;
    }
    
    static {
        dN = new wk(1, 5, 201404100);
        Ux = new wk(1, 5, 201404070);
        eI.QE = false;
        eI.ZY = "PK";
        eI.wU = 2;
        eI.s = (int)(System.currentTimeMillis() / 1000L);
        eI.EO = System.getProperty(rP.dN(new byte[] { 54, 28, 21, 11, 92, 13, 14, 26 }, 2, 11));
        if (eI.EO == null) {
            throw new RuntimeException("Could not determine the current directory");
        }
        try {
            final File file = new File(eI.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            if (file.isFile()) {
                eI.Hv = file.getParent();
            }
            else if (file.isDirectory()) {
                eI.Hv = file.getAbsolutePath();
            }
            eI.VX = new File(eI.Hv).getParent();
            eI.QE = !lS.dN(new Class[] { eI.class, Dc.class });
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (eI.Hv == null) {
            throw new RuntimeException("Could not determine the program directory");
        }
        if (eI.VX == null) {
            throw new RuntimeException("Could not determine the base directory");
        }
        eI.ld = EK.dN();
        Vr.dN();
        eI.fa = System.getProperty(rP.dN(new byte[] { 41, 14, 6, 24, 92, 31, 2, 6, 16, 79, 90 }, 2, 172), "");
        eI.zs = System.getProperty(rP.dN(new byte[] { 110, 11, 23, 23, 79, 88, 19, 23, 1, 26, 6, 1 }, 1, 4), "");
        eI.mS = System.getProperty(rP.dN(new byte[] { 31, 28, 93, 64, 15, 12, 8 }, 1, 112), "");
        eI.OK = System.getProperty(rP.dN(new byte[] { 44, 28, 94, 24, 0, 10, 15 }, 2, 169), "");
        eI.LH = System.getProperty(rP.dN(new byte[] { 118, 28, 93, 88, 19, 23, 1, 26, 6, 1 }, 1, 25), "");
        eI.KK = System.getProperty(rP.dN(new byte[] { 54, 28, 21, 11, 92, 7, 6, 5, 17 }, 2, 186), "");
        LR = rP.dN(new byte[] { 54, 31, 20, 24, 6, 12, 73, 18, 29, 80 }, 2, 197);
        Nh = rP.dN(new byte[] { 54, 31, 20, 24, 6, 12, 73, 24, 3, 68 }, 2, 191);
    }
}
