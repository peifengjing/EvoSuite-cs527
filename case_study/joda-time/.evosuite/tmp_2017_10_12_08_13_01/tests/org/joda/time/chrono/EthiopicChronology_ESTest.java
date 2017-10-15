/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 19:11:00 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EthiopicChronology_ESTest extends EthiopicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      boolean boolean0 = ethiopicChronology0.isLeapDay(2147483L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology(buddhistChronology0, mockJapaneseDate0, 1);
      assertEquals(1, EthiopicChronology.EE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      ethiopicChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, EthiopicChronology.EE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getMinYear();
      assertEquals((-292269337), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(30962844000000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      // Undeclared exception!
      try { 
        ethiopicChronology0.isLeapDay((-154073836800000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (EthiopicChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null, 3);
      assertEquals(1, EthiopicChronology.EE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1, 1, 1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0);
      assertEquals(1, EthiopicChronology.EE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      long long0 = ethiopicChronology0.calculateFirstDayOfYearMillis(2963);
      assertEquals(31579459200000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.calculateFirstDayOfYearMillis((-2920));
      assertEquals((-154073836800000L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      long long0 = ethiopicChronology0.calculateFirstDayOfYearMillis(2098);
      assertEquals(4282156800000L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      boolean boolean0 = ethiopicChronology0.isLeapDay(9223363318688751616L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        EthiopicChronology.getInstance((DateTimeZone) null, 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 23
         //
         verifyException("org.joda.time.chrono.EthiopicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = null;
      try {
        ethiopicChronology0 = new EthiopicChronology((Chronology) null, (Object) null, (-1962));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -1962
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1, 1, 1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0, 1);
      assertEquals(1, EthiopicChronology.EE);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Chronology chronology0 = ethiopicChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, ethiopicChronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getMaxYear();
      assertEquals(292272984, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2848));
      Chronology chronology0 = ethiopicChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, ethiopicChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Chronology chronology0 = ethiopicChronology0.withUTC();
      assertSame(chronology0, ethiopicChronology0);
  }
}