/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:20:16 GMT 2017
 */

package edu.illinois.starts.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.asm.TypePath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypePath_ESTest extends TypePath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("Z@/jJLP~I39JS");
      assertEquals(1, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("<9H&;g^q~3(");
      assertEquals(2, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("qk/");
      assertEquals(0, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      
      String string0 = typePath0.toString();
      assertEquals("", string0);
      assertEquals(0, typePath0.getLength());
      assertNotNull(string0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-25);
      TypePath typePath0 = new TypePath(byteArray0, (-2485));
      assertNotNull(typePath0);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-25), (byte)0}, byteArray0);
      
      typePath0.offset = 0;
      assertEquals(0, typePath0.getLength());
      
      int int0 = typePath0.getStepArgument(0);
      assertEquals((-25), int0);
      assertEquals(0, typePath0.getLength());
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-25), (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("edu.illinois.starts.asm.TypePath");
      assertEquals(4, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      
      int int0 = typePath0.getStep(1);
      assertEquals(1, int0);
      assertEquals(4, typePath0.getLength());
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-122);
      TypePath typePath0 = TypePath.fromString("?e");
      assertEquals(0, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      
      typePath0.b = byteArray0;
      assertEquals(0, typePath0.getLength());
      
      int int0 = typePath0.getStep(0);
      assertEquals((-122), int0);
      assertEquals(0, typePath0.getLength());
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TypePath typePath0 = new TypePath(byteArray0, (byte)96);
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      typePath0.offset = (int) (byte)0;
      assertEquals(0, typePath0.getLength());
      
      int int0 = typePath0.getLength();
      assertEquals(0, int0);
      assertEquals(0, typePath0.getLength());
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString(",'>:,Hi%");
      assertEquals(0, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-88);
      typePath0.b = byteArray0;
      assertEquals((-88), typePath0.getLength());
      
      int int0 = typePath0.getLength();
      assertEquals((-88), int0);
      assertEquals((-88), typePath0.getLength());
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("L,0|vqXTf6W ");
      assertEquals(2, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      
      typePath0.b = null;
      // Undeclared exception!
      try { 
        typePath0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      TypePath typePath0 = new TypePath(byteArray0, (-2485));
      assertNotNull(typePath0);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertArrayEquals(new byte[] {(byte) (-1), (byte)0, (byte)0, (byte)0}, byteArray0);
      
      typePath0.offset = 0;
      assertEquals((-1), typePath0.getLength());
      
      // Undeclared exception!
      try { 
        typePath0.toString();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byteArray0[0] = (byte)67;
      TypePath typePath0 = new TypePath(byteArray0, (byte)0);
      assertEquals(67, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      
      // Undeclared exception!
      try { 
        typePath0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 23
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TypePath typePath0 = new TypePath((byte[]) null, (-2175));
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      
      // Undeclared exception!
      try { 
        typePath0.getStepArgument((-2175));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("qk/");
      assertEquals(0, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      
      // Undeclared exception!
      try { 
        typePath0.getStepArgument((-2194));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4386
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TypePath typePath0 = new TypePath((byte[]) null, 0);
      assertNotNull(typePath0);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      
      // Undeclared exception!
      try { 
        typePath0.getStep((-1173));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TypePath typePath0 = new TypePath(byteArray0, (byte)96);
      assertNotNull(typePath0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      // Undeclared exception!
      try { 
        typePath0.getStep((-1959));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3821
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TypePath typePath0 = new TypePath((byte[]) null, 0);
      assertNotNull(typePath0);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      
      // Undeclared exception!
      try { 
        typePath0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("||IY");
      assertEquals(0, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      
      typePath0.offset = (-330);
      // Undeclared exception!
      try { 
        typePath0.getLength();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -330
         //
         verifyException("edu.illinois.starts.asm.TypePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("edu.illinois.starts.asm.TypePath");
      assertEquals(4, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      
      int int0 = typePath0.getStep(4);
      assertEquals(0, int0);
      assertEquals(4, typePath0.getLength());
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("O'(%`|~[Z");
      assertEquals(1, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      
      int int0 = typePath0.getStepArgument(3);
      assertEquals(0, int0);
      assertEquals(1, typePath0.getLength());
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("edu.illinois.starts.asm.TypePath");
      assertEquals(4, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      
      int int0 = typePath0.getLength();
      assertEquals(4, int0);
      assertEquals(4, typePath0.getLength());
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("`*DdY:]t(_ %.'7b");
      assertEquals(3, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      
      String string0 = typePath0.toString();
      assertEquals("*.7", string0);
      assertEquals(3, typePath0.getLength());
      assertNotNull(string0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(1, TypePath.INNER_TYPE);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("b7^b7zuqSrDzh>Tq38");
      assertEquals(3, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
      
      typePath0.offset = 5;
      assertEquals(3, typePath0.getLength());
      
      String string0 = typePath0.toString();
      assertEquals("_[[", string0);
      assertEquals(3, typePath0.getLength());
      assertNotNull(string0);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(1, TypePath.INNER_TYPE);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("U~7e60*Y");
      assertEquals(3, typePath0.getLength());
      assertNotNull(typePath0);
      assertEquals(2, TypePath.WILDCARD_BOUND);
      assertEquals(3, TypePath.TYPE_ARGUMENT);
      assertEquals(0, TypePath.ARRAY_ELEMENT);
      assertEquals(1, TypePath.INNER_TYPE);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("j[Mp;lm%Z2n~");
      assertNotNull(typePath0);
      
      int int0 = typePath0.getStepArgument((-1));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("");
      assertNull(typePath0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString((String) null);
      assertNull(typePath0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TypePath typePath0 = TypePath.fromString("L,0|vqXTf6W ");
      assertNotNull(typePath0);
      
      String string0 = typePath0.toString();
      assertEquals("06", string0);
  }
}
