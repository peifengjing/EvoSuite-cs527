/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 10 07:45:12 GMT 2017
 */

package org.asynchttpclient.netty.request.body;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NettyBodyBody_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.netty.request.body.NettyBodyBody"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NettyBodyBody_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "org.asynchttpclient.Request",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.handler.stream.ChunkedWriteHandler",
      "io.netty.handler.codec.http.HttpObject",
      "io.netty.buffer.ByteBufHolder",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.channel.socket.DatagramChannel",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "io.netty.channel.unix.DomainSocketAddress",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "org.asynchttpclient.request.body.generator.ReactiveStreamsBodyGenerator$SimpleSubscriber",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "io.netty.channel.epoll.EpollServerChannelConfig",
      "org.asynchttpclient.netty.NettyResponseFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.channel.socket.ServerSocketChannelConfig",
      "io.netty.util.internal.logging.InternalLogger",
      "org.asynchttpclient.request.body.Body$BodyState",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "org.asynchttpclient.request.body.generator.BodyGenerator",
      "io.netty.util.concurrent.EventExecutor",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.buffer.FixedCompositeByteBuf",
      "org.asynchttpclient.request.body.generator.ReactiveStreamsBodyGenerator$StreamedBody",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.asynchttpclient.ListenableFuture",
      "org.asynchttpclient.SslEngineFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "io.netty.handler.codec.http.HttpContent",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.Signal$1",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "org.asynchttpclient.netty.request.body.NettyBody",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.concurrent.Future",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "org.asynchttpclient.request.body.generator.QueueBasedFeedableBodyGenerator",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.channel.ChannelId",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline",
      "org.asynchttpclient.request.body.generator.BodyChunk",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.util.AbstractConstant",
      "io.netty.buffer.Unpooled",
      "io.netty.channel.unix.Socket",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.asynchttpclient.request.body.generator.FeedListener",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.channel.EventLoop",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.channel.epoll.EpollChannelConfig",
      "org.asynchttpclient.channel.ChannelPool",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "org.asynchttpclient.util.Assertions",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.channel.DefaultFileRegion",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.handler.codec.http.LastHttpContent",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "org.reactivestreams.Subscriber",
      "io.netty.channel.FileRegion",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.channel.EventLoopGroup",
      "org.asynchttpclient.netty.channel.ConnectionSemaphore",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "io.netty.channel.AbstractServerChannel$DefaultServerUnsafe",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "org.asynchttpclient.request.body.Body",
      "org.asynchttpclient.uri.Uri",
      "io.netty.util.AttributeKey",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.handler.ssl.CipherSuiteFilter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.channel.local.LocalAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.asynchttpclient.request.body.multipart.MultipartBody",
      "org.asynchttpclient.netty.request.WriteListener",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.channel.local.LocalChannel$State",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "org.asynchttpclient.request.body.generator.ReactiveStreamsBodyGenerator",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.ServerChannel",
      "io.netty.channel.ChannelException",
      "org.asynchttpclient.netty.request.body.BodyChunkedInput",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "org.asynchttpclient.Realm",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.AddressedEnvelope",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "org.asynchttpclient.request.body.generator.BoundedQueueFeedableBodyGenerator",
      "io.netty.util.concurrent.Promise",
      "io.netty.handler.ssl.SslContext",
      "org.reactivestreams.Publisher",
      "io.netty.util.ByteProcessor",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "org.asynchttpclient.request.body.generator.UnboundedQueueFeedableBodyGenerator",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.channel.local.LocalChannel$LocalUnsafe",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "org.asynchttpclient.AsyncHttpClientConfig$AdditionalChannelInitializer",
      "io.netty.handler.codec.DecoderResultProvider",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.util.ConstantPool",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.channel.AbstractServerChannel",
      "org.asynchttpclient.request.body.generator.PushBody$1",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.local.LocalChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLogLevel",
      "org.asynchttpclient.request.body.generator.PushBody",
      "io.netty.util.ResourceLeakDetector",
      "org.asynchttpclient.netty.request.NettyRequest",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.util.Timer",
      "io.netty.handler.stream.ChunkedInput",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "org.asynchttpclient.netty.timeout.TimeoutsHolder",
      "io.netty.util.AbstractReferenceCounted",
      "org.asynchttpclient.netty.request.body.NettyBodyBody",
      "io.netty.buffer.ByteBuf",
      "org.asynchttpclient.request.body.generator.FeedableBodyGenerator",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.channel.socket.DatagramChannelConfig",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.socket.DuplexChannel",
      "org.asynchttpclient.netty.channel.ChannelState",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.channel.ChannelInboundInvoker",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.channel.unix.ServerDomainSocketChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.channel.ChannelConfig",
      "org.asynchttpclient.request.body.RandomAccessBody",
      "io.netty.channel.ChannelHandler",
      "io.netty.util.Signal",
      "io.netty.util.Signal$SignalConstant"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.AsyncHttpClientConfig", false, NettyBodyBody_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NettyBodyBody_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.netty.request.WriteListener",
      "io.netty.handler.codec.http.LastHttpContent",
      "org.asynchttpclient.request.body.Body$BodyState",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.StringUtil",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.DefaultPromise",
      "org.asynchttpclient.request.body.generator.PushBody$1",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.handler.stream.ChunkedWriteHandler",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "io.netty.channel.local.LocalChannel",
      "org.asynchttpclient.netty.request.body.BodyChunkedInput",
      "io.netty.channel.AbstractServerChannel"
    );
  }
}