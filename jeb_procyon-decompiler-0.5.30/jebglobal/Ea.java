// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
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
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Control;
import java.util.List;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import java.io.File;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import java.util.ArrayList;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

final class Ea implements SelectionListener
{
    private /* synthetic */ yx dN;
    
    Ea(final yx dn) {
        this.dN = dn;
    }
    
    public void widgetDefaultSelected(final SelectionEvent selectionEvent) {
        final String dn = this.dN(selectionEvent);
        if (dn == null) {
            return;
        }
        final TreeItem treeItem = (TreeItem)selectionEvent.item;
        if (this.dN.zs.wU() == this.dN.PF) {
            this.dN.PF.dN(dn, null);
            this.dN.PF();
        }
        else {
            this.dN.EO();
            treeItem.setExpanded(true);
        }
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        if (this.dN.zs.wU() == this.dN.PF) {
            return;
        }
        final String dn = this.dN(selectionEvent);
        if (dn == null) {
            return;
        }
        final yK eo = this.dN.ci.EO(dn);
        if (eo != null) {
            final String ld = eo.ld(false);
            if (this.dN.cb != null) {
                this.dN.cb.ld(ld);
            }
        }
    }
    
    private String dN(final SelectionEvent selectionEvent) {
        TreeItem parentItem = (TreeItem)selectionEvent.item;
        if (parentItem == null || parentItem.getItems() == null || parentItem.getItems().length > 0) {
            return null;
        }
        final ArrayList<Object> list = new ArrayList<Object>();
        while (parentItem != null) {
            list.add(0, parentItem.getText());
            parentItem = parentItem.getParentItem();
        }
        final StringBuilder sb = new StringBuilder("L");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i));
            if (i == list.size() - 1) {
                sb.append(";");
            }
            else {
                sb.append("/");
            }
        }
        return sb.toString().replace('.', '/');
    }
}
