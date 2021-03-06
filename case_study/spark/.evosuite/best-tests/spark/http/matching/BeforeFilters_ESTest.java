/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:11:10 GMT 2017
 */

package spark.http.matching;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.http.matching.BeforeFilters;
import spark.http.matching.Body;
import spark.http.matching.RouteContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeforeFilters_ESTest extends BeforeFilters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        BeforeFilters.execute((RouteContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.http.matching.BeforeFilters", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext1 = routeContext0.withMatcher(routes0);
      Body body0 = Body.create();
      routeContext0.withBody(body0);
      BeforeFilters.execute(routeContext1);
      assertNull(routeContext1.uri());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BeforeFilters beforeFilters0 = new BeforeFilters();
  }
}
