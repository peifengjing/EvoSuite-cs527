/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 02:27:01 GMT 2017
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.model.OAuth2AccessToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth2AccessToken_ESTest extends OAuth2AccessToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("{&zY[", "{&zY[", (Integer) null, "&", "&", "&");
      oAuth2AccessToken0.hashCode();
      assertEquals("{&zY[", oAuth2AccessToken0.getAccessToken());
      assertEquals("&", oAuth2AccessToken0.getRefreshToken());
      assertEquals("{&zY[", oAuth2AccessToken0.getTokenType());
      assertEquals("&", oAuth2AccessToken0.getScope());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "");
      String string0 = oAuth2AccessToken0.getTokenType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-640));
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "", integer0, "", (String) null, "");
      String string0 = oAuth2AccessToken0.getTokenType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("[jB");
      String string0 = oAuth2AccessToken0.getScope();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-1237));
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("B!'tp*=.9,x", "5?%}9@sLcTO]/j-Xb5", integer0, "B!'tp*=.9,x", "B!'tp*=.9,x", "5?%}9@sLcTO]/j-Xb5");
      String string0 = oAuth2AccessToken0.getScope();
      assertEquals("5?%}9@sLcTO]/j-Xb5", oAuth2AccessToken0.getTokenType());
      assertEquals("B!'tp*=.9,x", string0);
      assertEquals("B!'tp*=.9,x", oAuth2AccessToken0.getRefreshToken());
      assertEquals("B!'tp*=.9,x", oAuth2AccessToken0.getAccessToken());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("OAuth2AccessToken{access_token=");
      String string0 = oAuth2AccessToken0.getRefreshToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "S(lxj/?I$We^/", (Integer) null, "S(lxj/?I$We^/", "S(lxj/?I$We^/", "E_%[1Ky");
      String string0 = oAuth2AccessToken0.getRefreshToken();
      assertEquals("", oAuth2AccessToken0.getAccessToken());
      assertEquals("S(lxj/?I$We^/", string0);
      assertEquals("S(lxj/?I$We^/", oAuth2AccessToken0.getTokenType());
      assertEquals("S(lxj/?I$We^/", oAuth2AccessToken0.getScope());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("7a&$ k$2fWd/", "7a&$ k$2fWd/");
      Integer integer0 = oAuth2AccessToken0.getExpiresIn();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(61);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("_ O", "GL", integer0, "_ O", "asG$-", ":mbqiYk)?v,");
      oAuth2AccessToken0.getExpiresIn();
      assertEquals("_ O", oAuth2AccessToken0.getAccessToken());
      assertEquals("asG$-", oAuth2AccessToken0.getScope());
      assertEquals("GL", oAuth2AccessToken0.getTokenType());
      assertEquals("_ O", oAuth2AccessToken0.getRefreshToken());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-1624));
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "YdeD*", integer0, "", "", "");
      oAuth2AccessToken0.getExpiresIn();
      assertEquals("", oAuth2AccessToken0.getAccessToken());
      assertEquals("", oAuth2AccessToken0.getScope());
      assertEquals("", oAuth2AccessToken0.getRefreshToken());
      assertEquals("YdeD*", oAuth2AccessToken0.getTokenType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("8bOx:G5}C_O");
      String string0 = oAuth2AccessToken0.getAccessToken();
      assertEquals("8bOx:G5}C_O", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1367));
      OAuth2AccessToken oAuth2AccessToken0 = null;
      try {
        oAuth2AccessToken0 = new OAuth2AccessToken((String) null, "=", integer0, "=", "OAuth2AccessToken{access_token=", "OAuth2AccessToken{access_token=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // access_token can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = null;
      try {
        oAuth2AccessToken0 = new OAuth2AccessToken((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // access_token can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("r", "r");
      OAuth2AccessToken oAuth2AccessToken1 = new OAuth2AccessToken("r", (String) null, (Integer) null, (String) null, "r", "r");
      boolean boolean0 = oAuth2AccessToken0.equals(oAuth2AccessToken1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("_%vn$9|6^u,`K!;", "_%vn$9|6^u,`K!;");
      Integer integer0 = new Integer(1110);
      OAuth2AccessToken oAuth2AccessToken1 = new OAuth2AccessToken("_%vn$9|6^u,`K!;", (String) null, integer0, "_%vn$9|6^u,`K!;", "_%vn$9|6^u,`K!;", "_%vn$9|6^u,`K!;");
      boolean boolean0 = oAuth2AccessToken0.equals(oAuth2AccessToken1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("");
      Integer integer0 = new Integer((-14));
      OAuth2AccessToken oAuth2AccessToken1 = new OAuth2AccessToken("", "", integer0, "", "", "");
      boolean boolean0 = oAuth2AccessToken0.equals(oAuth2AccessToken1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("nUYRN7rX\"A-L");
      OAuth2AccessToken oAuth2AccessToken1 = new OAuth2AccessToken("");
      boolean boolean0 = oAuth2AccessToken0.equals(oAuth2AccessToken1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("");
      OAuth2AccessToken oAuth2AccessToken1 = new OAuth2AccessToken("", "");
      boolean boolean0 = oAuth2AccessToken1.equals(oAuth2AccessToken0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("");
      boolean boolean0 = oAuth2AccessToken0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer((-1624));
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "YdeD*", integer0, "", "", "");
      boolean boolean0 = oAuth2AccessToken0.equals(integer0);
      assertEquals("", oAuth2AccessToken0.getRefreshToken());
      assertEquals("", oAuth2AccessToken0.getScope());
      assertEquals("YdeD*", oAuth2AccessToken0.getTokenType());
      assertEquals("", oAuth2AccessToken0.getAccessToken());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer((-640));
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "", integer0, "", (String) null, "");
      oAuth2AccessToken0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(0);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "", integer0, "", "", "");
      String string0 = oAuth2AccessToken0.getScope();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "");
      boolean boolean0 = oAuth2AccessToken0.equals(oAuth2AccessToken0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = Integer.getInteger("@2d", (-268));
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("@2d", "@2d", integer0, "y|ZdK2kM `<8Fc", "@2d", "y|ZdK2kM `<8Fc");
      String string0 = oAuth2AccessToken0.getTokenType();
      assertEquals("@2d", oAuth2AccessToken0.getAccessToken());
      assertEquals("@2d", string0);
      assertEquals("@2d", oAuth2AccessToken0.getScope());
      assertEquals("y|ZdK2kM `<8Fc", oAuth2AccessToken0.getRefreshToken());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(0);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "", integer0, "", "", "");
      String string0 = oAuth2AccessToken0.toString();
      assertEquals("OAuth2AccessToken{access_token=, token_type=, expires_in=0, refresh_token=, scope=}", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(0);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "", integer0, "", "", "");
      String string0 = oAuth2AccessToken0.getRefreshToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = new Integer(0);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("dJB]:oX)", "dJB]:oX)", integer0, "dJB]:oX)", "dJB]:oX)", "dJB]:oX)");
      Integer integer1 = oAuth2AccessToken0.getExpiresIn();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = null;
      try {
        oAuth2AccessToken0 = new OAuth2AccessToken((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // access_token can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer(0);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("", "", integer0, "", "", "");
      String string0 = oAuth2AccessToken0.getAccessToken();
      assertEquals("", string0);
  }
}