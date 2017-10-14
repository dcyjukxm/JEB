// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.FontData;
import java.util.Iterator;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FormLayout;
import java.util.ArrayList;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import java.util.List;

public final class yW extends eI
{
    private static final long LK = 844563159190538443L;
    private static yW Ux;
    private List ZY;
    private Display s;
    private HC Hv;
    private Font VX;
    private fc ci;
    private Shell bG;
    private ToolBar BQ;
    private Gq Ee;
    private SashForm De;
    private l rn;
    private Label LR;
    private yx Nh;
    private String XZ;
    private int nA;
    private boolean Ai;
    private Thread uM;
    private Thread kq;
    
    public static void dN(final String s, final String s2, final String s3, final String[] array) {
        if (yW.Ux != null) {
            throw new RuntimeException("JEB is already running on a different thread.");
        }
        if (yW.ld == EK.dN) {
            try {
                BA.launch(s, s2, s3, array);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error: please use the -XstartOnFirstThread flag in jeb_macos.sh");
            }
        }
        else {
            new yW(s, s2, s3, array).rn();
        }
        System.exit(0);
    }
    
    yW(final String s, final String s2, final String s3, final String[] array) {
        super(s, s2, s3, array);
        this.ZY = new ArrayList();
        this.nA = 5;
        yW.Ux = this;
        Display.setAppName("JEB");
        Display.setAppVersion(yW.dN.toString());
        this.s = new Display();
        if (System.getProperty("os.name").startsWith("Mac")) {
            new vv("JEB").hookApplicationMenu(this);
        }
        this.Hv = HC.dN();
        (this.bG = new Shell(this.s)).setText("JEB");
        this.bG.setImages(this.Hv.dN("icon-jeb.png", "icon-jeb-32.png", "icon-jeb-48.png", "icon-jeb-128.png"));
        if (this.rK.ld(WV.cb)) {
            this.bG.setMaximized(true);
        }
        else {
            final int qe = this.rK.QE(WV.KK);
            final int qe2 = this.rK.QE(WV.EO);
            final int n = (this.s.getClientArea().width - qe) / 2;
            final int n2 = (this.s.getClientArea().height - qe2) / 2;
            if (n >= 0 && n2 >= 0) {
                this.bG.setLocation(n, n2);
            }
            this.bG.setSize(qe, qe2);
        }
        this.uB();
        this.dY();
        this.bG.setLayout((Layout)new FormLayout());
        this.BQ = new ToolBar((Composite)this.bG, 0);
        this.Ee = new Gq(this, this.BQ, this.nA);
        for (int i = 0; i < this.nA; ++i) {
            final String dn = this.Hw.dN("last_opened" + i);
            if (dn == null) {
                break;
            }
            this.Ee.ld(dn);
        }
        this.bG.setMenuBar(this.Ee.QE());
        this.bG.addListener(21, (Listener)new AQ(this));
        this.BQ.pack();
        final FormData layoutData = new FormData();
        layoutData.left = new FormAttachment(0);
        layoutData.right = new FormAttachment(100);
        layoutData.top = new FormAttachment(0);
        layoutData.height = this.BQ.computeSize(-1, -1).y;
        this.BQ.setLayoutData((Object)layoutData);
        this.LR = new Label((Composite)this.bG, 2048);
        final FormData layoutData2 = new FormData();
        layoutData2.left = new FormAttachment(0, 0);
        layoutData2.right = new FormAttachment(100, 0);
        layoutData2.bottom = new FormAttachment(100, 0);
        layoutData2.height = this.LR.computeSize(-1, -1).y;
        this.LR.setLayoutData((Object)layoutData2);
        this.LR.setText("");
        this.De = new SashForm((Composite)this.bG, 512);
        final FormData layoutData3 = new FormData();
        layoutData3.left = new FormAttachment(0);
        layoutData3.right = new FormAttachment(100);
        layoutData3.top = new FormAttachment((Control)this.BQ);
        layoutData3.bottom = new FormAttachment((Control)this.LR);
        this.De.setLayoutData((Object)layoutData3);
        this.Nh = new yx((Composite)this.De, this);
        final DropTarget dropTarget = new DropTarget((Control)this.Nh, 7);
        dropTarget.setTransfer(new Transfer[] { FileTransfer.getInstance() });
        dropTarget.addDropListener((DropTargetListener)new sb(this));
        (this.rn = new l((Composite)this.De, this.VX)).dN(true);
        cn.dN(this.rn);
        int qe3 = this.rK.QE(WV.PF);
        if (qe3 < 0 || qe3 > 100) {
            qe3 = 18;
        }
        this.De.setWeights(new int[] { 100 - qe3, qe3 });
    }
    
    public void rn() {
        super.PF();
        final Object[] array = { SWT.MOD1, SWT.MOD2, SWT.MOD3, SWT.MOD4, 262144, 131072, 65536, 4194304 };
        if (this.rK.ld(WV.BQ)) {
            this.jp();
        }
        if (this.rK.ld(WV.ci)) {
            this.fa(false);
        }
        this.bU();
        this.s.asyncExec((Runnable)new vR(this));
        this.Rm();
        this.bG.open();
        while (!this.bG.isDisposed()) {
            boolean andDispatch = false;
            try {
                andDispatch = this.s.readAndDispatch();
            }
            catch (Exception ex) {
                this.dN(ex);
            }
            if (!andDispatch) {
                CB.dN();
                this.s.sleep();
            }
        }
        cn.ld(this.rn);
        this.s.dispose();
        yW.Ux = null;
        super.Hw();
    }
    
    private void Qg() {
        if (this.cb == null && this.PF == null) {
            return;
        }
        BusyIndicator.showWhile(this.Nh(), (Runnable)new AJ(this));
    }
    
    @Override
    public boolean rK() {
        return this.Nh.s();
    }
    
    @Override
    public ew Ux() {
        return this.Nh.ld();
    }
    
    @Override
    public AR ZY() {
        return this.Nh.QE();
    }
    
    @Override
    public Rg s() {
        return this.Nh.wU();
    }
    
    @Override
    public boolean Hv() {
        return this.ld(false);
    }
    
    @Override
    public boolean VX() {
        return this.dN(0);
    }
    
    @Override
    public boolean ld(final String s) {
        final Xa xa = new Xa(this.bG, this.VX, "End-User License Agreement", s);
        xa.dN(20);
        xa.ld(80);
        xa.dN(false);
        xa.ld(false);
        xa.ld("Accept");
        xa.QE("Decline");
        return xa.dN() != null;
    }
    
    @Override
    public String QE(final String s) {
        return new Qq(this.bG, this.VX, s).dN();
    }
    
    @Override
    public void ci() {
        final MessageBox messageBox = new MessageBox(this.bG, 196);
        messageBox.setText("Welcome");
        messageBox.setMessage(String.format("This is your first execution of JEB v%s.\n\nWould you like to see the latest changelist?", yW.dN.toString()));
        if (messageBox.open() == 64) {
            Vm.QE("http://www.android-decompiler.com/changelist.php");
        }
    }
    
    @Override
    public void bG() {
        final MessageBox messageBox = new MessageBox(this.bG, 72);
        messageBox.setText("Support has expired!");
        messageBox.setMessage(String.format("Support for your JEB license has expired.\nPlease renew your license if you wish to keep receiving software updates.", new Object[0]));
        messageBox.open();
    }
    
    @Override
    public void dN(final long n) {
        if (n != 0L) {
            this.s.syncExec((Runnable)new qF(this, n));
        }
    }
    
    public Shell LR() {
        return this.bG;
    }
    
    public void dN(final aH ah) {
        this.ZY.add(ah);
    }
    
    public void dN(final boolean b, final boolean b2) {
        final boolean ub = this.uB();
        final boolean dy = this.dY();
        if (!this.Nh.s()) {
            return;
        }
        final List zs = this.Nh.zs();
        if (ub) {
            for (final Control control : zs) {
                if (control instanceof lW) {
                    ((lW)control).setFont(this.VX);
                }
                if (control instanceof ly) {
                    ((ly)control).setFont(this.VX);
                }
            }
            this.rn.setFont(this.VX);
        }
        if (dy) {
            for (final Control control2 : zs) {
                if (control2 instanceof yn) {
                    ((yn)control2).dN(this.ci);
                }
            }
        }
        this.Nh.OK().dN(true);
        this.Nh.cb().dN(true);
    }
    
    private boolean uB() {
        final Font vx = this.VX;
        this.VX = null;
        try {
            this.VX = this.Hv.dN(new FontData(this.rK.dN(WV.rn)));
        }
        catch (Exception ex) {
            try {
                final int y = this.bG.getDisplay().getDPI().y;
                for (int i = 9; i <= 14; ++i) {
                    this.VX = this.Hv.dN("Courier New", i, 0);
                    final GC gc = new GC((Drawable)this.bG);
                    double n;
                    try {
                        gc.setFont(this.VX);
                        n = gc.getFontMetrics().getHeight();
                    }
                    finally {
                        gc.dispose();
                    }
                    if (n / y >= 0.15625) {
                        break;
                    }
                }
            }
            catch (Exception ex2) {
                this.VX = this.s.getSystemFont();
            }
            this.rK.dN(WV.rn, this.VX.getFontData()[0].toString());
        }
        return vx == null || !this.VX.getFontData()[0].toString().equals(vx.getFontData()[0].toString());
    }
    
    private boolean dY() {
        this.ci = new fc(this.bG.getDisplay(), this.rK.dN(WV.LR));
        return true;
    }
    
    public Display Nh() {
        return this.s;
    }
    
    public Font XZ() {
        return this.VX;
    }
    
    public fc nA() {
        return this.ci;
    }
    
    public Gq Ai() {
        return this.Ee;
    }
    
    public yx uM() {
        return this.Nh;
    }
    
    public lW kq() {
        return this.rn;
    }
    
    public boolean ir() {
        final FileDialog fileDialog = new FileDialog(this.bG, 4096);
        fileDialog.setFilterExtensions(new String[] { "*", "*.apk", "*.dex" });
        fileDialog.setFilterNames(new String[] { "All files (*)", "Android applications (*.apk)", "Dalvik files (*.dex)" });
        final String open = fileDialog.open();
        return open != null && this.dN(open);
    }
    
    @Override
    public boolean dN(String dn) {
        dn = this.Nh.dN(dn);
        if (dn == null) {
            return false;
        }
        this.bG.setText(String.format("%s - %s", "JEB", dn));
        this.Ee.ld(dn);
        int n = -1;
        final String[] array = new String[this.nA];
        for (int i = 0; i < this.nA; ++i) {
            array[i] = this.Hw.dN("last_opened" + i);
            if (array[i] == null) {
                n = i;
                break;
            }
        }
        if (n < 0) {
            n = this.nA - 1;
            for (int j = 0; j < n; ++j) {
                array[j] = array[j + 1];
            }
        }
        this.Hw.dN("last_opened" + n, new File(dn).getAbsolutePath());
        this.Hw.dN();
        final Iterator<aH> iterator = this.ZY.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(dn);
        }
        this.cb = dn;
        return true;
    }
    
    public boolean dN(final int n) {
        if (!this.Nh.s()) {
            return false;
        }
        if (!this.Nh.dN(n)) {
            return false;
        }
        this.zs("");
        this.bG.setText("JEB");
        final Iterator<aH> iterator = this.ZY.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN();
        }
        this.cb = null;
        return true;
    }
    
    public boolean ld(final boolean b) {
        return this.Nh.s() && this.Nh.Hv();
    }
    
    private void Rm() {
        if (this.kq == null) {
            (this.kq = new Thread(new Kk(this))).setDaemon(true);
            this.kq.start();
        }
    }
    
    private void nb() {
        if (TM.dN(this.kq)) {
            this.kq = null;
        }
    }
    
    public void fa(final String xz) {
        this.XZ = xz;
        this.QE(true);
    }
    
    public void QE(final boolean b) {
        if (!b || this.XZ == null) {
            final FileDialog fileDialog = new FileDialog(this.bG, 4096);
            fileDialog.setFilterExtensions(new String[] { "*", "*.py", "*.java" });
            fileDialog.setFilterNames(new String[] { "All files (*)", "Python scripts (*.py)", "Java scripts (*.java)" });
            this.XZ = fileDialog.open();
            if (this.XZ == null) {
                return;
            }
        }
        final GE ge = new GE(this.bG, this, "Script execution", "Press the button below to interrupt the execution...");
        final long de = this.De();
        final QA dn = this.dN(this.XZ, false, new dw(this, ge));
        if (dn == null) {
            cn.dN("An error occurred, the script could not be loaded");
        }
        else {
            if (ge.dN()) {
                cn.dN("The script execution was interrupted by the user");
            }
            while (!dn.ld()) {
                try {
                    Thread.sleep(200L);
                }
                catch (InterruptedException ex) {}
            }
            if (dn.dN() != QA.uK.QE) {
                cn.dN("An error occurred, the script could not be terminated");
            }
        }
        this.ld(de);
    }
    
    public void rF() {
        if (!this.Nh.s()) {
            return;
        }
        this.Nh.VX();
    }
    
    public void zs(final String text) {
        if (this.Ai) {
            return;
        }
        this.LR.setText(text);
    }
    
    public String IL() {
        return this.LR.getText();
    }
    
    public void wU(final boolean b) {
        this.Ai = !b;
    }
    
    public void ld(final int n) {
        if (n == 0) {
            Vm.QE("http://www.android-decompiler.com/manual.php");
        }
        else if (n == 1) {
            Vm.QE("http://www.android-decompiler.com/apidoc");
        }
        else if (n == 2) {
            Vm.QE("https://groups.google.com/forum/#!forum/jeb-decompiler");
        }
    }
    
    public void Db() {
        Vm.QE("http://www.android-decompiler.com/changelist.php");
    }
    
    public void sC() {
        final Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        final double n = runtime.freeMemory() / 1048576.0;
        final double n2 = runtime.totalMemory() / 1048576.0;
        final double n3 = n2 - n;
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.2f Mb reserved by the JVM.\n- Free: %.2f Mb\n- In use: %.2f Mb\n", n2, n, n3));
        final MessageBox messageBox = new MessageBox(this.bG, 34);
        messageBox.setText("Memory usage");
        messageBox.setMessage(sb.toString());
        messageBox.open();
    }
    
    void fa(final boolean b) {
        if (this.uM != null) {
            try {
                this.uM.join(500L);
                if (this.uM.isAlive()) {
                    return;
                }
            }
            catch (InterruptedException ex) {}
        }
        this.uM = TM.ld(new vA(this));
    }
    
    public void jp() {
        if (yW.mS.contains("OS X") && !yW.fa.startsWith("Apple")) {
            final MessageBox messageBox = new MessageBox(this.bG, 40);
            messageBox.setText("Unsupported Java");
            messageBox.setMessage("It seems you are not using the standard Apple Java distribution.\n\nUI issues have been reported with SWT and non-Apple Java distributions on Mac OS X.\n\n(This warning may be disabled in the Preferences dialog.)");
            messageBox.open();
        }
    }
    
    public void zs(final boolean b) {
        final Runtime runtime = Runtime.getRuntime();
        if (b) {
            runtime.gc();
        }
        final double n = runtime.freeMemory() / 1048576.0;
        final double n2 = runtime.totalMemory() / 1048576.0;
        final Object[] array = { n2, n, n2 - n };
    }
    
    public void mS(final String message) {
        final MessageBox messageBox = new MessageBox(this.bG, 34);
        messageBox.setText(rP.dN(new byte[] { 7, 10, 29, 22, 82, 5, 14, 5, 29, 84, 73, 23, 64, 79, 95 }, 2, 138));
        messageBox.setMessage(message);
        messageBox.open();
    }
    
    public void dN(final Exception ex) {
        final File file = new File(yW.EO, String.format("error-%s.txt", new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())));
        try {
            final StringBuilder sb = new StringBuilder("*** JEB ERROR LOG ***\n");
            sb.append(String.format("timestamp: %s\n", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z").format(new Date())));
            sb.append(String.format("version: %s\n", yW.dN.toString()));
            sb.append(String.format("userid: %d\n", 0));
            sb.append(String.format("build type: %d\n", uK.dN));
            sb.append(String.format("floating: %s\n", uK.wU()));
            sb.append("stacktrace:\n" + TM.dN(ex));
            TM.dN(file, TM.EO(sb.toString()), false);
        }
        catch (IOException ex2) {
            System.exit(1);
        }
        final StringBuilder sb2 = new StringBuilder("An unknown error occurred. ");
        sb2.append("You may be able to proceed, but it is recommended you save your work and restart JEB.\n\n");
        sb2.append(String.format("An error log has been created and dumped to: %s.\n", file.getAbsolutePath()));
        sb2.append(String.format("Thank you for sending this report to %s.", "support@android-decompiler.com"));
        final MessageBox messageBox = new MessageBox(this.bG, 33);
        messageBox.setText("Error");
        messageBox.setMessage(sb2.toString());
        messageBox.open();
    }
    
    public void QE(final int n) {
        this.mS(rP.dN(new byte[] { 7, 10, 19, 22, 31, 25, 14, 4, 17, 68, 8, 41, 72, 86, 80, 25, 90, 95, 77, 83, 65, 85, 66, 19, 79, 65, 33, 28, 14, 23, 76, 7, 69, 65, 11, 28, 95, 0, 0, 84, 12, 16, 83, 73, 15, 70, 18, 1, 9, 73, 5, 17, 8, 28, 14, 86, 36, 30, 31, 73, 29, 7, 73 }, 2, 203));
    }
    
    public boolean bU() {
        final File file = new File(this.LH());
        if (!file.isDirectory()) {
            cn.dN("Invalid plugin directory");
            return false;
        }
        for (final File file2 : file.listFiles()) {
            final String name = file2.getName();
            if (file2.isFile() && (name.endsWith(".py") || name.endsWith(".java"))) {
                if (!file2.canRead()) {
                    cn.dN(String.format("Cannot read plugin script: %s", name));
                }
                else {
                    cn.dN(String.format("Loading plugin: %s", name));
                    final WX dn = WX.dN(file2);
                    if (dn == null) {
                        cn.dN("Invalid plugin");
                    }
                    else {
                        if (dn.wU()) {
                            if (this.rK.ld(WV.rK)) {
                                this.fa(dn.dN());
                            }
                            else {
                                cn.dN("Automatic execution of plugins on startup is disabled");
                            }
                        }
                        this.Ee.dN(new pQ(this, dn), true);
                    }
                }
            }
        }
        return true;
    }
    
    static {
        yW.Ux = null;
    }
}
