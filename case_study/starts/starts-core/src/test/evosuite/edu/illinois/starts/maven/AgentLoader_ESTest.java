/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:25:26 GMT 2017
 */

package edu.illinois.starts.maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.maven.AgentLoader;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLStreamHandler;
import org.codehaus.classworlds.BytesURLStreamHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AgentLoader_ESTest extends AgentLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      BytesURLStreamHandler bytesURLStreamHandler0 = new BytesURLStreamHandler(byteArray0);
      URL uRL0 = MockURL.URL("org.apache.maven.plugin.surefire.SurefirePlugin", "", 1587, "yRv{5qnC}'9i(", (URLStreamHandler) bytesURLStreamHandler0);
      try { 
        AgentLoader.loadAgent(uRL0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in authority at index 50: org.apache.maven.plugin.surefire.surefireplugin://:1587yRv{5qnC}'9i(
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/tools.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      URL uRL0 = MockURL.getHttpExample();
      try { 
        AgentLoader.loadAgent(uRL0);
        fail("Expecting exception: InvocationTargetException");
      
      } catch(InvocationTargetException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = AgentLoader.loadDynamicAgent();
      boolean boolean1 = AgentLoader.loadDynamicAgent();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AgentLoader agentLoader0 = new AgentLoader();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      try { 
        AgentLoader.loadAgent((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }
}
