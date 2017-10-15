/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 21:18:26 GMT 2017
 */

package org.springside.modules.metrics.metric;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.metrics.metric.CounterMetric;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CounterMetric_ESTest extends CounterMetric_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CounterMetric counterMetric0 = new CounterMetric();
      counterMetric0.latestRate = 1L;
      String string0 = counterMetric0.toString();
      assertEquals("CounterMetric [totalCount=0, avgRate=0, latestCount=0, latestRate=1]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CounterMetric counterMetric0 = new CounterMetric();
      counterMetric0.totalCount = (-996L);
      String string0 = counterMetric0.toString();
      assertEquals("CounterMetric [totalCount=-996, avgRate=0, latestCount=0, latestRate=0]", string0);
  }
}
