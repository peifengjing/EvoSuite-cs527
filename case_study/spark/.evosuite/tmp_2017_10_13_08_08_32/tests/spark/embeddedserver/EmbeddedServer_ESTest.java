/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:27:43 GMT 2017
 */

package spark.embeddedserver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import java.util.Optional;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.embeddedserver.jetty.EmbeddedJettyServer;
import spark.embeddedserver.jetty.JettyServerFactory;
import spark.embeddedserver.jetty.websocket.WebSocketHandlerWrapper;
import spark.ssl.SslStores;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedServer_ESTest extends EmbeddedServer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JettyServerFactory jettyServerFactory0 = mock(JettyServerFactory.class, new ViolatedAssumptionAnswer());
      Handler handler0 = mock(Handler.class, new ViolatedAssumptionAnswer());
      EmbeddedJettyServer embeddedJettyServer0 = new EmbeddedJettyServer(jettyServerFactory0, handler0);
      embeddedJettyServer0.extinguish();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JettyServerFactory jettyServerFactory0 = mock(JettyServerFactory.class, new ViolatedAssumptionAnswer());
      Handler handler0 = mock(Handler.class, new ViolatedAssumptionAnswer());
      EmbeddedJettyServer embeddedJettyServer0 = new EmbeddedJettyServer(jettyServerFactory0, handler0);
      embeddedJettyServer0.configureWebSockets((Map<String, WebSocketHandlerWrapper>) null, (Optional<Integer>) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JettyServerFactory jettyServerFactory0 = mock(JettyServerFactory.class, new ViolatedAssumptionAnswer());
      Handler handler0 = mock(Handler.class, new ViolatedAssumptionAnswer());
      EmbeddedJettyServer embeddedJettyServer0 = new EmbeddedJettyServer(jettyServerFactory0, handler0);
      int int0 = embeddedJettyServer0.activeThreadCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JettyServerFactory jettyServerFactory0 = mock(JettyServerFactory.class, new ViolatedAssumptionAnswer());
      Handler handler0 = mock(Handler.class, new ViolatedAssumptionAnswer());
      EmbeddedJettyServer embeddedJettyServer0 = new EmbeddedJettyServer(jettyServerFactory0, handler0);
      // Undeclared exception!
      try { 
        embeddedJettyServer0.join();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.embeddedserver.jetty.EmbeddedJettyServer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmbeddedJettyServer embeddedJettyServer0 = new EmbeddedJettyServer((JettyServerFactory) null, (Handler) null);
      SslStores sslStores0 = mock(SslStores.class, new ViolatedAssumptionAnswer());
      try { 
        embeddedJettyServer0.ignite("Z1C9/sQ^2vRE", (-1), sslStores0, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.embeddedserver.jetty.EmbeddedJettyServer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JettyServerFactory jettyServerFactory0 = mock(JettyServerFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Server) null).when(jettyServerFactory0).create(anyInt() , anyInt() , anyInt());
      Handler handler0 = mock(Handler.class, new ViolatedAssumptionAnswer());
      EmbeddedJettyServer embeddedJettyServer0 = new EmbeddedJettyServer(jettyServerFactory0, handler0);
      SslStores sslStores0 = mock(SslStores.class, new ViolatedAssumptionAnswer());
      try { 
        embeddedJettyServer0.ignite("", 0, sslStores0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'server' must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
}
