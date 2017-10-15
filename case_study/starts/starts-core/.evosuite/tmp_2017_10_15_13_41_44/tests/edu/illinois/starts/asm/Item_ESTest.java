/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:09:01 GMT 2017
 */

package edu.illinois.starts.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.asm.Item;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Item_ESTest extends Item_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item item0 = new Item(761);
      Item item1 = new Item(2871);
      item1.set("9)par5dA=d2L,", "9)par5dA=d2L,", 2050);
      boolean boolean0 = item1.isEqualTo(item0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item item0 = new Item((-1927));
      Item item1 = new Item((-1927), item0);
      item1.set((-1));
      boolean boolean0 = item1.isEqualTo(item0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item item0 = new Item((-1927));
      item0.set((-1927));
      Item item1 = new Item((-1927), item0);
      item0.longVal = 2134L;
      boolean boolean0 = item1.isEqualTo(item0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item item0 = new Item();
      item0.set(1049, 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item item0 = new Item((-1927));
      item0.set(1709, 1709);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item item0 = new Item();
      // Undeclared exception!
      try { 
        item0.set((String) null, "ZQ(cE5lE)vs", 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item item0 = new Item();
      // Undeclared exception!
      try { 
        item0.set(4, "", "|Cq,@dDN7ce.5H>", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item item0 = null;
      try {
        item0 = new Item(2039, (Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item item0 = new Item(18);
      Item item1 = new Item();
      item1.set(564, "<Zx2)~U!k:pl)RJV7", "<Zx2)~U!k:pl)RJV7", "D`]QT]R$p");
      item0.set(2704, "<Zx2)~U!k:pl)RJV7", "<Zx2)~U!k:pl)RJV7", "u^foC/=Sp");
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item item0 = new Item((-63));
      Item item1 = new Item((-63), item0);
      item1.set("", "`U-T`sE7<s91CxZ", (-1246));
      item0.set(0, "", "", "");
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item item0 = new Item(18);
      Item item1 = new Item();
      item1.strVal1 = "";
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item item0 = new Item();
      Item item1 = new Item((-2382), item0);
      item1.set("", "Lee2tG9u-E", (-1769));
      item0.set("", "N_;8", (-2382));
      item1.longVal = (long) (-2382);
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Item item0 = new Item(12);
      item0.set("", "f8r=3%B6wG$$C^)", 1094713344);
      Item item1 = new Item((-2132), item0);
      item1.strVal1 = "3S4";
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Item item0 = new Item((-2186));
      Item item1 = new Item();
      item0.set("TL>1v", "", (-2186));
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Item item0 = new Item();
      Item item1 = new Item();
      item0.set(12, "", "',flezaMBFNN", "GRhq~X)n*k");
      item1.set(12, "", "", "K7\"");
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Item item0 = new Item();
      item0.set(12, "GRhq~X)n*k", "K7\"", "r{|r5&5g#4@c6");
      Item item1 = new Item(1933);
      item1.set((-1316), "3S4", "GRhq~X)n*k", "',flezaMBFNN");
      boolean boolean0 = item0.isEqualTo(item1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Item item0 = new Item();
      Item item1 = new Item((-2382), item0);
      item1.set(7);
      boolean boolean0 = item1.isEqualTo(item0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Item item0 = new Item();
      Item item1 = new Item();
      item1.set(4817L);
      boolean boolean0 = item1.isEqualTo(item0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Item item0 = new Item();
      item0.set(32, "&02iISl@ec", "&02iISl@ec", "d,5Y");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Item item0 = new Item();
      item0.set(30, "", "oD!p78#9n", "");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Item item0 = new Item(7);
      item0.set(24, "|D}T99G\u0002tPM", "", "|D}T99G\u0002tPM");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Item item0 = new Item(23);
      item0.set(23, "", "", "A+-QFy.;d[n4aiZpkqG");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Item item0 = new Item();
      item0.next = item0;
      item0.next.set(22, "y.@`pk", "y.@`pk", "(wsm[%52hT~ o1");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Item item0 = new Item();
      item0.set(21, "G|hq~X)n*k", "", "r{|r5&5g#4@c6");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Item item0 = new Item((-2186));
      item0.set("TL>1v", "", (-2186));
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Item item0 = new Item(761);
      item0.set(16, "9)par5dA=d2L,", "f8r=3%B6wG$$C^)", "cLCp");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Item item0 = new Item(4974);
      item0.type = 14;
      // Undeclared exception!
      try { 
        item0.isEqualTo(item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Item item0 = new Item();
      item0.set(11, "G,hqf)nk", "", "r{|r5&5g#4@c6");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Item item0 = new Item();
      item0.set(10, "GRhq~X)n*k", "", "r{|r5&5g#4@c6");
      // Undeclared exception!
      try { 
        item0.isEqualTo(item0.next);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Item item0 = new Item((-1927));
      item0.type = 9;
      // Undeclared exception!
      try { 
        item0.isEqualTo(item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Item item0 = new Item(4974);
      item0.set(1.0F);
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Item item0 = new Item();
      item0.set(2, "GRhq~X)n*k", "", "r{|r5&5g#4@c6");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Item item0 = new Item();
      item0.set(12, "GRhq~X)n*k", "K7\"", "r{|r5&5g#4@c6");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Item item0 = new Item();
      item0.set(8, "K7\"", "", "kMPvJT4tVg0T[");
      // Undeclared exception!
      try { 
        item0.isEqualTo(item0.next);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Item item0 = new Item(7);
      item0.set(7, "|D}T99G\u0002tPM", "|D}T99G\u0002tPM", "|D}T99G\u0002tPM");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Item item0 = new Item((-63));
      item0.set(1, "", "`U-T`sE7<s91CxZ", "`U-T`sE7<s91CxZ");
      boolean boolean0 = item0.isEqualTo(item0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Item item0 = new Item((-862));
      Item item1 = new Item((-862), item0);
      item1.next = item0;
      item1.next.set(17, "", "T39nkH#I+", "T39nkH#I+");
      // Undeclared exception!
      try { 
        item0.isEqualTo(item1.next.next);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Item", e);
      }
  }
}
