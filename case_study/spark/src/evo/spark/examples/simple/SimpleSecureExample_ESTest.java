/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:35:17 GMT 2017
 */

package spark.examples.simple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.examples.simple.SimpleSecureExample;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleSecureExample_ESTest extends SimpleSecureExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleSecureExample simpleSecureExample0 = new SimpleSecureExample();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        SimpleSecureExample.main(stringArray0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // This must be done before route mapping has begun
         //
         verifyException("spark.Service", e);
      }
  }
}
