package neo4j.cypher.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class AllIndex_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_m531el_a(editorContext, node);
  }

  private EditorCell createCollection_m531el_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_m531el_a");
    editorCell.addEditorCell(this.createConstant_m531el_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_m531el_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_m531el_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_m531el_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_m531el_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "node");
    editorCell.setCellId("Constant_m531el_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_m531el_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_m531el_b0");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_m531el_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "*");
    editorCell.setCellId("Constant_m531el_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_m531el_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_m531el_d0");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
