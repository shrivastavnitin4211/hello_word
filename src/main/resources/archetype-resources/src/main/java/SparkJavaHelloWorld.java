#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class SparkJavaHelloWorld implements SparkApplication{

  @Override
  public void init(){
    get("/hello", (req, res) -> {
      return "Hello World!";
    });
  }

}