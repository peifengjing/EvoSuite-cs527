/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:36:42 GMT 2017
 */

package org.springside.modules.utils.base;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.base.Platforms;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Platforms_ESTest extends Platforms_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Platforms.getPid();
      assertEquals(83704, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Platforms platforms0 = new Platforms();
      assertFalse(Platforms.IS_JAVA7);
  }
}