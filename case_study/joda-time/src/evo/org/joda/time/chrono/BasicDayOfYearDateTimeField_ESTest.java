/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:12:50 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicDayOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicDayOfYearDateTimeField_ESTest extends BasicDayOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, decoratedDurationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValueForSet((-1L), 365);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = copticChronology0.millis();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone1).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDate localDate0 = new LocalDate(2646L, dateTimeZone1);
      int[] intArray0 = new int[5];
      intArray0[0] = 113;
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) localDate0, intArray0);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.days();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      boolean boolean0 = basicDayOfYearDateTimeField0.isLeap(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.days();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue();
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = copticChronology0.halfdays();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getRangeDurationField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.seconds();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValueForSet(0L, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.hours();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, durationField0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.days();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, millisDurationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.get(1499L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = null;
      try {
        basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, (DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = copticChronology0.weekyears();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = null;
      try {
        basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unit duration field must be precise
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((-184967539200000L));
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(julianChronology0, millisDurationField0);
      int int0 = basicDayOfYearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValueForSet(1L, 1255);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(julianChronology0, millisDurationField0);
      MockDate mockDate0 = new MockDate(80L);
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) localDate0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      Minutes minutes0 = Minutes.minutes(0);
      int[] intArray0 = copticChronology0.get((ReadablePeriod) minutes0, (long) 0, 59000L);
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      MonthDay monthDay0 = MonthDay.now();
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) monthDay0, intArray0);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(julianChronology0, millisDurationField0);
      MockDate mockDate0 = new MockDate(80L);
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) localDate0);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      MonthDay monthDay0 = MonthDay.now();
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) monthDay0);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.isLeap((-184967539200000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = copticChronology0.halfdays();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      DurationField durationField1 = basicDayOfYearDateTimeField0.getRangeDurationField();
      assertNotSame(durationField0, durationField1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      basicDayOfYearDateTimeField0.setExtended(0L, 30);
      assertEquals(1, basicDayOfYearDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValueForSet(0L, 0);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weeks();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.get((-1829L));
      assertEquals(112, int0);
  }
}
