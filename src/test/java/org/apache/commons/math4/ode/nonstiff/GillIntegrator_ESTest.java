/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:28:51 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math4.ode.nonstiff.GillIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GillIntegrator_ESTest extends GillIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }
}
