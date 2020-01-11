/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:49:45 GMT 2019
 */

package org.apache.commons.math4.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math4.distribution.EnumeratedDistribution;
import org.apache.commons.math4.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnumeratedDistribution_ESTest extends EnumeratedDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnumeratedDistribution<Float> enumeratedDistribution0 = null;
      try {
        enumeratedDistribution0 = new EnumeratedDistribution<Float>((List<Pair<Float, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.distribution.EnumeratedDistribution", e);
      }
  }
}
