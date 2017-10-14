package jebglobal;

import java.lang.reflect.Method;
import jebglobal.yW;
import org.eclipse.swt.SWT;
import org.eclipse.swt.internal.Callback;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public final class vv {
   private static final long kAboutMenuItem = 0L;
   private static final long kPreferencesMenuItem = 2L;
   private static final long kQuitMenuItem = 10L;
   static long sel_toolbarButtonClicked_;
   static long sel_preferencesMenuItemSelected_;
   static long sel_aboutMenuItemSelected_;
   static Callback proc3Args;
   private final String appName;

   public vv(String var1) {
      this.appName = var1;
   }

   public void hookApplicationMenu(final yW var1) {
      Display var2 = var1.Nh();
      vv.uK var3 = new vv.uK(var1);

      try {
         this.initialize(var3);
      } catch (Exception var5) {
         throw new IllegalStateException(var5);
      }

      if(!var2.isDisposed()) {
         var2.addListener(21, new Listener() {
            public void handleEvent(Event var1x) {
               var1x.doit = false;
               var1.Ai().zs();
            }
         });
      }

      var2.disposeExec(new Runnable() {
         public void run() {
            vv.this.invoke((Object)vv.proc3Args, "dispose");
         }
      });
   }

   private void initialize(Object var1) {
      Class var2 = this.classForName("org.eclipse.swt.internal.cocoa.OS");
      if(sel_toolbarButtonClicked_ == 0L) {
         sel_preferencesMenuItemSelected_ = this.registerName(var2, "preferencesMenuItemSelected:");
         sel_aboutMenuItemSelected_ = this.registerName(var2, "aboutMenuItemSelected:");
      }

      proc3Args = new Callback(var1, "actionProc", 3);
      Method var3 = Callback.class.getMethod("getAddress", new Class[0]);
      Object var4 = var3.invoke(proc3Args, (Object[])null);
      long var5 = this.convertToLong(var4);
      if(var5 == 0L) {
         SWT.error(3);
      }

      Class var7 = this.classForName("org.eclipse.swt.internal.cocoa.NSMenu");
      Class var8 = this.classForName("org.eclipse.swt.internal.cocoa.NSMenuItem");
      Class var9 = this.classForName("org.eclipse.swt.internal.cocoa.NSString");
      Class var10 = this.classForName("org.eclipse.swt.internal.cocoa.NSApplication");
      var4 = invoke(var2, "objc_lookUpClass", new Object[]{"SWTApplicationDelegate"});
      long var11 = this.convertToLong(var4);
      invoke(var2, "class_addMethod", new Object[]{wrapPointer(var11), wrapPointer(sel_preferencesMenuItemSelected_), wrapPointer(var5), "@:@"});
      invoke(var2, "class_addMethod", new Object[]{wrapPointer(var11), wrapPointer(sel_aboutMenuItemSelected_), wrapPointer(var5), "@:@"});
      Object var13 = this.invoke(var10, "sharedApplication");
      Object var14 = this.invoke(var13, "mainMenu");
      Object var15 = invoke(var7, var14, "itemAtIndex", new Object[]{wrapPointer(0L)});
      Object var16 = this.invoke(var15, "submenu");
      Object var17 = invoke(var7, var16, "itemAtIndex", new Object[]{wrapPointer(0L)});
      Object var18;
      if(this.appName != null) {
         var18 = invoke(var9, "stringWith", new Object[]{"About " + this.appName});
         invoke(var8, var17, "setTitle", new Object[]{var18});
      }

      if(this.appName != null) {
         var18 = invoke(var7, var16, "itemAtIndex", new Object[]{wrapPointer(10L)});
         Object var19 = invoke(var9, "stringWith", new Object[]{"Quit " + this.appName});
         invoke(var8, var18, "setTitle", new Object[]{var19});
      }

      var18 = invoke(var7, var16, "itemAtIndex", new Object[]{wrapPointer(2L)});
      invoke(var8, var18, "setEnabled", new Object[]{Boolean.valueOf(true)});
      invoke(var8, var18, "setAction", new Object[]{wrapPointer(sel_preferencesMenuItemSelected_)});
      invoke(var8, var17, "setAction", new Object[]{wrapPointer(sel_aboutMenuItemSelected_)});
   }

   private long registerName(Class var1, String var2) {
      Object var3 = invoke(var1, "sel_registerName", new Object[]{var2});
      return this.convertToLong(var3);
   }

   private long convertToLong(Object var1) {
      if(var1 instanceof Integer) {
         Integer var3 = (Integer)var1;
         return var3.longValue();
      } else if(var1 instanceof Long) {
         Long var2 = (Long)var1;
         return var2.longValue();
      } else {
         return 0L;
      }
   }

   private static Object wrapPointer(long var0) {
      Class var2 = org.eclipse.swt.internal.C.PTR_SIZEOF == 8?Long.TYPE:Integer.TYPE;
      return var2 == Long.TYPE?new Long(var0):new Integer((int)var0);
   }

   private static Object invoke(Class var0, String var1, Object[] var2) {
      return invoke((Class)var0, (Object)null, (String)var1, var2);
   }

   private static Object invoke(Class var0, Object var1, String var2, Object[] var3) {
      try {
         Class[] var4 = new Class[var3.length];

         for(int var5 = 0; var5 < var3.length; ++var5) {
            Class var6 = var3[var5].getClass();
            if(var6 == Integer.class) {
               var4[var5] = Integer.TYPE;
            } else if(var6 == Long.class) {
               var4[var5] = Long.TYPE;
            } else if(var6 == Byte.class) {
               var4[var5] = Byte.TYPE;
            } else if(var6 == Boolean.class) {
               var4[var5] = Boolean.TYPE;
            } else {
               var4[var5] = var6;
            }
         }

         Method var8 = var0.getMethod(var2, var4);
         return var8.invoke(var1, var3);
      } catch (Exception var7) {
         throw new IllegalStateException(var7);
      }
   }

   private Class classForName(String var1) {
      try {
         Class var2 = Class.forName(var1);
         return var2;
      } catch (ClassNotFoundException var3) {
         throw new IllegalStateException(var3);
      }
   }

   private Object invoke(Class var1, String var2) {
      return this.invoke((Class)var1, (String)var2, (Class[])null, (Object[])null);
   }

   private Object invoke(Class var1, String var2, Class[] var3, Object... var4) {
      try {
         Method var5 = var1.getDeclaredMethod(var2, var3);
         return var5.invoke((Object)null, var4);
      } catch (Exception var6) {
         throw new IllegalStateException(var6);
      }
   }

   private Object invoke(Object var1, String var2) {
      return this.invoke((Object)var1, (String)var2, (Class[])null, (Object[])null);
   }

   private Object invoke(Object var1, String var2, Class[] var3, Object... var4) {
      try {
         Method var5 = var1.getClass().getDeclaredMethod(var2, var3);
         return var5.invoke(var1, var4);
      } catch (Exception var6) {
         throw new IllegalStateException(var6);
      }
   }

   static class uK {
      final yW context;

      public uK(yW var1) {
         this.context = var1;
      }

      public int actionProc(int var1, int var2, int var3) {
         return (int)this.actionProc((long)var1, (long)var2, (long)var3);
      }

      public long actionProc(long var1, long var3, long var5) {
         if(var3 == vv.sel_aboutMenuItemSelected_) {
            this.context.Ai().fa();
         } else if(var3 == vv.sel_preferencesMenuItemSelected_) {
            this.context.Ai().wU();
         }

         return 99L;
      }
   }
}
