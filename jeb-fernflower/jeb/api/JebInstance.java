package jeb.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jeb.api.Comment;
import jeb.api.EngineOption;
import jeb.api.FileInformation;
import jeb.api.Mark;
import jeb.api.Tag;
import jeb.api.ast.Class;
import jeb.api.ast.Method;
import jeb.api.dex.Dex;
import jeb.api.ui.JebUI;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Fu;
import jebglobal.ME;
import jebglobal.OD;
import jebglobal.Rg;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.XV;
import jebglobal.ZL;
import jebglobal.cn;
import jebglobal.eI;
import jebglobal.ew;
import jebglobal.gE;
import jebglobal.gn;
import jebglobal.hO;
import jebglobal.jt;
import jebglobal.k;
import jebglobal.yK;
import jebglobal.yW;
import jebglobal.ym;
import jebglobal.zd;

public class JebInstance {
   private static final long LK = 844563159190538443L;
   private static final int VERSION = 4;
   private eI ctx;
   private boolean is_ui;
   private boolean running_on_ui;

   public JebInstance(Object var1) {
      if(!(var1 instanceof eI)) {
         throw new RuntimeException();
      } else {
         this.ctx = (eI)var1;
         this.is_ui = this.ctx instanceof yW;
         this.running_on_ui = false;
      }
   }

   void exec(Runnable var1) {
      if(this.is_ui && !this.running_on_ui) {
         this.running_on_ui = true;
         ((yW)this.ctx).Nh().syncExec(var1);
         this.running_on_ui = false;
      } else {
         var1.run();
      }

   }

   Object execReturn(JebInstance.RunnableEx var1) {
      this.exec(var1);
      return var1.result;
   }

   private AR getDexParser() {
      return (AR)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.ZY();
         }
      });
   }

   private Rg getDecompiler() {
      return (Rg)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.s();
         }
      });
   }

   private ew getDatabase() {
      return (ew)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.Ux();
         }
      });
   }

   private TM getConfigurationManager$7647f81f() {
      return (TM)this.execReturn(new JebInstance.RunnableEx() {
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
      return (String)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.LH();
         }
      });
   }

   public String getSignaturesDirectory() {
      return (String)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.KK();
         }
      });
   }

   public String[] getScriptArguments() {
      return (String[])((String[])this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.fa();
         }
      }));
   }

   public boolean isFileLoaded() {
      return ((Boolean)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = Boolean.valueOf(JebInstance.this.ctx.rK());
         }
      })).booleanValue();
   }

   public Dex getDex() {
      AR var1 = this.getDexParser();
      return var1 == null?null:new Dex(var1);
   }

   public JebUI getUI() {
      return !(this.ctx instanceof yW)?null:new JebUI((yW)this.ctx);
   }

   public void setTimeout(final long var1) {
      this.exec(new Runnable() {
         public void run() {
            JebInstance.this.ctx.ld(var1);
         }
      });
   }

   public void enableLogger(boolean var1) {
      cn.dN(var1);
   }

   public void print(String var1) {
      cn.dN(var1);
   }

   public boolean save() {
      return ((Boolean)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = Boolean.valueOf(JebInstance.this.ctx.Hv());
         }
      })).booleanValue();
   }

   public boolean close() {
      return ((Boolean)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = Boolean.valueOf(JebInstance.this.ctx.VX());
         }
      })).booleanValue();
   }

   public boolean load(final String var1) {
      return ((Boolean)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = Boolean.valueOf(JebInstance.this.ctx.dN(var1));
         }
      })).booleanValue();
   }

   public void exit() {
      System.exit(0);
   }

   public String getInputPath() {
      return (String)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.ld();
         }
      });
   }

   public FileInformation getAnalyzedFileInformation() {
      ew var1 = this.getDatabase();
      if(var1 == null) {
         return null;
      } else {
         k var2 = var1.QE();
         if(var2 == null) {
            return null;
         } else {
            FileInformation var3 = new FileInformation(var2);
            return var3;
         }
      }
   }

   public String getConfigurationPath() {
      return (String)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.QE();
         }
      });
   }

   public String getScriptPath() {
      return (String)this.execReturn(new JebInstance.RunnableEx() {
         public void run() {
            this.result = JebInstance.this.ctx.wU();
         }
      });
   }

   public String getDatabasePath() {
      ew var1 = this.getDatabase();
      return var1 == null?null:var1.dN();
   }

   public String getManifest() {
      ew var1 = this.getDatabase();
      if(var1 == null) {
         return null;
      } else {
         byte[] var2 = var1.ld("manifest.xml");
         return var2 == null?null:new String(var2);
      }
   }

   public byte[] getCertificate() {
      ew var1 = this.getDatabase();
      if(var1 == null) {
         return null;
      } else {
         byte[] var2 = var1.ld("certificate.enc");
         return var2 == null?null:var2;
      }
   }

   public byte[] getResources() {
      ew var1 = this.getDatabase();
      if(var1 == null) {
         return null;
      } else {
         byte[] var2 = var1.ld("zres.zip");
         return var2 == null?null:var2;
      }
   }

   public byte[] getAssets() {
      ew var1 = this.getDatabase();
      if(var1 == null) {
         return null;
      } else {
         byte[] var2 = var1.ld("zassets.zip");
         return var2 == null?null:var2;
      }
   }

   public boolean renameClass(String var1, String var2) {
      AR var3 = this.getDexParser();
      if(var3 == null) {
         return false;
      } else {
         yK var4 = var3.cb(var1);
         return var4 == null?false:TM.dN(this.getDatabase(), var4, var2);
      }
   }

   public boolean renameField(String var1, String var2) {
      AR var3 = this.getDexParser();
      if(var3 == null) {
         return false;
      } else {
         XV var4 = var3.ld(var1);
         if(var4 == null) {
            return false;
         } else {
            gE var5 = var3.fa(var4.dN());
            return TM.dN(this.getDatabase(), var5, var2);
         }
      }
   }

   public boolean renameMethod(String var1, String var2) {
      AR var3 = this.getDexParser();
      if(var3 == null) {
         return false;
      } else {
         AV var4 = var3.wU(var1);
         if(var4 == null) {
            return false;
         } else {
            hO var5 = var3.mS(var4.ld());
            return TM.dN(this.getDatabase(), this.getDexParser(), var5, var2, true);
         }
      }
   }

   public boolean setGlobalComment(String var1) {
      return TM.dN(this.getDatabase(), new OD.uK(var1, (byte[])null));
   }

   public boolean setClassComment(String var1, String var2) {
      AR var3 = this.getDexParser();
      if(var3 == null) {
         return false;
      } else {
         yK var4 = var3.cb(var1);
         return var4 == null?false:TM.dN(this.getDatabase(), var4, new OD.uK(var2, (byte[])null));
      }
   }

   public boolean setFieldComment(String var1, String var2) {
      AR var3 = this.getDexParser();
      if(var3 == null) {
         return false;
      } else {
         XV var4 = var3.ld(var1);
         if(var4 == null) {
            return false;
         } else {
            gE var5 = var3.fa(var4.dN());
            return TM.dN(this.getDatabase(), var5, new OD.uK(var2, (byte[])null));
         }
      }
   }

   public boolean setMethodComment(String var1, String var2) {
      return this.setInstructionComment(var1, -1, var2);
   }

   public boolean setInstructionComment(String var1, int var2, String var3) {
      AR var4 = this.getDexParser();
      if(var4 == null) {
         return false;
      } else {
         AV var5 = var4.wU(var1);
         if(var5 == null) {
            return false;
         } else {
            hO var6 = var4.mS(var5.ld());
            return TM.dN(this.getDatabase(), var6, var2, new OD.uK(var3, (byte[])null));
         }
      }
   }

   public String getGlobalComment() {
      OD.uK var1 = TM.dN(this.getDatabase());
      return var1 == null?null:var1.dN();
   }

   public String getClassComment(String var1) {
      AR var2 = this.getDexParser();
      if(var2 == null) {
         return null;
      } else {
         yK var3 = var2.cb(var1);
         if(var3 == null) {
            return null;
         } else {
            OD.uK var4 = TM.dN(this.getDatabase(), var3);
            return var4 == null?null:var4.dN();
         }
      }
   }

   public String getFieldComment(String var1) {
      AR var2 = this.getDexParser();
      if(var2 == null) {
         return null;
      } else {
         XV var3 = var2.ld(var1);
         if(var3 == null) {
            return null;
         } else {
            gE var4 = var2.fa(var3.dN());
            OD.uK var5 = TM.dN(this.getDatabase(), var4);
            return var5 == null?null:var5.dN();
         }
      }
   }

   public String getMethodComment(String var1) {
      return this.getInstructionComment(var1, -1);
   }

   public String getInstructionComment(String var1, int var2) {
      AR var3 = this.getDexParser();
      if(var3 == null) {
         return null;
      } else {
         AV var4 = var3.wU(var1);
         if(var4 == null) {
            return null;
         } else {
            hO var5 = var3.mS(var4.ld());
            OD.uK var6 = TM.dN(this.getDatabase(), var5, var2);
            return var6 == null?null:var6.dN();
         }
      }
   }

   public List getAllComments() {
      AR var1 = this.getDexParser();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         Iterator var3 = this.getDatabase().LH().iterator();

         while(var3.hasNext()) {
            OD var4 = (OD)var3.next();
            Comment var5 = null;
            switch(JebInstance.SyntheticClass_1.$SwitchMap$jeb$db$RecordComment$CommentType[var4.LH().ordinal()]) {
            case 1:
               var5 = new Comment((String)null, -1, var4.PF());
               break;
            case 2:
               var5 = new Comment(var1.dN(var4.KK(), true), -1, var4.PF());
               break;
            case 3:
               var5 = new Comment(var1.fa(var4.KK()).fa(true), -1, var4.PF());
               break;
            case 4:
               var5 = new Comment(var1.mS(var4.KK()).wU(true), -1, var4.PF());
               break;
            case 5:
               var5 = new Comment(var1.mS(var4.KK()).wU(true), var4.EO(), var4.PF());
            }

            if(var5 != null) {
               var2.add(var5);
            }
         }

         return var2;
      }
   }

   public boolean setEngineOption(EngineOption var1, String var2) {
      if(this.is_ui) {
         return false;
      } else {
         TM var3 = this.getConfigurationManager$7647f81f();
         switch(JebInstance.SyntheticClass_1.$SwitchMap$jeb$api$EngineOption[var1.ordinal()]) {
         case 1:
            var3.dN(WV.Ai, (new Boolean(var2)).booleanValue());
            return true;
         case 2:
            var3.dN(WV.uM, (new Boolean(var2)).booleanValue());
            return true;
         case 3:
            var3.dN(WV.kq, (new Boolean(var2)).booleanValue());
            return true;
         case 4:
            var3.dN(WV.ir, (new Boolean(var2)).booleanValue());
            return true;
         case 5:
            var3.dN(WV.rF, (new Boolean(var2)).booleanValue());
            return true;
         case 6:
            var3.dN(WV.IL, (new Boolean(var2)).booleanValue());
            return true;
         case 7:
            try {
               var3.dN(WV.Db, Integer.parseInt(var2));
               return true;
            } catch (NumberFormatException var4) {
               return false;
            }
         case 8:
            var3.dN(WV.sC, (new Boolean(var2)).booleanValue());
            return true;
         case 9:
            var3.dN(WV.jp, (new Boolean(var2)).booleanValue());
            return true;
         case 10:
            var3.dN(WV.Qg, (new Boolean(var2)).booleanValue());
            return true;
         case 11:
            var3.dN(WV.uB, (new Boolean(var2)).booleanValue());
            return true;
         case 12:
            var3.dN(WV.dY, (new Boolean(var2)).booleanValue());
            return true;
         case 13:
            var3.dN(WV.Rm, (new Boolean(var2)).booleanValue());
            return true;
         case 14:
            var3.dN(WV.nb, (new Boolean(var2)).booleanValue());
            return true;
         case 15:
            var3.dN(WV.nI, (new Boolean(var2)).booleanValue());
            return true;
         default:
            return false;
         }
      }
   }

   public String decompileClass(String var1) {
      return this.decompile(var1, true, true, (List)null);
   }

   public String decompileMethod(String var1) {
      return this.decompile(var1, false, true, (List)null);
   }

   public String decompile(String var1, boolean var2) {
      return this.decompile(var1, var2, true, (List)null);
   }

   public String decompile(String var1, boolean var2, boolean var3, List var4) {
      try {
         final ZL var5 = new ZL((jt)null);
         if(!((Boolean)this.execReturn(new JebInstance.RunnableEx() {
            public void run() {
               this.result = Boolean.valueOf(JebInstance.this.ctx.dN(var5));
            }
         })).booleanValue()) {
            return null;
         } else {
            var5.wU(0);
            Rg var6 = this.getDecompiler();

            try {
               var6.dN(var3);
               if(var2) {
                  var6.ld(var1, var5);
               } else {
                  var6.dN(var1, var5);
               }
            } finally {
               var6.dN(false);
            }

            var5.wU();
            String var7 = var5.zs();
            if(var4 != null) {
               Iterator var8 = var5.Hv().iterator();

               while(var8.hasNext()) {
                  gn var9 = (gn)var8.next();
                  var4.add(new Mark(var9.dN(), var9.ld(), new Tag(var9.QE().dN(), var9.QE().ld())));
               }
            }

            return var7;
         }
      } catch (Exception var13) {
         return null;
      }
   }

   public String generateAssembly() {
      try {
         AR var1 = this.getDexParser();
         ew var2 = this.getDatabase();
         TM var3 = this.getConfigurationManager$7647f81f();
         ym var4 = new ym(var1);
         ME var5 = new ME((jt)null);
         var5.dN(var2);
         var5.dN(var3.ld(WV.mD));
         boolean var6 = var3.ld(WV.IL);
         var5.ld(var6?24:20);
         var5.dN(var3.ld(WV.kU)?(var6?10:8):0);
         var5.ld(var3.ld(WV.LV));
         var5.QE(var3.ld(WV.uo));
         var5.wU(var3.ld(WV.H));
         var5.fa(var3.ld(WV.go));
         var5.zs(var3.ld(WV.BP));
         var5.mS(var3.ld(WV.bL));
         var5.dN((char)var3.QE(WV.xg), var3.QE(WV.Dx));
         var4.dN(var5);
         var5.wU();
         return var5.zs();
      } catch (Exception var7) {
         return null;
      }
   }

   public Method getDecompiledMethodTree(String var1) {
      Method var2 = null;
      Rg var3 = this.getDecompiler();

      try {
         var3.dN(true);
         Fu var4 = var3.ld(var1);
         if(var4 != null) {
            var2 = new Method(var4);
         }
      } finally {
         var3.dN(false);
      }

      return var2;
   }

   public Class getDecompiledClassTree(String var1) {
      Class var2 = null;
      Rg var3 = this.getDecompiler();

      try {
         var3.dN(true);
         zd var4 = var3.dN(var1);
         if(var4 != null) {
            var2 = new Class(var4);
         }
      } finally {
         var3.dN(false);
      }

      return var2;
   }

   public Object getGO() {
      Rg var1 = this.getDecompiler();
      return var1 == null?null:var1.dN();
   }

   public List listUserDataBlocks() {
      ew var1 = this.getDatabase();
      return var1 == null?null:var1.zs();
   }

   public byte[] loadUserData(int var1) {
      ew var2 = this.getDatabase();
      return var2 == null?null:var2.ld(var1);
   }

   public boolean storeUserData(int var1, byte[] var2, boolean var3) {
      ew var4 = this.getDatabase();
      return var4 == null?false:var4.dN(var1, var2, var3);
   }

   public boolean removeUserData(int var1) {
      ew var2 = this.getDatabase();
      return var2 == null?false:var2.QE(var1);
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] $SwitchMap$jeb$db$RecordComment$CommentType;
      // $FF: synthetic field
      static final int[] $SwitchMap$jeb$api$EngineOption = new int[EngineOption.values().length];

      static {
         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.APK_PARSE_DEX_ONLY.ordinal()] = 1;
         } catch (NoSuchFieldError var19) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.APK_VERIFY.ordinal()] = 2;
         } catch (NoSuchFieldError var18) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DEX_CHECK_VERSION.ordinal()] = 3;
         } catch (NoSuchFieldError var17) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DEX_CHECK_HASHES.ordinal()] = 4;
         } catch (NoSuchFieldError var16) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DEX_CHECK_ACCESS_FLAGS.ordinal()] = 5;
         } catch (NoSuchFieldError var15) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DEX_PARSE_EXTENDED_OPCODES.ordinal()] = 6;
         } catch (NoSuchFieldError var14) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_METHOD_TIMEOUT.ordinal()] = 7;
         } catch (NoSuchFieldError var13) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_PARSE_TRYCATCHES.ordinal()] = 8;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_OPT_AGGRESSIVE_SUBSTITUTIONS.ordinal()] = 9;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_AST_OPT_STRING_CONCAT.ordinal()] = 10;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_AST_OPT_INLINE_SYNTH_ACCESSORS.ordinal()] = 11;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_AST_OPT_CREATE_FOR_LOOPS.ordinal()] = 12;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_AST_OPT_CREATE_VARARGS.ordinal()] = 13;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_AST_OPT_CREATE_MULTIDIMARRAYS.ordinal()] = 14;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$jeb$api$EngineOption[EngineOption.DECOMP_AST_OPT_CREATE_CONDASSIGNS.ordinal()] = 15;
         } catch (NoSuchFieldError var5) {
            ;
         }

         $SwitchMap$jeb$db$RecordComment$CommentType = new int[OD.vd.values().length];

         try {
            $SwitchMap$jeb$db$RecordComment$CommentType[OD.vd.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$jeb$db$RecordComment$CommentType[OD.vd.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$jeb$db$RecordComment$CommentType[OD.vd.wU.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$jeb$db$RecordComment$CommentType[OD.vd.QE.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            $SwitchMap$jeb$db$RecordComment$CommentType[OD.vd.fa.ordinal()] = 5;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }

   abstract static class RunnableEx implements Runnable {
      Object result;
   }
}
