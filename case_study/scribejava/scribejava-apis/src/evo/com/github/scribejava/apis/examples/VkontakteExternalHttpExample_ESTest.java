/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 05:23:04 GMT 2017
 */

package com.github.scribejava.apis.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.apis.examples.VkontakteExternalHttpExample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VkontakteExternalHttpExample_ESTest extends VkontakteExternalHttpExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try { 
        VkontakteExternalHttpExample.main(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.GlobalEventExecutor
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }
}
