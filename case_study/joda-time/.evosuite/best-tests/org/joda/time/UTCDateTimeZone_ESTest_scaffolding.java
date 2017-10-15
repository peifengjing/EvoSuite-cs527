/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 12 21:10:41 GMT 2017
 */

package org.joda.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class UTCDateTimeZone_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.UTCDateTimeZone"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UTCDateTimeZone_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.tz.Provider",
      "org.joda.time.DateTimeZone",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.ReadablePartial",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.ReadableInstant",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.LocalDateTime",
      "org.joda.time.tz.FixedDateTimeZone"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UTCDateTimeZone_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.DateTimeZone",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalDateTime",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.TestDateMidnight_Basics",
      "org.joda.time.DateTimeZone$Stub",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.TestDateTimeZone$MockDateTimeZone",
      "org.joda.time.TestInterval_Basics",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.Duration",
      "org.joda.time.TestDuration_Basics$MockMutableDuration",
      "org.joda.time.MockNullZoneChronology",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.MutableDateTime",
      "org.joda.time.LocalDate",
      "org.joda.time.TestLocalTime_Basics",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Interval",
      "org.joda.time.TestTimeOfDay_Basics",
      "org.joda.time.base.BasePartial",
      "org.joda.time.YearMonth",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.LocalTime",
      "org.joda.time.TestDateTime_Basics",
      "org.joda.time.MockZone",
      "org.joda.time.TestInstant_Basics",
      "org.joda.time.TestMutableDateTime_Basics",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.MonthDay",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.Instant",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.PeriodType",
      "org.joda.time.Partial",
      "org.joda.time.TestMutableInterval_Constructors",
      "org.joda.time.TestLocalDateTime_Basics",
      "org.joda.time.TestInterval_Constructors",
      "org.joda.time.TestBasePartial$MockPartial",
      "org.joda.time.TestMutableInterval_Updates"
    );
  }
}
