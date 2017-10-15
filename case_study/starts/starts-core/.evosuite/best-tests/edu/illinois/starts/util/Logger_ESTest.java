/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:34:52 GMT 2017
 */

package edu.illinois.starts.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.util.Logger;
import java.util.logging.Level;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Logger_ESTest extends Logger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      MockThrowable mockThrowable0 = new MockThrowable("edu.illinois.starts.util.Logger");
      // Undeclared exception!
      try { 
        logger0.log((Level) null, ";Bp_newYQeMf!", (Throwable) mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.util.Logger", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Logger logger0 = new Logger();
      // Undeclared exception!
      try { 
        logger0.log((Level) null, "k$kq-*yW");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.util.Logger", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Logger logger0 = new Logger();
      Level level0 = logger0.getLoggingLevel();
      logger0.log(level0, "/&F%N");
      assertEquals("CONFIG", level0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Logger logger0 = new Logger();
      Level level0 = logger0.getLoggingLevel();
      MockThrowable mockThrowable0 = new MockThrowable();
      logger0.log(level0, "/&F%N", (Throwable) mockThrowable0);
      assertEquals(700, level0.intValue());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      Level level0 = logger0.getLoggingLevel();
      logger0.setLoggingLevel(level0);
      assertEquals("CONFIG", level0.toString());
  }
}
