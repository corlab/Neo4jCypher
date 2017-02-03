package neo4j.cypher.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import neo4j.cypher.behavior.ModifyStringFunction__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_SubstringMStringFunction_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_SubstringMStringFunction_NonTypesystemRule() {
  }
  public void applyRule(final SNode substringMStringFunction, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if ((boolean) ModifyStringFunction__BehaviorDescriptor.isNegativeInteger_id19zqIQEjWod.invoke(substringMStringFunction, SLinkOperations.getTarget(substringMStringFunction, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa4df204L, 0x12636aedaa4df205L, "start")))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(substringMStringFunction, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa4df204L, 0x12636aedaa4df205L, "start")), "Must be non negative integer", "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "1325020284374216843", null, errorTarget);
      }
    }

    if ((boolean) ModifyStringFunction__BehaviorDescriptor.isNegativeInteger_id19zqIQEjWod.invoke(substringMStringFunction, SLinkOperations.getTarget(substringMStringFunction, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa4df204L, 0x12636aedaa4df206L, "length")))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(substringMStringFunction, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa4df204L, 0x12636aedaa4df206L, "length")), "Must be non negative integer", "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "1325020284374216860", null, errorTarget);
      }
    }

  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa4df204L, "neo4j.cypher.structure.SubstringMStringFunction");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}