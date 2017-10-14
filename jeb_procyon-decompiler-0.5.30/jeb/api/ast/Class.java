// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Fu;
import jebglobal.Dw;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import jebglobal.cI;
import jebglobal.zd;

public class Class extends NonStatement
{
    zd object;
    
    public Class(final Object o) {
        super((cI)o);
        if (!(o instanceof zd)) {
            throw new RuntimeException();
        }
        this.object = (zd)o;
    }
    
    public String getType() {
        return this.object.fa().KK();
    }
    
    public List getInnerClasses() {
        final ArrayList<Class> list = new ArrayList<Class>();
        final Iterator<zd> iterator = this.object.zs().iterator();
        while (iterator.hasNext()) {
            list.add(new Class((Object)iterator.next()));
        }
        return list;
    }
    
    public List getFields() {
        final ArrayList<Field> list = new ArrayList<Field>();
        final Iterator<Dw> iterator = this.object.OK().iterator();
        while (iterator.hasNext()) {
            list.add(new Field(iterator.next()));
        }
        return list;
    }
    
    public List getMethods() {
        final ArrayList<Method> list = new ArrayList<Method>();
        final Iterator<Fu> iterator = this.object.mS().iterator();
        while (iterator.hasNext()) {
            list.add(new Method((Object)iterator.next()));
        }
        return list;
    }
}
