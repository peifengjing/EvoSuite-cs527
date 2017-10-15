/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 18:31:59 GMT 2017
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Minutes;
import org.joda.time.MockPartial;
import org.joda.time.Months;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.dividedBy((-3353));
      boolean boolean0 = hours1.equals(hours0);
      assertEquals(1, hours0.getHours());
      assertFalse(hours0.equals((Object)hours1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      // Undeclared exception!
      try { 
        weeks0.getValue(118);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 118
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      // Undeclared exception!
      try { 
        weeks0.getFieldType((-967));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -967
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = BaseSingleFieldPeriod.standardPeriodIn((ReadablePeriod) null, (-595L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.getValue(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Years years0 = Years.THREE;
      int int0 = years0.getValue(0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Months months0 = Months.TWO;
      PeriodType periodType0 = months0.getPeriodType();
      assertEquals("Months", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds((-4170));
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      int int0 = seconds0.get(durationFieldType0);
      assertEquals((-4170), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(20503125);
      int int0 = BaseSingleFieldPeriod.standardPeriodIn(seconds0, 2108L);
      assertEquals(9726340, int0);
      assertEquals(20503125, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = Minutes.MIN_VALUE;
      int int0 = minutes1.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals((-1), int0);
      assertEquals(3, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Months months0 = Months.FIVE;
      Months months1 = months0.plus(months0);
      int int0 = months1.compareTo((BaseSingleFieldPeriod) months0);
      assertEquals(5, months0.getMonths());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Hours hours0 = seconds0.toStandardHours();
      // Undeclared exception!
      try { 
        seconds0.compareTo((BaseSingleFieldPeriod) hours0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Seconds cannot be compared to class org.joda.time.Hours
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(3, minutes0.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = minutes0.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      boolean boolean0 = hours0.equals(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.equals(hours0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.SEVEN;
      boolean boolean0 = hours1.equals(hours0);
      assertFalse(boolean0);
      assertEquals(7, hours1.getHours());
      assertFalse(hours0.equals((Object)hours1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      boolean boolean0 = hours0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      boolean boolean0 = minutes0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      int int0 = hours0.get(durationFieldType0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      int int0 = weeks0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      // Undeclared exception!
      try { 
        hours0.getValue((-392));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -392
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.getValue(0);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Months months0 = Months.TWO;
      // Undeclared exception!
      try { 
        months0.getFieldType(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      DurationFieldType durationFieldType0 = weeks0.getFieldType(0);
      assertEquals("weeks", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) mockPartial0, (ReadablePartial) mockPartial0);
      assertEquals(1, weeks0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) mockPartial0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      // Undeclared exception!
      try { 
        BaseSingleFieldPeriod.between((ReadablePartial) null, (ReadablePartial) null, hours0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Instant instant0 = new Instant();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      int int0 = BaseSingleFieldPeriod.between(instant0, instant0, durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Instant instant0 = new Instant();
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadableInstant) instant0, (ReadableInstant) null);
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
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      // Undeclared exception!
      try { 
        BaseSingleFieldPeriod.between((ReadableInstant) null, (ReadableInstant) null, durationFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      seconds0.toMutablePeriod();
      assertEquals(1, seconds0.size());
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-906));
      minutes0.toPeriod();
      assertEquals((-906), minutes0.getMinutes());
      assertEquals(1, minutes0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Days days0 = Days.FIVE;
      days0.hashCode();
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Hours hours0 = minutes0.toStandardHours();
      // Undeclared exception!
      try { 
        hours0.compareTo((BaseSingleFieldPeriod) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }
}
