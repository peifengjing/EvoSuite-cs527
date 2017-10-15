/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:42:17 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeField;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISOYearOfEraDateTimeField_ESTest extends ISOYearOfEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.setExtended((-62167219200000L), 0);
      assertEquals((-62167219200000L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.set(0L, 1970);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.roundFloor(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.roundFloor(111711571203540L);
      assertEquals(111711571200000L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.roundCeiling(127L);
      assertEquals(31536000000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.roundCeiling((-66742963202115L));
      assertEquals((-66742963200000L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.remainder(2471L);
      assertEquals(2471L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.getDifferenceAsLong(292278993, (-66742963202115L));
      assertEquals(2115L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.getDifferenceAsLong(808L, 1830297600000L);
      assertEquals((-57L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.getDifference(1970, 0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.getDifference((-31536000000L), 1L);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.get((-62167219200000L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(readablePartial0).size();
      int[] intArray0 = new int[1];
      int[] intArray1 = iSOYearOfEraDateTimeField0.addWrapField(readablePartial0, 0, intArray0, 0);
      assertArrayEquals(new int[] {0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.addWrapField(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.addWrapField(3120L, 1833);
      assertEquals(57843849603120L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.add((long) 0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.add(0L, 58L);
      assertEquals(1830297600000L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.add((-2115L), (-2115L));
      assertEquals((-66742963202115L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.add(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.add(953L, 1970);
      assertEquals(62167132800953L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      // Undeclared exception!
      try { 
        iSOYearOfEraDateTimeField0.set(0L, (-180));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -180 for yearOfEra must be in the range [0,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeField dateTimeField0 = iSOYearOfEraDateTimeField0.getWrappedField();
      // Undeclared exception!
      try { 
        dateTimeField0.getMaximumValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      // Undeclared exception!
      try { 
        iSOYearOfEraDateTimeField0.addWrapField((ReadablePartial) null, 0, (int[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      // Undeclared exception!
      try { 
        iSOYearOfEraDateTimeField0.add(3540L, 111711571200000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 111711571200000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      // Undeclared exception!
      try { 
        iSOYearOfEraDateTimeField0.add(543L, 292278993);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 292280963 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.getMaximumValue();
      assertEquals(292278993, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.set((-66742963202115L), 146);
      assertEquals((-66742963202115L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.get((-66742963202115L));
      assertEquals(146, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.get(0L);
      assertEquals(1970, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.remainder(16188768000000L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.set((-2649L), 2748);
      assertEquals(24582873597351L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      // Undeclared exception!
      try { 
        iSOYearOfEraDateTimeField0.add((long) 1970, (long) 292278993);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 292280963 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.add(2000L, (-2749));
      assertEquals((-86750006398000L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.getDifferenceAsLong((-2932L), (-2932L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      int int0 = iSOYearOfEraDateTimeField0.getDifference((-604800000L), (-86750006398000L));
      assertEquals(2748, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.roundCeiling((-1402L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.addWrapField(2000L, (-2749));
      assertEquals((-86750006398000L), long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DurationField durationField0 = iSOYearOfEraDateTimeField0.getRangeDurationField();
      assertEquals(0L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      long long0 = iSOYearOfEraDateTimeField0.roundFloor((-2932L));
      assertEquals((-31536000000L), long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        iSOYearOfEraDateTimeField0.addWrapField(readablePartial0, (-1127), intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1127
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}