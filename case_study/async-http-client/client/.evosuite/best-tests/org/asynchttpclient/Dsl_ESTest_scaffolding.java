/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 16 01:50:44 GMT 2017
 */

package org.asynchttpclient;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Dsl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.Dsl"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Dsl_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.shaded.org.jctools.queues.LinkedArrayQueueUtil",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.util.internal.Cleaner",
      "org.asynchttpclient.proxy.ProxyServerSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.channel.group.DefaultChannelGroup",
      "org.asynchttpclient.Request",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator",
      "io.netty.handler.codec.http.HttpObject",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.handler.ssl.ApplicationProtocolNegotiator",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "org.asynchttpclient.filter.RequestFilter",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "org.asynchttpclient.channel.DefaultKeepAliveStrategy",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$2",
      "io.netty.util.internal.PlatformDependent0$4",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$1",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.HashedWheelTimer$HashedWheelBucket",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueConsumerFields",
      "io.netty.handler.ssl.OpenSslServerContext",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.resolver.DefaultNameResolver",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.handler.ssl.JdkSslClientContext",
      "org.asynchttpclient.request.body.generator.BodyGenerator",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "io.netty.util.internal.PlatformDependent$2",
      "org.asynchttpclient.AsyncHttpClient",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.channel.ChannelOption",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "org.asynchttpclient.Realm$1",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "org.asynchttpclient.ListenableFuture",
      "org.asynchttpclient.SslEngineFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueueColdProducerFields",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.util.RangeUtil",
      "io.netty.util.TimerTask",
      "org.asynchttpclient.RequestBuilder",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.Signal$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields",
      "io.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.handler.ssl.SslContextBuilder",
      "org.asynchttpclient.DefaultAsyncHttpClientConfig$Builder",
      "io.netty.util.concurrent.Future",
      "org.asynchttpclient.Realm$Builder",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "io.netty.buffer.ByteBufAllocator",
      "org.asynchttpclient.Realm$Builder$1",
      "io.netty.util.AbstractConstant",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.handler.ssl.OpenSslClientContext",
      "io.netty.channel.ChannelHandlerAdapter",
      "org.asynchttpclient.AsyncHandler",
      "org.asynchttpclient.channel.ChannelPool",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.handler.ssl.ReferenceCountedOpenSslServerContext",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "org.asynchttpclient.HttpResponseBodyPart",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.util.AsciiString$2",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "org.asynchttpclient.RequestBuilderBase",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "org.asynchttpclient.netty.EagerResponseBodyPart",
      "io.netty.util.AsciiString$1",
      "io.netty.util.ResourceLeak",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.HashingStrategy",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper",
      "io.netty.util.internal.MathUtil",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.buffer.ByteBufInputStream",
      "io.netty.channel.EventLoopGroup",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue",
      "io.netty.handler.ssl.OpenSslContext",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.handler.ssl.SslProvider",
      "org.asynchttpclient.uri.Uri",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.handler.codec.http.HttpMessage",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.AsciiString",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscUnboundedAtomicArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.handler.ssl.CipherSuiteFilter",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.asynchttpclient.config.AsyncHttpClientConfigDefaults",
      "org.asynchttpclient.proxy.ProxyServer$Builder",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.resolver.NameResolver",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "org.asynchttpclient.filter.ResponseFilter",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$2",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$1",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "org.asynchttpclient.Realm",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "org.asynchttpclient.netty.channel.DefaultChannelPool",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.util.internal.PlatformDependent$Mpsc",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.bootstrap.ChannelFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueueColdProducerFields",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.channel.ChannelFactory",
      "org.asynchttpclient.DefaultAsyncHttpClient",
      "io.netty.handler.ssl.SslContext",
      "io.netty.util.concurrent.Promise",
      "org.asynchttpclient.netty.ssl.DefaultSslEngineFactory",
      "io.netty.util.ByteProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$IdleChannelDetector",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper$Config",
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
      "io.netty.util.ConstantPool",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscUnboundedArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "org.asynchttpclient.DefaultAsyncHttpClientConfig",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.resolver.AddressResolver",
      "io.netty.channel.group.ChannelGroup",
      "org.asynchttpclient.netty.handler.WebSocketHandler",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.resolver.InetNameResolver",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueueColdProducerFields",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscGrowableAtomicArrayQueue",
      "org.asynchttpclient.Realm$AuthScheme",
      "io.netty.resolver.SimpleNameResolver",
      "io.netty.util.concurrent.DefaultPromise",
      "org.asynchttpclient.Dsl",
      "io.netty.util.HashedWheelTimer",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue",
      "io.netty.util.Timer",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad3",
      "org.asynchttpclient.netty.LazyResponseBodyPart",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueuePad1",
      "io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory",
      "org.asynchttpclient.netty.handler.AsyncHttpClientHandler",
      "org.asynchttpclient.netty.ssl.SslEngineFactoryBase",
      "io.netty.util.HashedWheelTimer$Worker",
      "org.asynchttpclient.channel.NoopChannelPool",
      "org.asynchttpclient.netty.handler.HttpHandler",
      "io.netty.handler.codec.http.HttpContentDecoder",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "org.asynchttpclient.netty.channel.ChannelManager$3",
      "org.asynchttpclient.netty.channel.ChannelManager$4",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad3",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad2",
      "io.netty.util.Timeout",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad1",
      "io.netty.handler.codec.MessageToMessageDecoder",
      "io.netty.handler.ssl.ReferenceCountedOpenSslClientContext",
      "io.netty.util.internal.PlatformDependent$Mpsc$1",
      "io.netty.handler.codec.http.HttpMethod",
      "io.netty.util.concurrent.EventExecutorGroup",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.util.internal.SystemPropertyUtil",
      "org.asynchttpclient.filter.IOExceptionFilter",
      "io.netty.handler.ssl.JdkSslServerContext",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "org.asynchttpclient.netty.OnLastHttpContentCallback",
      "io.netty.channel.ChannelHandler",
      "io.netty.handler.codec.http.HttpContentDecompressor",
      "org.asynchttpclient.util.HttpConstants$Methods",
      "io.netty.util.Signal",
      "io.netty.util.Signal$SignalConstant",
      "io.netty.util.concurrent.FailedFuture"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.AsyncHttpClientConfig", false, Dsl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.Realm", false, Dsl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Dsl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.netty.util.internal.MathUtil",
      "io.netty.util.AsciiString",
      "io.netty.handler.codec.http.HttpMethod",
      "org.asynchttpclient.util.HttpConstants$Methods",
      "org.asynchttpclient.Realm$AuthScheme",
      "org.asynchttpclient.Realm",
      "org.asynchttpclient.Realm$Builder",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "org.asynchttpclient.RequestBuilderBase",
      "org.asynchttpclient.config.AsyncHttpClientConfigDefaults",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper",
      "org.asynchttpclient.config.AsyncHttpClientConfigHelper$Config",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$1",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory$2",
      "org.asynchttpclient.AsyncHttpClientConfig$ResponseBodyPartFactory",
      "org.asynchttpclient.DefaultAsyncHttpClient",
      "org.asynchttpclient.DefaultAsyncHttpClientConfig",
      "org.asynchttpclient.proxy.ProxyServerSelector",
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
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "org.asynchttpclient.netty.channel.ChannelManager",
      "io.netty.handler.ssl.IdentityCipherSuiteFilter",
      "io.netty.handler.ssl.ClientAuth",
      "io.netty.handler.ssl.SslProvider",
      "io.netty.handler.ssl.SslContext",
      "io.netty.handler.ssl.SslContext$1",
      "io.netty.handler.ssl.SslUtils",
      "io.netty.handler.ssl.JdkSslContext",
      "io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator",
      "org.asynchttpclient.netty.channel.DefaultChannelPool",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$1",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy$2",
      "org.asynchttpclient.netty.channel.DefaultChannelPool$PoolLeaseStrategy",
      "io.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "io.netty.channel.group.DefaultChannelGroup",
      "org.asynchttpclient.channel.NoopChannelPool",
      "org.asynchttpclient.uri.Uri"
    );
  }
}