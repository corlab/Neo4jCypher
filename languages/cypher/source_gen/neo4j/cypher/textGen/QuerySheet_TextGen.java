package neo4j.cypher.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class QuerySheet_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.append("Cypher Query Definitions: ");
    this.append(SPropertyOperations.getString(node, "name"));
    this.appendNewLine();
    this.appendNewLine();
    this.indentBuffer();
    this.increaseDepth();
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "statement", true)).isNotEmpty()) {
      for (SNode item : SLinkOperations.getTargets(node, "statement", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
      }
    }
    this.decreaseDepth();
  }

  public String getExtension(SNode node) {
    return "cypherq";
  }
}
