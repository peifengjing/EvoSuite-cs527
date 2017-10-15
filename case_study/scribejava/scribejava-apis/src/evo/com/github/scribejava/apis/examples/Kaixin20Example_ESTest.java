/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 06:21:34 GMT 2017
 */

package com.github.scribejava.apis.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.examples.Kaixin20Example;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kaixin20Example_ESTest extends Kaixin20Example_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[5];
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://api.kaixin001.com/oauth2/access_token?client_id=your%20api%20key&client_secret=your%20api%20secret&code=%3Cy%297LC6%280j%7Bp8%28%29&redirect_uri=http%3A%2F%2Fyour.domain.com%2Fhandle&grant_type=authorization_code");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7?Gmn2srI)\"-");
      SystemInUtil.addInputLine("<y)7LC6(0j{p8()");
      // Undeclared exception!
      try { 
        Kaixin20Example.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract a '\"access_token\"\\s*:\\s*\"(\\S*?)\"' from this: '7?Gmn2srI)\"-'
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SystemInUtil.addInputLine("<y)7LC6(0j{p8()");
      // Undeclared exception!
      try { 
        Kaixin20Example.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Response body is incorrect. Can't extract a token from an empty string
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        Kaixin20Example.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }
}