/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:32:55 GMT 2017
 */

package spark.ssl;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.ssl.SslStores;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SslStores_ESTest extends SslStores_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, (String) null, (String) null, (String) null, true);
      sslStores0.trustStorePassword();
      assertTrue(sslStores0.needsClientCert());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SslStores sslStores0 = SslStores.create("4OtZ", "4OtZ", "4OtZ", "4OtZ");
      sslStores0.truststorePassword = "";
      sslStores0.trustStorePassword();
      assertEquals("", sslStores0.trustStorePassword());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SslStores sslStores0 = SslStores.create("0-N1lMj1rq4fOc*m", "0-N1lMj1rq4fOc*m", "0-N1lMj1rq4fOc*m", "", false);
      String string0 = sslStores0.trustStoreFile();
      assertEquals("", sslStores0.trustStorePassword());
      assertEquals("0-N1lMj1rq4fOc*m", sslStores0.keystorePassword());
      assertFalse(sslStores0.needsClientCert());
      assertEquals("0-N1lMj1rq4fOc*m", string0);
      assertEquals("0-N1lMj1rq4fOc*m", sslStores0.keystoreFile());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, (String) null, "", (String) null);
      String string0 = sslStores0.trustStoreFile();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = sslStores0.needsClientCert();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, (String) null, (String) null, (String) null, true);
      sslStores0.keystorePassword();
      assertTrue(sslStores0.needsClientCert());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, "", "", "doRq1");
      String string0 = sslStores0.keystorePassword();
      assertNotNull(string0);
      assertEquals("", sslStores0.trustStoreFile());
      assertEquals("doRq1", sslStores0.trustStorePassword());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SslStores sslStores0 = SslStores.create("", "", "", "");
      String string0 = sslStores0.keystoreFile();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SslStores sslStores0 = SslStores.create("", "", "", "utqql8U;", false);
      assertEquals("", sslStores0.keystoreFile());
      
      sslStores0.keystoreFile = "a-$'M$Lv03a6}Ej:om";
      String string0 = sslStores0.keystoreFile();
      assertEquals("a-$'M$Lv03a6}Ej:om", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, (String) null, (String) null, (String) null, true);
      sslStores0.trustStoreFile();
      assertTrue(sslStores0.needsClientCert());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, "fHM,E#go*TjW|*iR", "", "fHM,E#go*TjW|*iR", true);
      String string0 = sslStores0.keystorePassword();
      assertNotNull(string0);
      assertTrue(sslStores0.needsClientCert());
      assertEquals("fHM,E#go*TjW|*iR", string0);
      assertEquals("", sslStores0.trustStoreFile());
      assertEquals("fHM,E#go*TjW|*iR", sslStores0.trustStorePassword());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SslStores sslStores0 = SslStores.create("4OtZ", "4OtZ", "4OtZ", "4OtZ");
      String string0 = sslStores0.trustStorePassword();
      assertEquals("4OtZ", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SslStores sslStores0 = SslStores.create("", "", "", "Z", true);
      boolean boolean0 = sslStores0.needsClientCert();
      assertTrue(boolean0);
      assertEquals("Z", sslStores0.trustStorePassword());
      assertEquals("", sslStores0.keystoreFile());
      assertEquals("", sslStores0.trustStoreFile());
      assertEquals("", sslStores0.keystorePassword());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SslStores sslStores0 = SslStores.create((String) null, (String) null, (String) null, "");
      String string0 = sslStores0.keystoreFile();
      assertNull(string0);
  }
}
