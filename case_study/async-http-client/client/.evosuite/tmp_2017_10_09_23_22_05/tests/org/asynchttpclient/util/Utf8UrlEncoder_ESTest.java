/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 07:08:21 GMT 2017
 */

package org.asynchttpclient.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.util.Utf8UrlEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utf8UrlEncoder_ESTest extends Utf8UrlEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Utf8UrlEncoder.encodeQueryElement("djc{]");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "djc{]");
      StringBuilder stringBuilder1 = new StringBuilder("djc%7B%5D");
      StringBuilder stringBuilder2 = stringBuilder1.append((CharSequence) stringBuilder0);
      StringBuilder stringBuilder3 = stringBuilder2.deleteCharAt(0);
      StringBuilder stringBuilder4 = stringBuilder3.appendCodePoint(0);
      // Undeclared exception!
      Utf8UrlEncoder.encodeAndAppendFormElement(stringBuilder4, stringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Utf8UrlEncoder.percentEncodeQueryElement("");
      Utf8UrlEncoder.encodeAndAppendPercentEncoded((StringBuilder) null, "");
      Utf8UrlEncoder.encodeAndAppendQuery((StringBuilder) null, "");
      // Undeclared exception!
      try { 
        Utf8UrlEncoder.encodeAndAppendFormElement((StringBuilder) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Utf8UrlEncoder.percentEncodeQueryElement("org.asynchttpclient.util.Utf8UrlEncoder");
      // Undeclared exception!
      try { 
        Utf8UrlEncoder.encodeAndAppendQueryElement((StringBuilder) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utf8UrlEncoder.encodeQueryElement("+v]LI[ouowNKNwLyi");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "%2Bv%5DLI%5BouowNKNwLyi");
      // Undeclared exception!
      Utf8UrlEncoder.encodeAndAppendFormElement(stringBuilder0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("A");
      // Undeclared exception!
      Utf8UrlEncoder.encodeAndAppendPercentEncoded(stringBuilder0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8UrlEncoder.encodePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.Utf8UrlEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      // Undeclared exception!
      try { 
        Utf8UrlEncoder.encodeAndAppendQuery(stringBuilder0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8UrlEncoder.encodeQueryElement((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.Utf8UrlEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utf8UrlEncoder.encodePath("");
      Utf8UrlEncoder.encodeAndAppendFormElement((StringBuilder) null, "");
      // Undeclared exception!
      try { 
        Utf8UrlEncoder.encodeAndAppendFormElement((StringBuilder) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8UrlEncoder.encodeAndAppendPercentEncoded((StringBuilder) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Utf8UrlEncoder.encodeQueryElement("0123456789ABCDEF");
      Utf8UrlEncoder.encodePath("");
      Utf8UrlEncoder.encodeQueryElement("LNwYW*;wq, 3k");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utf8UrlEncoder.encodeQueryElement("4W@Kvp:");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = null;
      StringBuilder stringBuilder0 = null;
      try {
        stringBuilder0 = new StringBuilder((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = Utf8UrlEncoder.encodeAndAppendQueryElement(stringBuilder0, stringBuilder0);
      // Undeclared exception!
      try { 
        stringBuilder1.insert(2, "org.asynchttpclient.util.Utf8UrlEncoder");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Utf8UrlEncoder.encodePath("Kc-RN?Tmz0L");
      Utf8UrlEncoder.encodeQueryElement("");
      StringBuilder stringBuilder0 = new StringBuilder("1' }?}RgT>");
      StringBuilder stringBuilder1 = Utf8UrlEncoder.encodeAndAppendQuery(stringBuilder0, "QS;X%$");
      StringBuilder stringBuilder2 = stringBuilder1.append(2822.8);
      StringBuilder stringBuilder3 = stringBuilder2.insert(0, (double) 0);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      Utf8UrlEncoder.encodePath(")WXgv\"/\"61S3{u{");
      StringBuilder stringBuilder4 = Utf8UrlEncoder.encodeAndAppendQueryElement(stringBuilder3, stringBuffer0);
      Utf8UrlEncoder.encodeAndAppendQuery(stringBuilder1, "");
      // Undeclared exception!
      Utf8UrlEncoder.encodeAndAppendQueryElement(stringBuilder4, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = Utf8UrlEncoder.encodeAndAppendFormElement(stringBuilder0, stringBuilder0);
      stringBuilder0.reverse();
      Utf8UrlEncoder.percentEncodeQueryElement((String) null);
      StringBuilder stringBuilder2 = Utf8UrlEncoder.encodeAndAppendPercentEncoded(stringBuilder1, stringBuilder0);
      String string0 = "";
      int int0 = 0;
      int int1 = (-401);
      // Undeclared exception!
      try { 
        stringBuilder1.append((CharSequence) stringBuilder2, 0, (-401));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // start 0, end -401, s.length() 0
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Utf8UrlEncoder.percentEncodeQueryElement("l4q9j\"<}#Zi;(");
      StringBuilder stringBuilder0 = new StringBuilder();
      char[] charArray0 = new char[8];
      charArray0[0] = '\'';
      charArray0[1] = 'f';
      charArray0[2] = 'C';
      charArray0[3] = 'F';
      charArray0[4] = 'z';
      charArray0[5] = 'J';
      charArray0[6] = 'c';
      charArray0[7] = 'C';
      // Undeclared exception!
      try { 
        stringBuilder0.insert(48, charArray0, 48, 127);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 48
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Utf8UrlEncoder.encodePath("OJ1w!~");
      StringBuilder stringBuilder0 = new StringBuilder(3047);
      StringBuffer stringBuffer0 = new StringBuffer();
      stringBuilder0.append(stringBuffer0);
      int int0 = 36;
      Object object0 = new Object();
      StringBuilder stringBuilder1 = stringBuilder0.append(object0);
      long long0 = (-1L);
      StringBuilder stringBuilder2 = stringBuilder1.append((-1L));
      // Undeclared exception!
      Utf8UrlEncoder.encodeAndAppendQueryElement(stringBuilder2, stringBuilder0);
  }
}
