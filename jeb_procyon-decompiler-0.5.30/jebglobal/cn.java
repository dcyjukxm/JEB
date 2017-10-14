// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.logging.LogRecord;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Formatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.List;
import java.util.logging.Logger;

public class cn
{
    private static Logger dN;
    private static List ld;
    private static boolean QE;
    
    public static void dN(final boolean b, final String s, final boolean b2) {
        if (cn.dN != null) {
            throw new RuntimeException();
        }
        (cn.dN = Logger.getLogger(cn.class.getName())).setLevel(Level.FINEST);
        cn.dN.setUseParentHandlers(false);
        final uK uk = new uK();
        if (b) {
            final ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(uk);
            consoleHandler.setLevel(Level.FINEST);
            cn.dN.addHandler(consoleHandler);
        }
        if (s != null) {
            final FileHandler fileHandler = new FileHandler(s, 20971520, 1, b2);
            fileHandler.setFormatter(uk);
            fileHandler.setLevel(Level.FINEST);
            cn.dN.addHandler(fileHandler);
        }
    }
    
    public static void dN() {
        if (cn.dN == null) {
            throw new RuntimeException();
        }
        final Handler[] handlers = cn.dN.getHandlers();
        for (int length = handlers.length, i = 0; i < length; ++i) {
            handlers[i].close();
        }
        cn.dN = null;
    }
    
    public static void dN(final rB rb) {
        cn.ld.add(rb);
    }
    
    public static void ld(final rB rb) {
        cn.ld.remove(rb);
    }
    
    public static void dN(final boolean qe) {
        if (cn.dN == null) {
            throw new RuntimeException();
        }
        if (qe != cn.QE) {
            cn.QE = qe;
            final Iterator iterator = cn.ld.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        }
    }
    
    private static void dN(final Level level, String string, final boolean b) {
        if (cn.dN == null) {
            throw new RuntimeException();
        }
        if (b) {
            string += "\n";
        }
        if (cn.QE) {
            cn.dN.log(level, string, new Boolean(false));
        }
        final Iterator<rB> iterator = cn.ld.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(level, string);
        }
    }
    
    public static void dN(final String s) {
        dN(Level.INFO, s, true);
    }
    
    public static void ld(final String s) {
        dN(Level.INFO, s, false);
    }
    
    static {
        cn.dN = null;
        cn.ld = new ArrayList();
        cn.QE = true;
    }
    
    static final class uK extends Formatter
    {
        private String dN(final long n) {
            return new SimpleDateFormat("yy/MM/dd-HH:mm:ss").format(new Date(n));
        }
        
        @Override
        public String format(final LogRecord logRecord) {
            final StringBuilder sb = new StringBuilder();
            boolean booleanValue = true;
            final Object[] parameters = logRecord.getParameters();
            if (parameters != null && parameters.length >= 1 && parameters[0] instanceof Boolean) {
                booleanValue = (boolean)parameters[0];
            }
            if (booleanValue) {
                sb.append(String.format("%s %s ", this.dN(logRecord.getMillis()), logRecord.getLevel()));
            }
            sb.append(logRecord.getMessage());
            return sb.toString();
        }
    }
}
