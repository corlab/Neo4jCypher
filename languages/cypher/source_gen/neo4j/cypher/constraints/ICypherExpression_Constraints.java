package neo4j.cypher.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class ICypherExpression_Constraints extends BaseConstraintsDescriptor {
  public ICypherExpression_Constraints() {
    super(MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4cbf2dbb00e3a2beL, "neo4j.cypher.structure.ICypherExpression"));
  }

  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }
  @Override
  public boolean canBeChild(@Nullable SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(node, parentNode, link, childConcept, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
  }
  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    return SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConceptDeclaration(parentNode)), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x119ac58303b87b4fL, "neo4j.cypher.structure.QueryExpression")) || (SNodeOperations.getNodeAncestor(parentNode, MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x119ac58303b87b4fL, "neo4j.cypher.structure.QueryExpression"), false, false) != null) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConceptDeclaration(parentNode)), MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x112103dd1e8L, "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence")) || (SNodeOperations.getNodeAncestor(parentNode, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x112103dd1e8L, "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence"), false, false) != null);
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:7c28ecee-5ab5-4b97-b9e6-691aea2e2951(neo4j.cypher.constraints)", "5915353355168151170");
}