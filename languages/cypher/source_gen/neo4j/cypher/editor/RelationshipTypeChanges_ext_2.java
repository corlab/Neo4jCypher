package neo4j.cypher.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.menus.GroupMenuPart;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.transformation.ConstraintsFilteringTransformationMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.SingleItemMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItemBase;
import jetbrains.mps.nodeEditor.cellMenu.SideTransformCompletionActionItem;
import jetbrains.mps.openapi.editor.menus.transformation.ConstraintsVerifiableActionItem;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import neo4j.cypher.behavior.Relationship__BehaviorDescriptor;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class RelationshipTypeChanges_ext_2 extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.RIGHT_SIDE_TRANSFORM);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.RIGHT_SIDE_TRANSFORM).contains(_context.getMenuLocation())) {
      result.add(new RelationshipTypeChanges_ext_2.TransformationMenuPart_Group_ydlweb_a0());
      result.add(new RelationshipTypeChanges_ext_2.TransformationMenuPart_Group_ydlweb_b0());
    }
    return result;
  }

  public class TransformationMenuPart_Group_ydlweb_a0 extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
    @Override
    protected boolean isApplicable(TransformationMenuContext _context) {
      return !(SNodeOperations.isInstanceOf(_context.getNode(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x2546b228cbcc2439L, "neo4j.cypher.structure.LRRelationship")));
    }

    @Override
    protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
      return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new ConstraintsFilteringTransformationMenuPartDecorator(new RelationshipTypeChanges_ext_2.TransformationMenuPart_Group_ydlweb_a0.TransformationMenuPart_Action_ydlweb_a0a(), MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x2546b228cbcc2439L, "neo4j.cypher.structure.LRRelationship")));
    }
    private class TransformationMenuPart_Action_ydlweb_a0a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        return new RelationshipTypeChanges_ext_2.TransformationMenuPart_Group_ydlweb_a0.TransformationMenuPart_Action_ydlweb_a0a.Item(context);
      }

      private class Item extends ActionItemBase implements SideTransformCompletionActionItem, ConstraintsVerifiableActionItem {
        private final TransformationMenuContext _context;

        private Item(TransformationMenuContext context) {
          _context = context;
        }

        @Nullable
        @Override
        public String getLabelText(String pattern) {
          return ">";
        }

        @Override
        public void execute(@NotNull String pattern) {
          SNode lr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x2546b228cbcc2439L, "neo4j.cypher.structure.LRRelationship"));
          Relationship__BehaviorDescriptor.copyRelationshipProperties_id5Hm4srjMhJY.invoke(lr, _context.getNode());
          SNodeOperations.replaceWithAnother(_context.getNode(), lr);
          SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), lr, SelectionManager.LAST_CELL, 0);
          SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), lr, SelectionManager.FIRST_ERROR_CELL + "|" + SelectionManager.FOCUS_POLICY_CELL + "|" + SelectionManager.FIRST_EDITABLE_CELL + "|" + SelectionManager.FIRST_CELL, -1);
        }


        @Nullable
        @Override
        public SAbstractConcept getOutputConcept() {
          return MetaAdapterFactory.getConcept(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x2546b228cbcc2439L, "neo4j.cypher.structure.LRRelationship");
        }
      }
    }
  }
  public class TransformationMenuPart_Group_ydlweb_b0 extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
    @Override
    protected boolean isApplicable(TransformationMenuContext _context) {
      return SPropertyOperations.getBoolean(_context.getNode(), MetaAdapterFactory.getProperty(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x637ffba7f2948fabL, 0x3d300249aaf2a1c7L, "concrete")) == false;
    }

    @Override
    protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
      return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new RelationshipTypeChanges_ext_2.TransformationMenuPart_Group_ydlweb_b0.TransformationMenuPart_Action_ydlweb_a1a());
    }
    private class TransformationMenuPart_Action_ydlweb_a1a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        return new RelationshipTypeChanges_ext_2.TransformationMenuPart_Group_ydlweb_b0.TransformationMenuPart_Action_ydlweb_a1a.Item(context);
      }

      private class Item extends ActionItemBase implements SideTransformCompletionActionItem {
        private final TransformationMenuContext _context;

        private Item(TransformationMenuContext context) {
          _context = context;
        }

        @Nullable
        @Override
        public String getLabelText(String pattern) {
          return "]";
        }

        @Override
        public void execute(@NotNull String pattern) {
          SPropertyOperations.set(_context.getNode(), MetaAdapterFactory.getProperty(0xfa0e36f72d65493aL, 0x86382d9c4dbffdf7L, 0x637ffba7f2948fabL, 0x3d300249aaf2a1c7L, "concrete"), "" + (true));
          SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), _context.getNode(), SelectionManager.FIRST_ERROR_CELL + "|" + SelectionManager.FOCUS_POLICY_CELL + "|" + SelectionManager.FIRST_EDITABLE_CELL + "|" + SelectionManager.FIRST_CELL, -1);
        }


      }
    }
  }
}