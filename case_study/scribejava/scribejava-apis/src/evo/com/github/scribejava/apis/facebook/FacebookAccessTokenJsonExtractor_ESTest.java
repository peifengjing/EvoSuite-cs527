/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 06:26:21 GMT 2017
 */

package com.github.scribejava.apis.facebook;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.facebook.FacebookAccessTokenJsonExtractor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FacebookAccessTokenJsonExtractor_ESTest extends FacebookAccessTokenJsonExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FacebookAccessTokenJsonExtractor facebookAccessTokenJsonExtractor0 = new FacebookAccessTokenJsonExtractor();
      // Undeclared exception!
      try { 
        facebookAccessTokenJsonExtractor0.generateError((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FacebookAccessTokenJsonExtractor facebookAccessTokenJsonExtractor0 = new FacebookAccessTokenJsonExtractor();
      // Undeclared exception!
      try { 
        facebookAccessTokenJsonExtractor0.generateError("Received an invalid parameter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.apis.facebook.FacebookAccessTokenJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FacebookAccessTokenJsonExtractor facebookAccessTokenJsonExtractor0 = FacebookAccessTokenJsonExtractor.instance();
      assertNotNull(facebookAccessTokenJsonExtractor0);
  }
}