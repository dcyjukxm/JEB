// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import java.util.Iterator;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.util.List;
import javax.sound.sampled.LineListener;

public final class TH implements LineListener
{
    private List QE;
    int dN;
    ByteArrayOutputStream ld;
    private Thread wU;
    private Thread fa;
    
    public TH() {
        this.QE = new ArrayList();
        this.dN = 0;
        this.ld = new ByteArrayOutputStream();
        this.wU = null;
        this.fa = null;
    }
    
    public void dN(final InputStream inputStream) {
        final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream((inputStream instanceof BufferedInputStream) ? inputStream : new BufferedInputStream(inputStream));
        int frameSize = audioInputStream.getFormat().getFrameSize();
        if (frameSize == -1) {
            frameSize = 1;
        }
        this.ld = new ByteArrayOutputStream();
        final byte[] array = new byte[8000 * frameSize];
        int read;
        while ((read = audioInputStream.read(array)) != -1) {
            this.ld.write(array, 0, read);
        }
        audioInputStream.close();
    }
    
    public boolean dN(final OutputStream outputStream) {
        if (this.dN != 0) {
            return false;
        }
        final byte[] byteArray = this.ld.toByteArray();
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        final AudioFormat audioFormat = new AudioFormat(8000.0f, 8, 1, true, true);
        final AudioInputStream audioInputStream = new AudioInputStream(byteArrayInputStream, audioFormat, byteArray.length / audioFormat.getFrameSize());
        AudioFileFormat.Type aiff = AudioFileFormat.Type.AIFF;
        if (!AudioSystem.isFileTypeSupported(aiff, audioInputStream)) {
            final AudioFileFormat.Type[] audioFileTypes = AudioSystem.getAudioFileTypes(audioInputStream);
            if (audioFileTypes.length == 0) {
                audioInputStream.close();
                return false;
            }
            aiff = audioFileTypes[0];
        }
        AudioSystem.write(audioInputStream, aiff, outputStream);
        audioInputStream.close();
        return true;
    }
    
    public void dN(final SA sa) {
        this.QE.add(sa);
    }
    
    public void ld(final SA sa) {
        this.QE.remove(sa);
    }
    
    public int dN() {
        return this.dN;
    }
    
    private void dN(final int dn) {
        if (this.dN == dn) {
            return;
        }
        final int dn2 = this.dN;
        this.dN = dn;
        final Iterator<SA> iterator = (Iterator<SA>)this.QE.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(dn2, dn);
        }
    }
    
    public boolean ld() {
        return this.ld.size() > 0;
    }
    
    public boolean dN(final int n, final long n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        while (this.dN != n) {
            if (n2 >= 0L) {
                if (System.currentTimeMillis() - currentTimeMillis >= n2) {
                    break;
                }
            }
            try {
                Thread.sleep(200L);
                continue;
            }
            catch (InterruptedException ex) {}
            break;
        }
        return this.dN == n;
    }
    
    public boolean QE() {
        if (this.dN != 0) {
            return false;
        }
        this.ld = new ByteArrayOutputStream();
        return true;
    }
    
    public boolean wU() {
        if (this.dN == 0) {
            return true;
        }
        if (this.dN == 1) {
            return this.zs();
        }
        if (this.dN == 2) {
            return this.OK();
        }
        throw new RuntimeException();
    }
    
    public boolean fa() {
        if (this.dN != 0) {
            return false;
        }
        this.dN(1);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AudioFormat audioFormat = new AudioFormat(8000.0f, 8, 1, true, true);
        final TargetDataLine targetDataLine = (TargetDataLine)AudioSystem.getLine(new DataLine.Info(TargetDataLine.class, audioFormat));
        targetDataLine.open(audioFormat);
        targetDataLine.start();
        (this.wU = new Thread(new WL(this, audioFormat, targetDataLine, byteArrayOutputStream))).start();
        return true;
    }
    
    public boolean zs() {
        if (this.dN != 1) {
            return false;
        }
        this.dN(0);
        this.wU.join();
        this.wU = null;
        return true;
    }
    
    public boolean mS() {
        if (this.dN != 0 || this.ld == null) {
            return false;
        }
        this.dN(2);
        final byte[] byteArray = this.ld.toByteArray();
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        final AudioFormat audioFormat = new AudioFormat(8000.0f, 8, 1, true, true);
        final SourceDataLine sourceDataLine = (SourceDataLine)AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, audioFormat));
        final AudioInputStream audioInputStream = new AudioInputStream(byteArrayInputStream, audioFormat, byteArray.length / audioFormat.getFrameSize());
        sourceDataLine.open(audioFormat);
        sourceDataLine.start();
        (this.fa = new Thread(new pZ(this, audioFormat, audioInputStream, sourceDataLine))).start();
        return true;
    }
    
    public boolean OK() {
        if (this.dN != 2) {
            return false;
        }
        this.dN(0);
        this.fa.join();
        this.fa = null;
        return true;
    }
    
    @Override
    public void update(final LineEvent lineEvent) {
    }
}
