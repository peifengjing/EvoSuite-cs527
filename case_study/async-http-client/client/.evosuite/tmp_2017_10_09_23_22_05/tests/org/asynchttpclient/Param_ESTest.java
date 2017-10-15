/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 07:12:39 GMT 2017
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
      Param param0 = new Param("v", "v");
      String string0 = param0.getValue();
      assertEquals("v", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Param param0 = new Param("", "");
      String string0 = param0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      String string0 = param0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Param param0 = new Param("pE+#ZJQTo9%", "pE+#ZJQTo9%");
      String string0 = param0.getName();
      assertEquals("pE+#ZJQTo9%", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("", (List<String>) null);
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
  public void test05()  throws Throwable  {
      Param param0 = new Param("v", "v");
      Param param1 = new Param("v", "s");
      boolean boolean0 = param0.equals(param1);
      assertFalse(boolean0);
      assertEquals("v", param1.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      Param param1 = new Param((String) null, "WatchKey not recognized: {}");
      boolean boolean0 = param0.equals(param1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Param param0 = new Param("v", "v");
      Param param1 = new Param("s", "v");
      boolean boolean0 = param0.equals(param1);
      assertFalse(boolean0);
      assertEquals("v", param1.getValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      Param param1 = new Param("o.nme", (String) null);
      boolean boolean0 = param0.equals(param1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      Param param1 = new Param((String) null, (String) null);
      boolean boolean0 = param0.equals(param1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Param param0 = new Param("os.name", "os.name");
      Param param1 = new Param("os.name", "os.name");
      boolean boolean0 = param0.equals(param1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      boolean boolean0 = param0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Param param0 = new Param("os.name", "os.name");
      boolean boolean0 = param0.equals(param0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Param param0 = new Param("os.name", "os.name");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      List<Param> list0 = Param.map2ParamList(hashMap0);
      boolean boolean0 = param0.equals(list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Param param0 = new Param((String) null, (String) null);
      param0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Param param0 = new Param("os.name", "os.name");
      param0.hashCode();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("os.name");
      hashMap0.put("os.name", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Param> list0 = Param.map2ParamList((Map<String, List<String>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Param param0 = new Param("\"Vx916{^$i<", (String) null);
      String string0 = param0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Param param0 = new Param("", "$b+YdpK0jy*x1:");
      String string0 = param0.getName();
      assertEquals("$b+YdpK0jy*x1:", param0.getValue());
      assertEquals("", string0);
  }
}
