/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:29:48 GMT 2017
 */

package edu.illinois.starts.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.illinois.starts.asm.AnnotationVisitor;
import edu.illinois.starts.asm.AnnotationWriter;
import edu.illinois.starts.asm.ByteVector;
import edu.illinois.starts.asm.ClassWriter;
import edu.illinois.starts.asm.FieldWriter;
import edu.illinois.starts.asm.TypePath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationVisitor_ESTest extends AnnotationVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2176));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 327680);
      annotationWriter0.visitEnum("AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ", "w", "");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-976));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      annotationWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1375);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "{XyiBWw@.ya/kvu", "");
      byte[] byteArray0 = new byte[6];
      TypePath typePath0 = TypePath.fromString("{XyiBWw@.ya/kvu");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitTypeAnnotation((-1866), typePath0, "{XyiBWw@.ya/kvu", false);
      annotationVisitor0.visit("GU", byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter((ClassWriter) null, false, byteVector0, byteVector0, 2458);
      AnnotationVisitor annotationVisitor0 = annotationWriter0.visitArray("");
      assertNotSame(annotationWriter0, annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      ByteVector byteVector0 = new ByteVector(5588);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-498));
      AnnotationVisitor annotationVisitor0 = annotationWriter0.visitAnnotation("ConstantValue", "BkgiDBa2M[HpA%LYR3h");
      assertNotSame(annotationWriter0, annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-994));
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      byteVector0.length = 327680;
      // Undeclared exception!
      try { 
        annotationWriter0.visitEnum("", "", (String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1000));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 327680);
      // Undeclared exception!
      try { 
        annotationWriter0.visitEnd();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 327680
         //
         verifyException("edu.illinois.starts.asm.AnnotationWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-990));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, (ByteVector) null, (ByteVector) null, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visitArray("B\"?$0k]/=B@7&]ec$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.AnnotationWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter((ClassWriter) null, false, byteVector0, byteVector0, 2458);
      // Undeclared exception!
      try { 
        annotationWriter0.visitAnnotation("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.AnnotationWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1000));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-1000));
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1000));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 327680);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("xZC:aB", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value edu.illinois.starts.asm.ClassWriter@1
         //
         verifyException("edu.illinois.starts.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter((ClassWriter) null, true, byteVector0, byteVector0, (-688));
      // Undeclared exception!
      try { 
        annotationWriter0.visitEnum("}@`qjGXe]87]BI\"P", "", "}@`qjGXe]87]BI\"P");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.illinois.starts.asm.AnnotationWriter", e);
      }
  }
}