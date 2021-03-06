/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 17:21:19 GMT 2017
 */

package spark.embeddedserver.jetty;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JettyHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "spark.embeddedserver.jetty.JettyHandler"; 
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
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "7"); 
    java.lang.System.setProperty("process_communication_port", "10880"); 
    java.lang.System.setProperty("initialization_timeout", "7"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "7"); 
    java.lang.System.setProperty("junit_tests", "true"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("analysis_criteria", ""); 
    java.lang.System.setProperty("sun.boot.library.path", "/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib"); 
    java.lang.System.setProperty("enable_asserts_for_evosuite", "false"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("configuration_id", "default"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("ctg_time_per_class", "3"); 
    java.lang.System.setProperty("write_pool", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/pools/spark.embeddedserver.jetty.JettyHandler.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "7"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeBig"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/evosuite-seeds/spark.embeddedserver.jetty.JettyHandler.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "44"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("gopherProxySet", "false"); 
    java.lang.System.setProperty("master_log_port", "50041"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/logs/spark.embeddedserver.jetty.JettyHandler"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/reports/spark.embeddedserver.jetty.JettyHandler"); 
    java.lang.System.setProperty("minimization_timeout", "7"); 
    java.lang.System.setProperty("CP_file_path", "/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/EvoSuite_classpathFile1210963553331084189.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/seeds/spark.embeddedserver.jetty.JettyHandler.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "spark.embeddedserver.jetty.JettyHandler"); 
    java.lang.System.setProperty("spawn_process_manager_port", "62907"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "7"); 
    java.lang.System.setProperty("test_dir", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/tests"); 
    java.lang.System.setProperty("search_budget", "44"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JettyHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.eclipse.jetty.server.ProxyConnectionFactory",
      "spark.route.RouteEntry",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.eclipse.jetty.webapp.FragmentDescriptor",
      "spark.Service$1",
      "org.eclipse.jetty.util.DeprecationWarning",
      "samples.servletmocking.SampleServlet",
      "spark.route.HttpMethod",
      "org.eclipse.jetty.security.SecurityHandler",
      "org.eclipse.jetty.util.Callback",
      "spark.embeddedserver.jetty.HttpRequestWrapper$CachedServletInputStream",
      "org.eclipse.jetty.webapp.DiscoveredAnnotation",
      "org.eclipse.jetty.util.TypeUtil",
      "org.eclipse.jetty.io.AbstractConnection",
      "org.eclipse.jetty.webapp.WebAppContext$Context",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "spark.TemplateViewRouteImpl",
      "org.eclipse.jetty.server.handler.gzip.GzipFactory",
      "org.eclipse.jetty.webapp.Origin",
      "org.eclipse.jetty.util.component.Destroyable",
      "org.eclipse.jetty.servlet.ServletHandler$CachedChain",
      "org.eclipse.jetty.util.thread.ThreadPool$SizedThreadPool",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.server.SecureRequestCustomizer",
      "org.eclipse.jetty.util.thread.Scheduler$Task",
      "org.eclipse.jetty.util.TreeTrie",
      "org.eclipse.jetty.server.HttpConfiguration",
      "org.eclipse.jetty.server.Authentication$User",
      "org.eclipse.jetty.util.IteratingCallback$Action",
      "org.eclipse.jetty.server.handler.ContextHandler$Availability",
      "org.eclipse.jetty.util.IteratingCallback$State",
      "spark.embeddedserver.jetty.JettyHandler",
      "org.eclipse.jetty.util.component.StopLifeCycle",
      "org.eclipse.jetty.http.HttpHeaderValue",
      "org.eclipse.jetty.server.RequestLog",
      "org.eclipse.jetty.util.MultiMap",
      "spark.ModelAndView",
      "org.eclipse.jetty.server.ConnectionFactory",
      "org.eclipse.jetty.io.WriteFlusher$State",
      "org.eclipse.jetty.server.HttpChannel$CommitCallback",
      "spark.HaltException",
      "org.eclipse.jetty.servlet.Holder$1",
      "org.eclipse.jetty.util.thread.Locker",
      "org.eclipse.jetty.server.session.UnwriteableSessionDataException",
      "org.eclipse.jetty.util.resource.ResourceCollection",
      "org.eclipse.jetty.util.DecoratedObjectFactory",
      "org.eclipse.jetty.webapp.ClasspathPattern$Entry",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.http.CookieCompliance",
      "org.eclipse.jetty.server.Authentication$Failure",
      "org.eclipse.jetty.security.ConstraintSecurityHandler",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.server.session.HouseKeeper",
      "org.eclipse.jetty.server.session.SessionHandler$1",
      "org.eclipse.jetty.webapp.AbstractConfiguration",
      "org.eclipse.jetty.webapp.WebXmlConfiguration",
      "org.eclipse.jetty.http.HttpGenerator$1",
      "org.eclipse.jetty.server.handler.ContextHandler$Context",
      "org.eclipse.jetty.servlet.FilterHolder",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.eclipse.jetty.server.HttpInput$EofContent",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$1",
      "org.eclipse.jetty.util.QuotedStringTokenizer",
      "org.eclipse.jetty.http.pathmap.RegexPathSpec",
      "org.eclipse.jetty.server.handler.ContextHandler$StaticContext",
      "org.eclipse.jetty.util.component.Graceful",
      "org.eclipse.jetty.server.session.SessionDataMap",
      "org.eclipse.jetty.server.session.SessionDataStore",
      "org.eclipse.jetty.server.HttpInput$Interceptor",
      "spark.staticfiles.StaticFilesFolder",
      "org.eclipse.jetty.util.component.Container$Listener",
      "org.eclipse.jetty.util.thread.Invocable$InvocationType",
      "org.eclipse.jetty.http.HttpGenerator",
      "org.eclipse.jetty.http.BadMessageException",
      "org.eclipse.jetty.util.resource.URLResource",
      "org.eclipse.jetty.server.session.SessionHandler$CookieConfig",
      "org.eclipse.jetty.util.resource.ResourceFactory",
      "org.eclipse.jetty.servlet.Source$Origin",
      "org.eclipse.jetty.servlet.ServletHolder$Config",
      "org.eclipse.jetty.xml.XmlParser$Node",
      "org.eclipse.jetty.http.HttpURI",
      "org.eclipse.jetty.util.thread.TimerScheduler",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.http.Http1FieldPreEncoder",
      "org.eclipse.jetty.server.session.DefaultSessionIdManager",
      "spark.utils.ResourceUtils",
      "org.eclipse.jetty.http.PathMap",
      "org.eclipse.jetty.http.HttpFields",
      "org.eclipse.jetty.server.handler.gzip.GzipHandler",
      "org.eclipse.jetty.security.ConstraintAware",
      "org.eclipse.jetty.http.pathmap.PathMappings",
      "org.eclipse.jetty.servlet.Source",
      "org.eclipse.jetty.server.HttpTransport",
      "org.eclipse.jetty.server.HttpInput$ErrorState",
      "spark.resource.InputStreamResource",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "spark.resource.ExternalResourceHandler",
      "org.eclipse.jetty.util.log.Logger",
      "spark.ResponseTransformer",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.eclipse.jetty.server.Request",
      "org.eclipse.jetty.servlet.ServletContextHandler",
      "org.eclipse.jetty.util.component.FileNoticeLifeCycleListener",
      "org.eclipse.jetty.util.thread.TimerScheduler$SimpleTask",
      "org.eclipse.jetty.server.HttpInput",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.servlet.ServletHolder$1",
      "org.eclipse.jetty.xml.XmlConfiguration",
      "org.eclipse.jetty.servlet.ServletContextHandler$Context",
      "org.eclipse.jetty.http.pathmap.MappedResource",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.eclipse.jetty.server.HttpInput$Content",
      "org.eclipse.jetty.io.FillInterest",
      "org.eclipse.jetty.http.HttpTokens$EndOfContent",
      "org.eclipse.jetty.webapp.DefaultsDescriptor",
      "org.eclipse.jetty.http.HttpParser",
      "org.eclipse.jetty.http.HttpTokens",
      "org.eclipse.jetty.http.PreEncodedHttpField",
      "org.eclipse.jetty.webapp.IterativeDescriptorProcessor",
      "org.eclipse.jetty.util.IO$ClosedIS",
      "org.eclipse.jetty.security.ConstraintMapping",
      "org.eclipse.jetty.server.HttpInputOverHTTP",
      "spark.ExceptionMapper",
      "spark.route.Routes",
      "spark.embeddedserver.jetty.websocket.WebSocketHandlerWrapper",
      "spark.FilterImpl$1",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.eclipse.jetty.webapp.DescriptorProcessor",
      "org.eclipse.jetty.http.HttpStatus$Code",
      "org.eclipse.jetty.server.SessionIdManager",
      "org.eclipse.jetty.util.Callback$Nested",
      "org.eclipse.jetty.xml.XmlParser",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.http.PreEncodedHttpField$1",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.eclipse.jetty.security.Authenticator$AuthConfiguration",
      "spark.Route",
      "org.eclipse.jetty.server.Authentication$Failed",
      "org.eclipse.jetty.security.Authenticator",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool",
      "org.eclipse.jetty.webapp.JettyWebXmlConfiguration",
      "org.eclipse.jetty.server.QuietServletException",
      "org.eclipse.jetty.http.HttpFieldPreEncoder",
      "org.eclipse.jetty.http.QuotedCSV",
      "org.eclipse.jetty.server.Authentication$Deferred",
      "org.eclipse.jetty.util.Callback$1",
      "org.eclipse.jetty.util.ArrayTernaryTrie",
      "org.eclipse.jetty.server.HttpConfiguration$Customizer",
      "spark.http.matching.RequestWrapper",
      "org.eclipse.jetty.webapp.WebAppContext",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.eclipse.jetty.io.EndPoint",
      "org.eclipse.jetty.util.security.Credential",
      "org.eclipse.jetty.server.handler.ErrorHandler$ErrorPageMapper",
      "org.eclipse.jetty.http.MetaData$Response",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.http.pathmap.PathSpec",
      "org.eclipse.jetty.io.WriteFlusher$WritingState",
      "org.eclipse.jetty.server.HttpChannelState",
      "org.eclipse.jetty.http.MetaData",
      "spark.resource.ExternalResource",
      "org.eclipse.jetty.server.session.FileSessionDataStore",
      "org.eclipse.jetty.server.HttpChannelState$Action",
      "org.eclipse.jetty.io.RuntimeIOException",
      "org.eclipse.jetty.util.Decorator",
      "org.eclipse.jetty.server.Authentication$Wrapped",
      "spark.RouteGroup",
      "org.eclipse.jetty.http.HttpCompliance",
      "org.eclipse.jetty.webapp.Descriptor",
      "org.eclipse.jetty.io.ByteBufferPool",
      "org.eclipse.jetty.webapp.ClasspathPattern$ByLocation",
      "org.eclipse.jetty.http.pathmap.ServletPathSpec",
      "org.eclipse.jetty.server.session.SessionCache",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$AbstractLifeCycleListener",
      "org.eclipse.jetty.servlet.Holder",
      "org.eclipse.jetty.webapp.ClasspathPattern",
      "org.eclipse.jetty.servlet.ListenerHolder",
      "org.eclipse.jetty.server.HttpChannelOverHttp",
      "org.eclipse.jetty.io.WriteFlusher$StateType",
      "org.eclipse.jetty.servlet.ServletContextHandler$Decorator",
      "spark.routematch.RouteMatch",
      "spark.servlet.FilterTools",
      "org.eclipse.jetty.server.Authentication$SendSuccess",
      "org.eclipse.jetty.server.session.AbstractSessionDataStore",
      "org.eclipse.jetty.server.session.AbstractSessionCache$PlaceHolderSession",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.server.HttpChannelState$AsyncRead",
      "org.eclipse.jetty.server.HttpChannel",
      "org.eclipse.jetty.util.ssl.SslContextFactory",
      "org.eclipse.jetty.http.HttpVersion",
      "freemarker.log.LoggerFactory",
      "org.eclipse.jetty.server.session.Session",
      "org.eclipse.jetty.io.ManagedSelector",
      "org.eclipse.jetty.webapp.MetaData",
      "spark.TemplateEngine",
      "org.eclipse.jetty.http.HttpHeader",
      "spark.Request",
      "org.eclipse.jetty.servlet.ErrorPageErrorHandler",
      "org.eclipse.jetty.server.session.SessionHandler$SessionIf",
      "spark.resource.AbstractResourceHandler",
      "spark.http.matching.ResponseWrapper",
      "org.eclipse.jetty.io.WriteFlusher$PendingState",
      "org.eclipse.jetty.io.WriteFlusher$IdleState",
      "org.eclipse.jetty.server.session.DatabaseAdaptor",
      "org.eclipse.jetty.http.HttpCookie",
      "org.eclipse.jetty.server.handler.ContextHandler$ApproveNonExistentDirectoryAliases",
      "org.eclipse.jetty.server.HttpOutput$Interceptor",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.session.SessionHandler",
      "org.eclipse.jetty.server.Authentication",
      "org.eclipse.jetty.server.Request$1",
      "org.eclipse.jetty.server.HttpConnection",
      "org.eclipse.jetty.http.HttpField",
      "org.eclipse.jetty.util.ssl.X509",
      "org.eclipse.jetty.webapp.MetaInfConfiguration",
      "spark.Spark$SingletonHolder",
      "spark.resource.AbstractResource",
      "spark.servlet.SparkApplication",
      "org.eclipse.jetty.util.MultiMap$1",
      "org.eclipse.jetty.webapp.Configuration",
      "org.eclipse.jetty.webapp.WebInfConfiguration",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "org.eclipse.jetty.webapp.WebDescriptor$1",
      "org.eclipse.jetty.util.thread.Invocable$1",
      "org.eclipse.jetty.webapp.ClasspathPattern$ByPackageOrName",
      "org.eclipse.jetty.util.thread.Invocable",
      "spark.ExceptionHandlerImpl",
      "org.eclipse.jetty.webapp.WebAppClassLoader$Context",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.io.WriteFlusher$CompletingState",
      "org.eclipse.jetty.util.IO$NullOS",
      "org.eclipse.jetty.server.Handler",
      "org.eclipse.jetty.server.HttpChannelState$State",
      "spark.Routable",
      "spark.resource.AbstractFileResolvingResource",
      "org.eclipse.jetty.http.HttpGenerator$State",
      "org.eclipse.jetty.security.Authenticator$Factory",
      "org.eclipse.jetty.server.HttpConnection$Content",
      "org.eclipse.jetty.webapp.MetaData$OriginInfo",
      "org.eclipse.jetty.server.UserIdentity",
      "org.eclipse.jetty.server.handler.ContextHandler$ContextScopeListener",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.PatternMatcher",
      "org.eclipse.jetty.servlet.ServletMapping",
      "org.eclipse.jetty.util.thread.Locker$UnLock",
      "org.eclipse.jetty.webapp.Configuration$ClassList",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.eclipse.jetty.http.HttpParser$RequestHandler",
      "org.eclipse.jetty.webapp.WebInfConfiguration$1",
      "org.eclipse.jetty.server.HttpInput$1",
      "org.eclipse.jetty.util.resource.Resource",
      "org.eclipse.jetty.webapp.WebInfConfiguration$2",
      "org.eclipse.jetty.server.HttpInput$2",
      "org.eclipse.jetty.io.Connection",
      "org.eclipse.jetty.server.HttpInput$3",
      "org.eclipse.jetty.server.HttpInput$4",
      "org.eclipse.jetty.io.AbstractEndPoint$3",
      "org.eclipse.jetty.server.HttpInput$5",
      "org.eclipse.jetty.servlet.FilterMapping",
      "org.eclipse.jetty.io.AbstractEndPoint$2",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.TemplateViewRoute",
      "org.eclipse.jetty.io.AbstractEndPoint$1",
      "org.eclipse.jetty.util.security.Password",
      "org.eclipse.jetty.webapp.ClasspathPattern$ByName",
      "org.eclipse.jetty.http.HttpParser$ComplianceHandler",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.util.resource.BadResource",
      "org.eclipse.jetty.io.Connection$UpgradeFrom",
      "org.eclipse.jetty.webapp.StandardDescriptorProcessor",
      "org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker",
      "org.eclipse.jetty.http.HttpStatus",
      "org.eclipse.jetty.server.session.Session$SessionInactivityTimeout",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.server.AbstractConnectionFactory",
      "org.eclipse.jetty.servlet.ServletHandler",
      "spark.servlet.MyApp",
      "org.eclipse.jetty.util.resource.JarResource$1",
      "freemarker.log.Logger",
      "spark.resource.ClassPathResource",
      "org.eclipse.jetty.util.URIUtil",
      "org.eclipse.jetty.util.Trie",
      "org.eclipse.jetty.util.IteratingCallback",
      "org.eclipse.jetty.servlet.Holder$HolderConfig",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.util.resource.PathResource",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.webapp.Ordering",
      "org.eclipse.jetty.servlet.BaseHolder",
      "org.eclipse.jetty.util.security.Constraint",
      "org.eclipse.jetty.util.Utf8Appendable$NotUtf8Exception",
      "spark.route.ServletRoutes",
      "org.eclipse.jetty.util.thread.Locker$Lock",
      "org.eclipse.jetty.http.HttpGenerator$Result",
      "spark.Filter",
      "org.eclipse.jetty.io.QuietException",
      "freemarker.ext.jsp.EventForwarding",
      "spark.embeddedserver.jetty.HttpRequestWrapper",
      "org.eclipse.jetty.http.HttpMethod",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.http.MetaData$Request",
      "spark.Response",
      "spark.Service",
      "org.eclipse.jetty.server.Connector",
      "spark.Spark",
      "org.eclipse.jetty.webapp.FragmentConfiguration",
      "spark.utils.Wrapper",
      "org.eclipse.jetty.server.AsyncContextEvent",
      "org.eclipse.jetty.io.EofException",
      "org.eclipse.jetty.server.Authentication$1",
      "org.eclipse.jetty.webapp.MetaDataComplete",
      "org.eclipse.jetty.server.Authentication$4",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.server.Authentication$5",
      "org.eclipse.jetty.server.Authentication$2",
      "org.eclipse.jetty.server.Authentication$3",
      "org.eclipse.jetty.server.handler.ErrorHandler",
      "spark.globalstate.ServletFlag",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.server.session.DefaultSessionCache",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "org.eclipse.jetty.server.HandlerContainer",
      "spark.RouteImpl$1",
      "org.eclipse.jetty.server.session.SessionContext",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.server.PushBuilder",
      "org.eclipse.jetty.servlet.ServletHolder",
      "org.eclipse.jetty.server.HttpChannel$Commit100Callback",
      "org.eclipse.jetty.util.IO",
      "org.eclipse.jetty.server.session.UnreadableSessionDataException",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.BufferUtil",
      "spark.staticfiles.DirectoryTraversal$DirectoryTraversalDetection",
      "org.eclipse.jetty.security.IdentityService",
      "org.eclipse.jetty.http.HttpParser$HttpHandler",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.http.HttpGenerator$PreparedResponse",
      "org.eclipse.jetty.server.session.JDBCSessionDataStore$SessionTableSchema",
      "org.eclipse.jetty.http.PathMap$MappedEntry",
      "org.eclipse.jetty.server.session.AbstractSessionCache",
      "spark.utils.StringUtils",
      "spark.resource.Resource",
      "org.eclipse.jetty.server.UserIdentity$Scope",
      "org.eclipse.jetty.webapp.WebAppClassLoader",
      "spark.resource.ClassPathResourceHandler",
      "org.eclipse.jetty.security.LoginService",
      "org.eclipse.jetty.security.ServerAuthException",
      "org.eclipse.jetty.util.IO$NullWrite",
      "org.eclipse.jetty.io.WriteFlusher$FailedState",
      "org.eclipse.jetty.util.resource.JarFileResource",
      "org.eclipse.jetty.util.ArrayUtil",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.server.HttpChannelState$Async",
      "org.eclipse.jetty.util.Attributes",
      "spark.ResponseTransformerRouteImpl",
      "org.eclipse.jetty.server.HttpInput$EOFState",
      "org.eclipse.jetty.server.session.JDBCSessionDataStore",
      "org.eclipse.jetty.server.handler.ContextHandler$AliasCheck",
      "org.eclipse.jetty.server.Authentication$Challenge",
      "org.eclipse.jetty.webapp.WebDescriptor",
      "spark.RouteImpl",
      "org.eclipse.jetty.server.Authentication$ResponseSent",
      "org.eclipse.jetty.util.Jetty",
      "spark.http.matching.MatcherFilter",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "spark.ExceptionHandler",
      "org.eclipse.jetty.webapp.ClasspathPattern$Type",
      "org.eclipse.jetty.util.resource.JarResource",
      "org.eclipse.jetty.http.HttpScheme",
      "org.eclipse.jetty.util.thread.Scheduler",
      "org.eclipse.jetty.server.HttpInput$State",
      "org.eclipse.jetty.server.session.Session$State",
      "org.eclipse.jetty.webapp.ClasspathPattern$ByPackage",
      "org.eclipse.jetty.util.resource.EmptyResource",
      "org.eclipse.jetty.server.HttpInput$SentinelContent",
      "org.eclipse.jetty.server.session.SessionData",
      "org.eclipse.jetty.server.handler.ContextHandler",
      "spark.servlet.SparkFilter",
      "org.eclipse.jetty.http.HostPortHttpField",
      "spark.FilterImpl",
      "org.eclipse.jetty.server.handler.ContextHandler$ApproveAliases",
      "org.eclipse.jetty.io.Connection$Listener"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.servlet.http.HttpServletResponse", false, JettyHandler_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JettyHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.server.session.SessionHandler",
      "spark.servlet.SparkFilter",
      "org.eclipse.jetty.servlet.BaseHolder",
      "org.eclipse.jetty.servlet.Holder",
      "org.eclipse.jetty.servlet.FilterHolder",
      "org.eclipse.jetty.servlet.Source",
      "org.eclipse.jetty.servlet.Holder$1",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.Jetty",
      "org.eclipse.jetty.server.handler.ContextHandler",
      "org.eclipse.jetty.servlet.ServletContextHandler",
      "org.eclipse.jetty.webapp.WebAppContext",
      "org.eclipse.jetty.server.handler.ErrorHandler",
      "org.eclipse.jetty.servlet.ErrorPageErrorHandler",
      "org.eclipse.jetty.server.handler.ContextHandler$Availability",
      "org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker",
      "org.eclipse.jetty.util.DecoratedObjectFactory",
      "org.eclipse.jetty.util.DeprecationWarning",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.eclipse.jetty.security.SecurityHandler",
      "org.eclipse.jetty.security.ConstraintSecurityHandler",
      "org.eclipse.jetty.http.PathMap",
      "org.eclipse.jetty.util.ArrayTernaryTrie",
      "org.eclipse.jetty.servlet.ServletHandler",
      "org.eclipse.jetty.util.resource.Resource",
      "org.eclipse.jetty.util.resource.EmptyResource",
      "org.eclipse.jetty.webapp.MetaData",
      "spark.globalstate.ServletFlag",
      "spark.utils.StringUtils",
      "spark.servlet.MyApp",
      "spark.Service",
      "spark.ExceptionMapper",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.Spark$SingletonHolder",
      "spark.Spark",
      "spark.utils.ResourceUtils",
      "spark.resource.AbstractResourceHandler",
      "spark.resource.ExternalResourceHandler",
      "spark.staticfiles.StaticFilesFolder",
      "spark.resource.ClassPathResourceHandler",
      "spark.route.HttpMethod",
      "spark.FilterImpl",
      "spark.route.ServletRoutes",
      "spark.route.Routes",
      "spark.RouteImpl",
      "spark.servlet.FilterTools",
      "spark.http.matching.MatcherFilter",
      "org.eclipse.jetty.util.URIUtil",
      "org.eclipse.jetty.server.session.SessionContext",
      "org.eclipse.jetty.util.thread.Locker",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "org.eclipse.jetty.server.HttpConfiguration",
      "org.eclipse.jetty.util.TreeTrie",
      "org.eclipse.jetty.util.BufferUtil",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.http.HttpScheme",
      "org.eclipse.jetty.http.CookieCompliance",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.http.HttpMethod",
      "org.eclipse.jetty.http.HttpVersion",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.server.session.AbstractSessionCache",
      "org.eclipse.jetty.server.session.DefaultSessionCache",
      "org.eclipse.jetty.util.resource.URLResource",
      "org.eclipse.jetty.util.component.FileNoticeLifeCycleListener",
      "org.eclipse.jetty.server.handler.gzip.GzipHandler",
      "org.eclipse.jetty.http.pathmap.PathMappings",
      "org.eclipse.jetty.servlet.FilterMapping",
      "org.eclipse.jetty.util.resource.ResourceCollection",
      "org.eclipse.jetty.servlet.ServletHolder",
      "org.eclipse.jetty.util.ArrayUtil",
      "org.eclipse.jetty.util.resource.PathResource",
      "org.eclipse.jetty.util.ssl.SslContextFactory",
      "org.eclipse.jetty.server.SecureRequestCustomizer",
      "org.eclipse.jetty.io.AbstractConnection",
      "org.eclipse.jetty.http.HttpField",
      "org.eclipse.jetty.http.PreEncodedHttpField$1",
      "org.eclipse.jetty.http.PreEncodedHttpField",
      "org.eclipse.jetty.http.HttpHeader",
      "org.eclipse.jetty.http.HttpHeaderValue",
      "org.eclipse.jetty.server.HttpConnection",
      "org.eclipse.jetty.util.thread.TimerScheduler",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.server.ProxyConnectionFactory",
      "org.eclipse.jetty.util.resource.JarResource",
      "org.eclipse.jetty.webapp.IterativeDescriptorProcessor",
      "org.eclipse.jetty.webapp.StandardDescriptorProcessor",
      "org.eclipse.jetty.webapp.WebDescriptor",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.io.FillInterest",
      "org.eclipse.jetty.io.WriteFlusher$StateType",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.eclipse.jetty.io.AbstractEndPoint$3",
      "org.eclipse.jetty.server.HttpChannel",
      "org.eclipse.jetty.server.HttpChannelState",
      "org.eclipse.jetty.server.HttpChannelState$AsyncRead",
      "org.eclipse.jetty.server.HttpChannelState$State",
      "org.eclipse.jetty.server.HttpChannelState$Async",
      "org.eclipse.jetty.util.MultiMap",
      "org.eclipse.jetty.server.Request",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.eclipse.jetty.util.Callback",
      "org.eclipse.jetty.server.HttpInput",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool",
      "org.eclipse.jetty.util.IteratingCallback$State",
      "org.eclipse.jetty.http.HttpFields",
      "org.eclipse.jetty.http.HttpStatus$Code",
      "org.eclipse.jetty.http.HttpStatus",
      "org.eclipse.jetty.http.HttpGenerator",
      "org.eclipse.jetty.http.HttpGenerator$State",
      "org.eclipse.jetty.http.HttpTokens$EndOfContent",
      "org.eclipse.jetty.server.HttpChannelOverHttp",
      "org.eclipse.jetty.util.TypeUtil",
      "samples.servletmocking.SampleServlet",
      "org.eclipse.jetty.webapp.ClasspathPattern",
      "org.eclipse.jetty.webapp.ClasspathPattern$ByName",
      "org.eclipse.jetty.webapp.ClasspathPattern$ByLocation",
      "org.eclipse.jetty.webapp.ClasspathPattern$Type",
      "freemarker.log.Logger",
      "freemarker.ext.jsp.EventForwarding",
      "org.eclipse.jetty.webapp.Configuration$ClassList",
      "org.eclipse.jetty.webapp.WebInfConfiguration",
      "org.eclipse.jetty.webapp.WebXmlConfiguration",
      "org.eclipse.jetty.webapp.MetaInfConfiguration",
      "org.eclipse.jetty.webapp.FragmentConfiguration",
      "org.eclipse.jetty.webapp.JettyWebXmlConfiguration",
      "org.eclipse.jetty.webapp.WebAppClassLoader",
      "org.eclipse.jetty.util.IO",
      "org.eclipse.jetty.util.resource.JarFileResource",
      "org.eclipse.jetty.server.session.SessionData",
      "org.eclipse.jetty.server.session.Session",
      "org.eclipse.jetty.server.session.Session$State",
      "org.eclipse.jetty.util.component.StopLifeCycle",
      "org.eclipse.jetty.server.QuietServletException",
      "org.eclipse.jetty.server.Authentication$Failed",
      "org.eclipse.jetty.server.session.AbstractSessionDataStore",
      "org.eclipse.jetty.server.session.JDBCSessionDataStore",
      "org.eclipse.jetty.util.MultiMap$1",
      "org.eclipse.jetty.server.session.DefaultSessionIdManager",
      "org.eclipse.jetty.server.session.FileSessionDataStore",
      "org.eclipse.jetty.server.Authentication"
    );
  }
}
