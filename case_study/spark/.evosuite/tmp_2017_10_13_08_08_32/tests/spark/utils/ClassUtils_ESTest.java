/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 16:23:45 GMT 2017
 */

package spark.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.utils.ClassUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<?> class0 = ClassUtils.resolvePrimitiveClassName("]dW<!el");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("spark.utils.ClassUtils", classLoader0);
      assertEquals("class spark.utils.ClassUtils", class0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.forName((String) null, classLoader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<?> class0 = ClassUtils.resolvePrimitiveClassName("<}s2d$PJ\"~i'Jzm*");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<?> class0 = ClassUtils.resolvePrimitiveClassName("[Z");
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      String string0 = ClassUtils.classPackageAsResourcePath(class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ClassUtils.classPackageAsResourcePath((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = ClassUtils.classPackageAsResourcePath(class0);
      assertEquals("java/lang", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<?> class0 = ClassUtils.resolvePrimitiveClassName((String) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.forName("A/).!kSi}i89_\"", classLoader0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        ClassUtils.forName("LN", (ClassLoader) null);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      try { 
        ClassUtils.forName("[Lilde:", classLoader0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.forName("[L;", classLoader0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("spark.utils.ClassUtils[]", classLoader0);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.forName("[Z", classLoader0);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("[spark.utils.ClassUtils", classLoader0);
      assertTrue(class0.isArray());
  }
}
