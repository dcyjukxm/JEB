package jeb.api.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jeb.api.ast.ArrayElt;
import jeb.api.ast.Assignment;
import jeb.api.ast.Block;
import jeb.api.ast.Break;
import jeb.api.ast.Call;
import jeb.api.ast.Class;
import jeb.api.ast.ConditionalExpression;
import jeb.api.ast.Constant;
import jeb.api.ast.Continue;
import jeb.api.ast.Definition;
import jeb.api.ast.DoWhileStm;
import jeb.api.ast.Expression;
import jeb.api.ast.Field;
import jeb.api.ast.ForStm;
import jeb.api.ast.Goto;
import jeb.api.ast.IElement;
import jeb.api.ast.IExpression;
import jeb.api.ast.ILeftExpression;
import jeb.api.ast.Identifier;
import jeb.api.ast.IfStm;
import jeb.api.ast.InstanceField;
import jeb.api.ast.Label;
import jeb.api.ast.Method;
import jeb.api.ast.Monitor;
import jeb.api.ast.New;
import jeb.api.ast.NewArray;
import jeb.api.ast.NonStatement;
import jeb.api.ast.Predicate;
import jeb.api.ast.Return;
import jeb.api.ast.Statement;
import jeb.api.ast.StaticField;
import jeb.api.ast.SwitchStm;
import jeb.api.ast.Throw;
import jeb.api.ast.TryStm;
import jeb.api.ast.TypeReference;
import jeb.api.ast.WhileStm;
import jebglobal.CZ;
import jebglobal.Dq;
import jebglobal.Dw;
import jebglobal.EG;
import jebglobal.Fu;
import jebglobal.Gy;
import jebglobal.HI;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.KO;
import jebglobal.Np;
import jebglobal.OX;
import jebglobal.PZ;
import jebglobal.Pi;
import jebglobal.Qa;
import jebglobal.Rx;
import jebglobal.SP;
import jebglobal.Vf;
import jebglobal.XM;
import jebglobal.Xf;
import jebglobal.am;
import jebglobal.cI;
import jebglobal.cq;
import jebglobal.jK;
import jebglobal.jM;
import jebglobal.lk;
import jebglobal.mA;
import jebglobal.mi;
import jebglobal.rY;
import jebglobal.tE;
import jebglobal.vE;
import jebglobal.wD;
import jebglobal.wm;
import jebglobal.wz;
import jebglobal.yg;
import jebglobal.zd;
import jebglobal.zn;

class U {
   static IElement wrapElement(IK var0) {
      if(var0 instanceof cI) {
         return wrapNonStatement((cI)var0);
      } else if(var0 instanceof II) {
         return wrapStatement((II)var0);
      } else if(var0 == null) {
         return null;
      } else {
         throw new RuntimeException();
      }
   }

   static NonStatement wrapNonStatement(cI var0) {
      if(var0 instanceof wD) {
         return new ArrayElt((wD)var0);
      } else if(var0 instanceof zd) {
         return new Class((zd)var0);
      } else if(var0 instanceof Vf) {
         return new TypeReference((Vf)var0);
      } else if(var0 instanceof rY) {
         return new ConditionalExpression((rY)var0);
      } else if(var0 instanceof OX) {
         return new Constant((OX)var0);
      } else if(var0 instanceof Gy) {
         return (NonStatement)(var0 instanceof lk?new Predicate((lk)var0):new Expression((Gy)var0));
      } else if(var0 instanceof Dw) {
         return new Field((Dw)var0);
      } else if(var0 instanceof HI) {
         return new Identifier((HI)var0);
      } else if(var0 instanceof CZ) {
         return new InstanceField((CZ)var0);
      } else if(var0 instanceof Fu) {
         return new Method((Fu)var0);
      } else if(var0 instanceof Np) {
         return new StaticField((Np)var0);
      } else if(var0 == null) {
         return null;
      } else {
         throw new RuntimeException();
      }
   }

   static Statement wrapStatement(II var0) {
      if(var0 instanceof wz) {
         if(var0 instanceof EG) {
            return new Block((EG)var0);
         }

         if(var0 instanceof jM) {
            return new DoWhileStm((jM)var0);
         }

         if(var0 instanceof tE) {
            return new IfStm((tE)var0);
         }

         if(var0 instanceof Dq) {
            return new SwitchStm((Dq)var0);
         }

         if(var0 instanceof SP) {
            return new TryStm((SP)var0);
         }

         if(var0 instanceof zn) {
            return new WhileStm((zn)var0);
         }

         if(var0 instanceof am) {
            return new ForStm((am)var0);
         }
      } else {
         if(var0 instanceof XM) {
            return new Assignment((XM)var0);
         }

         if(var0 instanceof yg) {
            return new Break((yg)var0);
         }

         if(var0 instanceof mi) {
            return new Call((mi)var0);
         }

         if(var0 instanceof PZ) {
            return new Continue((PZ)var0);
         }

         if(var0 instanceof wm) {
            return new Definition((wm)var0);
         }

         if(var0 instanceof KO) {
            return new Goto((KO)var0);
         }

         if(var0 instanceof Qa) {
            return new Label((Qa)var0);
         }

         if(var0 instanceof mA) {
            return new Monitor((mA)var0);
         }

         if(var0 instanceof Pi) {
            return new New((Pi)var0);
         }

         if(var0 instanceof jK) {
            return new NewArray((jK)var0);
         }

         if(var0 instanceof cq) {
            return new Return((cq)var0);
         }

         if(var0 instanceof vE) {
            return new Throw((vE)var0);
         }

         if(var0 == null) {
            return null;
         }
      }

      throw new RuntimeException();
   }

   static IExpression wrapExpression(Xf var0) {
      if(var0 instanceof Rx) {
         return wrapLeftExpression((Rx)var0);
      } else if(var0 instanceof mi) {
         return new Call((mi)var0);
      } else if(var0 instanceof Vf) {
         return new TypeReference((Vf)var0);
      } else if(var0 instanceof rY) {
         return new ConditionalExpression((rY)var0);
      } else if(var0 instanceof OX) {
         return new Constant((OX)var0);
      } else if(var0 instanceof Gy) {
         return new Expression((Gy)var0);
      } else if(var0 instanceof Pi) {
         return new New((Pi)var0);
      } else if(var0 instanceof jK) {
         return new NewArray((jK)var0);
      } else if(var0 == null) {
         return null;
      } else {
         throw new RuntimeException();
      }
   }

   static ILeftExpression wrapLeftExpression(Rx var0) {
      if(var0 instanceof wD) {
         return new ArrayElt((wD)var0);
      } else if(var0 instanceof wm) {
         return new Definition((wm)var0);
      } else if(var0 instanceof HI) {
         return new Identifier((HI)var0);
      } else if(var0 instanceof CZ) {
         return new InstanceField((CZ)var0);
      } else if(var0 instanceof Np) {
         return new StaticField((Np)var0);
      } else if(var0 == null) {
         return null;
      } else {
         throw new RuntimeException();
      }
   }

   static IK getWrappedElement(IElement var0) {
      if(var0 instanceof NonStatement) {
         return ((NonStatement)var0).object;
      } else if(var0 instanceof Statement) {
         return ((Statement)var0).object;
      } else if(var0 == null) {
         return null;
      } else {
         throw new RuntimeException();
      }
   }

   static Xf getWrappedExpression(IExpression var0) {
      if(var0 instanceof ILeftExpression) {
         return getWrappedLeftExpression((ILeftExpression)var0);
      } else if(var0 instanceof Call) {
         return ((Call)var0).object;
      } else if(var0 instanceof TypeReference) {
         return ((TypeReference)var0).object;
      } else if(var0 instanceof ConditionalExpression) {
         return ((ConditionalExpression)var0).object;
      } else if(var0 instanceof Constant) {
         return ((Constant)var0).object;
      } else if(var0 instanceof Expression) {
         return (Xf)(var0 instanceof Predicate?((Predicate)var0).object:((Expression)var0).object);
      } else if(var0 instanceof New) {
         return ((New)var0).object;
      } else if(var0 instanceof NewArray) {
         return ((NewArray)var0).object;
      } else if(var0 == null) {
         return null;
      } else {
         throw new RuntimeException();
      }
   }

   static Rx getWrappedLeftExpression(ILeftExpression var0) {
      if(var0 instanceof ArrayElt) {
         return ((ArrayElt)var0).object;
      } else if(var0 instanceof Definition) {
         return ((Definition)var0).object;
      } else if(var0 instanceof Identifier) {
         return ((Identifier)var0).object;
      } else if(var0 instanceof InstanceField) {
         return ((InstanceField)var0).object;
      } else if(var0 instanceof StaticField) {
         return ((StaticField)var0).object;
      } else if(var0 == null) {
         return null;
      } else {
         throw new RuntimeException();
      }
   }

   static List getSubElements(IK var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.wU().iterator();

      while(var2.hasNext()) {
         IK var3 = (IK)var2.next();
         var1.add(wrapElement(var3));
      }

      return var1;
   }

   static boolean replaceSubElement(IK var0, IElement var1, IElement var2) {
      return var0.dN(getWrappedElement(var1), getWrappedElement(var2));
   }

   static List wrapExpressionList(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         Xf var3 = (Xf)var2.next();
         var1.add(wrapExpression(var3));
      }

      return var1;
   }

   static List getWrappedExpressionList(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         IExpression var3 = (IExpression)var2.next();
         var1.add(getWrappedExpression(var3));
      }

      return var1;
   }
}
