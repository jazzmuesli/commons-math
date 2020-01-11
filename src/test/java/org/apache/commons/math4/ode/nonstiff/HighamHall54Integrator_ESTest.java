/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:27:32 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.ode.nonstiff.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HighamHall54Integrator_ESTest extends HighamHall54Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-835.2283015120083), 1012.653113243415, 1012.653113243415, 1012.653113243415);
      double[] doubleArray0 = new double[0];
      highamHall54Integrator0.estimateError((double[][]) null, doubleArray0, doubleArray0, (-4389.52542465343));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1490.37208261, (-2564.39), 0.2222222222222222, 1490.37208261);
      double[][] doubleArray0 = new double[14][8];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-1.2);
      highamHall54Integrator0.mainSetDimension = 1088;
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray0[0], (-2564.39));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1490.37208261, (-2564.39), 0.2222222222222222, 1490.37208261);
      double[][] doubleArray0 = new double[14][8];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-1.2);
      highamHall54Integrator0.mainSetDimension = 1088;
      highamHall54Integrator0.setStepSizeControl((-1.2), 0.182, doubleArray0[0], doubleArray1);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray0[1], (-2564.39));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-6800.740944125856);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3362.4771, 3362.4771, doubleArray0, doubleArray0);
      highamHall54Integrator0.mainSetDimension = (-857);
      double[][] doubleArray1 = new double[6][1];
      highamHall54Integrator0.mainSetDimension = 5;
      doubleArray1[2] = doubleArray0;
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3362.4771, 3362.4771, doubleArray0, doubleArray0);
      highamHall54Integrator0.mainSetDimension = (-857);
      double[][] doubleArray1 = new double[6][1];
      double double0 = highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 3362.4771);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[4];
      highamHall54Integrator0.mainSetDimension = 1635;
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError((double[][]) null, doubleArray0, doubleArray0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, 0.0);
      int int0 = highamHall54Integrator0.getOrder();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = null;
      try {
        highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }
}
