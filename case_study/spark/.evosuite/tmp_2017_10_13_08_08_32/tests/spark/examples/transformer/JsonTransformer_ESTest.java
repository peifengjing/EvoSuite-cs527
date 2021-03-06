/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:32:10 GMT 2017
 */

package spark.examples.transformer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.examples.transformer.JsonTransformer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonTransformer_ESTest extends JsonTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonTransformer jsonTransformer0 = new JsonTransformer();
      String string0 = jsonTransformer0.render("`H)3B{!4iIJ");
      assertEquals("\"`H)3B{!4iIJ\"", string0);
  }
}
