/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:21:01 GMT 2017
 */

package org.springside.modules.utils.concurrent.throttle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.concurrent.throttle.Sampler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sampler_ESTest extends Sampler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sampler.NeverSampler sampler_NeverSampler0 = new Sampler.NeverSampler();
      boolean boolean0 = sampler_NeverSampler0.select();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sampler sampler0 = new Sampler();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sampler.create((Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.concurrent.throttle.Sampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double(1.0);
      Sampler sampler0 = Sampler.create(double0);
      boolean boolean0 = sampler0.select();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double(0.0);
      Sampler sampler0 = Sampler.create(double0);
      assertFalse(sampler0.select());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Double double0 = new Double(100.0);
      Sampler sampler0 = Sampler.create(double0);
      assertTrue(sampler0.select());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = new Double(4047.8573497032);
      // Undeclared exception!
      try { 
        Sampler.create(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid selectPercent value: 4047.8573497032
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Sampler sampler0 = new Sampler(100.0);
      boolean boolean0 = sampler0.select();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Sampler sampler0 = null;
      try {
        sampler0 = new Sampler((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid selectPercent value: -1.0
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Sampler.AlwaysSampler sampler_AlwaysSampler0 = new Sampler.AlwaysSampler();
      boolean boolean0 = sampler_AlwaysSampler0.select();
      assertTrue(boolean0);
  }
}
