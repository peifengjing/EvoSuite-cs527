/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:51:43 GMT 2017
 */

package edu.illinois.starts.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.asm.Attribute;
import edu.illinois.starts.asm.ClassReader;
import edu.illinois.starts.asm.ClassVisitor;
import edu.illinois.starts.asm.ClassWriter;
import edu.illinois.starts.asm.Edge;
import edu.illinois.starts.asm.Label;
import edu.illinois.starts.asm.Type;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Member;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      Attribute[] attributeArray0 = new Attribute[1];
      Attribute attribute0 = new Attribute("ConstantValue");
      char[] charArray0 = new char[9];
      charArray0[0] = 'N';
      charArray0[1] = 'E';
      charArray0[2] = 't';
      charArray0[3] = 'p';
      charArray0[4] = '!';
      charArray0[5] = '[';
      charArray0[6] = '9';
      charArray0[7] = 'P';
      charArray0[8] = 'A';
      Label[] labelArray0 = new Label[1];
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      labelArray0[0] = null;
      Attribute attribute1 = attribute0.read(classReader0, 24, 452, charArray0, 452, labelArray0);
      Attribute attribute2 = attribute1.next;
      attributeArray0[0] = null;
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, attributeArray0, 104);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte)33;
      byteArray0[3] = (byte)19;
      ClassReader classReader0 = new ClassReader(byteArray0);
      classReader0.getMaxStringLength();
      // Undeclared exception!
      try { 
        classReader0.readShort(1644);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1644
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getInterfaces();
      classReader0.readLong(4);
      classReader0.readByte(32767);
      classReader0.readUnsignedShort(1186);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getSuperName();
      classReader0.getClassName();
      classReader0.getItem(361);
      int int0 = Member.DECLARED;
      classReader0.getAccess();
      classReader0.readLong(361);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[4] = (byte) (-50);
      char[] charArray0 = new char[9];
      charArray0[0] = 'x';
      charArray0[1] = '~';
      charArray0[2] = '@';
      charArray0[3] = '`';
      charArray0[4] = 'i';
      charArray0[5] = 'u';
      charArray0[6] = '';
      charArray0[7] = ' ';
      charArray0[8] = 'K';
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.getSuperName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getMaxStringLength();
      classReader0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[0] = (byte)94;
      byteArray0[1] = (byte)54;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-122);
      byteArray0[4] = (byte)26;
      byteArray0[5] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      ClassWriter classWriter0 = new ClassWriter((byte)26);
      // Undeclared exception!
      try { 
        classReader0.copyPool(classWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.readInt(2315);
      classReader0.readShort(4);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      char[] charArray0 = new char[0];
      Attribute[] attributeArray0 = new Attribute[2];
      Attribute attribute0 = new Attribute("AnnotationDefault");
      Attribute attribute1 = attribute0.next;
      Label[] labelArray0 = new Label[4];
      // Undeclared exception!
      try { 
        classReader0.readLabel((-891), labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -891
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getClassName();
      classReader0.getItem(361);
      // Undeclared exception!
      try { 
        classReader0.readLabel(1158, (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      char[] charArray0 = new char[7];
      charArray0[0] = '+';
      charArray0[1] = 'a';
      charArray0[2] = '>';
      charArray0[3] = 'S';
      charArray0[4] = 'w';
      charArray0[5] = 'Z';
      charArray0[6] = 'A';
      classReader0.readClass(2020, charArray0);
      int int0 = Type.FLOAT;
      classReader0.readLong(6);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.readInt(2);
      // Undeclared exception!
      try { 
        classReader0.readInt((-1161953280));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1161953280
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      char[] charArray0 = new char[6];
      charArray0[0] = 'C';
      charArray0[1] = 'F';
      charArray0[2] = 'd';
      charArray0[3] = 'E';
      charArray0[4] = 'N';
      charArray0[5] = 'h';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(846, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 1145);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(bufferedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort(1223);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(145, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 48906
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("edu.illinois.starts.asm.ClassReader");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readClass(12, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 23810
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("edu.illinois.starts.asm.ClassReader");
      classReader0.readByte(1671);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.readInt(2);
      // Undeclared exception!
      try { 
        classReader0.readLong((-1161953280));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1161953280
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      // Undeclared exception!
      try { 
        classReader0.getItem(1224);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1224
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-93);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)21;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-93), 79);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-58), (-58));
      byteArrayInputStream0.read();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-98);
      byteArray0[4] = (byte)26;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)65;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-79);
      byteArray0[3] = (byte) (-112);
      byteArray0[4] = (byte)73;
      byteArray0[5] = (byte)18;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)21;
      byteArray0[8] = (byte) (-99);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte)0, (byte)73);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)94;
      byteArray0[1] = (byte) (-92);
      byteArray0[2] = (byte)61;
      byteArray0[3] = (byte)98;
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte)27;
      byteArray0[6] = (byte)101;
      byteArray0[7] = (byte) (-21);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)33;
      byteArray0[1] = (byte)114;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)0;
      byteArray0[6] = (byte)64;
      byteArray0[7] = (byte)33;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte)0, (byte)8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      classReader0.readInt(2315);
      classReader0.readShort(2315);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)115;
      byteArray0[0] = (byte)115;
      byteArray0[1] = (byte)5;
      sequenceInputStream0.read(byteArray0, (int) (byte)115, (int) (byte)5);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(sequenceInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getInterfaces();
      classReader0.readLong(4);
      classReader0.readByte(32767);
      char[] charArray0 = new char[6];
      charArray0[0] = '5';
      charArray0[1] = 'I';
      charArray0[2] = '#';
      charArray0[3] = 'T';
      charArray0[4] = '}';
      charArray0[5] = 'W';
      // Undeclared exception!
      try { 
        classReader0.readConst(1832, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1832
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getInterfaces();
      classReader0.readLong(4);
      char[] charArray0 = new char[9];
      charArray0[0] = 'K';
      charArray0[1] = 'f';
      charArray0[2] = 'f';
      charArray0[3] = 'g';
      charArray0[4] = 'm';
      charArray0[5] = '\"';
      charArray0[6] = ']';
      charArray0[7] = 'e';
      charArray0[8] = 'J';
      // Undeclared exception!
      try { 
        classReader0.readConst(1197, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4392
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      int int0 = 1225;
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, 1225);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("EnclosingMethod");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte)33;
      byteArray0[3] = (byte)48;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      assertEquals(19569, classReader0.header);
      
      classReader0.getSuperName();
      classReader0.getClassName();
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      
      int int0 = classReader0.getItem(361);
      assertEquals(1914, int0);
      
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      classReader0.getItemCount();
      classReader0.getAccess();
      assertEquals(163, classReader0.getMaxStringLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-8);
      byteArray0[1] = (byte)90;
      byteArray0[2] = (byte) (-114);
      byteArray0[3] = (byte) (-102);
      byteArray0[4] = (byte)8;
      byteArray0[5] = (byte)67;
      byteArray0[6] = (byte)26;
      byteArray0[7] = (byte) (-76);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 5, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("edu.illinois.starts.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FileSystemHandling.shouldAllThrowIOExceptions();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}
