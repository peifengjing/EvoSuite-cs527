/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 04:32:13 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.MockPartial;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.days(5);
      Days days1 = days0.plus(Integer.MIN_VALUE);
      boolean boolean0 = days0.isLessThan(days1);
      assertEquals((-2147483643), days1.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      boolean boolean0 = days0.isLessThan((Days) null);
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.millis(2005L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Instant instant0 = Instant.now();
      Instant instant1 = Instant.now();
      Days days0 = Days.daysBetween((ReadableInstant) instant1, (ReadableInstant) instant0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.days(0);
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(0, days0.getDays());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.days(14);
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(14, days0.getDays());
      assertEquals(2, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Seconds seconds0 = duration0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.days(460);
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals(662400, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2389L));
      Seconds seconds0 = duration0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      assertEquals((-2376), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.standardDays(0L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Weeks weeks0 = minutes0.toStandardWeeks();
      Days days0 = weeks0.toStandardDays();
      Duration duration1 = days0.ZERO.toStandardDuration();
      assertEquals(0, days0.getDays());
      assertEquals(0L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.days((-610));
      Duration duration0 = days0.toStandardDuration();
      assertEquals((-52704000000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.standardDaysIn((ReadablePeriod) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.standardDays(0L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Weeks weeks0 = minutes0.toStandardWeeks();
      Days days0 = weeks0.toStandardDays();
      Days days1 = days0.plus(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.days(3);
      Days days1 = Days.days((-5));
      Days days2 = days0.plus(days1);
      assertEquals((-2), days2.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.ONE.plus((-1));
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      Days days1 = days0.ZERO.negated();
      assertEquals(0, days1.getDays());
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3721L);
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) duration0, (-2807));
      Days days0 = duration1.toStandardDays();
      days0.negated();
      assertEquals((-120), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = Duration.millis(2005L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Days days1 = days0.minus((Days) null);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = new Duration((-2733L), (-893L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Days days1 = days0.minus(0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.days((-1));
      Days days1 = days0.ZERO.minus((-1));
      assertEquals(1, days1.getDays());
      assertEquals((-1), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-1182L));
      Seconds seconds0 = duration0.toStandardSeconds();
      Minutes minutes0 = seconds0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      int int0 = days0.getDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Days days0 = Days.days((-1));
      int int0 = days0.getDays();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Days days0 = Days.days((-1));
      Days days1 = days0.MIN_VALUE.dividedBy((-1));
      assertEquals(Integer.MIN_VALUE, days1.getDays());
      assertEquals((-1), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3721L);
      Days days0 = duration0.toStandardDays();
      Seconds seconds0 = days0.SEVEN.toStandardSeconds();
      Days days1 = seconds0.toStandardDays();
      Days days2 = days1.multipliedBy(1);
      assertEquals(0, days0.getDays());
      assertEquals(7, days2.getDays());
      assertEquals(604800, seconds0.getSeconds());
      assertSame(days2, days1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = new Duration(3859L, 0L);
      Days days0 = duration0.toStandardDays();
      // Undeclared exception!
      try { 
        days0.MIN_VALUE.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 1440
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Days days0 = Days.days((-1));
      // Undeclared exception!
      try { 
        days0.MIN_VALUE.toStandardHours();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 24
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        days0.plus(days0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.days(460);
      // Undeclared exception!
      try { 
        days0.MIN_VALUE.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Days days0 = Days.days(10800000);
      // Undeclared exception!
      try { 
        days0.multipliedBy(10800000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 10800000 * 10800000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.days(5);
      Days days1 = days0.plus(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        days0.SEVEN.minus(days1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 7 + 2147483643
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3721L);
      Days days0 = duration0.toStandardDays();
      // Undeclared exception!
      try { 
        days0.MAX_VALUE.minus((-2807));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2807
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      // Undeclared exception!
      try { 
        days0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Days", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Days days0 = Days.days((-2808));
      Days days1 = days0.MAX_VALUE.plus(0);
      assertEquals((-2808), days0.getDays());
      assertEquals(Integer.MAX_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Days days0 = Days.days(2);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Days days0 = Days.days(460);
      Days days1 = days0.SIX.minus(50);
      assertEquals((-44), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Days days0 = Days.days(14);
      Days days1 = Days.days((-610));
      boolean boolean0 = days1.isLessThan(days0);
      assertEquals((-610), days1.getDays());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Days days0 = Days.days((-1));
      boolean boolean0 = days0.isLessThan((Days) null);
      assertEquals((-1), days0.getDays());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Days days0 = Days.days(14);
      boolean boolean0 = days0.isLessThan(days0);
      assertFalse(boolean0);
      assertEquals(14, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Days days0 = Days.days((-2808));
      Days days1 = Days.days(0);
      boolean boolean0 = days1.isGreaterThan(days0);
      assertEquals(0, days1.getDays());
      assertTrue(boolean0);
      assertEquals((-2808), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(2005L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertEquals(1, days0.getDays());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-1197L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Hours hours0 = minutes0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertEquals((-49), days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Days days0 = Days.days((-2808));
      boolean boolean0 = days0.isGreaterThan(days0);
      assertEquals((-2808), days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3721L);
      Days days0 = duration0.toStandardDays();
      Days days1 = days0.ONE.dividedBy(1);
      assertEquals(1, days1.getDays());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Duration duration0 = Duration.standardHours(6389L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Days days1 = days0.dividedBy((-721));
      assertEquals(0, days1.getDays());
      assertEquals(266, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Days days0 = Days.days((-1));
      Days days1 = days0.minus((Days) null);
      assertEquals((-1), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Days days0 = Days.days(10800000);
      days0.FOUR.plus((Days) null);
      assertEquals(10800000, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.parseDays("Europe/Moscow");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Europe/Moscow\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DateTime dateTime0 = DateTime.now((Chronology) mockNullZoneChronology0);
      Duration duration0 = new Duration(dateTime0, dateTime0);
      Interval interval0 = new Interval(duration0, dateTime0);
      // Undeclared exception!
      try { 
        Days.daysIn(interval0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // days field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockPartial mockPartial0 = (MockPartial)MockPartial.EMPTY_INSTANCE;
      Days days0 = Days.daysBetween((ReadablePartial) mockPartial0, (ReadablePartial) mockPartial0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Days days0 = Days.days(7);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Days days0 = Days.days(6);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Days days0 = Days.days(4);
      boolean boolean0 = days0.isLessThan((Days) null);
      assertEquals(4, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Days days0 = Days.days(3);
      Days days1 = days0.multipliedBy((-1842));
      assertEquals(3, days0.getDays());
      assertEquals((-5526), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Days days0 = Days.days(1);
      // Undeclared exception!
      try { 
        days0.MAX_VALUE.plus(1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Days days0 = Days.days(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Days days0 = Days.days(5);
      Days days1 = days0.SEVEN.minus(days0);
      assertEquals(5, days0.getDays());
      assertEquals(2, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Duration duration0 = Duration.standardHours(6389L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      int int0 = days0.getDays();
      assertEquals(266, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Days days0 = Days.days(5);
      Duration duration0 = days0.toStandardDuration();
      assertEquals(432000000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Days days0 = Days.days((-2808));
      Weeks weeks0 = days0.toStandardWeeks();
      Days days1 = weeks0.toStandardDays();
      boolean boolean0 = days0.isGreaterThan(days1);
      assertEquals((-2807), days1.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3721L);
      Days days0 = duration0.toStandardDays();
      days0.multipliedBy((-281));
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Days days0 = Days.days(5);
      Days days1 = days0.FOUR.negated();
      assertEquals(5, days0.getDays());
      assertEquals((-4), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Days days0 = Days.days(5);
      days0.getFieldType();
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Days days0 = Days.days((-2808));
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals((-242611200), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
      assertEquals(Integer.MAX_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Days days0 = Days.days((-2808));
      days0.getPeriodType();
      assertEquals((-2808), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Days days0 = Days.days(14);
      Hours hours0 = days0.toStandardHours();
      assertEquals(336, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Days days0 = Days.days((-1));
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals((-1440), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Days days0 = Days.days(5);
      String string0 = days0.toString();
      assertEquals("P5D", string0);
  }
}