package neo4j.cypher.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionDescriptorBase;
import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.intentions.IntentionType;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.Collections;
import jetbrains.mps.intentions.IntentionExecutableBase;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public final class SwitchNamedPath_Intention extends IntentionDescriptorBase implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public SwitchNamedPath_Intention() {
    super(MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x432a0a2a4da444f2L, "neo4j.cypher.structure.PathExpression"), IntentionType.NORMAL, true, new SNodePointer("r:4fb5ec9d-ba5b-4bca-9e48-d719ae880364(neo4j.cypher.intentions)", "4839691926370537144"));
  }
  @Override
  public String getPresentation() {
    return "SwitchNamedPath";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SwitchNamedPath_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends IntentionExecutableBase {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Switch path to be named/unnamed";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x432a0a2a4da444f2L, 0x432a0a2a4da44e84L, "named"), "" + (!(SPropertyOperations.getBoolean(node, MetaAdapterFactory.getProperty(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x432a0a2a4da444f2L, 0x432a0a2a4da44e84L, "named")))));
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return SwitchNamedPath_Intention.this;
    }
  }
}