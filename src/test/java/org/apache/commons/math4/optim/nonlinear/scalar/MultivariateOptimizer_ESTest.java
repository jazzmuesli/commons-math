/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:28:31 GMT 2019
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
import org.apache.commons.math4.optim.nonlinear.scalar.gradient.Preconditioner;
import org.apache.commons.math4.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer;
import org.apache.commons.math4.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math4.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.apache.commons.rng.UniformRandomProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MultivariateOptimizer_ESTest extends MultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(2670.3356060747956, 0.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.optim.nonlinear.scalar.noderiv.SimplexOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(2670.3356060747956, 0.0);
      simplexOptimizer0.getGoalType();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      ConvergenceChecker<PointValuePair> convergenceChecker0 = (ConvergenceChecker<PointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      Preconditioner preconditioner0 = mock(Preconditioner.class, new ViolatedAssumptionAnswer());
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, convergenceChecker0, 29, (-1260), (-2096.816576138), preconditioner0);
      ConvergenceChecker<PointValuePair> convergenceChecker1 = nonLinearConjugateGradientOptimizer0.getConvergenceChecker();
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-983), (-983), false, 29, (-1260), (UniformRandomProvider) null, false, convergenceChecker1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        cMAESOptimizer0.computeObjectiveValue(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math4.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }
}
