/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:01:36 GMT 2017
 */

package org.asynchttpclient.netty.handler.intercept;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.HttpHeaders;
import java.util.List;
import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.HttpResponseStatus;
import org.asynchttpclient.Request;
import org.asynchttpclient.netty.NettyResponseFuture;
import org.asynchttpclient.netty.handler.intercept.ResponseFiltersInterceptor;
import org.asynchttpclient.netty.request.NettyRequestSender;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResponseFiltersInterceptor_ESTest extends ResponseFiltersInterceptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(asyncHttpClientConfig0).getResponseFilters();
      NettyRequestSender nettyRequestSender0 = mock(NettyRequestSender.class, new ViolatedAssumptionAnswer());
      ResponseFiltersInterceptor responseFiltersInterceptor0 = new ResponseFiltersInterceptor(asyncHttpClientConfig0, nettyRequestSender0);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      NettyResponseFuture<String> nettyResponseFuture0 = (NettyResponseFuture<String>) mock(NettyResponseFuture.class, new ViolatedAssumptionAnswer());
      Channel channel1 = mock(Channel.class, new ViolatedAssumptionAnswer());
      NettyResponseFuture<Object> nettyResponseFuture1 = (NettyResponseFuture<Object>) mock(NettyResponseFuture.class, new ViolatedAssumptionAnswer());
      doReturn((Request) null).when(nettyResponseFuture1).getCurrentRequest();
      AsyncHandler<Integer> asyncHandler0 = (AsyncHandler<Integer>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      HttpResponseStatus httpResponseStatus0 = mock(HttpResponseStatus.class, new ViolatedAssumptionAnswer());
      HttpHeaders httpHeaders0 = mock(HttpHeaders.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        responseFiltersInterceptor0.exitAfterProcessingFilters((Channel) null, nettyResponseFuture1, asyncHandler0, httpResponseStatus0, httpHeaders0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.handler.intercept.ResponseFiltersInterceptor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(asyncHttpClientConfig0).getResponseFilters();
      NettyRequestSender nettyRequestSender0 = mock(NettyRequestSender.class, new ViolatedAssumptionAnswer());
      ResponseFiltersInterceptor responseFiltersInterceptor0 = new ResponseFiltersInterceptor(asyncHttpClientConfig0, nettyRequestSender0);
      Channel channel0 = null;
      NettyResponseFuture<Object> nettyResponseFuture0 = (NettyResponseFuture<Object>) mock(NettyResponseFuture.class, new ViolatedAssumptionAnswer());
      AsyncHandler<Integer> asyncHandler0 = (AsyncHandler<Integer>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      HttpResponseStatus httpResponseStatus0 = mock(HttpResponseStatus.class, new ViolatedAssumptionAnswer());
      NettyResponseFuture<Object> nettyResponseFuture1 = (NettyResponseFuture<Object>) mock(NettyResponseFuture.class, new ViolatedAssumptionAnswer());
      doReturn((Request) null).when(nettyResponseFuture1).getCurrentRequest();
      AsyncHandler<String> asyncHandler1 = (AsyncHandler<String>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      HttpResponseStatus httpResponseStatus1 = mock(HttpResponseStatus.class, new ViolatedAssumptionAnswer());
      HttpHeaders httpHeaders0 = mock(HttpHeaders.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        responseFiltersInterceptor0.exitAfterProcessingFilters((Channel) null, nettyResponseFuture1, asyncHandler1, httpResponseStatus1, httpHeaders0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.handler.intercept.ResponseFiltersInterceptor", e);
      }
  }
}
