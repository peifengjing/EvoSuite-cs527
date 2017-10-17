/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:41:59 GMT 2017
 */

package org.asynchttpclient.netty.request;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.netty.NettyResponseFuture;
import org.asynchttpclient.netty.request.WriteCompleteListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WriteCompleteListener_ESTest extends WriteCompleteListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NettyResponseFuture<Object> nettyResponseFuture0 = (NettyResponseFuture<Object>) mock(NettyResponseFuture.class, new ViolatedAssumptionAnswer());
      doReturn((AsyncHandler) null).when(nettyResponseFuture0).getAsyncHandler();
      WriteCompleteListener writeCompleteListener0 = new WriteCompleteListener(nettyResponseFuture0);
      try { 
        writeCompleteListener0.operationComplete((ChannelFuture) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.request.WriteCompleteListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WriteCompleteListener writeCompleteListener0 = null;
      try {
        writeCompleteListener0 = new WriteCompleteListener((NettyResponseFuture<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.request.WriteListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NettyResponseFuture<MockMinguoDate> nettyResponseFuture0 = (NettyResponseFuture<MockMinguoDate>) mock(NettyResponseFuture.class, new ViolatedAssumptionAnswer());
      doReturn((AsyncHandler) null).when(nettyResponseFuture0).getAsyncHandler();
      WriteCompleteListener writeCompleteListener0 = new WriteCompleteListener(nettyResponseFuture0);
      ChannelFuture channelFuture0 = mock(ChannelFuture.class, new ViolatedAssumptionAnswer());
      doReturn((Channel) null).when(channelFuture0).channel();
      doReturn((Throwable) null).when(channelFuture0).cause();
      writeCompleteListener0.operationComplete(channelFuture0);
  }
}