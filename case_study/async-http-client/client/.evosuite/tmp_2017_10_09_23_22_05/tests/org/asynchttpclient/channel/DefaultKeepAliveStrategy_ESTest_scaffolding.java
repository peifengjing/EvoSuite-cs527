/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 10 07:57:40 GMT 2017
 */

package org.asynchttpclient.channel;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DefaultKeepAliveStrategy_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.channel.DefaultKeepAliveStrategy"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultKeepAliveStrategy_ESTest_scaffolding.class.getClassLoader() ,
      "org.asynchttpclient.request.body.generator.BodyGenerator",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "io.netty.util.AsciiString$2",
      "org.asynchttpclient.channel.KeepAliveStrategy",
      "io.netty.handler.codec.http.HttpVersion",
      "io.netty.handler.codec.http.HttpHeaders",
      "org.asynchttpclient.Realm",
      "org.asynchttpclient.Request",
      "io.netty.handler.codec.http.HttpMessage",
      "io.netty.util.AsciiString",
      "io.netty.handler.codec.http.HttpObject",
      "io.netty.util.AsciiString$1",
      "io.netty.util.HashingStrategy",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.CharsetUtil",
      "org.asynchttpclient.channel.DefaultKeepAliveStrategy",
      "io.netty.handler.codec.http.HttpRequest",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.resolver.NameResolver",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.handler.codec.http.HttpMethod",
      "io.netty.handler.codec.http.HttpResponseStatus",
      "io.netty.util.ByteProcessor",
      "io.netty.util.ReferenceCounted",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.handler.codec.DecoderResult",
      "org.asynchttpclient.uri.Uri",
      "io.netty.handler.codec.http.HttpResponse",
      "io.netty.handler.codec.http.HttpHeaderNames",
      "io.netty.handler.codec.DecoderResultProvider",
      "io.netty.handler.codec.http.HttpUtil"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("io.netty.handler.codec.http.HttpHeaders", false, DefaultKeepAliveStrategy_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.netty.handler.codec.http.HttpRequest", false, DefaultKeepAliveStrategy_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.netty.handler.codec.http.HttpResponse", false, DefaultKeepAliveStrategy_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.Request", false, DefaultKeepAliveStrategy_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultKeepAliveStrategy_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.netty.util.internal.MathUtil",
      "io.netty.util.AsciiString",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "io.netty.handler.codec.http.HttpHeaderNames",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.handler.codec.http.HttpUtil",
      "io.netty.util.CharsetUtil",
      "io.netty.handler.codec.http.HttpVersion"
    );
  }
}
