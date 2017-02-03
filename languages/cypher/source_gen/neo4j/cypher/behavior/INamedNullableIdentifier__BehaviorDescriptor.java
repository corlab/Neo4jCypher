package neo4j.cypher.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class INamedNullableIdentifier__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4841a8f10429a6b5L, "neo4j.cypher.structure.INamedNullableIdentifier");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Boolean> isCorrectNullableIdentifierName_id4x1Ef44aqx6 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isCorrectNullableIdentifierName").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4x1Ef44aqx6").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(isCorrectNullableIdentifierName_id4x1Ef44aqx6);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static boolean isCorrectNullableIdentifierName_id4x1Ef44aqx6(@NotNull SAbstractConcept __thisConcept__, String name) {
    // nullable parameters 

    if (name != null && name.length() >= 2 && (name.charAt(name.length() - 1) == '!' || name.charAt(name.length() - 1) == '?')) {
      // check for correct identifier name without nullable ending parameter ! or ? 
      return (boolean) INamedIdentifier__BehaviorDescriptor.isCorrectIdentifierName_id4x1Ef44aqux.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4841a8f104282c68L, "neo4j.cypher.structure.INamedIdentifier").getDeclarationNode()), name.substring(0, name.length() - 1));
    }

    return (boolean) INamedIdentifier__BehaviorDescriptor.isCorrectIdentifierName_id4x1Ef44aqux.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getInterfaceConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x4841a8f104282c68L, "neo4j.cypher.structure.INamedIdentifier").getDeclarationNode()), name);
  }

  /*package*/ INamedNullableIdentifier__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Boolean) isCorrectNullableIdentifierName_id4x1Ef44aqx6(concept, (String) parameters[0]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}