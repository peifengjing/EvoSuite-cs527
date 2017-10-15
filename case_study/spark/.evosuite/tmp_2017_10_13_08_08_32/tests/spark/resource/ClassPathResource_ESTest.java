/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 16:10:55 GMT 2017
 */

package spark.resource;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.resource.ClassPathResource;
import spark.resource.Resource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassPathResource_ESTest extends ClassPathResource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource("2Aj!-vZR^Q/`$", classLoader0);
      ClassPathResource classPathResource1 = (ClassPathResource)classPathResource0.createRelative("2Aj!-vZR^Q/`$");
      assertEquals("2Aj!-vZR^Q/2Aj!-vZR^Q/`$", classPathResource1.getPath());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<ClassPathResource> class0 = ClassPathResource.class;
      ClassPathResource classPathResource0 = new ClassPathResource("S_FcSsyB?&<l0vUz(Ys", classLoader0, class0);
      ClassPathResource classPathResource1 = (ClassPathResource)classPathResource0.createRelative((String) null);
      String string0 = classPathResource1.getPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassPathResource classPathResource0 = new ClassPathResource("");
      String string0 = classPathResource0.getPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource(" cannot be opened because it does not exist", classLoader0);
      Resource resource0 = classPathResource0.createRelative((String) null);
      String string0 = resource0.getFilename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource("", classLoader0);
      String string0 = classPathResource0.getFilename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<String> class0 = String.class;
      ClassPathResource classPathResource0 = new ClassPathResource((String) null, classLoader0, class0);
      // Undeclared exception!
      try { 
        classPathResource0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.resource.ClassPathResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource(" cannot be opened because it does not exist", classLoader0);
      Resource resource0 = classPathResource0.createRelative((String) null);
      // Undeclared exception!
      try { 
        resource0.getURL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<ClassPathResource> class0 = ClassPathResource.class;
      ClassPathResource classPathResource0 = new ClassPathResource((String) null, classLoader0, class0);
      // Undeclared exception!
      try { 
        classPathResource0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Integer> class0 = Integer.class;
      ClassPathResource classPathResource0 = new ClassPathResource((String) null, classLoader0, class0);
      // Undeclared exception!
      try { 
        classPathResource0.getDescription();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<String> class0 = String.class;
      ClassPathResource classPathResource0 = new ClassPathResource((String) null, classLoader0, class0);
      // Undeclared exception!
      try { 
        classPathResource0.exists();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource("", classLoader0);
      Resource resource0 = classPathResource0.createRelative((String) null);
      // Undeclared exception!
      try { 
        resource0.createRelative("class path resource []");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = null;
      try {
        classPathResource0 = new ClassPathResource((String) null, classLoader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassPathResource classPathResource0 = null;
      try {
        classPathResource0 = new ClassPathResource((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Integer> class0 = Integer.class;
      ClassPathResource classPathResource0 = new ClassPathResource("+I0ZK", classLoader0, class0);
      String string0 = classPathResource0.getDescription();
      assertEquals("class path resource [java/lang/+I0ZK]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource(" cannot be opened because it does not exist", classLoader0);
      String string0 = classPathResource0.getDescription();
      assertEquals("class path resource [ cannot be opened because it does not exist]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassPathResource classPathResource0 = new ClassPathResource("Vu!5l6NQ 0M=)UD7", (ClassLoader) null);
      assertFalse(classPathResource0.isOpen());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Object> class0 = Object.class;
      ClassPathResource classPathResource0 = new ClassPathResource("~%<3/Eb+Xg.W", classLoader0, class0);
      ClassPathResource classPathResource1 = new ClassPathResource("~%<3/Eb+Xg.W", classLoader0, class0);
      boolean boolean0 = classPathResource0.equals(classPathResource1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Integer> class0 = Integer.class;
      ClassPathResource classPathResource0 = new ClassPathResource("U", classLoader0, class0);
      ClassPathResource classPathResource1 = new ClassPathResource("U", classLoader0);
      boolean boolean0 = classPathResource0.equals(classPathResource1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource("", classLoader0);
      ClassPathResource classPathResource1 = new ClassPathResource("");
      boolean boolean0 = classPathResource0.equals(classPathResource1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassPathResource classPathResource0 = new ClassPathResource("Rh");
      ClassPathResource classPathResource1 = new ClassPathResource("Rh");
      // Undeclared exception!
      try { 
        classPathResource0.equals(classPathResource1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.resource.ClassPathResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<ClassPathResource> class0 = ClassPathResource.class;
      ClassPathResource classPathResource0 = new ClassPathResource("S_FcSsyB?&<l0vUz(Ys", classLoader0, class0);
      Resource resource0 = classPathResource0.createRelative((String) null);
      boolean boolean0 = classPathResource0.equals(resource0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassPathResource classPathResource0 = new ClassPathResource("");
      boolean boolean0 = classPathResource0.equals(classPathResource0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Integer> class0 = Integer.class;
      ClassPathResource classPathResource0 = new ClassPathResource("/", classLoader0, class0);
      String string0 = classPathResource0.getDescription();
      assertEquals("class path resource []", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource("", classLoader0);
      URL uRL0 = classPathResource0.getURL();
      assertEquals((-1), uRL0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Integer> class0 = Integer.class;
      ClassPathResource classPathResource0 = new ClassPathResource("..", classLoader0, class0);
      try { 
        classPathResource0.getURL();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // class path resource [java/lang/..] cannot be resolved to URL because it does not exist
         //
         verifyException("spark.resource.ClassPathResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource("2Aj!-vZR^Q/`$", classLoader0);
      try { 
        classPathResource0.getInputStream();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // class path resource [2Aj!-vZR^Q/`$] cannot be opened because it does not exist
         //
         verifyException("spark.resource.ClassPathResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Integer> class0 = Integer.class;
      ClassPathResource classPathResource0 = new ClassPathResource("/", classLoader0, class0);
      InputStream inputStream0 = classPathResource0.getInputStream();
      assertEquals(6, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<ClassPathResource> class0 = ClassPathResource.class;
      ClassPathResource classPathResource0 = new ClassPathResource("S_FcSsyB?&<l0vUz(Ys", classLoader0, class0);
      boolean boolean0 = classPathResource0.exists();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource(" cannot be opened because it does not exist", classLoader0);
      boolean boolean0 = classPathResource0.exists();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource("", classLoader0);
      boolean boolean0 = classPathResource0.exists();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource(" cannot be opened because it does not exist", classLoader0);
      classPathResource0.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource(" cannot be opened because it does not exist", classLoader0);
      String string0 = classPathResource0.getPath();
      assertEquals(" cannot be opened because it does not exist", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassPathResource classPathResource0 = new ClassPathResource("");
      Object object0 = new Object();
      boolean boolean0 = classPathResource0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassPathResource classPathResource0 = new ClassPathResource(" cannot be opened because it does not exist", classLoader0);
      String string0 = classPathResource0.getFilename();
      assertEquals(" cannot be opened because it does not exist", string0);
  }
}
