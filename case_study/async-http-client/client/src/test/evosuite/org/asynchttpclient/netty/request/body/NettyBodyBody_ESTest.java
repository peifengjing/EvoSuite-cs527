/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:45:18 GMT 2017
 */

package org.asynchttpclient.netty.request.body;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import java.util.LinkedList;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.netty.NettyResponseFuture;
import org.asynchttpclient.netty.request.body.NettyBodyBody;
import org.asynchttpclient.request.body.Body;
import org.asynchttpclient.request.body.generator.BodyChunk;
import org.asynchttpclient.request.body.generator.BoundedQueueFeedableBodyGenerator;
import org.asynchttpclient.request.body.generator.PushBody;
import org.asynchttpclient.request.body.generator.ReactiveStreamsBodyGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.reactivestreams.Publisher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NettyBodyBody_ESTest extends NettyBodyBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReactiveStreamsBodyGenerator reactiveStreamsBodyGenerator0 = new ReactiveStreamsBodyGenerator((Publisher<ByteBuf>) null, 0L);
      Body body0 = reactiveStreamsBodyGenerator0.createBody();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody(body0, asyncHttpClientConfig0);
      long long0 = nettyBodyBody0.getContentLength();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoundedQueueFeedableBodyGenerator boundedQueueFeedableBodyGenerator0 = new BoundedQueueFeedableBodyGenerator(1);
      Body body0 = boundedQueueFeedableBodyGenerator0.createBody();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody(body0, asyncHttpClientConfig0);
      long long0 = nettyBodyBody0.getContentLength();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody((Body) null, (AsyncHttpClientConfig) null);
      Body body0 = nettyBodyBody0.getBody();
      assertNull(body0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BoundedQueueFeedableBodyGenerator boundedQueueFeedableBodyGenerator0 = new BoundedQueueFeedableBodyGenerator(1);
      Body body0 = boundedQueueFeedableBodyGenerator0.createBody();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody(body0, asyncHttpClientConfig0);
      Body body1 = nettyBodyBody0.getBody();
      assertEquals((-1L), body1.getContentLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<BodyChunk> linkedList0 = new LinkedList<BodyChunk>();
      PushBody pushBody0 = new PushBody(linkedList0);
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody(pushBody0, asyncHttpClientConfig0);
      // Undeclared exception!
      try { 
        nettyBodyBody0.write((Channel) null, (NettyResponseFuture<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.request.body.NettyBodyBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody((Body) null, (AsyncHttpClientConfig) null);
      // Undeclared exception!
      try { 
        nettyBodyBody0.getContentLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.request.body.NettyBodyBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody((Body) null, asyncHttpClientConfig0);
      // Undeclared exception!
      try { 
        nettyBodyBody0.write((Channel) null, (NettyResponseFuture<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // body
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ReactiveStreamsBodyGenerator reactiveStreamsBodyGenerator0 = new ReactiveStreamsBodyGenerator((Publisher<ByteBuf>) null, 4294967295L);
      Body body0 = reactiveStreamsBodyGenerator0.createBody();
      NettyBodyBody nettyBodyBody0 = new NettyBodyBody(body0, (AsyncHttpClientConfig) null);
      long long0 = nettyBodyBody0.getContentLength();
      assertEquals(4294967295L, long0);
  }
}
