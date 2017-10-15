/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:48:03 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.ScaledDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationField_ESTest extends DurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      String string0 = millisDurationField0.toString();
      assertEquals("DurationField[millis]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.subtract((long) 0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      DurationField durationField0 = durationFieldType0.getField((Chronology) null);
      long long0 = durationField0.subtract(13737600000L, 0);
      assertEquals(13737600000L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      boolean boolean0 = millisDurationField0.isSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      boolean boolean0 = millisDurationField0.isPrecise();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong(2165L, 2165L);
      assertEquals(2165L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong(1501L);
      assertEquals(1501L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getValueAsLong((-12L));
      assertEquals((-12L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(1501L, 1644L);
      assertEquals(1501, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue((-499L), 0L);
      assertEquals((-499), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getValue(1367L);
      assertEquals(1367, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getUnitMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = millisDurationField0.getType();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, (-118));
      String string0 = scaledDurationField0.getName();
      assertEquals("millis", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(1367L, 1367L);
      assertEquals(1367L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-269L));
      assertEquals((-269L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getMillis((-60), 0L);
      assertEquals((-60L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = millisDurationField0.getType();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, (-118));
      long long0 = scaledDurationField0.getMillis((-118));
      assertEquals(13924L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getDifferenceAsLong((-497L), (-499));
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.getDifferenceAsLong(280L, 175230L);
      assertEquals((-174950L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getDifference((-269L), (-269L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = millisDurationField0.getDifference((-269L), (-2658L));
      assertEquals(2389, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add((long) 0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      DurationField durationField0 = durationFieldType0.getField((Chronology) null);
      long long0 = durationField0.add(0L, 2339L);
      assertEquals(8420400000L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add(2345L, (-9223372036854775808L));
      assertEquals((-9223372036854773463L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.add(3186L, (-894));
      assertEquals(2292L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DurationField durationField0 = mockNullZoneChronology0.years();
      // Undeclared exception!
      try { 
        durationField0.subtract(0L, 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DurationField durationField0 = mockNullZoneChronology0.weeks();
      // Undeclared exception!
      try { 
        durationField0.subtract(2825L, 4802);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weeks field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DurationField durationField0 = mockNullZoneChronology0.minutes();
      // Undeclared exception!
      try { 
        durationField0.getValueAsLong((-2445L), 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DurationField durationField0 = mockNullZoneChronology0.eras();
      // Undeclared exception!
      try { 
        durationField0.getValue((-2618L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DurationField durationField0 = mockNullZoneChronology0.minutes();
      // Undeclared exception!
      try { 
        durationField0.getMillis((-2615), 0L);
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
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DurationField durationField0 = mockNullZoneChronology0.millis();
      // Undeclared exception!
      try { 
        durationField0.getDifference(0L, (-9223372036854775808L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millis field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      long long0 = millisDurationField0.subtract(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = millisDurationField0.getType();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, (-118));
      long long0 = scaledDurationField0.subtract(13924L, 1367L);
      assertEquals(175230L, long0);
  }
}