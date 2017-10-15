/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:19:17 GMT 2017
 */

package spark.examples.websocket;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.jetty.websocket.api.RemoteEndpoint;
import org.eclipse.jetty.websocket.api.Session;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.examples.websocket.PingWebSocket;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PingWebSocket_ESTest extends PingWebSocket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PingWebSocket pingWebSocket0 = new PingWebSocket();
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((RemoteEndpoint) null).when(session0).getRemote();
      pingWebSocket0.connected(session0);
      // Undeclared exception!
      try { 
        pingWebSocket0.message("PING");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.examples.websocket.PingWebSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PingWebSocket pingWebSocket0 = new PingWebSocket();
      pingWebSocket0.message("S<`oc)I>R|");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PingWebSocket pingWebSocket0 = new PingWebSocket();
      pingWebSocket0.closed((-2014282406), "=");
  }
}
