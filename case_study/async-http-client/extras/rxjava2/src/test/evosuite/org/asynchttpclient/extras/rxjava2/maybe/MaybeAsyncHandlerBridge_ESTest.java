/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 02:27:58 GMT 2017
 */

package org.asynchttpclient.extras.rxjava2.maybe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.reactivex.MaybeEmitter;
import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.extras.rxjava2.maybe.MaybeAsyncHandlerBridge;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaybeAsyncHandlerBridge_ESTest extends MaybeAsyncHandlerBridge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MaybeEmitter<Integer> maybeEmitter0 = (MaybeEmitter<Integer>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      MaybeAsyncHandlerBridge<Integer> maybeAsyncHandlerBridge0 = null;
      try {
        maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<Integer>(maybeEmitter0, (AsyncHandler<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MaybeEmitter<MockHijrahDate> maybeEmitter0 = (MaybeEmitter<MockHijrahDate>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      AsyncHandler<MockHijrahDate> asyncHandler0 = (AsyncHandler<MockHijrahDate>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(asyncHandler0).toString();
      MaybeAsyncHandlerBridge<MockHijrahDate> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<MockHijrahDate>(maybeEmitter0, asyncHandler0);
      AsyncHandler<? extends MockHijrahDate> asyncHandler1 = maybeAsyncHandlerBridge0.delegate();
      assertNotNull(asyncHandler1);
  }
}
