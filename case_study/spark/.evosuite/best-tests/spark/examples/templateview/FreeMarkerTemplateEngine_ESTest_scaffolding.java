/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 13 17:38:38 GMT 2017
 */

package spark.examples.templateview;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FreeMarkerTemplateEngine_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "spark.examples.templateview.FreeMarkerTemplateEngine"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FreeMarkerTemplateEngine_ESTest_scaffolding.class.getClassLoader() ,
      "freemarker.ext.beans.SimpleMethod",
      "freemarker.ext.beans.BeansWrapper",
      "freemarker.ext.beans._EnumModels",
      "freemarker.template.TemplateHashModel",
      "freemarker.core.BreakInstruction",
      "freemarker.core.NumberLiteral",
      "freemarker.core.ComparisonExpression",
      "freemarker.core.FMParser$JJCalls",
      "freemarker.core.VisitNode",
      "freemarker.ext.beans.ClassIntrospectorBuilder",
      "freemarker.ext.beans.BeansWrapper$5",
      "freemarker.ext.beans.MemberAndArguments",
      "freemarker.ext.beans.BeansWrapper$4",
      "freemarker.cache.TemplateNameFormat$Default020400",
      "freemarker.core.AssignmentInstruction",
      "freemarker.core.Configurable$SettingValueAssignmentException",
      "freemarker.core.TemplateDateFormatFactory",
      "freemarker.cache.TemplateLookupStrategy$Default020300",
      "freemarker.core.Expression",
      "freemarker.core.Configurable$UnknownSettingException",
      "freemarker.core.PropertySetting",
      "freemarker.core.IfBlock",
      "freemarker.template.DefaultIteratorAdapter",
      "freemarker.ext.beans.BeansWrapperSingletonHolder",
      "freemarker.log._JULLoggerFactory$JULLogger",
      "freemarker.ext.beans.StringModel",
      "freemarker.core.RecurseNode",
      "freemarker.cache.SoftCacheStorage",
      "freemarker.core.Assignment",
      "freemarker.template.TemplateExceptionHandler$1",
      "freemarker.template.TemplateExceptionHandler$2",
      "freemarker.template.utility.StandardCompress$StandardCompressWriter",
      "freemarker.core.FlushInstruction",
      "freemarker.template.utility.CaptureOutput$1",
      "freemarker.core.TemplateObject",
      "freemarker.core.ReturnInstruction",
      "freemarker.core.NotExpression",
      "freemarker.ext.beans.SimpleMethodModel",
      "freemarker.ext.beans.MaybeEmptyMemberAndArguments",
      "freemarker.core.BodyInstruction",
      "freemarker.ext.util.ModelCache",
      "freemarker.cache.ClassTemplateLoader",
      "freemarker.core.Environment$Namespace",
      "freemarker.core.DefaultToExpression",
      "freemarker.template.AdapterTemplateModel",
      "freemarker.ext.beans.BeanModel$1",
      "freemarker.cache.ConcurrentCacheStorage",
      "freemarker.log._JULLoggerFactory",
      "freemarker.core.UnformattableDateException",
      "freemarker.core.Environment",
      "freemarker.core.Include",
      "freemarker.template.DefaultObjectWrapperConfiguration",
      "freemarker.core.Range",
      "freemarker.core.ListLiteral",
      "freemarker.cache.TemplateNameFormat$Default020300",
      "freemarker.template.TemplateExceptionHandler$3",
      "freemarker.cache.TemplateLookupStrategy",
      "freemarker.template.TemplateExceptionHandler$4",
      "freemarker.template.TemplateScalarModel",
      "freemarker.template.utility.NormalizeNewlines$1",
      "freemarker.ext.beans.ClassIntrospector",
      "freemarker.core.BooleanLiteral",
      "freemarker.core.LocalContext",
      "freemarker.core.BugException",
      "freemarker.core.LibraryLoad",
      "spark.ModelAndView",
      "freemarker.cache.TemplateLookupContext",
      "freemarker.core.FMParserTokenManager",
      "freemarker.core.FMParser$LookaheadSuccess",
      "freemarker.template.Configuration$DefaultSoftCacheStorage",
      "freemarker.template.TemplateTransformModel",
      "freemarker.template.Configuration",
      "freemarker.template.TemplateSequenceModel",
      "freemarker.core.MethodCall",
      "freemarker.ext.beans.BeansWrapperConfiguration",
      "freemarker.core.Sep",
      "freemarker.core.HashLiteral",
      "freemarker.template.TemplateExceptionHandler",
      "freemarker.template.utility.SecurityUtilities",
      "freemarker.template.TemplateCollectionModelEx",
      "freemarker.ext.util.ModelFactory",
      "freemarker.core.TrimInstruction",
      "freemarker.core.Interpolation",
      "freemarker.template.utility.RichObjectWrapper",
      "freemarker.core.OrExpression",
      "freemarker.ext.beans.MethodAppearanceFineTuner",
      "freemarker.template.SimpleScalar",
      "freemarker.template.SimpleSequence",
      "freemarker.ext.beans.BooleanModel",
      "freemarker.cache.CacheStorageWithGetSize",
      "freemarker.debug.impl.DebuggerService",
      "freemarker.template._TemplateAPI",
      "freemarker.core.NoEscapeBlock",
      "freemarker.core.EscapeBlock",
      "freemarker.ext.beans.BeansModelCache",
      "freemarker.core.AddConcatExpression",
      "freemarker.log.Logger",
      "freemarker.ext.beans.EmptyMemberAndArguments",
      "freemarker.core.SwitchBlock",
      "freemarker.core.FallbackInstruction",
      "freemarker.template.TemplateModelWithAPISupport",
      "freemarker.core.ParseException",
      "freemarker.core.ArithmeticExpression",
      "freemarker.core.Environment$5",
      "freemarker.template.DefaultObjectWrapper$1",
      "freemarker.template.DefaultObjectWrapper$2",
      "freemarker.core.BuiltIn",
      "freemarker.ext.beans.OverloadedMethods",
      "freemarker.ext.beans.MethodSorter",
      "freemarker.template.TemplateNotFoundException",
      "freemarker.template.Template",
      "freemarker.core.FMParser",
      "freemarker.core.ListElseContainer",
      "freemarker.core.ArithmeticEngine$BigDecimalEngine",
      "freemarker.ext.beans.BeansWrapper$1",
      "freemarker.core.JavaTemplateDateFormatFactory",
      "freemarker.core.ArithmeticEngine",
      "freemarker.ext.beans.BeansWrapper$3",
      "freemarker.core.TextBlock",
      "freemarker.core.FMParserConstants",
      "freemarker.template.utility.SecurityUtilities$1",
      "freemarker.template.utility.SecurityUtilities$2",
      "freemarker.template.utility.XmlEscape",
      "freemarker.template.TemplateModelAdapter",
      "freemarker.core.UnifiedCall",
      "freemarker.core.ReturnInstruction$Return",
      "freemarker.core.Identifier",
      "freemarker.template.Template$LineTableBuilder",
      "freemarker.cache.TemplateLookupResult$PositiveTemplateLookupResult",
      "freemarker.core.DynamicKeyName",
      "freemarker.cache.FileTemplateLoader",
      "freemarker.ext.beans.ReflectionCallableMemberDescriptor",
      "freemarker.template.ObjectWrapper",
      "freemarker.template.TemplateBooleanModel",
      "freemarker.core.DollarVariable",
      "freemarker.template.TemplateMethodModel",
      "freemarker.core.XSTemplateDateFormatFactory",
      "freemarker.core._ConcurrentMapFactory",
      "freemarker.template.utility.NormalizeNewlines",
      "freemarker.template.TemplateDirectiveBody",
      "freemarker.core.AndExpression",
      "freemarker.template.utility.NullArgumentException",
      "freemarker.ext.beans.OverloadedVarArgsMethods",
      "freemarker.ext.beans.OverloadedMethodsSubset",
      "freemarker.core.Token",
      "freemarker.core.TokenMgrError",
      "freemarker.ext.beans.OverloadedFixArgsMethods",
      "freemarker.template.DefaultMapAdapter",
      "freemarker.core.Macro",
      "freemarker.cache.TemplateLookupResult$NegativeTemplateLookupResult",
      "freemarker.core.BlockAssignment",
      "freemarker.cache.TemplateCache$MaybeMissingTemplate",
      "freemarker.cache.SoftCacheStorage$SoftValueReference",
      "freemarker.ext.beans.OverloadedMethods$DelayedCallSignatureToString",
      "freemarker.cache.TemplateLoader",
      "freemarker.template.utility.StandardCompress",
      "freemarker.ext.beans._MethodUtil",
      "freemarker.cache.TemplateCache$CachedTemplate",
      "freemarker.template.SimpleHash",
      "freemarker.core.StringLiteral",
      "freemarker.template.SimpleCollection",
      "freemarker.core.ParentheticalExpression",
      "freemarker.template.utility.StringUtil",
      "freemarker.core.Items",
      "freemarker.ext.beans.StaticModels",
      "freemarker.template.utility.HtmlEscape",
      "freemarker.template.TemplateException",
      "freemarker.core.TransformBlock",
      "freemarker.ext.beans.ClassIntrospector$MethodSignature",
      "freemarker.ext.beans.BeansWrapper$MethodAppearanceDecision",
      "freemarker.core.Configurable",
      "freemarker.cache.FileTemplateLoader$1",
      "freemarker.core.ISOTemplateDateFormatFactory",
      "freemarker.core.CompressedBlock",
      "freemarker.template.Version",
      "freemarker.template.WrappingTemplateModel",
      "freemarker.core.ExistsExpression",
      "freemarker.core.Dot",
      "freemarker.template.TemplateModel",
      "freemarker.template.SimpleObjectWrapper",
      "freemarker.ext.beans.ClassBasedModelFactory",
      "freemarker.core.StopInstruction",
      "freemarker.template.utility.DateUtil$DateToISO8601CalendarFactory",
      "freemarker.template.utility.HtmlEscape$1",
      "freemarker.core.DirectiveCallPlace",
      "freemarker.core._MiscTemplateException",
      "freemarker.ext.beans.CallableMemberDescriptor",
      "freemarker.core.Case",
      "freemarker.ext.beans.MaybeEmptyCallableMemberDescriptor",
      "freemarker.core.ISOLikeTemplateDateFormatFactory",
      "freemarker.template.utility.XmlEscape$1",
      "freemarker.template.TemplateMethodModelEx",
      "freemarker.core.SimpleCharStream",
      "spark.examples.templateview.FreeMarkerTemplateEngine",
      "freemarker.core.MixedContent",
      "freemarker.cache.URLTemplateSource",
      "freemarker.core.Comment",
      "freemarker.ext.beans.StringModel$1",
      "freemarker.core.ElseOfList",
      "freemarker.core.BuiltinVariable",
      "freemarker.template.utility.CaptureOutput",
      "freemarker.template.TemplateHashModelEx",
      "freemarker.template.Template$WrongEncodingException",
      "freemarker.template.ObjectWrapperAndUnwrapper",
      "freemarker.core.UnaryPlusMinusExpression",
      "freemarker.ext.beans.BeanModel",
      "freemarker.cache.StatefulTemplateLoader",
      "freemarker.template.utility.ClassUtil",
      "freemarker.ext.util.WrapperTemplateModel",
      "freemarker.core.AttemptBlock",
      "freemarker.core._DelayedConversionToString",
      "freemarker.core.NumericalOutput",
      "freemarker.cache.CacheStorage",
      "freemarker.template.utility.UndeclaredThrowableException",
      "freemarker.ext.beans.InvalidPropertyException",
      "freemarker.template.MalformedTemplateNameException",
      "freemarker.cache.TemplateCache",
      "freemarker.core.TemplateClassResolver",
      "freemarker.template.DefaultNonListCollectionAdapter",
      "freemarker.template.SimpleHash$SynchronizedHash",
      "freemarker.template.TemplateModelException",
      "freemarker.template.TemplateCollectionModel",
      "freemarker.log.LoggerFactory",
      "freemarker.cache.TemplateCache$TemplateKey",
      "freemarker.template.utility.NullWriter",
      "freemarker.core.FMParser$ParserIteratorBlockContext",
      "spark.TemplateEngine",
      "freemarker.template.DefaultObjectWrapper",
      "freemarker.cache.TemplateNameFormat",
      "freemarker.core.TemplateElement",
      "freemarker.core._UnexpectedTypeErrorExplainerTemplateModel",
      "freemarker.template.utility.ObjectWrapperWithAPISupport",
      "freemarker.debug.impl.RmiDebuggerService",
      "freemarker.template.Configuration$LegacyDefaultFileTemplateLoader",
      "freemarker.core.RecoveryBlock",
      "freemarker.debug.impl.DebuggerService$NoOpDebuggerService",
      "freemarker.template.utility.WriteProtectable",
      "freemarker.core._TemplateModelException",
      "freemarker.template.TemplateNumberModel",
      "freemarker.ext.beans.OverloadedMethods$1",
      "freemarker.core.ArithmeticEngine$ConservativeEngine",
      "freemarker.cache.URLTemplateLoader",
      "freemarker.ext.beans.OverloadedMethods$2",
      "freemarker.core.IteratorBlock",
      "freemarker.core.BooleanExpression",
      "freemarker.core.UnknownDateTypeFormattingUnsupportedException",
      "freemarker.core.TemplateClassResolver$3",
      "freemarker.core.TemplateClassResolver$1",
      "freemarker.core.TemplateClassResolver$2",
      "freemarker.cache.TemplateCache$TemplateCacheTemplateLookupContext",
      "freemarker.log.Logger$1",
      "freemarker.cache.TemplateLookupResult",
      "freemarker.ext.beans.UnsafeMethods"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FreeMarkerTemplateEngine_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "freemarker.log.Logger",
      "freemarker.core.Configurable",
      "freemarker.template.Version",
      "freemarker.template.Configuration",
      "freemarker.template._TemplateAPI",
      "freemarker.template.utility.NullArgumentException",
      "freemarker.template.TemplateExceptionHandler$4",
      "freemarker.template.TemplateExceptionHandler",
      "freemarker.core.ArithmeticEngine$ConservativeEngine",
      "freemarker.core.ArithmeticEngine",
      "freemarker.template.ObjectWrapperAndUnwrapper",
      "freemarker.ext.beans.BeansWrapper",
      "freemarker.ext.beans.ClassIntrospectorBuilder",
      "freemarker.template.utility.SecurityUtilities",
      "freemarker.ext.beans.ClassIntrospector",
      "freemarker.template.utility.ClassUtil",
      "freemarker.core._ConcurrentMapFactory",
      "freemarker.template.SimpleScalar",
      "freemarker.ext.beans.BeanModel",
      "freemarker.ext.beans.BeansModelCache",
      "freemarker.template.DefaultObjectWrapper",
      "freemarker.ext.beans.BeansWrapperSingletonHolder",
      "freemarker.template.SimpleObjectWrapper",
      "freemarker.template.ObjectWrapper",
      "freemarker.core.TemplateClassResolver",
      "freemarker.cache.TemplateCache",
      "freemarker.template.utility.StringUtil",
      "freemarker.cache.FileTemplateLoader",
      "freemarker.cache.SoftCacheStorage",
      "freemarker.cache.TemplateLookupStrategy",
      "freemarker.cache.TemplateNameFormat",
      "freemarker.template.utility.StandardCompress",
      "freemarker.template.utility.HtmlEscape",
      "freemarker.template.utility.XmlEscape",
      "freemarker.cache.TemplateCache$CachedTemplate",
      "freemarker.cache.TemplateLookupResult$NegativeTemplateLookupResult",
      "freemarker.template.TemplateNotFoundException",
      "freemarker.template.Template",
      "freemarker.core.FMParser",
      "freemarker.core.FMParser$LookaheadSuccess",
      "freemarker.core.SimpleCharStream",
      "freemarker.core.FMParserTokenManager",
      "freemarker.core.Token",
      "freemarker.core.TemplateObject",
      "freemarker.core.TemplateElement",
      "freemarker.core.TextBlock",
      "freemarker.debug.impl.DebuggerService",
      "freemarker.log._NullLoggerFactory",
      "freemarker.ext.beans.StringModel",
      "freemarker.ext.beans.ClassIntrospector$MethodSignature",
      "freemarker.ext.beans.UnsafeMethods",
      "freemarker.ext.beans.OverloadedMethodsSubset",
      "freemarker.ext.beans._MethodUtil",
      "freemarker.core.Environment",
      "freemarker.template.WrappingTemplateModel",
      "freemarker.template.SimpleHash",
      "freemarker.core.Environment$Namespace",
      "freemarker.template.SimpleSequence"
    );
  }
}