/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:46:07 GMT 2017
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseDateTime_ESTest extends BaseDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(chronology0).toString();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(chronology0);
      DateTime dateTime0 = new DateTime(mutableDateTime0);
      dateTime0.getChronology();
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(chronology0).toString();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(chronology0);
      long long0 = mutableDateTime0.getMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null, (DateTimeZone) null);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(chronology0).getDateTimeMillis(anyInt() , anyInt() , anyInt() , anyInt() , anyInt() , anyInt() , anyInt());
      doReturn((String) null, (String) null).when(chronology0).toString();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(chronology0);
      mutableDateTime0.setDateTime(Integer.MAX_VALUE, Integer.MAX_VALUE, (-2233), 17, 1943, Integer.MAX_VALUE, Integer.MAX_VALUE);
      long long0 = mutableDateTime0.getMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      doReturn((String) null, (String) null).when(chronology0).toString();
      doReturn((Chronology) null).when(chronology0).withZone(any(org.joda.time.DateTimeZone.class));
      MutableDateTime mutableDateTime0 = MutableDateTime.now(chronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(3, 2);
      mutableDateTime0.setZone(dateTimeZone0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime((-2147483647), (-2147483647), (-2147483647), (-2147483647), (-2147483647), (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483647 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}