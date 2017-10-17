/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:16:04 GMT 2017
 */

package org.asynchttpclient;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.asynchttpclient.Param;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Param_ESTest extends Param_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      String string0 = param0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Param param0 = new Param("QfH~6e}g95", "QfH~6e}g95");
      String string0 = param0.getValue();
      assertEquals("QfH~6e}g95", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      String string0 = param0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Param param0 = new Param("", "");
      String string0 = param0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Param param0 = new Param("QfH~6e}g95", "QfH~6e}g95");
      Param param1 = new Param("QfH~6e}g95", "QfH~6e}g95");
      boolean boolean0 = param0.equals(param1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      Param param1 = new Param((String) null, (String) null);
      boolean boolean0 = param0.equals(param1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Param param0 = new Param("G", "G");
      Param param1 = new Param("I", "G");
      boolean boolean0 = param0.equals(param1);
      assertEquals("G", param1.getValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      Param param1 = new Param("O[vv:6K4P.nJX{", (String) null);
      boolean boolean0 = param0.equals(param1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      Param param1 = new Param((String) null, "");
      boolean boolean0 = param0.equals(param1);
      assertFalse(boolean0);
      assertFalse(param1.equals((Object)param0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Param param0 = new Param("FuS ", "ErER");
      Param param1 = new Param("FuS ", "FuS ");
      boolean boolean0 = param0.equals(param1);
      assertFalse(boolean0);
      assertEquals("FuS ", param0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Param param0 = new Param("QfH~6e}g95", "QfH~6e}g95");
      boolean boolean0 = param0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      boolean boolean0 = param0.equals(param0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Param param0 = new Param("Exclude Predicate", "Exclude Predicate");
      boolean boolean0 = param0.equals("Exclude Predicate");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      param0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Param param0 = new Param("FuS ", "ErER");
      param0.hashCode();
      assertEquals("ErER", param0.getValue());
      assertEquals("FuS ", param0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("`#9-wz)}0|");
      hashMap0.putIfAbsent("", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      hashMap0.putIfAbsent("", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("j;$NZ)%!A)[i", (List<String>) null);
      // Undeclared exception!
      try { 
        Param.map2ParamList(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.Param", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Param> list0 = Param.map2ParamList((Map<String, List<String>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Param param0 = new Param("", "");
      String string0 = param0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Param param0 = new Param("A<S=NE{V(6cG{gizv", "");
      String string0 = param0.getName();
      assertEquals("A<S=NE{V(6cG{gizv", string0);
      assertEquals("", param0.getValue());
  }
}