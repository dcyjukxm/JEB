// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.Line;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import java.util.Iterator;
import javax.sound.sampled.AudioFileFormat;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.util.List;
import javax.sound.sampled.LineListener;
import java.io.IOException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat;

final class pZ implements Runnable
{
    private int dN;
    private byte[] ld;
    private /* synthetic */ AudioFormat QE;
    private /* synthetic */ AudioInputStream wU;
    private /* synthetic */ SourceDataLine fa;
    private /* synthetic */ TH zs;
    
    pZ(final TH zs, final AudioFormat qe, final AudioInputStream wu, final SourceDataLine fa) {
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
            int read;
            while (this.zs.dN == 2 && (read = this.wU.read(this.ld, 0, this.ld.length)) != -1) {
                if (read > 0) {
                    this.fa.write(this.ld, 0, read);
                }
            }
            this.fa.drain();
            this.fa.close();
            this.zs.dN(0);
        }
        catch (IOException ex) {
            this.zs.dN(0);
        }
    }
}
