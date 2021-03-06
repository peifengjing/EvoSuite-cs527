/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:37:50 GMT 2017
 */

package spark;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.servlet.http.HttpServletRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.Request;
import spark.Response;
import spark.ResponseTransformer;
import spark.ResponseTransformerRouteImpl;
import spark.Route;
import spark.RouteImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResponseTransformerRouteImpl_ESTest extends ResponseTransformerRouteImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RouteImpl routeImpl0 = RouteImpl.create("", (Route) null);
      ResponseTransformer responseTransformer0 = mock(ResponseTransformer.class, new ViolatedAssumptionAnswer());
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("", (Route) routeImpl0, responseTransformer0);
      ResponseTransformer responseTransformer1 = mock(ResponseTransformer.class, new ViolatedAssumptionAnswer());
      doReturn("1SCO4BZabdB{KE$p^").when(responseTransformer1).render(any());
      ResponseTransformerRouteImpl responseTransformerRouteImpl1 = ResponseTransformerRouteImpl.create("", "", (Route) responseTransformerRouteImpl0, responseTransformer1);
      Object object0 = responseTransformerRouteImpl1.render((Object) null);
      assertEquals("1SCO4BZabdB{KE$p^", object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("Cannot mix IPv4 and IPv6: ", (Route) null, (ResponseTransformer) null);
      try { 
        responseTransformerRouteImpl0.render("A0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.ResponseTransformerRouteImpl$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ResponseTransformer responseTransformer0 = mock(ResponseTransformer.class, new ViolatedAssumptionAnswer());
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("", (Route) null, responseTransformer0);
      Request request0 = new Request((HttpServletRequest) null);
      try { 
        responseTransformerRouteImpl0.handle(request0, (Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.ResponseTransformerRouteImpl$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ResponseTransformer responseTransformer0 = mock(ResponseTransformer.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(responseTransformer0).render(any());
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("g@<g", "g@<g", (Route) null, responseTransformer0);
      Object object0 = responseTransformerRouteImpl0.render("OI_L5&<");
      assertNull(object0);
  }
}
