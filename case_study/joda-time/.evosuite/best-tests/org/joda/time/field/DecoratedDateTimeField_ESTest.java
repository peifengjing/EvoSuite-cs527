/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:43:12 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.TestOffsetDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DecoratedDateTimeField_ESTest extends DecoratedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      long long0 = testOffsetDateTimeField_MockOffsetDateTimeField0.roundFloor(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      long long0 = testOffsetDateTimeField_MockStandardDateTimeField0.roundFloor(21600000L);
      assertEquals(21600000L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DurationField durationField0 = testOffsetDateTimeField_MockStandardDateTimeField0.getDurationField();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(testOffsetDateTimeField_MockOffsetDateTimeField0, durationField0, dateTimeFieldType0, 3866);
      long long0 = remainderDateTimeField0.roundFloor((-483L));
      assertEquals((-1000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DurationField durationField0 = testOffsetDateTimeField_MockStandardDateTimeField0.getDurationField();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(testOffsetDateTimeField_MockOffsetDateTimeField0, durationField0, dateTimeFieldType0, 3866);
      int int0 = remainderDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      int int0 = testOffsetDateTimeField_MockOffsetDateTimeField0.getMinimumValue();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      int int0 = testOffsetDateTimeField_MockStandardDateTimeField0.getMaximumValue();
      assertEquals(62, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      int int0 = testOffsetDateTimeField_MockStandardDateTimeField0.get(0L);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(testOffsetDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0, (-829), (-829), 1);
      int int0 = offsetDateTimeField0.get(1);
      assertEquals((-826), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      // Undeclared exception!
      try { 
        testOffsetDateTimeField_MockOffsetDateTimeField0.set((-21L), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for secondOfMinute must be in the range [3,62]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(testOffsetDateTimeField_MockStandardDateTimeField0, (DurationField) null, dateTimeFieldType0, 2615625);
      DateTimeFieldType dateTimeFieldType1 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(remainderDateTimeField0, dateTimeFieldType1);
      // Undeclared exception!
      try { 
        dividedDateTimeField0.roundFloor(2615625);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for secondOfMinute must be in the range [3,62]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      DurationField durationField0 = testOffsetDateTimeField_MockOffsetDateTimeField0.getDurationField();
      assertEquals(1000L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(testOffsetDateTimeField_MockStandardDateTimeField0, (DurationField) null, dateTimeFieldType0, 2615625);
      DateTimeFieldType dateTimeFieldType1 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(remainderDateTimeField0, dateTimeFieldType1);
      DateTimeField dateTimeField0 = dividedDateTimeField0.getWrappedField();
      assertSame(testOffsetDateTimeField_MockStandardDateTimeField0, dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = null;
      try {
        zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) null, dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DecoratedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      DurationField durationField0 = testOffsetDateTimeField_MockOffsetDateTimeField0.getRangeDurationField();
      assertEquals(60000L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      boolean boolean0 = testOffsetDateTimeField_MockStandardDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DurationField durationField0 = testOffsetDateTimeField_MockStandardDateTimeField0.getDurationField();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(testOffsetDateTimeField_MockOffsetDateTimeField0, durationField0, dateTimeFieldType0, 3866);
      long long0 = remainderDateTimeField0.addWrapField((long) 4, 3866);
      assertEquals(4L, long0);
  }
}
