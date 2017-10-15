/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 14 19:57:31 GMT 2017
 */

package org.springside.modules.utils.collection;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class MapUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springside.modules.utils.collection.MapUtil"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MapUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ArrayListMultimap",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$LongByLongToLong",
      "com.google.common.collect.ImmutableMultimap$Itr",
      "com.google.common.collect.MapMakerInternalMap$EntrySet",
      "com.google.common.collect.MultimapBuilder",
      "com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapEntries",
      "com.google.common.collect.MultimapBuilder$ArrayListSupplier",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.PeekingIterator",
      "org.apache.commons.lang3.StringUtils",
      "com.google.common.collect.Maps$MapDifferenceImpl",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.math.IntMath",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$BiFun",
      "com.google.common.collect.MapMakerInternalMap$InternalEntryHelper",
      "com.google.common.collect.Multimaps$TransformedEntriesMultimap",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$EntrySetView",
      "com.google.common.collect.MultimapBuilder$EnumSetSupplier",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.Multimaps$CustomSortedSetMultimap",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl",
      "com.google.common.collect.RegularImmutableMultiset",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ValuesView",
      "com.google.common.collect.Maps$Values",
      "com.google.common.collect.AbstractSortedSetMultimap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.ImmutableMultimap$Values",
      "com.google.common.base.Converter$IdentityConverter",
      "org.apache.commons.lang3.JavaVersion",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.Maps$UnmodifiableBiMap",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.Iterators$12",
      "org.springside.modules.utils.base.Platforms",
      "com.google.common.collect.Iterators$11",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.google.common.base.Predicate",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.collect.ImmutableSet$Indexed$1",
      "com.google.common.collect.MultimapBuilder$SetMultimapBuilder",
      "org.springside.modules.utils.collection.type.primitive.IntObjectHashMap$KeySet",
      "com.google.common.collect.ForwardingSortedMap",
      "com.google.common.base.Joiner",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.Maps$TransformedEntriesMap",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl",
      "org.springside.modules.utils.collection.type.primitive.LongObjectMap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.Cut",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.collect.Maps$BiMapConverter",
      "org.apache.commons.lang3.SystemUtils",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.collect.Multimaps$Keys",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.base.Equivalence$Equals",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$KeySetView",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$1",
      "com.google.common.collect.Multimaps$UnmodifiableMultimap",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.base.Preconditions",
      "org.springside.modules.utils.collection.type.primitive.LongObjectHashMap$1",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.MapMakerInternalMap$InternalEntry",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.Joiner$1",
      "org.apache.commons.lang3.mutable.MutableInt",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "com.google.common.collect.MapMakerInternalMap$EntryIterator",
      "com.google.common.collect.AbstractNavigableMap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$TreeNode",
      "org.springside.modules.utils.collection.type.primitive.IntObjectHashMap$EntrySet",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$CounterCell",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment",
      "com.google.common.util.concurrent.AtomicLongMap",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Maps$AsMapView",
      "com.google.common.collect.ImmutableSetMultimap",
      "org.springside.modules.utils.collection.type.primitive.LongObjectHashMap$EntrySet",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.SortedSetMultimap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.ImmutableMapValues$1",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.ImmutableMapValues$2",
      "com.google.common.collect.TreeRangeMap$1",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.Maps$FilteredKeyMap",
      "com.google.common.collect.MapMakerInternalMap$KeySet",
      "com.google.common.collect.TreeRangeMap",
      "org.springside.modules.utils.collection.MapUtilTest",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.collect.MultimapBuilder$TreeSetSupplier",
      "com.google.common.collect.MapMakerInternalMap$AbstractStrongKeyEntry",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper",
      "com.google.common.collect.Maps$SortedMapDifferenceImpl",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.collect.Maps$FilteredEntryBiMap",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.base.Equivalence$Identity",
      "org.springside.modules.utils.collection.type.primitive.IntObjectMap",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Supplier",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$IntByIntToInt",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.collect.Maps$TransformedEntriesNavigableMap",
      "com.google.common.collect.MultimapBuilder$LinkedListSupplier",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$Fun",
      "com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet",
      "com.google.common.collect.Range$RangeLexOrdering",
      "com.google.common.collect.ForwardingCollection",
      "com.google.common.collect.Maps$FilteredEntrySortedMap",
      "com.google.common.collect.SortedMultisetBridge",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment",
      "com.google.common.collect.MapMakerInternalMap$Values",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.collect.Multimaps$UnmodifiableSortedSetMultimap",
      "com.google.common.collect.Multimaps$CustomSetMultimap",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.ForwardingMultimap",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.MapMakerInternalMap",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$Node",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ObjectToInt",
      "com.google.common.collect.LinkedListMultimap$Node",
      "com.google.common.collect.Multimaps$CustomListMultimap",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry",
      "com.google.common.collect.AllEqualOrdering",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$CollectionView",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "com.google.common.base.FunctionalEquivalence",
      "com.google.common.collect.Maps$UnmodifiableEntries",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection",
      "org.springside.modules.utils.collection.MapUtilTest$EnumA",
      "com.google.common.collect.Maps$NavigableKeySet",
      "com.google.common.collect.Multimaps$AsMap",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.SortedMultiset",
      "org.apache.commons.lang3.mutable.MutableLong",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ForwardingNode",
      "com.google.common.base.Optional",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ObjectToDouble",
      "com.google.common.collect.MapMakerInternalMap$StrongValueEntry",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Multimaps$TransformedEntriesListMultimap",
      "com.google.common.collect.Maps$KeySet",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ObjectByObjectToLong",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry",
      "com.google.common.collect.Maps$NavigableAsMapView",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.ImmutableMapKeySet",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1",
      "com.google.common.collect.Range",
      "com.google.common.collect.Maps$SortedKeySet",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6",
      "com.google.common.collect.Multisets",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$TreeBin",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$CounterHashCode",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$DoubleByDoubleToDouble",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ObjectByObjectToInt",
      "com.google.common.collect.MultimapBuilder$1",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.MultimapBuilder$2",
      "org.apache.commons.lang3.mutable.Mutable",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.collect.MultimapBuilder$3",
      "com.google.common.collect.Multimaps$UnmodifiableSetMultimap",
      "com.google.common.collect.MultimapBuilder$4",
      "org.springside.modules.utils.number.MathUtil",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$Traverser",
      "com.google.common.collect.Maps$AbstractFilteredMap",
      "com.google.common.collect.Multisets$5",
      "com.google.common.base.Equivalence$1",
      "com.google.common.collect.ImmutableMultimap$2",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.MapMakerInternalMap$SerializationProxy",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.Maps$FilteredEntryMap",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment",
      "com.google.common.collect.Maps$SortedAsMapView",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.Multimaps",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.MapMakerInternalMap$HashIterator",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.MapMakerInternalMap$AbstractSerializationProxy",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapIterator",
      "org.springside.modules.utils.collection.MapUtil",
      "com.google.common.collect.AbstractMapBasedMultimap$AsMap",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Maps$UnmodifiableEntrySet",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.MapMakerInternalMap$WriteThroughEntry",
      "com.google.common.collect.ConcurrentHashMultiset",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.RangeMap",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ConcurrentHashMapSpliterator",
      "org.springside.modules.utils.collection.type.primitive.IntObjectHashMap$1",
      "com.google.common.collect.Maps$FilteredEntryNavigableMap",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$Segment",
      "com.google.common.collect.Maps$UnmodifiableNavigableMap",
      "com.google.common.collect.MapMakerInternalMap$WeakValueEntry",
      "com.google.common.collect.MultimapBuilder$SortedSetMultimapBuilder",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator",
      "com.google.common.collect.MultimapBuilder$ListMultimapBuilder",
      "com.google.common.collect.MapMakerInternalMap$KeyIterator",
      "com.google.common.collect.AbstractMapBasedMultimap$KeySet",
      "com.google.common.collect.MapMakerInternalMap$ValueIterator",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedList",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.Maps$TransformedEntriesSortedMap",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ObjectToLong",
      "com.google.common.collect.MapMakerInternalMap$WeakValueReference",
      "com.google.common.collect.SingletonImmutableList",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ObjectByObjectToDouble",
      "com.google.common.base.Converter",
      "com.google.common.collect.LinkedListMultimap",
      "com.google.common.collect.Maps$6",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Maps$FilteredMapValues",
      "com.google.common.collect.MapMakerInternalMap$Strength$2",
      "com.google.common.collect.MapMakerInternalMap$Strength$1",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Multiset$Entry",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.collect.ForwardingMap",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$BiAction",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$ReservationNode",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.Maps$DescendingMap",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "org.springside.modules.utils.collection.type.primitive.IntObjectHashMap",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.ImmutableList$Builder",
      "org.springside.modules.utils.collection.type.primitive.LongObjectHashMap$KeySet",
      "com.google.common.collect.MapMakerInternalMap$SafeToArraySet",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys",
      "com.google.common.collect.Multimaps$UnmodifiableListMultimap",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.MapMakerInternalMap$CleanupMapTask",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableBiMapEntry",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.MapMakerInternalMap$DummyInternalEntry",
      "com.google.common.collect.MultimapBuilder$LinkedHashSetSupplier",
      "org.springside.modules.utils.collection.type.primitive.LongObjectHashMap",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ForwardingConcurrentMap",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.Multimaps$MapMultimap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.common.collect.Multisets$EntrySet",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "com.google.common.collect.ImmutableMultiset$1",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8$Action",
      "com.google.common.collect.MapMakerInternalMap$1",
      "org.springside.modules.utils.collection.MapUtil$ValueCreator",
      "com.google.common.collect.ConcurrentHashMultiset$EntrySet",
      "com.google.common.base.Equivalence",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.Maps",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.ImmutableSet$SerializedForm",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment",
      "org.apache.commons.lang3.math.NumberUtils",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.MultimapBuilder$HashSetSupplier",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.springside.modules.utils.collection.MapUtil$ValueCreator", false, MapUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MapUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.Collections2",
      "org.apache.commons.lang3.math.NumberUtils",
      "org.apache.commons.lang3.JavaVersion",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.SystemUtils",
      "org.springside.modules.utils.base.Platforms",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.base.Equivalence$Equals",
      "org.springside.modules.utils.collection.type.primitive.LongObjectHashMap",
      "com.google.common.collect.TreeRangeMap",
      "com.google.common.collect.Maps",
      "com.google.common.collect.MultimapBuilder",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys",
      "com.google.common.collect.MultimapBuilder$TreeSetSupplier",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.AbstractSortedSetMultimap",
      "com.google.common.collect.Multimaps$CustomSortedSetMultimap",
      "com.google.common.collect.ConcurrentHashMultiset",
      "com.google.common.collect.Multisets",
      "org.apache.commons.lang3.mutable.MutableInt",
      "org.springside.modules.utils.collection.type.primitive.IntObjectHashMap",
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.MapMakerInternalMap$Strength$1",
      "com.google.common.collect.MapMakerInternalMap$Strength$2",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.collect.MapMakerInternalMap",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.common.collect.Iterators",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment",
      "org.apache.commons.lang3.mutable.MutableLong",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.MultimapBuilder$ArrayListSupplier",
      "com.google.common.collect.Multimaps$CustomListMultimap",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.ImmutableMultimap$Values",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.math.IntMath",
      "com.google.common.collect.LinkedListMultimap",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.MultimapBuilder$LinkedHashSetSupplier",
      "com.google.common.collect.Multimaps$CustomSetMultimap",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "org.springside.modules.utils.concurrent.jsr166e.ConcurrentHashMapV8"
    );
  }
}
