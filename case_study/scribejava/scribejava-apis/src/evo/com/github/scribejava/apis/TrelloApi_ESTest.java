/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 07:11:08 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.TrelloApi;
import com.github.scribejava.core.model.OAuth1RequestToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TrelloApi_ESTest extends TrelloApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TrelloApi trelloApi0 = TrelloApi.instance();
      // Undeclared exception!
      try { 
        trelloApi0.getAuthorizationUrl((OAuth1RequestToken) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.apis.TrelloApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TrelloApi trelloApi0 = TrelloApi.instance();
      OAuth1RequestToken oAuth1RequestToken0 = mock(OAuth1RequestToken.class, new ViolatedAssumptionAnswer());
      doReturn("https://trello.com/1/OAuthGetAccessToken").when(oAuth1RequestToken0).getToken();
      String string0 = trelloApi0.getAuthorizationUrl(oAuth1RequestToken0);
      assertEquals("https://trello.com/1/OAuthAuthorizeToken?oauth_token=https://trello.com/1/OAuthGetAccessToken", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TrelloApi trelloApi0 = TrelloApi.instance();
      String string0 = trelloApi0.getAccessTokenEndpoint();
      assertEquals("https://trello.com/1/OAuthGetAccessToken", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TrelloApi trelloApi0 = new TrelloApi();
      String string0 = trelloApi0.getRequestTokenEndpoint();
      assertEquals("https://trello.com/1/OAuthGetRequestToken", string0);
  }
}