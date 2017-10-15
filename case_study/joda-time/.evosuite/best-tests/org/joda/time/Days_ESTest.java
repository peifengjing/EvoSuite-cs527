/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 18:24:02 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Minutes;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.TestAbstractPartial;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.standardDaysIn((ReadablePeriod) null);
      Days days1 = days0.ZERO.plus((-2822));
      boolean boolean0 = days0.isLessThan(days1);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
      assertEquals((-2822), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      boolean boolean0 = days0.isLessThan((Days) null);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.plus((-1));
      boolean boolean0 = days1.isGreaterThan(days0);
      assertEquals((-1), days1.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestAbstractPartial.MockPartial testAbstractPartial_MockPartial0 = new TestAbstractPartial.MockPartial();
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) null, (ReadablePartial) testAbstractPartial_MockPartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Instant instant0 = new Instant();
      Instant instant1 = Instant.now();
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant1);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = Duration.standardDays(10L);
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(1, weeks0.getWeeks());
      assertEquals(10, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2233L));
      Hours hours0 = duration0.toStandardHours();
      Weeks weeks0 = hours0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      Weeks weeks1 = days0.toStandardWeeks();
      assertEquals((-2233), days0.getDays());
      assertEquals((-319), weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.standardDaysIn((ReadablePeriod) null);
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-4594L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals((-259200), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.plus((-1));
      Minutes minutes0 = days1.toStandardMinutes();
      assertEquals((-1440), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.standardDays(10L);
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      Hours hours1 = days0.toStandardHours();
      assertEquals(240, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-4594L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      assertEquals((-72), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      Duration duration1 = days0.toStandardDuration();
      assertEquals(0L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      Duration duration1 = days0.MIN_VALUE.toStandardDuration();
      assertEquals(0, days0.getDays());
      assertEquals((-185542587187200000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.standardDaysIn((ReadablePeriod) null);
      Days days1 = days0.plus(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.plus(15356250);
      assertEquals(0, days0.getDays());
      assertEquals(15356250, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = new Duration(1L);
      Days days0 = duration0.toStandardDays();
      days0.negated();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      Days days1 = days0.FOUR.multipliedBy(10125000);
      assertEquals(0, days0.getDays());
      assertEquals(40500000, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2233L));
      Hours hours0 = duration0.toStandardHours();
      Weeks weeks0 = hours0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      Days days1 = days0.multipliedBy(2);
      assertEquals((-4466), days1.getDays());
      assertEquals((-2233), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      Days days1 = days0.SEVEN.minus(days0);
      assertEquals(7, days1.getDays());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = days0.minus(20503125);
      assertEquals((-20503125), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.days(58);
      int int0 = days0.getDays();
      assertEquals(58, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-67L));
      Hours hours0 = duration0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      int int0 = days0.getDays();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      Days days1 = days0.MIN_VALUE.dividedBy(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
      assertEquals((-1), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      // Undeclared exception!
      try { 
        days0.MAX_VALUE.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 86400
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = Duration.standardHours(86400000L);
      Duration duration1 = new Duration(70L, 86400000L);
      Duration duration2 = duration0.minus((ReadableDuration) duration1);
      Days days0 = duration2.toStandardDays();
      // Undeclared exception!
      try { 
        days0.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 3599999 * 1440
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
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
      Days days0 = Days.daysIn((ReadableInterval) null);
      Duration duration0 = new Duration(Integer.MAX_VALUE, 0L);
      Hours hours0 = duration0.toStandardHours();
      Weeks weeks0 = hours0.toStandardWeeks();
      Minutes minutes0 = weeks0.toStandardMinutes();
      Days days1 = minutes0.toStandardDays();
      // Undeclared exception!
      try { 
        days0.MIN_VALUE.plus(days1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -21
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      // Undeclared exception!
      try { 
        days0.FIVE.plus(Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 5 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      Days days1 = days0.SEVEN.negated();
      Days days2 = days1.negated();
      assertEquals(0, days0.getDays());
      assertEquals((-7), days1.getDays());
      assertEquals(7, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        days0.multipliedBy(Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Duration duration0 = Duration.standardHours(2159L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Weeks weeks0 = seconds0.toStandardWeeks();
      Days days0 = weeks0.toStandardDays();
      // Undeclared exception!
      try { 
        days0.MIN_VALUE.minus(days0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -84
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      Days days0 = duration0.toStandardDays();
      // Undeclared exception!
      try { 
        days0.MIN_VALUE.minus(2831);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -2831
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      // Undeclared exception!
      try { 
        days0.TWO.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Days", e);
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
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.plus(0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Days days0 = Days.days(0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Days days0 = Days.days(2);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Days days0 = Days.standardDaysIn((ReadablePeriod) null);
      Days days1 = days0.TWO.minus((-3643));
      boolean boolean0 = days0.isLessThan(days1);
      assertTrue(boolean0);
      assertEquals(0, days0.getDays());
      assertEquals(3645, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Days days0 = Days.standardDaysIn((ReadablePeriod) null);
      boolean boolean0 = days0.isLessThan(days0);
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.plus((-6));
      boolean boolean0 = days0.isGreaterThan(days1);
      assertEquals((-6), days1.getDays());
      assertTrue(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = Duration.standardDays(10L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertTrue(boolean0);
      assertEquals(10, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(10L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = days0.dividedBy(1);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Days days0 = Days.days(2762);
      Days days1 = days0.dividedBy(2762);
      assertEquals(2762, days0.getDays());
      assertEquals(1, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      Days days1 = days0.minus((Days) null);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Duration duration0 = Duration.standardDays(10L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Days days1 = days0.ONE.minus(days0);
      assertEquals((-9), days1.getDays());
      assertEquals(10, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = days0.MIN_VALUE.plus(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Days days0 = Days.days(1978);
      Days days1 = days0.ZERO.minus(0);
      assertEquals(1978, days0.getDays());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      days0.TWO.plus((Days) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.parseDays("1:\"B66/kLa\"kS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"1:\"B66/kLa\"kS\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      MutableInterval mutableInterval0 = new MutableInterval((Object) null, mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Days.daysIn(mutableInterval0);
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
      TestAbstractPartial.MockPartial testAbstractPartial_MockPartial0 = new TestAbstractPartial.MockPartial();
      Days days0 = Days.daysBetween((ReadablePartial) testAbstractPartial_MockPartial0, (ReadablePartial) testAbstractPartial_MockPartial0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      boolean boolean0 = days0.isGreaterThan(days0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Days days0 = Days.days(7);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Days days0 = Days.days(5);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Days days0 = Days.days(4);
      assertEquals(4, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Days days0 = Days.days(3);
      boolean boolean0 = days0.isLessThan((Days) null);
      assertEquals(3, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Days days0 = Days.days(1);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Days days0 = Days.days(Integer.MIN_VALUE);
      boolean boolean0 = days0.isLessThan((Days) null);
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      int int0 = days0.getDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Days days0 = Days.days(2762);
      Duration duration0 = days0.MAX_VALUE.toStandardDuration();
      assertEquals(2762, days0.getDays());
      assertEquals(51539607528L, duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(10L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(0, days0.getDays());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = days0.multipliedBy(Integer.MAX_VALUE);
      assertEquals(0, days0.getDays());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(10L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Days days1 = days0.THREE.negated();
      boolean boolean0 = days1.isGreaterThan((Days) null);
      assertFalse(boolean0);
      assertEquals((-3), days1.getDays());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2233L));
      Hours hours0 = duration0.toStandardHours();
      Weeks weeks0 = hours0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      days0.getFieldType();
      assertEquals((-2233), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Days days0 = Days.days(58);
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals(5011200, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Days days0 = Days.days(6);
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
      assertEquals(6, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2233L));
      Hours hours0 = duration0.toStandardHours();
      Weeks weeks0 = hours0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      days0.getPeriodType();
      assertEquals((-2233), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // days field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      days0.toStandardHours();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Days days0 = Days.days(2051);
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals(2953440, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(10L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      String string0 = days0.TWO.toString();
      assertEquals("P2D", string0);
      assertEquals(0, days0.getDays());
  }
}