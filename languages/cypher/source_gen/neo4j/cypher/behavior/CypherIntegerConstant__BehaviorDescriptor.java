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
import org.jetbrains.mps.openapi.module.SModule;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class CypherIntegerConstant__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa51802cL, "neo4j.cypher.structure.CypherIntegerConstant");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Object> getCompileTimeConstantValue_idi1LP2xI = new SMethodBuilder<Object>(new SJavaCompoundTypeImpl(Object.class)).name("getCompileTimeConstantValue").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i1LP2xI").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(SModule.class, ""));
  public static final SMethod<Object> eval_idhEwJgmp = new SMethodBuilder<Object>(new SJavaCompoundTypeImpl(Object.class)).name("eval").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwJgmp").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(SModule.class, ""));
  public static final SMethod<Boolean> constant_id1653mnvAgr2 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("constant").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1653mnvAgr2").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getCompileTimeConstantValue_idi1LP2xI, eval_idhEwJgmp, constant_id1653mnvAgr2);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Object getCompileTimeConstantValue_idi1LP2xI(@NotNull SNode __thisNode__, SModule module) {
    return SPropertyOperations.getInteger(__thisNode__, MetaAdapterFactory.getProperty(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa51802cL, 0xf8cc59b315L, "value"));
  }
  /*package*/ static Object eval_idhEwJgmp(@NotNull SNode __thisNode__, SModule module) {
    return SPropertyOperations.getInteger(__thisNode__, MetaAdapterFactory.getProperty(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x12636aedaa51802cL, 0xf8cc59b315L, "value"));
  }
  /*package*/ static boolean constant_id1653mnvAgr2(@NotNull SAbstractConcept __thisConcept__) {
    return true;
  }

  /*package*/ CypherIntegerConstant__BehaviorDescriptor() {
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
      case 0:
        return (T) ((Object) getCompileTimeConstantValue_idi1LP2xI(node, (SModule) parameters[0]));
      case 1:
        return (T) ((Object) eval_idhEwJgmp(node, (SModule) parameters[0]));
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
      case 2:
        return (T) ((Boolean) constant_id1653mnvAgr2(concept));
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