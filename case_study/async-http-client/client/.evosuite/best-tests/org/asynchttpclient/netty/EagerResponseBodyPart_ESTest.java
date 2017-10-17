/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:55:01 GMT 2017
 */

package org.asynchttpclient.netty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import org.asynchttpclient.netty.EagerResponseBodyPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EagerResponseBodyPart_ESTest extends EagerResponseBodyPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteBuf byteBuf0 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuf) null).when(byteBuf0).getBytes(anyInt() , any(byte[].class));
      doReturn(false).when(byteBuf0).hasArray();
      doReturn(0).when(byteBuf0).readableBytes();
      doReturn(0).when(byteBuf0).readerIndex();
      EagerResponseBodyPart eagerResponseBodyPart0 = new EagerResponseBodyPart(byteBuf0, true);
      int int0 = eagerResponseBodyPart0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteBuf byteBuf0 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuf) null).when(byteBuf0).getBytes(anyInt() , any(byte[].class));
      doReturn(false).when(byteBuf0).hasArray();
      doReturn(0).when(byteBuf0).readableBytes();
      doReturn(0).when(byteBuf0).readerIndex();
      EagerResponseBodyPart eagerResponseBodyPart0 = new EagerResponseBodyPart(byteBuf0, true);
      byte[] byteArray0 = eagerResponseBodyPart0.getBodyPartBytes();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EagerResponseBodyPart eagerResponseBodyPart0 = null;
      try {
        eagerResponseBodyPart0 = new EagerResponseBodyPart((ByteBuf) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.util.ByteBufUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteBuf byteBuf0 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(byteBuf0).hasArray();
      doReturn((-1608)).when(byteBuf0).readableBytes();
      doReturn((-1608)).when(byteBuf0).readerIndex();
      EagerResponseBodyPart eagerResponseBodyPart0 = null;
      try {
        eagerResponseBodyPart0 = new EagerResponseBodyPart(byteBuf0, false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.util.ByteBufUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteBuf byteBuf0 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      ByteBuf byteBuf1 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      doReturn(byteBuf0).when(byteBuf1).getBytes(anyInt() , any(byte[].class));
      doReturn(false).when(byteBuf1).hasArray();
      doReturn(41).when(byteBuf1).readableBytes();
      doReturn(41).when(byteBuf1).readerIndex();
      EagerResponseBodyPart eagerResponseBodyPart0 = new EagerResponseBodyPart(byteBuf1, false);
      int int0 = eagerResponseBodyPart0.length();
      assertEquals(41, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteBuf byteBuf0 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      ByteBuf byteBuf1 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      doReturn((byte[]) null).when(byteBuf1).array();
      doReturn(0).when(byteBuf1).arrayOffset();
      doReturn(byteBuf0).when(byteBuf1).getBytes(anyInt() , any(byte[].class));
      doReturn(true).when(byteBuf1).hasArray();
      doReturn(518).when(byteBuf1).readableBytes();
      doReturn(518).when(byteBuf1).readerIndex();
      EagerResponseBodyPart eagerResponseBodyPart0 = new EagerResponseBodyPart(byteBuf1, true);
      byte[] byteArray0 = eagerResponseBodyPart0.getBodyPartBytes();
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteBuf byteBuf0 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      ByteBuf byteBuf1 = mock(ByteBuf.class, new ViolatedAssumptionAnswer());
      doReturn(byteBuf0).when(byteBuf1).getBytes(anyInt() , any(byte[].class));
      doReturn(false).when(byteBuf1).hasArray();
      doReturn(41).when(byteBuf1).readableBytes();
      doReturn(41).when(byteBuf1).readerIndex();
      EagerResponseBodyPart eagerResponseBodyPart0 = new EagerResponseBodyPart(byteBuf1, false);
      ByteBuffer byteBuffer0 = eagerResponseBodyPart0.getBodyByteBuffer();
      assertEquals(41, byteBuffer0.capacity());
  }
}