/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:34:26 GMT 2019
 */

package org.apache.commons.math4.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math4.fitting.PolynomialCurveFitter;
import org.apache.commons.math4.fitting.WeightedObservedPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolynomialCurveFitter_ESTest extends PolynomialCurveFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolynomialCurveFitter polynomialCurveFitter0 = PolynomialCurveFitter.create(0);
      // Undeclared exception!
      try { 
        polynomialCurveFitter0.withStartPoint((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.fitting.PolynomialCurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolynomialCurveFitter polynomialCurveFitter0 = PolynomialCurveFitter.create(2246);
      // Undeclared exception!
      try { 
        polynomialCurveFitter0.getProblem((Collection<WeightedObservedPoint>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.fitting.PolynomialCurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        PolynomialCurveFitter.create((-2678));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.fitting.PolynomialCurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolynomialCurveFitter polynomialCurveFitter0 = PolynomialCurveFitter.create(2246);
      PolynomialCurveFitter polynomialCurveFitter1 = polynomialCurveFitter0.withMaxIterations(2246);
      assertFalse(polynomialCurveFitter1.equals((Object)polynomialCurveFitter0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PolynomialCurveFitter polynomialCurveFitter0 = PolynomialCurveFitter.create(2246);
      double[] doubleArray0 = new double[5];
      PolynomialCurveFitter polynomialCurveFitter1 = polynomialCurveFitter0.withStartPoint(doubleArray0);
      assertFalse(polynomialCurveFitter1.equals((Object)polynomialCurveFitter0));
  }
}
