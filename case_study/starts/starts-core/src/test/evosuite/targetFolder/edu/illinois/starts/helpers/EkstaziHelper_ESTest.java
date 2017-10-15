/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:24:34 GMT 2017
 */

package edu.illinois.starts.helpers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.helpers.EkstaziHelper;
import edu.illinois.starts.util.Pair;
import java.io.File;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EkstaziHelper_ESTest extends EkstaziHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      MockFile mockFile0 = new MockFile("|uY%3u}", "");
      Pair<Set<String>, Set<String>> pair0 = EkstaziHelper.getNonAffectedTests((File) mockFile0);
      assertNotNull(pair0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/starts/starts-core/_/not-first-run.clz");
      FileSystemHandling.createFolder(evoSuiteFile0);
      EkstaziHelper.lineSeparator = "(uX";
      // Undeclared exception!
      try { 
        EkstaziHelper.getNonAffectedTests("_");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 3
         // (uX
         //    ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/starts/starts-core/_/not-first-run.clz");
      FileSystemHandling.createFolder(evoSuiteFile0);
      EkstaziHelper.lineSeparator = null;
      // Undeclared exception!
      try { 
        EkstaziHelper.getNonAffectedTests("_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        EkstaziHelper.getNonAffectedTests((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.helpers.EkstaziHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Pair<Set<String>, Set<String>> pair0 = EkstaziHelper.getNonAffectedTests("");
      assertNull(pair0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/starts/starts-core/_/not-first-run.clz");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Pair<Set<String>, Set<String>> pair0 = EkstaziHelper.getNonAffectedTests("_");
      assertNotNull(pair0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Pair<Set<String>, Set<String>> pair0 = EkstaziHelper.getNonAffectedTests((File) mockFile0);
      assertNotNull(pair0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EkstaziHelper ekstaziHelper0 = new EkstaziHelper();
  }
}
