// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.io.IOException;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Control;
import java.util.List;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import java.io.File;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;

final class LU implements Runnable
{
    private /* synthetic */ yx dN;
    
    LU(final yx dn) {
        this.dN = dn;
    }
    
    @Override
    public void run() {
        try {
            this.dN.ci.Ux();
        }
        catch (Exception ex) {
            cn.dN("Invalid DEX file");
            this.dN.ci = null;
        }
    }
}
