/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:13:54 GMT 2019
 */

package org.apache.commons.math4.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.filter.DefaultProcessModel;
import org.apache.commons.math4.linear.RealMatrix;
import org.apache.commons.math4.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultProcessModel_ESTest extends DefaultProcessModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel((RealMatrix) null, (RealMatrix) null, (RealMatrix) null, (RealVector) null, (RealMatrix) null);
      RealMatrix realMatrix0 = defaultProcessModel0.getStateTransitionMatrix();
      assertNull(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getStateTransitionMatrix();
      assertEquals(1, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel((RealMatrix) null, (RealMatrix) null, (RealMatrix) null, (RealVector) null, (RealMatrix) null);
      RealMatrix realMatrix0 = defaultProcessModel0.getProcessNoise();
      assertNull(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getProcessNoise();
      assertEquals(1, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[6];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, doubleArray1, doubleArray0);
      RealVector realVector0 = defaultProcessModel0.getInitialStateEstimate();
      assertFalse(realVector0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel((RealMatrix) null, (RealMatrix) null, (RealMatrix) null, (RealVector) null, (RealMatrix) null);
      RealMatrix realMatrix0 = defaultProcessModel0.getInitialErrorCovariance();
      assertNull(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[6];
      doubleArray0[0] = doubleArray1;
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, doubleArray1, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getInitialErrorCovariance();
      assertEquals(6, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[6];
      doubleArray0[0] = doubleArray1;
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, doubleArray1, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getControlMatrix();
      assertEquals(6, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      DefaultProcessModel defaultProcessModel0 = null;
      try {
        defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, doubleArray1, (double[][]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 7 != 4
         //
         verifyException("org.apache.commons.math4.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[4][8];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      DefaultProcessModel defaultProcessModel0 = null;
      try {
        defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, doubleArray0[0], doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math4.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[4][6];
      DefaultProcessModel defaultProcessModel0 = null;
      try {
        defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, (double[]) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultProcessModel defaultProcessModel0 = null;
      try {
        defaultProcessModel0 = new DefaultProcessModel((double[][]) null, (double[][]) null, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      DefaultProcessModel defaultProcessModel0 = null;
      try {
        defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 5 != 2
         //
         verifyException("org.apache.commons.math4.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[0][9];
      DefaultProcessModel defaultProcessModel0 = null;
      try {
        defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must have at least one row
         //
         verifyException("org.apache.commons.math4.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel((RealMatrix) null, (RealMatrix) null, (RealMatrix) null, (RealVector) null, (RealMatrix) null);
      RealMatrix realMatrix0 = defaultProcessModel0.getControlMatrix();
      assertNull(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getControlMatrix();
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getStateTransitionMatrix();
      assertEquals(7, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
      RealVector realVector0 = defaultProcessModel0.getInitialStateEstimate();
      assertNull(realVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[7];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, doubleArray1, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getInitialErrorCovariance();
      assertTrue(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = new double[4];
      DefaultProcessModel defaultProcessModel0 = null;
      try {
        defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0, doubleArray1, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      DefaultProcessModel defaultProcessModel0 = new DefaultProcessModel(doubleArray0, doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = defaultProcessModel0.getProcessNoise();
      assertEquals(1, realMatrix0.getRowDimension());
  }
}
