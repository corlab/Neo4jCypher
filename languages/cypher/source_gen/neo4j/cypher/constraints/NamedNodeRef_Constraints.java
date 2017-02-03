package neo4j.cypher.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNode;
import neo4j.cypher.behavior.CypherStatement__BehaviorDescriptor;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.apache.log4j.Level;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class NamedNodeRef_Constraints extends BaseConstraintsDescriptor {
  public NamedNodeRef_Constraints() {
    super(MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x3d018fbe2434a1cdL, "neo4j.cypher.structure.NamedNodeRef"));
  }

  protected static Logger LOG = LogManager.getLogger(NamedNodeRef_Constraints.class);
  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x3d018fbe2434a1cdL, 0x3d018fbe2434a1ceL, "node1"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x3d018fbe2434a1cdL, 0x3d018fbe2434a1ceL), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {

            if (SNodeOperations.isInstanceOf(_context.getContextNode(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x3d018fbe2434a1cdL, "neo4j.cypher.structure.NamedNodeRef"))) {
              if (LOG.isInfoEnabled()) {
                LOG.info("reference for node name:" + SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getContextNode(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x3d018fbe2434a1cdL, "neo4j.cypher.structure.NamedNodeRef")), MetaAdapterFactory.getReferenceLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x3d018fbe2434a1cdL, 0x3d018fbe2434a1ceL, "node1")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
              }
            }

            if (LOG.isInfoEnabled()) {
              LOG.info("Start f crossing");
            }

            // order for reference visibility 
            final SNode currCypherStatement = (SNodeOperations.isInstanceOf(_context.getContextNode(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4cbf2dbb00e54a8bL, "neo4j.cypher.structure.CypherStatement")) ? SNodeOperations.cast(_context.getContextNode(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4cbf2dbb00e54a8bL, "neo4j.cypher.structure.CypherStatement")) : SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4cbf2dbb00e54a8bL, "neo4j.cypher.structure.CypherStatement"), false, false));
            final int currCypherStatementOrder = (int) CypherStatement__BehaviorDescriptor.getOrder_id5ypxT2QuGvp.invoke(currCypherStatement);

            final List<SNode> nodes = new ArrayList<SNode>();

            // traversing all nodes, add reference to that which have less or equal ordering number 
            ListSequence.fromList(SNodeOperations.getNodeDescendants(SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x119ac58303b87b4fL, "neo4j.cypher.structure.QueryExpression"), false, false), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4cbf2dbb00e54a8bL, "neo4j.cypher.structure.CypherStatement"), false, new SAbstractConcept[]{})).visitAll(new IVisitor<SNode>() {
              public void visit(SNode it) {
                int currNodeOrder = (int) CypherStatement__BehaviorDescriptor.getOrder_id5ypxT2QuGvp.invoke(SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4cbf2dbb00e54a8bL, "neo4j.cypher.structure.CypherStatement")));

                boolean addAll = false;

                if (LOG.isInfoEnabled()) {
                  LOG.info("currNodeOrder:" + currNodeOrder + " alias:" + SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(it), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias")) + " curr cypher statement:" + SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(currCypherStatement), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias")) + " order:" + currCypherStatementOrder);
                }

                if (currNodeOrder < currCypherStatementOrder) {
                  addAll = true;
                } else if (currNodeOrder == currCypherStatementOrder) {
                  if (LOG.isInfoEnabled()) {
                    LOG.info("the same orders, indeces of them are (curr node order, reference node order): " + SNodeOperations.getIndexInParent(currCypherStatement) + " " + SNodeOperations.getIndexInParent(it));
                  }

                  if (it == currCypherStatement) {
                    if (LOG.isInfoEnabled()) {
                      LOG.info("cypher statement nodes are the same");
                    }
                    // FIXME - IOrderedExpression 

                    final SNode nodeOrderedExpression = SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x7a3bb6c9eea6c001L, "neo4j.cypher.structure.IOrderedExpression"), false, false);

                    if ((nodeOrderedExpression != null)) {
                      final List<SNode> visibleCypherStatementNodes = new ArrayList<SNode>();

                      ListSequence.fromList(SNodeOperations.getNodeDescendants(it, MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x119ac58303ba8e11L, "neo4j.cypher.structure.Node"), false, new SAbstractConcept[]{})).visitAll(new IVisitor<SNode>() {
                        public void visit(SNode it) {

                          SNode itOrderedExpression = SNodeOperations.getNodeAncestor(it, MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x7a3bb6c9eea6c001L, "neo4j.cypher.structure.IOrderedExpression"), false, false);

                          if (isNotEmptyString(SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))) && (itOrderedExpression != null)) {
                            // FIXME debug this code 
                            if (SNodeOperations.getIndexInParent(itOrderedExpression) <= SNodeOperations.getIndexInParent(nodeOrderedExpression)) {
                              ListSequence.fromList(visibleCypherStatementNodes).addElement(it);
                            }
                          } else {
                            if (LOG.isEnabledFor(Level.WARN)) {
                              LOG.warn("node out of IOrderedExpression inside the same CypherStatement");
                            }
                            ListSequence.fromList(visibleCypherStatementNodes).addElement(it);
                          }
                        }
                      });

                      ListSequence.fromList(nodes).addSequence(ListSequence.fromList(visibleCypherStatementNodes));

                    } else {
                      // if we are not in ordered expression, we can see all nodes inside one CypherStatement 
                      // because we dont know how to order nodes  
                      addAll = true;
                    }
                  } else if (SNodeOperations.getIndexInParent(it) <= SNodeOperations.getIndexInParent(currCypherStatement)) {
                    if (LOG.isInfoEnabled()) {
                      LOG.info("added nodes with indeces");
                    }
                    addAll = true;
                  }
                }

                if (addAll) {
                  ListSequence.fromList(nodes).addSequence(ListSequence.fromList(SNodeOperations.getNodeDescendants(it, MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x119ac58303ba8e11L, "neo4j.cypher.structure.Node"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
                    public boolean accept(SNode it) {
                      return isNotEmptyString(SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
                    }
                  }));
                }
              }
            });

            ListSequence.fromList(nodes).visitAll(new IVisitor<SNode>() {
              public void visit(SNode it) {
                SNode cypherStatement = SNodeOperations.getNodeAncestor(it, MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4cbf2dbb00e54a8bL, "neo4j.cypher.structure.CypherStatement"), false, false);
                SNodeOperations.getIndexInParent(cypherStatement);
                if (LOG.isInfoEnabled()) {
                  LOG.info("node:" + SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + " statement:" + SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(cypherStatement), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias")) + " index:" + SNodeOperations.getIndexInParent(cypherStatement) + " parent alias:" + SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(cypherStatement)), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias")) + " curr pos Order:" + currCypherStatementOrder);
                }

              }
            });

            // delete statement post process 

            return nodes;
          }
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_t1tmaf_a0a1a0a0a1a0b0a1a2;
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_t1tmaf_a0a1a0a0a1a0b0a1a2 = new SNodePointer("r:7c28ecee-5ab5-4b97-b9e6-691aea2e2951(neo4j.cypher.constraints)", "2580830369696542275");
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}