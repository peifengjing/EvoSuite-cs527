/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:10:38 GMT 2017
 */

package org.asynchttpclient.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.util.Assertions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Assertions_ESTest extends Assertions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assertions.assertNotEmpty("", "[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // empty [
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assertions.assertNotEmpty((String) null, "empty ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // empty 
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = Assertions.assertNotEmpty("$@C", "4MBYH0$4");
      assertEquals("$@C", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assertions.assertNotNull((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = Assertions.assertNotNull(object0, "pYn|7lF? !gB,fd");
      assertSame(object1, object0);
  }
}