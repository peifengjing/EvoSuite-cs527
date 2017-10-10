/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 04:48:43 GMT 2017
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
import org.joda.time.Partial;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.TestAbstractPartial;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Years_ESTest extends Years_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.plus(years0);
      boolean boolean0 = years1.isLessThan(years0);
      assertEquals(2, years1.getYears());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Years years0 = Years.ONE;
      boolean boolean0 = years0.isLessThan(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Years years0 = Years.ONE;
      boolean boolean0 = years0.isLessThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.dividedBy((-1383));
      boolean boolean0 = years1.isGreaterThan(years0);
      assertFalse(boolean0);
      assertEquals((-1552771), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = years0.plus((Years) null);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.plus(2121);
      assertEquals(2122, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = years0.negated();
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.plus((-581));
      years1.negated();
      assertEquals((-580), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.multipliedBy(0);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.minus((Years) null);
      assertSame(years0, years1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      Years years1 = Years.MAX_VALUE;
      Years years2 = years0.plus(years1);
      Years years3 = years0.minus(years2);
      assertEquals((-1), years2.getYears());
      assertEquals((-2147483647), years3.getYears());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = years0.minus(0);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.minus(2780);
      assertEquals((-2779), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Years years0 = Years.THREE;
      int int0 = years0.getYears();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.multipliedBy((-555));
      int int0 = years1.getYears();
      assertEquals((-1665), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.dividedBy((-2147483635));
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TestAbstractPartial.MockPartial testAbstractPartial_MockPartial0 = new TestAbstractPartial.MockPartial();
      Years years0 = Years.yearsBetween((ReadablePartial) testAbstractPartial_MockPartial0, (ReadablePartial) testAbstractPartial_MockPartial0);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Instant instant0 = new Instant();
      Years years0 = Years.yearsBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Instant instant0 = new Instant();
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadableInstant) instant0, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Years years0 = Years.TWO;
      Years years1 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.MIN_VALUE.plus(years1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.multipliedBy((-751));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * -751
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.negated();
      // Undeclared exception!
      try { 
        years1.minus(years0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483647 + -2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.minus(28265625);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -28265625
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.ONE.dividedBy(0);
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
      Years years0 = Years.MAX_VALUE;
      // Undeclared exception!
      try { 
        years0.plus(1701);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 1701
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Years years0 = Years.years(3);
      assertEquals(3, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      assertEquals("years", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Years years0 = Years.years((-1523));
      boolean boolean0 = years0.isLessThan((Years) null);
      assertEquals((-1523), years0.getYears());
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
      boolean boolean0 = years0.isLessThan(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Years years0 = Years.TWO;
      Years years1 = Years.MAX_VALUE;
      boolean boolean0 = years1.isGreaterThan(years0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Years years0 = Years.TWO;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Years years0 = Years.ZERO;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      boolean boolean0 = years0.isGreaterThan(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.dividedBy(1);
      assertEquals(1, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.dividedBy((-1383));
      boolean boolean0 = years1.isLessThan(years0);
      assertEquals((-1552771), years1.getYears());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = years0.minus((Years) null);
      assertEquals(1, years1.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Years years0 = Years.years(0);
      Years years1 = years0.plus(0);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Years years0 = Years.parseYears((String) null);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.parseYears("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      Interval interval0 = new Interval((-2577L), (-2577L), mockNullZoneChronology0);
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
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      Partial partial0 = new Partial(mockNullZoneChronology0);
      Years years0 = Years.yearsBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Years years0 = Years.years(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Years years0 = Years.years(2);
      assertEquals(2, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Years years0 = Years.years(1);
      assertEquals(1, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Years years0 = Years.years(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.minus(3649);
      assertEquals(2147479998, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Years years0 = Years.yearsIn((ReadableInterval) null);
      Years years1 = years0.ONE.multipliedBy(3);
      assertEquals(3, years1.getYears());
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DateTime dateTime0 = new DateTime(1L, (Chronology) mockNullZoneChronology0);
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
  public void test52()  throws Throwable  {
      Years years0 = Years.years(0);
      int int0 = years0.getYears();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Years years0 = Years.TWO;
      PeriodType periodType0 = years0.ZERO.getPeriodType();
      assertEquals("Years", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      String string0 = years0.toString();
      assertEquals("P2147483647Y", string0);
  }
}