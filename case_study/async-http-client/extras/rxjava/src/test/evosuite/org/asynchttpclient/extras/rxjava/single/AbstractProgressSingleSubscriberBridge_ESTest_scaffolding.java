/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 16 02:13:52 GMT 2017
 */

package org.asynchttpclient.extras.rxjava.single;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractProgressSingleSubscriberBridge_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.extras.rxjava.single.AbstractProgressSingleSubscriberBridge"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractProgressSingleSubscriberBridge_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.handler.codec.http.HttpMessage",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.AsciiString",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.handler.codec.http.CombinedHttpHeaders",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "io.netty.handler.codec.http.HttpObject",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.CharsetUtil",
      "org.asynchttpclient.AsyncHandler$State",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.NettyRuntime",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.handler.codec.DefaultHeadersImpl",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "rx.exceptions.Exceptions",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.util.internal.LongCounter",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.handler.codec.CharSequenceValueConverter",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.handler.codec.DefaultHeaders$NameValidator",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.buffer.PoolArena$SizeClass",
      "org.eclipse.jetty.util.PathWatcher",
      "org.asynchttpclient.extras.rxjava.single.AbstractSingleSubscriberBridge",
      "org.asynchttpclient.extras.rxjava.UnsubscribedException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "org.eclipse.jetty.util.PathWatcher$PathMatcherSet",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.util.ByteProcessor",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.handler.codec.ValueConverter",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.handler.codec.DecoderResultProvider",
      "io.netty.handler.codec.http.HttpUtil",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "org.eclipse.jetty.util.component.LifeCycle",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.buffer.Unpooled",
      "org.asynchttpclient.HttpResponseStatus",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "rx.exceptions.OnErrorNotImplementedException",
      "io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper",
      "io.netty.buffer.AbstractByteBuf",
      "rx.exceptions.OnCompletedFailedException",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.handler.codec.DefaultHeaders",
      "rx.Observer",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.handler.codec.Headers",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "rx.exceptions.CompositeException",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "org.asynchttpclient.HttpResponseBodyPart",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.buffer.PoolChunk",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "rx.Subscription",
      "org.asynchttpclient.extras.rxjava.single.AbstractProgressSingleSubscriberBridge",
      "io.netty.util.AsciiString$2",
      "io.netty.handler.codec.http.HttpVersion",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "rx.exceptions.OnErrorFailedException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "rx.SingleSubscriber",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.util.AsciiString$1",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.ResourceLeak",
      "org.asynchttpclient.handler.ProgressAsyncHandler",
      "io.netty.util.HashingStrategy",
      "io.netty.util.internal.MathUtil",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.handler.codec.DefaultHeaders$HeaderEntry",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "org.asynchttpclient.extras.rxjava.single.ProgressAsyncSingleSubscriberBridge",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter",
      "io.netty.buffer.EmptyByteBuf",
      "org.asynchttpclient.uri.Uri"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.handler.ProgressAsyncHandler", false, AbstractProgressSingleSubscriberBridge_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("rx.SingleSubscriber", false, AbstractProgressSingleSubscriberBridge_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractProgressSingleSubscriberBridge_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.extras.rxjava.single.AbstractSingleSubscriberBridge",
      "org.asynchttpclient.extras.rxjava.UnsubscribedException",
      "org.asynchttpclient.AsyncHandler$State",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.AsciiString",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.handler.codec.http.HttpUtil",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "io.netty.handler.codec.DefaultHeaders",
      "io.netty.handler.codec.CharSequenceValueConverter",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator",
      "io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "rx.exceptions.Exceptions",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.CharsetUtil",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.buffer.PoolArena",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.CompositeByteBuf",
      "org.asynchttpclient.uri.Uri",
      "io.netty.handler.codec.DefaultHeaders$NameValidator",
      "io.netty.handler.codec.http.HttpVersion",
      "io.netty.util.internal.EmptyArrays",
      "org.eclipse.jetty.util.PathWatcher$PathMatcherSet"
    );
  }
}
