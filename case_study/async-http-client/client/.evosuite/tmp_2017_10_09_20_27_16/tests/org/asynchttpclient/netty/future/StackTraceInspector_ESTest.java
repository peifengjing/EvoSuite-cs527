/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 04:20:30 GMT 2017
 */

package org.asynchttpclient.netty.future;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.channels.ClosedChannelException;
import org.asynchttpclient.netty.future.StackTraceInspector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackTraceInspector_ESTest extends StackTraceInspector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException("checkConnect");
      MockThrowable mockThrowable0 = new MockThrowable();
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      mockIOException0.initCause(mockThrowable0);
      boolean boolean0 = StackTraceInspector.recoverOnReadOrWriteException(mockIOException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException("checkConnect");
      MockThrowable mockThrowable0 = new MockThrowable();
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      mockIOException0.initCause(mockThrowable0);
      boolean boolean0 = StackTraceInspector.recoverOnNettyDisconnectException(mockIOException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        StackTraceInspector.recoverOnReadOrWriteException((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.future.StackTraceInspector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        StackTraceInspector.recoverOnNettyDisconnectException((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.future.StackTraceInspector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClosedChannelException closedChannelException0 = new ClosedChannelException();
      boolean boolean0 = StackTraceInspector.recoverOnReadOrWriteException(closedChannelException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      MockThrowable mockThrowable0 = new MockThrowable("Insensitive", mockIOException0);
      StackTraceElement stackTraceElement0 = new StackTraceElement("sun.nio.ch.SocketDispatcher", "Gt)QM", "sun.nio.ch.SocketDispatcher", 139);
      mockThrowable0.setOriginForDelegate(stackTraceElement0);
      boolean boolean0 = StackTraceInspector.recoverOnReadOrWriteException(mockThrowable0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException("Connection reset by peer");
      boolean boolean0 = StackTraceInspector.recoverOnReadOrWriteException(mockIOException0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClosedChannelException closedChannelException0 = new ClosedChannelException();
      boolean boolean0 = StackTraceInspector.recoverOnNettyDisconnectException(closedChannelException0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      MockThrowable mockThrowable0 = new MockThrowable("Insensitive", mockIOException0);
      MockThrowable mockThrowable1 = new MockThrowable("sun.nio.ch.SocketChannelImpl", mockThrowable0);
      boolean boolean0 = StackTraceInspector.recoverOnNettyDisconnectException(mockThrowable1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException("Connection reset by peer");
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[3];
      StackTraceElement stackTraceElement0 = new StackTraceElement("org.eclipse.jetty.util.component.AbstractLifeCycle", "connection reset by peer", "y4U]1H-_", (-1));
      stackTraceElementArray0[0] = stackTraceElement0;
      stackTraceElementArray0[1] = stackTraceElement0;
      StackTraceElement stackTraceElement1 = new StackTraceElement("io.netty.handler.ssl.SslHandler", "Connection reset by peer", "org.eclipse.jetty.util.component.AbstractLifeCycle", 0);
      stackTraceElementArray0[2] = stackTraceElement1;
      mockIOException0.setStackTrace(stackTraceElementArray0);
      boolean boolean0 = StackTraceInspector.recoverOnNettyDisconnectException(mockIOException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackTraceInspector stackTraceInspector0 = new StackTraceInspector();
  }
}
