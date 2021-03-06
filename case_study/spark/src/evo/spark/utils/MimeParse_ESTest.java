/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 15:49:55 GMT 2017
 */

package spark.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.eclipse.jetty.util.RegexSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.utils.MimeParse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MimeParse_ESTest extends MimeParse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        MimeParse.bestMatch(linkedList0, "N`ad*;+");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        MimeParse.bestMatch((Collection<String>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.MimeParse", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        MimeParse.bestMatch(linkedList0, ";");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("spark.utils.MimeParse", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegexSet regexSet0 = new RegexSet();
      regexSet0.add(";|=^!^90AJvEz");
      String string0 = MimeParse.bestMatch(regexSet0, ";|=^!^90AJvEz");
      assertEquals(";|=^!^90AJvEz", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegexSet regexSet0 = new RegexSet();
      regexSet0.add(";g=^!^9O0,");
      String string0 = MimeParse.bestMatch(regexSet0, "");
      assertEquals(";g=^!^9O0,", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegexSet regexSet0 = new RegexSet();
      regexSet0.add(";g=^!^9O0,");
      String string0 = MimeParse.bestMatch(regexSet0, ";g=^!^9O0,");
      assertEquals(";g=^!^9O0,", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegexSet regexSet0 = new RegexSet();
      regexSet0.add("sR<jP?J^45/\"#3");
      String string0 = MimeParse.bestMatch(regexSet0, "*");
      assertEquals("sR<jP?J^45/\"#3", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("*");
      linkedList0.add(")");
      String string0 = MimeParse.bestMatch(linkedList0, "?]-Do^\"/j/");
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("WFP:J^0cVL/3");
      linkedList0.add("WFP:J^0cVL/3");
      String string0 = MimeParse.bestMatch(linkedList0, "[WFP:J^0cVL/3, WFP:J^0cVL/3]");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("*");
      linkedList0.add(")");
      String string0 = MimeParse.bestMatch(linkedList0, ")");
      assertEquals(")", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegexSet regexSet0 = new RegexSet();
      // Undeclared exception!
      try { 
        MimeParse.bestMatch(regexSet0, ";)@c=Fi<\"j3(J&/=\u0004");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
