/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 06:29:36 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.Px500Api;
import com.github.scribejava.core.model.OAuth1RequestToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Px500Api_ESTest extends Px500Api_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Px500Api px500Api0 = Px500Api.instance();
      // Undeclared exception!
      try { 
        px500Api0.getAuthorizationUrl((OAuth1RequestToken) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.apis.Px500Api", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Px500Api px500Api0 = Px500Api.instance();
      OAuth1RequestToken oAuth1RequestToken0 = mock(OAuth1RequestToken.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(oAuth1RequestToken0).getToken();
      String string0 = px500Api0.getAuthorizationUrl(oAuth1RequestToken0);
      assertEquals("https://api.500px.com/v1/oauth/authorize?oauth_token=null", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Px500Api px500Api0 = new Px500Api();
      String string0 = px500Api0.getAccessTokenEndpoint();
      assertEquals("https://api.500px.com/v1/oauth/access_token", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Px500Api px500Api0 = new Px500Api();
      String string0 = px500Api0.getRequestTokenEndpoint();
      assertEquals("https://api.500px.com/v1/oauth/request_token", string0);
  }
}
