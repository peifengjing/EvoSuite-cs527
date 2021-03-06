/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:08:09 GMT 2017
 */

package org.asynchttpclient.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import org.asynchttpclient.util.MiscUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MiscUtils_ESTest extends MiscUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = MiscUtils.withDefault(objectArray0[0], (Object) "y=x=s=M20bEW[,OQ");
      assertEquals("y=x=s=M20bEW[,OQ", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("", "true");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      MiscUtils.closeSilently(mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = MiscUtils.getBoolean("true", true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        MiscUtils.getCause((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.MiscUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        MiscUtils.getBoolean((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        MiscUtils.getBoolean("", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = MiscUtils.isEmpty((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = MiscUtils.isEmpty("&5G:TQc\"O");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      MockThrowable mockThrowable1 = new MockThrowable("", mockThrowable0);
      Throwable throwable0 = MiscUtils.getCause(mockThrowable1);
      assertSame(mockThrowable0, throwable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Throwable throwable0 = MiscUtils.getCause(mockThrowable0);
      assertSame(throwable0, mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MiscUtils.closeSilently(byteArrayOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MiscUtils.closeSilently((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = MiscUtils.withDefault((Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      MockThaiBuddhistDate mockThaiBuddhistDate1 = MiscUtils.withDefault(mockThaiBuddhistDate0, (MockThaiBuddhistDate) null);
      assertSame(mockThaiBuddhistDate1, mockThaiBuddhistDate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = MiscUtils.getBoolean("&5G:TQc\"O", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, MockThaiBuddhistDate> hashMap0 = new HashMap<String, MockThaiBuddhistDate>();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      hashMap0.put((String) null, mockThaiBuddhistDate0);
      boolean boolean0 = MiscUtils.isNonEmpty((Map<?, ?>) hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, MockThaiBuddhistDate> hashMap0 = new HashMap<String, MockThaiBuddhistDate>();
      boolean boolean0 = MiscUtils.isNonEmpty((Map<?, ?>) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = MiscUtils.isNonEmpty((Map<?, ?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      linkedList0.add((Object) mockJapaneseDate0);
      boolean boolean0 = MiscUtils.isNonEmpty((Collection<?>) linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashSet<MockJapaneseDate> linkedHashSet0 = new LinkedHashSet<MockJapaneseDate>();
      boolean boolean0 = MiscUtils.isNonEmpty((Collection<?>) linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = MiscUtils.isNonEmpty((Collection<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = MiscUtils.isNonEmpty(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = MiscUtils.isNonEmpty(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = MiscUtils.isNonEmpty((byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = MiscUtils.isNonEmpty(objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      boolean boolean0 = MiscUtils.isNonEmpty(objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = MiscUtils.isNonEmpty((Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = MiscUtils.isEmpty("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = MiscUtils.isNonEmpty("cwI/S+#y3{t");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = MiscUtils.isNonEmpty((String) null);
      assertFalse(boolean0);
  }
}
