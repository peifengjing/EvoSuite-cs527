/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 06:27:57 GMT 2017
 */

package com.github.scribejava.apis.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.examples.VkontakteExample;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VkontakteExample_ESTest extends VkontakteExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://oauth.vk.com/access_token?client_id=your%20client%20id&client_secret=your%20client%20secret&code=&redirect_uri=http%3A%2F%2Fyour.site.com%2Fcallback&scope=wall%2Coffline&grant_type=authorization_code");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "J\"IbQT+?fH` 0");
      SystemInUtil.addInputLine("");
      // Undeclared exception!
      try { 
        VkontakteExample.main((String[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract a '\"access_token\"\\s*:\\s*\"(\\S*?)\"' from this: 'J\"IbQT+?fH` 0'
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("");
      // Undeclared exception!
      try { 
        VkontakteExample.main((String[]) null);
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
      // Undeclared exception!
      try { 
        VkontakteExample.main((String[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }
}
