// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import jeb.api.IScript;
import java.io.Writer;
import org.python.util.PythonInterpreter;
import org.python.core.PySystemState;
import org.python.core.PyObject;

final class XW
{
    private PyObject dN;
    
    public XW(final eI ei, final String s, final String s2) {
        final PythonInterpreter pythonInterpreter = new PythonInterpreter((PyObject)null, new PySystemState());
        pythonInterpreter.exec(String.format("import sys", new Object[0]));
        pythonInterpreter.exec(String.format("sys.path.append(\"%s\")", s.replace("\\", "\\\\")));
        pythonInterpreter.exec(String.format("from %s import %s", s2, s2));
        pythonInterpreter.setOut((Writer)new eW(ei));
        this.dN = pythonInterpreter.get(s2);
    }
    
    public IScript dN() {
        return (IScript)this.dN.__call__().__tojava__((Class)IScript.class);
    }
}
