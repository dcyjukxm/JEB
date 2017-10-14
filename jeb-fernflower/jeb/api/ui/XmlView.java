package jeb.api.ui;

import jeb.api.ui.InteractiveTextView;
import jeb.api.ui.JebUI;
import jebglobal.tS;

public class XmlView extends InteractiveTextView {
   tS v;

   XmlView(JebUI var1, tS var2) {
      super(var1, var2);
      this.v = var2;
   }
}
