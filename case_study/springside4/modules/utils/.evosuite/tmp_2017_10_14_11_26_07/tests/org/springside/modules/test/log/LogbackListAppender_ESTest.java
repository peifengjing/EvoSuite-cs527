/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:09:38 GMT 2017
 */

package org.springside.modules.test.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.spi.LoggingEventVO;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.springside.modules.test.log.LogbackListAppender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LogbackListAppender_ESTest extends LogbackListAppender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      logbackListAppender0.addToLogger("");
      assertTrue(logbackListAppender0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Logger> class0 = Logger.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      Class<String> class1 = String.class;
      logbackListAppender0.removeFromLogger(class1);
      assertTrue(logbackListAppender0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      LoggingEvent loggingEvent0 = new LoggingEvent();
      logbackListAppender0.doAppend(loggingEvent0);
      int int0 = logbackListAppender0.getLogsCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      LoggerContext loggerContext0 = new LoggerContext();
      Class<Object> class0 = Object.class;
      Logger logger0 = loggerContext0.getLogger(class0);
      Level level0 = Level.ALL;
      MockThrowable mockThrowable0 = new MockThrowable();
      Object[] objectArray0 = new Object[5];
      LoggingEvent loggingEvent0 = new LoggingEvent((String) null, logger0, level0, "", mockThrowable0, objectArray0);
      logbackListAppender0.doAppend(loggingEvent0);
      String string0 = logbackListAppender0.getLastMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      LoggerContext loggerContext0 = new LoggerContext();
      Logger logger0 = loggerContext0.getLogger(class0);
      Level level0 = Level.DEBUG;
      MockThrowable mockThrowable0 = new MockThrowable("com.google.common.collect.ImmutableList");
      Object[] objectArray0 = new Object[3];
      LoggingEvent loggingEvent0 = new LoggingEvent("com.google.common.collect.ImmutableList", logger0, level0, "com.google.common.collect.ImmutableList", mockThrowable0, objectArray0);
      logbackListAppender0.doAppend(loggingEvent0);
      ILoggingEvent iLoggingEvent0 = logbackListAppender0.getLastLog();
      assertSame(iLoggingEvent0, loggingEvent0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      LoggingEvent loggingEvent0 = new LoggingEvent();
      loggingEvent0.setMessage(",@%}+2+LJGHoqS:c2/");
      logbackListAppender0.doAppend(loggingEvent0);
      String string0 = logbackListAppender0.getFirstMessage();
      assertEquals(",@%}+2+LJGHoqS:c2/", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      LoggingEvent loggingEvent0 = new LoggingEvent();
      logbackListAppender0.doAppend(loggingEvent0);
      List<ILoggingEvent> list0 = logbackListAppender0.getAllLogs();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      // Undeclared exception!
      try { 
        logbackListAppender0.removeFromLogger((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name argument cannot be null
         //
         verifyException("ch.qos.logback.classic.LoggerContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      logbackListAppender0.append((ILoggingEvent) null);
      // Undeclared exception!
      try { 
        logbackListAppender0.getLastMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.test.log.LogbackListAppender", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      logbackListAppender0.append((ILoggingEvent) null);
      // Undeclared exception!
      try { 
        logbackListAppender0.getFirstMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.test.log.LogbackListAppender", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogbackListAppender.create((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name argument cannot be null
         //
         verifyException("ch.qos.logback.classic.LoggerContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      LoggingEvent loggingEvent0 = new LoggingEvent();
      logbackListAppender0.doAppend(loggingEvent0);
      ILoggingEvent iLoggingEvent0 = logbackListAppender0.getFirstLog();
      assertSame(iLoggingEvent0, loggingEvent0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      // Undeclared exception!
      try { 
        logbackListAppender0.addToLogger((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name argument cannot be null
         //
         verifyException("ch.qos.logback.classic.LoggerContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      Class<LoggingEventVO> class0 = LoggingEventVO.class;
      logbackListAppender0.addToLogger(class0);
      assertTrue(logbackListAppender0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      boolean boolean0 = logbackListAppender0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      assertTrue(logbackListAppender0.isEmpty());
      
      logbackListAppender0.append((ILoggingEvent) null);
      boolean boolean0 = logbackListAppender0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      String string0 = logbackListAppender0.getLastMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      LoggerContext loggerContext0 = new LoggerContext();
      Logger logger0 = loggerContext0.getLogger(class0);
      Level level0 = Level.DEBUG;
      MockThrowable mockThrowable0 = new MockThrowable("com.google.common.collect.ImmutableList");
      Object[] objectArray0 = new Object[3];
      LoggingEvent loggingEvent0 = new LoggingEvent("com.google.common.collect.ImmutableList", logger0, level0, "com.google.common.collect.ImmutableList", mockThrowable0, objectArray0);
      logbackListAppender0.doAppend(loggingEvent0);
      String string0 = logbackListAppender0.getLastMessage();
      assertEquals("com.google.common.collect.ImmutableList", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      ILoggingEvent iLoggingEvent0 = logbackListAppender0.getLastLog();
      assertNull(iLoggingEvent0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      String string0 = logbackListAppender0.getFirstMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      ILoggingEvent iLoggingEvent0 = logbackListAppender0.getFirstLog();
      assertNull(iLoggingEvent0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      int int0 = logbackListAppender0.getLogsCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      logbackListAppender0.clearLogs();
      assertTrue(logbackListAppender0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      logbackListAppender0.removeFromLogger("");
      assertEquals(0, logbackListAppender0.getLogsCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Logger> class0 = Logger.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      Class<String> class1 = String.class;
      LoggerContext loggerContext0 = new LoggerContext();
      Logger logger0 = loggerContext0.getLogger(class1);
      MockThrowable mockThrowable0 = new MockThrowable("");
      Object[] objectArray0 = new Object[8];
      LoggingEvent loggingEvent0 = new LoggingEvent("YU(", logger0, (Level) null, "", mockThrowable0, objectArray0);
      logbackListAppender0.append(loggingEvent0);
      String string0 = logbackListAppender0.getFirstMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Logger> class0 = Logger.class;
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create(class0);
      List<ILoggingEvent> list0 = logbackListAppender0.getAllLogs();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = new LogbackListAppender();
      logbackListAppender0.removeFromRootLogger();
      assertTrue(logbackListAppender0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      // Undeclared exception!
      try { 
        logbackListAppender0.removeFromLogger((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogbackListAppender.create((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LogbackListAppender logbackListAppender0 = LogbackListAppender.create("");
      logbackListAppender0.addToRootLogger();
      assertEquals(0, logbackListAppender0.getLogsCount());
  }
}
