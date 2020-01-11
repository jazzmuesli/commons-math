/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:46:58 GMT 2019
 */

package org.apache.commons.math4.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.random.GaussianRandomGenerator;
import org.apache.commons.rng.UniformRandomProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GaussianRandomGenerator_ESTest extends GaussianRandomGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UniformRandomProvider uniformRandomProvider0 = mock(UniformRandomProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(uniformRandomProvider0).nextDouble();
      GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator(uniformRandomProvider0);
      // Undeclared exception!
      gaussianRandomGenerator0.nextNormalizedDouble();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator((UniformRandomProvider) null);
      // Undeclared exception!
      try { 
        gaussianRandomGenerator0.nextNormalizedDouble();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.sampling.distribution.MarsagliaNormalizedGaussianSampler", e);
      }
  }
}
