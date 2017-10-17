/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 16 00:42:54 GMT 2017
 */

package org.asynchttpclient.netty.ssl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DefaultSslEngineFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.netty.ssl.DefaultSslEngineFactory"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultSslEngineFactory_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$1",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.handler.ssl.ApplicationProtocolAccessor",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$5",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$4",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$3",
      "io.netty.buffer.ByteBufHolder",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$2",
      "io.netty.handler.ssl.util.SimpleTrustManagerFactory$2",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.handler.ssl.util.SimpleTrustManagerFactory$1",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.handler.ssl.ApplicationProtocolNegotiator",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.handler.ssl.ApplicationProtocolConfig",
      "io.netty.util.internal.CleanerJava9",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.handler.ssl.OpenSslServerContext",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator$1",
      "io.netty.handler.ssl.SslHandler",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.handler.ssl.JdkSslClientContext",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.util.internal.LongCounter",
      "io.netty.handler.ssl.util.SimpleTrustManagerFactory",
      "io.netty.util.internal.StringUtil",
      "io.netty.handler.ssl.util.InsecureTrustManagerFactory",
      "io.netty.handler.ssl.OpenSslSessionStats",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory",
      "org.asynchttpclient.SslEngineFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.handler.ssl.PemReader",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.handler.codec.ByteToMessageDecoder",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "io.netty.util.ReferenceCounted",
      "io.netty.handler.ssl.util.SimpleTrustManagerFactory$SimpleTrustManagerFactorySpi",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.buffer.AbstractPooledDerivedByteBuf",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.handler.ssl.SslContextBuilder",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.PoolChunkList",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.buffer.Unpooled",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.handler.ssl.ApplicationProtocolConfig$Protocol",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Recycler$Handle",
      "io.netty.handler.ssl.OpenSslClientContext",
      "io.netty.handler.ssl.NotSslRecordException",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.handler.ssl.OpenSslEngineMap",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArenaMetric",
      "org.asynchttpclient.channel.ChannelPool",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.buffer.PooledDuplicatedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.handler.ssl.ReferenceCountedOpenSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.handler.ssl.OpenSslSessionContext",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.handler.ssl.util.InsecureTrustManagerFactory$1",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.ThreadDeathWatcher$Watcher",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.buffer.ByteBufInputStream",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.EventLoopGroup",
      "io.netty.util.ThreadDeathWatcher",
      "io.netty.handler.ssl.OpenSslContext",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.handler.ssl.SslProvider",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.AsciiString",
      "io.netty.handler.ssl.PemEncoded",
      "io.netty.handler.ssl.PemX509Certificate",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.handler.ssl.CipherSuiteFilter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.util.CharsetUtil",
      "io.netty.buffer.PoolArena$HeapArena",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "io.netty.util.ThreadDeathWatcher$Entry",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.handler.ssl.OpenSslKeyMaterialManager",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledSlicedByteBuf",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$DefaultOpenSslEngineMap",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.Recycler",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.ReferenceCountUtil",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "org.asynchttpclient.Realm",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.handler.ssl.util.X509TrustManagerWrapper",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.handler.ssl.OpenSsl",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "io.netty.handler.ssl.SslContext",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "org.asynchttpclient.netty.ssl.DefaultSslEngineFactory",
      "io.netty.util.ByteProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "org.asynchttpclient.AsyncHttpClientConfig$AdditionalChannelInitializer",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$AllocatorAwareSslEngineWrapperFactory",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.handler.ssl.PemPrivateKey",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.buffer.PoolChunk",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.util.Timer",
      "io.netty.handler.ssl.ReferenceCountedOpenSslEngine$1",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.buffer.AbstractByteBufAllocator$1",
      "io.netty.handler.ssl.OpenSslEngine",
      "io.netty.util.AbstractReferenceCounted",
      "org.asynchttpclient.netty.ssl.SslEngineFactoryBase",
      "io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.handler.ssl.ApplicationProtocolUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.handler.ssl.ReferenceCountedOpenSslClientContext",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.handler.ssl.JdkSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.channel.ChannelHandler"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("io.netty.handler.ssl.SslContextBuilder", false, DefaultSslEngineFactory_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.AsyncHttpClientConfig", false, DefaultSslEngineFactory_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultSslEngineFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.netty.handler.ssl.SslProvider",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.handler.ssl.util.SimpleTrustManagerFactory$1",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.handler.ssl.util.SimpleTrustManagerFactory",
      "io.netty.handler.ssl.util.InsecureTrustManagerFactory",
      "io.netty.util.CharsetUtil",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.internal.CleanerJava9",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.handler.ssl.SslContext",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "io.netty.util.AbstractReferenceCounted",
      "io.netty.handler.ssl.PemPrivateKey",
      "io.netty.buffer.Unpooled",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.Recycler",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.ThreadDeathWatcher$Watcher",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.ThreadDeathWatcher",
      "io.netty.buffer.AbstractByteBufAllocator$1",
      "io.netty.handler.ssl.PemX509Certificate",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.handler.ssl.PemReader",
      "io.netty.handler.ssl.ApplicationProtocolConfig",
      "io.netty.handler.ssl.ApplicationProtocolUtil",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext",
      "io.netty.handler.ssl.ReferenceCountedOpenSslContext$3",
      "io.netty.handler.ssl.OpenSsl",
      "io.netty.util.ReferenceCountUtil",
      "io.netty.handler.ssl.ClientAuth"
    );
  }
}