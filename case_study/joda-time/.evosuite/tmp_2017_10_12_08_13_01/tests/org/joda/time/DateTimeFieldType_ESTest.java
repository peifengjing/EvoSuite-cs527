/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:56:12 GMT 2017
 */

package org.joda.time;

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
import org.joda.time.DurationFieldType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeFieldType_ESTest extends DateTimeFieldType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeFieldType.weekyearOfCentury();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType.year();
      DateTimeFieldType.dayOfWeek();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      // Undeclared exception!
      try { 
        dateTimeFieldType0.isSupported(chronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeFieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      // Undeclared exception!
      try { 
        dateTimeFieldType0.isSupported(chronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeFieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      dateTimeFieldType0.getDurationType();
      dateTimeFieldType0.getRangeDurationType();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.monthOfYear();
      dateTimeFieldType1.getRangeDurationType();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      dateTimeFieldType1.getField(chronology0);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.millisOfDay();
      dateTimeFieldType2.getDurationType();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology1).millisOfDay();
      // Undeclared exception!
      try { 
        dateTimeFieldType2.isSupported(chronology1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeFieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      dateTimeFieldType0.getRangeDurationType();
      dateTimeFieldType0.isSupported((Chronology) null);
      dateTimeFieldType0.getRangeDurationType();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
      dateTimeFieldType1.isSupported((Chronology) null);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.minuteOfDay();
      dateTimeFieldType2.getField((Chronology) null);
      DateTimeFieldType dateTimeFieldType3 = DateTimeFieldType.dayOfWeek();
      dateTimeFieldType3.isSupported((Chronology) null);
      dateTimeFieldType3.getDurationType();
      DurationFieldType durationFieldType0 = dateTimeFieldType3.getRangeDurationType();
      dateTimeFieldType3.getDurationType();
      DateTimeFieldType dateTimeFieldType4 = DateTimeFieldType.weekyear();
      dateTimeFieldType4.getRangeDurationType();
      dateTimeFieldType1.isSupported((Chronology) null);
      DateTimeFieldType.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType5 = DateTimeFieldType.era();
      dateTimeFieldType5.getRangeDurationType();
      DateTimeFieldType dateTimeFieldType6 = DateTimeFieldType.dayOfMonth();
      dateTimeFieldType6.isSupported((Chronology) null);
      dateTimeFieldType6.getRangeDurationType();
      dateTimeFieldType0.getField((Chronology) null);
      DateTimeFieldType.clockhourOfDay();
      DateTimeFieldType dateTimeFieldType7 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldType7.getField((Chronology) null);
      dateTimeFieldType7.isSupported((Chronology) null);
      DateTimeFieldType dateTimeFieldType8 = DateTimeFieldType.minuteOfDay();
      dateTimeFieldType8.getField((Chronology) null);
      dateTimeFieldType8.getDurationType();
      dateTimeFieldType0.toString();
      DateTimeFieldType dateTimeFieldType9 = DateTimeFieldType.year();
      dateTimeFieldType9.getDurationType();
      DurationFieldType durationFieldType1 = dateTimeFieldType2.getDurationType();
      assertNotSame(durationFieldType1, durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      dateTimeFieldType1.isSupported((Chronology) null);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.yearOfEra();
      dateTimeFieldType2.isSupported((Chronology) null);
      dateTimeFieldType2.getDurationType();
      DateTimeFieldType.minuteOfHour();
      DateTimeFieldType dateTimeFieldType3 = DateTimeFieldType.centuryOfEra();
      dateTimeFieldType3.getDurationType();
      dateTimeFieldType3.isSupported((Chronology) null);
      dateTimeFieldType0.getName();
      dateTimeFieldType1.isSupported((Chronology) null);
      DateTimeFieldType dateTimeFieldType4 = DateTimeFieldType.monthOfYear();
      dateTimeFieldType4.getRangeDurationType();
      dateTimeFieldType4.getRangeDurationType();
      dateTimeFieldType2.getName();
      DateTimeFieldType dateTimeFieldType5 = DateTimeFieldType.hourOfHalfday();
      dateTimeFieldType1.getField((Chronology) null);
      dateTimeFieldType5.getField((Chronology) null);
      DateTimeFieldType dateTimeFieldType6 = DateTimeFieldType.clockhourOfDay();
      dateTimeFieldType6.isSupported((Chronology) null);
      DateTimeFieldType.yearOfCentury();
      DateTimeFieldType dateTimeFieldType7 = DateTimeFieldType.halfdayOfDay();
      dateTimeFieldType7.getField((Chronology) null);
      DateTimeFieldType.minuteOfHour();
      String string0 = dateTimeFieldType3.toString();
      assertEquals("centuryOfEra", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      dateTimeFieldType0.getField(chronology0);
      DateTimeFieldType.dayOfWeek();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology1).clockhourOfHalfday();
      // Undeclared exception!
      try { 
        dateTimeFieldType0.isSupported(chronology1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeFieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      dateTimeFieldType0.getDurationType();
      dateTimeFieldType0.getDurationType();
      dateTimeFieldType0.getDurationType();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      dateTimeFieldType0.getField(chronology0);
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology1).yearOfCentury();
      // Undeclared exception!
      try { 
        dateTimeFieldType0.isSupported(chronology1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeFieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      dateTimeFieldType0.getRangeDurationType();
      dateTimeFieldType0.getRangeDurationType();
      dateTimeFieldType0.getDurationType();
      dateTimeFieldType0.getRangeDurationType();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekyear();
      dateTimeFieldType1.getRangeDurationType();
      dateTimeFieldType1.getDurationType();
      dateTimeFieldType1.getDurationType();
      dateTimeFieldType0.getDurationType();
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.halfdayOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn("d*OrPp()Eerp?i#e", "d*OrPp()Eerp?i#e").when(dateTimeField0).toString();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(chronology0).halfdayOfDay();
      DateTimeField dateTimeField1 = dateTimeFieldType2.getField(chronology0);
      dateTimeFieldType0.isSupported((Chronology) null);
      DateTimeFieldType dateTimeFieldType3 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldType3.isSupported((Chronology) null);
      dateTimeFieldType3.getRangeDurationType();
      DateTimeFieldType.dayOfWeek();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField1).when(chronology1).millisOfDay();
      dateTimeFieldType0.getField(chronology1);
      dateTimeFieldType2.getRangeDurationType();
      DateTimeFieldType dateTimeFieldType4 = DateTimeFieldType.millisOfDay();
      assertNotSame(dateTimeFieldType4, dateTimeFieldType2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(dateTimeField0).isSupported();
      doReturn((String) null, (String) null).when(dateTimeField0).toString();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(chronology0).yearOfEra();
      DateTimeField dateTimeField1 = dateTimeFieldType0.getField(chronology0);
      dateTimeFieldType0.getRangeDurationType();
      dateTimeFieldType0.getDurationType();
      dateTimeFieldType0.getDurationType();
      dateTimeFieldType0.getRangeDurationType();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField1).when(chronology1).secondOfDay();
      dateTimeFieldType1.isSupported(chronology1);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.clockhourOfHalfday();
      Chronology chronology2 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology2).clockhourOfHalfday();
      dateTimeFieldType2.getField(chronology2);
      dateTimeFieldType2.getRangeDurationType();
      DateTimeFieldType.weekyearOfCentury();
      DateTimeFieldType.weekOfWeekyear();
      DateTimeFieldType.minuteOfDay();
      DateTimeFieldType.dayOfWeek();
      DateTimeFieldType.minuteOfDay();
      DateTimeFieldType.dayOfYear();
      DateTimeFieldType dateTimeFieldType3 = DateTimeFieldType.weekOfWeekyear();
      assertEquals("weekOfWeekyear", dateTimeFieldType3.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(dateTimeField0).toString();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(chronology0).weekOfWeekyear();
      DateTimeField dateTimeField1 = dateTimeFieldType0.getField(chronology0);
      dateTimeFieldType0.getName();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfDay();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField1).when(chronology1).millisOfDay();
      DateTimeField dateTimeField2 = dateTimeFieldType1.getField(chronology1);
      DateTimeFieldType.hourOfHalfday();
      DateTimeFieldType.millisOfSecond();
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.weekyear();
      Chronology chronology2 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField2).when(chronology2).weekyear();
      dateTimeFieldType2.getField(chronology2);
      DateTimeField dateTimeField3 = dateTimeFieldType2.getField((Chronology) null);
      assertFalse(dateTimeField3.equals((Object)dateTimeField1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(dateTimeField0).toString();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(chronology0).era();
      DateTimeField dateTimeField1 = dateTimeFieldType0.getField(chronology0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfHalfday();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField1).when(chronology1).hourOfHalfday();
      DateTimeField dateTimeField2 = dateTimeFieldType1.getField(chronology1);
      Chronology chronology2 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField2).when(chronology2).hourOfHalfday();
      dateTimeFieldType1.getField(chronology2);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.hourOfDay();
      Chronology chronology3 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField1).when(chronology3).hourOfDay();
      dateTimeFieldType2.getField(chronology3);
      dateTimeFieldType2.getRangeDurationType();
      DateTimeFieldType dateTimeFieldType3 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldType3.getDurationType();
      dateTimeFieldType3.getDurationType();
      dateTimeFieldType3.getRangeDurationType();
      dateTimeFieldType3.getRangeDurationType();
      DateTimeFieldType.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType4 = DateTimeFieldType.halfdayOfDay();
      dateTimeFieldType4.getRangeDurationType();
      Chronology chronology4 = mock(Chronology.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      dateTimeFieldType0.getField((Chronology) null);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      DateTimeField dateTimeField0 = dateTimeFieldType1.getField(chronology0);
      dateTimeFieldType1.getRangeDurationType();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(chronology1).minuteOfDay();
      DateTimeField dateTimeField1 = dateTimeFieldType0.getField(chronology1);
      dateTimeFieldType0.getField((Chronology) null);
      dateTimeFieldType0.getDurationType();
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.weekyearOfCentury();
      dateTimeFieldType2.toString();
      Chronology chronology2 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField1).when(chronology2).minuteOfDay();
      dateTimeFieldType1.getDurationType();
      // Undeclared exception!
      try { 
        dateTimeFieldType0.isSupported(chronology2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeFieldType", e);
      }
  }
}
