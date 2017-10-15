/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 04:01:39 GMT 2017
 */

package com.github.scribejava.apis;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.apis.SalesforceApi;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SalesforceApi_ESTest extends SalesforceApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SalesforceApi salesforceApi0 = new SalesforceApi("com.github.scribejava.apis.SalesforceApi$InstanceHolder");
      assertEquals("https://com.github.scribejava.apis.SalesforceApi$InstanceHolder/services/oauth2/token", salesforceApi0.getAccessTokenEndpoint());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SalesforceApi.initTLSv11orUpper();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SalesforceApi salesforceApi0 = SalesforceApi.sandbox();
      salesforceApi0.getAccessTokenVerb();
      assertEquals("https://test.salesforce.com/services/oauth2/token", salesforceApi0.getAccessTokenEndpoint());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SalesforceApi salesforceApi0 = SalesforceApi.sandbox();
      salesforceApi0.getAccessTokenExtractor();
      assertEquals("https://test.salesforce.com/services/oauth2/token", salesforceApi0.getAccessTokenEndpoint());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SalesforceApi salesforceApi0 = SalesforceApi.instance();
      String string0 = salesforceApi0.getAccessTokenEndpoint();
      assertEquals("https://login.salesforce.com/services/oauth2/token", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SalesforceApi salesforceApi0 = SalesforceApi.sandbox();
      String string0 = salesforceApi0.getAuthorizationBaseUrl();
      assertEquals("https://test.salesforce.com/services/oauth2/authorize", string0);
      assertEquals("https://test.salesforce.com/services/oauth2/token", salesforceApi0.getAccessTokenEndpoint());
  }
}
