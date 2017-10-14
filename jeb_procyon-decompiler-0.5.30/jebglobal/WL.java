// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.DataLine;
import java.util.Iterator;
import javax.sound.sampled.AudioFileFormat;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.LineListener;
import java.io.ByteArrayOutputStream;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.AudioFormat;

final class WL implements Runnable
{
    private int dN;
    private byte[] ld;
    private /* synthetic */ AudioFormat QE;
    private /* synthetic */ TargetDataLine wU;
    private /* synthetic */ ByteArrayOutputStream fa;
    private /* synthetic */ TH zs;
    
    WL(final TH zs, final AudioFormat qe, final TargetDataLine wu, final ByteArrayOutputStream fa) {
        this.zs = zs;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.dN = (int)this.QE.getSampleRate() * this.QE.getFrameSize();
        this.ld = new byte[this.dN];
    }
    
    @Override
    public void run() {
        try {
            while (this.zs.dN == 1) {
                final int read = this.wU.read(this.ld, 0, this.ld.length);
                if (read > 0) {
                    this.fa.write(this.ld, 0, read);
                }
            }
            this.wU.stop();
            this.wU.close();
            this.zs.ld.write(this.fa.toByteArray());
        }
        catch (Exception ex) {
            this.zs.dN(0);
        }
    }
}
