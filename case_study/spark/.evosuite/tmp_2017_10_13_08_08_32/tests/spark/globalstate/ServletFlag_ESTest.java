/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:26:09 GMT 2017
 */

package spark.globalstate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.globalstate.ServletFlag;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServletFlag_ESTest extends ServletFlag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = ServletFlag.isRunningFromServlet();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServletFlag.runFromServlet();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServletFlag servletFlag0 = new ServletFlag();
      assertFalse(servletFlag0.isRunningFromServlet());
  }
}
