/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:51:34 GMT 2017
 */

package org.asynchttpclient.request.body.multipart.part;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.List;
import org.asynchttpclient.Param;
import org.asynchttpclient.request.body.multipart.ByteArrayPart;
import org.asynchttpclient.request.body.multipart.part.ByteArrayMultipartPart;
import org.asynchttpclient.request.body.multipart.part.PartVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteArrayMultipartPart_ESTest extends ByteArrayMultipartPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = mock(ByteArrayPart.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(byteArrayPart0).getBytes();
      doReturn("", "DGr9vv]\"}~Z").when(byteArrayPart0).getFileName();
      doReturn(charset0, charset0, charset0, charset0).when(byteArrayPart0).getCharset();
      doReturn("").when(byteArrayPart0).getContentId();
      doReturn("").when(byteArrayPart0).getContentType();
      doReturn((List<Param>) null).when(byteArrayPart0).getCustomHeaders();
      doReturn("", "").when(byteArrayPart0).getDispositionType();
      doReturn("", "i-/[#KPAwR1M$0e@").when(byteArrayPart0).getName();
      doReturn("").when(byteArrayPart0).getTransferEncoding();
      ByteArrayMultipartPart byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray0);
      WritableByteChannel writableByteChannel0 = mock(WritableByteChannel.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(writableByteChannel0).write(any(java.nio.ByteBuffer.class));
      long long0 = byteArrayMultipartPart0.transferContentTo(writableByteChannel0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = mock(ByteArrayPart.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(byteArrayPart0).getBytes();
      doReturn("", "DGr9vv]\"}~Z").when(byteArrayPart0).getFileName();
      doReturn(charset0, charset0, charset0, charset0).when(byteArrayPart0).getCharset();
      doReturn("").when(byteArrayPart0).getContentId();
      doReturn("").when(byteArrayPart0).getContentType();
      doReturn((List<Param>) null).when(byteArrayPart0).getCustomHeaders();
      doReturn("", "").when(byteArrayPart0).getDispositionType();
      doReturn("", "i-/[#KPAwR1M$0e@").when(byteArrayPart0).getName();
      doReturn("").when(byteArrayPart0).getTransferEncoding();
      ByteArrayMultipartPart byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray0);
      WritableByteChannel writableByteChannel0 = mock(WritableByteChannel.class, new ViolatedAssumptionAnswer());
      doReturn((-3184)).when(writableByteChannel0).write(any(java.nio.ByteBuffer.class));
      // Undeclared exception!
      try { 
        byteArrayMultipartPart0.transferContentTo(writableByteChannel0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // readerIndex: -3184 (expected: 0 <= readerIndex <= writerIndex(3))
         //
         verifyException("io.netty.buffer.AbstractByteBuf", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)84;
      byteArray0[4] = (byte) (-86);
      ByteArrayPart byteArrayPart0 = mock(ByteArrayPart.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null).when(byteArrayPart0).getDispositionType();
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)103;
      byteArray1[1] = (byte)121;
      byteArray1[2] = (byte) (-53);
      byteArray1[3] = (byte) (-38);
      byteArray1[4] = (byte)1;
      ByteArrayMultipartPart byteArrayMultipartPart0 = null;
      try {
        byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.part.MultipartPart", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = mock(ByteArrayPart.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(byteArrayPart0).getBytes();
      doReturn("", "DGr9vv]\"}~Z").when(byteArrayPart0).getFileName();
      doReturn(charset0, charset0, charset0, charset0).when(byteArrayPart0).getCharset();
      doReturn("").when(byteArrayPart0).getContentId();
      doReturn("").when(byteArrayPart0).getContentType();
      doReturn((List<Param>) null).when(byteArrayPart0).getCustomHeaders();
      doReturn("", "").when(byteArrayPart0).getDispositionType();
      doReturn("", "i-/[#KPAwR1M$0e@").when(byteArrayPart0).getName();
      doReturn("").when(byteArrayPart0).getTransferEncoding();
      ByteArrayMultipartPart byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray0);
      byteArrayMultipartPart0.close();
      WritableByteChannel writableByteChannel0 = mock(WritableByteChannel.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        byteArrayMultipartPart0.transferContentTo(writableByteChannel0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // refCnt: 0
         //
         verifyException("io.netty.buffer.AbstractByteBuf", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = mock(ByteArrayPart.class, new ViolatedAssumptionAnswer());
      doReturn((Object) byteArray0, (Object) byteArray0).when(byteArrayPart0).getBytes();
      doReturn("", "DGr9vv]\"}~Z").when(byteArrayPart0).getFileName();
      doReturn(charset0, charset0, charset0, charset0).when(byteArrayPart0).getCharset();
      doReturn("").when(byteArrayPart0).getContentId();
      doReturn("").when(byteArrayPart0).getContentType();
      doReturn((List<Param>) null).when(byteArrayPart0).getCustomHeaders();
      doReturn("", "").when(byteArrayPart0).getDispositionType();
      doReturn("", "i-/[#KPAwR1M$0e@").when(byteArrayPart0).getName();
      doReturn("").when(byteArrayPart0).getTransferEncoding();
      ByteArrayMultipartPart byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray0);
      long long0 = byteArrayMultipartPart0.getContentLength();
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = mock(ByteArrayPart.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(byteArrayPart0).getBytes();
      doReturn("", "DGr9vv]\"}~Z").when(byteArrayPart0).getFileName();
      doReturn(charset0, charset0, charset0, charset0).when(byteArrayPart0).getCharset();
      doReturn("").when(byteArrayPart0).getContentId();
      doReturn("").when(byteArrayPart0).getContentType();
      doReturn((List<Param>) null).when(byteArrayPart0).getCustomHeaders();
      doReturn("", "").when(byteArrayPart0).getDispositionType();
      doReturn("", "i-/[#KPAwR1M$0e@").when(byteArrayPart0).getName();
      doReturn("").when(byteArrayPart0).getTransferEncoding();
      ByteArrayMultipartPart byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray0);
      WritableByteChannel writableByteChannel0 = mock(WritableByteChannel.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(writableByteChannel0).write(any(java.nio.ByteBuffer.class));
      long long0 = byteArrayMultipartPart0.transferContentTo(writableByteChannel0);
      assertEquals(1L, long0);
  }
}
