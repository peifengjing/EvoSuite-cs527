/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 02:00:33 GMT 2017
 */

package org.asynchttpclient.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.IOException;
import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.HttpResponseStatus;
import org.asynchttpclient.Request;
import org.asynchttpclient.filter.FilterContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilterContext_ESTest extends FilterContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder1 = filterContext_FilterContextBuilder0.replayRequest(true);
      FilterContext<Object> filterContext0 = filterContext_FilterContextBuilder1.build();
      boolean boolean0 = filterContext0.replayRequest();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<String>();
      HttpResponseStatus httpResponseStatus0 = mock(HttpResponseStatus.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpResponseStatus0).toString();
      filterContext_FilterContextBuilder0.responseStatus(httpResponseStatus0);
      FilterContext<String> filterContext0 = filterContext_FilterContextBuilder0.build();
      filterContext0.getResponseStatus();
      assertFalse(filterContext0.replayRequest());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      AsyncHandler<Object> asyncHandler0 = (AsyncHandler<Object>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(asyncHandler0).toString();
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder1 = filterContext_FilterContextBuilder0.asyncHandler(asyncHandler0);
      FilterContext<Object> filterContext0 = filterContext_FilterContextBuilder1.build();
      filterContext0.getAsyncHandler();
      assertFalse(filterContext0.replayRequest());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      FilterContext<Object> filterContext0 = filterContext_FilterContextBuilder0.build();
      filterContext0.getRequest();
      assertFalse(filterContext0.replayRequest());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<String>();
      FilterContext<String> filterContext0 = filterContext_FilterContextBuilder0.build();
      filterContext0.getIOException();
      assertFalse(filterContext0.replayRequest());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<String>();
      FilterContext<String> filterContext0 = filterContext_FilterContextBuilder0.build();
      filterContext0.getResponseStatus();
      assertFalse(filterContext0.replayRequest());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<String>();
      FilterContext<String> filterContext0 = filterContext_FilterContextBuilder0.build();
      filterContext0.getAsyncHandler();
      assertFalse(filterContext0.replayRequest());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      FilterContext<Object> filterContext0 = filterContext_FilterContextBuilder0.build();
      boolean boolean0 = filterContext0.replayRequest();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<String>();
      FilterContext<String> filterContext0 = filterContext_FilterContextBuilder0.build();
      filterContext0.getResponseHeaders();
      assertFalse(filterContext0.replayRequest());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder1 = filterContext_FilterContextBuilder0.ioException((IOException) null);
      assertNotNull(filterContext_FilterContextBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<String>();
      AsyncHandler<String> asyncHandler0 = filterContext_FilterContextBuilder0.getAsyncHandler();
      assertNull(asyncHandler0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder1 = filterContext_FilterContextBuilder0.request((Request) null);
      assertNotNull(filterContext_FilterContextBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      Request request0 = filterContext_FilterContextBuilder0.getRequest();
      assertNull(request0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<Object>();
      FilterContext.FilterContextBuilder<Object> filterContext_FilterContextBuilder1 = filterContext_FilterContextBuilder0.responseHeaders((HttpHeaders) null);
      assertNotNull(filterContext_FilterContextBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder0 = new FilterContext.FilterContextBuilder<String>();
      FilterContext<String> filterContext0 = filterContext_FilterContextBuilder0.build();
      FilterContext.FilterContextBuilder<String> filterContext_FilterContextBuilder1 = new FilterContext.FilterContextBuilder<String>(filterContext0);
      assertFalse(filterContext0.replayRequest());
  }
}