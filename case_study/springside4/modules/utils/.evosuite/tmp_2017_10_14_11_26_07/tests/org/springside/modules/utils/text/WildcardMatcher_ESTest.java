/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 19:27:10 GMT 2017
 */

package org.springside.modules.utils.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.text.WildcardMatcher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WildcardMatcher_ESTest extends WildcardMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "}Hp";
      stringArray0[1] = "**";
      int int0 = WildcardMatcher.matchPathOne("|d\"6pzSp=", stringArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String[] stringArray1 = new String[3];
      stringArray1[0] = "**";
      // Undeclared exception!
      try { 
        WildcardMatcher.matchTokens(stringArray0, stringArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      int int0 = WildcardMatcher.matchPathOne("!", stringArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "**";
      int int0 = WildcardMatcher.matchOne("**", stringArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.match("y-2r_z7|s:m]", "10.4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        WildcardMatcher.matchPathOne("Vm,8", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        WildcardMatcher.matchPath((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "**";
      stringArray0[1] = "/";
      stringArray0[2] = "**";
      stringArray0[4] = "**";
      String[] stringArray1 = new String[1];
      stringArray1[0] = "\"tL-']iqzE";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray1, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "}Hp";
      stringArray0[1] = "**";
      stringArray0[2] = "**";
      stringArray0[3] = "**";
      stringArray0[4] = "TKx=J?^E+*$O";
      stringArray0[5] = "+4";
      stringArray0[6] = "/MS@dC{o-";
      stringArray0[7] = "}Hp";
      stringArray0[8] = "+4";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "f:|/*";
      stringArray0[1] = "f:|/*";
      String[] stringArray1 = new String[7];
      stringArray1[0] = "f:|/*";
      stringArray1[1] = "**";
      stringArray1[2] = "f:|/*";
      stringArray1[6] = "f:|/*";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.matchPath("10.4", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String[] stringArray1 = new String[5];
      stringArray1[0] = "*+";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "10.4";
      stringArray0[1] = "10.4";
      stringArray0[2] = "10.4";
      int int0 = WildcardMatcher.matchPathOne("Object varargs must not be null", stringArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.matchPath("bJCG%Y>?8fw", "*+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "}Hp";
      stringArray0[1] = "**";
      int int0 = WildcardMatcher.matchOne("**", stringArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "**";
      stringArray0[1] = "";
      stringArray0[2] = "**";
      stringArray0[3] = "";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "}[nrL$8Ueu";
      stringArray0[1] = "*]z*";
      int int0 = WildcardMatcher.matchOne("", stringArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "33L6\";1VSsc(";
      // Undeclared exception!
      try { 
        WildcardMatcher.matchOne("", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.matchPath("f:|/*", "f:|/*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.matchPath("", "**");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        WildcardMatcher.match((CharSequence) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WildcardMatcher wildcardMatcher0 = new WildcardMatcher();
  }
}
