/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:58:40 GMT 2017
 */

package org.asynchttpclient.request.body.multipart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.charset.Charset;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.asynchttpclient.request.body.multipart.FilePart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilePart_ESTest extends FilePart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      File file0 = MockFile.createTempFile(".[_S[", "[0K50cWRQ");
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      file0.setLastModified(0L);
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = new FilePart("<9r", file0, ",c", charset0);
      File file1 = filePart0.getFile();
      assertEquals("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/.[_S[0[0K50cWRQ", file1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("File is not readable ", "G|=(]J^h|&w|T[r UtJ");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/File is not readable 0G|=(]J^h|&w|T[r UtJ");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      FilePart filePart0 = new FilePart("", file0, "9^f/U|-/>[R");
      File file1 = filePart0.getFile();
      assertTrue(file1.exists());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart(" q?e:+w5}O", (File) null, (String) null, charset0, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart((String) null, (File) null, "z!u$'~a}.+bo", charset0, "", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("org.apache.commons.io.filefilter.OrFileFilter", (File) null, "AO!ZFau,+5", charset0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("File is not readable ", (File) null, "ZB@.ArV,+/ml", (Charset) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("{Iso!+u{|z@");
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("{Iso!+u{|z@", mockFile0, "{Iso!+u{|z@", charset0, "{Iso!+u{|z@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File is not readable /Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/async-http-client/client/{Iso!+u{|z@
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("d/ALqXE,j>3zb", (File) null, "", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("P+4ru9PyK!(Xmck", mockFile0, "", charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/async-http-client/client
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("o<>h)p`1WqMg{n", (File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ZNx`h$ts2BpCXc", "ZNx`h$ts2BpCXc");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/async-http-client/client/ZNx`h$ts2BpCXc/ZNx`h$ts2BpCXc");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.eclipse.jetty.util.PathWatcher$PathWatchEventType");
      FilePart filePart0 = new FilePart("ZNx`h$ts2BpCXc", mockFile0, (String) null, (Charset) null, "file", "org.eclipse.jetty.util.PathWatcher$PathWatchEventType", "oe754tJ");
      assertEquals("application/octet-stream", filePart0.getContentType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ZNx`h$ts2BpCXc", "ZNx`h$ts2BpCXc");
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("ZNx`h$ts2BpCXc", mockFile0, (String) null, (Charset) null, "file", "org.eclipse.jetty.util.PathWatcher$PathWatchEventType", "oe754tJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File is not readable /Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/async-http-client/client/ZNx`h$ts2BpCXc/ZNx`h$ts2BpCXc
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", mockFile0, "", charset0, "H_.vY,V(b&n\bD/", "H_.vY,V(b&n\bD/", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", (File) null, "", (Charset) null, "?PbT%C['", "\"xuN :-kDa", "\"xuN :-kDa");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", (File) null, "", (Charset) null, (String) null, "", "k\"(");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ZNx`h$ts2BpCXc", "ZNx`h$ts2BpCXc");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/async-http-client/client/ZNx`h$ts2BpCXc/ZNx`h$ts2BpCXc");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.eclipse.jetty.util.PathWatcher$PathWatchEventType");
      FilePart filePart0 = new FilePart("ZNx`h$ts2BpCXc", mockFile0);
      File file0 = filePart0.getFile();
      assertEquals("ZNx`h$ts2BpCXc", file0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("6)-b];Dfk_C'p?M>o>");
      mockFile0.createNewFile();
      FilePart filePart0 = new FilePart("6)-b];Dfk_C'p?M>o>", mockFile0, "File is not a normal file ", (Charset) null, "Adding include: [{}]");
      assertNull(filePart0.getTransferEncoding());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("<7");
      mockFile0.createNewFile();
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = new FilePart("n.44`,d", mockFile0, "", charset0, "n.44`,d", "n.44`,d");
      File file0 = filePart0.getFile();
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", mockFile0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/async-http-client/client
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("<7");
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("n.44`,d", mockFile0, "", charset0, "n.44`,d", "n.44`,d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File is not readable /Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/async-http-client/client/<7
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
}