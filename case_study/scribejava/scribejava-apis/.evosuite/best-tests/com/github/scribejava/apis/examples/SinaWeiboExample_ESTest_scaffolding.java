/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 06:51:14 GMT 2017
 */

package com.github.scribejava.apis.examples;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SinaWeiboExample_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.scribejava.apis.examples.SinaWeiboExample"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SinaWeiboExample_ESTest_scaffolding.class.getClassLoader() ,
      "com.github.scribejava.core.model.Parameter",
      "com.github.scribejava.core.builder.ServiceBuilder",
      "com.github.scribejava.core.extractors.TokenExtractor",
      "com.github.scribejava.core.services.TimestampServiceImpl$Timer",
      "org.apache.commons.codec.EncoderException",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClient$BodyType$1",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClient$BodyType$2",
      "com.github.scribejava.core.extractors.HeaderExtractor",
      "org.apache.commons.codec.binary.Base64",
      "com.github.scribejava.apis.SinaWeiboApi",
      "com.github.scribejava.core.services.Base64Encoder",
      "com.github.scribejava.core.services.DatatypeConverterEncoder",
      "com.github.scribejava.core.builder.api.BaseApi",
      "com.github.scribejava.core.exceptions.OAuthException",
      "com.github.scribejava.apis.examples.SinaWeiboExample",
      "com.github.scribejava.core.httpclient.HttpClient",
      "com.github.scribejava.core.services.SignatureService",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClientConfig",
      "org.apache.commons.codec.binary.BaseNCodec",
      "org.apache.commons.codec.Encoder",
      "com.github.scribejava.core.httpclient.HttpClientConfig",
      "org.apache.commons.codec.DecoderException",
      "com.github.scribejava.core.utils.OAuthEncoder",
      "com.github.scribejava.core.model.OAuthConfig",
      "com.github.scribejava.core.model.Verb",
      "com.github.scribejava.core.services.HMACSha1SignatureService",
      "com.github.scribejava.core.extractors.BaseStringExtractor",
      "com.github.scribejava.core.extractors.HeaderExtractorImpl",
      "org.apache.commons.codec.BinaryDecoder",
      "org.apache.commons.codec.binary.BaseNCodec$Context",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClient$BodyType",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClient",
      "com.github.scribejava.core.services.TimestampService",
      "com.github.scribejava.core.model.ParameterList",
      "org.apache.commons.codec.BinaryEncoder",
      "com.github.scribejava.core.services.CommonsEncoder",
      "com.github.scribejava.core.exceptions.OAuthParametersMissingException",
      "com.github.scribejava.core.oauth.OAuth10aService",
      "com.github.scribejava.core.model.OAuth1AccessToken",
      "com.github.scribejava.core.utils.Preconditions",
      "com.github.scribejava.core.model.OAuth1RequestToken",
      "com.github.scribejava.core.model.Token",
      "com.github.scribejava.core.model.OAuth1Token",
      "com.github.scribejava.core.services.TimestampServiceImpl",
      "org.apache.commons.codec.Decoder",
      "com.github.scribejava.core.oauth.OAuth10aService$1",
      "com.github.scribejava.core.oauth.OAuthService",
      "com.github.scribejava.apis.SinaWeiboApi$InstanceHolder",
      "com.github.scribejava.core.builder.api.DefaultApi10a",
      "com.github.scribejava.core.model.OAuthAsyncRequestCallback",
      "com.github.scribejava.core.exceptions.OAuthSignatureException",
      "com.github.scribejava.core.model.OAuthRequest",
      "com.github.scribejava.core.model.Response",
      "com.github.scribejava.core.extractors.BaseStringExtractorImpl",
      "com.github.scribejava.core.builder.api.OAuth1SignatureType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SinaWeiboExample_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.scribejava.apis.examples.SinaWeiboExample",
      "com.github.scribejava.apis.SinaWeiboApi",
      "com.github.scribejava.apis.SinaWeiboApi$InstanceHolder",
      "com.github.scribejava.core.model.Verb",
      "com.github.scribejava.core.utils.Preconditions",
      "com.github.scribejava.core.oauth.OAuth10aService",
      "com.github.scribejava.core.model.OAuthRequest",
      "com.github.scribejava.core.model.ParameterList",
      "com.github.scribejava.core.services.HMACSha1SignatureService",
      "com.github.scribejava.core.services.Base64Encoder",
      "org.apache.commons.codec.binary.BaseNCodec",
      "org.apache.commons.codec.binary.Base64",
      "com.github.scribejava.core.extractors.BaseStringExtractorImpl",
      "com.github.scribejava.core.utils.OAuthEncoder",
      "com.github.scribejava.core.builder.api.OAuth1SignatureType",
      "com.github.scribejava.core.oauth.OAuth10aService$1",
      "com.github.scribejava.core.extractors.HeaderExtractorImpl",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClient$BodyType$1",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClient$BodyType$2",
      "com.github.scribejava.core.httpclient.jdk.JDKHttpClient$BodyType"
    );
  }
}
