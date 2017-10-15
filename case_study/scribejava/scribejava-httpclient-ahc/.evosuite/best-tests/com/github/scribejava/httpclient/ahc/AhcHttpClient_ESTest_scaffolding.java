/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 03:32:17 GMT 2017
 */

package com.github.scribejava.httpclient.ahc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AhcHttpClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.scribejava.httpclient.ahc.AhcHttpClient"; 
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
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AhcHttpClient_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$1",
      "io.netty.handler.ssl.ApplicationProtocolAccessor",
      "io.netty.handler.codec.http.HttpHeaders",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.channel.group.DefaultChannelGroup",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$5",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreInfinite",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$4",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$3",
      "org.asynchttpclient.netty.NettyResponseStatus",
      "io.netty.handler.codec.http.HttpClientCodec",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$2",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.util.internal.ReflectionUtil",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreLike",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.internal.ThreadLocalRandom",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$1",
      "org.asynchttpclient.netty.NettyResponseFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$2",
      "io.netty.util.internal.PlatformDependent0$4",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$1",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.HashedWheelTimer$HashedWheelBucket",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "org.asynchttpclient.SignatureCalculator",
      "io.netty.handler.ssl.OpenSslServerContext",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.handler.ssl.OpenSslSessionContext$EmptyEnumeration",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphore",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.handler.ssl.JdkSslClientContext",
      "org.asynchttpclient.request.body.generator.BodyGenerator",
      "io.netty.util.internal.PlatformDependent$2",
      "org.asynchttpclient.AsyncHttpClient",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.handler.codec.ByteToMessageDecoder$2",
      "io.netty.handler.codec.ByteToMessageDecoder$1",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.asynchttpclient.ListenableFuture",
      "org.asynchttpclient.SslEngineFactory",
      "org.asynchttpclient.request.body.multipart.Part",
      "io.netty.channel.group.ChannelMatcher",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.TimerTask",
      "io.netty.util.internal.ThrowableUtil",
      "org.asynchttpclient.RequestBuilder",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "org.asynchttpclient.DefaultAsyncHttpClientConfig$Builder",
      "io.netty.util.concurrent.Future",
      "org.asynchttpclient.netty.request.NettyRequestSender",
      "org.asynchttpclient.Realm$Builder",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.handler.codec.http.DefaultHttpObject",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.PoolChunkList",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.Unpooled",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.handler.codec.ByteToMessageDecoder$Cumulator",
      "io.netty.util.Recycler$Handle",
      "io.netty.handler.ssl.OpenSslClientContext",
      "io.netty.handler.ssl.NotSslRecordException",
      "io.netty.buffer.ByteBufProcessor",
      "io.netty.util.internal.PlatformDependent$AtomicLongCounter",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.handler.codec.http.DefaultHttpMessage",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.buffer.SlicedAbstractByteBuf",
      "org.asynchttpclient.RequestBuilderBase",
      "io.netty.util.internal.InternalThreadLocalMap",
      "org.asynchttpclient.netty.EagerResponseBodyPart",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper",
      "io.netty.util.internal.MathUtil",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.buffer.ByteBufInputStream",
      "io.netty.channel.EventLoopGroup",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Supplier",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "com.github.scribejava.core.model.Response",
      "org.asynchttpclient.uri.Uri",
      "io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator",
      "io.netty.buffer.ReadOnlyByteBuf",
      "com.github.scribejava.httpclient.ahc.AhcHttpClientConfig",
      "org.asynchttpclient.exception.TooManyConnectionsPerHostException",
      "io.netty.handler.codec.http.HttpMessage",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "com.github.scribejava.core.httpclient.AbstractAsyncOnlyHttpClient",
      "org.asynchttpclient.exception.ChannelClosedException",
      "io.netty.handler.ssl.CipherSuiteFilter",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "org.asynchttpclient.proxy.ProxyServer$Builder",
      "io.netty.util.CharsetUtil",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.handler.ssl.OpenSslKeyMaterialManager",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.ChannelException",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "org.asynchttpclient.Realm",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine$OpenSslSession",
      "org.asynchttpclient.netty.channel.DefaultChannelPool",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "org.asynchttpclient.DefaultAsyncHttpClient",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "org.asynchttpclient.netty.ssl.DefaultSslEngineFactory",
      "org.reactivestreams.Publisher",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$IdleChannelDetector",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueue",
      "io.netty.channel.group.ChannelGroupFuture",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext",
      "io.netty.handler.ssl.OpenSslExtendedKeyMaterialManager",
      "io.netty.util.UniqueName",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient",
      "io.netty.buffer.ByteBufProcessor$10",
      "io.netty.channel.ChannelPromise",
      "io.netty.bootstrap.AbstractBootstrap",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.channel.group.ChannelGroup",
      "com.github.scribejava.core.httpclient.HttpClientConfig",
      "org.asynchttpclient.netty.handler.WebSocketHandler",
      "com.github.scribejava.core.model.Verb",
      "io.netty.resolver.InetNameResolver",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueueColdProducerFields",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1",
      "org.asynchttpclient.netty.request.NettyRequest",
      "io.netty.util.HashedWheelTimer",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad2",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine$1",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad3",
      "org.asynchttpclient.netty.LazyResponseBodyPart",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad1",
      "io.netty.handler.ssl.OpenSslEngine",
      "org.asynchttpclient.netty.handler.AsyncHttpClientHandler",
      "org.asynchttpclient.netty.ssl.SslEngineFactoryBase",
      "io.netty.util.HashedWheelTimer$Worker",
      "io.netty.handler.codec.http.HttpContentDecoder",
      "org.asynchttpclient.netty.handler.HttpHandler",
      "io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior",
      "io.netty.buffer.ByteBuf",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.buffer.SlicedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.handler.codec.MessageToMessageDecoder",
      "io.netty.handler.ssl.ReferenceCountedOpenSslClientContext",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.channel.ChannelFuture",
      "io.netty.handler.ssl.JdkSslServerContext",
      "org.asynchttpclient.netty.OnLastHttpContentCallback",
      "io.netty.handler.codec.http.HttpContentDecompressor",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "org.asynchttpclient.Request",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator",
      "io.netty.handler.codec.http.HttpObject",
      "io.netty.handler.ssl.ApplicationProtocolNegotiator",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$ExitCondition",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.handler.ssl.ApplicationProtocolConfig",
      "org.asynchttpclient.channel.DefaultKeepAliveStrategy",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.channel.ChannelPipelineException",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueConsumerFields",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator$1",
      "io.netty.handler.ssl.SslHandler",
      "io.netty.resolver.DefaultNameResolver",
      "io.netty.handler.codec.http.DefaultHttpResponse",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.concurrent.EventExecutor",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.ThreadLocalRandom$1",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Consumer",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory",
      "io.netty.handler.codec.ByteToMessageDecoder",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$2",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "com.github.scribejava.core.model.OAuthRequest",
      "org.asynchttpclient.oauth.OAuthSignatureCalculator",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.handler.ssl.SslContextBuilder",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "org.asynchttpclient.exception.TooManyConnectionsException",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1",
      "io.netty.channel.ChannelId",
      "com.github.scribejava.core.model.OAuthRequest$ResponseConverter",
      "org.asynchttpclient.Realm$Builder$1",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine",
      "org.asynchttpclient.channel.ChannelPoolPartitionSelector",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.handler.ssl.ApplicationProtocolConfig$Protocol",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.handler.ssl.OpenSslEngineMap",
      "io.netty.buffer.DuplicatedAbstractByteBuf",
      "io.netty.buffer.PoolArenaMetric",
      "org.asynchttpclient.channel.ChannelPool",
      "org.asynchttpclient.exception.PoolAlreadyClosedException",
      "io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.PooledDirectByteBuf$1",
      "io.netty.handler.ssl.ReferenceCountedOpenSslServerContext",
      "org.asynchttpclient.HttpResponseBodyPart",
      "io.netty.handler.ssl.OpenSslSessionContext",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter$3",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter$2",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter$1",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "io.netty.handler.codec.http.HttpHeaders$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.ChannelFutureListener$3",
      "io.netty.channel.ChannelFutureListener$2",
      "io.netty.channel.ChannelFutureListener$1",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.handler.ssl.OpenSslContext",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.handler.ssl.SslProvider",
      "org.asynchttpclient.oauth.OAuthSignatureCalculator$1",
      "org.asynchttpclient.filter.FilterContext",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.handler.ssl.OpenSslServerSessionContext",
      "org.asynchttpclient.config.AsyncHttpClientConfigDefaults",
      "io.netty.handler.codec.CodecException",
      "com.github.scribejava.core.exceptions.OAuthException",
      "com.github.scribejava.core.httpclient.HttpClient",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.handler.codec.http.HttpRequest",
      "io.netty.channel.ChannelHandler$Sharable",
      "io.netty.resolver.NameResolver",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueTailField",
      "io.netty.util.Recycler",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$2",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$1",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueHeadLimitField",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "org.asynchttpclient.cookie.Cookie",
      "io.netty.util.ResourceLeakDetector$Level",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "io.netty.util.internal.PlatformDependent$Mpsc",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.bootstrap.ChannelFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueColdProducerFields",
      "io.netty.handler.ssl.SslContext",
      "io.netty.util.concurrent.Promise",
      "io.netty.handler.codec.http.HttpHeaderEntity",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.bootstrap.Bootstrap",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper$Config",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "org.asynchttpclient.AsyncHttpClientConfig$AdditionalChannelInitializer",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "org.asynchttpclient.HttpResponseStatus",
      "io.netty.handler.codec.http.DefaultHttpRequest",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "org.asynchttpclient.DefaultAsyncHttpClientConfig",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.resolver.AddressResolver",
      "io.netty.handler.codec.DecoderException",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.resolver.SimpleNameResolver",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior",
      "org.asynchttpclient.BoundRequestBuilder",
      "io.netty.util.Timer",
      "io.netty.handler.codec.http.HttpResponse",
      "io.netty.channel.CombinedChannelDuplexHandler$1",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerField",
      "org.asynchttpclient.netty.timeout.TimeoutsHolder",
      "io.netty.util.AbstractReferenceCounted",
      "org.asynchttpclient.filter.FilterException",
      "org.asynchttpclient.channel.NoopChannelPool",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "org.asynchttpclient.netty.channel.ChannelManager$4",
      "org.asynchttpclient.netty.channel.ChannelState",
      "org.asynchttpclient.netty.channel.ChannelManager$5",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.internal.IntegerHolder",
      "com.github.scribejava.core.model.OAuthAsyncRequestCallback",
      "io.netty.util.Timeout",
      "io.netty.util.internal.PlatformDependent$Mpsc$1",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$WaitStrategy",
      "io.netty.buffer.ByteBufProcessor$1",
      "io.netty.buffer.ByteBufProcessor$2",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.buffer.ByteBufProcessor$5",
      "io.netty.buffer.ByteBufProcessor$6",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.ByteBufProcessor$3",
      "io.netty.buffer.ByteBufProcessor$4",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.buffer.ByteBufProcessor$9",
      "io.netty.buffer.ByteBufProcessor$7",
      "org.asynchttpclient.exception.RemotelyClosedException",
      "io.netty.buffer.ByteBufProcessor$8",
      "io.netty.channel.ChannelHandler",
      "io.netty.handler.codec.UnsupportedMessageTypeException",
      "io.netty.util.Signal"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.github.scribejava.core.model.OAuthAsyncRequestCallback", false, AhcHttpClient_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.github.scribejava.core.model.OAuthRequest$ResponseConverter", false, AhcHttpClient_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AhcHttpClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter$1",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter$2",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter$3",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$BodySetter",
      "com.github.scribejava.core.model.Verb",
      "com.github.scribejava.httpclient.ahc.AhcHttpClient$1",
      "org.asynchttpclient.DefaultAsyncHttpClient",
      "org.asynchttpclient.config.AsyncHttpClientConfigDefaults",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper$Config",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$1",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$2",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "org.asynchttpclient.DefaultAsyncHttpClientConfig",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.HashedWheelTimer",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.util.internal.PlatformDependent$Mpsc",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.HashedWheelTimer$HashedWheelBucket",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.UniqueName",
      "io.netty.util.AttributeKey",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.handler.ssl.SslProvider",
      "io.netty.handler.ssl.SslContext",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "org.asynchttpclient.netty.channel.DefaultChannelPool",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$1",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$2",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy",
      "io.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "org.asynchttpclient.exception.TooManyConnectionsException",
      "org.asynchttpclient.exception.TooManyConnectionsPerHostException",
      "org.asynchttpclient.netty.channel.NonBlockingSemaphoreInfinite",
      "io.netty.channel.group.DefaultChannelGroup",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "org.asynchttpclient.channel.NoopChannelPool",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "org.asynchttpclient.oauth.OAuthSignatureCalculator",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "org.asynchttpclient.uri.Uri",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "org.asynchttpclient.RequestBuilderBase",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor"
    );
  }
}