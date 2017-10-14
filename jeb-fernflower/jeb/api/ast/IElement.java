package jeb.api.ast;

import java.util.List;

public interface IElement {
   List getSubElements();

   boolean replaceSubElement(IElement var1, IElement var2);

   void attachTag(String var1, Object var2);

   Object retrieveTag(String var1);
}
