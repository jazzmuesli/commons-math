/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:20:30 GMT 2019
 */

package org.apache.commons.math4.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution;
import org.apache.commons.math4.distribution.MixtureMultivariateRealDistribution;
import org.apache.commons.math4.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MixtureMultivariateRealDistribution_ESTest extends MixtureMultivariateRealDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MixtureMultivariateRealDistribution<MixtureMultivariateNormalDistribution> mixtureMultivariateRealDistribution0 = null;
      try {
        mixtureMultivariateRealDistribution0 = new MixtureMultivariateRealDistribution<MixtureMultivariateNormalDistribution>((List<Pair<Double, MixtureMultivariateNormalDistribution>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.distribution.MixtureMultivariateRealDistribution", e);
      }
  }
}
