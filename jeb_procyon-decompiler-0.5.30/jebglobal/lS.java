// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class lS
{
    public static boolean dN(final Class[] array) {
        if (array.length == 0) {
            return true;
        }
        boolean dn = false;
        try {
            dn = dN(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6 }, 2, 176)).getConstructor(Class.forName(rP.dN(new byte[] { 67, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 27 }, 1, 41))).newInstance(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 47 }, 2, 79)).getMethod(rP.dN(new byte[] { 55, 0, 37, 43, 59 }, 2, 106), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86 }, 2, 116)).getMethod(rP.dN(new byte[] { 36, 10, 4, 53, 29, 10, 6, 28, 29, 79, 70 }, 2, 5), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13 }, 2, 103)).getMethod(rP.dN(new byte[] { 36, 10, 4, 58, 29, 13, 2, 59, 27, 85, 90, 0, 76 }, 2, 227), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66 }, 2, 11)).getMethod(rP.dN(new byte[] { 89, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7 }, 1, 62), (Class<?>[])new Class[0]).invoke(array[0], new Object[0]), new Object[0]), new Object[0]), new Object[0])), array);
        }
        catch (Exception ex) {}
        return dn;
    }
    
    private static boolean dN(final Object o, final Class[] array) {
        boolean equals = false;
        try {
            final Object instance = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 155)).getConstructor(Class.forName(rP.dN(new byte[] { 2, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9 }, 1, 104)), Boolean.TYPE).newInstance(o, true);
            final byte[] array2 = new byte[4096];
            for (int length = array.length, i = 0; i < length; ++i) {
                final Object invoke = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 207)).getMethod(rP.dN(new byte[] { 36, 10, 4, 60, 28, 29, 21, 17 }, 2, 196), String.class).invoke(instance, array[i].getName().replace('.', '/') + ".class");
                while ((int)Class.forName(rP.dN(new byte[] { -76, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12 }, 1, 222)).getMethod(rP.dN(new byte[] { -15, 23, 4, 5 }, 1, 131), byte[].class, Integer.TYPE, Integer.TYPE).invoke(Class.forName(rP.dN(new byte[] { -118, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 224)).getMethod(rP.dN(new byte[] { 36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77 }, 2, 236), Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 82, 10, 89, 14, 107, 80, 73, 118, 66, 84, 64, 73 }, 2, 92))).invoke(instance, invoke), array2, 0, array2.length) != -1) {}
                equals = Class.forName(rP.dN(new byte[] { 91, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28 }, 1, 49)).getMethod(rP.dN(new byte[] { 10, 2, 17, 57, 34, 11, 17, 25, 25, 6 }, 1, 109), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 82, 92, 75, 71, 2, 99, 87, 66, 69, 90, 74, 73, 44, 19, 21, 6 }, 2, 65)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26 }, 2, 192), (Class<?>[])new Class[0]).invoke(((Object[])Class.forName(rP.dN(new byte[] { 26, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 55, 43, 26, 6, 11 }, 1, 112)).getMethod(rP.dN(new byte[] { -54, 2, 17, 55, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17, 22 }, 1, 173), (Class<?>[])new Class[0]).invoke(invoke, new Object[0]))[0], new Object[0]), new Object[0]).toString().substring(10).substring(15, 30).equals(rP.dN(new byte[] { 4, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14 }, 1, 61));
                if (!equals) {
                    break;
                }
            }
            Class.forName(rP.dN(new byte[] { 23, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 125)).getMethod(rP.dN(new byte[] { 32, 3, 31, 10, 23 }, 2, 112), (Class<?>[])new Class[0]).invoke(instance, new Object[0]);
        }
        catch (Exception ex) {}
        return equals;
    }
}
