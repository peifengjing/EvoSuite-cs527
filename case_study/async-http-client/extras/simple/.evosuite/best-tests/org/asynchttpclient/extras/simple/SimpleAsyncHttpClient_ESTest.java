/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 02:32:03 GMT 2017
 */

package org.asynchttpclient.extras.simple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.extras.simple.SimpleAsyncHttpClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleAsyncHttpClient_ESTest extends SimpleAsyncHttpClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleAsyncHttpClient.Builder simpleAsyncHttpClient_Builder0 = null;
      try {
        simpleAsyncHttpClient_Builder0 = new SimpleAsyncHttpClient.Builder();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.asynchttpclient.RequestBuilder
         //
         verifyException("org.asynchttpclient.extras.simple.SimpleAsyncHttpClient$Builder", e);
      }
  }
}
