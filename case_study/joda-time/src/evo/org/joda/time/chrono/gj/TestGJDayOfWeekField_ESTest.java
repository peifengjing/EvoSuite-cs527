/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:53:25 GMT 2017
 */

package org.joda.time.chrono.gj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.gj.TestGJChronology;
import org.joda.time.chrono.gj.TestGJDayOfWeekField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestGJDayOfWeekField_ESTest extends TestGJDayOfWeekField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestGJDayOfWeekField testGJDayOfWeekField0 = new TestGJDayOfWeekField((TestGJChronology) null);
      // Undeclared exception!
      try { 
        testGJDayOfWeekField0.roundHalfEven(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.gj.TestGJDayOfWeekField", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TestGJDayOfWeekField testGJDayOfWeekField0 = new TestGJDayOfWeekField((TestGJChronology) null);
      // Undeclared exception!
      try { 
        testGJDayOfWeekField0.set(0L, (-639));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.gj.TestGJDayOfWeekField", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TestGJDayOfWeekField testGJDayOfWeekField0 = new TestGJDayOfWeekField((TestGJChronology) null);
      long long0 = testGJDayOfWeekField0.add(246L, 246L);
      assertEquals(21254400246L, long0);
  }
}
