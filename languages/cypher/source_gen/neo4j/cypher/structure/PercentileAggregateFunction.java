package neo4j.cypher.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PercentileAggregateFunction extends AggregateFunction {
  public static final String concept = "neo4j.cypher.structure.PercentileAggregateFunction";

  public PercentileAggregateFunction(SNode node) {
    super(node);
  }

  public static PercentileAggregateFunction newInstance(SModel sm, boolean init) {
    return (PercentileAggregateFunction) SModelUtil_new.instantiateConceptDeclaration("neo4j.cypher.structure.PercentileAggregateFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PercentileAggregateFunction newInstance(SModel sm) {
    return PercentileAggregateFunction.newInstance(sm, false);
  }
}