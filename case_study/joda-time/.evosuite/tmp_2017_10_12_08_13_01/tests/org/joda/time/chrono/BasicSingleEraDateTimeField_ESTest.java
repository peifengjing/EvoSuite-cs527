/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 20:44:09 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationField;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicSingleEraDateTimeField_ESTest extends BasicSingleEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("FR?+MEq!n");
      Locale locale0 = Locale.CHINESE;
      long long0 = basicSingleEraDateTimeField0.set((-541L), "FR?+MEq!n", locale0);
      assertEquals((-541L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("\uFFFD \uFFFD/6");
      long long0 = basicSingleEraDateTimeField0.set(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("06_U?.4xSqDrP32");
      long long0 = basicSingleEraDateTimeField0.set((-2287L), 1);
      assertEquals((-2287L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.JAPAN;
      int int0 = basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("`Rz0Ly~/{");
      Locale locale0 = new Locale("`Rz0Ly~/{", "`Rz0Ly~/{");
      int int0 = basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.ITALY;
      String string0 = basicSingleEraDateTimeField0.getAsText((-863), locale0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("(aFq}6bLN{VEuQ");
      Locale locale0 = Locale.GERMANY;
      String string0 = basicSingleEraDateTimeField0.getAsText(99, locale0);
      assertEquals("(aFq}6bLN{VEuQ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set(60000L, (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set((long) (-863), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for era must be in the range [1,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.JAPAN;
      String string0 = basicSingleEraDateTimeField0.getAsText(3012, locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("77M7");
      long long0 = basicSingleEraDateTimeField0.roundFloor(1175378400000L);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      int int0 = basicSingleEraDateTimeField0.get((-4098L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set(9223372036854775807L, "\u65E5\u672C\u8A9E (\u65E5\u672C)", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\u65E5\u672C\u8A9E (\u65E5\u672C)\" for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.JAPAN;
      long long0 = basicSingleEraDateTimeField0.set((long) 3012, "1", locale0);
      assertEquals(3012L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Asia/Gaza");
      Locale locale0 = Locale.ENGLISH;
      long long0 = basicSingleEraDateTimeField0.set(0L, "Asia/Gaza", locale0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Oi5]KF n?c\"0CF81 a");
      long long0 = basicSingleEraDateTimeField0.set(3256L, 1);
      assertEquals(3256L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Oi5]KF n?c\"0CF81 a");
      int int0 = basicSingleEraDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Oi5]KF n?c\"0CF81 a");
      long long0 = basicSingleEraDateTimeField0.roundHalfCeiling(1);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("\uFFFD \uFFFD/6");
      int int0 = basicSingleEraDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.roundHalfEven(3012L);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Oi5]KF n?c\"0CF81 a");
      DurationField durationField0 = basicSingleEraDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.roundCeiling(0L);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      long long0 = basicSingleEraDateTimeField0.roundHalfFloor(1);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("\uFFFD \uFFFD/6");
      DurationField durationField0 = basicSingleEraDateTimeField0.getDurationField();
      assertFalse(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("\uFFFD \uFFFD/6");
      boolean boolean0 = basicSingleEraDateTimeField0.isLenient();
      assertFalse(boolean0);
  }
}