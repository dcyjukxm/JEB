// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.internal.C;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.internal.Callback;

public final class vv
{
    private static final long kAboutMenuItem = 0L;
    private static final long kPreferencesMenuItem = 2L;
    private static final long kQuitMenuItem = 10L;
    static long sel_toolbarButtonClicked_;
    static long sel_preferencesMenuItemSelected_;
    static long sel_aboutMenuItemSelected_;
    static Callback proc3Args;
    private final String appName;
    
    public vv(final String appName) {
        this.appName = appName;
    }
    
    public void hookApplicationMenu(final yW yw) {
        final Display nh = yw.Nh();
        final uK uk = new uK(yw);
        try {
            this.initialize(uk);
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
        if (!nh.isDisposed()) {
            nh.addListener(21, (Listener)new UE(this, yw));
        }
        nh.disposeExec((Runnable)new au(this));
    }
    
    private void initialize(final Object o) {
        final Class classForName = this.classForName("org.eclipse.swt.internal.cocoa.OS");
        if (vv.sel_toolbarButtonClicked_ == 0L) {
            vv.sel_preferencesMenuItemSelected_ = this.registerName(classForName, "preferencesMenuItemSelected:");
            vv.sel_aboutMenuItemSelected_ = this.registerName(classForName, "aboutMenuItemSelected:");
        }
        vv.proc3Args = new Callback(o, "actionProc", 3);
        final long convertToLong = this.convertToLong(Callback.class.getMethod("getAddress", (Class<?>[])new Class[0]).invoke(vv.proc3Args, (Object[])null));
        if (convertToLong == 0L) {
            SWT.error(3);
        }
        final Class classForName2 = this.classForName("org.eclipse.swt.internal.cocoa.NSMenu");
        final Class classForName3 = this.classForName("org.eclipse.swt.internal.cocoa.NSMenuItem");
        final Class classForName4 = this.classForName("org.eclipse.swt.internal.cocoa.NSString");
        final Class classForName5 = this.classForName("org.eclipse.swt.internal.cocoa.NSApplication");
        final long convertToLong2 = this.convertToLong(invoke(classForName, "objc_lookUpClass", new Object[] { "SWTApplicationDelegate" }));
        invoke(classForName, "class_addMethod", new Object[] { wrapPointer(convertToLong2), wrapPointer(vv.sel_preferencesMenuItemSelected_), wrapPointer(convertToLong), "@:@" });
        invoke(classForName, "class_addMethod", new Object[] { wrapPointer(convertToLong2), wrapPointer(vv.sel_aboutMenuItemSelected_), wrapPointer(convertToLong), "@:@" });
        final Object invoke = this.invoke(invoke(classForName2, this.invoke(this.invoke(classForName5, "sharedApplication"), "mainMenu"), "itemAtIndex", new Object[] { wrapPointer(0L) }), "submenu");
        final Object invoke2 = invoke(classForName2, invoke, "itemAtIndex", new Object[] { wrapPointer(0L) });
        if (this.appName != null) {
            invoke(classForName3, invoke2, "setTitle", new Object[] { invoke(classForName4, "stringWith", new Object[] { "About " + this.appName }) });
        }
        if (this.appName != null) {
            invoke(classForName3, invoke(classForName2, invoke, "itemAtIndex", new Object[] { wrapPointer(10L) }), "setTitle", new Object[] { invoke(classForName4, "stringWith", new Object[] { "Quit " + this.appName }) });
        }
        final Object invoke3 = invoke(classForName2, invoke, "itemAtIndex", new Object[] { wrapPointer(2L) });
        invoke(classForName3, invoke3, "setEnabled", new Object[] { true });
        invoke(classForName3, invoke3, "setAction", new Object[] { wrapPointer(vv.sel_preferencesMenuItemSelected_) });
        invoke(classForName3, invoke2, "setAction", new Object[] { wrapPointer(vv.sel_aboutMenuItemSelected_) });
    }
    
    private long registerName(final Class clazz, final String s) {
        return this.convertToLong(invoke(clazz, "sel_registerName", new Object[] { s }));
    }
    
    private long convertToLong(final Object o) {
        if (o instanceof Integer) {
            return (long)o;
        }
        if (o instanceof Long) {
            return (long)o;
        }
        return 0L;
    }
    
    private static Object wrapPointer(final long n) {
        if (((C.PTR_SIZEOF == 8) ? Long.TYPE : Integer.TYPE) == Long.TYPE) {
            return new Long(n);
        }
        return new Integer((int)n);
    }
    
    private static Object invoke(final Class clazz, final String s, final Object[] array) {
        return invoke(clazz, null, s, array);
    }
    
    private static Object invoke(final Class clazz, final Object o, final String s, final Object[] array) {
        try {
            final Class[] array2 = new Class[array.length];
            for (int i = 0; i < array.length; ++i) {
                final Class<?> class1 = array[i].getClass();
                if (class1 == Integer.class) {
                    array2[i] = Integer.TYPE;
                }
                else if (class1 == Long.class) {
                    array2[i] = Long.TYPE;
                }
                else if (class1 == Byte.class) {
                    array2[i] = Byte.TYPE;
                }
                else if (class1 == Boolean.class) {
                    array2[i] = Boolean.TYPE;
                }
                else {
                    array2[i] = class1;
                }
            }
            return clazz.getMethod(s, (Class[])array2).invoke(o, array);
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    private Class classForName(final String s) {
        try {
            return Class.forName(s);
        }
        catch (ClassNotFoundException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    private Object invoke(final Class clazz, final String s) {
        return this.invoke(clazz, s, null, (Object[])null);
    }
    
    private Object invoke(final Class clazz, final String s, final Class[] array, final Object... array2) {
        try {
            return clazz.getDeclaredMethod(s, (Class[])array).invoke(null, array2);
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    private Object invoke(final Object o, final String s) {
        return this.invoke(o, s, null, (Object[])null);
    }
    
    private Object invoke(final Object o, final String s, final Class[] array, final Object... array2) {
        try {
            return o.getClass().getDeclaredMethod(s, (Class<?>[])array).invoke(o, array2);
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    static final class uK
    {
        final yW context;
        
        public uK(final yW context) {
            this.context = context;
        }
        
        public int actionProc(final int n, final int n2, final int n3) {
            return (int)this.actionProc(n, n2, (long)n3);
        }
        
        public long actionProc(final long n, final long n2, final long n3) {
            if (n2 == vv.sel_aboutMenuItemSelected_) {
                this.context.Ai().fa();
            }
            else if (n2 == vv.sel_preferencesMenuItemSelected_) {
                this.context.Ai().wU();
            }
            return 99L;
        }
    }
}
