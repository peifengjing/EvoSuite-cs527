/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 04:56:28 GMT 2017
 */

package com.github.scribejava.apis.examples;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class GitHubAsyncOkHttpExample_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.scribejava.apis.examples.GitHubAsyncOkHttpExample"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GitHubAsyncOkHttpExample_ESTest_scaffolding.class.getClassLoader() ,
      "com.github.scribejava.core.model.Parameter",
      "okhttp3.Request$Builder",
      "okhttp3.Cache",
      "com.github.scribejava.httpclient.ahc.AhcHttpClientConfig",
      "okhttp3.RequestBody$1",
      "okhttp3.CacheControl$Builder",
      "okhttp3.internal.cache.CacheInterceptor",
      "com.github.scribejava.apis.GitHubApi",
      "okio.Timeout$1",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClientConfig",
      "com.github.scribejava.core.oauth.OAuth20Service",
      "okio.Options",
      "okhttp3.Dispatcher",
      "okhttp3.Address",
      "okhttp3.Route",
      "okhttp3.internal.platform.AndroidPlatform$AndroidCertificateChainCleaner",
      "okhttp3.OkHttpClient$1",
      "com.github.scribejava.core.exceptions.OAuthException",
      "okio.BufferedSink",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient",
      "okhttp3.internal.tls.TrustRootIndex$AndroidTrustRootIndex",
      "okhttp3.Headers$Builder",
      "com.github.scribejava.core.httpclient.HttpClient",
      "okhttp3.MediaType",
      "okhttp3.ResponseBody",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClientConfig",
      "okhttp3.CookieJar",
      "com.github.scribejava.httpclient.okhttp.OkHttpProvider",
      "okhttp3.Request",
      "okhttp3.internal.tls.CertificateChainCleaner",
      "com.github.scribejava.core.model.OAuthConfig",
      "okhttp3.internal.http.HttpMethod",
      "okhttp3.Connection",
      "okio.SegmentedByteString",
      "okhttp3.internal.connection.StreamAllocation$StreamAllocationReference",
      "okio.BufferedSource",
      "okhttp3.RequestBody$2",
      "okhttp3.RequestBody$3",
      "okhttp3.internal.http.RealResponseBody",
      "okhttp3.internal.ws.RealWebSocket$Streams",
      "okhttp3.Handshake",
      "okhttp3.Call$Factory",
      "okhttp3.internal.cache.InternalCache",
      "okhttp3.internal.cache.CacheStrategy",
      "okio.Source",
      "okhttp3.CipherSuite$1",
      "com.github.scribejava.core.model.OAuth2Authorization",
      "okhttp3.internal.tls.BasicCertificateChainCleaner",
      "okhttp3.internal.http.RetryAndFollowUpInterceptor",
      "okhttp3.WebSocketListener",
      "okhttp3.CacheControl",
      "com.github.scribejava.core.utils.Preconditions",
      "okio.Sink",
      "com.github.scribejava.core.model.Token",
      "okhttp3.CookieJar$1",
      "okhttp3.internal.Internal",
      "okhttp3.EventListener$1",
      "okhttp3.EventListener",
      "okhttp3.EventListener$2",
      "okhttp3.Response$Builder",
      "okhttp3.Response",
      "okhttp3.Callback",
      "okhttp3.Call",
      "okhttp3.Authenticator$1",
      "okhttp3.internal.connection.RealConnection$1",
      "okhttp3.internal.tls.TrustRootIndex$BasicTrustRootIndex",
      "okhttp3.internal.http2.ConnectionShutdownException",
      "okhttp3.ResponseBody$1",
      "okhttp3.OkHttpClient",
      "okhttp3.internal.http.BridgeInterceptor",
      "okhttp3.ConnectionSpec$Builder",
      "com.github.scribejava.core.model.OAuthRequest",
      "okhttp3.internal.connection.RouteException",
      "okhttp3.internal.platform.JdkWithJettyBootPlatform",
      "okio.Buffer$2",
      "okhttp3.ConnectionPool",
      "okio.Buffer$1",
      "okhttp3.HttpUrl$Builder$ParseResult",
      "okhttp3.internal.connection.ConnectionSpecSelector",
      "com.github.scribejava.core.builder.ServiceBuilder",
      "com.github.scribejava.core.extractors.TokenExtractor",
      "okhttp3.WebSocket$Factory",
      "okhttp3.Authenticator",
      "okhttp3.CertificatePinner",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType$1",
      "okhttp3.internal.cache.CacheRequest",
      "com.github.scribejava.core.model.OAuthRequest$ResponseConverter",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType$2",
      "okhttp3.RealCall",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType$3",
      "com.github.scribejava.core.builder.api.BaseApi",
      "okio.Timeout",
      "okhttp3.CipherSuite",
      "com.github.scribejava.core.model.OAuth2AccessToken",
      "okhttp3.internal.connection.StreamAllocation",
      "okio.AsyncTimeout",
      "okhttp3.internal.http2.Http2Stream$StreamTimeout",
      "okhttp3.internal.Util",
      "okhttp3.ConnectionSpec",
      "com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor",
      "okio.Segment",
      "okhttp3.internal.platform.AndroidPlatform",
      "okhttp3.Interceptor",
      "okhttp3.internal.http2.Http2Connection",
      "okhttp3.internal.http2.Http2Connection$Listener",
      "com.github.scribejava.core.httpclient.HttpClientConfig",
      "com.github.scribejava.core.utils.OAuthEncoder",
      "com.github.scribejava.core.model.Verb",
      "okhttp3.ConnectionPool$1",
      "okhttp3.internal.http.RealInterceptorChain",
      "okhttp3.WebSocket",
      "okhttp3.CertificatePinner$Builder",
      "okhttp3.internal.http.CallServerInterceptor",
      "com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor$InstanceHolder",
      "okhttp3.EventListener$Factory",
      "okhttp3.HttpUrl$Builder",
      "okhttp3.internal.http.HttpCodec",
      "okhttp3.internal.http2.Http2Connection$Listener$1",
      "okhttp3.Protocol",
      "okhttp3.OkHttpClient$Builder",
      "okhttp3.HttpUrl",
      "com.github.scribejava.httpclient.ning.NingHttpClientConfig",
      "okhttp3.internal.platform.Platform",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType",
      "okhttp3.internal.connection.RealConnection",
      "com.github.scribejava.core.model.ParameterList",
      "okhttp3.internal.Version",
      "okhttp3.ResponseBody$BomAwareReader",
      "okhttp3.internal.connection.RouteSelector",
      "okhttp3.internal.cache.CacheStrategy$Factory",
      "okhttp3.internal.connection.ConnectInterceptor",
      "com.github.scribejava.httpclient.ning.NingProvider",
      "okhttp3.internal.connection.RouteDatabase",
      "okhttp3.internal.http2.StreamResetException",
      "okhttp3.Headers",
      "com.github.scribejava.core.builder.api.DefaultApi20",
      "okhttp3.RequestBody",
      "okio.ByteString",
      "okio.Util",
      "okhttp3.internal.tls.OkHostnameVerifier",
      "okhttp3.internal.tls.TrustRootIndex",
      "com.github.scribejava.apis.examples.GitHubAsyncOkHttpExample",
      "com.github.scribejava.core.oauth.OAuthService",
      "okhttp3.internal.http2.Http2Stream",
      "okio.Buffer",
      "com.github.scribejava.core.model.OAuthAsyncRequestCallback",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpProvider",
      "okhttp3.Dns$1",
      "okhttp3.internal.Util$1",
      "okhttp3.internal.Util$2",
      "okhttp3.Interceptor$Chain",
      "okhttp3.Dns",
      "com.github.scribejava.apis.GitHubApi$InstanceHolder",
      "com.github.scribejava.httpclient.ahc.AhcProvider",
      "com.github.scribejava.core.httpclient.HttpClientProvider",
      "okhttp3.internal.platform.Jdk9Platform",
      "okhttp3.TlsVersion",
      "com.github.scribejava.core.model.Response"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GitHubAsyncOkHttpExample_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.scribejava.apis.examples.GitHubAsyncOkHttpExample",
      "com.github.scribejava.apis.GitHubApi$InstanceHolder",
      "com.github.scribejava.core.model.Verb",
      "com.github.scribejava.core.utils.Preconditions",
      "com.github.scribejava.core.oauth.OAuth20Service",
      "okhttp3.MediaType",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient",
      "okhttp3.Protocol",
      "okio.Buffer",
      "okio.Util",
      "okio.ByteString",
      "okhttp3.internal.Util",
      "okhttp3.CipherSuite",
      "okhttp3.TlsVersion",
      "okhttp3.ConnectionSpec",
      "okhttp3.internal.Internal",
      "okhttp3.OkHttpClient",
      "okhttp3.EventListener",
      "okhttp3.CookieJar",
      "okhttp3.internal.tls.OkHostnameVerifier",
      "okhttp3.CertificatePinner",
      "okhttp3.Authenticator",
      "okhttp3.ConnectionPool",
      "okhttp3.Dns",
      "okhttp3.internal.platform.AndroidPlatform",
      "okhttp3.internal.platform.Platform",
      "okhttp3.internal.tls.BasicCertificateChainCleaner",
      "com.github.scribejava.core.model.ParameterList",
      "com.github.scribejava.core.utils.OAuthEncoder",
      "com.github.scribejava.core.model.OAuthRequest",
      "com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor",
      "com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor$InstanceHolder",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType$1",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType$2",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType$3",
      "com.github.scribejava.httpclient.okhttp.OkHttpHttpClient$BodyType",
      "okhttp3.HttpUrl",
      "okhttp3.HttpUrl$Builder$ParseResult",
      "okhttp3.internal.http.RetryAndFollowUpInterceptor",
      "okhttp3.internal.connection.StreamAllocation",
      "okhttp3.CacheControl",
      "okhttp3.internal.http2.Http2Connection$Listener",
      "okhttp3.internal.connection.RealConnection"
    );
  }
}