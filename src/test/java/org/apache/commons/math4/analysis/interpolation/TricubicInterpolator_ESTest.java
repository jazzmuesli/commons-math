/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:32:32 GMT 2019
 */

package org.apache.commons.math4.analysis.interpolation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.interpolation.TricubicInterpolatingFunction;
import org.apache.commons.math4.analysis.interpolation.TricubicInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TricubicInterpolator_ESTest extends TricubicInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[1];
      double[][][] doubleArray1 = new double[1][8][3];
      double[] doubleArray2 = new double[1];
      TricubicInterpolatingFunction tricubicInterpolatingFunction0 = tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray2, doubleArray1);
      assertNotNull(tricubicInterpolatingFunction0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[1];
      double[][][] doubleArray1 = new double[1][8][3];
      double[][] doubleArray2 = new double[6][8];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray2[4], doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // points 0 and 1 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[1];
      double[][][] doubleArray1 = new double[1][0][4];
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (-2559.665408389);
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray2, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolatingFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[2];
      double[][][] doubleArray2 = new double[4][9][0];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray1, doubleArray2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 7 != 4
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[7];
      double[][][] doubleArray2 = new double[1][2][2];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray1, doubleArray0, doubleArray2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 7 != 1
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[2];
      double[][][] doubleArray1 = new double[5][8][3];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 2 != 5
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray0, (double[][][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[4];
      double[][][] doubleArray1 = new double[0][8][7];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[0];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray1, (double[][][]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      double[][][] doubleArray2 = new double[1][0][5];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray1, doubleArray0, doubleArray2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TricubicInterpolator tricubicInterpolator0 = new TricubicInterpolator();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      double[][][] doubleArray2 = new double[5][4][9];
      try { 
        tricubicInterpolator0.interpolate(doubleArray0, doubleArray0, doubleArray1, doubleArray2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math4.analysis.interpolation.TricubicInterpolator", e);
      }
  }
}
