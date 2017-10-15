/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 16:50:52 GMT 2017
 */

package spark.route;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.route.HttpMethod;
import spark.route.RouteEntry;
import spark.route.Util;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<RouteEntry> linkedList0 = new LinkedList<RouteEntry>();
      RouteEntry routeEntry0 = new RouteEntry();
      HttpMethod httpMethod0 = HttpMethod.get;
      routeEntry0.httpMethod = httpMethod0;
      routeEntry0.acceptedType = "org.eclipse.jetty.webapp.ClasspathPattern$ByName";
      routeEntry0.path = "tV{/cmq";
      linkedList0.add(routeEntry0);
      LinkedList<RouteEntry> linkedList1 = new LinkedList<RouteEntry>(linkedList0);
      // Undeclared exception!
      try { 
        Util.equals((List<RouteEntry>) linkedList1, (List<RouteEntry>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.route.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<RouteEntry> linkedList0 = new LinkedList<RouteEntry>();
      LinkedList<RouteEntry> linkedList1 = new LinkedList<RouteEntry>();
      RouteEntry routeEntry0 = new RouteEntry();
      linkedList0.push(routeEntry0);
      boolean boolean0 = Util.equals((List<RouteEntry>) linkedList0, (List<RouteEntry>) linkedList1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RouteEntry routeEntry0 = new RouteEntry();
      LinkedList<RouteEntry> linkedList0 = new LinkedList<RouteEntry>();
      List<RouteEntry> list0 = linkedList0.subList(0, 0);
      linkedList0.push(routeEntry0);
      // Undeclared exception!
      try { 
        Util.equals(list0, (List<RouteEntry>) linkedList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<RouteEntry> linkedList0 = new LinkedList<RouteEntry>();
      RouteEntry routeEntry0 = new RouteEntry();
      HttpMethod httpMethod0 = HttpMethod.get;
      routeEntry0.target = (Object) linkedList0;
      routeEntry0.httpMethod = httpMethod0;
      routeEntry0.acceptedType = "org.eclipse.jetty.webapp.ClasspathPattern$ByName";
      routeEntry0.path = "tV{/cmq";
      linkedList0.add(routeEntry0);
      boolean boolean0 = Util.equals((List<RouteEntry>) linkedList0, (List<RouteEntry>) linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RouteEntry routeEntry0 = new RouteEntry();
      LinkedList<RouteEntry> linkedList0 = new LinkedList<RouteEntry>();
      RouteEntry routeEntry1 = new RouteEntry(routeEntry0);
      HttpMethod httpMethod0 = HttpMethod.afterafter;
      routeEntry1.acceptedType = "";
      routeEntry0.acceptedType = "";
      linkedList0.offerFirst(routeEntry1);
      routeEntry0.httpMethod = httpMethod0;
      LinkedList<RouteEntry> linkedList1 = new LinkedList<RouteEntry>();
      linkedList1.push(routeEntry0);
      boolean boolean0 = Util.equals((List<RouteEntry>) linkedList1, (List<RouteEntry>) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<RouteEntry> linkedList0 = new LinkedList<RouteEntry>();
      LinkedList<RouteEntry> linkedList1 = new LinkedList<RouteEntry>();
      RouteEntry routeEntry0 = new RouteEntry();
      routeEntry0.acceptedType = "I6UT_bMXX";
      RouteEntry routeEntry1 = new RouteEntry();
      linkedList0.push(routeEntry0);
      linkedList1.offer(routeEntry1);
      boolean boolean0 = Util.equals((List<RouteEntry>) linkedList0, (List<RouteEntry>) linkedList1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<RouteEntry> linkedList0 = new LinkedList<RouteEntry>();
      LinkedList<RouteEntry> linkedList1 = new LinkedList<RouteEntry>();
      RouteEntry routeEntry0 = new RouteEntry();
      linkedList0.push(routeEntry0);
      boolean boolean0 = Util.equals((List<RouteEntry>) linkedList1, (List<RouteEntry>) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Util util0 = new Util();
  }
}