/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 12 20:48:03 GMT 2017
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
public class DurationField_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.DurationField"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DurationField_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.DateTimeField",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.ReadableInterval",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.tz.Provider",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.DurationFieldType",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.tz.ZoneInfoProvider$1",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.format.InternalPrinter",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.MockNullZoneChronology",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.DurationField",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.Chronology",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.format.InternalParser",
      "org.joda.time.ReadablePartial",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.BaseDurationField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DurationField_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.MockNullZoneChronology",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.TestMutableInterval_Updates",
      "org.joda.time.TestInterval_Constructors",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.PeriodType",
      "org.joda.time.Years",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.TestDateTime_Basics",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.Period",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.Duration",
      "org.joda.time.Minutes",
      "org.joda.time.TestLocalDateTime_Basics",
      "org.joda.time.TestMutableDateTime_Basics",
      "org.joda.time.TestMonthDay_Basics",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalTime",
      "org.joda.time.base.BasePartial",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.MonthDay",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.TestYearMonthDay_Basics",
      "org.joda.time.Instant",
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
      "org.joda.time.Partial",
      "org.joda.time.Weeks",
      "org.joda.time.TestTimeOfDay_Basics",
      "org.joda.time.Days",
      "org.joda.time.Seconds",
      "org.joda.time.Months",
      "org.joda.time.MutablePeriod",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.TestMutableInterval_Basics"
    );
  }
}