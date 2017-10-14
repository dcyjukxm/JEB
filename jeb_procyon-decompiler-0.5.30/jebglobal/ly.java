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

public final class ly extends Composite implements QW, ZE
{
    private Tree dN;
    private List ld;
    private TreeItem QE;
    private Button wU;
    private boolean fa;
    private Pattern zs;
    private AR mS;
    private oa OK;
    
    public ly(final Composite composite, final Font font, final AR ms, final boolean b, final String s) {
        super(composite, 0);
        this.setLayout((Layout)new FillLayout());
        final Composite composite2 = new Composite((Composite)this, 0);
        composite2.setLayout((Layout)new FormLayout());
        (this.wU = new Button(composite2, 32)).setText("Show inner classes");
        final FormData layoutData = new FormData();
        layoutData.left = new FormAttachment(0);
        layoutData.right = new FormAttachment(100);
        layoutData.bottom = new FormAttachment(100);
        layoutData.height = this.wU.computeSize(-1, -1).y;
        this.wU.setLayoutData((Object)layoutData);
        (this.dN = new Tree(composite2, 2048)).setLayout((Layout)new FillLayout());
        this.dN.setFont(font);
        final FormData layoutData2 = new FormData();
        layoutData2.left = new FormAttachment(0);
        layoutData2.right = new FormAttachment(100);
        layoutData2.top = new FormAttachment(0);
        layoutData2.bottom = new FormAttachment((Control)this.wU);
        this.dN.setLayoutData((Object)layoutData2);
        this.mS = ms;
        this.ld = new ArrayList();
        this.fa = b;
        this.zs = null;
        if (s != null) {
            try {
                this.zs = Pattern.compile(s.trim());
            }
            catch (PatternSyntaxException ex) {
                cn.dN(String.format("Invalid package name blacklist: %s", s));
            }
        }
        this.wU.setSelection(b);
        this.wU.addSelectionListener((SelectionListener)new VS(this));
        this.KK();
    }
    
    public void setFont(final Font font) {
        this.dN.setFont(font);
    }
    
    public boolean dN(final String s, final String s2, final String text) {
        for (final TreeItem treeItem : this.ld) {
            final Boolean b = (Boolean)treeItem.getData("terminal");
            if (b != null && b) {
                final String s3 = (String)treeItem.getData("signature");
                if (s3 != null && s3.equals(s)) {
                    treeItem.setText(text);
                    treeItem.setData("signature", (Object)s2);
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    public void KK() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        jebglobal/ly.dN:Lorg/eclipse/swt/widgets/Tree;
        //     4: invokevirtual   org/eclipse/swt/widgets/Tree.removeAll:()V
        //     7: aload_0        
        //     8: getfield        jebglobal/ly.ld:Ljava/util/List;
        //    11: invokeinterface java/util/List.clear:()V
        //    16: aload_0        
        //    17: aconst_null    
        //    18: putfield        jebglobal/ly.QE:Lorg/eclipse/swt/widgets/TreeItem;
        //    21: new             Ljava/util/ArrayList;
        //    24: dup            
        //    25: invokespecial   java/util/ArrayList.<init>:()V
        //    28: astore_1       
        //    29: aload_0        
        //    30: getfield        jebglobal/ly.mS:Ljebglobal/AR;
        //    33: invokevirtual   jebglobal/AR.Hw:()Ljava/util/List;
        //    36: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    41: astore_2       
        //    42: aload_2        
        //    43: invokeinterface java/util/Iterator.hasNext:()Z
        //    48: ifeq            93
        //    51: aload_2        
        //    52: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    57: checkcast       Ljebglobal/yK;
        //    60: astore_3       
        //    61: aload_0        
        //    62: getfield        jebglobal/ly.fa:Z
        //    65: ifne            78
        //    68: aload_3        
        //    69: invokevirtual   jebglobal/yK.dN:()Z
        //    72: ifeq            78
        //    75: goto            42
        //    78: aload_1        
        //    79: aload_3        
        //    80: iconst_1       
        //    81: invokevirtual   jebglobal/yK.dN:(Z)Ljava/lang/String;
        //    84: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    89: pop            
        //    90: goto            42
        //    93: new             Ljava/util/TreeMap;
        //    96: dup            
        //    97: invokespecial   java/util/TreeMap.<init>:()V
        //   100: astore_2       
        //   101: aload_1        
        //   102: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   107: astore_3       
        //   108: aload_3        
        //   109: invokeinterface java/util/Iterator.hasNext:()Z
        //   114: ifeq            270
        //   117: aload_3        
        //   118: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   123: checkcast       Ljava/lang/String;
        //   126: astore          4
        //   128: aload           4
        //   130: iconst_1       
        //   131: aload           4
        //   133: invokevirtual   java/lang/String.length:()I
        //   136: iconst_1       
        //   137: isub           
        //   138: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   141: ldc             "/"
        //   143: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   146: astore          5
        //   148: aload_2        
        //   149: astore          6
        //   151: iconst_1       
        //   152: istore          7
        //   154: aload           5
        //   156: astore          8
        //   158: aload           8
        //   160: arraylength    
        //   161: istore          9
        //   163: iconst_0       
        //   164: istore          10
        //   166: iload           10
        //   168: iload           9
        //   170: if_icmpge       267
        //   173: aload           8
        //   175: iload           10
        //   177: aaload         
        //   178: astore          11
        //   180: iload           7
        //   182: iinc            7, 1
        //   185: aload           5
        //   187: arraylength    
        //   188: if_icmpge       213
        //   191: new             Ljava/lang/StringBuilder;
        //   194: dup            
        //   195: invokespecial   java/lang/StringBuilder.<init>:()V
        //   198: bipush          33
        //   200: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   203: aload           11
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: astore          11
        //   213: aload           6
        //   215: aload           11
        //   217: invokevirtual   java/util/TreeMap.containsKey:(Ljava/lang/Object;)Z
        //   220: ifeq            238
        //   223: aload           6
        //   225: aload           11
        //   227: invokevirtual   java/util/TreeMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   230: checkcast       Ljava/util/TreeMap;
        //   233: astore          6
        //   235: goto            261
        //   238: new             Ljava/util/TreeMap;
        //   241: dup            
        //   242: invokespecial   java/util/TreeMap.<init>:()V
        //   245: astore          12
        //   247: aload           6
        //   249: aload           11
        //   251: aload           12
        //   253: invokevirtual   java/util/TreeMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   256: pop            
        //   257: aload           12
        //   259: astore          6
        //   261: iinc            10, 1
        //   264: goto            166
        //   267: goto            108
        //   270: aload_0        
        //   271: aload_2        
        //   272: invokespecial   jebglobal/ly.ld:(Ljava/util/TreeMap;)Ljava/util/TreeMap;
        //   275: astore_2       
        //   276: aload_2        
        //   277: invokevirtual   java/util/TreeMap.keySet:()Ljava/util/Set;
        //   280: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   285: astore_3       
        //   286: aload_3        
        //   287: invokeinterface java/util/Iterator.hasNext:()Z
        //   292: ifeq            364
        //   295: aload_3        
        //   296: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   301: checkcast       Ljava/lang/String;
        //   304: astore          4
        //   306: new             Lorg/eclipse/swt/widgets/TreeItem;
        //   309: dup            
        //   310: aload_0        
        //   311: getfield        jebglobal/ly.dN:Lorg/eclipse/swt/widgets/Tree;
        //   314: iconst_0       
        //   315: invokespecial   org/eclipse/swt/widgets/TreeItem.<init>:(Lorg/eclipse/swt/widgets/Tree;I)V
        //   318: astore          5
        //   320: aload           5
        //   322: aload           4
        //   324: ldc             "!"
        //   326: ldc             ""
        //   328: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   331: invokevirtual   org/eclipse/swt/widgets/TreeItem.setText:(Ljava/lang/String;)V
        //   334: aload_0        
        //   335: getfield        jebglobal/ly.dN:Lorg/eclipse/swt/widgets/Tree;
        //   338: aload           5
        //   340: invokevirtual   org/eclipse/swt/widgets/Tree.showItem:(Lorg/eclipse/swt/widgets/TreeItem;)V
        //   343: aload_0        
        //   344: getfield        jebglobal/ly.dN:Lorg/eclipse/swt/widgets/Tree;
        //   347: aload           5
        //   349: aload_2        
        //   350: aload           4
        //   352: invokevirtual   java/util/TreeMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   355: checkcast       Ljava/util/Map;
        //   358: invokestatic    jebglobal/ly.dN:(Lorg/eclipse/swt/widgets/Tree;Lorg/eclipse/swt/widgets/TreeItem;Ljava/util/Map;)V
        //   361: goto            286
        //   364: aload_0        
        //   365: aload_0        
        //   366: getfield        jebglobal/ly.dN:Lorg/eclipse/swt/widgets/Tree;
        //   369: invokevirtual   org/eclipse/swt/widgets/Tree.getItems:()[Lorg/eclipse/swt/widgets/TreeItem;
        //   372: iconst_0       
        //   373: invokespecial   jebglobal/ly.dN:([Lorg/eclipse/swt/widgets/TreeItem;Z)V
        //   376: return         
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2234)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2156)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2190)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2167)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2180)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2156)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2190)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2167)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2180)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2156)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1271)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:972)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:976)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2505)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:586)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:397)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void dN(final TreeItem[] array, final boolean b) {
        for (final TreeItem treeItem : array) {
            treeItem.setData("index", (Object)this.ld.size());
            final String dn = this.dN(treeItem);
            treeItem.setData("signature", (Object)dn);
            this.ld.add(treeItem);
            boolean b2 = false;
            if (b) {
                treeItem.setExpanded(false);
                b2 = true;
            }
            else if (this.zs != null && this.zs.matcher(dn.substring(1, dn.length() - 1).replace('/', '.')).matches()) {
                treeItem.setExpanded(false);
                b2 = true;
            }
            final TreeItem[] items = treeItem.getItems();
            if (items.length == 0) {
                treeItem.setData("terminal", (Object)true);
            }
            else {
                this.dN(items, b2);
            }
        }
    }
    
    public void dN(final SelectionListener selectionListener) {
        this.dN.addSelectionListener(selectionListener);
    }
    
    private static void dN(final Tree tree, final TreeItem treeItem, final Map map) {
        for (final String s : map.keySet()) {
            final TreeItem treeItem2 = new TreeItem(treeItem, 0);
            treeItem2.setText(s.replace("!", ""));
            tree.showItem(treeItem2);
            dN(tree, treeItem2, (Map)map.get(s));
        }
    }
    
    private boolean dN(final TreeMap treeMap) {
        return treeMap != null && treeMap.size() == 1 && !treeMap.values().iterator().next().isEmpty();
    }
    
    private TreeMap ld(TreeMap treeMap) {
        int i;
        do {
            i = 0;
            final TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap>>>> treeMap2 = new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap>>>>();
            for (final String s : treeMap.keySet()) {
                final TreeMap<String, TreeMap<String, TreeMap<String, TreeMap>>> treeMap3 = treeMap.get(s);
                if (this.dN(treeMap3)) {
                    final String s2 = treeMap3.keySet().iterator().next();
                    treeMap2.put(s + "." + s2, (TreeMap<String, TreeMap<String, TreeMap<String, TreeMap>>>)treeMap3.get(s2));
                    ++i;
                }
                else {
                    treeMap2.put(s, treeMap3);
                }
            }
            treeMap = treeMap2;
        } while (i > 0);
        for (final String s3 : treeMap.keySet()) {
            treeMap.put(s3, this.ld(treeMap.get(s3)));
        }
        return treeMap;
    }
    
    public void dN(final String s) {
        if (s == null) {
            if (this.QE != null) {
                this.QE.setBackground((Color)null);
                this.QE = null;
            }
            return;
        }
        if (this.dN == null) {
            return;
        }
        String s2 = s.substring(1, s.length() - 1).replace('/', '.');
        TreeItem[] array = this.dN.getItems();
        TreeItem qe = null;
        while (qe == null) {
            boolean b = true;
            for (final TreeItem treeItem : array) {
                final String text = treeItem.getText();
                if (s2.startsWith(text)) {
                    final String substring = s2.substring(text.length());
                    if (substring.length() == 0) {
                        if (treeItem == null || treeItem.getData("terminal") != null) {
                            qe = treeItem;
                            b = false;
                            break;
                        }
                    }
                    else if (substring.charAt(0) == '.') {
                        s2 = substring.substring(1);
                        array = treeItem.getItems();
                        b = false;
                        break;
                    }
                }
            }
            if (b) {
                break;
            }
        }
        if (qe == this.QE) {
            return;
        }
        if (this.QE != null) {
            this.QE.setBackground((Color)null);
        }
        final TreeItem[] selection = this.dN.getSelection();
        if (selection != null && selection.length >= 1 && s.equals(selection[0].getData("signature"))) {
            this.QE = null;
            return;
        }
        if ((this.QE = qe) == null) {
            return;
        }
        qe.setBackground(HC.dN().dN(255, 192, 192));
    }
    
    public oa dN() {
        return this.OK;
    }
    
    public void dN(oa ok) {
        if (ok == null) {
            ok = this.OK;
            if (ok == null) {
                return;
            }
        }
        final TreeItem[] selection = this.dN.getSelection();
        if (selection != null && selection.length >= 1) {
            final TreeItem treeItem = selection[0];
            int dn = -1;
            int intValue = (int)treeItem.getData("index");
            int n = 0;
            while (true) {
                intValue += (ok.QE ? -1 : 1);
                if (intValue >= 0) {
                    if (intValue < this.ld.size()) {
                        final TreeItem selection2 = this.ld.get(intValue);
                        if (selection2.getData("terminal") == null) {
                            continue;
                        }
                        dn = TM.dN((String)selection2.getData("signature"), 0, ok.dN, ok.ld, false);
                        if (dn < 0) {
                            continue;
                        }
                        this.dN.setSelection(selection2);
                    }
                }
                if (dn >= 0 || !ok.wU || n != 0) {
                    break;
                }
                Display.getCurrent().beep();
                n = 1;
                intValue = (ok.QE ? this.ld.size() : -1);
            }
            if (dn < 0) {
                Display.getCurrent().beep();
            }
            this.OK = ok;
        }
    }
    
    private String dN(TreeItem parentItem) {
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
