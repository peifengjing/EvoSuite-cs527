/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 21:01:06 GMT 2017
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.convert.MockUnknownTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MockUnknownTimeZone_ESTest extends MockUnknownTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      boolean boolean0 = mockUnknownTimeZone0.useDaylightTime();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        timeZone0.useDaylightTime();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        timeZone0.inDaylightTime((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        timeZone0.getOffset(0, 0, 0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      boolean boolean0 = mockUnknownTimeZone0.observesDaylightTime();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      Locale locale0 = Locale.TAIWAN;
      String string0 = mockUnknownTimeZone0.getDisplayName(true, 0, locale0);
      assertEquals("!!!", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      int int0 = mockUnknownTimeZone0.getOffset(0, 0, 22, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      boolean boolean0 = mockUnknownTimeZone0.inDaylightTime((Date) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      int int0 = mockUnknownTimeZone0.getRawOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      mockUnknownTimeZone0.setRawOffset(1);
      assertEquals("!!!", mockUnknownTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockUnknownTimeZone mockUnknownTimeZone0 = new MockUnknownTimeZone();
      String string0 = mockUnknownTimeZone0.getID();
      assertEquals("!!!", string0);
  }
}