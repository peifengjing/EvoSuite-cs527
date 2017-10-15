/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:17:10 GMT 2017
 */

package com.github.scribejava.core.services;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.services.DatatypeConverterEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatatypeConverterEncoder_ESTest extends DatatypeConverterEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      DatatypeConverterEncoder datatypeConverterEncoder0 = new DatatypeConverterEncoder();
      String string0 = datatypeConverterEncoder0.encode(byteArray0);
      assertEquals("AAAAAAAAAAAAAAAAAAAAAAAA", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DatatypeConverterEncoder datatypeConverterEncoder0 = new DatatypeConverterEncoder();
      // Undeclared exception!
      try { 
        datatypeConverterEncoder0.encode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.xml.bind.DatatypeConverterImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatatypeConverterEncoder datatypeConverterEncoder0 = new DatatypeConverterEncoder();
      String string0 = datatypeConverterEncoder0.getType();
      assertEquals("DatatypeConverter", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DatatypeConverterEncoder datatypeConverterEncoder0 = new DatatypeConverterEncoder();
      byte[] byteArray0 = new byte[0];
      String string0 = datatypeConverterEncoder0.encode(byteArray0);
      assertEquals("", string0);
  }
}
