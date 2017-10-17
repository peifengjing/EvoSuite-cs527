/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:23:00 GMT 2017
 */

package org.asynchttpclient.handler.resumable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.asynchttpclient.handler.resumable.PropertiesBasedResumableProcessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertiesBasedResumableProcessor_ESTest extends PropertiesBasedResumableProcessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      propertiesBasedResumableProcessor0.put("Bw+,!:MpDFG5B}fIv", 21L);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
          Map<String, Long> map0 = propertiesBasedResumableProcessor0.load();
          propertiesBasedResumableProcessor0.save(map0);
          EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/ahc/ResumableAsyncHandler.properties");
          boolean boolean0 = FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
          assertTrue(boolean0);
          
          propertiesBasedResumableProcessor0.save(map0);
          assertEquals(2, map0.size());
          assertFalse(map0.isEmpty());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      FileSystemHandling.shouldAllThrowIOExceptions();
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      propertiesBasedResumableProcessor0.save((Map<String, Long>) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/ahc");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Bw+,!:MpDFG5B}fIv");
      Map<String, Long> map0 = propertiesBasedResumableProcessor0.load();
      propertiesBasedResumableProcessor0.save(map0);
      assertEquals(2, map0.size());
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      propertiesBasedResumableProcessor0.remove("Bw+,!:MpDFG5B}fIv");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      propertiesBasedResumableProcessor0.remove((String) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      // Undeclared exception!
      try { 
        propertiesBasedResumableProcessor0.put((String) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }
}