/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:26:29 GMT 2017
 */

package org.asynchttpclient.request.body.multipart;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.nio.charset.Charset;
import org.asynchttpclient.request.body.multipart.ByteArrayPart;
import org.asynchttpclient.request.body.multipart.FilePart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileLikePart_ESTest extends FileLikePart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("s+:[s< @@0dz|P0.tmp", byteArray0, "FilePart name=null contentType=application/octet-stream charset=null tranferEncoding=null contentId=null dispositionType=null filename=s+:[s< @@0dz|P0.tmp");
      assertEquals("FilePart name=null contentType=application/octet-stream charset=null tranferEncoding=null contentId=null dispositionType=null filename=s+:[s< @@0dz|P0.tmp", byteArrayPart0.getContentType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "s+:[s< @@0dz|P");
      File file0 = MockFile.createTempFile("s+:[s< @@0dz|P", (String) null, (File) mockFile0);
      FilePart filePart0 = new FilePart((String) null, file0);
      String string0 = filePart0.getFileName();
      assertEquals("s+:[s< @@0dz|P0.tmp", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("", byteArray0, "", (Charset) null, "");
      String string0 = byteArrayPart0.getFileName();
      assertEquals("", byteArrayPart0.getContentType());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("j{v6f-[(:?8&", byteArray0);
      String string0 = byteArrayPart0.toString();
      assertEquals("ByteArrayPart name=j{v6f-[(:?8& contentType=application/octet-stream charset=null tranferEncoding=null contentId=null dispositionType=null filename=null", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("j{v6f-[(:?8&", byteArray0);
      String string0 = byteArrayPart0.getFileName();
      assertNull(string0);
  }
}
