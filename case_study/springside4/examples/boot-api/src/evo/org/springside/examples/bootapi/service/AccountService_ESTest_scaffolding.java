/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 14 18:01:42 GMT 2017
 */

package org.springside.examples.bootapi.service;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AccountService_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springside.examples.bootapi.service.AccountService"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AccountService_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.AbstractCache$StatsCounter",
      "org.springframework.beans.factory.annotation.Autowired",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.collect.PeekingIterator",
      "org.apache.commons.lang3.StringUtils",
      "com.google.common.base.JdkPattern",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.math.IntMath",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.cache.LocalCache$WriteThroughEntry",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.cache.Weigher",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.collect.RegularImmutableMap",
      "org.apache.commons.lang3.JavaVersion",
      "com.google.common.cache.LocalCache$EntryFactory$6",
      "com.google.common.cache.LocalCache$EntryFactory$7",
      "com.google.common.cache.LocalCache$EntryFactory$8",
      "com.google.common.cache.LocalCache$EntryFactory$2",
      "com.google.common.io.ByteSink",
      "com.google.common.collect.Iterators$10",
      "com.google.common.cache.LocalCache$EntryFactory$3",
      "com.google.common.cache.LocalCache$StrongAccessWriteEntry",
      "com.google.common.cache.LocalCache$EntryFactory$4",
      "com.google.common.collect.Iterators$12",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$EntryFactory$5",
      "com.google.common.collect.Iterators$11",
      "com.google.common.base.Predicate",
      "com.google.common.cache.LocalCache$EntryFactory$1",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.collect.ImmutableSet$Indexed$1",
      "org.springframework.transaction.annotation.Isolation",
      "com.google.common.cache.CacheBuilderSpec",
      "com.google.common.io.MultiReader",
      "com.google.common.cache.LocalCache$WeakWriteEntry",
      "com.google.common.cache.LocalCache$KeyIterator",
      "com.google.common.util.concurrent.ExecutionError",
      "com.google.common.cache.LocalCache$ValueReference",
      "com.google.common.io.CharSequenceReader",
      "org.springframework.data.repository.NoRepositoryBean",
      "org.springside.examples.bootapi.service.exception.ServiceException",
      "com.google.common.cache.LocalCache",
      "com.google.common.math.MathPreconditions",
      "org.springside.examples.bootapi.domain.Account",
      "org.springframework.stereotype.Service",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.cache.LocalCache$StrongAccessEntry",
      "com.google.common.io.ReaderInputStream",
      "com.google.common.cache.LocalCache$LocalManualCache$1",
      "com.google.common.cache.LocalCache$KeySet",
      "com.google.common.cache.LocalCache$StrongValueReference",
      "org.apache.commons.lang3.SystemUtils",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.Equivalence$Equals",
      "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle",
      "com.google.common.cache.ForwardingCache",
      "org.springside.modules.utils.text.HashUtil$1",
      "com.google.common.base.Preconditions",
      "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.cache.LocalCache$ManualSerializationProxy",
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.google.common.io.BaseEncoding$5",
      "com.google.common.io.BaseEncoding$3",
      "org.springframework.data.repository.Repository",
      "org.springside.modules.utils.text.EncodeUtil",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.cache.LocalCache$WeightedWeakValueReference",
      "org.springside.examples.bootapi.service.exception.ErrorCode",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Iterators$6",
      "com.google.common.cache.LocalCache$EntrySet",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.io.BaseEncoding$DecodingException",
      "com.google.common.io.BaseEncoding$1",
      "com.google.common.io.BaseEncoding$2",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Iterators$5",
      "com.google.common.cache.CacheLoader",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.cache.LocalCache$SoftValueReference",
      "com.google.common.cache.CacheLoader$FunctionToCacheLoader",
      "com.google.common.base.Splitter$Strategy",
      "org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle",
      "com.google.common.cache.LocalCache$WeightedSoftValueReference",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.util.concurrent.ListenableFuture",
      "com.google.common.base.Supplier",
      "com.google.common.cache.LocalCache$WeakEntry",
      "org.apache.commons.lang3.builder.ToStringStyle",
      "com.google.common.io.CharSource$EmptyCharSource",
      "com.google.common.io.CharSource$ConcatenatedCharSource",
      "com.google.common.io.BaseEncoding$Base64Encoding",
      "com.google.common.cache.LocalCache$WeakAccessWriteEntry",
      "org.springside.modules.utils.misc.IdGenerator",
      "com.google.common.collect.ImmutableList",
      "org.springframework.transaction.annotation.Propagation",
      "com.google.common.util.concurrent.UncheckedExecutionException",
      "com.google.common.cache.LocalCache$2",
      "com.google.common.io.CharSource",
      "com.google.common.cache.CacheBuilder$NullListener",
      "org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle",
      "com.google.common.cache.LocalCache$1",
      "com.google.common.cache.LocalCache$StrongEntry",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.cache.LocalCache$Strength$3",
      "com.google.common.cache.LocalCache$Strength$2",
      "com.google.common.cache.LocalCache$Strength$1",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.cache.LocalCache$Segment",
      "com.google.common.cache.LocalCache$ReferenceEntry",
      "com.google.common.io.ByteSource$ByteArrayByteSource",
      "com.google.common.io.ByteSource$ConcatenatedByteSource",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.cache.Cache",
      "com.google.common.cache.LocalCache$EntryIterator",
      "org.springframework.transaction.annotation.Transactional",
      "com.google.common.math.IntMath$1",
      "com.google.common.cache.LocalCache$WeightedStrongValueReference",
      "com.google.common.cache.LoadingCache",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.base.FunctionalEquivalence",
      "org.springside.modules.utils.text.Charsets",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.Suppliers$SupplierFunctionImpl",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.cache.CacheLoader$1",
      "org.apache.commons.lang3.builder.ToStringStyle$NoClassNameToStringStyle",
      "org.springside.examples.bootapi.service.AccountService",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.base.Optional",
      "com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.CacheLoader$InvalidCacheLoadException",
      "com.google.common.cache.LocalCache$Values",
      "com.google.common.cache.LocalCache$WeakValueReference",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.base.Ticker",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.base.CommonPattern",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.base.Present",
      "com.google.common.base.Equivalence$1",
      "com.google.common.io.ByteSink$AsCharSink",
      "com.google.common.cache.CacheStats",
      "com.google.common.cache.RemovalCause$4",
      "com.google.common.io.CharSource$CharSequenceCharSource",
      "com.google.common.cache.RemovalCause$5",
      "org.springside.examples.bootapi.repository.AccountDao",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.cache.RemovalCause$1",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.cache.RemovalCause$2",
      "com.google.common.cache.RemovalCause$3",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.base.JdkPattern$JdkMatcher",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.cache.LocalCache$HashIterator",
      "com.google.common.collect.SingletonImmutableSet",
      "org.springframework.beans.factory.annotation.Value",
      "com.google.common.cache.CacheLoader$SupplierToCacheLoader",
      "com.google.common.base.Suppliers$ThreadSafeSupplier",
      "com.google.common.base.PatternCompiler",
      "com.google.common.base.Splitter$3$1",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.io.ByteSource",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.io.BaseEncoding",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.google.common.cache.LocalCache$WriteQueue",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.io.ByteSource$EmptyByteSource",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.cache.RemovalListener",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.io.ByteSource$AsCharSource",
      "com.google.common.io.MultiInputStream",
      "com.google.common.io.BaseEncoding$StandardBaseEncoding$2",
      "com.google.common.io.BaseEncoding$StandardBaseEncoding$1",
      "com.google.common.base.Platform",
      "com.google.common.base.CommonMatcher",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.apache.commons.lang3.builder.ToStringStyle$JsonToStringStyle",
      "com.google.common.io.BaseEncoding$SeparatedBaseEncoding",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Splitter",
      "org.springframework.boot.actuate.metrics.CounterService",
      "com.google.common.base.Function",
      "com.google.common.io.BaseEncoding$Base16Encoding",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.io.ByteSource$SlicedByteSource",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.base.Suppliers$SupplierFunction",
      "org.springside.modules.utils.text.HashUtil",
      "org.apache.commons.lang3.builder.ToStringBuilder",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.cache.LocalCache$Strength",
      "com.google.common.cache.LocalCache$NullEntry",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.cache.LocalCache$WeakAccessEntry",
      "com.google.common.io.BaseEncoding$Alphabet",
      "com.google.common.cache.LocalCache$LoadingSerializationProxy",
      "org.springframework.data.repository.CrudRepository",
      "com.google.common.io.CharSink",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.cache.LocalCache$AbstractCacheSet",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.cache.LocalCache$LocalLoadingCache",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.common.base.Suppliers",
      "com.google.common.io.CharSource$AsByteSource",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.base.Splitter$3",
      "com.google.common.cache.RemovalNotification",
      "com.google.common.base.Equivalence",
      "com.google.common.cache.LocalCache$LoadingValueReference",
      "com.google.common.cache.LocalCache$ValueIterator",
      "com.google.common.cache.LocalCache$StrongWriteEntry",
      "com.google.common.io.BaseEncoding$StandardBaseEncoding",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.collect.ImmutableSet$SerializedForm",
      "org.springframework.stereotype.Component",
      "com.google.common.cache.RemovalCause",
      "org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.AbstractIterator",
      "com.google.common.cache.CacheBuilder$1",
      "org.apache.commons.lang3.math.NumberUtils",
      "org.apache.commons.lang3.builder.Builder",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.cache.CacheBuilder$2"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.springframework.boot.actuate.metrics.CounterService", false, AccountService_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.springside.examples.bootapi.repository.AccountDao", false, AccountService_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AccountService_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springside.examples.bootapi.service.AccountService",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.transaction.annotation.Isolation",
      "org.springside.examples.bootapi.service.exception.ErrorCode",
      "org.springside.modules.utils.text.Charsets",
      "org.springside.modules.utils.text.HashUtil",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher",
      "com.google.common.math.IntMath",
      "com.google.common.math.IntMath$1",
      "com.google.common.io.BaseEncoding",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache",
      "com.google.common.cache.LocalCache$Strength$1",
      "com.google.common.cache.LocalCache$Strength$2",
      "com.google.common.cache.LocalCache$Strength$3",
      "com.google.common.cache.LocalCache$Strength",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.LocalCache$EntryFactory$1",
      "com.google.common.cache.LocalCache$EntryFactory$2",
      "com.google.common.cache.LocalCache$EntryFactory$3",
      "com.google.common.cache.LocalCache$EntryFactory$4",
      "com.google.common.cache.LocalCache$EntryFactory$5",
      "com.google.common.cache.LocalCache$EntryFactory$6",
      "com.google.common.cache.LocalCache$EntryFactory$7",
      "com.google.common.cache.LocalCache$EntryFactory$8",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.LocalCache$Segment",
      "org.springside.examples.bootapi.service.exception.ServiceException",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle",
      "org.apache.commons.lang3.math.NumberUtils",
      "org.apache.commons.lang3.JavaVersion",
      "org.apache.commons.lang3.SystemUtils",
      "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$NoClassNameToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$JsonToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle",
      "org.apache.commons.lang3.builder.ToStringBuilder",
      "org.springside.modules.utils.misc.IdGenerator",
      "com.google.common.cache.LocalCache$NullEntry",
      "com.google.common.cache.RemovalCause$1",
      "com.google.common.cache.RemovalCause$2",
      "com.google.common.cache.RemovalCause$3",
      "com.google.common.cache.RemovalCause$4",
      "com.google.common.cache.RemovalCause$5",
      "com.google.common.cache.RemovalCause",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Iterators"
    );
  }
}