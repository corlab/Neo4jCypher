package neo4j.cypher.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.lang.traceable.behavior.TraceableConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class QueryEmptyStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.createPositionInfo(this, node);
    }
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.fillPositionInfo(this, node, TraceableConcept_Behavior.call_getTraceableProperty_5067982036267369901(SNodeOperations.cast(node, "jetbrains.mps.lang.traceable.structure.TraceableConcept")));
    }
  }
}
