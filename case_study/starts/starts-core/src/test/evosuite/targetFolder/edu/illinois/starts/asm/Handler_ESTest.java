/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:27:10 GMT 2017
 */

package edu.illinois.starts.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.asm.Handler;
import edu.illinois.starts.asm.Label;
import edu.illinois.starts.asm.MethodWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Handler_ESTest extends Handler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Label label0 = new Label();
      Handler handler0 = new Handler();
      handler0.start = label0;
      handler0.end = label0;
      Label label1 = new Label();
      byte[] byteArray0 = new byte[0];
      label1.resolve((MethodWriter) null, 1, byteArray0);
      Handler handler1 = Handler.remove(handler0, label1, (Label) null);
      assertSame(handler0, handler1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Label label0 = new Label();
      Handler handler0 = new Handler();
      handler0.start = label0;
      handler0.end = label0;
      Label label1 = new Label();
      Handler handler1 = Handler.remove(handler0, label0, label1);
      assertSame(handler0, handler1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Label label0 = new Label();
      Handler handler0 = Handler.remove((Handler) null, label0, label0);
      assertNull(handler0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Handler handler0 = new Handler();
      // Undeclared exception!
      try { 
        Handler.remove(handler0, (Label) null, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Handler", e);
      }
  }
}
