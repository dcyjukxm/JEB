package jeb.api.ui;

public class CodePosition {
   private String signature;
   private int offset;

   public CodePosition(String var1, int var2) {
      this.signature = var1;
      this.offset = var2;
   }

   public CodePosition(String var1) {
      this(var1, -1);
   }

   public String getSignature() {
      return this.signature;
   }

   public int getOffset() {
      return this.offset;
   }
}
