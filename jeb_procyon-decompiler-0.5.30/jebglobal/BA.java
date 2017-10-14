// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.internal.Callback;
import java.util.concurrent.CountDownLatch;

public class BA
{
    private static String configpath;
    private static String inputpath;
    private static String scriptpath;
    private static String[] scriptargs;
    static CountDownLatch latch;
    static Callback callback;
    
    public static void launch(final String configpath, final String inputpath, final String scriptpath, final String[] scriptargs) {
        BA.configpath = configpath;
        BA.inputpath = inputpath;
        BA.scriptpath = scriptpath;
        BA.scriptargs = scriptargs;
        if (NSThread_isMainThread()) {
            run();
        }
        else {
            runOnMainLoop();
        }
    }
    
    static void run() {
        new yW(BA.configpath, BA.inputpath, BA.scriptpath, BA.scriptargs).rn();
    }
    
    static boolean NSThread_isMainThread() {
        return (boolean)Class.forName("org.eclipse.swt.internal.cocoa.NSThread").getDeclaredMethod("isMainThread", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
    }
    
    static long OS_objc_lookUpClass(final String s) {
        return (long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_lookUpClass", String.class).invoke(null, s);
    }
    
    static long OS_objc_allocateClassPair(final long n, final String s, final long n2) {
        return (long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_allocateClassPair", Long.TYPE, String.class, Long.TYPE).invoke(null, n, s, n2);
    }
    
    static boolean OS_class_addMethod(final long n, final long n2, final long n3, final String s) {
        return (boolean)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("class_addMethod", Long.TYPE, Long.TYPE, Long.TYPE, String.class).invoke(null, n, n2, n3, s);
    }
    
    static void OS_objc_registerClassPair(final long n) {
        Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_registerClassPair", Long.TYPE).invoke(null, n);
    }
    
    static long OS_method_setImplementation(final long n, final long n2) {
        return (long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("method_setImplementation", Long.TYPE, Long.TYPE).invoke(null, n, n2);
    }
    
    static long OS_objc_msgSend(final long n, final long n2) {
        return (long)Class.forName("org.eclipse.swt.internal.cocoa.OS").getMethod("objc_msgSend", Long.TYPE, Long.TYPE).invoke(null, n, n2);
    }
    
    static Object NSObject_construct(final long n) {
        return Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getConstructor(Long.TYPE).newInstance(n);
    }
    
    static Object NSObject_init(final Object o) {
        return Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getMethod("init", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
    }
    
    static void NSObject_performSelectorOnMainThread(final Object o, final long n, final Object o2, final boolean b) {
        Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getMethod("performSelectorOnMainThread", Long.TYPE, Class.forName("org.eclipse.swt.internal.cocoa.id"), Boolean.TYPE).invoke(o, n, null, b);
    }
    
    static void NSObject_release(final Object o) {
        Class.forName("org.eclipse.swt.internal.cocoa.NSObject").getMethod("release", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
    }
    
    static long OS_getLong(final String s) {
        return Long.valueOf(Class.forName("org.eclipse.swt.internal.cocoa.OS").getField(s).getLong(null));
    }
    
    static void runOnMainLoop() {
        BA.callback = new Callback((Object)BA.class, "proc", 2);
        final String s = "RunOnMainLoop";
        long n = OS_objc_lookUpClass(s);
        final long os_getLong = OS_getLong("class_NSObject");
        final long os_getLong2 = OS_getLong("sel_run");
        final long os_getLong3 = OS_getLong("sel_alloc");
        if (n == 0L) {
            n = OS_objc_allocateClassPair(os_getLong, s, 0L);
            OS_class_addMethod(n, os_getLong2, BA.callback.getAddress(), "@:");
            OS_objc_registerClassPair(n);
        }
        else {
            OS_method_setImplementation(os_getLong2, BA.callback.getAddress());
        }
        final Object nsObject_construct = NSObject_construct(OS_objc_msgSend(n, os_getLong3));
        NSObject_init(nsObject_construct);
        NSObject_performSelectorOnMainThread(nsObject_construct, os_getLong2, null, false);
        NSObject_release(nsObject_construct);
        BA.latch = new CountDownLatch(1);
        try {
            BA.latch.await();
        }
        catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    static long proc(final long n, final long n2) {
        try {
            BA.callback.dispose();
            run();
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
        finally {
            BA.latch.countDown();
        }
        return 0L;
    }
}
