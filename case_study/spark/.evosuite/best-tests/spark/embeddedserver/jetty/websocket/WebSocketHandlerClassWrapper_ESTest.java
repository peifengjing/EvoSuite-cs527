/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:26:55 GMT 2017
 */

package spark.embeddedserver.jetty.websocket;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.embeddedserver.jetty.websocket.WebSocketHandlerClassWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketHandlerClassWrapper_ESTest extends WebSocketHandlerClassWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebSocketHandlerClassWrapper webSocketHandlerClassWrapper0 = null;
      try {
        webSocketHandlerClassWrapper0 = new WebSocketHandlerClassWrapper((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // WebSocket handler class cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      WebSocketHandlerClassWrapper webSocketHandlerClassWrapper0 = null;
      try {
        webSocketHandlerClassWrapper0 = new WebSocketHandlerClassWrapper(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // WebSocket handler must implement 'WebSocketListener' or be annotated as '@WebSocket'
         //
         verifyException("spark.embeddedserver.jetty.websocket.WebSocketHandlerWrapper", e);
      }
  }
}