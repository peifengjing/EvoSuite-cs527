/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 10 07:48:40 GMT 2017
 */

package org.asynchttpclient.netty.timeout;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ReadTimeoutTimerTask_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask"; 
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
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReadTimeoutTimerTask_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.AttributeMap",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.handler.codec.http.HttpClientUpgradeHandler$SourceCodec",
      "io.netty.util.internal.Cleaner",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "org.asynchttpclient.Request",
      "io.netty.channel.group.DefaultChannelGroup",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator",
      "io.netty.handler.codec.http.HttpObject",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreInfinite",
      "io.netty.handler.codec.http.HttpClientCodec",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.handler.ssl.ApplicationProtocolNegotiator",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreLike",
      "io.netty.channel.socket.DatagramChannel",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.handler.ssl.ApplicationProtocolConfig",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "org.asynchttpclient.netty.NettyResponseFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "org.asynchttpclient.channel.ChannelPoolPartitioning$PerHostChannelPoolPartitioning",
      "io.netty.handler.ssl.OpenSslServerContext",
      "io.netty.handler.ssl.SslHandler",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.logging.InternalLogger",
      "org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.handler.ssl.JdkSslClientContext",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.asynchttpclient.ListenableFuture",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory",
      "org.asynchttpclient.SslEngineFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.channel.group.ChannelMatcher",
      "io.netty.util.TimerTask",
      "io.netty.handler.codec.ByteToMessageDecoder",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.Signal$1",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy",
      "io.netty.util.ReferenceCounted",
      "org.asynchttpclient.netty.request.body.NettyBody",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "org.asynchttpclient.netty.request.NettyRequestSender",
      "io.netty.util.concurrent.Future",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "org.asynchttpclient.exception.TooManyConnectionsException",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.ChannelId",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory",
      "io.netty.util.AbstractConstant",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.unix.Socket",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "io.netty.handler.ssl.OpenSslClientContext",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.channel.epoll.EpollChannelConfig",
      "org.asynchttpclient.channel.ChannelPool",
      "org.asynchttpclient.exception.PoolAlreadyClosedException",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.handler.ssl.ReferenceCountedOpenSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.util.AsciiString$2",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.util.AsciiString$1",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.util.HashingStrategy",
      "io.netty.channel.unix.UnixChannel",
      "io.netty.util.internal.MathUtil",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.channel.FileRegion",
      "io.netty.buffer.ByteBufInputStream",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.channel.EventLoopGroup",
      "org.asynchttpclient.netty.channel.ConnectionSemaphore",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "io.netty.handler.ssl.OpenSslContext",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.handler.ssl.SslProvider",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "org.asynchttpclient.uri.Uri",
      "org.asynchttpclient.filter.FilterContext",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.AttributeKey",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "org.asynchttpclient.exception.TooManyConnectionsPerHostException",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.handler.codec.http.HttpMessage",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.AsciiString",
      "io.netty.handler.ssl.CipherSuiteFilter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.channel.local.LocalAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.asynchttpclient.AsyncHttpClientState",
      "org.asynchttpclient.netty.request.NettyRequestFactory",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.channel.local.LocalChannel$State",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.handler.codec.http.HttpRequest",
      "io.netty.channel.ChannelHandler$Sharable",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.channel.ChannelPipeline",
      "io.netty.handler.codec.http.cookie.Cookie",
      "io.netty.channel.ServerChannel",
      "io.netty.channel.ChannelException",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$2",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$1",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "org.asynchttpclient.Realm",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.handler.codec.http.cookie.ClientCookieEncoder$1",
      "org.asynchttpclient.netty.channel.DefaultChannelPool",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.bootstrap.ChannelFactory",
      "org.asynchttpclient.ClientStats",
      "io.netty.channel.AddressedEnvelope",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.channel.ChannelFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.handler.ssl.SslContext",
      "io.netty.util.concurrent.Promise",
      "io.netty.util.ByteProcessor",
      "org.asynchttpclient.HostStats",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.bootstrap.Bootstrap",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.channel.group.ChannelGroupFuture",
      "io.netty.channel.local.LocalChannel$LocalUnsafe",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "org.asynchttpclient.AsyncHttpClientConfig$AdditionalChannelInitializer",
      "io.netty.handler.codec.DecoderResultProvider",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "org.asynchttpclient.netty.timeout.TimeoutTimerTask",
      "org.asynchttpclient.util.ThrowableUtil",
      "io.netty.util.ConstantPool",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.local.LocalChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.bootstrap.AbstractBootstrap",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.channel.group.ChannelGroup",
      "org.asynchttpclient.netty.handler.WebSocketHandler",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.handler.codec.http.cookie.CookieEncoder",
      "org.asynchttpclient.netty.request.NettyRequest",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.util.Timer",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.handler.codec.http.HttpVersion",
      "org.asynchttpclient.netty.handler.AsyncHttpClientHandler",
      "org.asynchttpclient.netty.timeout.TimeoutsHolder",
      "io.netty.util.AbstractReferenceCounted",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$IdleChannel",
      "org.asynchttpclient.filter.FilterException",
      "org.asynchttpclient.channel.NoopChannelPool",
      "org.asynchttpclient.netty.handler.HttpHandler",
      "io.netty.handler.codec.http.HttpContentDecoder",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.channel.socket.DatagramChannelConfig",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.socket.DuplexChannel",
      "io.netty.handler.codec.http.cookie.ClientCookieEncoder",
      "org.asynchttpclient.netty.channel.ChannelManager$3",
      "org.asynchttpclient.netty.channel.ChannelState",
      "org.asynchttpclient.netty.channel.ChannelManager$4",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.Timeout",
      "io.netty.handler.codec.MessageToMessageDecoder",
      "io.netty.handler.ssl.ReferenceCountedOpenSslClientContext",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.handler.ssl.JdkSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.channel.ChannelConfig",
      "org.asynchttpclient.netty.OnLastHttpContentCallback",
      "org.asynchttpclient.util.StringBuilderPool",
      "org.asynchttpclient.exception.RemotelyClosedException",
      "io.netty.channel.ChannelHandler",
      "io.netty.handler.codec.http.HttpContentDecompressor",
      "io.netty.util.Signal",
      "io.netty.util.Signal$SignalConstant"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("io.netty.util.Timer", false, ReadTimeoutTimerTask_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.AsyncHttpClientConfig", false, ReadTimeoutTimerTask_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.AsyncHttpClientState", false, ReadTimeoutTimerTask_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReadTimeoutTimerTask_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.netty.timeout.TimeoutTimerTask",
      "org.asynchttpclient.util.StringBuilderPool",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.handler.ssl.SslProvider",
      "io.netty.handler.ssl.SslContext",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "org.asynchttpclient.channel.NoopChannelPool",
      "io.netty.channel.group.DefaultChannelGroup",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "org.asynchttpclient.netty.request.NettyRequestSender",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.AsciiString",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "org.asynchttpclient.netty.request.NettyRequestFactory",
      "io.netty.handler.codec.http.cookie.ClientCookieEncoder",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.StringUtil",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "org.asynchttpclient.channel.ChannelPoolPartitioning$PerHostChannelPoolPartitioning",
      "org.asynchttpclient.netty.NettyResponseFuture",
      "org.asynchttpclient.netty.channel.ChannelState",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "org.asynchttpclient.exception.TooManyConnectionsException",
      "org.asynchttpclient.exception.TooManyConnectionsPerHostException",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreInfinite",
      "org.asynchttpclient.netty.channel.DefaultChannelPool",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$1",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$2",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "io.netty.channel.local.LocalChannel"
    );
  }
}