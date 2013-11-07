package neo4j.cypher.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class StartStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.append("START ");
    this.increaseDepth();
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "startStatements", true)).isNotEmpty()) {
      for (SNode item : SLinkOperations.getTargets(node, "startStatements", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "startStatements", true)).last()) {
          this.append(", ");
        }
      }
    }
    this.append(" ");
    this.decreaseDepth();
  }
}
