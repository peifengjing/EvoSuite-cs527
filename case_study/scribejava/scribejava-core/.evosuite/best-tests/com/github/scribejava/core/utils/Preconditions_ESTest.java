/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 02:30:14 GMT 2017
 */

package com.github.scribejava.core.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.utils.Preconditions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Preconditions_ESTest extends Preconditions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Preconditions.checkEmptyString("h", "h");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = Preconditions.hasText(" O&~oY`*7#OPt");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = Preconditions.hasText("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = Preconditions.hasText(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean boolean0 = Preconditions.hasText((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Preconditions.checkNotNull("", "");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkNotNull((Object) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Received an invalid parameter
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkEmptyString(" ", "Receive jfnvalCd armetey");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Receive jfnvalCd armetey
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }
}
