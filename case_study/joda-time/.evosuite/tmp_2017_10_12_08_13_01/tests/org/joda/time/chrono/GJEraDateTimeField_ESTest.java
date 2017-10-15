/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:24:31 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJEraDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJEraDateTimeField_ESTest extends GJEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.set((long) 0, "AD", (Locale) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.set((long) 1, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      long long0 = gJEraDateTimeField0.set(59000L, 0);
      assertEquals((-106412227141000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.roundHalfFloor((-42521587200000L));
      assertEquals((-42496790400000L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set((long) 1, "I", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"I\" for era is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set((long) 13141, (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set(30962844000000L, 2756);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2756 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set(821L, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundHalfEven((-1514L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundHalfCeiling(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundFloor(16123L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundCeiling((-1065L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.getAsText(3056, locale0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3056
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.get(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.roundFloor(1);
      assertEquals((-42496790400000L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.set(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      int int0 = gJEraDateTimeField0.get(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      int int0 = gJEraDateTimeField0.get((-8948526167203200000L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      long long0 = gJEraDateTimeField0.roundCeiling((-124271280003040L));
      assertEquals((-62135596800000L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.roundCeiling(0L);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      long long0 = gJEraDateTimeField0.roundFloor(9223372036854775807L);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      long long0 = gJEraDateTimeField0.set((long) 1, "AD", (Locale) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.set(9223372036854775807L, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      DurationField durationField0 = gJEraDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      long long0 = gJEraDateTimeField0.roundHalfCeiling(0L);
      assertEquals((-62135596800000L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      Locale locale0 = Locale.KOREAN;
      long long0 = gJEraDateTimeField0.set((long) 0, "\uAE30\uC6D0\uC804", locale0);
      assertEquals((-124334352000000L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      DurationField durationField0 = gJEraDateTimeField0.getDurationField();
      assertEquals("eras", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      int int0 = gJEraDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      int int0 = gJEraDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      long long0 = gJEraDateTimeField0.roundHalfEven((-2919L));
      assertEquals((-62135596800000L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      Locale locale0 = Locale.KOREAN;
      int int0 = gJEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      String string0 = gJEraDateTimeField0.getAsText(1, (Locale) null);
      assertEquals("AD", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      boolean boolean0 = gJEraDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      // Undeclared exception!
      try { 
        gJEraDateTimeField0.roundHalfFloor(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }
}
