/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Oct 15 23:59:19 GMT 2017
 */

package org.asynchttpclient.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HttpUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.util.HttpUtils"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HttpUtils_ESTest_scaffolding.class.getClassLoader() ,
      "org.testng.IClassListener",
      "io.netty.handler.ssl.ApplicationProtocolAccessor",
      "io.netty.handler.codec.http.HttpHeaders",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "org.asynchttpclient.netty.NettyResponseStatus",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$3",
      "io.netty.handler.codec.http.HttpClientCodec",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerRemovedTask",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreLike",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "org.asynchttpclient.netty.NettyResponseFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$2",
      "io.netty.util.internal.PlatformDependent0$5",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$1",
      "org.testng.IAttributes",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.handler.codec.DefaultHeadersImpl",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.channel.socket.ServerSocketChannelConfig",
      "org.testng.ITestNGMethod",
      "io.netty.handler.ssl.OpenSslServerContext",
      "io.netty.channel.epoll.EpollRecvByteAllocatorStreamingHandle",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.handler.ssl.JdkSslClientContext",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.handler.codec.ByteToMessageDecoder$2",
      "io.netty.handler.codec.ByteToMessageDecoder$1",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.asynchttpclient.ListenableFuture",
      "org.asynchttpclient.SslEngineFactory",
      "org.testng.TestNG",
      "io.netty.handler.codec.DefaultHeaders$NameValidator",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.channel.AbstractChannelHandlerContext",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.util.TimerTask",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "org.testng.ISuiteListener",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "org.asynchttpclient.Response",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "org.testng.internal.ITestResultNotifier",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.resolver.DefaultAddressResolverGroup",
      "io.netty.util.concurrent.Future",
      "org.asynchttpclient.netty.request.NettyRequestSender",
      "io.netty.util.HashingStrategy$1",
      "org.testng.xml.XmlClass",
      "com.beust.jcommander.ParameterException",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "org.testng.collections.Lists",
      "io.netty.handler.codec.http.DefaultHttpObject",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.buffer.Unpooled",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.handler.codec.http.HttpStatusClass",
      "io.netty.handler.codec.ByteToMessageDecoder$Cumulator",
      "io.netty.util.Recycler$Handle",
      "io.netty.handler.ssl.OpenSslClientContext",
      "io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper",
      "io.netty.handler.ssl.NotSslRecordException",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.buffer.PooledDuplicatedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.handler.codec.http.DefaultHttpMessage",
      "io.netty.util.UncheckedBooleanSupplier",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.InternalThreadLocalMap",
      "org.asynchttpclient.netty.EagerResponseBodyPart",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.util.HashingStrategy",
      "io.netty.channel.unix.UnixChannel",
      "io.netty.util.internal.MathUtil",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.internal.IConfiguration",
      "io.netty.channel.epoll.EpollRecvByteAllocatorHandle",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.handler.codec.DefaultHeaders$HeaderEntry",
      "io.netty.channel.FileRegion",
      "io.netty.buffer.ByteBufInputStream",
      "io.netty.handler.codec.DefaultHeaders$NameValidator$1",
      "io.netty.channel.EventLoopGroup",
      "org.asynchttpclient.netty.channel.ConnectionSemaphore",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf",
      "org.asynchttpclient.uri.Uri",
      "io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.buffer.ReadOnlyByteBuf",
      "org.asynchttpclient.exception.TooManyConnectionsPerHostException",
      "io.netty.handler.codec.http.HttpMessage",
      "io.netty.bootstrap.AbstractBootstrapConfig",
      "io.netty.util.AsciiString",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "io.netty.handler.codec.http.CombinedHttpHeaders",
      "io.netty.channel.DefaultMessageSizeEstimator",
      "org.asynchttpclient.exception.ChannelClosedException",
      "io.netty.handler.ssl.CipherSuiteFilter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.util.CharsetUtil",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.channel.AbstractChannel$AnnotatedSocketException",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledSlicedByteBuf",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.RecvByteBufAllocator",
      "io.netty.channel.ChannelException",
      "org.testng.xml.XmlSuite$ParallelMode",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.Constant",
      "org.testng.ReporterConfig",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "org.asynchttpclient.Realm",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "org.testng.ITestObjectFactory",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "org.testng.internal.SuiteRunnerMap",
      "io.netty.handler.codec.http.HttpStatusClass$1",
      "org.reactivestreams.Publisher",
      "io.netty.util.ByteProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.channel.RecvByteBufAllocator$Handle",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.handler.codec.DecoderResultProvider",
      "org.asynchttpclient.AsyncCompletionHandler",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext",
      "io.netty.handler.codec.http.HttpUtil",
      "io.netty.channel.DefaultChannelPipeline$TailContext",
      "org.asynchttpclient.util.ThrowableUtil",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "org.testng.xml.XMLParser",
      "io.netty.bootstrap.AbstractBootstrap",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "org.testng.CommandLineArgs",
      "io.netty.channel.socket.ChannelOutputShutdownException",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.channel.DefaultChannelId",
      "io.netty.channel.group.ChannelGroup",
      "org.asynchttpclient.netty.handler.WebSocketHandler",
      "org.testng.xml.XmlGroups",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1",
      "org.asynchttpclient.netty.request.NettyRequest",
      "io.netty.handler.codec.Headers",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.channel.DefaultChannelPipeline",
      "org.asynchttpclient.netty.LazyResponseBodyPart",
      "io.netty.handler.codec.http.HttpVersion",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.handler.ssl.OpenSslEngine",
      "org.asynchttpclient.netty.handler.AsyncHttpClientHandler",
      "org.testng.log4testng.Logger",
      "org.testng.IExecutionListener",
      "org.testng.TestNGException",
      "org.asynchttpclient.netty.handler.HttpHandler",
      "io.netty.handler.codec.http.HttpContentDecoder",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.channel.socket.DuplexChannel",
      "org.testng.ISuite",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "org.asynchttpclient.util.HttpUtils",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.handler.codec.MessageToMessageDecoder",
      "io.netty.handler.ssl.ReferenceCountedOpenSslClientContext",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.channel.embedded.EmbeddedChannel",
      "org.testng.ITestRunnerFactory",
      "io.netty.util.NetUtil",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.channel.ChannelFuture",
      "io.netty.channel.SingleThreadEventLoop$NonWakeupRunnable",
      "org.testng.xml.SuiteXmlParser",
      "io.netty.channel.unix.ServerDomainSocketChannel",
      "io.netty.handler.ssl.JdkSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.channel.ChannelConfig",
      "org.asynchttpclient.netty.OnLastHttpContentCallback",
      "io.netty.handler.codec.http.HttpContentDecompressor",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.channel.AbstractChannel$AnnotatedNoRouteToHostException",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "io.netty.handler.codec.http.HttpClientUpgradeHandler$SourceCodec",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "org.asynchttpclient.Request",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator",
      "io.netty.handler.codec.http.HttpObject",
      "io.netty.handler.ssl.ApplicationProtocolNegotiator",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf",
      "io.netty.channel.unix.DomainSocketAddress",
      "org.asynchttpclient.AsyncHandler$State",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.channel.epoll.EpollServerChannelConfig",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "org.testng.internal.thread.graph.IThreadWorkerFactory",
      "io.netty.channel.AbstractChannelHandlerContext$WriteTask",
      "io.netty.channel.ChannelPipelineException",
      "io.netty.util.ByteProcessor$1",
      "io.netty.handler.ssl.SslHandler",
      "io.netty.handler.codec.http.DefaultHttpResponse",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "org.testng.collections.Maps",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.concurrent.EventExecutor",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.ByteProcessor$3",
      "io.netty.util.ByteProcessor$2",
      "io.netty.util.ResourceLeakHint",
      "org.testng.IHookable",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerAddedTask",
      "io.netty.channel.unix.LimitsStaticallyReferencedJniMethods",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.channel.ChannelMetadata",
      "io.netty.handler.codec.ByteToMessageDecoder",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.channel.ChannelOutboundBuffer$1",
      "io.netty.util.Recycler$2",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.Signal$1",
      "io.netty.channel.AbstractChannelHandlerContext$WriteAndFlushTask",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.buffer.AbstractPooledDerivedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.handler.codec.ValueConverter",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "org.asynchttpclient.exception.TooManyConnectionsException",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.channel.RecvByteBufAllocator$ExtendedHandle",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1",
      "io.netty.channel.ChannelId",
      "org.testng.internal.ClassHelper",
      "io.netty.util.AbstractConstant",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine",
      "io.netty.channel.unix.Socket",
      "org.testng.IInvokedMethodListener",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.channel.MessageSizeEstimator",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "org.testng.xml.XmlMethodSelectors",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "io.netty.channel.ChannelHandlerAdapter",
      "org.testng.ITestContext",
      "io.netty.handler.ssl.OpenSslEngineMap",
      "org.testng.junit.JUnitTestClass",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.handler.codec.http.HttpResponseStatus",
      "io.netty.channel.EventLoop",
      "io.netty.channel.epoll.EpollChannelConfig",
      "org.testng.xml.IFileParser",
      "io.netty.buffer.PoolArenaMetric",
      "org.asynchttpclient.channel.ChannelPool",
      "io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext",
      "org.asynchttpclient.exception.PoolAlreadyClosedException",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.handler.codec.DecoderResult",
      "org.asynchttpclient.util.Assertions",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.handler.ssl.ReferenceCountedOpenSslServerContext",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator",
      "org.asynchttpclient.HttpResponseBodyPart",
      "org.testng.IMethodInterceptor",
      "io.netty.util.AsciiString$2",
      "org.testng.xml.ISuiteParser",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "org.testng.SuiteRunner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.channel.AbstractChannelHandlerContext$WriteAndFlushTask$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.ChannelFutureListener$3",
      "io.netty.channel.ChannelFutureListener$2",
      "io.netty.channel.ChannelFutureListener$1",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.util.AsciiString$1",
      "org.testng.IConfigurable",
      "org.testng.IReporter",
      "io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl",
      "io.netty.channel.AbstractChannelHandlerContext$WriteTask$1",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.handler.ssl.OpenSslContext",
      "io.netty.util.concurrent.GenericFutureListener",
      "org.testng.xml.TestNGContentHandler",
      "io.reactivex.annotations.BackpressureKind",
      "org.testng.xml.Parser",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "io.netty.util.AttributeKey",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.handler.codec.CodecException",
      "org.testng.IAnnotationTransformer",
      "org.testng.xml.XmlTest",
      "io.netty.channel.DefaultChannelHandlerContext",
      "io.netty.handler.codec.http.DefaultHttpHeaders$2",
      "io.netty.handler.codec.http.DefaultHttpHeaders$1",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "org.asynchttpclient.Param",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.handler.codec.http.HttpRequest",
      "io.netty.channel.ChannelHandler$Sharable",
      "org.testng.xml.XmlSuite",
      "org.testng.ITestNGListener",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.channel.ServerChannel",
      "org.asynchttpclient.util.StringUtils",
      "org.testng.ITestClass",
      "io.netty.util.Recycler",
      "io.netty.util.AttributeKey$1",
      "io.netty.resolver.AddressResolverGroup",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.handler.codec.CharSequenceValueConverter",
      "io.netty.bootstrap.ChannelFactory",
      "org.asynchttpclient.ClientStats",
      "io.netty.channel.MessageSizeEstimator$Handle",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "org.testng.IAlterSuiteListener",
      "io.netty.util.internal.EmptyArrays",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.channel.ChannelFactory",
      "io.netty.handler.ssl.SslContext",
      "io.netty.util.concurrent.Promise",
      "org.testng.xml.IPostProcessor",
      "org.asynchttpclient.HostStats",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.AbstractChannel$AnnotatedConnectException",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.bootstrap.Bootstrap",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.channel.AbstractChannelHandlerContext$AbstractWriteTask",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "org.asynchttpclient.AsyncHttpClientConfig$AdditionalChannelInitializer",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.util.ConstantPool",
      "io.netty.util.BooleanSupplier",
      "org.asynchttpclient.HttpResponseStatus",
      "io.netty.channel.DefaultMessageSizeEstimator$HandleImpl",
      "io.netty.handler.codec.http.DefaultHttpRequest",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.buffer.AbstractByteBuf",
      "org.testng.IClass",
      "io.netty.handler.codec.DecoderException",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.handler.codec.DefaultHeaders",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.channel.unix.Limits",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.util.Timer",
      "io.netty.handler.codec.http.HttpResponse",
      "io.netty.channel.CombinedChannelDuplexHandler$1",
      "org.testng.internal.annotations.IAnnotationFinder",
      "io.netty.channel.ChannelOutboundBuffer$Entry",
      "org.testng.junit.JUnit3TestClass",
      "io.netty.channel.WriteBufferWaterMark",
      "org.asynchttpclient.netty.timeout.TimeoutsHolder",
      "io.netty.util.AbstractReferenceCounted",
      "org.asynchttpclient.filter.FilterException",
      "org.asynchttpclient.handler.ProgressAsyncHandler",
      "org.testng.ITestListener",
      "io.netty.channel.DefaultChannelPipeline$HeadContext",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.DefaultAttributeMap",
      "org.asynchttpclient.netty.channel.ChannelManager$3",
      "org.asynchttpclient.netty.channel.ChannelManager$4",
      "org.asynchttpclient.netty.channel.ChannelState",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "org.testng.internal.DynamicGraph",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter",
      "org.asynchttpclient.util.StringBuilderPool",
      "org.asynchttpclient.exception.RemotelyClosedException",
      "io.netty.channel.ChannelHandler",
      "io.netty.handler.codec.UnsupportedMessageTypeException",
      "io.netty.util.Signal",
      "io.netty.channel.DefaultChannelPipeline$1",
      "io.netty.util.Signal$SignalConstant"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.AsyncHttpClientConfig", false, HttpUtils_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HttpUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.util.HttpUtils",
      "org.asynchttpclient.util.StringBuilderPool",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "io.reactivex.annotations.BackpressureKind",
      "org.asynchttpclient.uri.Uri",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.AsciiString",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.handler.codec.http.HttpUtil",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "io.netty.handler.codec.DefaultHeaders",
      "io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl",
      "io.netty.handler.codec.CharSequenceValueConverter",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter",
      "io.netty.handler.codec.DefaultHeaders$NameValidator",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "org.asynchttpclient.AsyncCompletionHandler",
      "io.netty.util.CharsetUtil",
      "io.netty.handler.codec.http.HttpVersion",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "org.testng.log4testng.Logger",
      "org.testng.TestNG",
      "org.testng.xml.XmlTest",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator",
      "io.netty.handler.codec.http.DefaultHttpObject",
      "io.netty.handler.codec.http.DefaultHttpMessage",
      "io.netty.util.Signal",
      "io.netty.handler.codec.DecoderResult",
      "io.netty.handler.codec.http.HttpResponseStatus",
      "io.netty.buffer.Unpooled",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.util.NetUtil",
      "io.netty.channel.DefaultChannelId",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "io.netty.util.concurrent.DefaultPromise",
      "org.testng.junit.JUnitTestClass",
      "org.testng.junit.JUnit3TestClass"
    );
  }
}