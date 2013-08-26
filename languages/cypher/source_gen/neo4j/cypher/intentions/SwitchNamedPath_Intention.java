package neo4j.cypher.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class SwitchNamedPath_Intention extends BaseIntention implements Intention {
  public SwitchNamedPath_Intention() {
  }

  public String getConcept() {
    return "neo4j.cypher.structure.PathExpression";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Switch path to be named/unnamed";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(node, "named", "" + (!(SPropertyOperations.getBoolean(node, "named"))));
  }

  public String getLocationString() {
    return "neo4j.cypher.intentions";
  }
}
