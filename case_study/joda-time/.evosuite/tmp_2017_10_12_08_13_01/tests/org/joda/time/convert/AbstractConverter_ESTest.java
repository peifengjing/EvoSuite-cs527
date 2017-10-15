/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:49:52 GMT 2017
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.convert.DateConverter;
import org.joda.time.convert.LongConverter;
import org.joda.time.convert.NullConverter;
import org.joda.time.convert.ReadableInstantConverter;
import org.joda.time.convert.ReadableIntervalConverter;
import org.joda.time.convert.ReadablePartialConverter;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractConverter_ESTest extends AbstractConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      boolean boolean0 = readableIntervalConverter0.isReadableInterval((Object) null, (Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        dateConverter0.getPartialValues((ReadablePartial) null, (Object) integer0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.util.Date
         //
         verifyException("org.joda.time.convert.DateConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateConverter dateConverter0 = DateConverter.INSTANCE;
      // Undeclared exception!
      try { 
        dateConverter0.getInstantMillis((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.DateConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReadablePartialConverter readablePartialConverter0 = new ReadablePartialConverter();
      // Undeclared exception!
      try { 
        readablePartialConverter0.getChronology((Object) null, (DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadablePartialConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) mockMinguoDate0, (DateTimeZone) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate cannot be cast to org.joda.time.ReadableInstant
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      long long0 = readableIntervalConverter0.getInstantMillis((Object) null, (Chronology) null);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullConverter nullConverter0 = new NullConverter();
      String string0 = nullConverter0.toString();
      assertEquals("Converter[null]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReadablePartialConverter readablePartialConverter0 = new ReadablePartialConverter();
      String string0 = readablePartialConverter0.toString();
      assertEquals("Converter[org.joda.time.ReadablePartial]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      boolean boolean0 = longConverter0.isReadableInterval("", (Chronology) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getPartialValues((ReadablePartial) null, (Object) null, (Chronology) null, (DateTimeFormatter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.AbstractConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      Integer integer0 = new Integer(0);
      MockZone mockZone0 = new MockZone(0, 0, 0);
      Chronology chronology0 = readableIntervalConverter0.getChronology((Object) integer0, (DateTimeZone) mockZone0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullConverter nullConverter0 = NullConverter.INSTANCE;
      Object object0 = new Object();
      Chronology chronology0 = nullConverter0.getChronology(object0, (Chronology) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ReadablePartialConverter readablePartialConverter0 = new ReadablePartialConverter();
      PeriodType periodType0 = readablePartialConverter0.getPeriodType("Converter[org.joda.time.ReadablePartial]");
      assertEquals(8, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getPartialValues((ReadablePartial) null, (Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.AbstractConverter", e);
      }
  }
}