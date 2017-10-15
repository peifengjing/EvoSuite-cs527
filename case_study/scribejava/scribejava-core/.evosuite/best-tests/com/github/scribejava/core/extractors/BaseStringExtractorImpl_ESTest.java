/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:10:07 GMT 2017
 */

package com.github.scribejava.core.extractors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.extractors.BaseStringExtractorImpl;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Verb;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseStringExtractorImpl_ESTest extends BaseStringExtractorImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "Hj5_G]E!p`eKO");
      String string0 = baseStringExtractorImpl0.getUrl(oAuthRequest0);
      assertEquals("Hj5_G]E!p`eKO", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.PATCH;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "http://");
      oAuthRequest0.addBodyParameter("+%vU3", "Cannot extract base string from a null object");
      String string0 = baseStringExtractorImpl0.getSortedAndEncodedParams(oAuthRequest0);
      assertEquals("%252B%2525vU3%3DCannot%2520extract%2520base%2520string%2520from%2520a%2520null%2520object", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.getVerb((OAuthRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.BaseStringExtractorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.getUrl((OAuthRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.BaseStringExtractorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.getSortedAndEncodedParams(oAuthRequest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Malformed URL
         //
         verifyException("com.github.scribejava.core.model.OAuthRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.getSortedAndEncodedParams((OAuthRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.BaseStringExtractorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.extract((OAuthRequest) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot extract base string from a null object
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.checkPreconditions((OAuthRequest) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot extract base string from a null object
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "m?81/wwo.");
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.checkPreconditions(oAuthRequest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not find oauth parameters in request: @Request(GET m?81/wwo.). OAuth parameters must be specified with the addOAuthParameter() method
         //
         verifyException("com.github.scribejava.core.extractors.BaseStringExtractorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.HEAD;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      String string0 = baseStringExtractorImpl0.getUrl(oAuthRequest0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.PATCH;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "http://");
      String string0 = baseStringExtractorImpl0.getVerb(oAuthRequest0);
      assertEquals("PATCH", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "Hj5_G]E!p`eKO");
      // Undeclared exception!
      try { 
        baseStringExtractorImpl0.extract(oAuthRequest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not find oauth parameters in request: @Request(GET Hj5_G]E!p`eKO). OAuth parameters must be specified with the addOAuthParameter() method
         //
         verifyException("com.github.scribejava.core.extractors.BaseStringExtractorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BaseStringExtractorImpl baseStringExtractorImpl0 = new BaseStringExtractorImpl();
      Verb verb0 = Verb.PATCH;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "http://");
      String string0 = baseStringExtractorImpl0.getSortedAndEncodedParams(oAuthRequest0);
      assertEquals("", string0);
  }
}