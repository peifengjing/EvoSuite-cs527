/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:51:48 GMT 2017
 */

package org.asynchttpclient.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.asynchttpclient.Param;
import org.asynchttpclient.uri.Uri;
import org.asynchttpclient.util.UriEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UriEncoder_ESTest extends UriEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(false);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder");
      linkedList0.add(param0);
      Uri uri0 = new Uri("org.asynchttpclient.util.UriEncoder", "", "org.asynchttpclient.util.UriEncoder", 69, "", "");
      Uri uri1 = uriEncoder0.encode(uri0, linkedList0);
      assertEquals("", uri1.getPath());
      assertEquals("org.asynchttpclient.util.UriEncoder=org.asynchttpclient.util.UriEncoder", uri1.getQuery());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("Mvd gimoG}]U(8", "Mvd gimoG}]U(8");
      linkedList0.offer(param0);
      String string0 = uriEncoder0.withoutQueryWithParams(linkedList0);
      assertEquals("Mvd gimoG}]U(8=Mvd gimoG}]U(8", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      String string0 = uriEncoder0.withQueryWithoutParams("$VALUES");
      assertEquals("$VALUES", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      String string0 = uriEncoder0.withQueryWithoutParams("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UriEncoder[] uriEncoderArray0 = UriEncoder.values();
      assertNotNull(uriEncoderArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UriEncoder.valueOf("FIXING");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      String string0 = uriEncoder0.encodePath((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      String string0 = uriEncoder0.encodePath("$VALUES");
      assertEquals("$VALUES", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      Uri uri0 = new Uri("ws", "ws", "ws", 38, "ws", "ws");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      List<Param> list0 = Param.map2ParamList(hashMap0);
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertTrue(uri1.equals((Object)uri0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      List<Param> list0 = Param.map2ParamList(hashMap0);
      Uri uri0 = new Uri("https", "https", "http", 38, "RAW", "");
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertFalse(uri1.equals((Object)uri0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      Uri uri0 = new Uri("org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", 0, "org.asynchttpclient.util.UriEncoder", "");
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Uri uri1 = uriEncoder0.encode(uri0, linkedList0);
      assertFalse(uri1.equals((Object)uri0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      // Undeclared exception!
      try { 
        uriEncoder0.withoutQueryWithParams(linkedList0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      // Undeclared exception!
      try { 
        uriEncoder0.withQueryWithParams("", linkedList0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      // Undeclared exception!
      try { 
        uriEncoder0.withQueryWithParams((String) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.Utf8UrlEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      // Undeclared exception!
      try { 
        uriEncoder0.encodePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.Utf8UrlEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      // Undeclared exception!
      try { 
        uriEncoder0.encode((Uri) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.UriEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(false);
      String string0 = uriEncoder0.encodePath("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.putIfAbsent("", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      String string0 = uriEncoder0.withoutQueryWithParams(list0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("Afl7{R2P-')S`", "");
      linkedList0.push(param0);
      String string0 = uriEncoder0.withQueryWithParams("Afl7{R2P-')S`", linkedList0);
      assertEquals("Afl7%7BR2P-')S%60&Afl7%7BR2P-%27%29S%60=", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("$VALUES", (String) null);
      linkedList0.add(param0);
      Uri uri0 = new Uri("$VALUES", "$VALUES", "$VALUES", 2785, "$VALUES", "$VALUES");
      Uri uri1 = uriEncoder0.encode(uri0, linkedList0);
      assertEquals("$VALUES&%24VALUES", uri1.getQuery());
      assertEquals("$VALUES", uri1.getPath());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      List<Param> list0 = Param.map2ParamList(hashMap0);
      String string0 = uriEncoder0.withQueryWithParams("FIXING", list0);
      assertEquals("FIXIN", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      String string0 = uriEncoder0.withQueryWithoutParams((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      Uri uri0 = new Uri("8", "*qL(", "8", (-1154), "", "");
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("*qL(", "8");
      linkedList0.add(param0);
      Uri uri1 = uriEncoder0.encode(uri0, linkedList0);
      assertEquals("*qL(=8", uri1.getQuery());
      assertEquals("", uri1.getPath());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      String string0 = uriEncoder0.withQueryWithParams("", linkedList0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      // Undeclared exception!
      try { 
        uriEncoder0.withoutQueryWithParams((List<Param>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.UriEncoder$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      // Undeclared exception!
      try { 
        uriEncoder0.withQueryWithoutParams((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.Utf8UrlEncoder", e);
      }
  }
}