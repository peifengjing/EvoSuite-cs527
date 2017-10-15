/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 06:49:44 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.TutByApi;
import com.github.scribejava.core.builder.api.OAuth2SignatureType;
import com.github.scribejava.core.httpclient.HttpClient;
import com.github.scribejava.core.httpclient.HttpClientConfig;
import com.github.scribejava.core.model.OAuthConfig;
import com.github.scribejava.core.oauth.OAuth20Service;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TutByApi_ESTest extends TutByApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TutByApi tutByApi0 = TutByApi.instance();
      String string0 = tutByApi0.getAuthorizationBaseUrl();
      assertEquals("http://profile.tut.by/auth", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TutByApi tutByApi0 = TutByApi.instance();
      // Undeclared exception!
      try { 
        tutByApi0.createService((OAuthConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.oauth.OAuthService", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TutByApi tutByApi0 = new TutByApi();
      assertEquals(OAuth2SignatureType.BEARER_AUTHORIZATION_REQUEST_HEADER_FIELD, tutByApi0.getSignatureType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TutByApi tutByApi0 = TutByApi.instance();
      OAuthConfig oAuthConfig0 = mock(OAuthConfig.class, new ViolatedAssumptionAnswer());
      doReturn((HttpClient) null).when(oAuthConfig0).getHttpClient();
      doReturn((HttpClientConfig) null).when(oAuthConfig0).getHttpClientConfig();
      OAuth20Service oAuth20Service0 = tutByApi0.createService(oAuthConfig0);
      assertEquals("2.0", oAuth20Service0.getVersion());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TutByApi tutByApi0 = TutByApi.instance();
      String string0 = tutByApi0.getAccessTokenEndpoint();
      assertEquals("http://profile.tut.by/getToken", string0);
  }
}