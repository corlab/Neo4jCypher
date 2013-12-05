package neo4j.cypher.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0b, fqName)) {
      case 85:
        return new QuerySheet_BehaviorDescriptor();
      case 86:
        return new QueryTupleStatement_BehaviorDescriptor();
      case 110:
        return new StartAssignmentStatement_BehaviorDescriptor();
      case 73:
        return new Node_BehaviorDescriptor();
      case 54:
        return new KeyValueNodeIndex_BehaviorDescriptor();
      case 63:
        return new LuceneIndex_BehaviorDescriptor();
      case 50:
        return new IdIndex_BehaviorDescriptor();
      case 2:
        return new AllIndex_BehaviorDescriptor();
      case 84:
        return new QueryEmptyStatement_BehaviorDescriptor();
      case 95:
        return new RelationshipType_BehaviorDescriptor();
      case 56:
        return new LRRelationship_BehaviorDescriptor();
      case 87:
        return new RLRelationship_BehaviorDescriptor();
      case 119:
        return new UndirectedRelationship_BehaviorDescriptor();
      case 114:
        return new SumAggregate_BehaviorDescriptor();
      case 65:
        return new MaxAggregate_BehaviorDescriptor();
      case 66:
        return new MinAggregate_BehaviorDescriptor();
      case 64:
        return new MatchStatement_BehaviorDescriptor();
      case 121:
        return new WhereStatement_BehaviorDescriptor();
      case 43:
        return new DistinctExpression_BehaviorDescriptor();
      case 13:
        return new ConnectionSheet_BehaviorDescriptor();
      case 45:
        return new EmptyConnectionStatement_BehaviorDescriptor();
      case 52:
        return new ImpermanentConnection_BehaviorDescriptor();
      case 68:
        return new NamedNodeRef_BehaviorDescriptor();
      case 82:
        return new Property_BehaviorDescriptor();
      case 98:
        return new ReturnStatement_BehaviorDescriptor();
      case 111:
        return new StartStatement_BehaviorDescriptor();
      case 18:
        return new CypherDotExpression_BehaviorDescriptor();
      case 76:
        return new OrderByStatement_BehaviorDescriptor();
      case 8:
        return new AscOrderBy_BehaviorDescriptor();
      case 42:
        return new DescOrderBy_BehaviorDescriptor();
      case 14:
        return new CountAggregate_BehaviorDescriptor();
      case 49:
        return new HeadScalarFunction_BehaviorDescriptor();
      case 115:
        return new TailCollFunction_BehaviorDescriptor();
      case 59:
        return new LastScalarFunction_BehaviorDescriptor();
      case 0:
        return new AbsMathFunction_BehaviorDescriptor();
      case 101:
        return new RoundMathFunction_BehaviorDescriptor();
      case 109:
        return new SqrtMathFunction_BehaviorDescriptor();
      case 106:
        return new SignMathFunction_BehaviorDescriptor();
      case 74:
        return new NodesCollFunction_BehaviorDescriptor();
      case 96:
        return new RelationshipsCollFunction_BehaviorDescriptor();
      case 61:
        return new LengthScalarFunction_BehaviorDescriptor();
      case 7:
        return new AsExpression_BehaviorDescriptor();
      case 1:
        return new AllExpression_BehaviorDescriptor();
      case 15:
        return new CreateStatement_BehaviorDescriptor();
      case 104:
        return new SetStatement_BehaviorDescriptor();
      case 41:
        return new DeleteStatement_BehaviorDescriptor();
      case 108:
        return new SkipStatement_BehaviorDescriptor();
      case 99:
        return new ReturnStatementBlock_BehaviorDescriptor();
      case 6:
        return new ApStringLiteral_BehaviorDescriptor();
      case 77:
        return new Parameter_BehaviorDescriptor();
      case 12:
        return new Collection_BehaviorDescriptor();
      case 3:
        return new AllPredicateFunction_BehaviorDescriptor();
      case 5:
        return new AnyPredicateFunction_BehaviorDescriptor();
      case 75:
        return new NonePredicateFunction_BehaviorDescriptor();
      case 107:
        return new SinglePredicateFunction_BehaviorDescriptor();
      case 81:
        return new PredicateExpression_BehaviorDescriptor();
      case 19:
        return new CypherEqualsExpression_BehaviorDescriptor();
      case 16:
        return new CypherAndExpression_BehaviorDescriptor();
      case 26:
        return new CypherOrExpression_BehaviorDescriptor();
      case 25:
        return new CypherNotExpression_BehaviorDescriptor();
      case 24:
        return new CypherNotEqualsExpression_BehaviorDescriptor();
      case 112:
        return new StrStringFunction_BehaviorDescriptor();
      case 67:
        return new ModifyStringFunction_BehaviorDescriptor();
      case 97:
        return new ReplaceMStringFunction_BehaviorDescriptor();
      case 113:
        return new SubstringMStringFunction_BehaviorDescriptor();
      case 60:
        return new LeftMStringFunction_BehaviorDescriptor();
      case 100:
        return new RightMStringFunction_BehaviorDescriptor();
      case 57:
        return new LTrimMStringFunction_BehaviorDescriptor();
      case 88:
        return new RTrimMStringFunction_BehaviorDescriptor();
      case 117:
        return new TrimMStringFunction_BehaviorDescriptor();
      case 62:
        return new LowerMStringFunction_BehaviorDescriptor();
      case 120:
        return new UpperMStringFunction_BehaviorDescriptor();
      case 28:
        return new CypherPlusExpression_BehaviorDescriptor();
      case 20:
        return new CypherIntegerConstant_BehaviorDescriptor();
      case 21:
        return new CypherMinusExpression_BehaviorDescriptor();
      case 22:
        return new CypherMulExpression_BehaviorDescriptor();
      case 33:
        return new CypherRemExpression_BehaviorDescriptor();
      case 58:
        return new LabelsCollFunction_BehaviorDescriptor();
      case 47:
        return new ExtractCollFunction_BehaviorDescriptor();
      case 102:
        return new ScalarFunction_BehaviorDescriptor();
      case 48:
        return new FilterCollFunction_BehaviorDescriptor();
      case 89:
        return new RangeCollFunction_BehaviorDescriptor();
      case 94:
        return new ReduceCollFunction_BehaviorDescriptor();
      case 118:
        return new TypeScalarFunction_BehaviorDescriptor();
      case 51:
        return new IdScalarFunction_BehaviorDescriptor();
      case 10:
        return new CoalesceScalarFunction_BehaviorDescriptor();
      case 70:
        return new NamedPropertyContainerRef_BehaviorDescriptor();
      case 71:
        return new NamedRelationshipRef_BehaviorDescriptor();
      case 17:
        return new CypherCollectionType_BehaviorDescriptor();
      case 116:
        return new TimestampScalarFunction_BehaviorDescriptor();
      case 46:
        return new EmptyNode_BehaviorDescriptor();
      case 9:
        return new AvgAggregate_BehaviorDescriptor();
      case 11:
        return new CollectAggregate_BehaviorDescriptor();
      case 80:
        return new PercentileDiscAggregate_BehaviorDescriptor();
      case 79:
        return new PercentileContAggregate_BehaviorDescriptor();
      case 78:
        return new PathExpression_BehaviorDescriptor();
      case 69:
        return new NamedPathRef_BehaviorDescriptor();
      case 105:
        return new ShortestPathFunction_BehaviorDescriptor();
      case 4:
        return new AllShortestPaths_BehaviorDescriptor();
      case 55:
        return new KeyValueRelationshipIndex_BehaviorDescriptor();
      case 27:
        return new CypherPathType_BehaviorDescriptor();
      case 32:
        return new CypherRelationshipType_BehaviorDescriptor();
      case 23:
        return new CypherNodeType_BehaviorDescriptor();
      case 29:
        return new CypherPropertyContainerType_BehaviorDescriptor();
      case 122:
        return new WithStatement_BehaviorDescriptor();
      case 83:
        return new PropertyOperation_BehaviorDescriptor();
      case 103:
        return new SetAssignmentStatement_BehaviorDescriptor();
      case 44:
        return new EmbeddedConnection_BehaviorDescriptor();
      case 40:
        return new DeleteExpression_BehaviorDescriptor();
      case 72:
        return new Neo4jExec_BehaviorDescriptor();
      case 90:
        return new ReadOnlyQueryStringExpression_BehaviorDescriptor();
      case 91:
        return new ReadOnlyQueryTupleExpression_BehaviorDescriptor();
      case 92:
        return new ReadWriteQueryStringExpression_BehaviorDescriptor();
      case 93:
        return new ReadWriteQueryTupleExpression_BehaviorDescriptor();
      case 124:
        return new WriteOnlyQueryTupleExpression_BehaviorDescriptor();
      case 31:
        return new CypherQueryTupleType_BehaviorDescriptor();
      case 123:
        return new WriteOnlyQueryStringExpression_BehaviorDescriptor();
      case 39:
        return new CypherResultTupleType_BehaviorDescriptor();
      case 30:
        return new CypherQueryExecuteMethod_BehaviorDescriptor();
      case 35:
        return new CypherResultIteratorMethod_BehaviorDescriptor();
      case 37:
        return new CypherResultIteratorTupleType_BehaviorDescriptor();
      case 34:
        return new CypherResultIteratorHasNextMethod_BehaviorDescriptor();
      case 38:
        return new CypherResultRowTupleType_BehaviorDescriptor();
      case 36:
        return new CypherResultIteratorNextMethod_BehaviorDescriptor();
      case 53:
        return new IndexedCypherResultRowMemberAccessExpression_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_846f5o_a0a0b = new String[]{"neo4j.cypher.structure.AbsMathFunction", "neo4j.cypher.structure.AllExpression", "neo4j.cypher.structure.AllIndex", "neo4j.cypher.structure.AllPredicateFunction", "neo4j.cypher.structure.AllShortestPaths", "neo4j.cypher.structure.AnyPredicateFunction", "neo4j.cypher.structure.ApStringLiteral", "neo4j.cypher.structure.AsExpression", "neo4j.cypher.structure.AscOrderBy", "neo4j.cypher.structure.AvgAggregate", "neo4j.cypher.structure.CoalesceScalarFunction", "neo4j.cypher.structure.CollectAggregate", "neo4j.cypher.structure.Collection", "neo4j.cypher.structure.ConnectionSheet", "neo4j.cypher.structure.CountAggregate", "neo4j.cypher.structure.CreateStatement", "neo4j.cypher.structure.CypherAndExpression", "neo4j.cypher.structure.CypherCollectionType", "neo4j.cypher.structure.CypherDotExpression", "neo4j.cypher.structure.CypherEqualsExpression", "neo4j.cypher.structure.CypherIntegerConstant", "neo4j.cypher.structure.CypherMinusExpression", "neo4j.cypher.structure.CypherMulExpression", "neo4j.cypher.structure.CypherNodeType", "neo4j.cypher.structure.CypherNotEqualsExpression", "neo4j.cypher.structure.CypherNotExpression", "neo4j.cypher.structure.CypherOrExpression", "neo4j.cypher.structure.CypherPathType", "neo4j.cypher.structure.CypherPlusExpression", "neo4j.cypher.structure.CypherPropertyContainerType", "neo4j.cypher.structure.CypherQueryExecuteMethod", "neo4j.cypher.structure.CypherQueryTupleType", "neo4j.cypher.structure.CypherRelationshipType", "neo4j.cypher.structure.CypherRemExpression", "neo4j.cypher.structure.CypherResultIteratorHasNextMethod", "neo4j.cypher.structure.CypherResultIteratorMethod", "neo4j.cypher.structure.CypherResultIteratorNextMethod", "neo4j.cypher.structure.CypherResultIteratorTupleType", "neo4j.cypher.structure.CypherResultRowTupleType", "neo4j.cypher.structure.CypherResultTupleType", "neo4j.cypher.structure.DeleteExpression", "neo4j.cypher.structure.DeleteStatement", "neo4j.cypher.structure.DescOrderBy", "neo4j.cypher.structure.DistinctExpression", "neo4j.cypher.structure.EmbeddedConnection", "neo4j.cypher.structure.EmptyConnectionStatement", "neo4j.cypher.structure.EmptyNode", "neo4j.cypher.structure.ExtractCollFunction", "neo4j.cypher.structure.FilterCollFunction", "neo4j.cypher.structure.HeadScalarFunction", "neo4j.cypher.structure.IdIndex", "neo4j.cypher.structure.IdScalarFunction", "neo4j.cypher.structure.ImpermanentConnection", "neo4j.cypher.structure.IndexedCypherResultRowMemberAccessExpression", "neo4j.cypher.structure.KeyValueNodeIndex", "neo4j.cypher.structure.KeyValueRelationshipIndex", "neo4j.cypher.structure.LRRelationship", "neo4j.cypher.structure.LTrimMStringFunction", "neo4j.cypher.structure.LabelsCollFunction", "neo4j.cypher.structure.LastScalarFunction", "neo4j.cypher.structure.LeftMStringFunction", "neo4j.cypher.structure.LengthScalarFunction", "neo4j.cypher.structure.LowerMStringFunction", "neo4j.cypher.structure.LuceneIndex", "neo4j.cypher.structure.MatchStatement", "neo4j.cypher.structure.MaxAggregate", "neo4j.cypher.structure.MinAggregate", "neo4j.cypher.structure.ModifyStringFunction", "neo4j.cypher.structure.NamedNodeRef", "neo4j.cypher.structure.NamedPathRef", "neo4j.cypher.structure.NamedPropertyContainerRef", "neo4j.cypher.structure.NamedRelationshipRef", "neo4j.cypher.structure.Neo4jExec", "neo4j.cypher.structure.Node", "neo4j.cypher.structure.NodesCollFunction", "neo4j.cypher.structure.NonePredicateFunction", "neo4j.cypher.structure.OrderByStatement", "neo4j.cypher.structure.Parameter", "neo4j.cypher.structure.PathExpression", "neo4j.cypher.structure.PercentileContAggregate", "neo4j.cypher.structure.PercentileDiscAggregate", "neo4j.cypher.structure.PredicateExpression", "neo4j.cypher.structure.Property", "neo4j.cypher.structure.PropertyOperation", "neo4j.cypher.structure.QueryEmptyStatement", "neo4j.cypher.structure.QuerySheet", "neo4j.cypher.structure.QueryTupleStatement", "neo4j.cypher.structure.RLRelationship", "neo4j.cypher.structure.RTrimMStringFunction", "neo4j.cypher.structure.RangeCollFunction", "neo4j.cypher.structure.ReadOnlyQueryStringExpression", "neo4j.cypher.structure.ReadOnlyQueryTupleExpression", "neo4j.cypher.structure.ReadWriteQueryStringExpression", "neo4j.cypher.structure.ReadWriteQueryTupleExpression", "neo4j.cypher.structure.ReduceCollFunction", "neo4j.cypher.structure.RelationshipType", "neo4j.cypher.structure.RelationshipsCollFunction", "neo4j.cypher.structure.ReplaceMStringFunction", "neo4j.cypher.structure.ReturnStatement", "neo4j.cypher.structure.ReturnStatementBlock", "neo4j.cypher.structure.RightMStringFunction", "neo4j.cypher.structure.RoundMathFunction", "neo4j.cypher.structure.ScalarFunction", "neo4j.cypher.structure.SetAssignmentStatement", "neo4j.cypher.structure.SetStatement", "neo4j.cypher.structure.ShortestPathFunction", "neo4j.cypher.structure.SignMathFunction", "neo4j.cypher.structure.SinglePredicateFunction", "neo4j.cypher.structure.SkipStatement", "neo4j.cypher.structure.SqrtMathFunction", "neo4j.cypher.structure.StartAssignmentStatement", "neo4j.cypher.structure.StartStatement", "neo4j.cypher.structure.StrStringFunction", "neo4j.cypher.structure.SubstringMStringFunction", "neo4j.cypher.structure.SumAggregate", "neo4j.cypher.structure.TailCollFunction", "neo4j.cypher.structure.TimestampScalarFunction", "neo4j.cypher.structure.TrimMStringFunction", "neo4j.cypher.structure.TypeScalarFunction", "neo4j.cypher.structure.UndirectedRelationship", "neo4j.cypher.structure.UpperMStringFunction", "neo4j.cypher.structure.WhereStatement", "neo4j.cypher.structure.WithStatement", "neo4j.cypher.structure.WriteOnlyQueryStringExpression", "neo4j.cypher.structure.WriteOnlyQueryTupleExpression"};
}
