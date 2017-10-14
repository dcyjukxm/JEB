// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class tt extends as
{
    public tt(final yn yn) {
        super(yn, "Object help");
        this.ld = 104;
        this.fa = HC.dN().dN("icon-help.png");
        this.OK = true;
    }
    
    @Override
    public boolean OK() {
        return this.dN(true);
    }
    
    @Override
    public boolean LH() {
        return this.dN(false);
    }
    
    private boolean dN(final boolean b) {
        final YJ ok = this.dN.OK();
        if (ok == null) {
            return false;
        }
        final Object zs = ok.zs();
        if (zs == null) {
            return false;
        }
        if (ok.dN() == Zh.mS) {
            if (b) {
                return true;
            }
            Vm.QE(String.format("%s#op_%s", this.dN.QE().EO().dN(WV.Hv).replace('\\', '/'), zs.toString().replace("-", "").replace("/", "")));
            return true;
        }
        else {
            String string = null;
            String s;
            if (zs instanceof String) {
                s = zs.toString();
            }
            else {
                if (!(zs instanceof hO)) {
                    return false;
                }
                final hO ho = (hO)zs;
                if (ho.QE()) {
                    return false;
                }
                s = ho.dN(false);
                try {
                    final String dn = this.dN(ho.OK());
                    if (dn != null) {
                        string = ho.ld(false) + dn;
                    }
                }
                catch (Exception ex) {}
            }
            if (s.length() <= 2) {
                return false;
            }
            final String replace = s.substring(1, s.length() - 1).replace('$', '.');
            final String[] array = { "android/", "dalvik/", "java/", "javax/", "org/apache/", "org/json/", "org/w3c/", "org/xml/", "org/xmlpull/" };
            boolean b2 = false;
            final String[] array2 = array;
            for (int length = array2.length, i = 0; i < length; ++i) {
                if (replace.startsWith(array2[i])) {
                    b2 = true;
                    break;
                }
            }
            if (b || !b2) {
                return b2;
            }
            String s2 = this.dN.QE().EO().dN(WV.s).replace('\\', '/');
            if (!s2.endsWith("/")) {
                s2 += "/";
            }
            String s3 = s2 + "reference/" + replace + ".html";
            if (string != null) {
                s3 = s3 + "#" + string;
            }
            Vm.QE(s3);
            return true;
        }
    }
    
    private String dN(final Bw bw) {
        final StringBuilder sb = new StringBuilder("(");
        int n = 0;
        for (final String s : bw.ld(false)) {
            if (n++ >= 1) {
                sb.append(",%20");
            }
            int n2 = 0;
            final String s2 = s;
            final int n3 = 0;
            ++n2;
            char c = s2.charAt(n3);
            int n4 = 0;
            while (c == '[') {
                ++n4;
                c = s.charAt(n2++);
            }
            final String substring = s.substring(n4);
            String s3 = null;
            switch (c) {
                case 90: {
                    s3 = "boolean";
                    break;
                }
                case 66: {
                    s3 = "byte";
                    break;
                }
                case 67: {
                    s3 = "char";
                    break;
                }
                case 83: {
                    s3 = "short";
                    break;
                }
                case 73: {
                    s3 = "int";
                    break;
                }
                case 74: {
                    s3 = "long";
                    break;
                }
                case 70: {
                    s3 = "float";
                    break;
                }
                case 68: {
                    s3 = "double";
                    break;
                }
                case 76: {
                    s3 = substring.substring(1, substring.length() - 1).replace('/', '.');
                    break;
                }
                default: {
                    return null;
                }
            }
            while (n4-- > 0) {
                s3 += "[]";
            }
            sb.append(s3);
        }
        sb.append(")");
        return sb.toString();
    }
}
