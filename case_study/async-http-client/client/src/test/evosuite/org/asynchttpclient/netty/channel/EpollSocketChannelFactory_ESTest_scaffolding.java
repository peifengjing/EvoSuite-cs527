/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 16 01:34:07 GMT 2017
 */

package org.asynchttpclient.netty.channel;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EpollSocketChannelFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.netty.channel.EpollSocketChannelFactory"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EpollSocketChannelFactory_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.util.AttributeMap",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.channel.ChannelId",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.unix.Socket",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.DomainSocketAddress",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.socket.SocketChannel",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "org.asynchttpclient.netty.channel.EpollSocketChannelFactory",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.epoll.EpollChannelConfig",
      "io.netty.channel.ChannelException",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.channel.socket.SocketChannelConfig",
      "io.netty.util.AbstractReferenceCounted",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.internal.StringUtil",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.channel.epoll.EpollSocketChannelConfig",
      "io.netty.bootstrap.ChannelFactory",
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.channel.unix.UnixChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.socket.DuplexChannel",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.channel.ChannelFactory",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.FileRegion",
      "io.netty.util.Attribute",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.util.ReferenceCounted",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.Channel",
      "io.netty.channel.ChannelConfig",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.concurrent.Future",
      "io.netty.channel.epoll.EpollSocketChannel$EpollSocketChannelUnsafe"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EpollSocketChannelFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.StringUtil",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor"
    );
  }
}
