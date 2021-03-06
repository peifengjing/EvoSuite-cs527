/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 17:23:33 GMT 2017
 */

package spark.examples.gzip;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class GzipExample_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "spark.examples.gzip.GzipExample"; 
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
    java.lang.System.setProperty("user.timezone", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GzipExample_ESTest_scaffolding.class.getClassLoader() ,
      "spark.route.Routes",
      "spark.embeddedserver.jetty.websocket.WebSocketHandlerWrapper",
      "spark.Routable",
      "spark.resource.AbstractFileResolvingResource",
      "spark.route.RouteEntry",
      "spark.ResponseTransformerRouteImpl",
      "spark.resource.AbstractResource",
      "spark.utils.Wrapper",
      "spark.examples.gzip.GzipExample",
      "spark.Service$StaticFiles",
      "spark.Service$1",
      "spark.utils.StringUtils",
      "spark.examples.gzip.GzipClient",
      "spark.Request",
      "spark.RouteImpl",
      "spark.globalstate.ServletFlag",
      "spark.route.HttpMethod",
      "spark.resource.Resource",
      "spark.Route",
      "spark.Redirect",
      "spark.resource.AbstractResourceHandler",
      "spark.RouteImpl$1",
      "spark.resource.ClassPathResourceHandler",
      "spark.utils.Assert",
      "spark.HaltException",
      "spark.ExceptionHandlerImpl",
      "spark.staticfiles.StaticFilesFolder",
      "spark.resource.InputStreamResource",
      "spark.ExceptionHandler",
      "spark.TemplateViewRouteImpl",
      "spark.resource.ClassPathResource",
      "spark.Response",
      "spark.Service",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.Spark",
      "spark.Spark$SingletonHolder",
      "spark.ExceptionMapper",
      "spark.staticfiles.DirectoryTraversal$DirectoryTraversalDetection"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GzipExample_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "spark.examples.gzip.GzipExample",
      "spark.Service",
      "spark.ExceptionMapper",
      "spark.globalstate.ServletFlag",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.Spark$SingletonHolder",
      "spark.Spark",
      "spark.resource.AbstractResourceHandler",
      "spark.resource.ClassPathResourceHandler",
      "spark.staticfiles.StaticFilesFolder",
      "spark.utils.StringUtils",
      "spark.route.HttpMethod",
      "spark.RouteImpl",
      "spark.route.Routes"
    );
  }
}
