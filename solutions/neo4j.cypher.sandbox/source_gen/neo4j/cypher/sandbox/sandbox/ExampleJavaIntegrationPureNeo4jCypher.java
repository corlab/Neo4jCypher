package neo4j.cypher.sandbox.sandbox;

/*Generated by MPS */

import java.util.Map;
import java.util.HashMap;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.graphdb.ResourceIterator;
import jetbrains.mps.internal.collections.runtime.IMapping;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class ExampleJavaIntegrationPureNeo4jCypher {


  public static void main(String[] args) {

    System.out.println("Running " + ExampleJavaIntegrationPureNeo4jCypher.class.getCanonicalName());

    Map<String, String> config = new HashMap<String, String>();
    config.put("neostore.nodestore.db.mapped_memory", "10M");
    config.put("string_block_size", "60");
    config.put("array_block_size", "300");

    GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabaseBuilder("solutions/neo4j.cypher.runtime/database").setConfig(config).newGraphDatabase();

    ExecutionResult result = new ExecutionEngine(graphDb).execute("START nod234 = node(*) WHERE nod234.name = \"john\" RETURN nod234 ");

    System.out.println("neo4jCypherWriteOnlyQueryExec: ");
    writeResult(new ExecutionEngine(graphDb).execute("CREATE (n{name:\"my node\"}) "));

    System.out.println("neo4jCypherReadOnlyQueryExec: ");
    writeResult(new ExecutionEngine(graphDb).execute("START n = node(*) WHERE n.name! = \"my node\" RETURN n,n.name ORDER BY n.name "));

    System.out.println("neo4jCypherReadWriteQueryExec: ");
    writeResult(new ExecutionEngine(graphDb).execute("START n = node(*) WHERE n.name! = \"my node\" SET n.name = \"my new node\" RETURN n,n.name "));
  }



  public static void writeResult(ExecutionResult result) {
    System.out.println("Result:");

    ResourceIterator<Map<String, Object>> iterator = result.iterator();
    while (iterator.hasNext()) {
      for (IMapping<String, Object> i : MapSequence.fromMap(iterator.next())) {
        // <node> 
        System.out.println(" -- " + i.key() + "=" + i.value());
      }
    }
  }


}
