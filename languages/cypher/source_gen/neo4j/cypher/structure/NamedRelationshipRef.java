package neo4j.cypher.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NamedRelationshipRef extends Expression implements ICypherExpression {
  public static final String concept = "neo4j.cypher.structure.NamedRelationshipRef";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAMED_RELATIONSHIP = "namedRelationship";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public NamedRelationshipRef(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(NamedRelationshipRef.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(NamedRelationshipRef.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(NamedRelationshipRef.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(NamedRelationshipRef.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(NamedRelationshipRef.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(NamedRelationshipRef.VIRTUAL_PACKAGE, value);
  }

  public Relationship getNamedRelationship() {
    return (Relationship) this.getReferent(Relationship.class, NamedRelationshipRef.NAMED_RELATIONSHIP);
  }

  public void setNamedRelationship(Relationship node) {
    super.setReferent(NamedRelationshipRef.NAMED_RELATIONSHIP, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(NamedRelationshipRef.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, NamedRelationshipRef.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, NamedRelationshipRef.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(NamedRelationshipRef.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, NamedRelationshipRef.SMODEL_ATTRIBUTE, node);
  }

  public static NamedRelationshipRef newInstance(SModel sm, boolean init) {
    return (NamedRelationshipRef) SModelUtil_new.instantiateConceptDeclaration("neo4j.cypher.structure.NamedRelationshipRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NamedRelationshipRef newInstance(SModel sm) {
    return NamedRelationshipRef.newInstance(sm, false);
  }
}