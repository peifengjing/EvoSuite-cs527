/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:47:27 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.DelegatedDurationField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScaledDurationField_ESTest extends ScaledDurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-4550));
      scaledDurationField0.hashCode();
      assertEquals((-4550), scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 2307L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 1034);
      ScaledDurationField scaledDurationField1 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-2190));
      boolean boolean0 = scaledDurationField0.equals(scaledDurationField1);
      assertEquals((-2190), scaledDurationField1.getScalar());
      assertFalse(boolean0);
      assertFalse(scaledDurationField1.equals((Object)scaledDurationField0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      DelegatedDurationField delegatedDurationField0 = new DelegatedDurationField(testPreciseDurationDateTimeField_MockCountingDurationField0, durationFieldType0);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(delegatedDurationField0, durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(decoratedDurationField0, durationFieldType0, 2059);
      long long0 = scaledDurationField0.getDifferenceAsLong((-4129L), (-1144L));
      assertEquals(2059, scaledDurationField0.getScalar());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.getValueAsLong((-426L), (-1938L));
      assertEquals(426L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-4550));
      long long0 = scaledDurationField0.getValueAsLong(324324000000000L, (long) 1);
      assertEquals((-825L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, (-1810));
      long long0 = scaledDurationField0.getValueAsLong((long) (-1810));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, (-1001));
      long long0 = scaledDurationField0.getValueAsLong(1948L);
      assertEquals((-1L), long0);
      assertEquals((-1001), scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 336L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 1413);
      int int0 = scaledDurationField0.getValue((-2644L), (-2644L));
      assertEquals(1413, scaledDurationField0.getScalar());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-4276L));
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 950);
      int int0 = scaledDurationField0.getValue((-4063780L), (long) 1);
      assertEquals(950, scaledDurationField0.getScalar());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      int int0 = scaledDurationField0.getValue(1L, 1L);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DelegatedDurationField delegatedDurationField0 = new DelegatedDurationField(millisDurationField0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(delegatedDurationField0, durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(decoratedDurationField0, durationFieldType0, (-1));
      int int0 = scaledDurationField0.getValue((long) (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, (-1001));
      int int0 = scaledDurationField0.getValue(1002001L);
      assertEquals((-1001), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockImpreciseDurationField0, durationFieldType0, 720);
      long long0 = scaledDurationField0.getUnitMillis();
      assertEquals(0L, long0);
      assertEquals(720, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 23118750);
      long long0 = scaledDurationField0.getUnitMillis();
      assertEquals(23118750000L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2983L));
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      Weeks weeks0 = days0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 2064);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockCountingDurationField0, durationFieldType0, (-3646));
      int int0 = scaledDurationField0.getScalar();
      assertEquals((-3646), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDurationDateTimeField_MockCountingDurationField0, durationFieldType0, 27);
      scaledDurationField0.getMillis(448L, (long) 27);
      assertEquals(27, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.getMillis(47L, 550L);
      assertEquals((-47L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockImpreciseDurationField0, durationFieldType0, 720);
      scaledDurationField0.getMillis(808L);
      assertEquals(720, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 336L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 1413);
      long long0 = scaledDurationField0.getMillis(336L);
      assertEquals(159522048L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-1211L));
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 23034375);
      long long0 = scaledDurationField0.getMillis((long) 23034375);
      assertEquals((-642535324716796875L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockImpreciseDurationField0, durationFieldType0, 720);
      scaledDurationField0.getMillis(475, (long) 720);
      assertEquals(720, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.days((-1));
      Weeks weeks0 = period0.toStandardWeeks();
      Days days0 = weeks0.toStandardDays();
      DurationFieldType durationFieldType0 = days0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-1));
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.getMillis((-1), (long) (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      scaledDurationField0.getMillis((-1));
      assertEquals((-1), scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 336L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 1413);
      long long0 = scaledDurationField0.getMillis(1413);
      assertEquals(670847184L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.getMillis(1);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.getDifferenceAsLong((-1), 1898L);
      assertEquals(1899L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.getDifferenceAsLong(0L, (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDurationDateTimeField_MockCountingDurationField0, durationFieldType0, 27);
      int int0 = scaledDurationField0.getDifference(0L, 0L);
      assertEquals(1, int0);
      assertEquals(27, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      int int0 = scaledDurationField0.getDifference(20L, 1L);
      assertEquals((-19), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      TestPreciseDateTimeField.MockZeroDurationField testPreciseDateTimeField_MockZeroDurationField0 = new TestPreciseDateTimeField.MockZeroDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockZeroDurationField0, durationFieldType0, 1228);
      scaledDurationField0.add((long) 1228, 0L);
      assertEquals(1228, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 23118750);
      long long0 = scaledDurationField0.add((-2000L), 1744L);
      assertEquals(40319099998000L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      DelegatedDurationField delegatedDurationField0 = new DelegatedDurationField(testPreciseDurationDateTimeField_MockCountingDurationField0, durationFieldType0);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(delegatedDurationField0, durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(decoratedDurationField0, durationFieldType0, 2059);
      long long0 = scaledDurationField0.add((-4129L), (-4129L));
      assertEquals((-510100789L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockImpreciseDurationField0, durationFieldType0, 720);
      scaledDurationField0.add(0L, 0);
      assertEquals(720, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDurationDateTimeField_MockCountingDurationField0, durationFieldType0, 27);
      long long0 = scaledDurationField0.add(284L, 0);
      assertEquals(284L, long0);
      assertEquals(27, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.add(0L, 2136);
      assertEquals((-2136L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockImpreciseDurationField0, durationFieldType0, (-7200000));
      // Undeclared exception!
      try { 
        scaledDurationField0.getValueAsLong((long) (-916));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      TestPreciseDurationDateTimeField.MockImpreciseDurationField testPreciseDurationDateTimeField_MockImpreciseDurationField0 = new TestPreciseDurationDateTimeField.MockImpreciseDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDurationDateTimeField_MockImpreciseDurationField0, durationFieldType0, (-1));
      // Undeclared exception!
      try { 
        scaledDurationField0.getValue((long) (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.centuries();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 2147483645);
      // Undeclared exception!
      try { 
        scaledDurationField0.getMillis((long) 2147483645, (long) 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 4611686005542486025 * 100
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      TestPreciseDateTimeField.MockZeroDurationField testPreciseDateTimeField_MockZeroDurationField0 = new TestPreciseDateTimeField.MockZeroDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockZeroDurationField0, durationFieldType0, 1228);
      ScaledDurationField scaledDurationField1 = new ScaledDurationField(testPreciseDateTimeField_MockZeroDurationField0, durationFieldType0, 1228);
      boolean boolean0 = scaledDurationField0.equals(scaledDurationField1);
      assertTrue(boolean0);
      assertEquals(1228, scaledDurationField1.getScalar());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2983L));
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      Weeks weeks0 = days0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 2064);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockCountingDurationField0, durationFieldType0, (-3646));
      DurationFieldType durationFieldType1 = DurationFieldType.centuries();
      ScaledDurationField scaledDurationField1 = new ScaledDurationField(testPreciseDateTimeField_MockCountingDurationField0, durationFieldType1, 581);
      boolean boolean0 = scaledDurationField0.equals(scaledDurationField1);
      assertEquals(581, scaledDurationField1.getScalar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = durationFieldType0.getField(gregorianChronology0);
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 4761L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 1419);
      ScaledDurationField scaledDurationField1 = new ScaledDurationField(durationField0, durationFieldType0, (-1970));
      boolean boolean0 = scaledDurationField0.equals(scaledDurationField1);
      assertFalse(boolean0);
      assertEquals((-1970), scaledDurationField1.getScalar());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2983L));
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      Weeks weeks0 = days0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 2064);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockCountingDurationField0, durationFieldType0, (-3646));
      ScaledDurationField scaledDurationField1 = new ScaledDurationField(testPreciseDateTimeField_MockCountingDurationField0, durationFieldType0, 581);
      boolean boolean0 = scaledDurationField0.equals(scaledDurationField1);
      assertFalse(boolean0);
      assertEquals(581, scaledDurationField1.getScalar());
      assertFalse(scaledDurationField1.equals((Object)scaledDurationField0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      TestPreciseDateTimeField.MockZeroDurationField testPreciseDateTimeField_MockZeroDurationField0 = new TestPreciseDateTimeField.MockZeroDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockZeroDurationField0, durationFieldType0, 1228);
      boolean boolean0 = scaledDurationField0.equals(scaledDurationField0);
      assertTrue(boolean0);
      assertEquals(1228, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-2983L));
      Hours hours0 = duration0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      Weeks weeks0 = days0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 2064);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockCountingDurationField0, durationFieldType0, (-3646));
      boolean boolean0 = scaledDurationField0.equals("");
      assertEquals((-3646), scaledDurationField0.getScalar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.years();
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      ScaledDurationField scaledDurationField0 = null;
      try {
        scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The scalar must not be 0 or 1
         //
         verifyException("org.joda.time.field.ScaledDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ScaledDurationField scaledDurationField0 = null;
      try {
        scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The scalar must not be 0 or 1
         //
         verifyException("org.joda.time.field.ScaledDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.minutes();
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 23034375);
      long long0 = scaledDurationField0.getValueAsLong((long) 1, (long) 1);
      assertEquals(0L, long0);
      assertEquals(23034375, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.years();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-2926));
      long long0 = scaledDurationField0.getUnitMillis();
      assertEquals((-92335641552000L), long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, (-1001));
      long long0 = scaledDurationField0.getMillis((-1001), 0L);
      assertEquals(1002001L, long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.years();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-2926));
      int int0 = scaledDurationField0.getDifference((-3599L), 492L);
      assertEquals(0, int0);
      assertEquals((-2926), scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 336L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 1413);
      long long0 = scaledDurationField0.getMillis(3806L, 3806L);
      assertEquals(1806967008L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.minutes();
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 23034375);
      // Undeclared exception!
      try { 
        scaledDurationField0.add(0L, 23034375);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 530582431640625 * 60000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.years();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-2926));
      // Undeclared exception!
      try { 
        scaledDurationField0.add((long) (-2926), (long) 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, (-1));
      long long0 = scaledDurationField0.getValueAsLong(0L);
      assertEquals(0L, long0);
      assertEquals((-1), scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-1211L));
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 23034375);
      // Undeclared exception!
      try { 
        scaledDurationField0.getValue((-642535324716796875L), (long) 23034375);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 530582431640625
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 32);
      int int0 = scaledDurationField0.getScalar();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 23118750);
      int int0 = scaledDurationField0.getValue((long) 23118750);
      assertEquals(23118750, scaledDurationField0.getScalar());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 32);
      // Undeclared exception!
      try { 
        scaledDurationField0.getDifferenceAsLong((-2117L), 29000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(testPreciseDateTimeField_MockImpreciseDurationField0, durationFieldType0, 933);
      // Undeclared exception!
      try { 
        scaledDurationField0.getMillis(1000000000000000000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 1000000000000000000 * 933
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.years();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-1));
      // Undeclared exception!
      try { 
        scaledDurationField0.getMillis((-2147483646));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 2147483646 * 31556952000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
