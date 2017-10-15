/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:15:43 GMT 2017
 */

package com.github.scribejava.core.oauth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.httpclient.HttpClient;
import com.github.scribejava.core.httpclient.HttpClientConfig;
import com.github.scribejava.core.model.OAuthConfig;
import com.github.scribejava.core.oauth.OAuth20ApiUnit;
import com.github.scribejava.core.oauth.OAuth20Service;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth20ApiUnit_ESTest extends OAuth20ApiUnit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth20ApiUnit oAuth20ApiUnit0 = new OAuth20ApiUnit();
      OAuthConfig oAuthConfig0 = mock(OAuthConfig.class, new ViolatedAssumptionAnswer());
      doReturn((HttpClient) null).when(oAuthConfig0).getHttpClient();
      doReturn((HttpClientConfig) null).when(oAuthConfig0).getHttpClientConfig();
      OAuth20Service oAuth20Service0 = oAuth20ApiUnit0.createService(oAuthConfig0);
      assertEquals("2.0", oAuth20Service0.getVersion());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth20ApiUnit oAuth20ApiUnit0 = new OAuth20ApiUnit();
      String string0 = oAuth20ApiUnit0.getAccessTokenEndpoint();
      assertEquals("http://localhost:8080/token", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth20ApiUnit oAuth20ApiUnit0 = new OAuth20ApiUnit();
      oAuth20ApiUnit0.getSignatureType();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth20ApiUnit oAuth20ApiUnit0 = new OAuth20ApiUnit();
      String string0 = oAuth20ApiUnit0.getAuthorizationBaseUrl();
      assertEquals("http://localhost:8080/authorize", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth20ApiUnit oAuth20ApiUnit0 = new OAuth20ApiUnit();
      // Undeclared exception!
      try { 
        oAuth20ApiUnit0.createService((OAuthConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.oauth.OAuthService", e);
      }
  }
}