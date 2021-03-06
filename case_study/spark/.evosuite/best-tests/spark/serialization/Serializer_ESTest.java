/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:17:06 GMT 2017
 */

package spark.serialization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;
import spark.serialization.BytesSerializer;
import spark.serialization.DefaultSerializer;
import spark.serialization.InputStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Serializer_ESTest extends Serializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("a732T]5", true);
      Object object0 = new Object();
      defaultSerializer0.process(mockFileOutputStream0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      Object object0 = new Object();
      boolean boolean0 = defaultSerializer0.canProcess(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      boolean boolean0 = inputStreamSerializer0.canProcess((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      // Undeclared exception!
      try { 
        defaultSerializer0.process((OutputStream) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("SH3 QwpN6Ifu");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        inputStreamSerializer0.process(bufferedOutputStream0, mockFileOutputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.io.MockFileOutputStream cannot be cast to java.io.InputStream
         //
         verifyException("spark.serialization.InputStreamSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      Object object0 = new Object();
      bytesSerializer0.setNext(defaultSerializer0);
      // Undeclared exception!
      try { 
        bytesSerializer0.processElement((OutputStream) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.serialization.DefaultSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      Object object0 = new Object();
      bytesSerializer0.processElement((OutputStream) null, object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        defaultSerializer0.processElement(pipedOutputStream0, pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
}
