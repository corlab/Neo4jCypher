package neo4j.cypher.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RightMStringFunction extends ModifyStringFunction {
  public static final String concept = "neo4j.cypher.structure.RightMStringFunction";
  public static final String LENGTH = "length";

  public RightMStringFunction(SNode node) {
    super(node);
  }

  public Expression getLength() {
    return (Expression) this.getChild(Expression.class, RightMStringFunction.LENGTH);
  }

  public void setLength(Expression node) {
    super.setChild(RightMStringFunction.LENGTH, node);
  }

  public static RightMStringFunction newInstance(SModel sm, boolean init) {
    return (RightMStringFunction) SModelUtil_new.instantiateConceptDeclaration("neo4j.cypher.structure.RightMStringFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RightMStringFunction newInstance(SModel sm) {
    return RightMStringFunction.newInstance(sm, false);
  }
}