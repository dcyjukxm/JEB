// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.graphics.Color;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;
import org.eclipse.swt.events.SelectionListener;
import java.util.regex.PatternSyntaxException;
import java.util.ArrayList;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.graphics.Font;
import java.util.regex.Pattern;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TreeItem;
import java.util.List;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class VS extends SelectionAdapter
{
    private /* synthetic */ ly dN;
    
    VS(final ly dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final boolean selection = this.dN.wU.getSelection();
        if (selection != this.dN.fa) {
            this.dN.fa = selection;
            this.dN.KK();
        }
    }
}
