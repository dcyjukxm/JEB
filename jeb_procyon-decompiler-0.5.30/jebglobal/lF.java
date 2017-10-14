// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import java.util.Comparator;
import java.util.Collections;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TableItem;
import java.util.Iterator;
import org.eclipse.swt.widgets.TableColumn;
import java.util.ArrayList;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import java.util.List;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;

public final class lF extends Composite implements QW, SelectionListener
{
    private Table dN;
    private List ld;
    private List QE;
    private boolean wU;
    private oa fa;
    
    public lF(final Composite composite, final boolean wu, final String[] array, final List list, final int n) {
        super(composite, 0);
        this.setLayout((Layout)new FillLayout());
        this.dN(composite, this.wU = wu, array, list, n);
    }
    
    public void dN(final SelectionListener selectionListener) {
        this.dN.addSelectionListener(selectionListener);
    }
    
    public Comparable[] ld() {
        return this.QE.get(this.dN.getSelectionIndex());
    }
    
    public int QE() {
        if (!this.wU) {
            throw new RuntimeException("First column is not an index");
        }
        int n = this.dN.getSelectionIndex();
        if (n >= 0) {
            n = Integer.parseInt(this.dN.getItem(n).getText(0));
        }
        return n;
    }
    
    public int wU() {
        return this.dN.getItemHeight();
    }
    
    private void dN(final Composite composite, final boolean b, final String[] array, List qe, final int selection) {
        if (array.length == 0) {
            throw new RuntimeException("Invalid table, no column specified");
        }
        (this.dN = new Table((Composite)this, 66306)).setHeaderVisible(true);
        this.dN.setLinesVisible(true);
        this.ld = new ArrayList();
        if (b) {
            this.dN("Index");
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            this.dN(array[i]);
        }
        if (b) {
            this.dN.setSortColumn((TableColumn)this.ld.get(0));
            this.dN.setSortDirection(1024);
            final ArrayList<Object> list = new ArrayList<Object>(qe.size());
            int n = 0;
            for (final Comparable[] array2 : qe) {
                final Comparable[] array3 = new Comparable[this.ld.size()];
                array3[0] = new Integer(n++);
                for (int j = 0; j < array2.length; ++j) {
                    array3[j + 1] = array2[j];
                }
                list.add(array3);
            }
            qe = (ArrayList<Comparable[]>)list;
        }
        this.dN(this.QE = qe);
        final Iterator<TableColumn> iterator2 = (Iterator<TableColumn>)this.ld.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().pack();
        }
        if (selection >= 0) {
            this.dN.setSelection(selection);
        }
    }
    
    private TableColumn dN(final String text) {
        final TableColumn tableColumn = new TableColumn(this.dN, 16384);
        tableColumn.setText(text);
        tableColumn.setResizable(true);
        tableColumn.setWidth(100);
        tableColumn.addSelectionListener((SelectionListener)this);
        this.ld.add(tableColumn);
        return tableColumn;
    }
    
    private void dN(final List list) {
        for (final Comparable[] array : list) {
            final TableItem tableItem = new TableItem(this.dN, 0);
            int n = 0;
            final Comparable[] array2 = array;
            for (int length = array2.length, i = 0; i < length; ++i) {
                tableItem.setText(n++, array2[i].toString());
            }
        }
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final TableColumn sortColumn = (TableColumn)selectionEvent.widget;
        final int sortDirection = (sortColumn == this.dN.getSortColumn() && this.dN.getSortDirection() == 1024) ? 128 : 1024;
        this.dN.setSortColumn(sortColumn);
        this.dN.setSortDirection(sortDirection);
        int n = 0;
        final TableColumn[] columns = this.dN.getColumns();
        for (int length = columns.length, n2 = 0; n2 < length && columns[n2] != sortColumn; ++n2) {
            ++n;
        }
        Collections.sort((List<Object>)this.QE, new VI(this, n, sortDirection));
        this.dN.removeAll();
        this.dN(this.QE);
    }
    
    public void widgetDefaultSelected(final SelectionEvent selectionEvent) {
    }
    
    public oa dN() {
        return this.fa;
    }
    
    public void dN(oa fa) {
        if (fa == null) {
            fa = this.fa;
            if (fa == null) {
                return;
            }
        }
        int dn = -1;
        int selectionIndex = this.dN.getSelectionIndex();
        int n = 0;
        while (true) {
            selectionIndex += (fa.QE ? -1 : 1);
            if (selectionIndex >= 0) {
                if (selectionIndex < this.dN.getItemCount()) {
                    final StringBuilder sb = new StringBuilder();
                    final Comparable[] array = this.QE.get(selectionIndex);
                    for (int length = array.length, i = 0; i < length; ++i) {
                        sb.append(" " + array[i]);
                    }
                    dn = TM.dN(sb.toString(), 0, fa.dN, fa.ld, false);
                    if (dn < 0) {
                        continue;
                    }
                    this.dN.setSelection(selectionIndex);
                }
            }
            if (dn >= 0 || !fa.wU || n != 0) {
                break;
            }
            Display.getCurrent().beep();
            n = 1;
            selectionIndex = (fa.QE ? this.dN.getItemCount() : -1);
        }
        if (dn < 0) {
            Display.getCurrent().beep();
        }
        this.fa = fa;
    }
}
