/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 21:19:53 GMT 2017
 */

package org.springside.modules.metrics.metric;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.metrics.metric.TimerMetric;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimerMetric_ESTest extends TimerMetric_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimerMetric timerMetric0 = new TimerMetric();
      String string0 = timerMetric0.toString();
      assertEquals("TimerMetric [counterMetric=null, histogramMetric=null]", string0);
  }
}
