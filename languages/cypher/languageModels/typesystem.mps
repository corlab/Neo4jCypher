<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1549d4d9-195d-4192-a8ca-9bdca0139ffa(neo4j.cypher.typesystem)">
  <persistence version="7" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="fa0e36f7-2d65-493a-8638-2d9c4dbffdf7(neo4j.cypher)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="qgu4" modelUID="r:f744ecfb-e681-4d00-8f57-1ca9664f32ee(neo4j.cypher.structure)" version="53" />
  <import index="tpdt" modelUID="r:00000000-0000-4000-0000-011c895902dd(jetbrains.mps.baseLanguage.blTypes.structure)" version="-1" />
  <import index="tpek" modelUID="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="npgh" modelUID="r:198dc929-1daf-4fd6-a7d4-c87445a0712a(neo4j.cypher.behavior)" version="-1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <import index="tpd4" modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" implicit="yes" />
  <import index="tp3r" modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" implicit="yes" />
  <roots>
    <node type="tpd4.NonTypesystemRule" typeId="tpd4.1195214364922" id="5206628397327256708">
      <property name="name" nameId="tpck.1169194664001" value="check_ApStringLiteral" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="lang.expression" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="5206628397327256718">
      <property name="name" nameId="tpck.1169194664001" value="typeof_ApStringLiteral" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="lang.expression" />
    </node>
    <node type="tpd4.NonTypesystemRule" typeId="tpd4.1195214364922" id="5206628397327342231">
      <property name="name" nameId="tpck.1169194664001" value="check_INamedPropertyContainer" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="lang.propertyContainer" />
    </node>
    <node type="tpd4.NonTypesystemRule" typeId="tpd4.1195214364922" id="5206628397327427256">
      <property name="name" nameId="tpck.1169194664001" value="check_INamedNullableIdentifier" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="lang.propertyContainer" />
    </node>
    <node type="tpd4.NonTypesystemRule" typeId="tpd4.1195214364922" id="5206628397327538052">
      <property name="name" nameId="tpck.1169194664001" value="check_Parameter" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="lang.expression" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="5206628397327618124">
      <property name="name" nameId="tpck.1169194664001" value="typeof_PredicateExpression" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="lang.expression" />
    </node>
  </roots>
  <root id="5206628397327256708">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327256709">
      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1221566486909">
        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1221566486910">
          <node role="statement" roleId="tpee.1068581517665" type="tpd4.ReportErrorStatement" typeId="tpd4.1175517767210" id="1221566486911">
            <node role="errorString" roleId="tpd4.1175517851849" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1221566486912">
              <property name="value" nameId="tpee.1070475926801" value="Incorrect string literal" />
            </node>
            <node role="nodeToReport" roleId="tpd4.1227096802790" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327256717">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327256710" resolveInfo="apStringLiteral" />
            </node>
          </node>
        </node>
        <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="1221566486914">
          <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1221566486915">
            <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327256713">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327256710" resolveInfo="apStringLiteral" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="5206628397327256715">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="npgh.1221565233201" resolveInfo="isCorrect" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="5206628397327256710">
      <property name="name" nameId="tpck.1169194664001" value="apStringLiteral" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="qgu4.5206628397327069922" resolveInfo="ApStringLiteral" />
    </node>
  </root>
  <root id="5206628397327256718">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327256719">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateEquationStatement" typeId="tpd4.1174658326157" id="5206628397327256745">
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="5206628397327256749">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="5206628397327256750">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="tpee.StringType" typeId="tpee.1225271177708" id="5206628397327256753" />
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="5206628397327256748">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="5206628397327256722">
            <node role="term" roleId="tpd4.1174657509053" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327256724">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327256720" resolveInfo="apStringLiteral" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="5206628397327256720">
      <property name="name" nameId="tpck.1169194664001" value="apStringLiteral" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="qgu4.5206628397327069922" resolveInfo="ApStringLiteral" />
    </node>
  </root>
  <root id="5206628397327342231">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327342232">
      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="5206628397327342235">
        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327342236">
          <node role="statement" roleId="tpee.1068581517665" type="tpd4.ReportErrorStatement" typeId="tpd4.1175517767210" id="5206628397327342282">
            <node role="errorString" roleId="tpd4.1175517851849" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="5206628397327342285">
              <property name="value" nameId="tpee.1070475926801" value="Incorrect identifier name" />
            </node>
            <node role="nodeToReport" roleId="tpd4.1227096802790" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327342286">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327342233" resolveInfo="namedIdentifier" />
            </node>
          </node>
        </node>
        <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="5206628397327342268">
          <node role="expression" roleId="tpee.1081516765348" type="tp25.StaticConceptMethodCall" typeId="tp25.1206019730951" id="5206628397327427625">
            <link role="concept" roleId="tp25.1206019820684" targetNodeId="qgu4.5206628397327330408" resolveInfo="INamedIdentifier" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="npgh.5206628397327427489" resolveInfo="isCorrectIdentifierName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5206628397327427647">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327427626">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327342233" resolveInfo="namedIdentifier" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="5206628397327427653">
                <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="5206628397327342233">
      <property name="name" nameId="tpck.1169194664001" value="namedIdentifier" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="qgu4.5206628397327330408" resolveInfo="INamedIdentifier" />
    </node>
  </root>
  <root id="5206628397327427256">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327427257">
      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="5206628397327428053">
        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327428054">
          <node role="statement" roleId="tpee.1068581517665" type="tpd4.ReportErrorStatement" typeId="tpd4.1175517767210" id="5206628397327428087">
            <node role="errorString" roleId="tpd4.1175517851849" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="5206628397327428092">
              <property name="value" nameId="tpee.1070475926801" value="Incorrect nullable identifier name" />
            </node>
            <node role="nodeToReport" roleId="tpd4.1227096802790" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327428090">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327427258" resolveInfo="namedNullableIdentifier" />
            </node>
          </node>
        </node>
        <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="5206628397327433658">
          <node role="expression" roleId="tpee.1081516765348" type="tp25.StaticConceptMethodCall" typeId="tp25.1206019730951" id="5206628397327433659">
            <link role="concept" roleId="tp25.1206019820684" targetNodeId="qgu4.5206628397327427253" resolveInfo="INamedNullableIdentifier" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="npgh.5206628397327427654" resolveInfo="isCorrectNullableIdentifierName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5206628397327433660">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327433661">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327427258" resolveInfo="namedNullableIdentifier" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="5206628397327472456">
                <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="5206628397327427258">
      <property name="name" nameId="tpck.1169194664001" value="namedNullableIdentifier" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="qgu4.5206628397327427253" resolveInfo="INamedNullableIdentifier" />
    </node>
  </root>
  <root id="5206628397327538052">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327538053">
      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="5206628397327538055">
        <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="5206628397327538089">
          <node role="expression" roleId="tpee.1081516765348" type="tp25.StaticConceptMethodCall" typeId="tp25.1206019730951" id="5206628397327538090">
            <link role="concept" roleId="tp25.1206019820684" targetNodeId="qgu4.5206628397327477991" resolveInfo="Parameter" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="npgh.5206628397327481277" resolveInfo="isCorrectParameterName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5206628397327538091">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327538092">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327538054" resolveInfo="parameter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="5206628397327538093">
                <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327538057">
          <node role="statement" roleId="tpee.1068581517665" type="tpd4.ReportErrorStatement" typeId="tpd4.1175517767210" id="5206628397327538096">
            <node role="errorString" roleId="tpd4.1175517851849" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="5206628397327538100">
              <property name="value" nameId="tpee.1070475926801" value="Incorrect parameter name" />
            </node>
            <node role="nodeToReport" roleId="tpd4.1227096802790" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327538099">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327538054" resolveInfo="parameter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="5206628397327538054">
      <property name="name" nameId="tpck.1169194664001" value="parameter" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="qgu4.5206628397327477991" resolveInfo="Parameter" />
    </node>
  </root>
  <root id="5206628397327618124">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="5206628397327618125">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateEquationStatement" typeId="tpd4.1174658326157" id="5206628397327618151">
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="5206628397327618155">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="5206628397327618156">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="tpee.BooleanType" typeId="tpee.1070534644030" id="5206628397327618158" />
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="5206628397327618154">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="5206628397327618128">
            <node role="term" roleId="tpd4.1174657509053" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="5206628397327618130">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="5206628397327618126" resolveInfo="predicateExpression" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="5206628397327618126">
      <property name="name" nameId="tpck.1169194664001" value="predicateExpression" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="qgu4.5206628397327618119" resolveInfo="PredicateExpression" />
    </node>
  </root>
</model>

