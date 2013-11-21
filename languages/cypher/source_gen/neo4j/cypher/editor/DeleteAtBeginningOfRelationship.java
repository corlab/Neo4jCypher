package neo4j.cypher.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import neo4j.cypher.behavior.Relationship_Behavior;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.openapi.editor.selection.SelectionManager;

public class DeleteAtBeginningOfRelationship {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new DeleteAtBeginningOfRelationship.DeleteAtBeginningOfRelationship_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new DeleteAtBeginningOfRelationship.DeleteAtBeginningOfRelationship_BACKSPACE(node));
  }

  public static class DeleteAtBeginningOfRelationship_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public DeleteAtBeginningOfRelationship_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.isInstanceOf(node, "neo4j.cypher.structure.RLRelationship")) {
        SNode uni = SConceptOperations.createNewNode("neo4j.cypher.structure.UndirectedRelationship", null);
        Relationship_Behavior.call_copyRelationshipProperties_6581467451102927870(uni, node);
        SNodeOperations.replaceWithAnother(node, uni);
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, SLinkOperations.getTarget(uni, "leftExpression", true), SelectionManager.LAST_EDITABLE_CELL, -1);
      } else {
        SNode replacingNode = SLinkOperations.getTarget(node, "leftExpression", true);
        SNodeOperations.replaceWithAnother(node, replacingNode);
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, replacingNode, SelectionManager.LAST_CELL, -1);
      }
    }
  }

  public static class DeleteAtBeginningOfRelationship_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public DeleteAtBeginningOfRelationship_BACKSPACE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.isInstanceOf(node, "neo4j.cypher.structure.RLRelationship")) {
        if (1 < 5) {
          throw new RuntimeException("test");
        }
        SNode uni = SConceptOperations.createNewNode("neo4j.cypher.structure.UndirectedRelationship", null);
        Relationship_Behavior.call_copyRelationshipProperties_6581467451102927870(uni, node);
        SNodeOperations.replaceWithAnother(node, uni);
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, SLinkOperations.getTarget(uni, "leftExpression", true), SelectionManager.LAST_EDITABLE_CELL, -1);
      } else {
        SNode replacingNode = SLinkOperations.getTarget(node, "rightExpression", true);
        SNodeOperations.replaceWithAnother(node, replacingNode);
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, replacingNode, SelectionManager.FIRST_CELL, -1);
      }
    }
  }
}
