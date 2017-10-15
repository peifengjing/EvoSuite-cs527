/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:32:17 GMT 2017
 */

package com.github.scribejava.httpclient.ahc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.model.OAuthAsyncRequestCallback;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.httpclient.ahc.AhcHttpClient;
import com.github.scribejava.httpclient.ahc.AhcHttpClientConfig;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.io.File;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import org.asynchttpclient.AsyncHttpClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AhcHttpClient_ESTest extends AhcHttpClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Verb verb0 = Verb.GET;
      byte[] byteArray0 = new byte[7];
      OAuthAsyncRequestCallback<ChannelInboundHandlerAdapter> oAuthAsyncRequestCallback0 = (OAuthAsyncRequestCallback<ChannelInboundHandlerAdapter>) mock(OAuthAsyncRequestCallback.class, new ViolatedAssumptionAnswer());
      OAuthRequest.ResponseConverter<ChannelInboundHandlerAdapter> oAuthRequest_ResponseConverter0 = (OAuthRequest.ResponseConverter<ChannelInboundHandlerAdapter>) mock(OAuthRequest.ResponseConverter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ahcHttpClient0.executeAsync("r", (Map<String, String>) hashMap0, verb0, "r", byteArray0, oAuthAsyncRequestCallback0, oAuthRequest_ResponseConverter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Verb verb0 = Verb.PUT;
      OAuthAsyncRequestCallback<MockHijrahDate> oAuthAsyncRequestCallback0 = (OAuthAsyncRequestCallback<MockHijrahDate>) mock(OAuthAsyncRequestCallback.class, new ViolatedAssumptionAnswer());
      OAuthRequest.ResponseConverter<MockHijrahDate> oAuthRequest_ResponseConverter0 = (OAuthRequest.ResponseConverter<MockHijrahDate>) mock(OAuthRequest.ResponseConverter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ahcHttpClient0.executeAsync("i386", map0, verb0, "i386", "i386", oAuthAsyncRequestCallback0, oAuthRequest_ResponseConverter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Verb verb0 = Verb.TRACE;
      MockFile mockFile0 = new MockFile("X;`Ba4$K:2j~+<<G?s", "X;`Ba4$K:2j~+<<G?s");
      OAuthAsyncRequestCallback<Verb> oAuthAsyncRequestCallback0 = (OAuthAsyncRequestCallback<Verb>) mock(OAuthAsyncRequestCallback.class, new ViolatedAssumptionAnswer());
      OAuthRequest.ResponseConverter<Verb> oAuthRequest_ResponseConverter0 = (OAuthRequest.ResponseConverter<Verb>) mock(OAuthRequest.ResponseConverter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ahcHttpClient0.executeAsync("X;`Ba4$K:2j~+<<G?s", (Map<String, String>) hashMap0, verb0, "X;`Ba4$K:2j~+<<G?s", (File) mockFile0, oAuthAsyncRequestCallback0, oAuthRequest_ResponseConverter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // message build error: unknown verb type
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = null;
      try {
        ahcHttpClient0 = new AhcHttpClient((AhcHttpClientConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Verb verb0 = Verb.HEAD;
      OAuthAsyncRequestCallback<Verb> oAuthAsyncRequestCallback0 = (OAuthAsyncRequestCallback<Verb>) mock(OAuthAsyncRequestCallback.class, new ViolatedAssumptionAnswer());
      OAuthRequest.ResponseConverter<Verb> oAuthRequest_ResponseConverter0 = (OAuthRequest.ResponseConverter<Verb>) mock(OAuthRequest.ResponseConverter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ahcHttpClient0.executeAsync("C", map0, verb0, "C", "C", oAuthAsyncRequestCallback0, oAuthRequest_ResponseConverter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // message build error: unknown verb type
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Verb verb0 = Verb.DELETE;
      MockFile mockFile0 = new MockFile("Y2", "fOYQh%8hEwR%%yS");
      // Undeclared exception!
      try { 
        ahcHttpClient0.execute("", (Map<String, String>) hashMap0, verb0, "z'eT@B)&", (File) mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Verb verb0 = Verb.PUT;
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        ahcHttpClient0.execute("", map0, verb0, "oauth_timestamp", byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Verb verb0 = Verb.POST;
      // Undeclared exception!
      try { 
        ahcHttpClient0.execute("", (Map<String, String>) hashMap0, verb0, "sendToAddress(..)", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AhcHttpClientConfig ahcHttpClientConfig0 = AhcHttpClientConfig.defaultConfig();
      AhcHttpClient ahcHttpClient0 = null;
      try {
        ahcHttpClient0 = new AhcHttpClient(ahcHttpClientConfig0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.GlobalEventExecutor
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Verb verb0 = Verb.GET;
      MockFile mockFile0 = new MockFile("O,aH2?G");
      OAuthAsyncRequestCallback<MockJapaneseDate> oAuthAsyncRequestCallback0 = (OAuthAsyncRequestCallback<MockJapaneseDate>) mock(OAuthAsyncRequestCallback.class, new ViolatedAssumptionAnswer());
      OAuthRequest.ResponseConverter<MockJapaneseDate> oAuthRequest_ResponseConverter0 = (OAuthRequest.ResponseConverter<MockJapaneseDate>) mock(OAuthRequest.ResponseConverter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ahcHttpClient0.executeAsync("!'@h4N$%@I", (Map<String, String>) hashMap0, verb0, "O,aH2?G", (File) mockFile0, oAuthAsyncRequestCallback0, oAuthRequest_ResponseConverter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      Verb verb0 = Verb.GET;
      // Undeclared exception!
      try { 
        ahcHttpClient0.execute((String) null, (Map<String, String>) null, verb0, (String) null, "message build error: unknown verb type");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      // Undeclared exception!
      try { 
        ahcHttpClient0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AhcHttpClient ahcHttpClient0 = new AhcHttpClient((AsyncHttpClient) null);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Verb verb0 = Verb.OPTIONS;
      byte[] byteArray0 = new byte[2];
      OAuthAsyncRequestCallback<ChannelInboundHandlerAdapter> oAuthAsyncRequestCallback0 = (OAuthAsyncRequestCallback<ChannelInboundHandlerAdapter>) mock(OAuthAsyncRequestCallback.class, new ViolatedAssumptionAnswer());
      OAuthRequest.ResponseConverter<ChannelInboundHandlerAdapter> oAuthRequest_ResponseConverter0 = (OAuthRequest.ResponseConverter<ChannelInboundHandlerAdapter>) mock(OAuthRequest.ResponseConverter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ahcHttpClient0.executeAsync("Pq`xx,m8G,9B2;I", map0, verb0, "", byteArray0, oAuthAsyncRequestCallback0, oAuthRequest_ResponseConverter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // message build error: unknown verb type
         //
         verifyException("com.github.scribejava.httpclient.ahc.AhcHttpClient", e);
      }
  }
}
