/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:56:46 GMT 2019
 */

package org.apache.commons.math4.optim.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math4.linear.ArrayRealVector;
import org.apache.commons.math4.optim.InitialGuess;
import org.apache.commons.math4.optim.OptimizationData;
import org.apache.commons.math4.optim.SimpleBounds;
import org.apache.commons.math4.optim.linear.LinearConstraint;
import org.apache.commons.math4.optim.linear.LinearConstraintSet;
import org.apache.commons.math4.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math4.optim.linear.NonNegativeConstraint;
import org.apache.commons.math4.optim.linear.SimplexSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LinearOptimizer_ESTest extends LinearOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      SimplexSolver simplexSolver0 = new SimplexSolver((-822.15747929428), 11);
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      assertEquals(3, optimizationDataArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      boolean boolean0 = simplexSolver0.isRestrictedToNonNegative();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinearObjectiveFunction linearObjectiveFunction0 = simplexSolver0.getFunction();
      assertNull(linearObjectiveFunction0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      optimizationDataArray0[0] = (OptimizationData) linearObjectiveFunction0;
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      LinearObjectiveFunction linearObjectiveFunction1 = simplexSolver0.getFunction();
      assertSame(linearObjectiveFunction1, linearObjectiveFunction0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearConstraintSet linearConstraintSet0 = new LinearConstraintSet(linkedList0);
      optimizationDataArray0[1] = (OptimizationData) linearConstraintSet0;
      simplexSolver0.parseOptimizationData(optimizationDataArray0);
      Collection<LinearConstraint> collection0 = simplexSolver0.getConstraints();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      double[] doubleArray0 = new double[9];
      SimplexSolver simplexSolver0 = new SimplexSolver((-822.15747929428), 11);
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      double[] doubleArray1 = new double[0];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray1);
      optimizationDataArray0[2] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexSolver0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 != 9
         //
         verifyException("org.apache.commons.math4.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-881.0), (-686), (-686));
      // Undeclared exception!
      try { 
        simplexSolver0.parseOptimizationData((OptimizationData[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.optim.BaseOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 107, 107);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[6];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(107);
      optimizationDataArray0[6] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 107 != 6
         //
         verifyException("org.apache.commons.math4.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 1);
      // Undeclared exception!
      try { 
        simplexSolver0.getConstraints();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1479.269055376984);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      NonNegativeConstraint nonNegativeConstraint0 = new NonNegativeConstraint(false);
      optimizationDataArray0[1] = (OptimizationData) nonNegativeConstraint0;
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
