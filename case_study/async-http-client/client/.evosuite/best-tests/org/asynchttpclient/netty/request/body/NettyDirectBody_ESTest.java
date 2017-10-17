/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:56:43 GMT 2017
 */

package org.asynchttpclient.netty.request.body;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.asynchttpclient.netty.NettyResponseFuture;
import org.asynchttpclient.netty.request.body.NettyByteArrayBody;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NettyDirectBody_ESTest extends NettyDirectBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      NettyByteArrayBody nettyByteArrayBody0 = new NettyByteArrayBody(byteArray0);
      ByteBuf byteBuf0 = nettyByteArrayBody0.byteBuf();
      assertEquals(0, byteBuf0.readerIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NettyByteArrayBody nettyByteArrayBody0 = new NettyByteArrayBody((byte[]) null);
      // Undeclared exception!
      try { 
        nettyByteArrayBody0.byteBuf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.netty.buffer.Unpooled", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      NettyByteArrayBody nettyByteArrayBody0 = new NettyByteArrayBody(byteArray0);
      NettyResponseFuture<String> nettyResponseFuture0 = (NettyResponseFuture<String>) mock(NettyResponseFuture.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nettyByteArrayBody0.write((Channel) null, nettyResponseFuture0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This kind of body is supposed to be writen directly
         //
         verifyException("org.asynchttpclient.netty.request.body.NettyDirectBody", e);
      }
  }
}