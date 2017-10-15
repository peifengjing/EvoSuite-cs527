/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 14 19:48:40 GMT 2017
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
public class CollectionUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springside.modules.utils.collection.CollectionUtil"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CollectionUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.AllEqualOrdering",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.PeekingIterator",
      "org.springside.modules.utils.collection.MapUtilTest$EnumA",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.math.IntMath",
      "com.google.common.base.Optional",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.Objects",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.base.Function",
      "com.google.common.collect.ComparatorOrdering",
      "org.springside.modules.utils.collection.CollectionUtil",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "org.springside.modules.utils.collection.MapUtilTest",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.TopKSelector",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "org.springside.modules.utils.collection.MapUtil$ValueCreator",
      "com.google.common.collect.ObjectArrays",
      "org.springside.modules.utils.collection.type.Pair",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.UnmodifiableIterator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, CollectionUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CollectionUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.math.IntMath",
      "com.google.common.math.IntMath$1"
    );
  }
}