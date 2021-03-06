/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 16:49:39 GMT 2017
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.joda.time.format.FormatUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormatUtils_ESTest extends FormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FormatUtils.createErrorMessage("oq).=,kM:9", 10);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FormatUtils.createErrorMessage("o.#oM@cEE{N^^AuNP*|", (-1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormatUtils.createErrorMessage("Invalid format: \"\"W<pg)ldl_\" is malformed at \"W<pg)ldl_\"", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FormatUtils.calculateDigitCount(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormatUtils.calculateDigitCount(10);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(18);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 9223372036854775791L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      FormatUtils.writeUnpaddedInteger((Writer) pipedWriter0, 18);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(18);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 100L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) 10);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 0L);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 9223372036854775791L);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      FormatUtils.appendUnpaddedInteger((Appendable) mockPrintStream0, 18);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("Invalid format: \"");
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-63L), 0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(48);
      FormatUtils.appendPaddedInteger(stringBuffer0, 100L, (-87));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FormatUtils.parseTwoDigits("b>dH2wPNZ~!!YJI", 1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FormatUtils.parseTwoDigits("\" is malformed at \"", 1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writeUnpaddedInteger((Writer) null, 2154L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.writeUnpaddedInteger((Writer) pipedWriter0, (long) 197);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writeUnpaddedInteger((Writer) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("\" is too short");
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0, charsetEncoder0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(outputStreamWriter0, true);
      // Undeclared exception!
      FormatUtils.writePaddedInteger((Writer) mockPrintWriter0, 1536L, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writePaddedInteger((Writer) null, (-1136L), (-1393));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.writePaddedInteger((Writer) pipedWriter0, 0L, 509);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.writePaddedInteger((Writer) pipedWriter0, (-962), (-962));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.parseTwoDigits((CharSequence) null, 1110);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendUnpaddedInteger((StringBuffer) null, 978L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendUnpaddedInteger((StringBuffer) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendUnpaddedInteger((Appendable) null, 924L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.appendUnpaddedInteger((Appendable) pipedWriter0, (long) 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendUnpaddedInteger((Appendable) null, 32);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.appendUnpaddedInteger((Appendable) pipedWriter0, 10);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          StringBuffer stringBuffer0 = new StringBuffer();
          // Undeclared exception!
          FormatUtils.appendPaddedInteger(stringBuffer0, (long) 2147483625, 2147483625);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendPaddedInteger((StringBuffer) null, 0L, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      // Undeclared exception!
      FormatUtils.appendPaddedInteger(stringBuffer0, 2147483635, 2147483635);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendPaddedInteger((StringBuffer) null, 20, 20);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      FormatUtils.appendPaddedInteger((Appendable) stringBuffer0, 907L, 13421772);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendPaddedInteger((Appendable) null, 0L, (-2181));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.appendPaddedInteger((Appendable) pipedWriter0, 22L, (-2141));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendPaddedInteger((Appendable) null, 3329, 48);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.appendPaddedInteger((Appendable) pipedWriter0, (-463), Integer.MIN_VALUE);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        FormatUtils.writeUnpaddedInteger((Writer) pipedWriter0, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-231));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1006);
      FormatUtils.appendUnpaddedInteger((Appendable) charArrayWriter0, 1586L);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
      FormatUtils.appendUnpaddedInteger((Appendable) mockPrintWriter0, (-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedWriter0);
      FormatUtils.appendUnpaddedInteger((Appendable) mockPrintWriter0, (-1));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\" is malformed at \"");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      FormatUtils.appendUnpaddedInteger((Appendable) mockPrintWriter0, (-3714));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("\" is too short", true);
      FormatUtils.writePaddedInteger((Writer) mockFileWriter0, 1073741824, 4);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Invalid format: \"");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, true);
      FormatUtils.writePaddedInteger((Writer) mockFileWriter0, (-2320), 2198);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(18);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 18, 18);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writePaddedInteger((Writer) null, 100, 30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("...", true);
      // Undeclared exception!
      FormatUtils.appendPaddedInteger((Appendable) mockFileWriter0, 13421772, 13421772);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger((Appendable) stringBuffer0, 2179, 18);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      FormatUtils.appendPaddedInteger((Appendable) stringBuilder0, 20, 20);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger((Appendable) stringBuffer0, 210, 210);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FormatUtils.createErrorMessage("", 210);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FormatUtils.createErrorMessage("", 0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage("D-}uUwA\"", (-76));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FormatUtils.calculateDigitCount(1000L);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FormatUtils.calculateDigitCount(10000L);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FormatUtils.calculateDigitCount(100L);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FormatUtils.calculateDigitCount((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FormatUtils.calculateDigitCount((-1L));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FormatUtils.calculateDigitCount(0L);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(9);
      FormatUtils.writeUnpaddedInteger((Writer) charArrayWriter0, (-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("Fi/'|bgkD k)");
      FormatUtils.appendUnpaddedInteger((Appendable) stringBuffer0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(0);
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 100L);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(9);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      FormatUtils.writePaddedInteger((Writer) mockPrintWriter0, (-9223372036854775808L), 1006);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(9);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      FormatUtils.writePaddedInteger((Writer) mockPrintWriter0, (-9223372036854775808L), 0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1006);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      FormatUtils.writePaddedInteger((Writer) mockPrintWriter0, 9223372036854775796L, 1006);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedWriter0);
      FormatUtils.writePaddedInteger((Writer) mockPrintWriter0, (long) 10, 10);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-1), 10);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MockFile mockFile0 = new MockFile("N");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, true);
      FormatUtils.writePaddedInteger((Writer) mockFileWriter0, Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger((Appendable) stringBuffer0, 9223372036854775791L, 2987);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775808L), (-1318));
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger((Appendable) stringBuffer0, (-9223372036854775808L), 2987);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("Invalid format: \"");
      FormatUtils.appendPaddedInteger(stringBuffer0, 1073741824, 0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(0);
      FormatUtils.appendPaddedInteger((Appendable) charArrayWriter0, (-1426L), 0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("Invalid format: \"\" is too short");
      FormatUtils.appendPaddedInteger(stringBuffer0, 10, 721);
      assertEquals(752, stringBuffer0.length());
      assertEquals("Invalid format: \"\" is too short0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 14, (-1445));
      FormatUtils.appendPaddedInteger((Appendable) stringBuffer0, 2179, 18);
      int int0 = FormatUtils.parseTwoDigits(stringBuffer0, 14);
      assertEquals(20, stringBuffer0.length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\" is malformed at \"");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      FormatUtils.appendPaddedInteger((Appendable) mockPrintWriter0, (-8), 60);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) Integer.MIN_VALUE, 3286);
      assertEquals(3287, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      FormatUtils.appendPaddedInteger((Appendable) stringBuffer0, Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(11, stringBuffer0.length());
      assertEquals("-2147483648", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.parseTwoDigits("", (-3486));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
