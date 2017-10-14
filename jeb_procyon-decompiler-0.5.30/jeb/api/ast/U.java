// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import jebglobal.Rx;
import jebglobal.Xf;
import jebglobal.vE;
import jebglobal.cq;
import jebglobal.jK;
import jebglobal.Pi;
import jebglobal.mA;
import jebglobal.Qa;
import jebglobal.KO;
import jebglobal.wm;
import jebglobal.PZ;
import jebglobal.mi;
import jebglobal.yg;
import jebglobal.XM;
import jebglobal.am;
import jebglobal.zn;
import jebglobal.SP;
import jebglobal.Dq;
import jebglobal.tE;
import jebglobal.jM;
import jebglobal.EG;
import jebglobal.wz;
import jebglobal.Np;
import jebglobal.Fu;
import jebglobal.CZ;
import jebglobal.HI;
import jebglobal.Dw;
import jebglobal.lk;
import jebglobal.Gy;
import jebglobal.OX;
import jebglobal.rY;
import jebglobal.Vf;
import jebglobal.zd;
import jebglobal.wD;
import jebglobal.II;
import jebglobal.cI;
import jebglobal.IK;

class U
{
    static IElement wrapElement(final IK ik) {
        if (ik instanceof cI) {
            return wrapNonStatement((cI)ik);
        }
        if (ik instanceof II) {
            return wrapStatement((II)ik);
        }
        if (ik == null) {
            return null;
        }
        throw new RuntimeException();
    }
    
    static NonStatement wrapNonStatement(final cI ci) {
        if (ci instanceof wD) {
            return new ArrayElt((wD)ci);
        }
        if (ci instanceof zd) {
            return new Class((Object)ci);
        }
        if (ci instanceof Vf) {
            return new TypeReference((Vf)ci);
        }
        if (ci instanceof rY) {
            return new ConditionalExpression((rY)ci);
        }
        if (ci instanceof OX) {
            return new Constant((OX)ci);
        }
        if (ci instanceof Gy) {
            if (ci instanceof lk) {
                return new Predicate((lk)ci);
            }
            return new Expression((Gy)ci);
        }
        else {
            if (ci instanceof Dw) {
                return new Field((Dw)ci);
            }
            if (ci instanceof HI) {
                return new Identifier((HI)ci);
            }
            if (ci instanceof CZ) {
                return new InstanceField((CZ)ci);
            }
            if (ci instanceof Fu) {
                return new Method((Object)ci);
            }
            if (ci instanceof Np) {
                return new StaticField((Np)ci);
            }
            if (ci == null) {
                return null;
            }
            throw new RuntimeException();
        }
    }
    
    static Statement wrapStatement(final II ii) {
        if (ii instanceof wz) {
            if (ii instanceof EG) {
                return new Block((EG)ii);
            }
            if (ii instanceof jM) {
                return new DoWhileStm((jM)ii);
            }
            if (ii instanceof tE) {
                return new IfStm((tE)ii);
            }
            if (ii instanceof Dq) {
                return new SwitchStm((Dq)ii);
            }
            if (ii instanceof SP) {
                return new TryStm((SP)ii);
            }
            if (ii instanceof zn) {
                return new WhileStm((zn)ii);
            }
            if (ii instanceof am) {
                return new ForStm((am)ii);
            }
        }
        else {
            if (ii instanceof XM) {
                return new Assignment((XM)ii);
            }
            if (ii instanceof yg) {
                return new Break((yg)ii);
            }
            if (ii instanceof mi) {
                return new Call((mi)ii);
            }
            if (ii instanceof PZ) {
                return new Continue((PZ)ii);
            }
            if (ii instanceof wm) {
                return new Definition((wm)ii);
            }
            if (ii instanceof KO) {
                return new Goto((KO)ii);
            }
            if (ii instanceof Qa) {
                return new Label((Qa)ii);
            }
            if (ii instanceof mA) {
                return new Monitor((mA)ii);
            }
            if (ii instanceof Pi) {
                return new New((Pi)ii);
            }
            if (ii instanceof jK) {
                return new NewArray((jK)ii);
            }
            if (ii instanceof cq) {
                return new Return((cq)ii);
            }
            if (ii instanceof vE) {
                return new Throw((vE)ii);
            }
            if (ii == null) {
                return null;
            }
        }
        throw new RuntimeException();
    }
    
    static IExpression wrapExpression(final Xf xf) {
        if (xf instanceof Rx) {
            return wrapLeftExpression((Rx)xf);
        }
        if (xf instanceof mi) {
            return new Call((mi)xf);
        }
        if (xf instanceof Vf) {
            return new TypeReference((Vf)xf);
        }
        if (xf instanceof rY) {
            return new ConditionalExpression((rY)xf);
        }
        if (xf instanceof OX) {
            return new Constant((OX)xf);
        }
        if (xf instanceof Gy) {
            return new Expression((Gy)xf);
        }
        if (xf instanceof Pi) {
            return new New((Pi)xf);
        }
        if (xf instanceof jK) {
            return new NewArray((jK)xf);
        }
        if (xf == null) {
            return null;
        }
        throw new RuntimeException();
    }
    
    static ILeftExpression wrapLeftExpression(final Rx rx) {
        if (rx instanceof wD) {
            return new ArrayElt((wD)rx);
        }
        if (rx instanceof wm) {
            return new Definition((wm)rx);
        }
        if (rx instanceof HI) {
            return new Identifier((HI)rx);
        }
        if (rx instanceof CZ) {
            return new InstanceField((CZ)rx);
        }
        if (rx instanceof Np) {
            return new StaticField((Np)rx);
        }
        if (rx == null) {
            return null;
        }
        throw new RuntimeException();
    }
    
    static IK getWrappedElement(final IElement element) {
        if (element instanceof NonStatement) {
            return ((NonStatement)element).object;
        }
        if (element instanceof Statement) {
            return ((Statement)element).object;
        }
        if (element == null) {
            return null;
        }
        throw new RuntimeException();
    }
    
    static Xf getWrappedExpression(final IExpression expression) {
        if (expression instanceof ILeftExpression) {
            return getWrappedLeftExpression((ILeftExpression)expression);
        }
        if (expression instanceof Call) {
            return ((Call)expression).object;
        }
        if (expression instanceof TypeReference) {
            return ((TypeReference)expression).object;
        }
        if (expression instanceof ConditionalExpression) {
            return ((ConditionalExpression)expression).object;
        }
        if (expression instanceof Constant) {
            return ((Constant)expression).object;
        }
        if (expression instanceof Expression) {
            if (expression instanceof Predicate) {
                return ((Predicate)expression).object;
            }
            return ((Expression)expression).object;
        }
        else {
            if (expression instanceof New) {
                return ((New)expression).object;
            }
            if (expression instanceof NewArray) {
                return ((NewArray)expression).object;
            }
            if (expression == null) {
                return null;
            }
            throw new RuntimeException();
        }
    }
    
    static Rx getWrappedLeftExpression(final ILeftExpression leftExpression) {
        if (leftExpression instanceof ArrayElt) {
            return ((ArrayElt)leftExpression).object;
        }
        if (leftExpression instanceof Definition) {
            return ((Definition)leftExpression).object;
        }
        if (leftExpression instanceof Identifier) {
            return ((Identifier)leftExpression).object;
        }
        if (leftExpression instanceof InstanceField) {
            return ((InstanceField)leftExpression).object;
        }
        if (leftExpression instanceof StaticField) {
            return ((StaticField)leftExpression).object;
        }
        if (leftExpression == null) {
            return null;
        }
        throw new RuntimeException();
    }
    
    static List getSubElements(final IK ik) {
        final ArrayList<IElement> list = new ArrayList<IElement>();
        final Iterator<IK> iterator = ik.wU().iterator();
        while (iterator.hasNext()) {
            list.add(wrapElement(iterator.next()));
        }
        return list;
    }
    
    static boolean replaceSubElement(final IK ik, final IElement element, final IElement element2) {
        return ik.dN(getWrappedElement(element), getWrappedElement(element2));
    }
    
    static List wrapExpressionList(final List list) {
        final ArrayList<IExpression> list2 = new ArrayList<IExpression>();
        final Iterator<Xf> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(wrapExpression(iterator.next()));
        }
        return list2;
    }
    
    static List getWrappedExpressionList(final List list) {
        final ArrayList<Xf> list2 = new ArrayList<Xf>();
        final Iterator<IExpression> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(getWrappedExpression(iterator.next()));
        }
        return list2;
    }
}
