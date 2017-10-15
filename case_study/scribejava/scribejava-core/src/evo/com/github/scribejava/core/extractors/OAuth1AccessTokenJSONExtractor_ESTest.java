/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:18:56 GMT 2017
 */

package com.github.scribejava.core.extractors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.extractors.OAuth1AccessTokenJSONExtractor;
import com.github.scribejava.core.model.OAuth1AccessToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth1AccessTokenJSONExtractor_ESTest extends OAuth1AccessTokenJSONExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth1AccessTokenJSONExtractor oAuth1AccessTokenJSONExtractor0 = OAuth1AccessTokenJSONExtractor.instance();
      // Undeclared exception!
      try { 
        oAuth1AccessTokenJSONExtractor0.createToken((String) null, (String) null, "oWTob G;@hA k/1 m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oauth_token can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth1AccessTokenJSONExtractor oAuth1AccessTokenJSONExtractor0 = new OAuth1AccessTokenJSONExtractor();
      OAuth1AccessToken oAuth1AccessToken0 = oAuth1AccessTokenJSONExtractor0.createToken("G}@.v5L:@)+a", "G}@.v5L:@)+a", "G}@.v5L:@)+a");
      assertFalse(oAuth1AccessToken0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth1AccessTokenJSONExtractor oAuth1AccessTokenJSONExtractor0 = OAuth1AccessTokenJSONExtractor.instance();
      OAuth1AccessToken oAuth1AccessToken0 = oAuth1AccessTokenJSONExtractor0.createToken("", "", "");
      assertEquals("", oAuth1AccessToken0.getToken());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth1AccessTokenJSONExtractor oAuth1AccessTokenJSONExtractor0 = new OAuth1AccessTokenJSONExtractor();
      // Undeclared exception!
      try { 
        oAuth1AccessTokenJSONExtractor0.createToken((String) null, ">_H", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oauth_token can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }
}