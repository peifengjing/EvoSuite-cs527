/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:04:59 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JulianChronology_ESTest extends JulianChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(7);
      Chronology chronology0 = julianChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      boolean boolean0 = julianChronology0.isLeapYear((-428));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      boolean boolean0 = julianChronology0.isLeapYear(130);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getMaxYear();
      assertEquals(292272992, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.getAverageMillisPerYear();
      assertEquals(31557600000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.getAverageMillisPerMonth();
      assertEquals(2629800000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.calculateFirstDayOfYearMillis((-2042));
      assertEquals((-126607968000000L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet(1440);
      assertEquals(1440, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet((-1460));
      assertEquals((-1459), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      try { 
        julianChronology0.getDateMidnightMillis(334, 159, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 159 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology((Chronology) null, (Object) null, (-774));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -774
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.calculateFirstDayOfYearMillis(1970);
      assertEquals(1123200000L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, islamicChronology0, 1);
      int int0 = julianChronology0.getDayOfMonth(492148, 492148, 1);
      assertEquals((-179037525), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockZone mockZone0 = new MockZone(247L, (-37), (-37));
      // Undeclared exception!
      try { 
        JulianChronology.getInstance((DateTimeZone) mockZone0, (-37));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -37
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 2);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Chronology chronology0 = julianChronology0.withUTC();
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      // Undeclared exception!
      try { 
        julianChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      long long0 = julianChronology0.getDateMidnightMillis(3628, 1, 3);
      assertEquals(52323753600000L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = julianChronology0.withZone(dateTimeZone0);
      assertSame(julianChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 1);
      int int0 = julianChronology0.getMinYear();
      assertEquals((-292269054), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertSame(julianChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      long long0 = julianChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15778800000L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.getDateMidnightMillis(2, 2, 2);
      assertEquals((-62101468800000L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(31083663600000L, long0);
  }
}