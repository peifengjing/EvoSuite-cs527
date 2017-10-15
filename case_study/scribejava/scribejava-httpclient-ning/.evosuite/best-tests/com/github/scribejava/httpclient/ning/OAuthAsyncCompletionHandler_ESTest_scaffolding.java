/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 03:43:00 GMT 2017
 */

package com.github.scribejava.httpclient.ning;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class OAuthAsyncCompletionHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.scribejava.httpclient.ning.OAuthAsyncCompletionHandler"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OAuthAsyncCompletionHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.netty.channel.local.LocalChannel",
      "org.jboss.netty.channel.ChildChannelStateEvent",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "com.ning.http.client.providers.netty.channel.ChannelManager$7",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "com.ning.http.client.providers.netty.channel.ChannelManager$8",
      "com.ning.http.client.ProxyServer",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.ChannelPipeline",
      "com.github.scribejava.core.exceptions.OAuthException",
      "org.jboss.netty.channel.ChannelFutureListener",
      "com.ning.http.client.providers.netty.future.NettyResponseFuture",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$NettyWebSocketFactory",
      "com.ning.http.client.AsyncCompletionHandler",
      "com.ning.http.client.HttpResponseBodyPartsInputStream",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Fun",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.channel.socket.nio.BossPool",
      "org.jboss.netty.handler.ssl.NotSslRecordException",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.socket.Worker",
      "org.jboss.netty.channel.group.ChannelGroup",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "com.ning.http.client.listenable.AbstractListenableFuture",
      "com.ning.http.client.Realm",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "org.jboss.netty.handler.ssl.SslHandler",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.jboss.netty.channel.socket.nio.NioSelector",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "org.jboss.netty.channel.ServerChannel",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "com.ning.http.client.ConnectionPoolPartitioning",
      "org.jboss.netty.util.Timeout",
      "org.jboss.netty.handler.codec.http.HttpMessageEncoder",
      "com.ning.http.client.providers.netty.handler.ConnectionStrategy",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.channel.AbstractChannel",
      "com.ning.http.client.filter.FilterException",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "com.github.scribejava.core.model.OAuthRequest",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "org.jboss.netty.logging.JdkLogger",
      "com.ning.http.client.ProgressAsyncHandler",
      "org.jboss.netty.channel.WriteCompletionEvent",
      "org.jboss.netty.channel.AbstractChannelSink",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProviderConfig",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider$1",
      "org.jboss.netty.handler.ssl.SslHandler$PendingWrite",
      "com.ning.http.util.StringUtils",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "com.ning.http.client.Request",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.jboss.netty.channel.group.ChannelGroupFuture",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.github.scribejava.core.model.OAuthRequest$ResponseConverter",
      "org.jboss.netty.channel.socket.nio.WorkerPool",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "org.jboss.netty.util.HashedWheelTimer$1",
      "com.ning.http.util.StringUtils$1",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.local.LocalAddress",
      "com.ning.http.util.MiscUtils",
      "com.ning.http.client.AsyncHttpClientConfig",
      "org.jboss.netty.channel.ExceptionEvent",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.HttpResponseBodyPart",
      "com.ning.http.client.providers.netty.channel.pool.ChannelPoolPartitionSelector",
      "com.ning.http.client.SSLEngineFactory",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "com.ning.http.client.AsyncCompletionHandlerBase",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "org.jboss.netty.handler.codec.http.HttpRequestEncoder",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "com.ning.http.client.providers.jdk.JDKFuture",
      "com.ning.http.client.AsyncHttpProvider",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "org.jboss.netty.channel.ChannelFutureListener$1",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.util.Timer",
      "org.jboss.netty.channel.socket.SocketChannel",
      "com.ning.http.client.AsyncHandler",
      "org.jboss.netty.handler.codec.http.HttpClientCodec",
      "org.jboss.netty.logging.InternalLogger",
      "com.ning.http.client.providers.netty.Callback",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "com.ning.http.client.HttpResponseHeaders",
      "com.ning.http.client.providers.netty.channel.pool.ChannelPool",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.bootstrap.Bootstrap",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Node",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.jboss.netty.channel.socket.nio.NioSelectorPool",
      "com.ning.http.client.Response$ResponseBuilder",
      "com.ning.http.client.MaxRedirectException",
      "org.jboss.netty.channel.AbstractServerChannel",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "com.ning.http.client.ListenableFuture",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "com.ning.http.client.Response",
      "org.jboss.netty.util.TimerTask",
      "com.github.scribejava.core.model.OAuthAsyncRequestCallback",
      "com.ning.http.client.AsyncHandler$STATE",
      "com.ning.http.client.providers.netty.handler.WebSocketProtocol",
      "com.github.scribejava.httpclient.ning.OAuthAsyncCompletionHandler",
      "com.ning.http.client.HttpResponseStatus",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "com.ning.http.client.AsyncHttpProviderConfig",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.jboss.netty.channel.ChannelPipelineException",
      "com.ning.http.util.AsyncHttpProviderUtils",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "com.ning.http.client.providers.jdk.JDKDelegateFuture",
      "org.jboss.netty.channel.MessageEvent",
      "com.github.scribejava.core.model.Response",
      "org.jboss.netty.handler.codec.frame.FrameDecoder",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "com.ning.http.client.uri.Uri",
      "com.ning.http.client.providers.netty.handler.Processor",
      "org.jboss.netty.channel.ChannelFactory"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.github.scribejava.core.model.OAuthAsyncRequestCallback", false, OAuthAsyncCompletionHandler_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.github.scribejava.core.model.OAuthRequest$ResponseConverter", false, OAuthAsyncCompletionHandler_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OAuthAsyncCompletionHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ning.http.client.AsyncCompletionHandler",
      "com.ning.http.client.AsyncHandler$STATE",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "org.jboss.netty.util.internal.DetectionUtil",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "com.ning.http.client.AsyncCompletionHandlerBase",
      "com.ning.http.util.AsyncHttpProviderUtils",
      "com.ning.http.util.StringUtils",
      "org.jboss.netty.channel.local.LocalServerChannelSink"
    );
  }
}
