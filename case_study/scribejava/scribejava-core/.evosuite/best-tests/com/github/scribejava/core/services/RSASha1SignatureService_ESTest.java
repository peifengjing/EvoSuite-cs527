/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 03:22:38 GMT 2017
 */

package com.github.scribejava.core.services;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.services.RSASha1SignatureService;
import java.security.PrivateKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RSASha1SignatureService_ESTest extends RSASha1SignatureService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RSASha1SignatureService rSASha1SignatureService0 = new RSASha1SignatureService((PrivateKey) null);
      // Undeclared exception!
      try { 
        rSASha1SignatureService0.getSignature("=vqAP", "Parameter supplied to Base-N decode is not a byte[] or a String", "Parameter supplied to Base-N decode is not a byte[] or a String");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error while signing string: =vqAP
         //
         verifyException("com.github.scribejava.core.services.RSASha1SignatureService", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RSASha1SignatureService rSASha1SignatureService0 = new RSASha1SignatureService((PrivateKey) null);
      String string0 = rSASha1SignatureService0.getSignatureMethod();
      assertEquals("RSA-SHA1", string0);
  }
}
