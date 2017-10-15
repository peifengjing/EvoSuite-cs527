/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 17:15:42 GMT 2017
 */

package spark.embeddedserver;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EmbeddedServers_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "spark.embeddedserver.EmbeddedServers"; 
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
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "11"); 
    java.lang.System.setProperty("process_communication_port", "17744"); 
    java.lang.System.setProperty("initialization_timeout", "11"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "11"); 
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
    java.lang.System.setProperty("write_pool", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/pools/spark.embeddedserver.EmbeddedServers.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "11"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeBig"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/evosuite-seeds/spark.embeddedserver.EmbeddedServers.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "72"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("gopherProxySet", "false"); 
    java.lang.System.setProperty("master_log_port", "49814"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/logs/spark.embeddedserver.EmbeddedServers"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/reports/spark.embeddedserver.EmbeddedServers"); 
    java.lang.System.setProperty("minimization_timeout", "11"); 
    java.lang.System.setProperty("CP_file_path", "/var/folders/v8/rj6w407j3xx_dly8hk6y81w40000gn/T/EvoSuite_classpathFile3272860479517539381.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/seeds/spark.embeddedserver.EmbeddedServers.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "spark.embeddedserver.EmbeddedServers"); 
    java.lang.System.setProperty("spawn_process_manager_port", "62907"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "11"); 
    java.lang.System.setProperty("test_dir", "/Users/Peifeng/Desktop/Study/Topics-in-Software-Engineering/GitLab/evosuite/case_study/spark/.evosuite/tmp_2017_10_13_08_08_32/tests"); 
    java.lang.System.setProperty("search_budget", "72"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EmbeddedServers_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "spark.route.RouteEntry",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "spark.resource.AbstractResource",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.JsonDeserializationContext",
      "spark.route.HttpMethod",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.Excluder",
      "spark.utils.MimeParse",
      "com.google.gson.annotations.Until",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "org.eclipse.jetty.server.Handler",
      "com.google.gson.stream.JsonReader$1",
      "org.eclipse.jetty.util.component.Destroyable",
      "com.google.gson.internal.$Gson$Types",
      "spark.resource.AbstractFileResolvingResource",
      "spark.ssl.SslStores",
      "spark.utils.MimeParse$FitnessAndQuality",
      "com.google.gson.Gson$FutureTypeAdapter",
      "org.eclipse.jetty.util.log.Log$1",
      "com.google.gson.stream.JsonWriter",
      "spark.embeddedserver.jetty.JettyHandler",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.$Gson$Preconditions",
      "org.eclipse.jetty.util.component.Dumpable",
      "spark.HaltException",
      "com.google.gson.JsonNull",
      "spark.staticfiles.StaticFilesConfiguration",
      "com.google.gson.LongSerializationPolicy$1",
      "com.google.gson.LongSerializationPolicy$2",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.bind.JsonTreeReader$1",
      "com.google.gson.Gson$3",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$4",
      "com.google.gson.Gson$5",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.server.session.SessionHandler$1",
      "spark.serialization.Serializer",
      "com.google.gson.internal.bind.TypeAdapters$22$1",
      "com.google.gson.Gson",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.server.session.SessionDataMap",
      "org.eclipse.jetty.server.session.SessionDataStore",
      "spark.staticfiles.StaticFilesFolder",
      "org.eclipse.jetty.util.component.Container$Listener",
      "com.google.gson.internal.Excluder$1",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.internal.bind.JsonTreeWriter$1",
      "spark.resource.ClassPathResource",
      "com.google.gson.JsonIOException",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "spark.utils.SparkUtils",
      "org.eclipse.jetty.http.BadMessageException",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.session.SessionHandler$CookieConfig",
      "spark.serialization.SerializerChain",
      "com.google.gson.FieldNamingPolicy",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.http.Http1FieldPreEncoder",
      "spark.utils.ResourceUtils",
      "spark.Filter",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.JsonSyntaxException",
      "spark.embeddedserver.EmbeddedServers",
      "spark.resource.InputStreamResource",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "spark.Response",
      "spark.resource.ExternalResourceHandler",
      "org.eclipse.jetty.util.log.Logger",
      "spark.embeddedserver.EmbeddedServers$Identifiers",
      "org.eclipse.jetty.server.Request",
      "com.google.gson.reflect.TypeToken",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "spark.utils.Wrapper",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "com.google.gson.FieldNamingStrategy",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.google.gson.ExclusionStrategy",
      "org.eclipse.jetty.server.HttpInput",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.server.HandlerContainer",
      "spark.RouteImpl$1",
      "spark.embeddedserver.jetty.JettyServer",
      "spark.embeddedserver.EmbeddedServer",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "spark.embeddedserver.EmbeddedServerFactory",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters$31",
      "org.eclipse.jetty.server.session.UnreadableSessionDataException",
      "com.google.gson.JsonArray",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.http.PreEncodedHttpField",
      "spark.serialization.BytesSerializer",
      "com.google.gson.TypeAdapterFactory",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "spark.staticfiles.DirectoryTraversal$DirectoryTraversalDetection",
      "spark.route.Routes",
      "spark.FilterImpl$1",
      "org.eclipse.jetty.server.SessionIdManager",
      "com.google.gson.stream.JsonReader",
      "spark.utils.StringUtils",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "spark.resource.Resource",
      "spark.Route",
      "spark.resource.ClassPathResourceHandler",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "spark.embeddedserver.jetty.EmbeddedJettyServer",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "org.eclipse.jetty.http.HttpFieldPreEncoder",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "spark.http.matching.RequestWrapper",
      "org.eclipse.jetty.util.Attributes",
      "com.google.gson.TypeAdapter$1",
      "org.eclipse.jetty.util.component.LifeCycle",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "spark.embeddedserver.jetty.EmbeddedJettyFactory",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "spark.RouteImpl",
      "spark.resource.ExternalResource",
      "spark.serialization.DefaultSerializer",
      "spark.serialization.InputStreamSerializer",
      "spark.http.matching.MatcherFilter",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.server.session.SessionCache",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$AbstractLifeCycleListener",
      "com.google.gson.internal.bind.JsonTreeReader",
      "spark.embeddedserver.jetty.JettyServerFactory",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "spark.routematch.RouteMatch",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.JsonParseException",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.thread.Scheduler",
      "org.eclipse.jetty.server.session.Session",
      "com.google.gson.JsonElement",
      "spark.Request",
      "com.google.gson.JsonSerializationContext",
      "org.eclipse.jetty.server.session.SessionHandler$SessionIf",
      "spark.http.matching.ResponseWrapper",
      "spark.resource.AbstractResourceHandler",
      "org.eclipse.jetty.http.HttpCookie",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.session.SessionHandler",
      "spark.utils.MimeParse$ParseResults",
      "com.google.gson.FieldNamingPolicy$4",
      "com.google.gson.FieldNamingPolicy$3",
      "com.google.gson.annotations.Since",
      "spark.FilterImpl",
      "com.google.gson.FieldNamingPolicy$5",
      "org.eclipse.jetty.http.HttpField",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.FieldNamingPolicy$2",
      "com.google.gson.FieldNamingPolicy$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EmbeddedServers_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "spark.embeddedserver.EmbeddedServers",
      "spark.embeddedserver.EmbeddedServers$Identifiers",
      "spark.route.Routes",
      "spark.utils.StringUtils",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.http.matching.MatcherFilter",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.server.session.SessionHandler",
      "spark.embeddedserver.jetty.EmbeddedJettyServer",
      "spark.utils.ResourceUtils",
      "spark.resource.AbstractResourceHandler",
      "spark.resource.ExternalResourceHandler",
      "spark.staticfiles.StaticFilesFolder",
      "spark.RouteImpl",
      "spark.resource.ClassPathResourceHandler",
      "com.google.gson.Gson",
      "com.google.gson.internal.Excluder",
      "com.google.gson.FieldNamingPolicy$1",
      "com.google.gson.FieldNamingPolicy$2",
      "com.google.gson.FieldNamingPolicy$3",
      "com.google.gson.FieldNamingPolicy$4",
      "com.google.gson.FieldNamingPolicy$5",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.LongSerializationPolicy$1",
      "com.google.gson.LongSerializationPolicy$2",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.internal.$Gson$Types",
      "com.google.gson.JsonNull",
      "spark.utils.SparkUtils",
      "spark.utils.MimeParse",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"
    );
  }
}