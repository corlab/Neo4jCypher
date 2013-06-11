package neo4j.cypher.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.IValidIdentifier_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public abstract class NamedIndex_BehaviorDescriptor extends Index_BehaviorDescriptor implements IValidIdentifier_BehaviorDescriptor {
  public NamedIndex_BehaviorDescriptor() {
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "neo4j.cypher.structure.NamedIndex";
  }
}
