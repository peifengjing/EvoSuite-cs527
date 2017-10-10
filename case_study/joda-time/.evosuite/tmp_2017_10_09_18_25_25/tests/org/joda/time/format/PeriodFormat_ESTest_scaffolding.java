/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 10 05:27:57 GMT 2017
 */

package org.joda.time.format;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PeriodFormat_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.format.PeriodFormat"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PeriodFormat_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.field.AbstractPartialFieldProperty",
      "org.joda.time.field.StrictDateTimeField",
      "org.joda.time.MockZone",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix",
      "org.joda.time.ReadWritableInterval",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Duration",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.format.PeriodFormatter",
      "org.joda.time.format.DateTimePrinterInternalPrinter",
      "org.joda.time.Interval",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.format.DateTimeParserBucket",
      "org.joda.time.ReadWritablePeriod",
      "org.joda.time.LocalDateTime",
      "org.joda.time.base.BasePeriod$1",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.format.PeriodPrinter",
      "org.joda.time.convert.IntervalConverter",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.chrono.LimitChronology$LimitException",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId",
      "org.joda.time.YearMonthDay",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.YearMonth",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.LocalTime$Property",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.DateTime$Property",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.Partial",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.format.PeriodFormatterBuilder$IgnorableAffix",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.format.DateTimeFormat$StyleFormatter",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.Minutes",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BasePartial",
      "org.joda.time.base.AbstractDuration",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.Hours",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.LocalTime",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.TimeOfDay",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.Partial$Property",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.format.PeriodFormatterBuilder$RegExAffix$1",
      "org.joda.time.ReadableDuration",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.DurationField",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName",
      "org.joda.time.chrono.IslamicChronology$LeapYearPatternType",
      "org.joda.time.DateTime",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.joda.time.format.DateTimeParserInternalParser",
      "org.joda.time.convert.PeriodConverter",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.Instant",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.convert.Converter",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.convert.PartialConverter",
      "org.joda.time.Seconds",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.MutableDateTime$Property",
      "org.joda.time.ReadableInterval",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.field.LenientDateTimeField",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.convert.AbstractConverter",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.tz.ZoneInfoProvider$1",
      "org.joda.time.chrono.EthiopicChronology",
      "org.joda.time.PeriodType",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.format.InternalPrinter",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.chrono.IslamicChronology",
      "org.joda.time.LocalDateTime$Property",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.MonthDay",
      "org.joda.time.MutablePeriod",
      "org.joda.time.chrono.GJCacheKey",
      "org.joda.time.MutableDateTime",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.format.PeriodParser",
      "org.joda.time.format.PeriodFormatterBuilder$PluralAffix",
      "org.joda.time.DateMidnight",
      "org.joda.time.convert.DurationConverter",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.Days",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.YearMonth$Property",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.ReadableInstant",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.tz.Provider",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.DurationFieldType",
      "org.joda.time.format.PeriodFormat$DynamicWordBased",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.MutableInterval",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.InstantConverter",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.chrono.StrictChronology",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.Period",
      "org.joda.time.format.PeriodFormat",
      "org.joda.time.Weeks",
      "org.joda.time.format.DateTimeFormat$StyleFormatterCacheKey",
      "org.joda.time.Chronology",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix",
      "org.joda.time.format.PeriodFormatterBuilder$RegExAffix",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.LocalDate",
      "org.joda.time.MockPartial",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.MonthDay$Property",
      "org.joda.time.format.InternalParserDateTimeParser",
      "org.joda.time.format.InternalParser",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.field.BaseDurationField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PeriodFormat_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.format.PeriodFormat",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.PeriodType",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.Period",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.Duration",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.Hours",
      "org.joda.time.Weeks",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.chrono.EthiopicChronology",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalDate",
      "org.joda.time.Minutes",
      "org.joda.time.Days",
      "org.joda.time.MutablePeriod",
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
      "org.joda.time.Seconds",
      "org.joda.time.chrono.IslamicChronology$LeapYearPatternType",
      "org.joda.time.chrono.IslamicChronology",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.Instant",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.MutableDateTime",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Interval",
      "org.joda.time.chrono.StrictChronology",
      "org.joda.time.field.StrictDateTimeField",
      "org.joda.time.LocalTime",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.field.LenientDateTimeField",
      "org.joda.time.MockPartial",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.base.BasePartial",
      "org.joda.time.YearMonth",
      "org.joda.time.MutableInterval",
      "org.joda.time.MockZone",
      "org.joda.time.Partial",
      "org.joda.time.format.PeriodFormatterBuilder$RegExAffix",
      "org.joda.time.LocalDateTime",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId",
      "org.joda.time.format.DateTimeFormat$StyleFormatter",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.MonthDay",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.DateTime$Property",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"
    );
  }
}
