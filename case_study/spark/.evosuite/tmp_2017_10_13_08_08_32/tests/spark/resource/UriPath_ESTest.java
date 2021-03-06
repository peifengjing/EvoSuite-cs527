/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 15:23:38 GMT 2017
 */

package spark.resource;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.resource.UriPath;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UriPath_ESTest extends UriPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = UriPath.canonical(".d/");
      assertEquals(".d/", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = UriPath.canonical("%a");
      assertEquals("%a", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = UriPath.canonical("EWx/O");
      assertEquals("EWx/O", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = UriPath.canonical("/BYz)TSPET5'F4O");
      assertEquals("/BYz)TSPET5'F4O", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = UriPath.canonical("..");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = UriPath.canonical("X1S//..");
      assertEquals("X1S/", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = UriPath.canonical("1S/..");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = UriPath.canonical("/.");
      assertNotNull(string0);
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = UriPath.canonical("EWx/O/./.");
      assertEquals("EWx/O", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = UriPath.canonical("./38");
      assertEquals("38", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = UriPath.canonical(".");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = UriPath.canonical(".d/.");
      assertEquals(".d/", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = UriPath.canonical("/..");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = UriPath.canonical("1S/|/..");
      assertEquals("1S/", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = UriPath.canonical("1//S/..");
      assertEquals("1//", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = UriPath.canonical("!;/..");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = UriPath.canonical(".(/MQ7szk., Fo");
      assertEquals(".(/MQ7szk., Fo", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = UriPath.canonical(" ");
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = UriPath.canonical(".//IG");
      assertEquals(".//IG", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = UriPath.canonical("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = UriPath.canonical((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UriPath uriPath0 = new UriPath();
  }
}
