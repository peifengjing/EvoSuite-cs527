/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:00:37 GMT 2017
 */

package com.github.scribejava.core.extractors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.extractors.OAuth1AccessTokenJSONExtractor;
import com.github.scribejava.core.extractors.OAuth1RequestTokenJSONExtractor;
import com.github.scribejava.core.model.Response;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractOAuth1JSONTokenExtractor_ESTest extends AbstractOAuth1JSONTokenExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth1RequestTokenJSONExtractor oAuth1RequestTokenJSONExtractor0 = OAuth1RequestTokenJSONExtractor.instance();
      // Undeclared exception!
      try { 
        oAuth1RequestTokenJSONExtractor0.extract((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.AbstractOAuth1JSONTokenExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth1RequestTokenJSONExtractor oAuth1RequestTokenJSONExtractor0 = new OAuth1RequestTokenJSONExtractor();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-4728), 125);
      Response response0 = new Response((-4728), "_!~?Cq:@w&||~r$&)r", hashMap0, byteArrayInputStream0);
      // Undeclared exception!
      try { 
        oAuth1RequestTokenJSONExtractor0.extract(response0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth1RequestTokenJSONExtractor oAuth1RequestTokenJSONExtractor0 = OAuth1RequestTokenJSONExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Response response0 = new Response((-1227), "Y6~d", hashMap0, pipedInputStream0);
      try { 
        oAuth1RequestTokenJSONExtractor0.extract(response0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth1AccessTokenJSONExtractor oAuth1AccessTokenJSONExtractor0 = new OAuth1AccessTokenJSONExtractor();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response((-1516), "com.github.scribejavacore.modEl.OAuth1AecessTok>n", hashMap0, "com.github.scribejavacore.modEl.OAuth1AecessTok>n");
      // Undeclared exception!
      try { 
        oAuth1AccessTokenJSONExtractor0.extract(response0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract token and secret from this: 'com.github.scribejavacore.modEl.OAuth1AecessTok>n'
         //
         verifyException("com.github.scribejava.core.extractors.AbstractOAuth1JSONTokenExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth1AccessTokenJSONExtractor oAuth1AccessTokenJSONExtractor0 = OAuth1AccessTokenJSONExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response((-616), (String) null, hashMap0, (InputStream) null);
      // Undeclared exception!
      try { 
        oAuth1AccessTokenJSONExtractor0.extract(response0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Response body is incorrect. Can't extract a token from an empty string
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }
}
