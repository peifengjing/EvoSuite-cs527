/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 14 20:29:56 GMT 2017
 */

package org.springside.modules.utils.reflect;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FastMethodInvoker_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springside.modules.utils.reflect.FastMethodInvoker"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FastMethodInvoker_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.cglib.core.Transformer",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "org.objectweb.asm.Edge",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "org.apache.commons.lang3.StringUtils",
      "net.sf.cglib.core.internal.Function",
      "org.objectweb.asm.Frame",
      "net.sf.cglib.core.MethodWrapper",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.HashCodeCustomizer",
      "org.apache.commons.lang3.JavaVersion",
      "org.springside.modules.utils.reflect.FastMethodInvoker",
      "net.sf.cglib.reflect.FastMember",
      "net.sf.cglib.core.Customizer",
      "net.sf.cglib.core.CodeEmitter$State",
      "org.springside.modules.utils.base.Platforms",
      "net.sf.cglib.core.DuplicatesPredicate",
      "org.objectweb.asm.MethodWriter",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.core.AbstractClassGenerator",
      "org.objectweb.asm.ClassWriter",
      "org.objectweb.asm.AnnotationVisitor",
      "net.sf.cglib.transform.ClassTransformer",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.GeneratorStrategy",
      "net.sf.cglib.reflect.FastConstructor",
      "org.objectweb.asm.Context",
      "org.objectweb.asm.Attribute",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.core.MethodInfoTransformer",
      "net.sf.cglib.core.ClassGenerator",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "org.springside.modules.utils.collection.MapUtil",
      "net.sf.cglib.core.ReflectUtils$4",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "org.objectweb.asm.ByteVector",
      "org.objectweb.asm.Opcodes",
      "org.springside.modules.utils.reflect.ClassUtil",
      "net.sf.cglib.core.ReflectUtils$1",
      "org.apache.commons.lang3.SystemUtils",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils$3",
      "net.sf.cglib.core.ReflectUtils",
      "org.objectweb.asm.Handler",
      "net.sf.cglib.core.MethodInfo",
      "net.sf.cglib.core.VisibilityPredicate",
      "net.sf.cglib.core.internal.LoadingCache$1",
      "net.sf.cglib.core.internal.LoadingCache$2",
      "org.objectweb.asm.Handle",
      "org.apache.commons.lang3.Validate",
      "net.sf.cglib.core.Block",
      "org.objectweb.asm.AnnotationWriter",
      "net.sf.cglib.reflect.FastClassEmitter",
      "net.sf.cglib.core.LocalVariablesSorter",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "org.objectweb.asm.MethodVisitor",
      "org.objectweb.asm.FieldWriter",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.FieldTypeCustomizer",
      "net.sf.cglib.reflect.FastClassEmitter$GetIndexCallback",
      "org.objectweb.asm.Type",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "net.sf.cglib.core.Signature",
      "org.springside.modules.utils.base.ExceptionUtil",
      "org.objectweb.asm.ClassVisitor",
      "net.sf.cglib.reflect.FastClass",
      "net.sf.cglib.core.internal.CustomizerRegistry",
      "net.sf.cglib.core.MethodWrapper$MethodWrapperKey",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory$1",
      "net.sf.cglib.core.KeyFactory$4",
      "net.sf.cglib.core.KeyFactory$3",
      "net.sf.cglib.core.EmitUtils$5",
      "net.sf.cglib.core.ClassInfo",
      "net.sf.cglib.core.NamingPolicy",
      "org.objectweb.asm.ClassReader",
      "net.sf.cglib.core.EmitUtils$14",
      "net.sf.cglib.core.EmitUtils$13",
      "net.sf.cglib.core.ClassEmitter$2",
      "net.sf.cglib.core.EmitUtils$16",
      "net.sf.cglib.core.ClassEmitter$3",
      "net.sf.cglib.core.EmitUtils$15",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.core.EmitUtils$6",
      "net.sf.cglib.core.Predicate",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.EmitUtils$10",
      "net.sf.cglib.core.EmitUtils$12",
      "org.objectweb.asm.FieldVisitor",
      "net.sf.cglib.core.EmitUtils$11",
      "org.objectweb.asm.Label",
      "org.apache.commons.lang3.ArrayUtils",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "net.sf.cglib.reflect.FastClass$Generator",
      "net.sf.cglib.reflect.FastMethod",
      "org.springside.modules.utils.reflect.FastMethodInvoker$1",
      "net.sf.cglib.core.ClassNameReader$1",
      "net.sf.cglib.core.KeyFactoryCustomizer",
      "net.sf.cglib.core.CodeGenerationException",
      "org.springside.modules.utils.base.ExceptionUtil$UncheckedException",
      "net.sf.cglib.core.Local",
      "org.springside.modules.utils.collection.MapUtil$ValueCreator",
      "net.sf.cglib.reflect.FastClassEmitter$4",
      "net.sf.cglib.core.ProcessArrayCallback",
      "net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData$1",
      "net.sf.cglib.reflect.FastClassEmitter$3",
      "net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData$2",
      "net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData$3",
      "net.sf.cglib.core.internal.LoadingCache",
      "net.sf.cglib.reflect.FastClassEmitter$1",
      "org.objectweb.asm.Item",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData",
      "org.objectweb.asm.TypePath",
      "org.apache.commons.lang3.math.NumberUtils",
      "net.sf.cglib.core.AbstractClassGenerator$Source"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("net.sf.cglib.reflect.FastMethod", false, FastMethodInvoker_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FastMethodInvoker_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.math.NumberUtils",
      "org.apache.commons.lang3.JavaVersion",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.SystemUtils",
      "org.springside.modules.utils.base.Platforms",
      "org.springside.modules.utils.reflect.FastMethodInvoker",
      "org.springside.modules.utils.reflect.ClassUtil",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.Validate",
      "org.springside.modules.utils.base.ExceptionUtil",
      "net.sf.cglib.core.AbstractClassGenerator",
      "net.sf.cglib.reflect.FastClass$Generator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData",
      "net.sf.cglib.core.internal.LoadingCache",
      "net.sf.cglib.core.DebuggingClassWriter",
      "org.objectweb.asm.ClassWriter",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.TypeUtils",
      "org.objectweb.asm.Type",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.reflect.FastClassEmitter",
      "org.objectweb.asm.Frame",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.core.ReflectUtils",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.EmitUtils",
      "org.objectweb.asm.ClassReader",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.MethodWrapper",
      "net.sf.cglib.core.MethodInfoTransformer"
    );
  }
}
