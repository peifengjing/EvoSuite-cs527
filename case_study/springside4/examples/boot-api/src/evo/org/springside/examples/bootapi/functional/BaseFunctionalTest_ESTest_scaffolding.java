/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 14 18:13:54 GMT 2017
 */

package org.springside.examples.bootapi.functional;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BaseFunctionalTest_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springside.examples.bootapi.functional.BaseFunctionalTest"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseFunctionalTest_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.JsonSerializable$Base",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "org.springside.examples.bootapi.domain.Book",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier",
      "org.springframework.beans.factory.annotation.Autowired",
      "com.fasterxml.jackson.databind.node.TreeTraversingParser",
      "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer",
      "com.fasterxml.jackson.databind.deser.impl.FieldProperty",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.databind.deser.std.EnumDeserializer",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base",
      "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference",
      "com.fasterxml.jackson.databind.type.ArrayType",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.type.MapLikeType",
      "com.fasterxml.jackson.databind.type.MapType",
      "com.fasterxml.jackson.databind.util.Named",
      "org.springframework.test.annotation.DirtiesContext$MethodMode",
      "org.springframework.data.repository.PagingAndSortingRepository",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.CollectionType",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer",
      "com.fasterxml.jackson.annotation.JsonAutoDetect",
      "org.springframework.data.domain.Page",
      "org.springside.examples.bootapi.repository.BookDao",
      "com.fasterxml.jackson.databind.node.TextNode",
      "com.fasterxml.jackson.databind.node.ValueNode",
      "com.fasterxml.jackson.core.util.Instantiatable",
      "com.fasterxml.jackson.databind.ser.impl.IteratorSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer",
      "com.fasterxml.jackson.databind.ext.NioPathDeserializer",
      "org.springframework.http.client.support.InterceptingHttpAccessor",
      "com.fasterxml.jackson.databind.node.JsonNodeCreator",
      "com.fasterxml.jackson.databind.deser.SettableBeanProperty",
      "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser",
      "com.fasterxml.jackson.core.json.ReaderBasedJsonParser",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter",
      "com.fasterxml.jackson.databind.node.IntNode",
      "com.fasterxml.jackson.databind.node.FloatNode",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.databind.node.DecimalNode",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.databind.util.Annotations",
      "com.fasterxml.jackson.databind.deser.Deserializers",
      "com.fasterxml.jackson.databind.ser.std.CollectionSerializer",
      "com.fasterxml.jackson.databind.ser.std.EnumSerializer",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.databind.deser.KeyDeserializers",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.databind.KeyDeserializer",
      "com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.databind.type.CollectionLikeType",
      "com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator",
      "com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer",
      "com.fasterxml.jackson.core.TreeNode",
      "com.fasterxml.jackson.databind.node.NumericNode",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator",
      "com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer",
      "com.fasterxml.jackson.databind.type.ResolvedRecursiveType",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.databind.node.DoubleNode",
      "com.fasterxml.jackson.core.base.ParserMinimalBase",
      "com.fasterxml.jackson.databind.ser.PropertyWriter",
      "com.fasterxml.jackson.core.util.ByteArrayBuilder",
      "com.fasterxml.jackson.databind.type.ReferenceType",
      "com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerBase",
      "com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer",
      "org.springframework.test.context.ContextConfiguration",
      "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "org.springframework.test.annotation.DirtiesContext",
      "com.fasterxml.jackson.annotation.JsonView",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.ContainerSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.std.FileSerializer",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.core.SerializableString",
      "com.fasterxml.jackson.databind.deser.ValueInstantiators",
      "com.fasterxml.jackson.core.Versioned",
      "org.springside.modules.test.rule.TestProgress",
      "com.fasterxml.jackson.databind.deser.std.StringDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer",
      "com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.exc.InvalidTypeIdException",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.node.POJONode",
      "com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer",
      "org.springframework.data.repository.Repository",
      "com.fasterxml.jackson.databind.node.BaseJsonNode",
      "com.fasterxml.jackson.databind.node.BigIntegerNode",
      "com.fasterxml.jackson.databind.JsonSerializable",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMember",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "org.springframework.web.client.RestTemplate",
      "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition",
      "com.fasterxml.jackson.databind.deser.impl.MethodProperty",
      "org.springside.modules.utils.mapper.JsonMapper",
      "com.fasterxml.jackson.annotation.JsonRawValue",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "org.springframework.http.client.support.HttpAccessor",
      "com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter",
      "com.fasterxml.jackson.databind.exc.InvalidFormatException",
      "com.fasterxml.jackson.databind.deser.std.MapDeserializer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.ser.ContextualSerializer",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.ser.std.ClassSerializer",
      "com.fasterxml.jackson.databind.Module$SetupContext",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "com.fasterxml.jackson.databind.node.ContainerNode",
      "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethod",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "org.springframework.test.context.BootstrapWith",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker",
      "com.fasterxml.jackson.core.JsonParser",
      "com.fasterxml.jackson.databind.introspect.AnnotatedParameter",
      "com.fasterxml.jackson.databind.ser.BeanPropertyWriter",
      "com.fasterxml.jackson.databind.jsonschema.SchemaAware",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "org.springside.examples.bootapi.functional.BookEndpointTest",
      "com.fasterxml.jackson.databind.AbstractTypeResolver",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
      "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer",
      "com.fasterxml.jackson.databind.ser.std.IterableSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer",
      "com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter",
      "org.springframework.test.annotation.DirtiesContext$ClassMode",
      "com.fasterxml.jackson.core.PrettyPrinter",
      "com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer",
      "com.fasterxml.jackson.core.base.GeneratorBase",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.exc.PropertyBindingException",
      "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.BeanSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer",
      "com.fasterxml.jackson.databind.ser.std.InetAddressSerializer",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.deser.std.StdDeserializer",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.databind.node.NullNode",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base",
      "org.springframework.test.context.junit4.SpringJUnit4ClassRunner",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.ser.BeanSerializerModifier",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "org.springframework.data.domain.Sort",
      "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder",
      "com.fasterxml.jackson.databind.ser.ResolvableSerializer",
      "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator",
      "com.fasterxml.jackson.core.io.UTF8Writer",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.BeanProperty",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer",
      "com.fasterxml.jackson.databind.introspect.TypeResolutionContext",
      "com.fasterxml.jackson.databind.ser.impl.StringArraySerializer",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer",
      "com.fasterxml.jackson.annotation.JsonManagedReference",
      "com.fasterxml.jackson.core.base.ParserBase",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.annotation.JsonDeserialize",
      "com.fasterxml.jackson.databind.node.BinaryNode",
      "com.fasterxml.jackson.databind.introspect.AnnotationMap",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "org.springframework.boot.test.WebIntegrationTest",
      "com.fasterxml.jackson.core.JsonGenerator",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer",
      "com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer",
      "com.fasterxml.jackson.databind.ser.Serializers",
      "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair",
      "org.springframework.beans.factory.annotation.Value",
      "com.fasterxml.jackson.databind.ext.NioPathSerializer",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.deser.BeanDeserializer",
      "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase",
      "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty",
      "com.fasterxml.jackson.core.json.UTF8JsonGenerator",
      "com.fasterxml.jackson.databind.ser.std.EnumSetSerializer",
      "org.springframework.web.client.RestOperations",
      "com.fasterxml.jackson.databind.ser.std.SerializableSerializer",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD",
      "com.fasterxml.jackson.databind.node.ShortNode",
      "com.fasterxml.jackson.databind.node.BooleanNode",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.databind.util.TokenBuffer",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.node.LongNode",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.databind.deser.CreatorProperty",
      "com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer",
      "com.fasterxml.jackson.databind.deser.ResolvableDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer",
      "org.springframework.data.domain.Pageable",
      "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase",
      "org.springside.examples.bootapi.BootApiApplication",
      "com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer",
      "com.fasterxml.jackson.annotation.JsonBackReference",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "com.fasterxml.jackson.annotation.JsonFormat",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.std.MapSerializer",
      "org.springframework.data.domain.Slice",
      "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.annotation.JsonTypeInfo",
      "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.annotation.JsonUnwrapped",
      "com.fasterxml.jackson.databind.JsonMappingException",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver",
      "com.fasterxml.jackson.core.json.JsonGeneratorImpl",
      "com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer",
      "org.springside.examples.bootapi.functional.BaseFunctionalTest",
      "com.fasterxml.jackson.databind.deser.AbstractDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer",
      "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer",
      "com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer",
      "org.springframework.data.repository.CrudRepository",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.databind.node.ObjectNode",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.io.DataOutputAsStream",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.core.io.SegmentedStringWriter",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.introspect.AnnotatedField",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase",
      "com.fasterxml.jackson.databind.deser.ContextualDeserializer",
      "com.fasterxml.jackson.databind.ser.std.ArraySerializerBase",
      "org.springframework.test.annotation.DirtiesContext$HierarchyMode",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.annotation.ObjectIdGenerator",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.cfg.ConfigFeature",
      "org.springframework.boot.test.SpringApplicationConfiguration",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "org.springframework.boot.test.TestRestTemplate"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.springside.examples.bootapi.repository.BookDao", false, BaseFunctionalTest_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseFunctionalTest_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.test.annotation.DirtiesContext$MethodMode",
      "org.springframework.test.annotation.DirtiesContext$ClassMode",
      "org.springframework.test.annotation.DirtiesContext$HierarchyMode",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "org.springside.modules.utils.mapper.JsonMapper"
    );
  }
}
