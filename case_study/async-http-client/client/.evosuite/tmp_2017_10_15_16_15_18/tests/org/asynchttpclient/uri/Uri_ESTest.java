/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 23:37:33 GMT 2017
 */

package org.asynchttpclient.uri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.asynchttpclient.uri.Uri;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Uri_ESTest extends Uri_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Uri uri0 = new Uri("G`;Y", "G`;Y", "G`;Y", (-1478), "G`;Y", "G`;Y");
      String string0 = uri0.toBaseUrl();
      assertEquals("G`;Y", uri0.getUserInfo());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals("G`;Y://G`;Y:-1478G`;Y", string0);
      assertEquals("G`;Y", uri0.getQuery());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Uri uri0 = new Uri("http", "http", "http", 0, "http", "http");
      Uri uri1 = uri0.withNewScheme("J~o2|Alzz[!$sNfWs");
      assertEquals(80, uri1.getSchemeDefaultPort());
      assertEquals("http", uri1.getQuery());
      assertEquals("http", uri1.getHost());
      assertEquals("http", uri1.getPath());
      assertFalse(uri0.isWebSocket());
      assertEquals("J~o2|Alzz[!$sNfWs", uri1.getScheme());
      assertEquals(0, uri1.getPort());
      assertEquals("http", uri1.getUserInfo());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Uri uri0 = new Uri("/", "/", "/", (-173), "/", "/");
      Uri uri1 = uri0.withNewScheme("ws");
      assertEquals("/", uri1.getUserInfo());
      assertEquals("/", uri1.getPath());
      assertFalse(uri1.equals((Object)uri0));
      assertEquals((-173), uri1.getExplicitPort());
      assertEquals((-173), uri0.getExplicitPort());
      assertEquals("/", uri1.getHost());
      assertFalse(uri0.isWebSocket());
      assertEquals("/", uri1.getQuery());
      assertEquals(80, uri1.getSchemeDefaultPort());
      assertTrue(uri1.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      Uri uri1 = uri0.withNewScheme("wss");
      Uri uri2 = uri1.withNewQuery("");
      assertTrue(uri2.isWebSocket());
      assertEquals("", uri2.getPath());
      assertEquals("hkP?dfGNKE", uri2.getHost());
      assertEquals("", uri2.getQuery());
      assertEquals("hkP?dfGNKE", uri2.getUserInfo());
      assertFalse(uri0.isWebSocket());
      assertEquals(80, uri2.getExplicitPort());
      assertTrue(uri2.isSecured());
      assertEquals("hkP?dfGNKE", uri0.getScheme());
      assertEquals("hkP?dfGNKE", uri1.getQuery());
      assertFalse(uri0.isSecured());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Uri uri0 = new Uri("0[qYO,l ", (String) null, "org.asynchttpclient.util.StringBuilderPool", 0, "~)aBjrK$AjB&UUe95Pl", "org.asynchttpclient.util.StringBuilderPool");
      Uri uri1 = uri0.withNewQuery("0[qYO,l ");
      assertEquals("~)aBjrK$AjB&UUe95Pl", uri1.getPath());
      assertFalse(uri1.isWebSocket());
      assertEquals("0[qYO,l ", uri1.getQuery());
      assertEquals(0, uri1.getExplicitPort());
      assertEquals("0[qYO,l ", uri0.getScheme());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri1.getHost());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getQuery());
      assertEquals(80, uri1.getSchemeDefaultPort());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 0, (String) null, "k@H&/tJ]1k4");
      URI uRI0 = uri0.toJavaNetURI();
      assertEquals(443, uri0.getSchemeDefaultPort());
      assertEquals("wss://wss@wss:0?k@H&/tJ]1k4", uRI0.toString());
      assertTrue(uri0.isWebSocket());
      assertEquals("wss", uri0.getUserInfo());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      Uri uri1 = uri0.withNewScheme("wss");
      boolean boolean0 = uri1.isWebSocket();
      assertFalse(uri1.equals((Object)uri0));
      assertTrue(boolean0);
      assertFalse(uri0.isWebSocket());
      assertEquals("", uri1.getPath());
      assertEquals("hkP?dfGNKE", uri1.getHost());
      assertEquals("hkP?dfGNKE", uri1.getUserInfo());
      assertEquals(80, uri1.getPort());
      assertEquals("hkP?dfGNKE", uri1.getQuery());
      assertEquals(80, uri0.getPort());
      assertFalse(uri0.isSecured());
      assertEquals(443, uri1.getSchemeDefaultPort());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Uri uri0 = new Uri("https", "G`;Y://G`;Y:-1478G`;Y", "http", (-1478), "G`;Y", "ws");
      boolean boolean0 = uri0.isSecured();
      assertEquals("https", uri0.getScheme());
      assertEquals("http", uri0.getHost());
      assertEquals("G`;Y", uri0.getPath());
      assertFalse(uri0.isWebSocket());
      assertEquals("G`;Y://G`;Y:-1478G`;Y", uri0.getUserInfo());
      assertEquals("ws", uri0.getQuery());
      assertTrue(boolean0);
      assertEquals((-1478), uri0.getExplicitPort());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Uri uri0 = new Uri("0[qYO,l ", (String) null, "org.asynchttpclient.util.StringBuilderPool", 0, "~)aBjrK$AjB&UUe95Pl", "org.asynchttpclient.util.StringBuilderPool");
      String string0 = uri0.getUserInfo();
      assertEquals("~)aBjrK$AjB&UUe95Pl", uri0.getPath());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getHost());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getQuery());
      assertNull(string0);
      assertEquals(0, uri0.getPort());
      assertEquals("0[qYO,l ", uri0.getScheme());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Uri uri0 = new Uri("q2$S.", "", "http", (-1478), "TR2`^mz", "y=0mN[&_tvq(wrWk[");
      String string0 = uri0.getUserInfo();
      assertEquals("http", uri0.getHost());
      assertEquals((-1478), uri0.getExplicitPort());
      assertEquals("y=0mN[&_tvq(wrWk[", uri0.getQuery());
      assertFalse(uri0.isWebSocket());
      assertEquals("q2$S.", uri0.getScheme());
      assertEquals("TR2`^mz", uri0.getPath());
      assertEquals("", string0);
      assertEquals(80, uri0.getSchemeDefaultPort());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Uri uri0 = new Uri("org.asynchttpclient.util.StringBuilderPool", "org.asynchttpclient.util.StringBuilderPool", "org.asynchttpclient.util.StringBuilderPool", 0, "org.asynchttpclient.util.StringBuilderPool", "");
      Uri uri1 = Uri.create(uri0, "wss");
      String string0 = uri1.getQuery();
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri1.getScheme());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getPath());
      assertNull(string0);
      assertFalse(uri1.isWebSocket());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri1.getHost());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri1.getUserInfo());
      assertEquals("wss", uri1.getPath());
      assertEquals(0, uri1.getExplicitPort());
      assertFalse(uri1.isSecured());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Uri uri0 = new Uri("org.asynchttpclient.util.StringBuilderPool", "org.asynchttpclient.util.StringBuilderPool", "org.asynchttpclient.util.StringBuilderPool", 0, "org.asynchttpclient.util.StringBuilderPool", "");
      String string0 = uri0.getQuery();
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getUserInfo());
      assertEquals("", string0);
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getPath());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getHost());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getScheme());
      assertEquals(0, uri0.getExplicitPort());
      assertFalse(uri0.isSecured());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Uri uri0 = new Uri("org.asynchttpclient.util.StringBuilderPool", "org.asynchttpclient.util.StringBuilderPool", "SD", 0, "SD", "org.asynchttpclient.util.StringBuilderPool");
      int int0 = uri0.getPort();
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getQuery());
      assertEquals("SD", uri0.getPath());
      assertEquals("SD", uri0.getHost());
      assertFalse(uri0.isSecured());
      assertEquals(0, int0);
      assertFalse(uri0.isWebSocket());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getUserInfo());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getScheme());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Uri uri0 = new Uri("fK] aZA_1C&'P[", "PUuV62*", "PUuV62*", (-263), "", "mUF:eqX");
      int int0 = uri0.getPort();
      assertEquals("PUuV62*", uri0.getUserInfo());
      assertEquals("mUF:eqX", uri0.getQuery());
      assertEquals((-263), int0);
      assertEquals("fK] aZA_1C&'P[", uri0.getScheme());
      assertEquals("PUuV62*", uri0.getHost());
      assertFalse(uri0.isSecured());
      assertEquals("", uri0.getPath());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Uri uri0 = new Uri("org.asynchttpclient.util.StringBuilderPool", " 61J3;-&", "org.asynchttpclient.util.StringBuilderPool", 407, (String) null, " 61J3;-&");
      String string0 = uri0.getPath();
      assertFalse(uri0.isWebSocket());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getScheme());
      assertNull(string0);
      assertEquals(" 61J3;-&", uri0.getQuery());
      assertEquals(" 61J3;-&", uri0.getUserInfo());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals(407, uri0.getExplicitPort());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getHost());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Uri uri0 = new Uri("G", "host", "nL/=4R&y`w", 58, "org.asynchttpclient.util.StringBuilderPool", "f@|eNE[0J6Kji1");
      String string0 = uri0.getPath();
      assertEquals("org.asynchttpclient.util.StringBuilderPool", string0);
      assertEquals("nL/=4R&y`w", uri0.getHost());
      assertEquals("f@|eNE[0J6Kji1", uri0.getQuery());
      assertEquals("host", uri0.getUserInfo());
      assertEquals(58, uri0.getPort());
      assertEquals("G", uri0.getScheme());
      assertFalse(uri0.isWebSocket());
      assertFalse(uri0.isSecured());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Uri uri0 = new Uri("fK] aZA_1C&'P[", "PUuV62*", "PUuV62*", (-263), "", "mUF:eqX");
      int int0 = uri0.getExplicitPort();
      assertEquals("", uri0.getPath());
      assertEquals("PUuV62*", uri0.getUserInfo());
      assertEquals((-263), int0);
      assertEquals("PUuV62*", uri0.getHost());
      assertEquals("fK] aZA_1C&'P[", uri0.getScheme());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals("mUF:eqX", uri0.getQuery());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Uri uri0 = Uri.create("scheme://./scheme");
      assertEquals(80, uri0.getExplicitPort());
      assertFalse(uri0.isWebSocket());
      assertEquals(".", uri0.getHost());
      assertEquals("scheme", uri0.getScheme());
      assertEquals("/scheme", uri0.getPath());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Uri uri0 = Uri.create("wss://wss@wss:0?k@H&/tJ]1k4");
      assertEquals("wss", uri0.getScheme());
      assertEquals("", uri0.getPath());
      assertEquals(443, uri0.getSchemeDefaultPort());
      assertEquals(0, uri0.getPort());
      assertEquals("wss", uri0.getHost());
      assertEquals("k@H&/tJ]1k4", uri0.getQuery());
      assertTrue(uri0.isWebSocket());
      assertEquals("wss", uri0.getUserInfo());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Uri uri0 = new Uri("6i/D=yX{a !O}#qNP", "6i/D=yX{a !O}#qNP", "6i/D=yX{a !O}#qNP", 0, "6i/D=yX{a !O}#qNP", "6i/D=yX{a !O}#qNP");
      // Undeclared exception!
      try { 
        uri0.withNewScheme((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // scheme
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Uri uri0 = new Uri("C5MaV xAc#@", "C5MaV xAc#@", "C5MaV xAc#@", 512, "", "");
      // Undeclared exception!
      try { 
        uri0.withNewScheme("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // empty scheme
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Uri uri0 = new Uri("G", "host", "nL/=4R&y`w", 58, "org.asynchttpclient.util.StringBuilderPool", "f@|eNE[0J6Kji1");
      try { 
        uri0.toJavaNetURI();
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 17: G://host@nL/=4R&y`w:58org.asynchttpclient.util.StringBuilderPool?f@|eNE[0J6Kji1
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Uri uri0 = new Uri("org.asynchttpclient.util.StringBuilderPool", "org.asynchttpclient.util.StringBuilderPool", "org.asynchttpclient.util.StringBuilderPool", 0, "org.asynchttpclient.util.StringBuilderPool", "");
      // Undeclared exception!
      try { 
        Uri.create(uri0, "orginalUri://orginalUri:-1478orginalUri");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-1478orginalUri\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Uri uri0 = new Uri("0[qYO,l ", (String) null, "org.asynchttpclient.util.StringBuilderPool", 0, "~)aBjrK$AjB&UUe95Pl", "org.asynchttpclient.util.StringBuilderPool");
      // Undeclared exception!
      try { 
        Uri.create(uri0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // orginalUri
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Uri.create("orginalUri://orginalUri@orginalUri:-1478orginalUri?orginalUri");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-1478orginalUri\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Uri.create((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // orginalUri
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Uri uri0 = null;
      try {
        uri0 = new Uri((String) null, (String) null, "", 58, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // scheme
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Uri uri0 = null;
      try {
        uri0 = new Uri("", "", "", (-1505), "", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // empty scheme
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Uri uri0 = new Uri("Invalid authority field: ", "true", "true", 0, "Invalid authority field: ", (String) null);
      String string0 = uri0.toUrl();
      assertFalse(uri0.isWebSocket());
      assertEquals("Invalid authority field: ://true@true:0Invalid authority field: ", string0);
      assertEquals(80, uri0.getSchemeDefaultPort());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 0, (String) null, "k@H&/tJ]1k4");
      String string0 = uri0.toUrl();
      assertTrue(uri0.isWebSocket());
      assertEquals(443, uri0.getSchemeDefaultPort());
      assertEquals("wss://wss@wss:0?k@H&/tJ]1k4", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Uri uri0 = new Uri("c?](SLw)-~;zk03", "c?](SLw)-~;zk03", "c?](SLw)-~;zk03", 0, "c?](SLw)-~;zk03", "");
      URI uRI0 = uri0.toJavaNetURI();
      assertEquals("c", uRI0.getRawPath());
      
      uri0.toUrl();
      assertEquals("", uri0.getQuery());
      assertEquals("c?](SLw)-~;zk03", uri0.getUserInfo());
      assertFalse(uri0.isSecured());
      assertEquals(0, uri0.getPort());
      assertFalse(uri0.isWebSocket());
      assertEquals("c?](SLw)-~;zk03", uri0.getHost());
      assertEquals("c?](SLw)-~;zk03", uri0.getPath());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Uri uri0 = new Uri("//", "//", "//", (-2013794621), "//", "//");
      int int0 = uri0.getSchemeDefaultPort();
      assertEquals("//", uri0.getPath());
      assertEquals("//", uri0.getQuery());
      assertFalse(uri0.isWebSocket());
      assertEquals("//", uri0.getHost());
      assertEquals("//", uri0.getUserInfo());
      assertEquals(80, int0);
      assertEquals("//", uri0.getScheme());
      assertEquals((-2013794621), uri0.getExplicitPort());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Uri uri0 = new Uri("ws", "://", "/", (-2485), "://", "&,F%1&KtwrA");
      assertEquals("&,F%1&KtwrA", uri0.getQuery());
      assertEquals("://", uri0.getPath());
      assertEquals("ws", uri0.getScheme());
      assertTrue(uri0.isWebSocket());
      assertEquals((-2485), uri0.getExplicitPort());
      assertEquals("://", uri0.getUserInfo());
      assertFalse(uri0.isSecured());
      assertEquals("/", uri0.getHost());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Uri.create((Uri) null, "8_|UR9iLACmK.M!bd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8_|UR9iLACmK.M!bd could not be parsed into a proper Uri, missing scheme
         //
         verifyException("org.asynchttpclient.uri.Uri", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Uri uri0 = new Uri("G", "host", "nL/=4R&y`w", 58, "org.asynchttpclient.util.StringBuilderPool", "f@|eNE[0J6Kji1");
      String string0 = uri0.getScheme();
      assertFalse(uri0.isWebSocket());
      assertFalse(uri0.isSecured());
      assertEquals("f@|eNE[0J6Kji1", uri0.getQuery());
      assertEquals("nL/=4R&y`w", uri0.getHost());
      assertEquals("host", uri0.getUserInfo());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getPath());
      assertEquals("G", string0);
      assertEquals(58, uri0.getExplicitPort());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Uri uri0 = new Uri("org.asynchttpclient.util.StringBuilderPool", " 61J3;-&", "org.asynchttpclient.util.StringBuilderPool", 407, (String) null, " 61J3;-&");
      String string0 = uri0.getQuery();
      assertNotNull(string0);
      assertFalse(uri0.isWebSocket());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getScheme());
      assertEquals(" 61J3;-&", uri0.getUserInfo());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getHost());
      assertEquals(" 61J3;-&", string0);
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals(407, uri0.getPort());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Uri uri0 = new Uri("G", "host", "nL/=4R&y`w", 58, "org.asynchttpclient.util.StringBuilderPool", "f@|eNE[0J6Kji1");
      int int0 = uri0.getPort();
      assertEquals("f@|eNE[0J6Kji1", uri0.getQuery());
      assertEquals("host", uri0.getUserInfo());
      assertEquals("nL/=4R&y`w", uri0.getHost());
      assertFalse(uri0.isWebSocket());
      assertEquals("G", uri0.getScheme());
      assertFalse(uri0.isSecured());
      assertEquals(58, int0);
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getPath());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Uri uri0 = new Uri("G", "host", "nL/=4R&y`w", 58, "org.asynchttpclient.util.StringBuilderPool", "f@|eNE[0J6Kji1");
      String string0 = uri0.getHost();
      assertEquals("nL/=4R&y`w", string0);
      assertEquals(58, uri0.getPort());
      assertEquals("f@|eNE[0J6Kji1", uri0.getQuery());
      assertEquals("org.asynchttpclient.util.StringBuilderPool", uri0.getPath());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals("host", uri0.getUserInfo());
      assertFalse(uri0.isWebSocket());
      assertEquals("G", uri0.getScheme());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      boolean boolean0 = uri0.isSecured();
      assertEquals("hkP?dfGNKE", uri0.getQuery());
      assertFalse(boolean0);
      assertEquals("hkP?dfGNKE", uri0.getUserInfo());
      assertFalse(uri0.isWebSocket());
      assertEquals("", uri0.getPath());
      assertEquals("hkP?dfGNKE", uri0.getHost());
      assertEquals("hkP?dfGNKE", uri0.getScheme());
      assertEquals(80, uri0.getExplicitPort());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      String string0 = uri0.getUserInfo();
      assertEquals("hkP?dfGNKE", uri0.getQuery());
      assertEquals("hkP?dfGNKE", uri0.getScheme());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals("hkP?dfGNKE", uri0.getHost());
      assertEquals("", uri0.getPath());
      assertEquals("hkP?dfGNKE", string0);
      assertFalse(uri0.isWebSocket());
      assertEquals(80, uri0.getPort());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      String string0 = uri0.getPath();
      assertEquals("hkP?dfGNKE", uri0.getUserInfo());
      assertEquals(80, uri0.getExplicitPort());
      assertEquals("hkP?dfGNKE", uri0.getHost());
      assertEquals("hkP?dfGNKE", uri0.getQuery());
      assertFalse(uri0.isWebSocket());
      assertEquals("", string0);
      assertEquals("hkP?dfGNKE", uri0.getScheme());
      assertFalse(uri0.isSecured());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Uri uri0 = new Uri(":h;Y", (String) null, ":h;Y", 0, ":h;Y", ":h;Y");
      Uri uri1 = Uri.create(uri0, "");
      boolean boolean0 = uri1.equals(uri0);
      assertEquals(80, uri1.getSchemeDefaultPort());
      assertEquals(":h;Y", uri1.getPath());
      assertTrue(boolean0);
      assertEquals(":h;Y", uri1.getHost());
      assertFalse(uri1.isWebSocket());
      assertEquals(":h;Y", uri1.getScheme());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Uri uri0 = new Uri("//", "//", "//", (-1478), "//", "//");
      Uri uri1 = Uri.create(uri0, "");
      boolean boolean0 = uri1.equals(uri0);
      assertEquals("//", uri1.getHost());
      assertTrue(boolean0);
      assertEquals("//", uri1.getUserInfo());
      assertEquals("//", uri1.getQuery());
      assertEquals("//", uri1.getPath());
      assertEquals(80, uri1.getSchemeDefaultPort());
      assertEquals("//", uri1.getScheme());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      Uri uri1 = uri0.withNewScheme("wss://wss@wss:454");
      boolean boolean0 = uri0.equals(uri1);
      assertEquals("wss", uri1.getUserInfo());
      assertTrue(uri0.isWebSocket());
      assertEquals(454, uri0.getExplicitPort());
      assertEquals(454, uri1.getExplicitPort());
      assertFalse(uri1.isWebSocket());
      assertFalse(boolean0);
      assertEquals("wss", uri1.getHost());
      assertEquals(80, uri1.getSchemeDefaultPort());
      assertTrue(uri0.isSecured());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Uri uri0 = new Uri("/", "/", "/", (-173), "/", "/");
      Uri uri1 = Uri.create(uri0, "wss");
      Uri uri2 = uri1.withNewQuery("https");
      boolean boolean0 = uri1.equals(uri2);
      assertEquals("/", uri2.getHost());
      assertEquals("/", uri2.getScheme());
      assertEquals("https", uri2.getQuery());
      assertEquals("/wss", uri2.getPath());
      assertEquals("/", uri2.getUserInfo());
      assertEquals(80, uri2.getSchemeDefaultPort());
      assertFalse(boolean0);
      assertFalse(uri2.equals((Object)uri1));
      assertFalse(uri2.isWebSocket());
      assertEquals((-173), uri2.getExplicitPort());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Uri uri0 = new Uri("=}M<BV~b'%t_iSzt", (String) null, "=}M<BV~b'%t_iSzt", 35, (String) null, "=}M<BV~b'%t_iSzt");
      Uri uri1 = Uri.create(uri0, "ws");
      boolean boolean0 = uri0.equals(uri1);
      assertEquals(35, uri1.getExplicitPort());
      assertFalse(boolean0);
      assertEquals("=}M<BV~b'%t_iSzt", uri1.getHost());
      assertEquals("=}M<BV~b'%t_iSzt", uri1.getScheme());
      assertEquals("=}M<BV~b'%t_iSzt", uri0.getQuery());
      assertFalse(uri1.isSecured());
      assertEquals("/ws", uri1.getPath());
      assertEquals(35, uri0.getExplicitPort());
      assertFalse(uri1.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Uri uri0 = new Uri("=}M<BV~b'%t_iSzt", (String) null, "=}M<BV~b'%t_iSzt", 35, (String) null, "=}M<BV~b'%t_iSzt");
      Uri uri1 = uri0.withNewQuery("https");
      boolean boolean0 = uri0.equals(uri1);
      assertFalse(boolean0);
      assertEquals(80, uri1.getSchemeDefaultPort());
      assertEquals("https", uri1.getQuery());
      assertEquals("=}M<BV~b'%t_iSzt", uri1.getScheme());
      assertFalse(uri1.isWebSocket());
      assertEquals("=}M<BV~b'%t_iSzt", uri1.getHost());
      assertEquals(35, uri1.getExplicitPort());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Uri uri0 = new Uri("G`;Y", "G`;Y", "G`;Y", (-1478), "G`;Y", "G`;Y");
      Uri uri1 = new Uri("https", "G`;Y://G`;Y:-1478G`;Y", "http", (-1478), "G`;Y", "ws");
      boolean boolean0 = uri1.equals(uri0);
      assertEquals("http", uri1.getHost());
      assertEquals("G`;Y", uri0.getScheme());
      assertEquals("G`;Y://G`;Y:-1478G`;Y", uri1.getUserInfo());
      assertFalse(boolean0);
      assertFalse(uri1.isWebSocket());
      assertEquals("G`;Y", uri1.getPath());
      assertEquals("G`;Y", uri0.getHost());
      assertEquals((-1478), uri1.getExplicitPort());
      assertEquals("ws", uri1.getQuery());
      assertEquals(443, uri1.getSchemeDefaultPort());
      assertFalse(uri0.isSecured());
      assertEquals("https", uri1.getScheme());
      assertEquals("G`;Y", uri0.getQuery());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      boolean boolean0 = uri0.equals((Object) null);
      assertEquals("", uri0.getPath());
      assertEquals("hkP?dfGNKE", uri0.getHost());
      assertFalse(boolean0);
      assertFalse(uri0.isWebSocket());
      assertEquals("hkP?dfGNKE", uri0.getUserInfo());
      assertFalse(uri0.isSecured());
      assertEquals("hkP?dfGNKE", uri0.getScheme());
      assertEquals("hkP?dfGNKE", uri0.getQuery());
      assertEquals(80, uri0.getPort());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Uri uri0 = new Uri("R`;Y", "R`;Y", "R`;Y", (-1476), "R`;Y", "R`;Y");
      boolean boolean0 = uri0.equals(uri0);
      assertFalse(uri0.isWebSocket());
      assertEquals("R`;Y", uri0.getScheme());
      assertEquals("R`;Y", uri0.getUserInfo());
      assertEquals("R`;Y", uri0.getHost());
      assertFalse(uri0.isSecured());
      assertEquals("R`;Y", uri0.getQuery());
      assertEquals("R`;Y", uri0.getPath());
      assertTrue(boolean0);
      assertEquals((-1476), uri0.getPort());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Uri uri0 = new Uri("c?](SLw)-~;zk03", "c?](SLw)-~;zk03", "c?](SLw)-~;zk03", 0, "c?](SLw)-~;zk03", "");
      Object object0 = new Object();
      boolean boolean0 = uri0.equals(object0);
      assertEquals("c?](SLw)-~;zk03", uri0.getScheme());
      assertFalse(uri0.isWebSocket());
      assertFalse(boolean0);
      assertEquals(0, uri0.getExplicitPort());
      assertEquals("", uri0.getQuery());
      assertEquals("c?](SLw)-~;zk03", uri0.getUserInfo());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals("c?](SLw)-~;zk03", uri0.getPath());
      assertEquals("c?](SLw)-~;zk03", uri0.getHost());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Uri uri0 = new Uri("=}M<BV~b'%t_iSzt", (String) null, "=}M<BV~b'%t_iSzt", 35, (String) null, "=}M<BV~b'%t_iSzt");
      uri0.hashCode();
      assertEquals(35, uri0.getPort());
      assertFalse(uri0.isWebSocket());
      assertFalse(uri0.isSecured());
      assertEquals("=}M<BV~b'%t_iSzt", uri0.getQuery());
      assertEquals("=}M<BV~b'%t_iSzt", uri0.getHost());
      assertEquals("=}M<BV~b'%t_iSzt", uri0.getScheme());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      uri0.hashCode();
      assertEquals("wss", uri0.getScheme());
      assertEquals("wss", uri0.getHost());
      assertTrue(uri0.isWebSocket());
      assertEquals("wss", uri0.getUserInfo());
      assertEquals(443, uri0.getSchemeDefaultPort());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Uri uri0 = new Uri("scheme", "org.asynchttpclient.uri.Uri", "./", (-1), "scheme", "ws");
      uri0.hashCode();
      assertEquals("ws", uri0.getQuery());
      assertEquals("scheme", uri0.getScheme());
      assertEquals(80, uri0.getExplicitPort());
      assertEquals("./", uri0.getHost());
      assertEquals("scheme", uri0.getPath());
      assertEquals("org.asynchttpclient.uri.Uri", uri0.getUserInfo());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Uri uri0 = new Uri("scheme", "org.asynchttpclient.uri.Uri", "./", (-1), "scheme", "ws");
      String string0 = uri0.toRelativeUrl();
      assertEquals("org.asynchttpclient.uri.Uri", uri0.getUserInfo());
      assertEquals("./", uri0.getHost());
      assertEquals("scheme?ws", string0);
      assertFalse(uri0.isWebSocket());
      assertEquals(80, uri0.getExplicitPort());
      assertEquals("scheme", uri0.getScheme());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      String string0 = uri0.toRelativeUrl();
      assertEquals("wss", uri0.getUserInfo());
      assertTrue(uri0.isWebSocket());
      assertEquals(454, uri0.getExplicitPort());
      assertEquals("/", string0);
      assertEquals("wss", uri0.getHost());
      assertTrue(uri0.isSecured());
      assertEquals("wss", uri0.getScheme());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      String string0 = uri0.toBaseUrl();
      assertFalse(uri0.isWebSocket());
      assertEquals("hkP?dfGNKE", uri0.getQuery());
      assertEquals("hkP?dfGNKE", uri0.getUserInfo());
      assertEquals("hkP?dfGNKE://hkP?dfGNKE", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      String string0 = uri0.toBaseUrl();
      assertTrue(uri0.isWebSocket());
      assertEquals("wss://wss:454", string0);
      assertEquals(443, uri0.getSchemeDefaultPort());
      assertEquals("wss", uri0.getUserInfo());
      assertTrue(uri0.isSecured());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Uri uri0 = new Uri("scheme", "org.asynchttpclient.uri.Uri", "./", (-1), "scheme", "ws");
      String string0 = uri0.toBaseUrl();
      assertEquals("ws", uri0.getQuery());
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertEquals("scheme://./scheme", string0);
      assertEquals("org.asynchttpclient.uri.Uri", uri0.getUserInfo());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Uri uri0 = new Uri("scheme", "org.asynchttpclient.uri.Uri", "./", (-1), "scheme", "ws");
      String string0 = uri0.toUrl();
      assertEquals("scheme://org.asynchttpclient.uri.Uri@./scheme?ws", string0);
      assertNotNull(string0);
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertFalse(uri0.isWebSocket());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Uri uri0 = new Uri("o]Xcg@R", (String) null, "o]Xcg@R", (-2559), "", "N<<-e|qP7l3/VQ%[fz");
      String string0 = uri0.toUrl();
      assertEquals(80, uri0.getSchemeDefaultPort());
      assertFalse(uri0.isWebSocket());
      assertEquals("o]Xcg@R://o]Xcg@R:-2559?N<<-e|qP7l3/VQ%[fz", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      int int0 = uri0.getSchemeDefaultPort();
      assertEquals("wss", uri0.getHost());
      assertEquals("wss", uri0.getUserInfo());
      assertTrue(uri0.isWebSocket());
      assertEquals("wss", uri0.getScheme());
      assertTrue(uri0.isSecured());
      assertEquals(454, uri0.getExplicitPort());
      assertEquals(443, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 0, (String) null, "k@H&/tJ]1k4");
      int int0 = uri0.getExplicitPort();
      assertTrue(uri0.isWebSocket());
      assertTrue(uri0.isSecured());
      assertEquals("wss", uri0.getScheme());
      assertEquals("k@H&/tJ]1k4", uri0.getQuery());
      assertEquals("wss", uri0.getUserInfo());
      assertEquals(0, int0);
      assertEquals("wss", uri0.getHost());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Uri uri0 = new Uri("//", "//", "//", (-2013794621), "//", "//");
      // Undeclared exception!
      try { 
        Uri.create(uri0, "//:////@//:-2013794621//?//");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // //:////@//:-2013794621//?// could not be parsed into a proper Uri, missing host
         //
         verifyException("org.asynchttpclient.uri.Uri", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        Uri.create("org.asynchttpclient.util.StringBuilderPool");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // org.asynchttpclient.util.StringBuilderPool could not be parsed into a proper Uri, missing scheme
         //
         verifyException("org.asynchttpclient.uri.Uri", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Uri uri0 = Uri.create("wss://wss@wss:454");
      assertTrue(uri0.isWebSocket());
      assertEquals("wss", uri0.getUserInfo());
      assertEquals(454, uri0.getExplicitPort());
      assertEquals("", uri0.getPath());
      assertEquals("wss", uri0.getHost());
      assertEquals("wss", uri0.getScheme());
      assertTrue(uri0.isSecured());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Uri uri0 = new Uri("hkP?dfGNKE", "hkP?dfGNKE", "hkP?dfGNKE", 80, "", "hkP?dfGNKE");
      boolean boolean0 = uri0.isWebSocket();
      assertFalse(boolean0);
      assertFalse(uri0.isSecured());
      assertEquals("hkP?dfGNKE", uri0.getScheme());
      assertEquals("hkP?dfGNKE", uri0.getUserInfo());
      assertEquals("", uri0.getPath());
      assertEquals("hkP?dfGNKE", uri0.getHost());
      assertEquals("hkP?dfGNKE", uri0.getQuery());
      assertEquals(80, uri0.getPort());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      String string0 = uri0.toString();
      assertTrue(uri0.isWebSocket());
      assertNotNull(string0);
      assertEquals(443, uri0.getSchemeDefaultPort());
      assertEquals("wss://wss@wss:454", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      uri0.toJavaNetURI();
      String string0 = uri0.toString();
      assertTrue(uri0.isWebSocket());
      assertEquals("wss://wss@wss:454", string0);
      assertEquals(443, uri0.getSchemeDefaultPort());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Uri uri0 = new Uri("scheme", "org.asynchttpclient.uri.Uri", "./", (-1), "scheme", "ws");
      int int0 = uri0.getExplicitPort();
      assertEquals("./", uri0.getHost());
      assertEquals("scheme", uri0.getPath());
      assertEquals("org.asynchttpclient.uri.Uri", uri0.getUserInfo());
      assertFalse(uri0.isWebSocket());
      assertEquals("ws", uri0.getQuery());
      assertEquals(80, int0);
      assertEquals("scheme", uri0.getScheme());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Uri uri0 = new Uri("wss", "wss", "wss", 454, (String) null, (String) null);
      Uri uri1 = Uri.create(uri0, "Invalid authority field: ");
      assertEquals("/Invalid authority field:", uri1.getPath());
      assertTrue(uri1.isWebSocket());
      assertEquals("wss", uri1.getHost());
      assertTrue(uri1.isSecured());
      assertFalse(uri1.equals((Object)uri0));
      assertEquals(454, uri0.getPort());
      assertEquals("wss", uri1.getUserInfo());
  }
}