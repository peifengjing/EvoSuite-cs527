/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:15:17 GMT 2017
 */

package org.asynchttpclient.ws;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.ws.WebSocketUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketUtils_ESTest extends WebSocketUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = WebSocketUtils.sha1(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = WebSocketUtils.md5(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = WebSocketUtils.createRandomNumber(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = WebSocketUtils.createRandomNumber((-3417), (-4384));
      assertEquals((-3417), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        WebSocketUtils.createRandomBytes((-4384));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.ws.WebSocketUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = WebSocketUtils.createRandomBytes(16);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = WebSocketUtils.createRandomBytes(0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = WebSocketUtils.createRandomNumber(2357, 2357);
      assertEquals(2357, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        WebSocketUtils.sha1((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        WebSocketUtils.md5((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WebSocketUtils.getKey();
      assertEquals("ABkzTGZ/mbLM5QAZM0xmfw==", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WebSocketUtils webSocketUtils0 = new WebSocketUtils();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = WebSocketUtils.getAcceptKey("SHA-1 not supported on this platform");
      assertEquals("FKD0PJk2p/jEcmzZ0ADemxzJpco=", string0);
  }
}
