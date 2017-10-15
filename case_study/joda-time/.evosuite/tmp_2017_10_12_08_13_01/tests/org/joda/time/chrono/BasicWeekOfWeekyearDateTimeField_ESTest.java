/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:13:57 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicWeekOfWeekyearDateTimeField_ESTest extends BasicWeekOfWeekyearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValueForSet(52, 52);
      assertEquals(52, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, millisDurationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundFloor(1097L);
      assertEquals(1097L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.weeks();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundFloor(0L);
      assertEquals((-259200000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundCeiling(53);
      assertEquals(53L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DurationField durationField0 = islamicChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.remainder(51);
      assertEquals(51L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      DurationField durationField1 = basicWeekOfWeekyearDateTimeField0.getRangeDurationField();
      assertTrue(durationField1.isSupported());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = julianChronology0.seconds();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValueForSet(1L, 53);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DurationField durationField0 = islamicChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.weeks();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue((-1898L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = julianChronology0.seconds();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.get(53);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = null;
      try {
        basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, (DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = null;
      try {
        basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(julianChronology0, preciseDurationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The unit milliseconds must be at least 1
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(907);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = islamicChronology0.days();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, durationField0);
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      int[] intArray0 = new int[5];
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) yearMonth0, intArray0);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DurationField durationField0 = islamicChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1, 1);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0);
      assertEquals(50, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.get(2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = islamicChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValueForSet(53, 53);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DurationField durationField0 = islamicChronology0.hours();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.set(0L, 1);
      assertEquals(1, basicWeekOfWeekyearDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      LocalTime localTime0 = LocalTime.parse("1");
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) localTime0);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue();
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      int int0 = basicWeekOfWeekyearDateTimeField0.getMaximumValue(0L);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundCeiling((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(gregorianChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.roundFloor(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = islamicChronology0.millis();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      long long0 = basicWeekOfWeekyearDateTimeField0.remainder(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(907);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = islamicChronology0.days();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getRangeDurationField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }
}
