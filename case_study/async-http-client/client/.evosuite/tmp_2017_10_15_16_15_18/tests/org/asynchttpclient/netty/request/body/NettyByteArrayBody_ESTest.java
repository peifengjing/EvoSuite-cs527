/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:31:07 GMT 2017
 */

package org.asynchttpclient.netty.request.body;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.ByteBuf;
import org.asynchttpclient.netty.request.body.NettyByteArrayBody;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NettyByteArrayBody_ESTest extends NettyByteArrayBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      NettyByteArrayBody nettyByteArrayBody0 = new NettyByteArrayBody(byteArray0);
      long long0 = nettyByteArrayBody0.getContentLength();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      NettyByteArrayBody nettyByteArrayBody0 = new NettyByteArrayBody(byteArray0);
      long long0 = nettyByteArrayBody0.getContentLength();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      NettyByteArrayBody nettyByteArrayBody0 = new NettyByteArrayBody(byteArray0);
      ByteBuf byteBuf0 = nettyByteArrayBody0.byteBuf();
      assertFalse(byteBuf0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      NettyByteArrayBody nettyByteArrayBody0 = new NettyByteArrayBody((byte[]) null);
      // Undeclared exception!
      try { 
        nettyByteArrayBody0.getContentLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.request.body.NettyByteArrayBody", e);
      }
  }
}
