package neo4j.cypher.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NamedPropertyContainerRef_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_NamedPropertyContainerRef_InferenceRule() {
  }
  public void applyRule(final SNode namedPropertyContainerRef, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(namedPropertyContainerRef, MetaAdapterFactory.getReferenceLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x6de5edabd1c16436L, 0x6de5edabd1c16437L, "propertyContainer")))), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x119ac58303ba8e11L, "neo4j.cypher.structure.Node"))) {
      {
        SNode _nodeToCheck_1029348928467 = namedPropertyContainerRef;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "3322546954560764783", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "3322546954560764788", true), (SNode) _quotation_createNode_3l0sac_a0a0a0b(), _info_12389875345);
      }
    } else if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(namedPropertyContainerRef, MetaAdapterFactory.getReferenceLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x6de5edabd1c16436L, 0x6de5edabd1c16437L, "propertyContainer")))), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x637ffba7f2948fabL, "neo4j.cypher.structure.Relationship"))) {
      {
        SNode _nodeToCheck_1029348928467 = namedPropertyContainerRef;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "3322546954560764776", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "3322546954560764781", true), (SNode) _quotation_createNode_3l0sac_a0a0a0a1(), _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = namedPropertyContainerRef;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "3322546954560732178", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)", "3322546954560732155", true), (SNode) _quotation_createNode_3l0sac_a0a0a0a1_0(), _info_12389875345);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x6de5edabd1c16436L, "neo4j.cypher.structure.NamedPropertyContainerRef");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_3l0sac_a0a0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x50477d247907df48L, "neo4j.cypher.structure.CypherNodeType"), null, null, false);
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_3l0sac_a0a0a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x50477d247907df47L, "neo4j.cypher.structure.CypherRelationshipType"), null, null, false);
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_3l0sac_a0a0a0a1_0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x1381ca8dfd0fe0b2L, "neo4j.cypher.structure.CypherPropertyContainerType"), null, null, false);
    return quotedNode_1;
  }
}