package jebglobal;

import jeb.api.IScript;
import jebglobal.eI;
import jebglobal.eW;
import org.python.core.PyObject;
import org.python.core.PySystemState;
import org.python.util.PythonInterpreter;

final class XW {
   private PyObject dN;

   public XW(eI var1, String var2, String var3) {
      PythonInterpreter var4 = new PythonInterpreter((PyObject)null, new PySystemState());
      var4.exec(String.format("import sys", new Object[0]));
      var4.exec(String.format("sys.path.append(\"%s\")", new Object[]{var2.replace("\\", "\\\\")}));
      var4.exec(String.format("from %s import %s", new Object[]{var3, var3}));
      var4.setOut(new eW(var1));
      this.dN = var4.get(var3);
   }

   public IScript dN() {
      PyObject var1 = this.dN.__call__();
      return (IScript)var1.__tojava__(IScript.class);
   }
}
