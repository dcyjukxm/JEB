package jebglobal;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.DataLine.Info;
import jebglobal.SA;

public final class TH implements LineListener {
   private List QE = new ArrayList();
   int dN = 0;
   ByteArrayOutputStream ld = new ByteArrayOutputStream();
   private Thread wU = null;
   private Thread fa = null;

   public void dN(InputStream var1) {
      AudioInputStream var2 = AudioSystem.getAudioInputStream((InputStream)(var1 instanceof BufferedInputStream?var1:new BufferedInputStream(var1)));
      int var3 = var2.getFormat().getFrameSize();
      if(var3 == -1) {
         var3 = 1;
      }

      this.ld = new ByteArrayOutputStream();
      byte[] var4 = new byte[8000 * var3];

      int var5;
      while((var5 = var2.read(var4)) != -1) {
         this.ld.write(var4, 0, var5);
      }

      var2.close();
   }

   public boolean dN(OutputStream var1) {
      if(this.dN != 0) {
         return false;
      } else {
         byte[] var2 = this.ld.toByteArray();
         ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
         AudioFormat var4 = new AudioFormat(8000.0F, 8, 1, true, true);
         AudioInputStream var5 = new AudioInputStream(var3, var4, (long)(var2.length / var4.getFrameSize()));
         Type var6 = Type.AIFF;
         if(!AudioSystem.isFileTypeSupported(var6, var5)) {
            Type[] var7 = AudioSystem.getAudioFileTypes(var5);
            if(var7.length == 0) {
               var5.close();
               return false;
            }

            var6 = var7[0];
         }

         AudioSystem.write(var5, var6, var1);
         var5.close();
         return true;
      }
   }

   public void dN(SA var1) {
      this.QE.add(var1);
   }

   public void ld(SA var1) {
      this.QE.remove(var1);
   }

   public int dN() {
      return this.dN;
   }

   private void dN(int var1) {
      if(this.dN != var1) {
         int var2 = this.dN;
         this.dN = var1;
         Iterator var3 = this.QE.iterator();

         while(var3.hasNext()) {
            SA var4 = (SA)var3.next();
            var4.dN(var2, var1);
         }

      }
   }

   public boolean ld() {
      return this.ld.size() > 0;
   }

   public boolean dN(int var1, long var2) {
      long var4 = System.currentTimeMillis();

      while(this.dN != var1 && (var2 < 0L || System.currentTimeMillis() - var4 < var2)) {
         try {
            Thread.sleep(200L);
         } catch (InterruptedException var6) {
            break;
         }
      }

      return this.dN == var1;
   }

   public boolean QE() {
      if(this.dN != 0) {
         return false;
      } else {
         this.ld = new ByteArrayOutputStream();
         return true;
      }
   }

   public boolean wU() {
      if(this.dN == 0) {
         return true;
      } else if(this.dN == 1) {
         return this.zs();
      } else if(this.dN == 2) {
         return this.OK();
      } else {
         throw new RuntimeException();
      }
   }

   public boolean fa() {
      if(this.dN != 0) {
         return false;
      } else {
         this.dN(1);
         final ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         final AudioFormat var2 = new AudioFormat(8000.0F, 8, 1, true, true);
         Info var3 = new Info(TargetDataLine.class, var2);
         final TargetDataLine var4 = (TargetDataLine)AudioSystem.getLine(var3);
         var4.open(var2);
         var4.start();
         Runnable var5 = new Runnable() {
            private int dN;
            private byte[] ld;
            // $FF: synthetic field
            private AudioFormat QE = var2;
            // $FF: synthetic field
            private TargetDataLine wU = var4;
            // $FF: synthetic field
            private ByteArrayOutputStream fa = var1;
            // $FF: synthetic field
            private TH zs = TH.this;

            {
               this.dN = (int)this.QE.getSampleRate() * this.QE.getFrameSize();
               this.ld = new byte[this.dN];
            }

            public void run() {
               while(true) {
                  try {
                     if(this.zs.dN == 1) {
                        int var1 = this.wU.read(this.ld, 0, this.ld.length);
                        if(var1 > 0) {
                           this.fa.write(this.ld, 0, var1);
                        }
                        continue;
                     }

                     this.wU.stop();
                     this.wU.close();
                     this.zs.ld.write(this.fa.toByteArray());
                  } catch (Exception var2) {
                     this.zs.dN(0);
                  }

                  return;
               }
            }
         };
         this.wU = new Thread(var5);
         this.wU.start();
         return true;
      }
   }

   public boolean zs() {
      if(this.dN != 1) {
         return false;
      } else {
         this.dN(0);
         this.wU.join();
         this.wU = null;
         return true;
      }
   }

   public boolean mS() {
      if(this.dN == 0 && this.ld != null) {
         this.dN(2);
         byte[] var1 = this.ld.toByteArray();
         ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
         final AudioFormat var3 = new AudioFormat(8000.0F, 8, 1, true, true);
         Info var4 = new Info(SourceDataLine.class, var3);
         final SourceDataLine var5 = (SourceDataLine)AudioSystem.getLine(var4);
         final AudioInputStream var6 = new AudioInputStream(var2, var3, (long)(var1.length / var3.getFrameSize()));
         var5.open(var3);
         var5.start();
         Runnable var7 = new Runnable() {
            private int dN;
            private byte[] ld;
            // $FF: synthetic field
            private AudioFormat QE = var3;
            // $FF: synthetic field
            private AudioInputStream wU = var6;
            // $FF: synthetic field
            private SourceDataLine fa = var5;
            // $FF: synthetic field
            private TH zs = TH.this;

            {
               this.dN = (int)this.QE.getSampleRate() * this.QE.getFrameSize();
               this.ld = new byte[this.dN];
            }

            public void run() {
               while(true) {
                  try {
                     int var1;
                     if(this.zs.dN == 2 && (var1 = this.wU.read(this.ld, 0, this.ld.length)) != -1) {
                        if(var1 > 0) {
                           this.fa.write(this.ld, 0, var1);
                        }
                        continue;
                     }

                     this.fa.drain();
                     this.fa.close();
                     this.zs.dN(0);
                  } catch (IOException var2) {
                     this.zs.dN(0);
                  }

                  return;
               }
            }
         };
         this.fa = new Thread(var7);
         this.fa.start();
         return true;
      } else {
         return false;
      }
   }

   public boolean OK() {
      if(this.dN != 2) {
         return false;
      } else {
         this.dN(0);
         this.fa.join();
         this.fa = null;
         return true;
      }
   }

   public void update(LineEvent var1) {
   }
}
