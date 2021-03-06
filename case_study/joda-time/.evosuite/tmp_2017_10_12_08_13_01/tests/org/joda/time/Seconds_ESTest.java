/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 18:36:59 GMT 2017
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
import org.joda.time.Minutes;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.MutableInterval;
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
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      Duration duration0 = Duration.millis(Integer.MAX_VALUE);
      Seconds seconds1 = duration0.toStandardSeconds();
      boolean boolean0 = seconds0.isLessThan(seconds1);
      assertEquals(2147483, seconds1.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = Duration.standardDays(50L);
      Seconds seconds0 = duration0.toStandardSeconds();
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertEquals(4320000, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = new Duration(50L, 50L);
      Seconds seconds0 = duration0.toStandardSeconds();
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertEquals(0, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Instant instant0 = new Instant(0L);
      Instant instant1 = instant0.withMillis(100);
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) instant1, (ReadableInstant) instant0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds((-3756));
      Weeks weeks0 = seconds0.toStandardWeeks();
      assertEquals((-3756), seconds0.getSeconds());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(254L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Weeks weeks0 = seconds0.MIN_VALUE.toStandardWeeks();
      assertEquals(254, seconds0.getSeconds());
      assertEquals((-3550), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Minutes minutes0 = seconds0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      Minutes minutes0 = seconds0.MIN_VALUE.toStandardMinutes();
      assertEquals(0, seconds0.getSeconds());
      assertEquals((-35791394), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(909L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      assertEquals(0, days0.getDays());
      
      Seconds seconds1 = days0.toStandardSeconds();
      Hours hours0 = seconds1.toStandardHours();
      assertEquals(54540, seconds0.getSeconds());
      assertEquals(0, seconds1.getSeconds());
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(119999L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Hours hours0 = seconds0.MAX_VALUE.toStandardHours();
      assertEquals(596523, hours0.getHours());
      assertEquals(7199940, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.standardHours(2729L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Duration duration1 = seconds0.toStandardDuration();
      assertEquals(9824400000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Duration duration1 = seconds0.toStandardDuration();
      assertEquals(0L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      Duration duration0 = seconds0.MIN_VALUE.toStandardDuration();
      assertEquals(0, seconds0.getSeconds());
      assertEquals((-2147483648000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      Days days0 = seconds0.toStandardDays();
      assertEquals(24855, days0.getDays());
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      Seconds seconds1 = seconds0.MAX_VALUE.negated();
      Days days0 = seconds1.toStandardDays();
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertEquals((-2147483647), seconds1.getSeconds());
      assertEquals((-24855), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.standardSecondsIn((ReadablePeriod) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(909L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = seconds0.MIN_VALUE.plus(seconds0);
      assertEquals((-2147429108), seconds1.getSeconds());
      assertEquals(54540, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(0);
      Seconds seconds1 = seconds0.plus((-1));
      assertEquals((-1), seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Hours hours0 = duration0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      seconds0.negated();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-113L));
      Days days0 = duration0.toStandardDays();
      Seconds seconds0 = days0.toStandardSeconds();
      seconds0.negated();
      assertEquals((-9763200), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Hours hours0 = duration0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      Seconds seconds1 = seconds0.multipliedBy(0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(909L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = seconds0.multipliedBy((-1));
      assertEquals((-54540), seconds1.getSeconds());
      assertEquals(54540, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(0);
      Seconds seconds1 = seconds0.minus(0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(2124);
      Seconds seconds1 = seconds0.minus((-237));
      assertEquals(2361, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(254L);
      Hours hours0 = duration0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      int int0 = seconds0.getSeconds();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = seconds0.TWO.dividedBy(2021);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2L));
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = seconds0.dividedBy(579);
      assertEquals((-7200), seconds0.getSeconds());
      assertEquals((-12), seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TestAbstractPartial.MockPartial testAbstractPartial_MockPartial0 = new TestAbstractPartial.MockPartial();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) testAbstractPartial_MockPartial0, (ReadablePartial) testAbstractPartial_MockPartial0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        seconds0.plus(Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      // Undeclared exception!
      try { 
        seconds0.MIN_VALUE.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        seconds0.MIN_VALUE.multipliedBy(Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      Seconds seconds1 = seconds0.MAX_VALUE.negated();
      // Undeclared exception!
      try { 
        seconds0.minus(seconds1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      // Undeclared exception!
      try { 
        seconds0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Seconds", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(119999L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = seconds0.plus(1558);
      assertEquals(7201498, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(0);
      Seconds seconds1 = seconds0.plus(0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Hours hours0 = duration0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      Seconds seconds1 = seconds0.minus(86424);
      boolean boolean0 = seconds1.isLessThan(seconds0);
      assertTrue(boolean0);
      assertEquals((-86424), seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertEquals(0, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = Duration.millis((-1301L));
      Seconds seconds0 = duration0.toStandardSeconds();
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertTrue(boolean0);
      assertEquals((-1), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      boolean boolean0 = seconds0.isLessThan(seconds0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(254L);
      Hours hours0 = duration0.toStandardHours();
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = hours0.toStandardSeconds();
      boolean boolean0 = seconds0.isGreaterThan(seconds1);
      assertEquals(254, seconds0.getSeconds());
      assertEquals(0, seconds1.getSeconds());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = Duration.standardDays(50L);
      Seconds seconds0 = duration0.toStandardSeconds();
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertTrue(boolean0);
      assertEquals(4320000, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = Duration.millis((-1301L));
      Seconds seconds0 = duration0.toStandardSeconds();
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertEquals((-1), seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MIN_VALUE);
      boolean boolean0 = seconds0.isGreaterThan(seconds0);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(1);
      Seconds seconds1 = seconds0.dividedBy(1);
      assertEquals(1, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(1);
      Seconds seconds1 = seconds0.minus((Seconds) null);
      assertEquals(1, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Weeks weeks0 = minutes0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Seconds seconds1 = seconds0.plus((Seconds) null);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        seconds0.plus(seconds0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds((-650));
      Duration duration0 = new Duration((long) (-650));
      Days days0 = duration0.toStandardDays();
      Seconds seconds1 = days0.toStandardSeconds();
      Seconds seconds2 = seconds0.minus(seconds1);
      assertEquals((-650), seconds2.getSeconds());
      assertEquals(0, seconds1.getSeconds());
      assertSame(seconds2, seconds0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"{\"
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
        Seconds.secondsIn(mutableInterval0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // seconds field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      Partial partial0 = new Partial(mockNullZoneChronology0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(3);
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(2);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MIN_VALUE);
      Seconds seconds1 = seconds0.dividedBy(Integer.MIN_VALUE);
      boolean boolean0 = seconds0.isGreaterThan(seconds1);
      assertFalse(boolean0);
      assertEquals(1, seconds1.getSeconds());
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      String string0 = seconds0.toString();
      assertEquals("PT2147483647S", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(1);
      int int0 = seconds0.getSeconds();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      Hours hours0 = seconds0.MIN_VALUE.toStandardHours();
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertEquals((-596523), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds((-650));
      Seconds seconds1 = seconds0.minus(seconds0);
      assertEquals((-650), seconds0.getSeconds());
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Duration duration0 = Duration.standardDays(365L);
      Days days0 = duration0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      Minutes minutes0 = hours0.toStandardMinutes();
      Weeks weeks0 = minutes0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Minutes minutes1 = seconds0.toStandardMinutes();
      assertEquals(31449600, seconds0.getSeconds());
      assertEquals(524160, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DateTime dateTime0 = new DateTime((-1103L), (Chronology) mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // seconds field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(1);
      Seconds seconds1 = seconds0.negated();
      int int0 = seconds1.getSeconds();
      assertEquals(1, seconds0.getSeconds());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Weeks weeks0 = minutes0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Seconds seconds1 = seconds0.TWO.multipliedBy(100);
      Seconds seconds2 = seconds1.plus(seconds0);
      assertEquals(200, seconds2.getSeconds());
      assertSame(seconds2, seconds1);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Duration duration0 = Duration.standardDays(365L);
      Days days0 = duration0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      Minutes minutes0 = hours0.toStandardMinutes();
      Weeks weeks0 = minutes0.toStandardWeeks();
      Seconds seconds0 = weeks0.toStandardSeconds();
      Weeks weeks1 = seconds0.toStandardWeeks();
      assertEquals(52, weeks1.getWeeks());
      assertEquals(31449600, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(0);
      seconds0.THREE.getPeriodType();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      seconds0.getFieldType();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
      assertEquals(Integer.MAX_VALUE, seconds1.getSeconds());
  }
}
