/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 18:39:25 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.MockPartial;
import org.joda.time.Partial;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Years_ESTest extends Years_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Years years0 = Years.TWO;
      boolean boolean0 = years0.isLessThan(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Years years0 = Years.ONE;
      boolean boolean0 = years0.isLessThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.negated();
      boolean boolean0 = years1.isGreaterThan(years0);
      assertEquals((-2147483647), years1.getYears());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Years years0 = Years.ZERO;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Instant instant0 = Instant.now();
      Instant instant1 = instant0.withMillis(0L);
      Years years0 = Years.yearsBetween((ReadableInstant) instant1, (ReadableInstant) instant0);
      assertEquals(44, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.plus(years0);
      assertEquals(2, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.plus(2294);
      assertEquals(2297, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.negated();
      Years years2 = years1.plus(0);
      assertEquals((-1), years2.getYears());
      assertSame(years2, years1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Years years0 = Years.parseYears((String) null);
      Years years1 = years0.negated();
      assertEquals(0, years0.getYears());
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Years years0 = Years.years(0);
      Years years1 = years0.multipliedBy(0);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.multipliedBy((-3000));
      assertEquals((-3000), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.negated();
      Years years2 = years0.minus(years1);
      boolean boolean0 = years2.isLessThan(years0);
      assertEquals(2, years2.getYears());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.negated();
      Years years2 = years1.minus(years0);
      assertEquals((-2), years2.getYears());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.ONE.minus(1);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.minus((-3000));
      assertEquals(3001, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      Years years1 = years0.minus(0);
      assertEquals(Integer.MIN_VALUE, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Years years0 = Years.parseYears((String) null);
      int int0 = years0.getYears();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.negated();
      int int0 = years1.getYears();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.dividedBy(10);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.dividedBy((-1));
      Years years2 = years1.negated();
      assertEquals((-2147483647), years1.getYears());
      assertSame(years2, years0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      Years years0 = Years.yearsBetween((ReadablePartial) mockPartial0, (ReadablePartial) mockPartial0);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadablePartial) null, (ReadablePartial) mockPartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Years years0 = Years.years((-142));
      Years years1 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.plus(years1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -142 + -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Years years0 = Years.years(0);
      // Undeclared exception!
      try { 
        years0.MIN_VALUE.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Years years0 = Years.ZERO;
      // Undeclared exception!
      try { 
        years0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Years", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.MAX_VALUE.plus(23034375);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 23034375
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Years years0 = Years.years(1);
      assertEquals(1, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.negated();
      boolean boolean0 = years1.isLessThan(years0);
      assertEquals((-1), years1.getYears());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      boolean boolean0 = years0.isLessThan((Years) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Years years0 = Years.ZERO;
      boolean boolean0 = years0.isLessThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = Years.THREE;
      boolean boolean0 = years0.isGreaterThan(years1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.negated();
      boolean boolean0 = years1.isGreaterThan((Years) null);
      assertFalse(boolean0);
      assertEquals((-2147483647), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      boolean boolean0 = years0.isGreaterThan(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.TWO.dividedBy(1);
      assertEquals(2, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = years0.minus((Years) null);
      assertSame(years1, years0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Years years0 = Years.years((-142));
      Years years1 = years0.plus(years0);
      assertEquals((-142), years0.getYears());
      assertEquals((-284), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Years years0 = Years.years(0);
      Years years1 = years0.plus(0);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Years years0 = Years.parseYears((String) null);
      Years years1 = years0.plus((Years) null);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.parseYears("+9)X%~o0O)s9dpF0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+9)X%~o0O)s9dpF0\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Years years0 = Years.yearsIn((ReadableInterval) null);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      Interval interval0 = new Interval((-278L), (-278L), mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Years.yearsIn(interval0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Years years0 = Years.years(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Years years0 = Years.years(3);
      Years years1 = years0.multipliedBy(3);
      assertEquals(9, years1.getYears());
      assertEquals(3, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Years years0 = Years.years(2);
      assertEquals(2, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      Partial partial0 = new Partial(mockNullZoneChronology0);
      Years years0 = Years.yearsBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Years years0 = Years.years(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.minus(477);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -477
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.multipliedBy((-1540));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * -1540
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DateTime dateTime0 = DateTime.now((Chronology) mockNullZoneChronology0);
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Years years0 = Years.ONE;
      int int0 = years0.getYears();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      PeriodType periodType0 = years0.getPeriodType();
      assertEquals("Years", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      assertEquals("years", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      String string0 = years0.toString();
      assertEquals("P2147483647Y", string0);
  }
}
