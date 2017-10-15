/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:30:54 GMT 2017
 */

package org.springside.modules.utils.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.springside.modules.utils.io.URLResourceUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class URLResourceUtil_ESTest extends URLResourceUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URI uRI0 = URLResourceUtil.toURI("WN:SfAb");
      assertNull(uRI0.getHost());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URI uRI0 = URLResourceUtil.toURI("classpath:/5#/");
      assertEquals("classpath:/5#/", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = URLResourceUtil.asFile("...");
      assertEquals("...", file0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = URLResourceUtil.asFile("");
      assertEquals("", file0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/springside4/modules/utils/target/classes");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "N9f^j@S#;s!q5aZW<F");
      File file0 = URLResourceUtil.asFile("classpath://");
      assertEquals("/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/springside4/modules/utils/target/classes", file0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        URLResourceUtil.toURI("classpath://");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected authority at index 12: classpath://
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        URLResourceUtil.toURI((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        URLResourceUtil.asStream("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        URLResourceUtil.asFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InputStream inputStream0 = URLResourceUtil.asStream("classpath://");
      assertEquals(4, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        URLResourceUtil.asStream("classpath:/5#/");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URLResourceUtil uRLResourceUtil0 = new URLResourceUtil();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URI uRI0 = URLResourceUtil.toURI("");
      assertNull(uRI0.getScheme());
  }
}
