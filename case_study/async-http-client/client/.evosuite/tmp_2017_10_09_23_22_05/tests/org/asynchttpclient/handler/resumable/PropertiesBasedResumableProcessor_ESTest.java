/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 07:20:26 GMT 2017
 */

package org.asynchttpclient.handler.resumable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
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
      // Undeclared exception!
      try { 
        propertiesBasedResumableProcessor0.put((String) null, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
          Map<String, Long> map0 = propertiesBasedResumableProcessor0.load();
          propertiesBasedResumableProcessor0.save(map0);
          EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/ahc/ResumableAsyncHandler.properties");
          FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
          propertiesBasedResumableProcessor0.save(map0);
          assertTrue(map0.isEmpty());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      HashMap<String, Long> hashMap0 = new HashMap<String, Long>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      propertiesBasedResumableProcessor0.save(hashMap0);
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      HashMap<String, Long> hashMap0 = new HashMap<String, Long>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      propertiesBasedResumableProcessor0.save(hashMap0);
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      propertiesBasedResumableProcessor0.remove("javaio.t-pdir");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      propertiesBasedResumableProcessor0.remove((String) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PropertiesBasedResumableProcessor propertiesBasedResumableProcessor0 = new PropertiesBasedResumableProcessor();
      propertiesBasedResumableProcessor0.put("", 0L);
      Map<String, Long> map0 = propertiesBasedResumableProcessor0.load();
      assertFalse(map0.isEmpty());
  }
}