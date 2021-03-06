/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 16:32:05 GMT 2017
 */

package spark.http.matching;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Routes_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "spark.http.matching.Routes"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Routes_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.gson.reflect.TypeToken",
      "spark.route.RouteEntry",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "spark.utils.Wrapper",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.JsonDeserializationContext",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "spark.http.matching.Routes",
      "spark.http.matching.RouteContext",
      "com.google.gson.FieldNamingStrategy",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "spark.route.HttpMethod",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.gson.ExclusionStrategy",
      "spark.RouteImpl$1",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters$31",
      "com.google.gson.JsonArray",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.Excluder",
      "spark.TemplateViewRouteImpl",
      "spark.serialization.BytesSerializer",
      "spark.utils.MimeParse",
      "com.google.gson.annotations.Until",
      "com.google.gson.TypeAdapterFactory",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "spark.route.Routes",
      "com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.internal.$Gson$Types",
      "spark.FilterImpl$1",
      "spark.RequestResponseFactory",
      "spark.examples.transformer.JsonTransformer",
      "com.google.gson.stream.JsonReader",
      "spark.utils.MimeParse$FitnessAndQuality",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "spark.utils.StringUtils",
      "com.google.gson.Gson$FutureTypeAdapter",
      "spark.Route",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.Streams",
      "com.google.gson.internal.$Gson$Preconditions",
      "spark.QueryParamsMap",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "spark.ModelAndView",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.internal.ConstructorConstructor$3",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.ObjectConstructor",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.JsonNull",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "spark.TemplateViewRoute",
      "com.google.gson.internal.ConstructorConstructor$8",
      "spark.http.matching.RequestWrapper",
      "com.google.gson.LongSerializationPolicy$1",
      "com.google.gson.LongSerializationPolicy$2",
      "com.google.gson.internal.ConstructorConstructor$6",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.bind.JsonTreeReader$1",
      "com.google.gson.TypeAdapter$1",
      "spark.Access",
      "com.google.gson.internal.UnsafeAllocator$3",
      "com.google.gson.internal.UnsafeAllocator$4",
      "com.google.gson.internal.UnsafeAllocator$1",
      "com.google.gson.internal.UnsafeAllocator$2",
      "com.google.gson.Gson$2",
      "spark.ResponseTransformerRouteImpl",
      "com.google.gson.Gson$3",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$4",
      "com.google.gson.Gson$5",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "spark.TemplateViewRouteImpl$1",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter",
      "com.google.gson.Gson$1",
      "com.google.gson.internal.bind.TypeAdapters$22$1",
      "spark.serialization.Serializer",
      "spark.RouteImpl",
      "com.google.gson.Gson",
      "spark.http.matching.Body",
      "spark.serialization.DefaultSerializer",
      "com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "spark.serialization.InputStreamSerializer",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1",
      "com.google.gson.annotations.SerializedName",
      "com.google.gson.internal.Excluder$1",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "spark.QueryParamsMap$NullQueryParamsMap",
      "com.google.gson.internal.bind.JsonTreeReader",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.internal.bind.JsonTreeWriter$1",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.gson.JsonIOException",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "spark.routematch.RouteMatch",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "spark.utils.SparkUtils",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.JsonParseException",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter",
      "spark.serialization.SerializerChain",
      "com.google.gson.JsonElement",
      "spark.TemplateEngine",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "spark.Request",
      "spark.ResponseTransformerRouteImpl$1",
      "com.google.gson.JsonSerializationContext",
      "com.google.gson.annotations.JsonAdapter",
      "spark.Filter",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.UnsafeAllocator",
      "com.google.gson.internal.Streams$AppendableWriter",
      "spark.http.matching.ResponseWrapper",
      "com.google.gson.JsonSyntaxException",
      "spark.Session",
      "spark.utils.MimeParse$ParseResults",
      "com.google.gson.FieldNamingPolicy$4",
      "com.google.gson.FieldNamingPolicy$3",
      "com.google.gson.annotations.Since",
      "spark.FilterImpl",
      "com.google.gson.FieldNamingPolicy$5",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "spark.Response",
      "spark.ResponseTransformer",
      "com.google.gson.internal.ConstructorConstructor$10",
      "com.google.gson.FieldNamingPolicy$2",
      "com.google.gson.internal.ConstructorConstructor$11",
      "com.google.gson.FieldNamingPolicy$1",
      "com.google.gson.internal.ConstructorConstructor$12"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("spark.ModelAndView", false, Routes_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("spark.TemplateEngine", false, Routes_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("spark.TemplateViewRoute", false, Routes_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Routes_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "spark.route.HttpMethod",
      "spark.Request",
      "spark.route.Routes",
      "spark.Response",
      "spark.RouteImpl",
      "spark.utils.StringUtils",
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
      "spark.utils.MimeParse",
      "spark.utils.SparkUtils",
      "com.google.gson.JsonNull",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl"
    );
  }
}
