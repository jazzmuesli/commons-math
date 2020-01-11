/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:29:20 GMT 2019
 */

package org.apache.commons.math4.analysis.interpolation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.interpolation.DividedDifferenceInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DividedDifferenceInterpolator_ESTest extends DividedDifferenceInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      double[] doubleArray1 = DividedDifferenceInterpolator.computeDividedDifference(doubleArray0, doubleArray0);
      DividedDifferenceInterpolator dividedDifferenceInterpolator0 = new DividedDifferenceInterpolator();
      dividedDifferenceInterpolator0.interpolate(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {(-1.0), 1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DividedDifferenceInterpolator dividedDifferenceInterpolator0 = new DividedDifferenceInterpolator();
      // Undeclared exception!
      try { 
        dividedDifferenceInterpolator0.interpolate((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      try { 
        DividedDifferenceInterpolator.computeDividedDifference(doubleArray0, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // points 0 and 1 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        DividedDifferenceInterpolator.computeDividedDifference((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DividedDifferenceInterpolator dividedDifferenceInterpolator0 = new DividedDifferenceInterpolator();
      double[] doubleArray0 = new double[2];
      try { 
        dividedDifferenceInterpolator0.interpolate(doubleArray0, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // points 0 and 1 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }
}
