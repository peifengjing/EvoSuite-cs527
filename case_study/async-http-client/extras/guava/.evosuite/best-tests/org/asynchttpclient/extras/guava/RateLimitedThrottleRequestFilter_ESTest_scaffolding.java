/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 16 02:02:48 GMT 2017
 */

package org.asynchttpclient.extras.guava;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class RateLimitedThrottleRequestFilter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.extras.guava.RateLimitedThrottleRequestFilter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RateLimitedThrottleRequestFilter_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.CharMatcher$FastMatcher",
      "io.netty.util.HashingStrategy$1",
      "io.netty.handler.codec.http.HttpHeaders",
      "org.asynchttpclient.Request",
      "com.google.common.base.CharMatcher$12",
      "io.netty.util.AsciiString",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$10",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.util.concurrent.RateLimiter$SleepingTicker$1",
      "com.google.common.base.CharMatcher$13",
      "org.asynchttpclient.HttpResponseStatus",
      "com.google.common.base.Platform",
      "com.google.common.util.concurrent.RateLimiter$WarmingUp",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "org.asynchttpclient.filter.RequestFilter",
      "org.asynchttpclient.extras.guava.RateLimitedThrottleRequestFilter",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "org.asynchttpclient.AsyncHandler",
      "com.google.common.base.Ticker",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "com.google.common.base.Predicate",
      "com.google.common.base.Ticker$1",
      "org.asynchttpclient.filter.FilterContext$1",
      "com.google.common.util.concurrent.RateLimiter$1",
      "com.google.common.util.concurrent.RateLimiter",
      "io.netty.util.AsciiString$1",
      "org.asynchttpclient.filter.FilterException",
      "io.netty.util.HashingStrategy",
      "com.google.common.util.concurrent.RateLimiter$SleepingTicker",
      "io.netty.util.internal.MathUtil",
      "com.google.common.util.concurrent.RateLimiter$Bursty",
      "com.google.common.base.Platform$1",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$NegatedMatcher",
      "io.netty.util.ByteProcessor",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$4",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.base.CharMatcher$9",
      "org.asynchttpclient.filter.ReleasePermitOnComplete",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$7",
      "org.asynchttpclient.filter.FilterContext$FilterContextBuilder",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.Preconditions",
      "org.asynchttpclient.filter.FilterContext",
      "com.google.common.base.CharMatcher$1",
      "io.netty.handler.codec.http.HttpUtil"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.filter.FilterContext", false, RateLimitedThrottleRequestFilter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RateLimitedThrottleRequestFilter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.extras.guava.RateLimitedThrottleRequestFilter",
      "com.google.common.base.Ticker",
      "com.google.common.util.concurrent.RateLimiter$SleepingTicker",
      "com.google.common.base.Platform",
      "org.asynchttpclient.filter.FilterException"
    );
  }
}