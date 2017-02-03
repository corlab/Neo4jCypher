package neo4j.cypher.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.Node;
import org.graphstream.ui.view.Viewer;

public class QueryStringVisualisationStatement_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_eq20dz_a(editorContext, node);
  }
  private EditorCell createCollection_eq20dz_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_eq20dz_a");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createCollection_eq20dz_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createCollection_eq20dz_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_eq20dz_a0");
    editorCell.addEditorCell(this.createCollection_eq20dz_a0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_eq20dz_b0a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_eq20dz_c0a(editorContext, node));
    return editorCell;
  }
  private EditorCell createCollection_eq20dz_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_eq20dz_a0a");
    editorCell.addEditorCell(this.createRefNode_eq20dz_a0a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_eq20dz_b0a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_eq20dz_c0a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_eq20dz_d0a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_eq20dz_a0a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new QueryStringVisualisationStatement_Editor.typeSingleRoleHandler_eq20dz_a0a0(node, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb88fL, "type"), editorContext);
    return provider.createCell();
  }
  private class typeSingleRoleHandler_eq20dz_a0a0 extends SingleRoleCellProvider {
    public typeSingleRoleHandler_eq20dz_a0a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb88fL, "type"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb88fL, "type"), child));
        installCellInfo(child, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }

    protected boolean isCompatibilityMode() {
      return false;
    }

    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb88fL, "type"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("type");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb88fL, "type")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_type");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no type>";
    }
  }
  private EditorCell createProperty_eq20dz_b0a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_eq20dz_c0a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=");
    editorCell.setCellId("Constant_eq20dz_c0a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_eq20dz_d0a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new QueryStringVisualisationStatement_Editor.queryExpressionSingleRoleHandler_eq20dz_d0a0(node, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb892L, "queryExpression"), editorContext);
    return provider.createCell();
  }
  private class queryExpressionSingleRoleHandler_eq20dz_d0a0 extends SingleRoleCellProvider {
    public queryExpressionSingleRoleHandler_eq20dz_d0a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb892L, "queryExpression"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb892L, "queryExpression"), child));
        installCellInfo(child, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }

    protected boolean isCompatibilityMode() {
      return false;
    }

    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb892L, "queryExpression"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("queryExpression");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x36087ce47f4eb88eL, 0x36087ce47f4eb892L, "queryExpression")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_queryExpression");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no queryExpression>";
    }
  }
  private EditorCell createConstant_eq20dz_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_eq20dz_b0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_eq20dz_c0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_eq20dz_c0a");
    editorCell.addEditorCell(this.createJComponent_eq20dz_a2a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createJComponent_eq20dz_a2a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = EditorCell_Component.createComponentCell(editorContext, node, QueryStringVisualisationStatement_Editor._QueryFunction_JComponent_eq20dz_a0c0a(node, editorContext), "_eq20dz_a2a0");
    editorCell.setCellId("JComponent_eq20dz_a2a0");
    return editorCell;
  }
  private static JComponent _QueryFunction_JComponent_eq20dz_a0c0a(final SNode node, final EditorContext editorContext) {

    JPanel mypanel = new JPanel();
    mypanel.setSize(200, 200);
    mypanel.setLayout(new BorderLayout());
    mypanel.setPreferredSize(new Dimension(200, 200));
    Graph graph = new SingleGraph("test1");
    graph.addAttribute("ui.quality");
    graph.addAttribute("ui.antialias");
    // graph.addAttribute("ui.stylesheet", "url('/tmp/testt/graphstyle.css')"); 
    graph.addAttribute("ui.stylesheet", "graph {    padding : 50px;    arrow-shape: arrow;}node {    text-alignment:center;    size-mode: fit;    fill-color: #A5ABB6;    size: 40px;    stroke-width: 2px;    stroke-mode: plain;    stroke-color: #9AA1AC;    text-mode:normal;}");
    Node a = graph.addNode("A");
    Node b = graph.addNode("B");
    Node c = graph.addNode("C");
    a.addAttribute("ui.label", "A");
    b.addAttribute("ui.label", "B");
    c.addAttribute("ui.label", "C");
    graph.addEdge("AB", "A", "B");
    graph.addEdge("BC", "B", "C");
    graph.addEdge("CA", "C", "A");
    Viewer swing_viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
    swing_viewer.enableAutoLayout();
    mypanel.add(swing_viewer.addDefaultView(false), BorderLayout.CENTER);

    return mypanel;
  }
}