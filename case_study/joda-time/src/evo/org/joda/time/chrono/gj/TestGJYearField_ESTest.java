/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:18:41 GMT 2017
 */

package org.joda.time.chrono.gj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.gj.TestGJChronology;
import org.joda.time.chrono.gj.TestGJYearField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestGJYearField_ESTest extends TestGJYearField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestGJYearField testGJYearField0 = null;
      try {
        testGJYearField0 = new TestGJYearField((TestGJChronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.gj.TestGJYearField", e);
      }
  }
}
