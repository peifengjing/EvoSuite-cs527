/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 07:12:38 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.FoursquareApi;
import com.github.scribejava.core.model.OAuth1RequestToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FoursquareApi_ESTest extends FoursquareApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FoursquareApi foursquareApi0 = new FoursquareApi();
      // Undeclared exception!
      try { 
        foursquareApi0.getAuthorizationUrl((OAuth1RequestToken) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.apis.FoursquareApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FoursquareApi foursquareApi0 = FoursquareApi.instance();
      assertFalse(foursquareApi0.isEmptyOAuthTokenParamIsRequired());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FoursquareApi foursquareApi0 = new FoursquareApi();
      String string0 = foursquareApi0.getRequestTokenEndpoint();
      assertEquals("http://foursquare.com/oauth/request_token", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FoursquareApi foursquareApi0 = new FoursquareApi();
      OAuth1RequestToken oAuth1RequestToken0 = mock(OAuth1RequestToken.class, new ViolatedAssumptionAnswer());
      doReturn("=F0qs&T{Cr").when(oAuth1RequestToken0).getToken();
      String string0 = foursquareApi0.getAuthorizationUrl(oAuth1RequestToken0);
      assertEquals("http://foursquare.com/oauth/authorize?oauth_token==F0qs&T{Cr", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FoursquareApi foursquareApi0 = new FoursquareApi();
      String string0 = foursquareApi0.getAccessTokenEndpoint();
      assertEquals("http://foursquare.com/oauth/access_token", string0);
  }
}
