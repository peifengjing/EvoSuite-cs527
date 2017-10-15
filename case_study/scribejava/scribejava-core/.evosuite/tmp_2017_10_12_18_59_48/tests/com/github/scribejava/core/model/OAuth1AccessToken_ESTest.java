/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 02:52:40 GMT 2017
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.model.OAuth1AccessToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth1AccessToken_ESTest extends OAuth1AccessToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("This token object was not constructed by ScribeJava and does not have a rawResponse", "This token object was not constructed by ScribeJava and does not have a rawResponse");
      String string0 = oAuth1AccessToken0.getTokenSecret();
      assertEquals("This token object was not constructed by ScribeJava and does not have a rawResponse", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("[gY\"`T;=7PH/b<;u|a3", "[gY\"`T;=7PH/b<;u|a3", "[gY\"`T;=7PH/b<;u|a3");
      String string0 = oAuth1AccessToken0.getToken();
      assertEquals("[gY\"`T;=7PH/b<;u|a3", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = null;
      try {
        oAuth1AccessToken0 = new OAuth1AccessToken((String) null, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oauth_token can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = null;
      try {
        oAuth1AccessToken0 = new OAuth1AccessToken("com.github.scribejava.core.model.Token", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oauth_token_secret can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("", "");
      String string0 = oAuth1AccessToken0.getToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A");
      OAuth1AccessToken oAuth1AccessToken1 = new OAuth1AccessToken("OAuth1AccessToken{oauth_token=@LiZR=)d78/.@+LW<A, oauth_token_secret=@LiZR=)d78/.@+LW<A}", "@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A");
      boolean boolean0 = oAuth1AccessToken0.equals(oAuth1AccessToken1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A");
      boolean boolean0 = oAuth1AccessToken0.equals("@LiZR=)d78/.@+LW<A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A");
      OAuth1AccessToken oAuth1AccessToken1 = new OAuth1AccessToken("@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A");
      boolean boolean0 = oAuth1AccessToken0.equals(oAuth1AccessToken1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("@LiZ=)d78z.@+LW<A", "@LiZ=)d78z.@+LW<A");
      boolean boolean0 = oAuth1AccessToken0.equals(oAuth1AccessToken0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("/a`z;hx", "/a`z;hx", "/a`z;hx");
      boolean boolean0 = oAuth1AccessToken0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("[gY\"`T;=7PH/b<;u|a3", "[gY\"`T;=7PH/b<;u|a3", "[gY\"`T;=7PH/b<;u|a3");
      oAuth1AccessToken0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A", "@LiZR=)d78/.@+LW<A");
      String string0 = oAuth1AccessToken0.toString();
      assertEquals("OAuth1AccessToken{oauth_token=@LiZR=)d78/.@+LW<A, oauth_token_secret=@LiZR=)d78/.@+LW<A}", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("", "");
      String string0 = oAuth1AccessToken0.getTokenSecret();
      assertEquals("", string0);
  }
}
