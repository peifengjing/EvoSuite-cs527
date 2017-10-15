/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 07:40:14 GMT 2017
 */

package org.asynchttpclient.oauth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.oauth.Parameter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parameter_ESTest extends Parameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parameter parameter0 = new Parameter("", "");
      Parameter parameter1 = new Parameter("", "lVpVV3264>5CAqCqXR");
      int int0 = parameter0.compareTo(parameter1);
      assertEquals((-18), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameter parameter0 = new Parameter("*`%<jJM4", "");
      int int0 = parameter0.compareTo(parameter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameter parameter0 = new Parameter("y'!WR16h#", "y'!WR16h#");
      parameter0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameter parameter0 = new Parameter("", "!YJ0=cx^{Wf");
      Parameter parameter1 = new Parameter("=", "=!YJ0=cx^{Wf");
      int int0 = parameter1.compareTo(parameter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parameter parameter0 = new Parameter("", "!YJ0=cx^{Wf");
      Parameter parameter1 = new Parameter((String) null, "");
      // Undeclared exception!
      try { 
        parameter0.compareTo(parameter1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parameter parameter0 = new Parameter("b)F'{G;gUGSL{W:VuP@", "b)F'{G;gUGSL{W:VuP@");
      Parameter parameter1 = new Parameter("b)F'{G;gUGSL{W:VuP@", "b)F'{G;gUGSL{W:VuP@");
      boolean boolean0 = parameter0.equals(parameter1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameter parameter0 = new Parameter("RMw|s|XzhF\"H", "=");
      Parameter parameter1 = new Parameter("RMw|s|XzhF\"H", "?");
      boolean boolean0 = parameter0.equals(parameter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameter parameter0 = new Parameter("", "!YJ0=cx^{Wf");
      Parameter parameter1 = new Parameter("=", "=!YJ0=cx^{Wf");
      boolean boolean0 = parameter0.equals(parameter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parameter parameter0 = new Parameter("", (String) null);
      Parameter parameter1 = new Parameter("", "");
      // Undeclared exception!
      try { 
        parameter0.equals(parameter1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameter parameter0 = new Parameter("y'!WR16h#", "y'!WR16h#");
      boolean boolean0 = parameter0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameter parameter0 = new Parameter("<", "<");
      boolean boolean0 = parameter0.equals(parameter0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameter parameter0 = new Parameter("", "");
      Object object0 = new Object();
      boolean boolean0 = parameter0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameter parameter0 = new Parameter("", "!YJ0=cx^{Wf");
      Parameter parameter1 = new Parameter("=", "=!YJ0=cx^{Wf");
      int int0 = parameter0.compareTo(parameter1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parameter parameter0 = new Parameter("", (String) null);
      String string0 = parameter0.toString();
      assertEquals("=null", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parameter parameter0 = new Parameter("z]D6%:d#8q=IXI", (String) null);
      // Undeclared exception!
      try { 
        parameter0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.oauth.Parameter", e);
      }
  }
}