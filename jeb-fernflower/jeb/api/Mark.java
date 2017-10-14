package jeb.api;

import jeb.api.Tag;

public class Mark {
   private int lineindex;
   private int lineoffset;
   private Tag tag;

   Mark(int var1, int var2, Tag var3) {
      this.lineindex = var1;
      this.lineoffset = var2;
      this.tag = var3;
   }

   public int getLineIndex() {
      return this.lineindex;
   }

   public int getOffsetInLine() {
      return this.lineoffset;
   }

   public Object getTag() {
      return this.tag;
   }

   public String toString() {
      return String.format("(%d,%d):%s", new Object[]{Integer.valueOf(this.lineindex), Integer.valueOf(this.lineoffset), this.tag});
   }
}
