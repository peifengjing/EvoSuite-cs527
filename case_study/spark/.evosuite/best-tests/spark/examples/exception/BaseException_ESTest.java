/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:45:00 GMT 2017
 */

package spark.examples.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.examples.exception.BaseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseException_ESTest extends BaseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseException baseException0 = new BaseException();
  }
}
