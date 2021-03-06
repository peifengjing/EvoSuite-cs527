/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:53:00 GMT 2017
 */

package org.joda.time.chrono.gj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationField;
import org.joda.time.chrono.gj.TestGJChronology;
import org.joda.time.chrono.gj.TestGJMonthOfYearField;
import org.joda.time.chrono.gj.TestGregorianChronology;
import org.joda.time.chrono.gj.TestJulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestGJMonthOfYearField_ESTest extends TestGJMonthOfYearField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testJulianChronology0);
      int int0 = testGJMonthOfYearField0.getLeapAmount(10000L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology(23, 23, 23);
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testJulianChronology0);
      long long0 = testGJMonthOfYearField0.roundCeiling(23);
      assertEquals(604800000L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.set((-2442L), (-142));
      assertEquals((-406684802442L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.set(814L, 0);
      assertEquals((-2678399186L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testJulianChronology0);
      long long0 = testGJMonthOfYearField0.roundFloor(5327942408123L);
      assertEquals(5326387200000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology(2616, 2616, 2616);
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testJulianChronology0);
      long long0 = testGJMonthOfYearField0.roundFloor(2616);
      assertEquals((-950400000L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-4414), (-4414), 0);
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testJulianChronology0);
      long long0 = testGJMonthOfYearField0.add(0L, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.add(2430L, 2430L);
      assertEquals(6390230402430L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TestGJMonthOfYearField testGJMonthOfYearField0 = null;
      try {
        testGJMonthOfYearField0 = new TestGJMonthOfYearField((TestGJChronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.gj.TestGJMonthOfYearField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology((-1), (-1), (-1));
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.add((long) (-1), (long) (-1));
      assertEquals((-2592000001L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.set((-2154L), 699);
      assertEquals(1815263997846L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      int int0 = testGJMonthOfYearField0.get(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology(8, 17, (-3358));
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      int int0 = testGJMonthOfYearField0.getLeapAmount((-3358));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      int int0 = testGJMonthOfYearField0.getLeapAmount(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology(2616, 2616, 2616);
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testJulianChronology0);
      boolean boolean0 = testGJMonthOfYearField0.isLeap((-950400000L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology(8, 17, (-3358));
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      boolean boolean0 = testGJMonthOfYearField0.isLeap(17);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      boolean boolean0 = testGJMonthOfYearField0.isLeap(2840L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.add(0L, 1000000000000000L);
      assertEquals((-5157946175488945152L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.set(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      int int0 = testGJMonthOfYearField0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      DurationField durationField0 = testGJMonthOfYearField0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      int int0 = testGJMonthOfYearField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      DurationField durationField0 = testGJMonthOfYearField0.getLeapDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TestGregorianChronology testGregorianChronology0 = new TestGregorianChronology();
      TestGJMonthOfYearField testGJMonthOfYearField0 = new TestGJMonthOfYearField(testGregorianChronology0);
      long long0 = testGJMonthOfYearField0.roundFloor(2);
      assertEquals(0L, long0);
  }
}
