/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:08:00 GMT 2017
 */

package spark.embeddedserver.jetty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.embeddedserver.jetty.HttpRequestWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpRequestWrapper_ESTest extends HttpRequestWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServletInputStream servletInputStream0 = mock(ServletInputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(servletInputStream0).read(any(byte[].class));
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(servletInputStream0).when(httpServletRequest0).getInputStream();
      doReturn(":,", ":,").when(httpServletRequest0).getHeader(anyString());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      // Undeclared exception!
      httpRequestWrapper0.getInputStream();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      httpServletRequestWrapper0.setRequest(httpRequestWrapper0);
      // Undeclared exception!
      try { 
        httpRequestWrapper0.getInputStream();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServletInputStream servletInputStream0 = mock(ServletInputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(servletInputStream0).read(any(byte[].class));
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(servletInputStream0).when(httpServletRequest0).getInputStream();
      doReturn("kys#|cT", "kys#|cT").when(httpServletRequest0).getHeader(anyString());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      // Undeclared exception!
      httpRequestWrapper0.getInputStream();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpRequestWrapper httpRequestWrapper0 = null;
      try {
        httpRequestWrapper0 = new HttpRequestWrapper((HttpServletRequest) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request cannot be null
         //
         verifyException("javax.servlet.ServletRequestWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((ServletInputStream) null).when(httpServletRequest0).getInputStream();
      doReturn((String) null, (String) null).when(httpServletRequest0).getHeader(anyString());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      // Undeclared exception!
      try { 
        httpRequestWrapper0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ServletInputStream servletInputStream0 = mock(ServletInputStream.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(servletInputStream0).read(any(byte[].class));
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(servletInputStream0).when(httpServletRequest0).getInputStream();
      doReturn("kys#|cT", "kys#|cT", "rQ>}H9<E8ET>", "sprVxutilOsIOU)tils").when(httpServletRequest0).getHeader(anyString());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      ServletInputStream servletInputStream1 = httpRequestWrapper0.getInputStream();
      ServletInputStream servletInputStream2 = httpRequestWrapper0.getInputStream();
      assertFalse(httpRequestWrapper0.notConsumed());
      assertNotSame(servletInputStream2, servletInputStream1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((ServletInputStream) null).when(httpServletRequest0).getInputStream();
      doReturn("g-h9kM,ok", "multipart/form-data").when(httpServletRequest0).getHeader(anyString());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      httpRequestWrapper0.getInputStream();
      assertFalse(httpRequestWrapper0.notConsumed());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ServletInputStream servletInputStream0 = mock(ServletInputStream.class, new ViolatedAssumptionAnswer());
      doReturn("\"ZUOP;K^o/4MgE^").when(servletInputStream0).toString();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(servletInputStream0).when(httpServletRequest0).getInputStream();
      doReturn("chunked").when(httpServletRequest0).getHeader(anyString());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      httpRequestWrapper0.getInputStream();
      assertFalse(httpRequestWrapper0.notConsumed());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      boolean boolean0 = httpRequestWrapper0.notConsumed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpRequestWrapper httpRequestWrapper0 = new HttpRequestWrapper(httpServletRequestWrapper0);
      assertFalse(httpRequestWrapper0.notConsumed());
      
      httpRequestWrapper0.notConsumed(true);
      boolean boolean0 = httpRequestWrapper0.notConsumed();
      assertTrue(boolean0);
  }
}