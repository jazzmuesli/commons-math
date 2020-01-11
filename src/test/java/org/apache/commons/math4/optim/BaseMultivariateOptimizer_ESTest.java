/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:41:53 GMT 2019
 */

package org.apache.commons.math4.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.optim.InitialGuess;
import org.apache.commons.math4.optim.OptimizationData;
import org.apache.commons.math4.optim.SimpleBounds;
import org.apache.commons.math4.optim.linear.SimplexSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BaseMultivariateOptimizer_ESTest extends BaseMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, (-1402), 0.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(10);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      double[] doubleArray0 = new double[10];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[5] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(0);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      double[] doubleArray0 = new double[3];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math4.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(4203.97981351508, (-1386));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      double[] doubleArray0 = new double[7];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[5] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      double[] doubleArray0 = new double[0];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(2605);
      optimizationDataArray0[3] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 2,605 != 0
         //
         verifyException("org.apache.commons.math4.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(2605);
      optimizationDataArray0[3] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      double[] doubleArray0 = new double[4];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      SimplexSolver simplexSolver0 = new SimplexSolver(3039.5);
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }
}
