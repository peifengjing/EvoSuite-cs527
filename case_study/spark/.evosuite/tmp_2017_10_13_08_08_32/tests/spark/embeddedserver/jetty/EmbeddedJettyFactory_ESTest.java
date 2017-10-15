/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 13 17:39:40 GMT 2017
 */

package spark.embeddedserver.jetty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.embeddedserver.EmbeddedServer;
import spark.embeddedserver.jetty.EmbeddedJettyFactory;
import spark.embeddedserver.jetty.JettyServerFactory;
import spark.route.Routes;
import spark.staticfiles.StaticFilesConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedJettyFactory_ESTest extends EmbeddedJettyFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JettyServerFactory jettyServerFactory0 = mock(JettyServerFactory.class, new ViolatedAssumptionAnswer());
      EmbeddedJettyFactory embeddedJettyFactory0 = new EmbeddedJettyFactory(jettyServerFactory0);
      Routes routes0 = mock(Routes.class, new ViolatedAssumptionAnswer());
      EmbeddedServer embeddedServer0 = embeddedJettyFactory0.create(routes0, (StaticFilesConfiguration) null, false);
      assertNotNull(embeddedServer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmbeddedJettyFactory embeddedJettyFactory0 = new EmbeddedJettyFactory();
  }
}
