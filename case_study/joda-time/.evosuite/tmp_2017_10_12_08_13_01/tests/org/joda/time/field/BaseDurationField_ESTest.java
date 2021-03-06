/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:39:21 GMT 2017
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
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseDurationField_ESTest extends BaseDurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getValueAsLong(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getValueAsLong((long) (-1473));
      assertEquals((-24L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      int int0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getValue(0L, 939L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1059L);
      int int0 = preciseDurationField0.getValue(1768L, 1768L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, (-1030));
      int int0 = testPreciseDateTimeField_MockCountingDurationField0.getValue(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 925);
      int int0 = testPreciseDateTimeField_MockCountingDurationField0.getValue((long) 925);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      int int0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getValue((-47640L));
      assertEquals((-794), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(durationFieldType0).getName();
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      String string0 = testPreciseDateTimeField_MockImpreciseDurationField0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(".~x9+I.P&seo?").when(durationFieldType0).getName();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 0);
      String string0 = testPreciseDateTimeField_MockCountingDurationField0.getName();
      assertEquals(".~x9+I.P&seo?", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getMillis(1L);
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getMillis((-2712L));
      assertEquals((-162720L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getMillis(1);
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getMillis((-11));
      assertEquals((-660L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-60L));
      int int0 = preciseDurationField0.getDifference((-60L), (-60L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      int int0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getDifference(0L, 0L);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      // Undeclared exception!
      try { 
        testPreciseDateTimeField_MockImpreciseDurationField0.getValueAsLong((-87L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValue((long) 11, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValue(30L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      // Undeclared exception!
      try { 
        testPreciseDurationDateTimeField_MockCountingDurationField0.getMillis(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 9223372036854775807 * 60
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getDifference((-799L), 2434L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      // Undeclared exception!
      try { 
        testPreciseDateTimeField_MockImpreciseDurationField0.compareTo((DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestBaseDateTimeField.MockCountingDurationField testBaseDateTimeField_MockCountingDurationField0 = new TestBaseDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testBaseDateTimeField_MockCountingDurationField0.getMillis(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      doReturn("").when(durationFieldType0).getName();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 0);
      String string0 = testPreciseDateTimeField_MockCountingDurationField0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      boolean boolean0 = testPreciseDurationDateTimeField_MockCountingDurationField0.isSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1029L);
      int int0 = preciseDurationField0.getValue((-3357L), 60L);
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      long long0 = testPreciseDurationDateTimeField_MockCountingDurationField0.getValueAsLong(4336L);
      assertEquals(72L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-2049L));
      int int0 = preciseDurationField0.getDifference(2715L, (-1441L));
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValue(128764527720L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 128764527720
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1029L);
      DurationFieldType durationFieldType1 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType1);
      int int0 = preciseDurationField0.compareTo((DurationField) testPreciseDurationDateTimeField_MockCountingDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestBaseDateTimeField.MockCountingDurationField testBaseDateTimeField_MockCountingDurationField0 = new TestBaseDateTimeField.MockCountingDurationField(durationFieldType0);
      DurationFieldType durationFieldType1 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockZeroDurationField testPreciseDateTimeField_MockZeroDurationField0 = new TestPreciseDateTimeField.MockZeroDurationField(durationFieldType1);
      int int0 = testBaseDateTimeField_MockCountingDurationField0.compareTo((DurationField) testPreciseDateTimeField_MockZeroDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, 1);
      DurationFieldType durationFieldType1 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType1);
      int int0 = testPreciseDateTimeField_MockImpreciseDurationField0.compareTo((DurationField) testPreciseDateTimeField_MockCountingDurationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PreciseDurationField preciseDurationField0 = null;
      try {
        preciseDurationField0 = new PreciseDurationField((DurationFieldType) null, 1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The type must not be null
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      TestPreciseDateTimeField.MockImpreciseDurationField testPreciseDateTimeField_MockImpreciseDurationField0 = new TestPreciseDateTimeField.MockImpreciseDurationField(durationFieldType0);
      long long0 = testPreciseDateTimeField_MockImpreciseDurationField0.getMillis((-90));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(durationFieldType0).getName();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType0, (-1458));
      String string0 = testPreciseDateTimeField_MockCountingDurationField0.toString();
      assertEquals("DurationField[null]", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(durationFieldType0).toString();
      TestPreciseDurationDateTimeField.MockCountingDurationField testPreciseDurationDateTimeField_MockCountingDurationField0 = new TestPreciseDurationDateTimeField.MockCountingDurationField(durationFieldType0);
      DurationFieldType durationFieldType1 = testPreciseDurationDateTimeField_MockCountingDurationField0.getType();
      assertSame(durationFieldType1, durationFieldType0);
  }
}
