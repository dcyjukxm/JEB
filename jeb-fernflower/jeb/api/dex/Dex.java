package jeb.api.dex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jeb.api.dex.DexClass;
import jeb.api.dex.DexField;
import jeb.api.dex.DexFieldData;
import jeb.api.dex.DexMethod;
import jeb.api.dex.DexMethodData;
import jeb.api.dex.DexPrototype;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Bw;
import jebglobal.XV;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.nh;
import jebglobal.yK;

public class Dex {
   public static final int ACC_PUBLIC = 1;
   public static final int ACC_PRIVATE = 2;
   public static final int ACC_PROTECTED = 4;
   public static final int ACC_STATIC = 8;
   public static final int ACC_FINAL = 16;
   public static final int ACC_SYNCHRONIZED = 32;
   public static final int ACC_VOLATILE = 64;
   public static final int ACC_BRIDGE = 64;
   public static final int ACC_TRANSIENT = 128;
   public static final int ACC_VARARGS = 128;
   public static final int ACC_NATIVE = 256;
   public static final int ACC_INTERFACE = 512;
   public static final int ACC_ABSTRACT = 1024;
   public static final int ACC_STRICT = 2048;
   public static final int ACC_SYNTHETIC = 4096;
   public static final int ACC_ANNOTATION = 8192;
   public static final int ACC_ENUM = 16384;
   public static final int ACC_CONSTRUCTOR = 65536;
   public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
   public static final int FLAG_CONST = 1;
   public static final int FLAG_LIBRARY = 2;
   public static final int FLAG_LIBRARY_EXT = 4;
   public static final int FLAG_ALERT = 8;
   private AR dex;

   public Dex(Object var1) {
      if(!(var1 instanceof AR)) {
         throw new RuntimeException();
      } else {
         this.dex = (AR)var1;
      }
   }

   public byte[] getData() {
      byte[] var1 = this.dex.dN();
      return Arrays.copyOf(var1, var1.length);
   }

   public String getString(int var1) {
      return this.dex.dN(var1);
   }

   public List getStrings() {
      return this.dex.wU();
   }

   public int getStringCount() {
      return this.dex.ld();
   }

   public int getDexStringCount() {
      return this.dex.QE();
   }

   public boolean setString(int var1, String var2) {
      return this.dex.dN(var1, var2);
   }

   public String getType(int var1) {
      return this.getType(var1, true);
   }

   public String getType(int var1, boolean var2) {
      nh.vd var3 = this.dex.QE(var1);
      return var3 == null?null:var3.dN(var2);
   }

   public int getTypeCount() {
      return this.dex.mS().dN();
   }

   public int getDexTypeCount() {
      return this.dex.mS().ld();
   }

   public DexPrototype getPrototype(int var1) {
      Bw var2 = this.dex.wU(var1);
      return var2 == null?null:new DexPrototype(var2);
   }

   public int getPrototypeCount() {
      return this.dex.OK();
   }

   public DexField getField(int var1) {
      gE var2 = this.dex.fa(var1);
      return var2 == null?null:new DexField(var2);
   }

   public int getFieldCount() {
      return this.dex.LH();
   }

   public DexMethod getMethod(int var1) {
      hO var2 = this.dex.mS(var1);
      return var2 == null?null:new DexMethod(var2);
   }

   public int getMethodCount() {
      return this.dex.EO();
   }

   public DexFieldData getFieldData(String var1) {
      XV var2 = this.dex.ld(var1);
      return var2 == null?null:new DexFieldData(var2);
   }

   public DexMethodData getMethodData(String var1) {
      AV var2 = this.dex.wU(var1);
      return var2 == null?null:new DexMethodData(var2);
   }

   public DexClass getClass(int var1) {
      yK var2 = this.dex.OK(var1);
      return var2 == null?null:new DexClass(var2);
   }

   public DexClass getClass(String var1) {
      yK var2 = this.dex.cb(var1);
      return var2 == null?null:new DexClass(var2);
   }

   public int getClassCount() {
      return this.dex.PF();
   }

   public List getClassSignatures(boolean var1) {
      ArrayList var2 = new ArrayList(this.dex.Hw().size());
      Iterator var3 = this.dex.Hw().iterator();

      while(var3.hasNext()) {
         yK var4 = (yK)var3.next();
         var2.add(var4.ld(var1));
      }

      return var2;
   }

   public List getMethodSignatures(boolean var1) {
      ArrayList var2 = new ArrayList(this.dex.cb().size());
      Iterator var3 = this.dex.cb().iterator();

      while(var3.hasNext()) {
         hO var4 = (hO)var3.next();
         var2.add(var4.wU(var1));
      }

      return var2;
   }

   public List getFieldSignatures(boolean var1) {
      ArrayList var2 = new ArrayList(this.dex.KK().size());
      Iterator var3 = this.dex.KK().iterator();

      while(var3.hasNext()) {
         gE var4 = (gE)var3.next();
         var2.add(var4.fa(var1));
      }

      return var2;
   }

   public Set getConstants() {
      return new HashSet(this.dex.fa());
   }

   public List getTypeReferences(int var1) {
      return this.offsetsToMethods((List)this.dex.zs().dN().get(Integer.valueOf(var1)));
   }

   public List getFieldReferences(int var1) {
      return this.offsetsToMethods((List)this.dex.zs().ld().get(Integer.valueOf(var1)));
   }

   public List getMethodReferences(int var1) {
      return this.offsetsToMethods((List)this.dex.zs().QE().get(Integer.valueOf(var1)));
   }

   private List offsetsToMethods(List var1) {
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            int var4 = ((Integer)var3.next()).intValue();
            hO var5 = this.dex.LH(var4);
            if(var5 != null) {
               var2.add(Integer.valueOf(var5.dN()));
            }
         }

         return var2;
      }
   }

   public int addString(String var1) {
      return this.dex.fa(var1);
   }

   public int addType(String var1) {
      nh.vd var2 = this.dex.zs(var1);
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         return var2.dN();
      }
   }

   public DexField addFieldReference(String var1) {
      gE var2 = this.dex.LH(var1);
      return var2 == null?null:new DexField(var2);
   }

   public DexMethod addMethodReference(String var1) {
      hO var2 = this.dex.OK(var1);
      return var2 == null?null:new DexMethod(var2);
   }
}
