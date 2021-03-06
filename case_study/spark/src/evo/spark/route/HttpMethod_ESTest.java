/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:18:15 GMT 2017
 */

package spark.route;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.route.HttpMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpMethod_ESTest extends HttpMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.get("unsupported");
      assertEquals(HttpMethod.unsupported, httpMethod0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpMethod[] httpMethodArray0 = HttpMethod.values();
      assertNotNull(httpMethodArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.valueOf("before");
      assertEquals(HttpMethod.before, httpMethod0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.get("afterafter");
      assertEquals(HttpMethod.afterafter, httpMethod0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.get((String) null);
      assertEquals(HttpMethod.unsupported, httpMethod0);
  }
}
