package neo4j.cypher.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class typeof_QueryTupleStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_QueryTupleStatement_InferenceRule() {
  }

  public void applyRule(final SNode queryTupleStatement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (LOG.isInfoEnabled()) {
      LOG.info("querytuple statement type checking");
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(queryTupleStatement, "queryExpression", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "5915353355199042921", 0, null);
      typeCheckingContext.createEquation((SNode) SLinkOperations.getTarget(queryTupleStatement, "type", true), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "5915353355199042953", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "neo4j.cypher.structure.QueryTupleStatement";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  protected static Logger LOG = LogManager.getLogger(typeof_QueryTupleStatement_InferenceRule.class);
}
