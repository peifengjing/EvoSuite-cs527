/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:14:56 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.MockZone;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) null);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((Object) null, mockNullZoneChronology0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // year field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null, (Chronology) null);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay(mockHijrahDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay(0L, (Chronology) mockNullZoneChronology0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // year field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay(0, 0, 0, mockNullZoneChronology0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // year field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("nu5ZUFMQJ&4~4");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(mockGregorianCalendar0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[14];
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((YearMonthDay) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(3100L, (Chronology) null);
      assertEquals(1970, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(1, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockZone mockZone0 = new MockZone(36L, 5, 5);
      YearMonthDay yearMonthDay0 = new YearMonthDay((DateTimeZone) mockZone0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay("nu5ZUFMQJ&4~4", mockNullZoneChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"nu5ZUFMQJ&4~4\"
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay(2035, 2035, 2035);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2035 for monthOfYear must not be larger than 12
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((YearMonthDay) null, (Chronology) mockNullZoneChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((-2457), 0, 46, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) (-770));
      assertEquals(3, yearMonthDay0.size());
      assertEquals(31, yearMonthDay0.getDayOfMonth());
      assertEquals(1969, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay((Chronology) mockNullZoneChronology0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // year field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
  }
}
