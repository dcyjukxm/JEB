// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api;

import jebglobal.zd;
import jeb.api.ast.Class;
import jebglobal.Fu;
import jeb.api.ast.Method;
import jebglobal.ME;
import jebglobal.ym;
import jebglobal.gn;
import jebglobal.jt;
import jebglobal.ZL;
import jebglobal.WV;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import jebglobal.OD;
import jebglobal.AV;
import jebglobal.XV;
import jebglobal.yK;
import jebglobal.k;
import jebglobal.cn;
import jeb.api.ui.JebUI;
import jeb.api.dex.Dex;
import jebglobal.TM;
import jebglobal.ew;
import jebglobal.Rg;
import jebglobal.AR;
import jebglobal.yW;
import jebglobal.eI;

public class JebInstance
{
    private static final long LK = 844563159190538443L;
    private static final int VERSION = 4;
    private eI ctx;
    private boolean is_ui;
    private boolean running_on_ui;
    
    public JebInstance(final Object o) {
        if (!(o instanceof eI)) {
            throw new RuntimeException();
        }
        this.ctx = (eI)o;
        this.is_ui = (this.ctx instanceof yW);
        this.running_on_ui = false;
    }
    
    void exec(final Runnable runnable) {
        if (!this.is_ui || this.running_on_ui) {
            runnable.run();
        }
        else {
            this.running_on_ui = true;
            ((yW)this.ctx).Nh().syncExec(runnable);
            this.running_on_ui = false;
        }
    }
    
    Object execReturn(final RunnableEx runnableEx) {
        this.exec(runnableEx);
        return runnableEx.result;
    }
    
    private AR getDexParser() {
        return (AR)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.ZY();
            }
        });
    }
    
    private Rg getDecompiler() {
        return (Rg)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.s();
            }
        });
    }
    
    private ew getDatabase() {
        return (ew)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.Ux();
            }
        });
    }
    
    private TM getConfigurationManager$7647f81f() {
        return (TM)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.EO();
            }
        });
    }
    
    public int getApiVersion() {
        return 4;
    }
    
    public String getSoftwareVersion() {
        return eI.dN.toString();
    }
    
    public long getTotalMemory() {
        return Runtime.getRuntime().totalMemory();
    }
    
    public long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }
    
    public long getMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }
    
    public String getUserName() {
        return "              ";
    }
    
    public String getUserEmail() {
        return "                ";
    }
    
    public String getUserGroup() {
        return "                         ";
    }
    
    public String getBaseDirectory() {
        return eI.OK();
    }
    
    public String getProgramDirectory() {
        return eI.mS();
    }
    
    public String getPluginsDirectory() {
        return (String)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.LH();
            }
        });
    }
    
    public String getSignaturesDirectory() {
        return (String)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.KK();
            }
        });
    }
    
    public String[] getScriptArguments() {
        return (String[])this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.fa();
            }
        });
    }
    
    public boolean isFileLoaded() {
        return (boolean)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.rK();
            }
        });
    }
    
    public Dex getDex() {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return null;
        }
        return new Dex(dexParser);
    }
    
    public JebUI getUI() {
        if (!(this.ctx instanceof yW)) {
            return null;
        }
        return new JebUI(this.ctx);
    }
    
    public void setTimeout(final long n) {
        this.exec(new Runnable() {
            @Override
            public void run() {
                JebInstance.this.ctx.ld(n);
            }
        });
    }
    
    public void enableLogger(final boolean b) {
        cn.dN(b);
    }
    
    public void print(final String s) {
        cn.dN(s);
    }
    
    public boolean save() {
        return (boolean)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.Hv();
            }
        });
    }
    
    public boolean close() {
        return (boolean)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.VX();
            }
        });
    }
    
    public boolean load(final String s) {
        return (boolean)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.dN(s);
            }
        });
    }
    
    public void exit() {
        System.exit(0);
    }
    
    public String getInputPath() {
        return (String)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.ld();
            }
        });
    }
    
    public FileInformation getAnalyzedFileInformation() {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        final k qe = database.QE();
        if (qe == null) {
            return null;
        }
        return new FileInformation(qe);
    }
    
    public String getConfigurationPath() {
        return (String)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.QE();
            }
        });
    }
    
    public String getScriptPath() {
        return (String)this.execReturn(new RunnableEx() {
            @Override
            public void run() {
                this.result = JebInstance.this.ctx.wU();
            }
        });
    }
    
    public String getDatabasePath() {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        return database.dN();
    }
    
    public String getManifest() {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        final byte[] ld = database.ld("manifest.xml");
        if (ld == null) {
            return null;
        }
        return new String(ld);
    }
    
    public byte[] getCertificate() {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        final byte[] ld = database.ld("certificate.enc");
        if (ld == null) {
            return null;
        }
        return ld;
    }
    
    public byte[] getResources() {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        final byte[] ld = database.ld("zres.zip");
        if (ld == null) {
            return null;
        }
        return ld;
    }
    
    public byte[] getAssets() {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        final byte[] ld = database.ld("zassets.zip");
        if (ld == null) {
            return null;
        }
        return ld;
    }
    
    public boolean renameClass(final String s, final String s2) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return false;
        }
        final yK cb = dexParser.cb(s);
        return cb != null && TM.dN(this.getDatabase(), cb, s2);
    }
    
    public boolean renameField(final String s, final String s2) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return false;
        }
        final XV ld = dexParser.ld(s);
        return ld != null && TM.dN(this.getDatabase(), dexParser.fa(ld.dN()), s2);
    }
    
    public boolean renameMethod(final String s, final String s2) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return false;
        }
        final AV wu = dexParser.wU(s);
        return wu != null && TM.dN(this.getDatabase(), this.getDexParser(), dexParser.mS(wu.ld()), s2, true);
    }
    
    public boolean setGlobalComment(final String s) {
        return TM.dN(this.getDatabase(), new OD.uK(s, null));
    }
    
    public boolean setClassComment(final String s, final String s2) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return false;
        }
        final yK cb = dexParser.cb(s);
        return cb != null && TM.dN(this.getDatabase(), cb, new OD.uK(s2, null));
    }
    
    public boolean setFieldComment(final String s, final String s2) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return false;
        }
        final XV ld = dexParser.ld(s);
        return ld != null && TM.dN(this.getDatabase(), dexParser.fa(ld.dN()), new OD.uK(s2, null));
    }
    
    public boolean setMethodComment(final String s, final String s2) {
        return this.setInstructionComment(s, -1, s2);
    }
    
    public boolean setInstructionComment(final String s, final int n, final String s2) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return false;
        }
        final AV wu = dexParser.wU(s);
        return wu != null && TM.dN(this.getDatabase(), dexParser.mS(wu.ld()), n, new OD.uK(s2, null));
    }
    
    public String getGlobalComment() {
        final OD.uK dn = TM.dN(this.getDatabase());
        if (dn == null) {
            return null;
        }
        return dn.dN();
    }
    
    public String getClassComment(final String s) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return null;
        }
        final yK cb = dexParser.cb(s);
        if (cb == null) {
            return null;
        }
        final OD.uK dn = TM.dN(this.getDatabase(), cb);
        if (dn == null) {
            return null;
        }
        return dn.dN();
    }
    
    public String getFieldComment(final String s) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return null;
        }
        final XV ld = dexParser.ld(s);
        if (ld == null) {
            return null;
        }
        final OD.uK dn = TM.dN(this.getDatabase(), dexParser.fa(ld.dN()));
        if (dn == null) {
            return null;
        }
        return dn.dN();
    }
    
    public String getMethodComment(final String s) {
        return this.getInstructionComment(s, -1);
    }
    
    public String getInstructionComment(final String s, final int n) {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return null;
        }
        final AV wu = dexParser.wU(s);
        if (wu == null) {
            return null;
        }
        final OD.uK dn = TM.dN(this.getDatabase(), dexParser.mS(wu.ld()), n);
        if (dn == null) {
            return null;
        }
        return dn.dN();
    }
    
    public List getAllComments() {
        final AR dexParser = this.getDexParser();
        if (dexParser == null) {
            return null;
        }
        final ArrayList<Comment> list = new ArrayList<Comment>();
        for (final OD od : this.getDatabase().LH()) {
            Comment comment = null;
            switch (od.LH()) {
                case dN: {
                    comment = new Comment(null, -1, od.PF());
                    break;
                }
                case ld: {
                    comment = new Comment(dexParser.dN(od.KK(), true), -1, od.PF());
                    break;
                }
                case wU: {
                    comment = new Comment(dexParser.fa(od.KK()).fa(true), -1, od.PF());
                    break;
                }
                case QE: {
                    comment = new Comment(dexParser.mS(od.KK()).wU(true), -1, od.PF());
                    break;
                }
                case fa: {
                    comment = new Comment(dexParser.mS(od.KK()).wU(true), od.EO(), od.PF());
                    break;
                }
            }
            if (comment != null) {
                list.add(comment);
            }
        }
        return list;
    }
    
    public boolean setEngineOption(final EngineOption engineOption, final String s) {
        if (this.is_ui) {
            return false;
        }
        final TM configurationManager$7647f81f = this.getConfigurationManager$7647f81f();
        switch (engineOption) {
            case APK_PARSE_DEX_ONLY: {
                configurationManager$7647f81f.dN(WV.Ai, new Boolean(s));
                return true;
            }
            case APK_VERIFY: {
                configurationManager$7647f81f.dN(WV.uM, new Boolean(s));
                return true;
            }
            case DEX_CHECK_VERSION: {
                configurationManager$7647f81f.dN(WV.kq, new Boolean(s));
                return true;
            }
            case DEX_CHECK_HASHES: {
                configurationManager$7647f81f.dN(WV.ir, new Boolean(s));
                return true;
            }
            case DEX_CHECK_ACCESS_FLAGS: {
                configurationManager$7647f81f.dN(WV.rF, new Boolean(s));
                return true;
            }
            case DEX_PARSE_EXTENDED_OPCODES: {
                configurationManager$7647f81f.dN(WV.IL, new Boolean(s));
                return true;
            }
            case DECOMP_METHOD_TIMEOUT: {
                try {
                    configurationManager$7647f81f.dN(WV.Db, Integer.parseInt(s));
                }
                catch (NumberFormatException ex) {
                    return false;
                }
                return true;
            }
            case DECOMP_PARSE_TRYCATCHES: {
                configurationManager$7647f81f.dN(WV.sC, new Boolean(s));
                return true;
            }
            case DECOMP_OPT_AGGRESSIVE_SUBSTITUTIONS: {
                configurationManager$7647f81f.dN(WV.jp, new Boolean(s));
                return true;
            }
            case DECOMP_AST_OPT_STRING_CONCAT: {
                configurationManager$7647f81f.dN(WV.Qg, new Boolean(s));
                return true;
            }
            case DECOMP_AST_OPT_INLINE_SYNTH_ACCESSORS: {
                configurationManager$7647f81f.dN(WV.uB, new Boolean(s));
                return true;
            }
            case DECOMP_AST_OPT_CREATE_FOR_LOOPS: {
                configurationManager$7647f81f.dN(WV.dY, new Boolean(s));
                return true;
            }
            case DECOMP_AST_OPT_CREATE_VARARGS: {
                configurationManager$7647f81f.dN(WV.Rm, new Boolean(s));
                return true;
            }
            case DECOMP_AST_OPT_CREATE_MULTIDIMARRAYS: {
                configurationManager$7647f81f.dN(WV.nb, new Boolean(s));
                return true;
            }
            case DECOMP_AST_OPT_CREATE_CONDASSIGNS: {
                configurationManager$7647f81f.dN(WV.nI, new Boolean(s));
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public String decompileClass(final String s) {
        return this.decompile(s, true, true, null);
    }
    
    public String decompileMethod(final String s) {
        return this.decompile(s, false, true, null);
    }
    
    public String decompile(final String s, final boolean b) {
        return this.decompile(s, b, true, null);
    }
    
    public String decompile(final String s, final boolean b, final boolean b2, final List list) {
        try {
            final ZL zl = new ZL(null);
            if (!(boolean)this.execReturn(new RunnableEx() {
                @Override
                public void run() {
                    this.result = JebInstance.this.ctx.dN(zl);
                }
            })) {
                return null;
            }
            zl.wU(0);
            final Rg decompiler = this.getDecompiler();
            try {
                decompiler.dN(b2);
                if (b) {
                    decompiler.ld(s, zl);
                }
                else {
                    decompiler.dN(s, zl);
                }
            }
            finally {
                decompiler.dN(false);
            }
            zl.wU();
            final String zs = zl.zs();
            if (list != null) {
                for (final gn gn : zl.Hv()) {
                    list.add(new Mark(gn.dN(), gn.ld(), new Tag(gn.QE().dN(), gn.QE().ld())));
                }
            }
            return zs;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public String generateAssembly() {
        try {
            final AR dexParser = this.getDexParser();
            final ew database = this.getDatabase();
            final TM configurationManager$7647f81f = this.getConfigurationManager$7647f81f();
            final ym ym = new ym(dexParser);
            final ME me = new ME(null);
            me.dN(database);
            me.dN(configurationManager$7647f81f.ld(WV.mD));
            final boolean ld = configurationManager$7647f81f.ld(WV.IL);
            me.ld(ld ? 24 : 20);
            me.dN(configurationManager$7647f81f.ld(WV.kU) ? (ld ? 10 : 8) : 0);
            me.ld(configurationManager$7647f81f.ld(WV.LV));
            me.QE(configurationManager$7647f81f.ld(WV.uo));
            me.wU(configurationManager$7647f81f.ld(WV.H));
            me.fa(configurationManager$7647f81f.ld(WV.go));
            me.zs(configurationManager$7647f81f.ld(WV.BP));
            me.mS(configurationManager$7647f81f.ld(WV.bL));
            me.dN((char)configurationManager$7647f81f.QE(WV.xg), configurationManager$7647f81f.QE(WV.Dx));
            ym.dN(me);
            me.wU();
            return me.zs();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public Method getDecompiledMethodTree(final String s) {
        Method method = null;
        final Rg decompiler = this.getDecompiler();
        try {
            decompiler.dN(true);
            final Fu ld = decompiler.ld(s);
            if (ld != null) {
                method = new Method((Object)ld);
            }
        }
        finally {
            decompiler.dN(false);
        }
        return method;
    }
    
    public Class getDecompiledClassTree(final String s) {
        Class class1 = null;
        final Rg decompiler = this.getDecompiler();
        try {
            decompiler.dN(true);
            final zd dn = decompiler.dN(s);
            if (dn != null) {
                class1 = new Class((Object)dn);
            }
        }
        finally {
            decompiler.dN(false);
        }
        return class1;
    }
    
    public Object getGO() {
        final Rg decompiler = this.getDecompiler();
        if (decompiler == null) {
            return null;
        }
        return decompiler.dN();
    }
    
    public List listUserDataBlocks() {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        return database.zs();
    }
    
    public byte[] loadUserData(final int n) {
        final ew database = this.getDatabase();
        if (database == null) {
            return null;
        }
        return database.ld(n);
    }
    
    public boolean storeUserData(final int n, final byte[] array, final boolean b) {
        final ew database = this.getDatabase();
        return database != null && database.dN(n, array, b);
    }
    
    public boolean removeUserData(final int n) {
        final ew database = this.getDatabase();
        return database != null && database.QE(n);
    }
    
    abstract static class RunnableEx implements Runnable
    {
        Object result;
    }
}
