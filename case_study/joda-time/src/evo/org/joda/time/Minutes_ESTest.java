/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 18:41:56 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.TestAbstractPartial;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-396));
      Minutes minutes1 = Minutes.minutesIn((ReadableInterval) null);
      boolean boolean0 = minutes1.isLessThan(minutes0);
      assertEquals(0, minutes1.getMinutes());
      assertFalse(boolean0);
      assertEquals((-396), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertFalse(boolean0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3600001L);
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      Minutes minutes1 = duration0.toStandardMinutes();
      boolean boolean0 = minutes0.isGreaterThan(minutes1);
      assertFalse(boolean0);
      assertEquals(60000, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-396));
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertEquals((-396), minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(487);
      Seconds seconds0 = minutes0.toStandardSeconds();
      Minutes minutes1 = seconds0.toStandardMinutes();
      Minutes minutes2 = minutes0.plus(minutes1);
      assertEquals(974, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) null, (ReadablePartial) partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = new Duration((-2379L), (-2379L));
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      Minutes minutes1 = minutes0.MAX_VALUE.dividedBy(2);
      Weeks weeks0 = minutes1.toStandardWeeks();
      assertEquals(0, minutes0.getMinutes());
      assertEquals(1073741823, minutes1.getMinutes());
      assertEquals(106522, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = new Duration(1175378400000L, 1175378400000L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Weeks weeks0 = minutes0.MIN_VALUE.toStandardWeeks();
      assertEquals((-213044), weeks0.getWeeks());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Hours hours0 = duration0.toStandardHours();
      Minutes minutes0 = hours0.toStandardMinutes();
      Seconds seconds0 = minutes0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-577L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Seconds seconds0 = minutes0.toStandardSeconds();
      assertEquals((-540), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(26050L);
      Hours hours0 = duration0.toStandardHours();
      Minutes minutes0 = hours0.toStandardMinutes();
      Hours hours1 = minutes0.toStandardHours();
      assertEquals(420, minutes0.getMinutes());
      assertEquals(7, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Minutes minutes0 = duration0.toStandardMinutes();
      Hours hours0 = minutes0.MIN_VALUE.toStandardHours();
      assertEquals((-35791394), hours0.getHours());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      Duration duration0 = minutes0.MAX_VALUE.toStandardDuration();
      assertEquals(0, minutes0.getMinutes());
      assertEquals(1491308L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = new Duration((-2379L), (-2379L));
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      Duration duration1 = minutes0.MIN_VALUE.toStandardDuration();
      assertEquals(0, minutes0.getMinutes());
      assertEquals((-128849018880000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-577L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.TWO.toStandardDays();
      assertEquals(0, days0.getDays());
      assertEquals((-9), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = Duration.standardDays(2419L);
      Hours hours0 = duration0.toStandardHours();
      Minutes minutes0 = hours0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      assertEquals(2419, days0.getDays());
      assertEquals(3483360, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) null);
      Duration duration0 = minutes0.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.standardDays(0L);
      Hours hours0 = duration0.toStandardHours();
      Minutes minutes0 = hours0.toStandardMinutes();
      Minutes minutes1 = minutes0.plus(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-171));
      Minutes minutes1 = minutes0.plus((Minutes) null);
      assertEquals((-171), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = new Duration((-689L));
      Hours hours0 = duration0.toStandardHours();
      Weeks weeks0 = hours0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Minutes minutes0 = seconds0.toStandardMinutes();
      Minutes minutes1 = minutes0.minus(1155);
      Minutes minutes2 = minutes1.plus(1155);
      assertEquals((-1155), minutes1.getMinutes());
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Minutes minutes0 = duration0.toStandardMinutes();
      minutes0.negated();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-1177));
      Minutes minutes1 = minutes0.THREE.negated();
      assertEquals((-3), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(295);
      Minutes minutes1 = minutes0.minus(295);
      minutes1.multipliedBy(295);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Duration duration0 = new Duration((-2379L), (-2379L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Minutes minutes1 = minutes0.THREE.multipliedBy((-2));
      assertEquals((-6), minutes1.getMinutes());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = new Duration((-2379L), (-2379L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Minutes minutes1 = minutes0.ONE.minus((-2));
      assertEquals(3, minutes1.getMinutes());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Minutes minutes0 = duration0.toStandardMinutes();
      int int0 = minutes0.getMinutes();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(295);
      Minutes minutes1 = minutes0.MIN_VALUE.dividedBy(10800000);
      assertEquals((-198), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(42);
      // Undeclared exception!
      try { 
        minutes0.MIN_VALUE.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 60
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = new Duration((-2379L), (-2379L));
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      Minutes minutes1 = minutes0.MIN_VALUE.minus(minutes0);
      // Undeclared exception!
      try { 
        minutes1.plus((-1910));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -1910
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Duration duration0 = new Duration((ReadableInstant) null, (ReadableInstant) null);
      Minutes minutes0 = duration0.toStandardMinutes();
      // Undeclared exception!
      try { 
        minutes0.MIN_VALUE.negated();
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
      Duration duration0 = Duration.ZERO;
      Minutes minutes0 = duration0.toStandardMinutes();
      // Undeclared exception!
      try { 
        minutes0.MAX_VALUE.multipliedBy(1641);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 1641
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DateTime dateTime0 = new DateTime((-1001L), (Chronology) mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Instant instant0 = new Instant(604797L);
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = new Duration((-2379L), (-2379L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Minutes minutes1 = minutes0.MIN_VALUE.minus(minutes0);
      // Undeclared exception!
      try { 
        minutes0.THREE.minus(minutes1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(10080);
      // Undeclared exception!
      try { 
        minutes0.MIN_VALUE.minus(10080);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -10080
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Duration duration0 = new Duration((-2379L), (-2379L));
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      Minutes minutes1 = minutes0.plus((-1910));
      assertEquals((-1910), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Duration duration0 = Duration.standardHours(856L);
      Days days0 = duration0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      Minutes minutes0 = seconds0.toStandardMinutes();
      Minutes minutes1 = minutes0.plus(0);
      assertEquals(50400, minutes1.getMinutes());
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(0);
      // Undeclared exception!
      try { 
        minutes0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Minutes", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-402));
      minutes0.getFieldType();
      assertEquals((-402), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3600001L);
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      Minutes minutes1 = duration0.toStandardMinutes();
      boolean boolean0 = minutes0.isLessThan(minutes1);
      assertTrue(boolean0);
      assertEquals(60000, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-396));
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertEquals((-396), minutes0.getMinutes());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1);
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertEquals(1, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = Duration.standardHours(3600001L);
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      boolean boolean0 = minutes0.isLessThan(minutes0);
      assertEquals(216000000, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-386));
      Minutes minutes1 = minutes0.dividedBy((-386));
      boolean boolean0 = minutes1.isGreaterThan(minutes0);
      assertTrue(boolean0);
      assertEquals((-386), minutes0.getMinutes());
      assertEquals(1, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-402));
      Minutes minutes1 = minutes0.dividedBy((-402));
      boolean boolean0 = minutes1.isGreaterThan((Minutes) null);
      assertEquals(1, minutes1.getMinutes());
      assertTrue(boolean0);
      assertEquals((-402), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Duration duration0 = Duration.standardHours(3600001L);
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      boolean boolean0 = minutes0.isGreaterThan(minutes0);
      assertFalse(boolean0);
      assertEquals(216000000, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Minutes minutes0 = duration0.toStandardMinutes();
      Minutes minutes1 = minutes0.dividedBy(1);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-396));
      Minutes minutes1 = minutes0.dividedBy((-396));
      int int0 = minutes1.getMinutes();
      assertEquals((-396), minutes0.getMinutes());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Duration duration0 = Duration.millis((-31L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Minutes minutes1 = minutes0.minus((Minutes) null);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertEquals(0, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      Interval interval0 = new Interval(19588320, 19588320, mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Minutes.minutesIn(interval0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TestAbstractPartial.MockPartial testAbstractPartial_MockPartial0 = new TestAbstractPartial.MockPartial();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) testAbstractPartial_MockPartial0, (ReadablePartial) testAbstractPartial_MockPartial0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(2);
      Minutes minutes1 = minutes0.minus(2);
      Minutes minutes2 = minutes0.minus(minutes1);
      assertEquals(2, minutes0.getMinutes());
      assertEquals(0, minutes1.getMinutes());
      assertEquals(2, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(3);
      Duration duration0 = minutes0.toStandardDuration();
      assertEquals(180000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(295);
      Minutes minutes1 = minutes0.multipliedBy(295);
      assertEquals(295, minutes0.getMinutes());
      assertEquals(87025, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      Minutes minutes1 = minutes0.minus(451588409);
      assertEquals((-451588409), minutes1.getMinutes());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-577L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Hours hours0 = minutes0.toStandardHours();
      assertEquals((-9), minutes0.getMinutes());
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-577L));
      Minutes minutes0 = duration0.toStandardMinutes();
      String string0 = minutes0.toString();
      assertEquals("PT-9M", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Instant instant0 = new Instant(604800L);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadableInstant) null, (ReadableInstant) instant0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-577L));
      Minutes minutes0 = duration0.toStandardMinutes();
      int int0 = minutes0.getMinutes();
      assertEquals((-9), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(42);
      minutes0.MAX_VALUE.getPeriodType();
      assertEquals(42, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Duration duration0 = Duration.standardHours(3600001L);
      Days days0 = duration0.toStandardDays();
      Minutes minutes0 = days0.toStandardMinutes();
      Days days1 = minutes0.MIN_VALUE.toStandardDays();
      Minutes minutes1 = days1.toStandardMinutes();
      // Undeclared exception!
      try { 
        minutes1.plus(minutes1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483520 + -2147483520
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-171));
      minutes0.negated();
      assertEquals((-171), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(42);
      Weeks weeks0 = minutes0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
      assertEquals(42, minutes0.getMinutes());
  }
}
