/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 07:05:49 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.apis.NaverApi;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NaverApi_ESTest extends NaverApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NaverApi naverApi0 = new NaverApi();
      String string0 = naverApi0.getAuthorizationBaseUrl();
      assertEquals("https://nid.naver.com/oauth2.0/authorize", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NaverApi naverApi0 = new NaverApi();
      naverApi0.getSignatureType();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NaverApi naverApi0 = NaverApi.instance();
      assertEquals("https://nid.naver.com/oauth2.0/token?grant_type=authorization_code", naverApi0.getAccessTokenEndpoint());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NaverApi naverApi0 = new NaverApi();
      String string0 = naverApi0.getAccessTokenEndpoint();
      assertEquals("https://nid.naver.com/oauth2.0/token?grant_type=authorization_code", string0);
  }
}