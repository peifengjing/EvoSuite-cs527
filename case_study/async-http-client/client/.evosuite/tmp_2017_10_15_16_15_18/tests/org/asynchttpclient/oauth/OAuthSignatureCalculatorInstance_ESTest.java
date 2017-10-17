/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:32:13 GMT 2017
 */

package org.asynchttpclient.oauth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.oauth.ConsumerKey;
import org.asynchttpclient.oauth.OAuthSignatureCalculatorInstance;
import org.asynchttpclient.oauth.RequestToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuthSignatureCalculatorInstance_ESTest extends OAuthSignatureCalculatorInstance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuthSignatureCalculatorInstance oAuthSignatureCalculatorInstance0 = new OAuthSignatureCalculatorInstance();
      ConsumerKey consumerKey0 = new ConsumerKey("AKxCFu[q\"}'VD", "AKxCFu[q\"}'VD");
      RequestToken requestToken0 = new RequestToken("AKxCFu[q\"}'VD", "AKxCFu[q\"}'VD");
      String string0 = oAuthSignatureCalculatorInstance0.constructAuthHeader(consumerKey0, requestToken0, "AKxCFu[q\"}'VD", 1922L, "OAuth oauth_consumer_key=\"AKxCFu%5Bq%22%7D%27VD\", oauth_token=\"AKxCFu%5Bq%22%7D%27VD\", oauth_signature_method=\"HMAC-SHA1\", oauth_signature=\"AKxCFu%5Bq%22%7D%27VD\", oauth_timestamp=\"1922\", oauth_nonce=\"AKxCFu[q\"}'VD\", oauth_version=\"1.0\"");
      assertEquals("OAuth oauth_consumer_key=\"AKxCFu%5Bq%22%7D%27VD\", oauth_token=\"AKxCFu%5Bq%22%7D%27VD\", oauth_signature_method=\"HMAC-SHA1\", oauth_signature=\"AKxCFu%5Bq%22%7D%27VD\", oauth_timestamp=\"1922\", oauth_nonce=\"OAuth oauth_consumer_key=\"AKxCFu%5Bq%22%7D%27VD\", oauth_token=\"AKxCFu%5Bq%22%7D%27VD\", oauth_signature_method=\"HMAC-SHA1\", oauth_signature=\"AKxCFu%5Bq%22%7D%27VD\", oauth_timestamp=\"1922\", oauth_nonce=\"AKxCFu[q\"}'VD\", oauth_version=\"1.0\"\", oauth_version=\"1.0\"", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuthSignatureCalculatorInstance oAuthSignatureCalculatorInstance0 = new OAuthSignatureCalculatorInstance();
      RequestToken requestToken0 = new RequestToken("P{*MT%/L9R/y4M,8", "P{*MT%/L9R/y4M,8");
      // Undeclared exception!
      try { 
        oAuthSignatureCalculatorInstance0.constructAuthHeader((ConsumerKey) null, requestToken0, "/'*`}N1@YnMU(m`5", (-1L), "P{*MT%/L9R/y4M,8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.oauth.OAuthSignatureCalculatorInstance", e);
      }
  }
}