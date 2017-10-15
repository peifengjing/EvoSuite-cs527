/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 02:57:09 GMT 2017
 */

package com.github.scribejava.core.extractors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor;
import com.github.scribejava.core.model.Response;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth2AccessTokenExtractor_ESTest extends OAuth2AccessTokenExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ry4MO.+Tgc");
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response(632, "ry4MO.+Tgc", hashMap0, "ry4MO.+Tgc");
      Map<String, String> map0 = response0.getHeaders();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-2);
      byteArray0[2] = (byte) (-33);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-97);
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte) (-29);
      byteArray0[7] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-29), (byte)1);
      Response response1 = new Response(632, "ry4MO.+Tgc", map0, byteArrayInputStream0);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Response response0 = new Response(1922, "W/?y[Ov&GM", hashMap0, pipedInputStream0);
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = new OAuth2AccessTokenExtractor();
      Map<String, String> map0 = null;
      Response response0 = new Response(2298, "access_token=([^&]+)", (Map<String, String>) null, "access_token=([^&]+)");
      oAuth2AccessTokenExtractor0.extract(response0);
      int int0 = 125;
      oAuth2AccessTokenExtractor0.extract(response0);
      Response response1 = new Response(125, "*L#", (Map<String, String>) null, "*L#");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract a 'access_token=([^&]+)' from this: '*L#'
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth2AccessTokenExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 3);
      Response response0 = new Response((-5091), "refresh_token=([^&]+)", hashMap0, pipedInputStream0);
      Map<String, String> map0 = response0.getHeaders();
      Response response1 = new Response(7, "refresh_token=([^&]+)", map0, "A]lGd/M");
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      OAuth2AccessTokenExtractor.instance();
      Response response2 = new Response((-5091), "com.github.scribejava.core.utils.Preconditions", hashMap0, (String) null);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Response body is incorrect. Can't extract a token from an empty string
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }
}