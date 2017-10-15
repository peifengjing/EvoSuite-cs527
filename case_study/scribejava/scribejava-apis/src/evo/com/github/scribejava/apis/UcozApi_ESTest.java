/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 06:31:08 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.UcozApi;
import com.github.scribejava.core.extractors.TokenExtractor;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UcozApi_ESTest extends UcozApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UcozApi ucozApi0 = new UcozApi();
      OAuth1RequestToken oAuth1RequestToken0 = mock(OAuth1RequestToken.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(oAuth1RequestToken0).getToken();
      String string0 = ucozApi0.getAuthorizationUrl(oAuth1RequestToken0);
      assertEquals("http://uapi.ucoz.com/accounts/oauthauthorizetoken?oauth_token=null", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UcozApi ucozApi0 = UcozApi.instance();
      // Undeclared exception!
      try { 
        ucozApi0.getAuthorizationUrl((OAuth1RequestToken) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.apis.UcozApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UcozApi ucozApi0 = UcozApi.instance();
      TokenExtractor<OAuth1RequestToken> tokenExtractor0 = ucozApi0.getRequestTokenExtractor();
      assertNotNull(tokenExtractor0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UcozApi ucozApi0 = new UcozApi();
      TokenExtractor<OAuth1AccessToken> tokenExtractor0 = ucozApi0.getAccessTokenExtractor();
      assertNotNull(tokenExtractor0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UcozApi ucozApi0 = UcozApi.instance();
      String string0 = ucozApi0.getAccessTokenEndpoint();
      assertEquals("http://uapi.ucoz.com/accounts/oauthgetaccesstoken", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UcozApi ucozApi0 = UcozApi.instance();
      String string0 = ucozApi0.getRequestTokenEndpoint();
      assertEquals("http://uapi.ucoz.com/accounts/oauthgetrequesttoken", string0);
  }
}
