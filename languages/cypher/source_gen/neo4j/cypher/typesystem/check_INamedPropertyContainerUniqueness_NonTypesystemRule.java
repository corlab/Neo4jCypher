package neo4j.cypher.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;

public class check_INamedPropertyContainerUniqueness_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_INamedPropertyContainerUniqueness_NonTypesystemRule() {
  }
  public void applyRule(final SNode namedIdentifier, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SPropertyOperations.getString(namedIdentifier, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) == null) {
      return;
    }
    List<SNode> allTheSameIdentifiers = SNodeOperations.getNodeDescendants(SNodeOperations.getNodeAncestor(namedIdentifier, MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x119ac58303b87b4fL, "neo4j.cypher.structure.QueryExpression"), false, false), MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4841a8f104282c68L, "neo4j.cypher.structure.INamedIdentifier"), false, new SAbstractConcept[]{});

    for (SNode identif : allTheSameIdentifiers) {
      if (identif == namedIdentifier) {
        break;
      } else {
        if (eq_q0gvs0_a0a0a0a3a1(SPropertyOperations.getString(identif, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), SPropertyOperations.getString(namedIdentifier, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(namedIdentifier, "Identifier name " + SPropertyOperations.getString(namedIdentifier, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + " is already used", "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "6670155983237862061", null, errorTarget);
          }
          break;
        }
      }

    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4841a8f104282c68L, "neo4j.cypher.structure.INamedIdentifier");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static boolean eq_q0gvs0_a0a0a0a3a1(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}