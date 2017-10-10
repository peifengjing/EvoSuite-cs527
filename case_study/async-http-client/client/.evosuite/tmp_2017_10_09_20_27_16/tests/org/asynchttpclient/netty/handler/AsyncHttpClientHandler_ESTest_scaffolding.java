/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 10 04:02:19 GMT 2017
 */

package org.asynchttpclient.netty.handler;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AsyncHttpClientHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.netty.handler.AsyncHttpClientHandler"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AsyncHttpClientHandler_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.handler.ssl.ApplicationProtocolAccessor",
      "org.asynchttpclient.netty.handler.intercept.ProxyUnauthorized407Interceptor",
      "io.netty.util.AttributeMap",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.util.internal.Cleaner",
      "io.netty.handler.codec.http.HttpClientUpgradeHandler$SourceCodec",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "org.asynchttpclient.Request",
      "io.netty.channel.group.DefaultChannelGroup",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator",
      "io.reactivex.internal.schedulers.RxThreadFactory$RxCustomThread",
      "io.netty.handler.codec.http.HttpObject",
      "org.asynchttpclient.netty.NettyResponseStatus",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$3",
      "io.netty.handler.codec.http.HttpClientCodec",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$ExitCondition",
      "io.netty.handler.ssl.ApplicationProtocolNegotiator",
      "io.netty.util.internal.ReflectionUtil",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreLike",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.handler.ssl.ApplicationProtocolConfig",
      "org.asynchttpclient.netty.NettyResponseFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "org.asynchttpclient.netty.handler.intercept.Interceptors",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$1",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.HashedWheelTimer$HashedWheelBucket",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "org.asynchttpclient.netty.DiscardEvent",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueConsumerFields",
      "io.netty.handler.ssl.OpenSslServerContext",
      "io.reactivex.FlowableSubscriber",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator$1",
      "io.netty.util.ByteProcessor$1",
      "io.netty.handler.ssl.SslHandler",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.handler.codec.http.DefaultHttpResponse",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.handler.ssl.JdkSslClientContext",
      "io.netty.util.internal.PlatformDependent$1",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Consumer",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.asynchttpclient.ListenableFuture",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory",
      "org.asynchttpclient.SslEngineFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueueColdProducerFields",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.channel.group.ChannelMatcher",
      "io.netty.util.TimerTask",
      "io.netty.handler.codec.ByteToMessageDecoder",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.reactivex.internal.schedulers.RxThreadFactory",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.Signal$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "org.asynchttpclient.netty.request.body.NettyBody",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "io.netty.util.ResourceLeakDetectorFactory",
      "org.asynchttpclient.netty.request.NettyRequestSender",
      "io.netty.util.concurrent.Future",
      "org.asynchttpclient.netty.channel.Channels",
      "org.asynchttpclient.exception.TooManyConnectionsException",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.util.HashingStrategy$1",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.handler.codec.http.DefaultHttpObject",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.ChannelId",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory",
      "io.netty.util.AbstractConstant",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.handler.codec.http.HttpStatusClass",
      "io.netty.handler.codec.ByteToMessageDecoder$Cumulator",
      "io.netty.handler.ssl.OpenSslClientContext",
      "org.asynchttpclient.spnego.SpnegoEngineException",
      "io.netty.handler.ssl.NotSslRecordException",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.handler.ssl.OpenSslEngineMap",
      "io.netty.util.internal.PlatformDependent$AtomicLongCounter",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.handler.codec.http.HttpResponseStatus",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.internal.MacAddressUtil",
      "org.asynchttpclient.channel.ChannelPool",
      "org.asynchttpclient.exception.PoolAlreadyClosedException",
      "io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext",
      "io.reactivex.disposables.Disposable",
      "io.netty.handler.ssl.ReferenceCountedOpenSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.handler.codec.http.DefaultHttpMessage",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.util.AsciiString$2",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "org.asynchttpclient.netty.handler.intercept.Continue100Interceptor",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.reactivex.observers.BaseTestConsumer",
      "io.netty.util.AsciiString$1",
      "io.netty.util.ResourceLeak",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.util.HashingStrategy",
      "io.netty.util.internal.MathUtil",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "org.reactivestreams.Subscriber",
      "io.netty.buffer.ByteBufInputStream",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.EventLoopGroup",
      "org.asynchttpclient.netty.channel.ConnectionSemaphore",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue",
      "io.netty.handler.ssl.OpenSslContext",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.reactivex.annotations.BackpressureKind",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Supplier",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.handler.ssl.SslProvider",
      "io.netty.buffer.EmptyByteBuf",
      "org.reactivestreams.Subscription",
      "org.asynchttpclient.uri.Uri",
      "io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator",
      "org.asynchttpclient.filter.FilterContext",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "org.asynchttpclient.exception.TooManyConnectionsPerHostException",
      "io.netty.handler.codec.http.HttpMessage",
      "io.netty.handler.codec.PrematureChannelClosureException",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.AsciiString",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscUnboundedAtomicArrayQueue",
      "org.asynchttpclient.exception.ChannelClosedException",
      "io.netty.handler.ssl.CipherSuiteFilter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.hsqldb.jdbc.JDBCDriver",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.handler.codec.CodecException",
      "org.asynchttpclient.AsyncHttpClientState",
      "org.asynchttpclient.netty.handler.intercept.Redirect30xInterceptor",
      "io.netty.util.CharsetUtil",
      "org.asynchttpclient.netty.request.NettyRequestFactory",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.handler.codec.http.HttpRequest",
      "io.netty.channel.ChannelHandler$Sharable",
      "io.netty.handler.ssl.JdkSslContext",
      "io.reactivex.internal.util.VolatileSizeArrayList",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.channel.ChannelPipeline",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.handler.codec.http.cookie.Cookie",
      "io.netty.util.AttributeKey$1",
      "io.netty.channel.ChannelException",
      "org.asynchttpclient.handler.MaxRedirectException",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "org.asynchttpclient.Realm",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.handler.codec.http.cookie.ClientCookieEncoder$1",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.util.internal.PlatformDependent$Mpsc",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.bootstrap.ChannelFactory",
      "org.asynchttpclient.ClientStats",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueColdProducerFields",
      "io.netty.channel.ChannelFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.reactivex.subscribers.TestSubscriber$EmptySubscriber",
      "org.asynchttpclient.util.HttpConstants$ResponseStatusCodes",
      "io.netty.handler.ssl.SslContext",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "io.netty.util.concurrent.Promise",
      "org.reactivestreams.Publisher",
      "io.netty.util.ByteProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields",
      "org.asynchttpclient.HostStats",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.channel.Channel",
      "io.netty.bootstrap.Bootstrap",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.channel.group.ChannelGroupFuture",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "org.asynchttpclient.AsyncHttpClientConfig$AdditionalChannelInitializer",
      "io.netty.handler.codec.DecoderResultProvider",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "org.asynchttpclient.util.ThrowableUtil",
      "io.netty.util.ConstantPool",
      "org.asynchttpclient.netty.handler.intercept.Unauthorized401Interceptor",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscUnboundedArrayQueue",
      "org.asynchttpclient.HttpResponseStatus",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields",
      "io.netty.handler.codec.http.DefaultHttpRequest",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.bootstrap.AbstractBootstrap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.ChannelDuplexHandler",
      "io.reactivex.internal.schedulers.NonBlockingThread",
      "io.netty.channel.DefaultChannelId",
      "io.netty.handler.codec.DecoderException",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.channel.group.ChannelGroup",
      "org.asynchttpclient.netty.handler.WebSocketHandler",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueueColdProducerFields",
      "io.netty.handler.codec.http.cookie.CookieEncoder",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscGrowableAtomicArrayQueue",
      "org.asynchttpclient.netty.request.NettyRequest",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.channel.ChannelOutboundInvoker",
      "org.asynchttpclient.util.HttpConstants",
      "io.netty.util.HashedWheelTimer",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue",
      "io.netty.util.Timer",
      "io.netty.handler.codec.http.HttpResponse",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad3",
      "io.netty.channel.CombinedChannelDuplexHandler$1",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad1",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory",
      "io.netty.handler.codec.http.HttpVersion",
      "io.reactivex.exceptions.CompositeException",
      "org.asynchttpclient.netty.handler.AsyncHttpClientHandler",
      "org.asynchttpclient.netty.timeout.TimeoutsHolder",
      "io.netty.util.AbstractReferenceCounted",
      "io.netty.util.HashedWheelTimer$Worker",
      "org.asynchttpclient.filter.FilterException",
      "org.asynchttpclient.channel.NoopChannelPool",
      "org.asynchttpclient.netty.handler.HttpHandler",
      "io.netty.handler.codec.http.HttpContentDecoder",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "org.asynchttpclient.netty.channel.ChannelManager$3",
      "io.netty.handler.codec.http.cookie.ClientCookieEncoder",
      "org.asynchttpclient.netty.channel.ChannelManager$4",
      "io.reactivex.subscribers.TestSubscriber",
      "org.asynchttpclient.netty.channel.ChannelState",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad3",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad2",
      "io.netty.handler.ssl.ReferenceCountedOpenSslClientContext",
      "io.netty.handler.codec.MessageToMessageDecoder",
      "io.netty.util.Timeout",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad1",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.util.internal.PlatformDependent$Mpsc$1",
      "io.netty.util.NetUtil",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$WaitStrategy",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.channel.ChannelInboundInvoker",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.handler.ssl.JdkSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "org.asynchttpclient.netty.OnLastHttpContentCallback",
      "org.asynchttpclient.exception.RemotelyClosedException",
      "io.netty.channel.ChannelHandler",
      "io.netty.handler.codec.http.HttpContentDecompressor",
      "io.netty.handler.codec.UnsupportedMessageTypeException",
      "io.netty.util.Signal",
      "io.netty.util.Signal$SignalConstant"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.AsyncHttpClientConfig", false, AsyncHttpClientHandler_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AsyncHttpClientHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.netty.util.AbstractConstant",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.AttributeKey",
      "org.asynchttpclient.netty.channel.Channels",
      "org.asynchttpclient.netty.DiscardEvent",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "org.asynchttpclient.exception.ChannelClosedException",
      "io.reactivex.annotations.BackpressureKind",
      "org.asynchttpclient.netty.handler.intercept.Unauthorized401Interceptor",
      "org.asynchttpclient.netty.handler.intercept.ProxyUnauthorized407Interceptor",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.AsciiString",
      "io.netty.util.CharsetUtil",
      "io.netty.handler.codec.http.HttpResponseStatus",
      "org.asynchttpclient.util.HttpConstants$ResponseStatusCodes",
      "org.asynchttpclient.netty.handler.intercept.Redirect30xInterceptor",
      "org.asynchttpclient.handler.MaxRedirectException",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.HashedWheelTimer",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.util.internal.PlatformDependent$Mpsc",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueConsumerFields",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueColdProducerFields",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.HashedWheelTimer$HashedWheelBucket",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.handler.ssl.SslProvider",
      "io.netty.handler.ssl.SslContext",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "org.asynchttpclient.channel.NoopChannelPool",
      "io.netty.channel.group.DefaultChannelGroup",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.reactivex.internal.schedulers.RxThreadFactory",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "org.asynchttpclient.netty.request.NettyRequestSender",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "org.asynchttpclient.netty.request.NettyRequestFactory",
      "io.netty.handler.codec.http.cookie.ClientCookieEncoder",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "io.netty.handler.codec.CodecException",
      "io.netty.handler.codec.PrematureChannelClosureException",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.util.NetUtil",
      "io.netty.channel.DefaultChannelId",
      "io.reactivex.internal.util.VolatileSizeArrayList",
      "org.asynchttpclient.exception.TooManyConnectionsException",
      "org.asynchttpclient.exception.TooManyConnectionsPerHostException",
      "io.reactivex.subscribers.TestSubscriber$EmptySubscriber",
      "org.hsqldb.jdbc.JDBCDriver"
    );
  }
}