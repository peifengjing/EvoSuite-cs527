/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:31:32 GMT 2017
 */

package org.joda.time.chrono.gj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.gj.TestJulianChronology;
import org.joda.time.chrono.gj.TestJulianWeekyearField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestJulianWeekyearField_ESTest extends TestJulianWeekyearField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology(1, (-1), 1);
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.add((long) 1, (long) 1);
      assertEquals(32054400001L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.addWrapField(1L, 0);
      assertEquals(1L, long0);
      assertEquals((-100000000), testJulianWeekyearField0.getMinimumValue());
      assertEquals(100000000, testJulianWeekyearField0.getMaximumValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.addWrapField(1258L, (-100000000));
      assertEquals((-3155760000086398742L), long0);
      assertEquals(100000000, testJulianWeekyearField0.getMaximumValue());
      assertEquals((-100000000), testJulianWeekyearField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology(57, 57, 57);
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      // Undeclared exception!
      try { 
        testJulianWeekyearField0.add(1799280000057L, 1799280000057L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 1799280000057
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestJulianWeekyearField testJulianWeekyearField0 = null;
      try {
        testJulianWeekyearField0 = new TestJulianWeekyearField((TestJulianChronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.gj.TestGJWeekyearField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology(57, 57, 57);
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      int int0 = testJulianWeekyearField0.getMaximumValue();
      assertEquals(100000000, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      int int0 = testJulianWeekyearField0.getMinimumValue();
      assertEquals((-100000000), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology(1, (-1), 1);
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.add(32054400001L, (long) (-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-1282), (-1282), (-1282));
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.add((long) (-1282), (long) (-1282));
      assertEquals((-40456886401282L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-1843), (-1843), (-1843));
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.add((long) (-1843), 21600000L);
      assertEquals(681644160086398157L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestJulianWeekyearField testJulianWeekyearField0 = new TestJulianWeekyearField(testJulianChronology0);
      long long0 = testJulianWeekyearField0.addWrapField(0L, 0);
      assertEquals(0L, long0);
      assertEquals(100000000, testJulianWeekyearField0.getMaximumValue());
      assertEquals((-100000000), testJulianWeekyearField0.getMinimumValue());
  }
}