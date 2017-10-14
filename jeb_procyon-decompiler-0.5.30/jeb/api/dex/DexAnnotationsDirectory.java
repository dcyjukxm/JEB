// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.dex;

import java.util.ArrayList;
import java.util.List;
import jebglobal.xd;

public class DexAnnotationsDirectory
{
    xd ad;
    
    DexAnnotationsDirectory(final xd ad) {
        this.ad = ad;
    }
    
    public List getClassAnnotations() {
        final xd.vd dn = this.ad.dN();
        if (dn == null) {
            return null;
        }
        final ArrayList list = new ArrayList<DexAnnotationItem>(dn.dN());
        final xd.uK[] ld = dn.ld();
        for (int length = ld.length, i = 0; i < length; ++i) {
            list.add(new DexAnnotationItem(ld[i]));
        }
        return list;
    }
    
    public List getFieldsAnnotations() {
        final ArrayList<FieldAnnotation> list = new ArrayList<FieldAnnotation>();
        final xd.lX[] ld = this.ad.ld();
        for (int length = ld.length, i = 0; i < length; ++i) {
            list.add(new FieldAnnotation(ld[i]));
        }
        return list;
    }
    
    public List getMethodsAnnotations() {
        final ArrayList<MethodAnnotation> list = new ArrayList<MethodAnnotation>();
        final xd.eI[] qe = this.ad.QE();
        for (int length = qe.length, i = 0; i < length; ++i) {
            list.add(new MethodAnnotation(qe[i]));
        }
        return list;
    }
    
    public List getParametersAnnotations() {
        final ArrayList<ParameterAnnotation> list = new ArrayList<ParameterAnnotation>();
        final xd.vn[] wu = this.ad.wU();
        for (int length = wu.length, i = 0; i < length; ++i) {
            list.add(new ParameterAnnotation(wu[i]));
        }
        return list;
    }
    
    public static class FieldAnnotation
    {
        xd.lX fa;
        
        FieldAnnotation(final xd.lX fa) {
            this.fa = fa;
        }
        
        public int getFieldIndex() {
            return this.fa.dN();
        }
        
        public List getAnnotationItemSet() {
            final ArrayList<DexAnnotationItem> list = new ArrayList<DexAnnotationItem>();
            final xd.uK[] ld = this.fa.ld().ld();
            for (int length = ld.length, i = 0; i < length; ++i) {
                list.add(new DexAnnotationItem(ld[i]));
            }
            return list;
        }
    }
    
    public static class MethodAnnotation
    {
        xd.eI ma;
        
        MethodAnnotation(final xd.eI ma) {
            this.ma = ma;
        }
        
        public int getMethodIndex() {
            return this.ma.dN();
        }
        
        public List getAnnotationItemSet() {
            final ArrayList<DexAnnotationItem> list = new ArrayList<DexAnnotationItem>();
            final xd.uK[] ld = this.ma.ld().ld();
            for (int length = ld.length, i = 0; i < length; ++i) {
                list.add(new DexAnnotationItem(ld[i]));
            }
            return list;
        }
    }
    
    public static class ParameterAnnotation
    {
        xd.vn pa;
        
        ParameterAnnotation(final xd.vn pa) {
            this.pa = pa;
        }
        
        public int getMethodIndex() {
            return this.pa.dN();
        }
        
        public List getAnnotationItemSets() {
            final ArrayList<ArrayList<DexAnnotationItem>> list = new ArrayList<ArrayList<DexAnnotationItem>>();
            for (final xd.vd vd : this.pa.ld()) {
                final ArrayList<DexAnnotationItem> list2 = new ArrayList<DexAnnotationItem>();
                final xd.uK[] ld2 = vd.ld();
                for (int length2 = ld2.length, j = 0; j < length2; ++j) {
                    list2.add(new DexAnnotationItem(ld2[j]));
                }
                list.add(list2);
            }
            return list;
        }
    }
}
