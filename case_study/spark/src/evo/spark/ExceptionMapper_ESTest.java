/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 16:48:43 GMT 2017
 */

package spark;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import spark.ExceptionHandlerImpl;
import spark.ExceptionMapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExceptionMapper_ESTest extends ExceptionMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExceptionMapper exceptionMapper0 = new ExceptionMapper();
      // Undeclared exception!
      try { 
        exceptionMapper0.getHandler((Class<? extends Exception>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.ExceptionMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExceptionMapper exceptionMapper0 = ExceptionMapper.getInstance();
      MockException mockException0 = new MockException();
      Class<Exception> class0 = Exception.class;
      exceptionMapper0.getHandler(class0);
      ExceptionHandlerImpl exceptionHandlerImpl0 = exceptionMapper0.getHandler((Exception) mockException0);
      assertNull(exceptionHandlerImpl0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExceptionMapper exceptionMapper0 = ExceptionMapper.getInstance();
      Class<Exception> class0 = Exception.class;
      exceptionMapper0.getHandler(class0);
      ExceptionHandlerImpl exceptionHandlerImpl0 = exceptionMapper0.getHandler(class0);
      assertNull(exceptionHandlerImpl0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExceptionMapper exceptionMapper0 = ExceptionMapper.getInstance();
      ExceptionMapper exceptionMapper1 = ExceptionMapper.getInstance();
      assertSame(exceptionMapper1, exceptionMapper0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExceptionMapper exceptionMapper0 = ExceptionMapper.getInstance();
      // Undeclared exception!
      try { 
        exceptionMapper0.getHandler((Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.ExceptionMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExceptionMapper exceptionMapper0 = ExceptionMapper.getInstance();
      Class<Exception> class0 = Exception.class;
      exceptionMapper0.map(class0, (ExceptionHandlerImpl) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExceptionMapper exceptionMapper0 = ExceptionMapper.getInstance();
      exceptionMapper0.clear();
  }
}