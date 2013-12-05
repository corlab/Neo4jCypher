package neo4j.cypher.sandbox.sandbox;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import java.util.List;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Path;

public class ExampleJavaIntegrationWithTuples {


  public static void main(String[] args) {
    Tuples._2<Integer, String> tplexample = MultiTuple.<Integer,String>from(5435, "dfsd");
    System.out.println("tuple:" + (int) tplexample._0());

    ExampleNamedTuple exampleNamedTuple = new ExampleNamedTuple("John", 45, 443);
    System.out.println("name:" + exampleNamedTuple.name());
    List<String> list;

    System.out.println("example" + tplexample);
    System.out.println("example tuple call:" + getExampleNamedTuple());

    String cypherroq = "START tuplenode = node(*), tuplenode2 = node(*) MATCH tcesta=tuplenode-[rel1]-tuplenode2 RETURN tuplenode,tuplenode2,\"str1\",\"str2\",rel1,tcesta ";

    String cypherroq2 = cypherroq;
    cypherroq.toString();
    String result = cypherroq.toString();

    String resultIt = result.toString();

    while (resultIt.toString().equals("permanent")) {
      String row = resultIt.toString();
      System.out.println("tuplenode:" + null + null);

      Relationship relationship = null;
      Path path = null;

      System.out.println("rel type:" + relationship.getType());
      System.out.println("path length:" + path.length());
    }




    ExampleJavaIntegrationCypherString asd = new ExampleJavaIntegrationCypherString();
    asd.hashCode();

    System.out.println("typed:" + cypherroq);
    System.out.println("Result" + result);
  }



  public static ExampleNamedTuple getExampleNamedTuple() {
    System.out.println("example named tuple");

    return new ExampleNamedTuple("Bill", 64, 453);
  }




}
