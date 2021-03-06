/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 02:08:36 GMT 2017
 */

package org.asynchttpclient.extras.registry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Set;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.extras.registry.AsyncHttpClientRegistry;
import org.asynchttpclient.extras.registry.AsyncHttpClientRegistryImpl;
import org.asynchttpclient.extras.registry.TestAsyncHttpClientRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncHttpClientRegistryImpl_ESTest extends AsyncHttpClientRegistryImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestAsyncHttpClientRegistry testAsyncHttpClientRegistry0 = new TestAsyncHttpClientRegistry();
      testAsyncHttpClientRegistry0.clearAllInstances();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncHttpClientRegistryImpl asyncHttpClientRegistryImpl0 = new AsyncHttpClientRegistryImpl();
      // Undeclared exception!
      try { 
        asyncHttpClientRegistryImpl0.unregister((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TestAsyncHttpClientRegistry testAsyncHttpClientRegistry0 = new TestAsyncHttpClientRegistry();
      // Undeclared exception!
      try { 
        testAsyncHttpClientRegistry0.registerIfNew((String) null, (AsyncHttpClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncHttpClientRegistryImpl asyncHttpClientRegistryImpl0 = new AsyncHttpClientRegistryImpl();
      // Undeclared exception!
      try { 
        asyncHttpClientRegistryImpl0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncHttpClientRegistryImpl asyncHttpClientRegistryImpl0 = new AsyncHttpClientRegistryImpl();
      boolean boolean0 = asyncHttpClientRegistryImpl0.unregister("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncHttpClientRegistry asyncHttpClientRegistry0 = AsyncHttpClientRegistryImpl.getInstance();
      AsyncHttpClientRegistry asyncHttpClientRegistry1 = AsyncHttpClientRegistryImpl.getInstance();
      assertSame(asyncHttpClientRegistry1, asyncHttpClientRegistry0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncHttpClientRegistry asyncHttpClientRegistry0 = AsyncHttpClientRegistryImpl.getInstance();
      // Undeclared exception!
      try { 
        asyncHttpClientRegistry0.addOrReplace("Gv>!", (AsyncHttpClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncHttpClientRegistryImpl asyncHttpClientRegistryImpl0 = new AsyncHttpClientRegistryImpl();
      AsyncHttpClient asyncHttpClient0 = asyncHttpClientRegistryImpl0.get("");
      assertNull(asyncHttpClient0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TestAsyncHttpClientRegistry testAsyncHttpClientRegistry0 = new TestAsyncHttpClientRegistry();
      Set<String> set0 = testAsyncHttpClientRegistry0.getAllRegisteredNames();
      assertTrue(set0.isEmpty());
  }
}
