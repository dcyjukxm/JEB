package jeb.api;

public class Tag {
   private String name;
   private Object data;

   Tag(String var1, Object var2) {
      this.name = var1;
      this.data = var2;
   }

   public String getName() {
      return this.name;
   }

   public Object getData() {
      return this.data;
   }

   public String toString() {
      return String.format("tag:%s-%s", new Object[]{this.name, this.data});
   }
}
