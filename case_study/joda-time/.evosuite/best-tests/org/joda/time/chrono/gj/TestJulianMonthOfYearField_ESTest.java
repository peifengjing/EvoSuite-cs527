/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:51:35 GMT 2017
 */

package org.joda.time.chrono.gj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.gj.TestJulianChronology;
import org.joda.time.chrono.gj.TestJulianMonthOfYearField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestJulianMonthOfYearField_ESTest extends TestJulianMonthOfYearField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertNotNull(testJulianChronology0);
      
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertFalse(testJulianMonthOfYearField0.isLenient());
      assertNotNull(testJulianMonthOfYearField0);
      
      long long0 = testJulianMonthOfYearField0.add(1L, (-86399999L));
      assertEquals((-227214717321599999L), long0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertFalse(testJulianMonthOfYearField0.isLenient());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-249), (-249), 3963);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertNotNull(testJulianChronology0);
      
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
      assertFalse(testJulianMonthOfYearField0.isLenient());
      assertNotNull(testJulianMonthOfYearField0);
      
      long long0 = testJulianMonthOfYearField0.add(0L, (long) 3963);
      assertEquals(10421827200000L, long0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
      assertFalse(testJulianMonthOfYearField0.isLenient());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertNotNull(testJulianChronology0);
      
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
      assertFalse(testJulianMonthOfYearField0.isLenient());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
      assertNotNull(testJulianMonthOfYearField0);
      
      long long0 = testJulianMonthOfYearField0.add(0L, 0L);
      assertEquals(0L, long0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
      assertFalse(testJulianMonthOfYearField0.isLenient());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = null;
      try {
        testJulianMonthOfYearField0 = new TestJulianMonthOfYearField((TestJulianChronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.gj.TestGJMonthOfYearField", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-1), 17, 17);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertNotNull(testJulianChronology0);
      
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
      assertFalse(testJulianMonthOfYearField0.isLenient());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
      assertNotNull(testJulianMonthOfYearField0);
      
      int int0 = testJulianMonthOfYearField0.get(17);
      assertEquals(5, int0);
      assertEquals("TestJulianChronology", testJulianChronology0.toString());
      assertEquals(1, testJulianMonthOfYearField0.getMinimumValue());
      assertEquals("monthOfYear", testJulianMonthOfYearField0.getName());
      assertFalse(testJulianMonthOfYearField0.isLenient());
      assertTrue(testJulianMonthOfYearField0.isSupported());
      assertEquals(12, testJulianMonthOfYearField0.getMaximumValue());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology();
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      long long0 = testJulianMonthOfYearField0.add((-2441L), (-6419433602441L));
      assertEquals(5190772588692142711L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-1), 4, 4);
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      long long0 = testJulianMonthOfYearField0.add(685L, (-1L));
      assertEquals((-2678399315L), long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-1), 17, 17);
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      long long0 = testJulianMonthOfYearField0.add((long) 5, (long) (-1));
      assertEquals((-2591999995L), long0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TestJulianChronology testJulianChronology0 = new TestJulianChronology((-1), 4, 4);
      TestJulianMonthOfYearField testJulianMonthOfYearField0 = new TestJulianMonthOfYearField(testJulianChronology0);
      long long0 = testJulianMonthOfYearField0.add((-2316L), (long) 12);
      assertEquals(31535997684L, long0);
  }
}
