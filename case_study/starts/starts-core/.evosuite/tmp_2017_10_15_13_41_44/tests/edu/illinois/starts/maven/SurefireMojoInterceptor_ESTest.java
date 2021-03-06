/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:31:27 GMT 2017
 */

package edu.illinois.starts.maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.maven.SurefireMojoInterceptor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SurefireMojoInterceptor_ESTest extends SurefireMojoInterceptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        SurefireMojoInterceptor.execute((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.maven.SurefireMojoInterceptor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SurefireMojoInterceptor surefireMojoInterceptor0 = new SurefireMojoInterceptor();
      SurefireMojoInterceptor.execute(surefireMojoInterceptor0);
  }
}
