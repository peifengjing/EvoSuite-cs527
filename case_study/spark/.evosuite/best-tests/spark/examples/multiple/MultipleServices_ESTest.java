/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:44:41 GMT 2017
 */

package spark.examples.multiple;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.examples.multiple.MultipleServices;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultipleServices_ESTest extends MultipleServices_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultipleServices multipleServices0 = new MultipleServices();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[6];
      MultipleServices.main(stringArray0);
  }
}