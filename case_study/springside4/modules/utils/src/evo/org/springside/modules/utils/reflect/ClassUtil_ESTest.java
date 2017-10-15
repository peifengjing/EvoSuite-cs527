/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 19:30:21 GMT 2017
 */

package org.springside.modules.utils.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.reflect.ClassUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassUtil_ESTest extends ClassUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Field field0 = ClassUtil.getAccessibleField(class0, " not set the actual class on superclass generic parameter");
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Set<Annotation> set0 = ClassUtil.getAllAnnotations(class0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtil.getShortClassName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = ClassUtil.getShortClassName(class0);
      assertEquals("Integer", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = ClassUtil.getPackageName("java.lang");
      assertEquals("java", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtil.getPackageName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      String string0 = ClassUtil.getPackageName(class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Class<?>> list0 = ClassUtil.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<ClassUtils> class1 = ClassUtil.getClassGenricType((Class) class0);
      List<Class<?>> list0 = ClassUtil.getAllSuperclasses(class1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      List<Class<?>> list0 = ClassUtil.getAllInterfaces(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Method> class0 = Method.class;
      List<Class<?>> list0 = ClassUtil.getAllInterfaces(class0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      Method method0 = ClassUtil.getAccessibleMethodByName(class0, "getPublicMethod");
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Method method0 = ClassUtil.getAccessibleMethod(class0, "intValue", (Class<?>[]) null);
      assertFalse(method0.isAccessible());
      assertNotNull(method0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.unwrapCglib((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Instance must not be null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.makeAccessible((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.makeAccessible((Field) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.getShortClassName("[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        ClassUtil.getSetterMethod(class0, (String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Long> class0 = Long.class;
      // Undeclared exception!
      try { 
        ClassUtil.getSetterMethod((Class<?>) null, (String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // class can't be null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ClassUtil.getGetterMethod(class0, ",^A+M*YYE4*d");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.getGetterMethod((Class<?>) null, ">42G");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // class can't be null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.getClassGenricType((Class) null, 3794);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.getClassGenricType((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Field>[] classArray0 = (Class<Field>[]) Array.newInstance(Class.class, 3);
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAnnotatedPublicMethods((Class<?>) classArray0[2], class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.util.ReflectionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.getAnnotatedPublicFields((Class<?>) null, (Class<Annotation>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.util.ReflectionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAnnotatedFields((Class<?>) class0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.util.ReflectionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.getAllAnnotations((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleMethodByName(class0, "|`74$PUD'-r(`j.o?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleMethodByName(class0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // methodName can't be blank
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Short> class0 = Short.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleMethodByName(class0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // methodName can't be blank
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 6);
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleMethod(class0, "o^/d", classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Character>[] classArray0 = (Class<Character>[]) Array.newInstance(Class.class, 1);
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleMethod(class0, (String) null, classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // methodName can't be blank
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Character>[] classArray0 = (Class<Character>[]) Array.newInstance(Class.class, 0);
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleMethod(class0, "", classArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // methodName can't be blank
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleField(class0, "The validated collection contains null element at index: %d");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.ClassUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleField(class0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fieldName can't be blank
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<ClassUtil> class0 = ClassUtil.class;
      // Undeclared exception!
      try { 
        ClassUtil.getAccessibleField(class0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fieldName can't be blank
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class class1 = ClassUtil.getClassGenricType(class0, 0);
      assertEquals(1, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Field> class0 = Field.class;
      Method method0 = ClassUtil.getAccessibleMethodByName(class0, "getFactory");
      AccessibleObject[] accessibleObjectArray0 = new AccessibleObject[7];
      accessibleObjectArray0[0] = (AccessibleObject) method0;
      accessibleObjectArray0[1] = (AccessibleObject) method0;
      accessibleObjectArray0[2] = (AccessibleObject) method0;
      accessibleObjectArray0[3] = (AccessibleObject) method0;
      accessibleObjectArray0[4] = (AccessibleObject) method0;
      accessibleObjectArray0[5] = (AccessibleObject) method0;
      accessibleObjectArray0[6] = (AccessibleObject) method0;
      AccessibleObject.setAccessible(accessibleObjectArray0, false);
      ClassUtil.makeAccessible(method0);
      assertTrue(method0.isAccessible());
      assertEquals(2, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Annotation> class1 = Annotation.class;
      Set<Field> set0 = ClassUtil.getAnnotatedFields((Class<?>) class0, class1);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Annotation> class1 = Annotation.class;
      Set<Field> set0 = ClassUtil.getAnnotatedPublicFields((Class<?>) class0, class1);
      Class<?> class2 = ClassUtil.unwrapCglib(set0);
      ClassUtil.getClassGenricType(class2, 3);
      assertEquals(1, class2.getModifiers());
      assertEquals(0, set0.size());
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Annotation> class1 = Annotation.class;
      Set<Field> set0 = ClassUtil.getAnnotatedPublicFields((Class<?>) class0, class1);
      Class<?> class2 = ClassUtil.unwrapCglib(set0);
      ClassUtil.getClassGenricType(class2, (-11));
      assertEquals(1, class2.getModifiers());
      assertTrue(set0.isEmpty());
      assertEquals("class java.util.HashSet", class2.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtil.getDefaultClassLoader();
      boolean boolean0 = ClassUtil.isPresent("", classLoader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<ClassUtil> class0 = ClassUtil.class;
      Class<Method>[] classArray0 = (Class<Method>[]) Array.newInstance(Class.class, 6);
      Method method0 = ClassUtil.getAccessibleMethod(class0, "7sb\"RcN#OJ7X7S+)o", classArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Field> class0 = Field.class;
      Method method0 = ClassUtil.getAccessibleMethodByName(class0, "isEnumConstant");
      ClassUtil.makeAccessible(method0);
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Field> class0 = Field.class;
      Method method0 = ClassUtil.getAccessibleMethodByName(class0, "getFactory");
      assertNotNull(method0);
      
      ClassUtil.makeAccessible(method0);
      assertTrue(method0.isAccessible());
      assertEquals("getFactory", method0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Field> class0 = Field.class;
      Method method0 = ClassUtil.getAccessibleMethodByName(class0, "org.apache.commons.lang3");
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Method method0 = ClassUtil.getGetterMethod(class0, "rWX7jkegjK|a");
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Annotation> class1 = Annotation.class;
      Set<Method> set0 = ClassUtil.getAnnotatedPublicMethods((Class<?>) class0, class1);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Field> class0 = Field.class;
      Class<Annotation> class1 = Annotation.class;
      Set<Method> set0 = ClassUtil.getAnnotatedPublicMethods((Class<?>) class0, class1);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Annotation> class1 = Annotation.class;
      Set<Field> set0 = ClassUtil.getAnnotatedFields((Class<?>) class0, class1);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Annotation> class1 = Annotation.class;
      Set<Field> set0 = ClassUtil.getAnnotatedPublicFields((Class<?>) class0, class1);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtil.getPackageName("[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = ClassUtil.getShortClassName("pNG^,5G*a-3");
      assertEquals("pNG^,5G*a-3", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = ClassUtil.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Double> class0 = Double.class;
      List<Class<?>> list0 = ClassUtil.getAllSuperclasses(class0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      String string0 = ClassUtil.getPackageName(class0);
      assertEquals("org.apache.commons.lang3", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      List<Class<?>> list0 = ClassUtil.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassUtil classUtil0 = new ClassUtil();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Method method0 = ClassUtil.getSetterMethod(class0, "org.springside.modules.utils.reflect.ClassUtil", class0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      boolean boolean0 = ClassUtil.isPresent("org.springside.modules.utils.reflect.ClassUtil", classLoader0);
      assertTrue(boolean0);
  }
}