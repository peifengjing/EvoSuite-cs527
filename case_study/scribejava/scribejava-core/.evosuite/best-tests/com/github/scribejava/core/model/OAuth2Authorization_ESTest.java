/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:24:25 GMT 2017
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.core.model.OAuth2Authorization;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth2Authorization_ESTest extends OAuth2Authorization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setState("1TB*2fM$yjOBj-XPlM");
      String string0 = oAuth2Authorization0.getState();
      assertEquals("1TB*2fM$yjOBj-XPlM", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setCode("/O");
      String string0 = oAuth2Authorization0.getCode();
      assertEquals("/O", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setCode("");
      String string0 = oAuth2Authorization0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      String string0 = oAuth2Authorization0.getState();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setState("");
      String string0 = oAuth2Authorization0.getState();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      String string0 = oAuth2Authorization0.getCode();
      assertNull(string0);
  }
}