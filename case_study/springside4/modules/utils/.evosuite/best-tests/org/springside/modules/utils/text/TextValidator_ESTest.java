/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:23:08 GMT 2017
 */

package org.springside.modules.utils.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.text.TextValidator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextValidator_ESTest extends TextValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = TextValidator.isUrl(":v<Y\neVrjj|3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = TextValidator.isTel("000000");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = TextValidator.isMobileSimple("13000000000");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = TextValidator.isMobileExact("13000000000");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = TextValidator.isIp("0.0.0.0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = TextValidator.isEmail("$BgIgkc");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = TextValidator.isDate("1200-02-29");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(3348);
      stringBuilder0.append(1.0);
      // Undeclared exception!
      try { 
        TextValidator.isMatch((Pattern) null, stringBuilder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.TextValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", (-487));
      boolean boolean0 = TextValidator.isMatch(pattern0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pattern pattern0 = Pattern.compile(":v<Y\neVrjj|3", (-40));
      boolean boolean0 = TextValidator.isMatch(pattern0, "A://\u0000");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("$BgIgkc", 1496);
      boolean boolean0 = TextValidator.isMatch(pattern0, "$BgIgkc");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("100000100000000000");
      boolean boolean0 = TextValidator.isIdCard(stringBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = TextValidator.isIdCard("0@0.0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = TextValidator.isIdCard("100000100000000");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = TextValidator.isMobileExact("0@0.0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = TextValidator.isMobileSimple("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextValidator textValidator0 = new TextValidator();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = TextValidator.isIp("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = TextValidator.isTel("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = TextValidator.isDate("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = TextValidator.isUrl("A://\u0000");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = TextValidator.isEmail("0@0.0");
      assertTrue(boolean0);
  }
}
