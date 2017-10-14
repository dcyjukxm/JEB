package jeb.api;

public class Comment {
   String signature;
   int offset;
   String text;

   Comment(String var1, int var2, String var3) {
      this.signature = var1;
      this.offset = var2;
      this.text = var3;
   }

   public String getItemSignature() {
      return this.signature;
   }

   public int getMethodOffset() {
      return this.offset;
   }

   public String getText() {
      return this.text;
   }
}
