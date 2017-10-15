/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:29:56 GMT 2017
 */

package org.springside.modules.utils.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import net.sf.cglib.reflect.FastClass;
import net.sf.cglib.reflect.FastMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springside.modules.utils.reflect.FastMethodInvoker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastMethodInvoker_ESTest extends FastMethodInvoker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FastMethod fastMethod0 = mock(FastMethod.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(fastMethod0).invoke(any() , any(java.lang.Object[].class));
      FastMethodInvoker fastMethodInvoker0 = new FastMethodInvoker(fastMethod0);
      Object[] objectArray0 = new Object[3];
      FastClass fastClass0 = fastMethodInvoker0.invoke((Object) fastMethodInvoker0, objectArray0);
      assertNull(fastClass0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastMethodInvoker fastMethodInvoker0 = new FastMethodInvoker((FastMethod) null);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        fastMethodInvoker0.invoke((Object) "", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.reflect.FastMethodInvoker", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        FastMethodInvoker.createSetter(classArray0[1], "H8R|EtOkcN8eixS*\"", class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // class can't be null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastMethodInvoker.createGetter((Class<?>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // class can't be null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<FastClass> class0 = FastClass.class;
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 8);
      // Undeclared exception!
      try { 
        FastMethodInvoker.create(class0, (String) null, classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // methodName can't be blank
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<FastClass> class1 = FastClass.class;
      // Undeclared exception!
      try { 
        FastMethodInvoker.createSetter(class0, "org.springside.modules.utils.reflect.FastMethodInvoker", class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not find getter method [org.springside.modules.utils.reflect.FastMethodInvoker] on target [class java.lang.Integer]
         //
         verifyException("org.springside.modules.utils.reflect.FastMethodInvoker", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        FastMethodInvoker.createGetter(class0, "okca-re=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not find getter method [okca-re=] on target [class java.lang.Object]
         //
         verifyException("org.springside.modules.utils.reflect.FastMethodInvoker", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<FastClass>[] classArray0 = (Class<FastClass>[]) Array.newInstance(Class.class, 6);
      // Undeclared exception!
      try { 
        FastMethodInvoker.create(class0, "VX*)FBgaZ3PEV", classArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not find method [VX*)FBgaZ3PEV] on target [class java.lang.Object]
         //
         verifyException("org.springside.modules.utils.reflect.FastMethodInvoker", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FastMethod fastMethod0 = mock(FastMethod.class, new ViolatedAssumptionAnswer());
      doReturn("").when(fastMethod0).invoke(any() , any(java.lang.Object[].class));
      FastMethodInvoker fastMethodInvoker0 = new FastMethodInvoker(fastMethod0);
      Object[] objectArray0 = new Object[8];
      String string0 = fastMethodInvoker0.invoke((Object) "&{u$zFWL", objectArray0);
      assertEquals("", string0);
  }
}