/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 18:18:12 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MockZone;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.add(61L, (long) 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(millisDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getUnitMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.add((-575L), 480L);
      assertEquals(47425L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((-9223372036854775808L), "org/joda/time/tz/data", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org/joda/time/tz/data\" for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("AonedChronologyb");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundFloor(557L);
      assertEquals(9223372036851175808L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(5L);
      assertEquals(9223372036851175807L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int[] intArray0 = new int[2];
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue((ReadablePartial) null, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      boolean boolean0 = ZonedChronology.useTimeArithmetic(millisDurationField0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = ZonedChronology.useTimeArithmetic((DurationField) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      boolean boolean0 = zonedChronology_ZonedDateTimeField0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Zondhronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(101L, 9223372036851175808L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("AonedChronologyb");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.getDifferenceAsLong((-2225L), 883L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronolo(gy[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.getDifference(1681, 1119L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.addWrapField(3604096L, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.add((-2283L), 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-2152L));
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, decoratedDurationField0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(decoratedDurationField0, (DateTimeZone) null);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, (DateTimeZone) null, decoratedDurationField0, zonedChronology_ZonedDurationField0, zonedChronology_ZonedDurationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      boolean boolean0 = zonedChronology_ZonedDurationField0.equals(zonedChronology_ZonedDurationField0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      boolean boolean0 = zonedChronology_ZonedDurationField0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getDifferenceAsLong(4400L, (-839L));
      assertEquals(52L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 9223372036854775552L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getDifferenceAsLong(9223372036854775552L, 253);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      MockZone mockZone0 = new MockZone(37230040L, (-2147483050), (-2147483050));
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(millisDurationField0, mockZone0);
      int int0 = zonedChronology_ZonedDurationField0.getDifference((-2147483050), 557L);
      assertEquals((-2147483607), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 9223372036854775552L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      int int0 = zonedChronology_ZonedDurationField0.getDifference(253, (-3596945L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.add(15308640162L, 254);
      assertEquals(15308665562L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 9223372036854775552L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.subtract(1025L, 11);
      assertEquals((-9223372036854771967L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      boolean boolean0 = zonedChronology_ZonedDurationField0.isPrecise();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 9223372036854775552L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      boolean boolean0 = zonedChronology_ZonedDurationField0.isPrecise();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = null;
      try {
        zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(unsupportedDurationField0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockZone mockZone0 = new MockZone(117L, (byte)0, (byte)0);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance((Chronology) null, mockZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a chronology
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 94L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      int int0 = zonedChronology_ZonedDurationField0.getValue((-2923L), (-4311L));
      assertEquals((-31), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getMillis(44, (long) 44);
      assertEquals(4400L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 100L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getMillis(476L, (-1549L));
      assertEquals(47600L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 9223372036854775552L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(preciseDurationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getValueAsLong(9223372036854775552L, 76L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = new Locale("ZonedChronology[", "ZonedChronology[", "");
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = Locale.CHINESE;
      String string0 = zonedChronology_ZonedDateTimeField0.getAsText((-2116L), locale0);
      assertEquals("ZonedChronology[", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.set(52L, "ZonedChronology[");
      assertEquals(52L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = new Locale("ZonedChronology[", "{ ?5a", "");
      String string0 = zonedChronology_ZonedDateTimeField0.getAsShortText(4092L, locale0);
      assertEquals("ZonedChronology[", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((ReadablePartial) null, 1, intArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumValue((ReadablePartial) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Zondhronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue(4092L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      DurationField durationField0 = zonedChronology_ZonedDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      DurationField durationField0 = zonedChronology_ZonedDateTimeField0.getDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumValue(4092L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue((ReadablePartial) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("AonedChronologyb");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getLeapAmount(1954L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      boolean boolean0 = zonedChronology_ZonedDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = new Locale("ZonedChronology[", "ZonedChronology[", "");
      String string0 = zonedChronology_ZonedDateTimeField0.getAsShortText((-722), locale0);
      assertEquals("ZonedChronology[", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1407);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      DurationField durationField0 = zonedChronology_ZonedDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = new Locale("");
      String string0 = zonedChronology_ZonedDateTimeField0.getAsText(1, locale0);
      assertEquals("ZonedChronology[", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.set(4092L, 1);
      assertEquals(4092L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.remainder(101L);
      assertEquals((-9223372036851175707L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("ZonedChronology[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      boolean boolean0 = zonedChronology_ZonedDateTimeField0.isLeap((-604800000L));
      assertFalse(boolean0);
  }
}