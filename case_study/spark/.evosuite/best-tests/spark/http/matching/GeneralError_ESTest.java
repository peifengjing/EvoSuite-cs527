/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:14:10 GMT 2017
 */

package spark.http.matching;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import spark.http.matching.Body;
import spark.http.matching.GeneralError;
import spark.http.matching.RequestWrapper;
import spark.http.matching.ResponseWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeneralError_ESTest extends GeneralError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockException mockException0 = new MockException();
      ResponseWrapper responseWrapper0 = ResponseWrapper.create();
      Body body0 = Body.create();
      // Undeclared exception!
      try { 
        GeneralError.modify((HttpServletRequest) null, (HttpServletResponse) null, body0, (RequestWrapper) null, responseWrapper0, mockException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.http.matching.GeneralError", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GeneralError generalError0 = new GeneralError();
  }
}