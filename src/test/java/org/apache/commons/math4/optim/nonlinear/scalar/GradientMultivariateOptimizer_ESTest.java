/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:22:50 GMT 2019
 */

package org.apache.commons.math4.optim.nonlinear.scalar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.optim.ConvergenceChecker;
import org.apache.commons.math4.optim.OptimizationData;
import org.apache.commons.math4.optim.PointValuePair;
import org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GradientMultivariateOptimizer_ESTest extends GradientMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, convergenceChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      // Undeclared exception!
      try { 
        nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", e);
      }
  }
}
