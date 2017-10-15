/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 03:00:37 GMT 2017
 */

package com.github.scribejava.core.extractors;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractOAuth1JSONTokenExtractor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.scribejava.core.extractors.AbstractOAuth1JSONTokenExtractor"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractOAuth1JSONTokenExtractor_ESTest_scaffolding.class.getClassLoader() ,
      "com.github.scribejava.core.extractors.AbstractOAuth1JSONTokenExtractor",
      "com.github.scribejava.core.extractors.TokenExtractor",
      "com.github.scribejava.core.extractors.OAuth1AccessTokenJSONExtractor",
      "com.github.scribejava.core.model.OAuth1AccessToken",
      "com.github.scribejava.core.extractors.OAuth1RequestTokenJSONExtractor",
      "com.github.scribejava.core.utils.Preconditions",
      "com.github.scribejava.core.model.OAuth1RequestToken",
      "com.github.scribejava.core.model.Token",
      "com.github.scribejava.core.extractors.OAuth1RequestTokenJSONExtractor$InstanceHolder",
      "com.github.scribejava.core.model.OAuth1Token",
      "com.github.scribejava.core.exceptions.OAuthException",
      "com.github.scribejava.core.model.Response",
      "com.github.scribejava.core.utils.StreamUtils",
      "com.github.scribejava.core.extractors.OAuth1AccessTokenJSONExtractor$InstanceHolder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractOAuth1JSONTokenExtractor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.scribejava.core.extractors.AbstractOAuth1JSONTokenExtractor",
      "com.github.scribejava.core.utils.Preconditions",
      "com.github.scribejava.core.extractors.OAuth1AccessTokenJSONExtractor$InstanceHolder",
      "com.github.scribejava.core.model.Token",
      "com.github.scribejava.core.model.OAuth1Token",
      "com.github.scribejava.core.model.OAuth1RequestToken",
      "com.github.scribejava.core.exceptions.OAuthException",
      "com.github.scribejava.core.extractors.OAuth1RequestTokenJSONExtractor$InstanceHolder",
      "com.github.scribejava.core.model.OAuth1AccessToken"
    );
  }
}
