package jebglobal;

import java.util.concurrent.CountDownLatch;
import jebglobal.yW;
import org.eclipse.swt.internal.Callback;

public class BA {
   private static String configpath;
   private static String inputpath;
   private static String scriptpath;
   private static String[] scriptargs;
   static CountDownLatch latch;
   static Callback callback;

   public static void launch(String var0, String var1, String var2, String[] var3) {
      configpath = var0;
      inputpath = var1;
      scriptpath = var2;
      scriptargs = var3;
      if(NSThread_isMainThread()) {
         run();
      } else {
         runOnMainLoop();
      }

   }

   static void run() {
      (new yW(configpath, inputpath, scriptpath, scriptargs)).rn();
   }

   static boolean NSThread_isMainThread() {
      return ((Boolean)Class.forName("org.eclipse.swt.internal.cocoa.NSThread").getDeclaredMethod("isMainThread", new Class[0]).invoke((Object)null, new Object[0])).booleanValue();
   }

   static long OS_objc_lookUpClass(String var0) {
      return ((Long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_lookUpClass", new Class[]{String.class}).invoke((Object)null, new Object[]{var0})).longValue();
   }

   static long OS_objc_allocateClassPair(long var0, String var2, long var3) {
      return ((Long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_allocateClassPair", new Class[]{Long.TYPE, String.class, Long.TYPE}).invoke((Object)null, new Object[]{Long.valueOf(var0), var2, Long.valueOf(var3)})).longValue();
   }

   static boolean OS_class_addMethod(long var0, long var2, long var4, String var6) {
      return ((Boolean)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("class_addMethod", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, String.class}).invoke((Object)null, new Object[]{Long.valueOf(var0), Long.valueOf(var2), Long.valueOf(var4), var6})).booleanValue();
   }

   static void OS_objc_registerClassPair(long var0) {
      Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_registerClassPair", new Class[]{Long.TYPE}).invoke((Object)null, new Object[]{Long.valueOf(var0)});
   }

   static long OS_method_setImplementation(long var0, long var2) {
      return ((Long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("method_setImplementation", new Class[]{Long.TYPE, Long.TYPE}).invoke((Object)null, new Object[]{Long.valueOf(var0), Long.valueOf(var2)})).longValue();
   }

   static long OS_objc_msgSend(long var0, long var2) {
      return ((Long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_msgSend", new Class[]{Long.TYPE, Long.TYPE}).invoke((Object)null, new Object[]{Long.valueOf(var0), Long.valueOf(var2)})).longValue();
   }

   static Object NSObject_construct(long var0) {
      return Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getConstructor(new Class[]{Long.TYPE}).newInstance(new Object[]{Long.valueOf(var0)});
   }

   static Object NSObject_init(Object var0) {
      return Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getMethod("init", new Class[0]).invoke(var0, new Object[0]);
   }

   static void NSObject_performSelectorOnMainThread(Object var0, long var1, Object var3, boolean var4) {
      Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getMethod("performSelectorOnMainThread", new Class[]{Long.TYPE, Class.forName("org.eclipse.swt.internal.cocoa.id"), Boolean.TYPE}).invoke(var0, new Object[]{Long.valueOf(var1), null, Boolean.valueOf(var4)});
   }

   static void NSObject_release(Object var0) {
      Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getMethod("release", new Class[0]).invoke(var0, new Object[0]);
   }

   static long OS_getLong(String var0) {
      return Long.valueOf(Class.forName("org.eclipse.swt.internal.cocoa.OS").getField(var0).getLong((Object)null)).longValue();
   }

   static void runOnMainLoop() {
      callback = new Callback(BA.class, "proc", 2);
      String var0 = "RunOnMainLoop";
      long var1 = OS_objc_lookUpClass(var0);
      long var3 = OS_getLong("class_NSObject");
      long var5 = OS_getLong("sel_run");
      long var7 = OS_getLong("sel_alloc");
      if(var1 == 0L) {
         var1 = OS_objc_allocateClassPair(var3, var0, 0L);
         OS_class_addMethod(var1, var5, callback.getAddress(), "@:");
         OS_objc_registerClassPair(var1);
      } else {
         OS_method_setImplementation(var5, callback.getAddress());
      }

      long var9 = OS_objc_msgSend(var1, var7);
      Object var11 = NSObject_construct(var9);
      NSObject_init(var11);
      NSObject_performSelectorOnMainThread(var11, var5, (Object)null, false);
      NSObject_release(var11);
      latch = new CountDownLatch(1);

      try {
         latch.await();
      } catch (InterruptedException var13) {
         throw new RuntimeException(var13);
      }
   }

   static long proc(long var0, long var2) {
      try {
         callback.dispose();
         run();
      } catch (Throwable var8) {
         var8.printStackTrace();
      } finally {
         latch.countDown();
      }

      return 0L;
   }
}
