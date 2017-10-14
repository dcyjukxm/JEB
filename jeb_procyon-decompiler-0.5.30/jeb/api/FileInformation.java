// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api;

import java.util.Arrays;
import jebglobal.k;

public class FileInformation
{
    private String original_path;
    private byte[] hash_md5;
    private byte[] hash_sha1;
    private byte[] hash_sha256;
    
    FileInformation(final k k) {
        this.original_path = new String(k.LH());
        this.hash_md5 = Arrays.copyOf(k.KK(), 16);
        this.hash_sha1 = Arrays.copyOf(k.EO(), 20);
        this.hash_sha256 = Arrays.copyOf(k.cb(), 32);
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
