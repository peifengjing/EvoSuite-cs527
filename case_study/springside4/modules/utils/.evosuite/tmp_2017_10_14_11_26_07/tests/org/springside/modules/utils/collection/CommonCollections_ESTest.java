/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 20:44:34 GMT 2017
 */

package org.springside.modules.utils.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.collections4.list.SetUniqueList;
import org.apache.commons.collections4.list.TreeList;
import org.apache.commons.collections4.map.Flat3Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.collection.CommonCollections;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommonCollections_ESTest extends CommonCollections_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        CommonCollections.setUniqueList((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // List must not be null
         //
         verifyException("org.apache.commons.collections4.list.SetUniqueList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Flat3Map<Integer, Integer> flat3Map0 = CommonCollections.flat3Map();
      assertEquals(0, flat3Map0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CommonCollections commonCollections0 = new CommonCollections();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TreeList<Object> treeList0 = CommonCollections.treeList();
      SetUniqueList<Object> setUniqueList0 = CommonCollections.setUniqueList((List<Object>) treeList0);
      assertNotNull(setUniqueList0);
  }
}
