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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class Gf extends SelectionAdapter
{
    private /* synthetic */ lF dN;
    private /* synthetic */ yx ld;
    
    Gf(final yx ld, final lF dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetDefaultSelected(final SelectionEvent selectionEvent) {
        this.ld.cb.ld(this.ld.ci.dN(this.dN.QE()));
        this.ld.EO();
    }
}
