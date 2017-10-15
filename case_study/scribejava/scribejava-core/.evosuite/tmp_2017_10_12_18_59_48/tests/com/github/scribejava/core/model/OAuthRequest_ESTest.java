/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 02:19:20 GMT 2017
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.ParameterList;
import com.github.scribejava.core.model.Verb;
import java.io.File;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuthRequest_ESTest extends OAuthRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Verb verb0 = Verb.PATCH;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "com.github.scribejava.core.exceptions.OAuthException");
      Verb verb1 = oAuthRequest0.getVerb();
      assertTrue(verb1.isRequiresBody());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "*+jDzk>L~clD2%kt;");
      Verb verb1 = oAuthRequest0.getVerb();
      assertSame(verb0, verb1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Verb verb0 = Verb.PATCH;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, (String) null);
      String string0 = oAuthRequest0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      String string0 = oAuthRequest0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "?Z5j<6Ph(IY2a");
      oAuthRequest0.setPayload("{_U^RQKc@`;");
      String string0 = oAuthRequest0.getStringPayload();
      assertEquals("{_U^RQKc@`;", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      String string0 = oAuthRequest0.getSanitizedUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "?Z5j<6Ph(IY2a");
      oAuthRequest0.setRealm("?Z5j<6Ph(IY2a");
      String string0 = oAuthRequest0.getRealm();
      assertEquals("?Z5j<6Ph(IY2a", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Verb verb0 = Verb.OPTIONS;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, ";_");
      oAuthRequest0.setRealm("");
      String string0 = oAuthRequest0.getRealm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Verb verb0 = Verb.PUT;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "https://");
      oAuthRequest0.addQuerystringParameter(", headers=", "https://");
      ParameterList parameterList0 = oAuthRequest0.getQueryStringParams();
      assertEquals(1, parameterList0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Verb verb0 = Verb.OPTIONS;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, ";_");
      oAuthRequest0.addHeader(";_", "");
      Map<String, String> map0 = oAuthRequest0.getHeaders();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/UTF-80@Request(DELETE )");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "POST");
      File file0 = MockFile.createTempFile("UTF-8", "@Request(DELETE )");
      oAuthRequest0.setPayload(file0);
      File file1 = oAuthRequest0.getFilePayload();
      assertEquals(0L, file1.getTotalSpace());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "/cda");
      MockFile mockFile0 = new MockFile("UTF-8", ".eI^J.");
      MockFile.createTempFile("https://http://Malforme", "UTF-8", (File) mockFile0);
      oAuthRequest0.setPayload((File) mockFile0);
      File file0 = oAuthRequest0.getFilePayload();
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "http://http://https://:80");
      MockFile mockFile0 = new MockFile("http://http://https://:80");
      oAuthRequest0.setPayload((File) mockFile0);
      File file0 = oAuthRequest0.getFilePayload();
      assertEquals(0L, file0.getUsableSpace());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Verb verb0 = Verb.POST;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      String string0 = oAuthRequest0.getCompleteUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Verb verb0 = Verb.OPTIONS;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      oAuthRequest0.setCharset("");
      String string0 = oAuthRequest0.getCharset();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Verb verb0 = Verb.OPTIONS;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "td-KjQaDK?Gz");
      // Undeclared exception!
      try { 
        oAuthRequest0.setPayload((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.model.OAuthRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, (String) null);
      // Undeclared exception!
      try { 
        oAuthRequest0.getSanitizedUrl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      // Undeclared exception!
      try { 
        oAuthRequest0.getQueryStringParams();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Malformed URL
         //
         verifyException("com.github.scribejava.core.model.OAuthRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Verb verb0 = Verb.TRACE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      oAuthRequest0.addQuerystringParameter((String) null, "5~GD,%UUJ");
      // Undeclared exception!
      try { 
        oAuthRequest0.getCompleteUrl();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot encode null object
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Verb verb0 = Verb.POST;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "YsAt\"ttGj3,MhicEX|");
      oAuthRequest0.setCharset("YsAt\"ttGj3,MhicEX|");
      // Undeclared exception!
      try { 
        oAuthRequest0.getByteArrayPayload();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported Charset: YsAt\"ttGj3,MhicEX|
         //
         verifyException("com.github.scribejava.core.model.OAuthRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, (String) null);
      oAuthRequest0.addParameter((String) null, "");
      // Undeclared exception!
      try { 
        oAuthRequest0.getByteArrayPayload();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot encode null object
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "");
      // Undeclared exception!
      try { 
        oAuthRequest0.addParameter("", ":80");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.model.OAuthRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "*+jDzk>L~clD2%kt;");
      // Undeclared exception!
      try { 
        oAuthRequest0.addOAuthParameter((String) null, "*+jDzk>L~clD2%kt;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "");
      String string0 = oAuthRequest0.getCharset();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "*+jDzk>L~clD2%kt;");
      String string0 = oAuthRequest0.getUrl();
      assertEquals("*+jDzk>L~clD2%kt;", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "~=gkp");
      byte[] byteArray0 = new byte[1];
      oAuthRequest0.setPayload(byteArray0);
      byte[] byteArray1 = oAuthRequest0.getByteArrayPayload();
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Verb verb0 = Verb.PUT;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "https://");
      byte[] byteArray0 = oAuthRequest0.getByteArrayPayload();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "https://hptp://:443");
      String string0 = oAuthRequest0.getSanitizedUrl();
      assertEquals("https://hptp://", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "https://");
      String string0 = oAuthRequest0.getSanitizedUrl();
      assertEquals("https://", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Verb verb0 = Verb.PATCH;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "http://Malforme");
      String string0 = oAuthRequest0.getSanitizedUrl();
      assertEquals("http://Malforme", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "http://http://https://:80");
      String string0 = oAuthRequest0.getSanitizedUrl();
      assertEquals("http://http://https://", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      oAuthRequest0.addParameter("@Request(DELETE )", "");
      ParameterList parameterList0 = oAuthRequest0.getBodyParams();
      assertEquals(1, parameterList0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Verb verb0 = Verb.OPTIONS;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "realm");
      oAuthRequest0.addParameter("realm", "");
      assertEquals(Verb.OPTIONS, oAuthRequest0.getVerb());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Verb verb0 = Verb.PATCH;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      // Undeclared exception!
      try { 
        oAuthRequest0.addOAuthParameter("f7`$lZ#!", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // OAuth parameters must either be 'scope', 'realm' or start with 'oauth_'
         //
         verifyException("com.github.scribejava.core.model.OAuthRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Verb verb0 = Verb.PUT;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "oauth_");
      oAuthRequest0.addOAuthParameter("scope", "oauth_");
      assertEquals("oauth_", oAuthRequest0.getUrl());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "oauth_scapee");
      oAuthRequest0.addOAuthParameter("oauth_scapee", "oauth_scapee");
      assertEquals(Verb.GET, oAuthRequest0.getVerb());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Verb verb0 = Verb.POST;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      oAuthRequest0.addBodyParameter("@Request(POST )", "Unsupported Charset: ");
      assertEquals("", oAuthRequest0.getUrl());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Verb verb0 = Verb.OPTIONS;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "realm");
      oAuthRequest0.addOAuthParameter("realm", "realm");
      Map<String, String> map0 = oAuthRequest0.getOauthParameters();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "/cda");
      Map<String, String> map0 = oAuthRequest0.getHeaders();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      String string0 = oAuthRequest0.getStringPayload();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "https://");
      ParameterList parameterList0 = oAuthRequest0.getBodyParams();
      assertEquals(0, parameterList0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "https://");
      String string0 = oAuthRequest0.toString();
      assertEquals("@Request(null https://)", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "https://");
      Map<String, String> map0 = oAuthRequest0.getOauthParameters();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "https://");
      String string0 = oAuthRequest0.getCompleteUrl();
      assertEquals("https://", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      File file0 = oAuthRequest0.getFilePayload();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Verb verb0 = Verb.POST;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      oAuthRequest0.setPayload("");
      String string0 = oAuthRequest0.getStringPayload();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "https://");
      oAuthRequest0.getVerb();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OAuthRequest oAuthRequest0 = new OAuthRequest((Verb) null, "https://");
      ParameterList parameterList0 = oAuthRequest0.getQueryStringParams();
      assertEquals(0, parameterList0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      String string0 = oAuthRequest0.getRealm();
      assertNull(string0);
  }
}