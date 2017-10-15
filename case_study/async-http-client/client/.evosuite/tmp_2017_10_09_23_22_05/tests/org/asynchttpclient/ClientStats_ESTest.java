/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 07:59:01 GMT 2017
 */

package org.asynchttpclient;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.asynchttpclient.ClientStats;
import org.asynchttpclient.HostStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientStats_ESTest extends ClientStats_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClientStats clientStats0 = null;
      try {
        clientStats0 = new ClientStats((Map<String, HostStats>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }
}
