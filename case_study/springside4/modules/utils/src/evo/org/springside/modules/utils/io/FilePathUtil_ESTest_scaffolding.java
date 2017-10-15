/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 14 20:10:55 GMT 2017
 */

package org.springside.modules.utils.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FilePathUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springside.modules.utils.io.FilePathUtil"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FilePathUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.io.Files$2",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.base.JdkPattern",
      "org.apache.commons.lang3.StringUtils",
      "com.google.common.io.Files$FileByteSink",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.collect.FluentIterable",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "org.springside.modules.utils.text.MoreStringUtil",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "org.apache.commons.lang3.JavaVersion",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CommonPattern",
      "com.google.common.io.ByteSink",
      "com.google.common.collect.TreeTraverser$1",
      "com.google.common.collect.TreeTraverser$2",
      "com.google.common.collect.TreeTraverser$3",
      "org.springside.modules.utils.base.Platforms",
      "com.google.common.collect.TreeTraverser$4",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.collect.TreeTraverser$PostOrderIterator",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.hash.HashFunction",
      "org.springside.modules.utils.io.FilePathUtil",
      "com.google.common.base.Splitter$Strategy",
      "com.google.common.base.Joiner",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.io.ByteProcessor",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.io.CharSink",
      "org.apache.commons.lang3.CharSequenceUtils",
      "com.google.common.collect.TreeTraverser",
      "com.google.common.collect.TreeTraverser$PreOrderIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.io.Files",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.io.Files$FileByteSource",
      "com.google.common.collect.FluentIterable$1",
      "com.google.common.collect.FluentIterable$2",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.io.CharSource",
      "com.google.common.io.ByteSource",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.Splitter$5",
      "org.apache.commons.lang3.SystemUtils",
      "com.google.common.hash.HashCode",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.io.FileWriteMode",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.io.LineProcessor",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.AbstractIterator",
      "com.google.common.io.ByteSource$ConcatenatedByteSource",
      "com.google.common.base.CharMatcher$Digit",
      "org.apache.commons.lang3.math.NumberUtils",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.base.CharMatcher$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FilePathUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.math.NumberUtils",
      "org.apache.commons.lang3.JavaVersion",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.SystemUtils",
      "org.springside.modules.utils.base.Platforms",
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
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.io.Files",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "org.apache.commons.lang3.CharSequenceUtils"
    );
  }
}
