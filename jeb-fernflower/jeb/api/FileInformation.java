package jeb.api;

import java.util.Arrays;
import jebglobal.k;

public class FileInformation {
   private String original_path;
   private byte[] hash_md5;
   private byte[] hash_sha1;
   private byte[] hash_sha256;

   FileInformation(k var1) {
      this.original_path = new String(var1.LH());
      this.hash_md5 = Arrays.copyOf(var1.KK(), 16);
      this.hash_sha1 = Arrays.copyOf(var1.EO(), 20);
      this.hash_sha256 = Arrays.copyOf(var1.cb(), 32);
   }

   public String getPath() {
      return this.original_path;
   }

   public byte[] getMD5Hash() {
      return this.hash_md5;
   }

   public byte[] getSHA1Hash() {
      return this.hash_sha1;
   }

   public byte[] getSHA256Hash() {
      return this.hash_sha256;
   }
}
