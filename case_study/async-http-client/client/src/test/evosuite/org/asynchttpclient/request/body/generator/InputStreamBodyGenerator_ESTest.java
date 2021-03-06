/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:32:40 GMT 2017
 */

package org.asynchttpclient.request.body.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import java.io.InputStream;
import org.asynchttpclient.request.body.Body;
import org.asynchttpclient.request.body.generator.InputStreamBodyGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InputStreamBodyGenerator_ESTest extends InputStreamBodyGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(":sUCN[YKWT~+s?'w3#").when(inputStream0).toString();
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator(inputStream0);
      inputStreamBodyGenerator0.getInputStream();
      assertEquals((-1L), inputStreamBodyGenerator0.getContentLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null, 0L);
      long long0 = inputStreamBodyGenerator0.getContentLength();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null, 1L);
      Body body0 = inputStreamBodyGenerator0.createBody();
      assertEquals(1L, body0.getContentLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null, 1L);
      inputStreamBodyGenerator0.getInputStream();
      assertEquals(1L, inputStreamBodyGenerator0.getContentLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator(inputStream0);
      long long0 = inputStreamBodyGenerator0.getContentLength();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null, 1L);
      long long0 = inputStreamBodyGenerator0.getContentLength();
      assertEquals(1L, long0);
  }
}
