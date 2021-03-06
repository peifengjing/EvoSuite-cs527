/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 17:59:35 GMT 2017
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
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.MockPartial;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Months_ESTest extends Months_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Months months0 = Months.TWELVE;
      Months months1 = Months.NINE;
      boolean boolean0 = months0.isLessThan(months1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Months months0 = Months.FOUR;
      Months months1 = months0.ELEVEN.minus(months0);
      boolean boolean0 = months0.isLessThan(months1);
      assertTrue(boolean0);
      assertEquals(7, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Months months0 = Months.ZERO;
      boolean boolean0 = months0.isLessThan((Months) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Months months0 = Months.FOUR;
      Months months1 = months0.ELEVEN.minus(months0);
      boolean boolean0 = months0.isGreaterThan(months1);
      assertFalse(boolean0);
      assertEquals(7, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Months months0 = Months.FOUR;
      boolean boolean0 = months0.isGreaterThan(months0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Months months0 = Months.months((-3));
      boolean boolean0 = months0.isGreaterThan((Months) null);
      assertFalse(boolean0);
      assertEquals((-3), months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(mockNullZoneChronology0, (DateTimeFieldType[]) null, intArray0);
      // Undeclared exception!
      try { 
        Months.monthsBetween((ReadablePartial) null, (ReadablePartial) partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Months months0 = Months.monthsIn((ReadableInterval) null);
      Months months1 = months0.plus(months0);
      assertEquals(0, months0.getMonths());
      assertEquals(0, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Months months0 = Months.TEN;
      Months months1 = months0.SEVEN.plus((-792));
      assertEquals((-785), months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Months months0 = Months.FOUR;
      Months months1 = months0.EIGHT.multipliedBy(1046);
      assertEquals(8368, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Months months0 = Months.TWELVE;
      Months months1 = months0.multipliedBy((-1504));
      months1.negated();
      assertEquals((-18048), months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Months months0 = Months.FOUR;
      Months months1 = months0.minus((-899));
      assertEquals(903, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Months months0 = Months.ONE;
      Months months1 = months0.minus(8);
      Months months2 = months0.plus(months1);
      assertEquals((-6), months2.getMonths());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Months months0 = Months.monthsIn((ReadableInterval) null);
      int int0 = months0.getMonths();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Months months0 = Months.FOUR;
      Months months1 = months0.TWELVE.dividedBy(1704);
      assertEquals(0, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Months months0 = Months.MIN_VALUE;
      Months months1 = months0.dividedBy(133);
      assertEquals((-16146493), months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Months months0 = Months.MIN_VALUE;
      // Undeclared exception!
      try { 
        months0.plus(months0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Months months0 = Months.MIN_VALUE;
      // Undeclared exception!
      try { 
        months0.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Months months0 = Months.months(3600000);
      // Undeclared exception!
      try { 
        months0.multipliedBy(10125000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 3600000 * 10125000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockPartial mockPartial0 = (MockPartial)MockPartial.EMPTY_INSTANCE;
      Months months0 = Months.monthsBetween((ReadablePartial) mockPartial0, (ReadablePartial) mockPartial0);
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Instant instant0 = new Instant(1020L);
      Months months0 = Months.monthsBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Instant instant0 = new Instant();
      // Undeclared exception!
      try { 
        Months.monthsBetween((ReadableInstant) instant0, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Months months0 = Months.TEN;
      Months months1 = Months.MAX_VALUE;
      Months months2 = months0.minus(months1);
      // Undeclared exception!
      try { 
        months1.minus(months2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483637
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Months months0 = Months.FOUR;
      // Undeclared exception!
      try { 
        months0.MIN_VALUE.minus(1191);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -1191
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Months months0 = Months.MAX_VALUE;
      Months months1 = months0.ZERO.plus(0);
      assertEquals(0, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Months months0 = Months.EIGHT;
      Months months1 = months0.plus(10);
      assertEquals(18, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Months months0 = Months.months(10);
      assertEquals(10, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Months months0 = Months.months(4);
      assertEquals(4, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Months months0 = Months.months((-263));
      // Undeclared exception!
      try { 
        months0.MIN_VALUE.plus((-263));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -263
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Months months0 = Months.months(7);
      assertEquals(7, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Months months0 = Months.months(0);
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Months months0 = Months.TWELVE;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      assertEquals("months", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Months months0 = Months.FOUR;
      Months months1 = months0.SEVEN.negated();
      boolean boolean0 = months1.isLessThan(months0);
      assertEquals((-7), months1.getMonths());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Months months0 = Months.TEN;
      boolean boolean0 = months0.isLessThan((Months) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Months months0 = Months.MIN_VALUE;
      boolean boolean0 = months0.isLessThan((Months) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Months months0 = Months.FOUR;
      boolean boolean0 = months0.isLessThan(months0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Months months0 = Months.ZERO;
      boolean boolean0 = months0.isGreaterThan((Months) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Months months0 = Months.FOUR;
      boolean boolean0 = months0.isGreaterThan((Months) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Months months0 = Months.THREE;
      Months months1 = months0.dividedBy(1);
      assertEquals(3, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Months months0 = Months.FIVE;
      // Undeclared exception!
      try { 
        months0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Months", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Months months0 = Months.FOUR;
      Months months1 = months0.minus((Months) null);
      assertSame(months0, months1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Months months0 = Months.TWO;
      Months months1 = months0.plus((Months) null);
      assertEquals(1, months1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Months months0 = Months.parseMonths((String) null);
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        Months.parseMonths("BuddhistChronology");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"BuddhistChronology\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      MutableInterval mutableInterval0 = new MutableInterval(1, 1, mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Months.monthsIn(mutableInterval0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // months field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Months months0 = Months.ONE;
      Months months1 = months0.negated();
      int int0 = months1.getMonths();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Months months0 = Months.months(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Months months0 = Months.months(12);
      Months months1 = months0.minus(12);
      assertEquals(12, months0.getMonths());
      assertEquals(0, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Months months0 = Months.months(11);
      assertEquals(11, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Months months0 = Months.ONE;
      Months months1 = Months.ZERO;
      Months months2 = months0.TWO.minus(months1);
      Months months3 = Months.months(8);
      Months months4 = months2.plus(months3);
      assertEquals(10, months4.getMonths());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Months months0 = Months.months(9);
      assertEquals(9, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Months months0 = Months.months(6);
      assertEquals(6, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Months months0 = Months.months(5);
      assertEquals(5, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Months months0 = Months.ONE;
      Months months1 = months0.FIVE.minus(months0);
      boolean boolean0 = months1.isGreaterThan(months0);
      assertTrue(boolean0);
      assertEquals(4, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Months months0 = Months.months(3);
      assertEquals(3, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Months months0 = Months.months(2);
      assertEquals(2, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Months months0 = Months.months(1);
      assertEquals(1, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Months months0 = Months.months(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Months months0 = Months.ONE;
      Months months1 = months0.multipliedBy(0);
      assertEquals(0, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Months months0 = Months.monthsIn((ReadableInterval) null);
      Months months1 = months0.negated();
      assertEquals(0, months0.getMonths());
      assertEquals(0, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Months months0 = Months.ONE;
      PeriodType periodType0 = months0.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Months months0 = Months.TEN;
      Months months1 = months0.minus(months0);
      assertEquals(0, months1.getMonths());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Months months0 = Months.EIGHT;
      int int0 = months0.getMonths();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Months months0 = Months.FOUR;
      String string0 = months0.toString();
      assertEquals("P4M", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DateTime dateTime0 = new DateTime((Chronology) mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Months.monthsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // months field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }
}
