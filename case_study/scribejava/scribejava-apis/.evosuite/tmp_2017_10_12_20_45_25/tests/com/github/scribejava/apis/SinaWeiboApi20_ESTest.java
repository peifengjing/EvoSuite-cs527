/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 06:27:11 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.apis.SinaWeiboApi20;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SinaWeiboApi20_ESTest extends SinaWeiboApi20_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinaWeiboApi20 sinaWeiboApi20_0 = new SinaWeiboApi20();
      String string0 = sinaWeiboApi20_0.getAuthorizationBaseUrl();
      assertEquals("https://api.weibo.com/oauth2/authorize", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SinaWeiboApi20 sinaWeiboApi20_0 = new SinaWeiboApi20();
      sinaWeiboApi20_0.getSignatureType();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SinaWeiboApi20 sinaWeiboApi20_0 = SinaWeiboApi20.instance();
      String string0 = sinaWeiboApi20_0.getAccessTokenEndpoint();
      assertEquals("https://api.weibo.com/oauth2/access_token", string0);
  }
}