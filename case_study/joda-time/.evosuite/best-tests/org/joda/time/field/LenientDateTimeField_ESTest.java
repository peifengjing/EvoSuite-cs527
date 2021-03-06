/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:29:09 GMT 2017
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
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.LenientDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LenientDateTimeField_ESTest extends LenientDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFieldType) null).when(dateTimeField0).getType();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField0, chronology0);
      // Undeclared exception!
      try { 
        lenientDateTimeField0.set(30L, 1687);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.LenientDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(dateTimeField0).isLenient();
      doReturn((String) null).when(dateTimeField0).toString();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, chronology0);
      // Undeclared exception!
      try { 
        dateTimeField1.set((long) 70, 70);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(dateTimeField0).isLenient();
      doReturn((String) null).when(dateTimeField0).toString();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, chronology0);
      // Undeclared exception!
      try { 
        dateTimeField1.isLenient();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      LenientDateTimeField lenientDateTimeField0 = null;
      try {
        lenientDateTimeField0 = new LenientDateTimeField((DateTimeField) null, chronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DelegatedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFieldType) null).when(dateTimeField0).getType();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField0, chronology0);
      boolean boolean0 = lenientDateTimeField0.isLenient();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFieldType) null).when(dateTimeField0).getType();
      doReturn(false).when(dateTimeField0).isLenient();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, chronology0);
      assertTrue(dateTimeField1.isLenient());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      DateTimeField dateTimeField0 = LenientDateTimeField.getInstance((DateTimeField) null, chronology0);
      assertNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeField0).add(anyLong() , anyLong());
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeField dateTimeField1 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(4160).when(dateTimeField1).get(anyLong());
      doReturn(dateTimeFieldType0).when(dateTimeField1).getType();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-278)).when(dateTimeZone0).convertUTCToLocal(anyLong());
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0, (DateTimeZone) null).when(chronology1).getZone();
      doReturn(chronology0).when(chronology1).withUTC();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField1, chronology1);
      // Undeclared exception!
      try { 
        lenientDateTimeField0.set(370370367L, (-1596));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.LenientDateTimeField", e);
      }
  }
}
