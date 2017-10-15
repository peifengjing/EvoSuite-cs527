/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 18:11:03 GMT 2017
 */

package org.springside.examples.bootapi.api.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.ServletWebRequest;
import org.springside.examples.bootapi.api.support.CustomExceptionHandler;
import org.springside.examples.bootapi.api.support.ErrorResult;
import org.springside.examples.bootapi.service.exception.ErrorCode;
import org.springside.examples.bootapi.service.exception.ServiceException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomExceptionHandler_ESTest extends CustomExceptionHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getRemoteAddr();
      doReturn((String) null).when(httpServletRequest0).getQueryString();
      doReturn((String) null).when(httpServletRequest0).getRequestURI();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      ErrorCode errorCode0 = ErrorCode.BAD_REQUEST;
      ServiceException serviceException0 = new ServiceException("from", errorCode0);
      ResponseEntity<ErrorResult> responseEntity0 = customExceptionHandler0.handleServiceException(serviceException0, httpServletRequestWrapper0);
      assertEquals(400, responseEntity0.getStatusCodeValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      ErrorCode errorCode0 = ErrorCode.BOOK_STATUS_WRONG;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getRemoteAddr();
      doReturn((String) null).when(httpServletRequest0).getQueryString();
      doReturn((String) null).when(httpServletRequest0).getRequestURI();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      ServiceException serviceException0 = new ServiceException("fxPF{h2y4", errorCode0);
      ResponseEntity<ErrorResult> responseEntity0 = customExceptionHandler0.handleGeneralException(serviceException0, httpServletRequestWrapper0);
      assertEquals(500, responseEntity0.getStatusCodeValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      MockException mockException0 = new MockException((String) null);
      HttpHeaders httpHeaders0 = new HttpHeaders();
      HttpStatus httpStatus0 = HttpStatus.PRECONDITION_FAILED;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      ServletWebRequest servletWebRequest0 = new ServletWebRequest(httpServletRequestWrapper0);
      ResponseEntity<Object> responseEntity0 = customExceptionHandler0.handleExceptionInternal(mockException0, (Object) null, httpHeaders0, httpStatus0, servletWebRequest0);
      assertEquals(412, responseEntity0.getStatusCodeValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      MockException mockException0 = new MockException("org.springframework.web.servlet.PageNotFound");
      // Undeclared exception!
      try { 
        customExceptionHandler0.logError((Exception) mockException0, (HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.support.CustomExceptionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      // Undeclared exception!
      try { 
        customExceptionHandler0.logError((Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.support.CustomExceptionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      ErrorCode errorCode0 = ErrorCode.BOOK_OWNERSHIP_WRONG;
      ServiceException serviceException0 = new ServiceException("org.springframework.web.servlet.PageNotFound", errorCode0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getRemoteAddr();
      doReturn((String) null).when(httpServletRequest0).getQueryString();
      doReturn((String) null).when(httpServletRequest0).getRequestURI();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      ResponseEntity<ErrorResult> responseEntity0 = customExceptionHandler0.handleServiceException(serviceException0, httpServletRequestWrapper0);
      assertEquals(403, responseEntity0.getStatusCodeValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      MockException mockException0 = new MockException((String) null);
      customExceptionHandler0.logError((Exception) mockException0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      MockException mockException0 = new MockException();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("org.springframework.web.servlet.PageNotFound").when(httpServletRequest0).getRemoteAddr();
      doReturn("from").when(httpServletRequest0).getQueryString();
      doReturn("from").when(httpServletRequest0).getRequestURI();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      customExceptionHandler0.logError((Exception) mockException0, (HttpServletRequest) httpServletRequestWrapper0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      MockException mockException0 = new MockException();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getRemoteAddr();
      doReturn((String) null).when(httpServletRequest0).getQueryString();
      doReturn((String) null).when(httpServletRequest0).getRequestURI();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      customExceptionHandler0.logError((Exception) mockException0, (HttpServletRequest) httpServletRequestWrapper0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      MockException mockException0 = new MockException();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      ServletWebRequest servletWebRequest0 = new ServletWebRequest(httpServletRequestWrapper0, httpServletResponseWrapper0);
      ResponseEntity<Object> responseEntity0 = customExceptionHandler0.handleException(mockException0, servletWebRequest0);
      assertFalse(responseEntity0.hasBody());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      MockException mockException0 = new MockException((String) null);
      HttpHeaders httpHeaders0 = new HttpHeaders();
      HttpStatus httpStatus0 = HttpStatus.PRECONDITION_FAILED;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      ServletWebRequest servletWebRequest0 = new ServletWebRequest(httpServletRequestWrapper0);
      ResponseEntity<Object> responseEntity0 = customExceptionHandler0.handleExceptionInternal(mockException0, mockException0, httpHeaders0, httpStatus0, servletWebRequest0);
      assertEquals(412, responseEntity0.getStatusCodeValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      // Undeclared exception!
      try { 
        customExceptionHandler0.handleGeneralException((Exception) null, (HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.support.CustomExceptionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      HttpHeaders httpHeaders0 = new HttpHeaders();
      HttpStatus httpStatus0 = HttpStatus.GATEWAY_TIMEOUT;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      ServletWebRequest servletWebRequest0 = new ServletWebRequest(httpServletRequestWrapper0);
      // Undeclared exception!
      try { 
        customExceptionHandler0.handleExceptionInternal((Exception) null, customExceptionHandler0, httpHeaders0, httpStatus0, servletWebRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.support.CustomExceptionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CustomExceptionHandler customExceptionHandler0 = new CustomExceptionHandler();
      ErrorCode errorCode0 = ErrorCode.NO_TOKEN;
      ServiceException serviceException0 = new ServiceException("org.springframework.web.servlet.PageNotFound", errorCode0);
      // Undeclared exception!
      try { 
        customExceptionHandler0.handleServiceException(serviceException0, (HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.support.CustomExceptionHandler", e);
      }
  }
}
