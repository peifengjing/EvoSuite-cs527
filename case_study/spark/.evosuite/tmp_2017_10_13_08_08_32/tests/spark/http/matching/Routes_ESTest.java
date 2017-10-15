/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 16:32:05 GMT 2017
 */

package spark.http.matching;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.ModelAndView;
import spark.ResponseTransformer;
import spark.ResponseTransformerRouteImpl;
import spark.Route;
import spark.RouteImpl;
import spark.TemplateEngine;
import spark.TemplateViewRoute;
import spark.TemplateViewRouteImpl;
import spark.examples.transformer.JsonTransformer;
import spark.http.matching.Body;
import spark.http.matching.RequestWrapper;
import spark.http.matching.ResponseWrapper;
import spark.http.matching.RouteContext;
import spark.http.matching.Routes;
import spark.route.HttpMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Routes_ESTest extends Routes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext2 = routeContext1.withMatcher(routes0);
      ResponseWrapper responseWrapper0 = ResponseWrapper.create();
      routeContext1.withResponseWrapper(responseWrapper0);
      RouteContext routeContext3 = routeContext0.withUri("}nTRW");
      body0.set(routeContext2);
      HttpMethod httpMethod0 = HttpMethod.head;
      RequestWrapper requestWrapper0 = RequestWrapper.create();
      routeContext3.withRequestWrapper(requestWrapper0);
      routeContext2.withHttpMethod(httpMethod0);
      ModelAndView modelAndView0 = new ModelAndView(body0, "opw\"ThFD!k3C");
      TemplateViewRoute templateViewRoute0 = mock(TemplateViewRoute.class, new ViolatedAssumptionAnswer());
      doReturn((ModelAndView) null).when(templateViewRoute0).handle(any(spark.Request.class) , any(spark.Response.class));
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("opw\"ThFD!k3C", "}nTRW", templateViewRoute0, templateEngine0);
      JsonTransformer jsonTransformer0 = new JsonTransformer();
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("}nTRW", (Route) templateViewRouteImpl0, (ResponseTransformer) jsonTransformer0);
      routes0.add(httpMethod0, (RouteImpl) responseTransformerRouteImpl0);
      try { 
        Routes.execute(routeContext3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext2 = routeContext1.withMatcher(routes0);
      ResponseWrapper responseWrapper0 = ResponseWrapper.create();
      routeContext1.withResponseWrapper(responseWrapper0);
      RouteContext routeContext3 = routeContext0.withUri("}nTRW");
      HttpMethod httpMethod0 = HttpMethod.head;
      RequestWrapper requestWrapper0 = RequestWrapper.create();
      routeContext3.withRequestWrapper(requestWrapper0);
      routeContext2.withHttpMethod(httpMethod0);
      ModelAndView modelAndView0 = mock(ModelAndView.class, new ViolatedAssumptionAnswer());
      TemplateViewRoute templateViewRoute0 = mock(TemplateViewRoute.class, new ViolatedAssumptionAnswer());
      doReturn((ModelAndView) null).when(templateViewRoute0).handle(any(spark.Request.class) , any(spark.Response.class));
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("opw\"ThFD!k3C", "}nTRW", templateViewRoute0, templateEngine0);
      JsonTransformer jsonTransformer0 = new JsonTransformer();
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("}nTRW", (Route) templateViewRouteImpl0, (ResponseTransformer) jsonTransformer0);
      routes0.add(httpMethod0, (RouteImpl) responseTransformerRouteImpl0);
      try { 
        Routes.execute(routeContext3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext2 = routeContext1.withMatcher(routes0);
      ResponseWrapper responseWrapper0 = ResponseWrapper.create();
      routeContext1.withResponseWrapper(responseWrapper0);
      RouteContext routeContext3 = routeContext0.withUri("}nTRW");
      HttpMethod httpMethod0 = HttpMethod.head;
      RequestWrapper requestWrapper0 = RequestWrapper.create();
      routeContext3.withRequestWrapper(requestWrapper0);
      routeContext3.withResponse(responseWrapper0);
      routeContext2.withHttpMethod(httpMethod0);
      TemplateViewRoute templateViewRoute0 = mock(TemplateViewRoute.class, new ViolatedAssumptionAnswer());
      doReturn((ModelAndView) null).when(templateViewRoute0).handle(any(spark.Request.class) , any(spark.Response.class));
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("opw\"ThFD!k3C", "}nTRW", templateViewRoute0, templateEngine0);
      JsonTransformer jsonTransformer0 = new JsonTransformer();
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("}nTRW", (Route) templateViewRouteImpl0, (ResponseTransformer) jsonTransformer0);
      routes0.add(httpMethod0, (RouteImpl) responseTransformerRouteImpl0);
      // Undeclared exception!
      try { 
        Routes.execute(routeContext3);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext2 = routeContext1.withMatcher(routes0);
      ResponseWrapper responseWrapper0 = ResponseWrapper.create();
      routeContext1.withResponseWrapper(responseWrapper0);
      RouteContext routeContext3 = routeContext0.withUri("}nTRW");
      HttpMethod httpMethod0 = HttpMethod.head;
      RequestWrapper requestWrapper0 = RequestWrapper.create();
      routeContext3.withRequestWrapper(requestWrapper0);
      routeContext2.withHttpMethod(httpMethod0);
      TemplateViewRoute templateViewRoute0 = mock(TemplateViewRoute.class, new ViolatedAssumptionAnswer());
      doReturn((ModelAndView) null).when(templateViewRoute0).handle(any(spark.Request.class) , any(spark.Response.class));
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("opw\"ThFD!k3C", "}nTRW", templateViewRoute0, templateEngine0);
      JsonTransformer jsonTransformer0 = new JsonTransformer();
      ResponseTransformerRouteImpl responseTransformerRouteImpl0 = ResponseTransformerRouteImpl.create("}nTRW", (Route) templateViewRouteImpl0, (ResponseTransformer) jsonTransformer0);
      routes0.add(httpMethod0, (RouteImpl) responseTransformerRouteImpl0);
      try { 
        Routes.execute(routeContext3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext2 = routeContext1.withMatcher(routes0);
      ResponseWrapper responseWrapper0 = ResponseWrapper.create();
      routeContext1.withResponseWrapper(responseWrapper0);
      RouteContext routeContext3 = routeContext0.withUri("t}nTRW");
      HttpMethod httpMethod0 = HttpMethod.head;
      RequestWrapper requestWrapper0 = RequestWrapper.create();
      routeContext3.withRequestWrapper(requestWrapper0);
      routeContext2.withHttpMethod(httpMethod0);
      TemplateViewRoute templateViewRoute0 = mock(TemplateViewRoute.class, new ViolatedAssumptionAnswer());
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("", "t}nTRW", templateViewRoute0, templateEngine0);
      ModelAndView modelAndView0 = new ModelAndView(templateViewRouteImpl0, "");
      TemplateViewRoute templateViewRoute1 = mock(TemplateViewRoute.class, new ViolatedAssumptionAnswer());
      doReturn((ModelAndView) null, (ModelAndView) null, (ModelAndView) null).when(templateViewRoute1).handle(any(spark.Request.class) , any(spark.Response.class));
      TemplateEngine templateEngine1 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(templateEngine1).render(any(spark.ModelAndView.class));
      TemplateViewRouteImpl templateViewRouteImpl1 = TemplateViewRouteImpl.create("t}nTRW", "", templateViewRoute1, templateEngine1);
      routes0.add(httpMethod0, (RouteImpl) templateViewRouteImpl1);
      Routes.execute(routeContext1);
      Routes.execute(routeContext3);
      Routes.execute(routeContext0);
      assertEquals("t}nTRW", routeContext0.uri());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext2 = routeContext1.withMatcher(routes0);
      body0.set(routeContext2);
      HttpMethod httpMethod0 = HttpMethod.head;
      RouteContext routeContext3 = routeContext2.withHttpMethod(httpMethod0);
      Routes.execute(routeContext3);
      assertTrue(body0.isSet());
      assertFalse(body0.notSet());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      RouteContext routeContext2 = routeContext1.withMatcher(routes0);
      HttpMethod httpMethod0 = HttpMethod.head;
      RouteContext routeContext3 = routeContext2.withHttpMethod(httpMethod0);
      Routes.execute(routeContext3);
      assertFalse(body0.isSet());
      assertTrue(body0.notSet());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RouteContext routeContext0 = RouteContext.create();
      Body body0 = Body.create();
      RouteContext routeContext1 = routeContext0.withBody(body0);
      spark.route.Routes routes0 = spark.route.Routes.create();
      routeContext1.withMatcher(routes0);
      Routes.execute(routeContext1);
      assertNull(routeContext1.uri());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Routes routes0 = new Routes();
  }
}