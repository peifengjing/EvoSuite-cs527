/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 07:02:45 GMT 2017
 */

package com.github.scribejava.apis.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.examples.NeteaseWeiboExample;
import java.net.UnknownServiceException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NeteaseWeiboExample_ESTest extends NeteaseWeiboExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      try { 
        NeteaseWeiboExample.main(stringArray0);
        fail("Expecting exception: UnknownServiceException");
      
      } catch(UnknownServiceException e) {
         //
         // protocol doesn't support output
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }
}