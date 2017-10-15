/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 18:12:34 GMT 2017
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.MockZone;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractInterval_ESTest extends AbstractInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      Interval interval1 = interval0.withStartMillis((-1240L));
      interval1.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Interval interval0 = new Interval((-1871L), 503L, (Chronology) null);
      Instant instant0 = new Instant((-1L));
      Interval interval1 = interval0.withEnd(instant0);
      boolean boolean0 = interval0.equals(interval1);
      assertFalse(interval1.equals((Object)interval0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 2147483642, 2147483642, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 1268L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      DateTime dateTime0 = new DateTime(1268L);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, mutablePeriod0);
      boolean boolean0 = interval0.equals(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1240L), (-1240L));
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      Interval interval1 = interval0.withStartMillis((-1240L));
      boolean boolean0 = interval1.isEqual(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1240L), (-1240L));
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = interval0.isEqual(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1240L), (-1240L));
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = interval0.overlaps(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setEndMillis(1392409281320L);
      boolean boolean0 = mutableInterval0.overlaps((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDate localDate0 = new LocalDate((-1110L), (Chronology) ethiopicChronology0);
      LocalDate localDate1 = localDate0.withCenturyOfEra(131);
      LocalDate localDate2 = localDate1.plusWeeks(131);
      MockZone mockZone0 = new MockZone(131, 131, 1);
      Interval interval0 = localDate2.toInterval((DateTimeZone) mockZone0);
      boolean boolean0 = interval0.overlaps((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Interval interval0 = new Interval((-3L), 0L, (Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      boolean boolean0 = interval0.contains((ReadableInterval) mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1240L), (-1240L));
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = mutableInterval0.contains((ReadableInterval) interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      MutableInterval mutableInterval1 = mutableInterval0.toMutableInterval();
      assertNotSame(mutableInterval1, mutableInterval0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Interval interval0 = new Interval((-1240L), (-1240L));
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      assertEquals((-1240L), mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Interval interval0 = mutableInterval0.toInterval();
      assertEquals(0L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Interval interval0 = new Interval((-1L), 0L);
      Interval interval1 = interval0.toInterval();
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Interval interval0 = new Interval((-1L), 0L);
      Duration duration0 = interval0.toDuration();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Period period0 = new Period(duration0, mutableDateTime0);
      MutableInterval mutableInterval0 = new MutableInterval(period0, mutableDateTime0);
      mutableInterval0.toInterval();
      assertEquals(1L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-2380L), (-2380L));
      Interval interval0 = mutableInterval0.toInterval();
      assertEquals((-2380L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      long long0 = mutableInterval0.toDurationMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Interval interval0 = new Interval(1L, 31083663600000L);
      Duration duration0 = interval0.toDuration();
      assertEquals(31083663599999L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L));
      Duration duration0 = interval0.toDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = interval0.isBeforeNow();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.months(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime(0L, dateTimeZone0);
      MutableInterval mutableInterval0 = new MutableInterval(period0, dateTime0);
      boolean boolean0 = mutableInterval0.isBefore((ReadableInterval) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = mutableInterval0.isAfterNow();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 1268L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      DateTime dateTime0 = new DateTime(1268L);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, mutablePeriod0);
      boolean boolean0 = interval0.isAfter((ReadableInterval) mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1240L), (-1240L));
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = mutableInterval0.isAfter((ReadableInterval) interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Interval interval0 = new Interval((-1871L), 516L, (Chronology) null);
      Interval interval1 = interval0.withStartMillis(272L);
      Instant instant0 = new Instant((-1L));
      boolean boolean0 = interval1.isAfter((ReadableInstant) instant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      DateTime dateTime0 = mutableInterval0.getStart();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      Interval interval0 = new Interval((-2058L), (-2058L), gregorianChronology0);
      DateTime dateTime0 = interval0.getStart();
      assertEquals((-2058L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      DateTime dateTime0 = interval0.getEnd();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Instant instant0 = new Instant((-1L));
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, instant0);
      Duration duration0 = mutablePeriod0.toDurationFrom(instant0);
      Interval interval0 = duration0.toIntervalTo(instant0);
      DateTime dateTime0 = interval0.getEnd();
      assertEquals((-1L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      boolean boolean0 = interval0.containsNow();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Interval interval0 = new Interval((-1871L), (-1871L));
      Instant instant0 = new Instant((-1L));
      boolean boolean0 = interval0.contains((ReadableInstant) instant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      Interval interval1 = interval0.withStart((ReadableInstant) null);
      PeriodType periodType0 = PeriodType.minutes();
      // Undeclared exception!
      try { 
        interval1.toPeriod(periodType0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 3220166161658
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, periodType0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L);
      Duration duration0 = mutablePeriod0.toDurationTo(mutableDateTime0);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, mutableDateTime0);
      // Undeclared exception!
      try { 
        mutableInterval0.isEqual((ReadableInterval) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      boolean boolean0 = mutableInterval0.isAfter(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      boolean boolean0 = mutableInterval0.isBefore(0L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Duration duration0 = Duration.standardDays(10080L);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Instant instant0 = Instant.parse("", dateTimeFormatter0);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, instant0);
      DateTime dateTime0 = mutableInterval0.getEnd();
      Period period0 = mutableInterval0.toPeriod();
      MutableInterval mutableInterval1 = new MutableInterval(dateTime0, period0);
      boolean boolean0 = mutableInterval1.isBefore(10080L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Interval interval0 = new Interval((-1L), 0L);
      boolean boolean0 = interval0.overlaps(interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L));
      MutableInterval mutableInterval0 = new MutableInterval();
      Interval interval1 = mutableInterval0.toInterval();
      boolean boolean0 = interval0.overlaps(interval1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L));
      boolean boolean0 = interval0.overlaps(interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1193), Integer.MAX_VALUE, (-1193), (-1725), (-1725), 0, 1, Integer.MAX_VALUE);
      DateTime dateTime0 = new DateTime(1268L);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, mutablePeriod0);
      boolean boolean0 = mutableInterval0.contains(1268L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(840L, 840L);
      boolean boolean0 = mutableInterval0.contains(840L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L));
      // Undeclared exception!
      try { 
        interval0.withStartMillis(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 2147483642, 2147483642, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      boolean boolean0 = interval0.isAfterNow();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) copticChronology0);
      Interval interval0 = localDate0.toInterval();
      long long0 = interval0.toDurationMillis();
      assertEquals(86400000L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 2147483642, 2147483642, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      boolean boolean0 = interval0.isBeforeNow();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1193), Integer.MAX_VALUE, (-1193), (-1725), (-1725), 0, 1, Integer.MAX_VALUE);
      DateTime dateTime0 = new DateTime(1268L);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, mutablePeriod0);
      boolean boolean0 = mutableInterval0.containsNow();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1193), Integer.MAX_VALUE, (-1193), (-1725), (-1725), 0, 1, Integer.MAX_VALUE);
      DateTime dateTime0 = new DateTime(1268L);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, mutablePeriod0);
      boolean boolean0 = mutableInterval0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Interval interval0 = new Interval((-1L), 0L);
      boolean boolean0 = interval0.equals(interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Interval interval0 = new Interval((-1871L), 503L, (Chronology) null);
      Interval interval1 = interval0.withStartMillis((-1123L));
      boolean boolean0 = interval0.equals(interval1);
      assertFalse(interval1.equals((Object)interval0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = mutableInterval0.isAfter((ReadableInterval) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Interval interval0 = new Interval((-1871L), 516L, (Chronology) null);
      Instant instant0 = new Instant((-1L));
      boolean boolean0 = interval0.isAfter((ReadableInstant) instant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = interval0.isAfter((-1240L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = mutableInterval0.isBefore((ReadableInstant) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      DateTime dateTime0 = new DateTime(1268L);
      boolean boolean0 = interval0.isBefore((ReadableInstant) dateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      boolean boolean0 = interval0.isBefore((ReadableInterval) interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Interval interval0 = new Interval((-3L), 0L, (Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      boolean boolean0 = interval0.isEqual(mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Interval interval0 = new Interval((-3L), (-3L));
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      boolean boolean0 = interval0.isEqual(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Interval interval0 = new Interval((-3L), 2L, (Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval();
      boolean boolean0 = interval0.isEqual(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      boolean boolean0 = interval0.overlaps((ReadableInterval) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      boolean boolean0 = interval0.overlaps((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      boolean boolean0 = mutableInterval0.overlaps((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Interval interval0 = new Interval((-3L), (-3L));
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      Interval interval1 = interval0.overlap(mutableInterval0);
      assertNull(interval1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Interval interval0 = new Interval((-3L), 0L, (Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      Interval interval1 = interval0.withEndMillis(270L);
      boolean boolean0 = mutableInterval0.contains((ReadableInterval) interval1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Interval interval0 = new Interval((-3L), 2L, (Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval();
      boolean boolean0 = interval0.contains((ReadableInterval) mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 2147483642, 2147483642, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 1268L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      Interval interval1 = interval0.withPeriodBeforeEnd(mutablePeriod0);
      boolean boolean0 = interval1.contains((ReadableInterval) interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Interval interval0 = new Interval((-3L), (-3L));
      MutableInterval mutableInterval0 = new MutableInterval((-3L), 0L);
      boolean boolean0 = interval0.contains((ReadableInterval) mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      boolean boolean0 = interval0.contains((ReadableInstant) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Interval interval0 = new Interval((-1871L), 503L, (Chronology) null);
      Instant instant0 = new Instant((-1L));
      boolean boolean0 = interval0.contains((ReadableInstant) instant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = mutableInterval0.contains((-1L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1240L), (-1240L));
      Interval interval0 = mutableInterval0.toInterval();
      interval0.hashCode();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Interval interval0 = mutableInterval0.toInterval();
      boolean boolean0 = mutableInterval0.equals(interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1725), (-1193));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = interval0.toPeriod(periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getStart();
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      boolean boolean0 = interval0.isAfter((ReadableInstant) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      boolean boolean0 = mutableInterval0.contains((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      String string0 = mutableInterval0.toString();
      assertEquals("2014-02-01T00:00:00.000Z/2014-03-01T00:00:00.000Z", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Interval interval0 = new Interval((-1871L), 503L, (Chronology) null);
      Interval interval1 = interval0.withDurationAfterStart((ReadableDuration) null);
      boolean boolean0 = interval1.equals(interval0);
      assertFalse(boolean0);
      assertFalse(interval0.equals((Object)interval1));
  }
}