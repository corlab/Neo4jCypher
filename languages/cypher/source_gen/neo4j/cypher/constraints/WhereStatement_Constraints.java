package neo4j.cypher.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class WhereStatement_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer canBeAncesctorBreakingPoint = new SNodePointer("r:7c28ecee-5ab5-4b97-b9e6-691aea2e2951(neo4j.cypher.constraints)", "5206628397327733825");

  public WhereStatement_Constraints() {
    super("neo4j.cypher.structure.WhereStatement");
  }

  @Override
  public boolean hasOwnCanBeAncestorMethod() {
    return true;
  }

  @Override
  public boolean canBeAncestor(SNode node, @Nullable SNode childNode, SNode childConcept, IOperationContext context, @Nullable CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAnAncestor(node, childNode, childConcept, context);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeAncesctorBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeAnAncestor(SNode node, SNode childNode, SNode childConcept, final IOperationContext operationContext) {
    return SConceptOperations.isSubConceptOf(childConcept, "neo4j.cypher.structure.IWhereExpression") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.DotExpression") || SConceptOperations.isSubConceptOf(childConcept, "neo4j.cypher.structure.Property") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.BooleanConstant") || SConceptOperations.isSubConceptOf(childConcept, "neo4j.cypher.structure.ApStringLiteral") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.IntegerLiteral") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.FloatingPointConstant") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.StringLiteral") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.PlusExpression") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.MinusExpression") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.MulExpression") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.DivExpression") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.RemExpression") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.structure.BinaryCompareOperation");
    // <node> 
  }
}
