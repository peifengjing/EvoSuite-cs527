/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 21:04:59 GMT 2017
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.convert.MockUnknownCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MockUnknownCalendar_ESTest extends MockUnknownCalendar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(0L);
      long long0 = mockUnknownCalendar0.getTimeInMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(156L);
      long long0 = mockUnknownCalendar0.getTimeInMillis();
      assertEquals(156L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar((-3404L));
      mockUnknownCalendar0.computeFields();
      assertEquals(1, mockUnknownCalendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar((TimeZone) null);
      assertEquals("org.joda.time.convert.MockUnknownCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockUnknownCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar((-3404L));
      mockUnknownCalendar0.roll(0, false);
      assertEquals(1, mockUnknownCalendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(156L);
      int int0 = mockUnknownCalendar0.getGreatestMinimum(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(0L);
      mockUnknownCalendar0.computeTime();
      assertEquals(0L, mockUnknownCalendar0.getTimeInMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar((-3404L));
      long long0 = mockUnknownCalendar0.getTimeInMillis();
      assertEquals((-3404L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(17L);
      int int0 = mockUnknownCalendar0.getLeastMaximum(1157);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(17L);
      int int0 = mockUnknownCalendar0.getMaximum(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar((-3404L));
      TimeZone timeZone0 = mockUnknownCalendar0.getTimeZone();
      assertNull(timeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(156L);
      int int0 = mockUnknownCalendar0.getMinimum((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockUnknownCalendar mockUnknownCalendar0 = new MockUnknownCalendar(17L);
      mockUnknownCalendar0.add(0, 0);
      assertEquals(1, mockUnknownCalendar0.getMinimalDaysInFirstWeek());
  }
}
