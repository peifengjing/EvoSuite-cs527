/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:17:27 GMT 2017
 */

package com.github.scribejava.core.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.core.exceptions.OAuthException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuthException_ESTest extends OAuthException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuthException oAuthException0 = new OAuthException("");
      OAuthException oAuthException1 = new OAuthException(oAuthException0);
      assertFalse(oAuthException1.equals((Object)oAuthException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuthException oAuthException0 = new OAuthException("");
      OAuthException oAuthException1 = new OAuthException("euc#dE?", oAuthException0);
      assertFalse(oAuthException1.equals((Object)oAuthException0));
  }
}
