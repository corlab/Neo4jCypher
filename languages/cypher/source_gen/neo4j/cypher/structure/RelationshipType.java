package neo4j.cypher.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.IValidIdentifier;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RelationshipType extends Expression implements ICypherExpression, IValidIdentifier, IMatchExpression, IInnerMatchExpression {
  public static final String concept = "neo4j.cypher.structure.RelationshipType";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public RelationshipType(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(RelationshipType.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RelationshipType.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RelationshipType.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RelationshipType.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RelationshipType.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RelationshipType.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(RelationshipType.NAME);
  }

  public void setName(String value) {
    this.setProperty(RelationshipType.NAME, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(RelationshipType.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, RelationshipType.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, RelationshipType.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(RelationshipType.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, RelationshipType.SMODEL_ATTRIBUTE, node);
  }

  public static RelationshipType newInstance(SModel sm, boolean init) {
    return (RelationshipType) SModelUtil_new.instantiateConceptDeclaration("neo4j.cypher.structure.RelationshipType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RelationshipType newInstance(SModel sm) {
    return RelationshipType.newInstance(sm, false);
  }
}