/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:35:06 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4851);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = iSOChronology0.withUTC();
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      boolean boolean0 = iSOChronology0.equals(mockMinguoDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ISOChronology iSOChronology1 = ISOChronology.getInstance();
      boolean boolean0 = iSOChronology1.equals(iSOChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        iSOChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ISOChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      String string0 = iSOChronology0.toString();
      assertEquals("ISOChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      iSOChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      boolean boolean0 = iSOChronology0.equals(iSOChronology0);
      assertTrue(boolean0);
  }
}
