/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:34:08 GMT 2017
 */

package edu.illinois.starts.helpers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.helpers.FileUtil;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      MockFile mockFile0 = new MockFile("9T|PiRyWwQDi", "");
      File file0 = mockFile0.getAbsoluteFile();
      mockFile0.mkdir();
      File file1 = MockFile.createTempFile("00ZOL]C-8~", "%:g`'L)3nUbL", file0);
      FileUtil.delete(file1);
      FileUtil.delete(mockFile0);
      FileUtil.delete(file1);
      FileUtil.delete(file0);
      FileUtil.delete(file0);
      File file2 = mockFile0.getAbsoluteFile();
      FileUtil.delete(file2);
      MockFile mockFile1 = new MockFile("", "");
      // Undeclared exception!
      FileUtil.delete(mockFile1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        FileUtil.delete((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.helpers.FileUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("a2u,");
      FileUtil.delete(mockFile0);
      assertFalse(mockFile0.canExecute());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("*[okrlL/SgZnx^96xIz#");
      MockFile.createTempFile("*[okrlL/SgZnx^96xIz#", "*[okrlL/SgZnx^96xIz#", (File) mockFile0);
      FileUtil.delete(mockFile0);
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.lastModified());
  }
}
