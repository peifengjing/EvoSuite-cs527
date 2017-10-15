/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 21:25:47 GMT 2017
 */

package org.springside.jmh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.jmh.EnumMapTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnumMapTest_ESTest extends EnumMapTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnumMapTest enumMapTest0 = new EnumMapTest();
      enumMapTest0.setup();
      Integer integer0 = enumMapTest0.hashMapWithStringKey();
      assertEquals(13, (int)integer0);
      assertEquals(13, (int)enumMapTest0.enumMap());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnumMapTest enumMapTest0 = new EnumMapTest();
      enumMapTest0.setup();
      Integer integer0 = enumMapTest0.hashMapWithEnumKey();
      assertEquals(13, (int)integer0);
      assertEquals(13, (int)enumMapTest0.hashMapWithStringKey());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EnumMapTest enumMapTest0 = new EnumMapTest();
      // Undeclared exception!
      try { 
        enumMapTest0.hashMapWithEnumKey();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.jmh.EnumMapTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EnumMapTest enumMapTest0 = new EnumMapTest();
      // Undeclared exception!
      try { 
        enumMapTest0.hashMapWithStringKey();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.jmh.EnumMapTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EnumMapTest enumMapTest0 = new EnumMapTest();
      // Undeclared exception!
      try { 
        enumMapTest0.enumMap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.jmh.EnumMapTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EnumMapTest enumMapTest0 = new EnumMapTest();
      enumMapTest0.setup();
      Integer integer0 = enumMapTest0.enumMap();
      assertEquals(13, (int)integer0);
      assertEquals(13, (int)enumMapTest0.hashMapWithStringKey());
  }
}
