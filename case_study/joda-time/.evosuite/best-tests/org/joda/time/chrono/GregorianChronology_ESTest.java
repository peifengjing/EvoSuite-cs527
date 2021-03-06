/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:00:48 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GregorianChronology_ESTest extends GregorianChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        gregorianChronology0.getYearMonthMillis(100, 100);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 99
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1157, 462, 0, 0, 2457, 0, 1157, 2457);
      long long0 = gregorianChronology0.add((ReadablePeriod) mutablePeriod0, 1253L, (-292));
      assertEquals((-11018673252160191L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      boolean boolean0 = gregorianChronology0.isLeapYear(529);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getMaxYear();
      assertEquals(292278993, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15778476000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.getAverageMillisPerMonth();
      assertEquals(2629746000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(31083597720000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(719529);
      assertEquals(22643974915200000L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        gregorianChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4436));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      assertNotNull(gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        GregorianChronology.getInstance((DateTimeZone) null, 3214);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 3214
         //
         verifyException("org.joda.time.chrono.GregorianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Chronology chronology0 = gregorianChronology0.withUTC();
      assertSame(gregorianChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis((-4325));
      assertEquals((-198650966400000L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(1970);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        gregorianChronology0.getYearMonthMillis((-700), (-700));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -701
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      boolean boolean0 = gregorianChronology0.isLeapYear(164);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 3);
      // Undeclared exception!
      try { 
        gregorianChronology0.getDayOfMonth(3, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = gregorianChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gregorianChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MockZone mockZone0 = new MockZone(1970, (-4325), 1942);
      Chronology chronology0 = gregorianChronology0.withZone(mockZone0);
      assertNotNull(chronology0);
      assertNotSame(chronology0, gregorianChronology0);
      assertFalse(chronology0.equals((Object)gregorianChronology0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getMinYear();
      assertEquals((-292275054), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.getAverageMillisPerYear();
      assertEquals(31556952000L, long0);
  }
}
