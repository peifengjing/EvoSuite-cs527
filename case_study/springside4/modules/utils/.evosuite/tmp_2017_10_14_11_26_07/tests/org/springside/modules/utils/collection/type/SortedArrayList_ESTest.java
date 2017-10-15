/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:17:34 GMT 2017
 */

package org.springside.modules.utils.collection.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springside.modules.utils.collection.type.SortedArrayList;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortedArrayList_ESTest extends SortedArrayList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      SortedArrayList<String> sortedArrayList1 = new SortedArrayList<String>(sortedArrayList0);
      sortedArrayList1.add("=");
      sortedArrayList0.add("");
      sortedArrayList1.addAll((Collection<? extends String>) sortedArrayList0);
      SortedArrayList<Integer> sortedArrayList2 = new SortedArrayList<Integer>();
      SortedArrayList<Object> sortedArrayList3 = new SortedArrayList<Object>(sortedArrayList2);
      sortedArrayList3.add((Object) "");
      sortedArrayList3.addAll((Collection<?>) sortedArrayList1);
      sortedArrayList3.addAll((Collection<?>) sortedArrayList0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.add("=");
      sortedArrayList0.add("=");
      sortedArrayList0.add("");
      // Undeclared exception!
      try { 
        sortedArrayList0.addAll((Collection<? extends String>) sortedArrayList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.add("=");
      sortedArrayList0.add("=");
      sortedArrayList0.findInsertionPoint("");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SortedArrayList<Object> sortedArrayList0 = new SortedArrayList<Object>();
      sortedArrayList0.findInsertionPoint((Object) "", 0, (-944));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SortedArrayList<Object> sortedArrayList0 = new SortedArrayList<Object>();
      Integer integer0 = new Integer(1897);
      sortedArrayList0.findInsertionPoint((Object) integer0, (-17), (-590));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.add("=");
      sortedArrayList0.findInsertionPoint("=");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SortedArrayList<Object> sortedArrayList0 = new SortedArrayList<Object>();
      sortedArrayList0.compare("o7=Ee\"bI7F2Y!$KKO ", "o7=Ee\"bI7F2Y!$KKO ");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SortedArrayList<Integer> sortedArrayList0 = new SortedArrayList<Integer>();
      Integer integer0 = new Integer(465);
      Integer integer1 = new Integer((-3125));
      sortedArrayList0.compare(integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.compare("++ogtQ'Del!)n2#X", "i89");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SortedArrayList<Integer> sortedArrayList0 = new SortedArrayList<Integer>();
      sortedArrayList0.addAll((Collection<? extends Integer>) sortedArrayList0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.add("=");
      SortedArrayList<Integer> sortedArrayList1 = new SortedArrayList<Integer>();
      SortedArrayList<Object> sortedArrayList2 = new SortedArrayList<Object>(sortedArrayList1);
      sortedArrayList2.addAll((Collection<?>) sortedArrayList0);
      // Undeclared exception!
      try { 
        sortedArrayList2.findInsertionPoint((Object) null, (-1), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      // Undeclared exception!
      try { 
        sortedArrayList0.findInsertionPoint("", (-793), (-793));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147482855, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SortedArrayList<Integer> sortedArrayList0 = new SortedArrayList<Integer>();
      Integer integer0 = new Integer(465);
      sortedArrayList0.add(integer0);
      SortedArrayList<Object> sortedArrayList1 = new SortedArrayList<Object>(sortedArrayList0);
      // Undeclared exception!
      try { 
        sortedArrayList1.findInsertionPoint((Object) "", 0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.add("");
      SortedArrayList<Integer> sortedArrayList1 = new SortedArrayList<Integer>();
      SortedArrayList<Object> sortedArrayList2 = new SortedArrayList<Object>(sortedArrayList1);
      sortedArrayList2.addAll((Collection<?>) sortedArrayList0);
      // Undeclared exception!
      try { 
        sortedArrayList2.findInsertionPoint((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.add("=");
      SortedArrayList<Integer> sortedArrayList1 = new SortedArrayList<Integer>();
      SortedArrayList<Object> sortedArrayList2 = new SortedArrayList<Object>(sortedArrayList1);
      sortedArrayList2.addAll((Collection<?>) sortedArrayList0);
      Integer integer0 = new Integer((-297));
      // Undeclared exception!
      try { 
        sortedArrayList2.findInsertionPoint(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SortedArrayList<Integer> sortedArrayList0 = new SortedArrayList<Integer>();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        sortedArrayList0.compare((Integer) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      SortedArrayList<Object> sortedArrayList1 = new SortedArrayList<Object>(sortedArrayList0);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        sortedArrayList1.compare(integer0, sortedArrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.springside.modules.utils.collection.type.SortedArrayList cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      // Undeclared exception!
      try { 
        sortedArrayList0.addAll((Collection<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.add("=");
      SortedArrayList<Integer> sortedArrayList1 = new SortedArrayList<Integer>();
      SortedArrayList<Object> sortedArrayList2 = new SortedArrayList<Object>(sortedArrayList1);
      sortedArrayList2.addAll((Collection<?>) sortedArrayList0);
      UnaryOperator<Object> unaryOperator0 = (UnaryOperator<Object>) mock(UnaryOperator.class, new ViolatedAssumptionAnswer());
      doReturn(sortedArrayList0).when(unaryOperator0).apply(any());
      sortedArrayList2.replaceAll(unaryOperator0);
      // Undeclared exception!
      try { 
        sortedArrayList2.addAll((Collection<?>) sortedArrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.springside.modules.utils.collection.type.SortedArrayList cannot be cast to java.lang.Comparable
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SortedArrayList<Object> sortedArrayList0 = new SortedArrayList<Object>();
      sortedArrayList0.add((Object) null);
      // Undeclared exception!
      try { 
        sortedArrayList0.add((Object) "org.springside.modules.utils.collection.type.SortedArrayList");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SortedArrayList<Object> sortedArrayList0 = new SortedArrayList<Object>();
      SortedArrayList<Integer> sortedArrayList1 = new SortedArrayList<Integer>();
      sortedArrayList0.add((Object) sortedArrayList1);
      Integer integer0 = new Integer((-2154));
      // Undeclared exception!
      try { 
        sortedArrayList0.add((Object) integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.springside.modules.utils.collection.type.SortedArrayList cannot be cast to java.lang.Comparable
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SortedArrayList<Object> sortedArrayList0 = null;
      try {
        sortedArrayList0 = new SortedArrayList<Object>((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      SortedArrayList<Object> sortedArrayList1 = new SortedArrayList<Object>(sortedArrayList0);
      // Undeclared exception!
      try { 
        sortedArrayList1.add((-62), (Object) "i89");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>((Comparator<? super String>) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      sortedArrayList0.getComparator();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      SortedArrayList<String> sortedArrayList1 = new SortedArrayList<String>(sortedArrayList0);
      sortedArrayList1.add("=");
      sortedArrayList0.add("");
      sortedArrayList1.addAll((Collection<? extends String>) sortedArrayList0);
      SortedArrayList<Integer> sortedArrayList2 = new SortedArrayList<Integer>();
      SortedArrayList<Object> sortedArrayList3 = new SortedArrayList<Object>(sortedArrayList2);
      boolean boolean0 = sortedArrayList3.addAll((Collection<?>) sortedArrayList1);
      assertTrue(boolean0);
      
      int int0 = sortedArrayList3.findInsertionPoint((Object) "", 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = new SortedArrayList<String>();
      // Undeclared exception!
      try { 
        sortedArrayList0.set(1, "=");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SortedArrayList<Integer> sortedArrayList0 = new SortedArrayList<Integer>();
      // Undeclared exception!
      try { 
        sortedArrayList0.addAll((-19), (Collection<? extends Integer>) sortedArrayList0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }
}