/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 02:54:54 GMT 2017
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuth2AccessToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("", "", "");
      String string0 = oAuth1RequestToken0.getRawResponse();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("=@xI58P`E{!(Tm", "=@xI58P`E{!(Tm", "=@xI58P`E{!(Tm");
      String string0 = oAuth1RequestToken0.getParameter("");
      assertNotNull(string0);
      assertEquals("@xI58P`E{!(Tm", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("Received an invalid parameter", ", oauth_token_secret=");
      // Undeclared exception!
      try { 
        oAuth1AccessToken0.getParameter("\"JbYz4:g*up,su");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.model.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("=", "=", "=");
      String string0 = oAuth1RequestToken0.getParameter("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken(", oauth_token_secret=", "null==!P@xI5{8P`E{!(m");
      String string0 = oAuth2AccessToken0.getParameter((String) null);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken(", oauth_token_secret=", "null==!P@xI5{8P`E{!(m");
      String string0 = oAuth2AccessToken0.getParameter("OAuth2AccessToken{access_token=, oauth_token_secret=, token_type=null, expires_in=null, refresh_token=null, scope=null}");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken(".==", ".==");
      // Undeclared exception!
      try { 
        oAuth1AccessToken0.getRawResponse();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This token object was not constructed by ScribeJava and does not have a rawResponse
         //
         verifyException("com.github.scribejava.core.model.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken(", oauth_token_secret=", "null==!P@xI5{8P`E{!(m");
      String string0 = oAuth2AccessToken0.getRawResponse();
      assertEquals("null==!P@xI5{8P`E{!(m", string0);
  }
}