/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:28:30 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MockPartial;
import org.joda.time.MockZone;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPartialFieldProperty_ESTest extends AbstractPartialFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Chronology) null);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      YearMonth.Property yearMonth_Property1 = yearMonth0.year();
      boolean boolean0 = yearMonth_Property1.equals(yearMonth_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-2265), 22);
      YearMonth yearMonth0 = YearMonth.fromDateFields(mockDate0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      DurationField durationField0 = yearMonth_Property0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(13, 13, copticChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      int int0 = monthDay_Property0.getMinimumValueOverall();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      Chronology chronology0 = mockPartial0.getChronology();
      YearMonth yearMonth0 = new YearMonth(0L, chronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      int int0 = yearMonth_Property0.getMinimumValueOverall();
      assertEquals((-292275054), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(85);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      DateTimeField dateTimeField0 = yearMonth_Property0.getField();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.get();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(13, 13, copticChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      DateTime dateTime0 = new DateTime(0, 1, 1, 13, 1, 0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        monthDay_Property0.compareTo((ReadableInstant) dateTime1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-2265), 22);
      YearMonth yearMonth0 = YearMonth.fromDateFields(mockDate0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      DateTimeFieldType dateTimeFieldType0 = yearMonth_Property0.getFieldType();
      assertEquals("year", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.getName();
      assertEquals("monthOfYear", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now((Chronology) buddhistChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.getAsShortText((Locale) null);
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Object) null);
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      Locale locale0 = new Locale("America/New_York", "");
      String string0 = yearMonth_Property0.getAsText(locale0);
      assertEquals("2014", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      YearMonth.Property yearMonth_Property1 = yearMonth0.monthOfYear();
      boolean boolean0 = yearMonth_Property1.equals(yearMonth_Property0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      boolean boolean0 = monthDay_Property0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Chronology) null);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      boolean boolean0 = yearMonth_Property0.equals(yearMonth_Property0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Chronology) null);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      YearMonth.Property yearMonth_Property1 = yearMonth0.year();
      boolean boolean0 = yearMonth_Property0.equals(yearMonth_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MockZone mockZone0 = new MockZone(1, 1, 1);
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      MonthDay monthDay1 = MonthDay.now((DateTimeZone) mockZone0);
      int int0 = monthDay_Property0.compareTo((ReadablePartial) monthDay1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      MonthDay monthDay1 = monthDay_Property0.addWrapFieldToCopy(1);
      int int0 = monthDay_Property0.compareTo((ReadablePartial) monthDay1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Chronology) null);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      // Undeclared exception!
      try { 
        yearMonth_Property0.compareTo((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractPartialFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      int int0 = monthDay_Property0.compareTo((ReadablePartial) monthDay0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      DateTime dateTime0 = DateTime.now();
      int int0 = yearMonth_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay();
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      DateTime dateTime0 = new DateTime(10800000L);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) copticChronology0);
      int int0 = monthDay_Property0.compareTo((ReadableInstant) dateTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(85);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      // Undeclared exception!
      try { 
        yearMonth_Property0.compareTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractPartialFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(13, 13, copticChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      DateTime dateTime0 = new DateTime(0, 1, 1, 13, 1, 0);
      int int0 = monthDay_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.getAsString();
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      Chronology chronology0 = mockPartial0.getChronology();
      YearMonth yearMonth0 = new YearMonth(0L, chronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      Locale locale0 = Locale.ITALY;
      int int0 = yearMonth_Property0.getMaximumTextLength(locale0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      int int0 = monthDay_Property0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      int int0 = yearMonth_Property0.getMinimumValue();
      assertEquals((-292275054), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      String string0 = monthDay_Property0.getAsShortText();
      assertEquals("4", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      yearMonth_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(13, 13, copticChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      Locale locale0 = Locale.JAPAN;
      int int0 = monthDay_Property0.getMaximumShortTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.getAsText();
      assertEquals("February", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      int int0 = partial_Property0.getMinimumValueOverall();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      DurationField durationField0 = monthDay_Property0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.getMaximumValueOverall();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      DurationField durationField0 = yearMonth_Property0.getDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(85);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.toString();
      assertEquals("Property[monthOfYear]", string0);
  }
}
