package neo4j.cypher.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class PathExpression_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    if (SPropertyOperations.getBoolean(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x432a0a2a4da444f2L, 0x432a0a2a4da44e84L, "named"))) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      tgs.append("=");
    }

    tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x432a0a2a4da444f2L, 0x432a0a2a4da507d3L, "expression")));
  }
}