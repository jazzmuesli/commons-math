/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:27:27 GMT 2019
 */

package org.apache.commons.math4.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution;
import org.apache.commons.math4.distribution.MultivariateNormalDistribution;
import org.apache.commons.math4.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MixtureMultivariateNormalDistribution_ESTest extends MixtureMultivariateNormalDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-0.4278044940973668);
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = doubleArray0;
      double[][][] doubleArray2 = new double[15][9][2];
      doubleArray2[0] = doubleArray1;
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = null;
      try {
        mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution(doubleArray0, doubleArray1, doubleArray2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -0.428 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -0.428 at index 0
         //
         verifyException("org.apache.commons.math4.distribution.MultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      double[][][] doubleArray2 = new double[7][5][7];
      doubleArray2[0] = doubleArray1;
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = null;
      try {
        mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution(doubleArray0, doubleArray1, doubleArray2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is singular
         //
         verifyException("org.apache.commons.math4.linear.EigenDecomposition$Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[3][7];
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = null;
      try {
        mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution(doubleArray0, doubleArray1, (double[][][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[6][9];
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = null;
      try {
        mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution(doubleArray0, doubleArray1, (double[][][]) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 5640.023604785;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = doubleArray0;
      double[][][] doubleArray2 = new double[5][9][2];
      doubleArray2[0] = doubleArray1;
      double[] doubleArray3 = new double[4];
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = null;
      try {
        mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution(doubleArray3, doubleArray1, doubleArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 5640.023604785;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = doubleArray0;
      double[][][] doubleArray2 = new double[5][9][2];
      doubleArray2[0] = doubleArray1;
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution(doubleArray0, doubleArray1, doubleArray2);
      List<Pair<Double, MultivariateNormalDistribution>> list0 = mixtureMultivariateNormalDistribution0.getComponents();
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution1 = new MixtureMultivariateNormalDistribution(list0);
      assertFalse(mixtureMultivariateNormalDistribution1.equals((Object)mixtureMultivariateNormalDistribution0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][4];
      double[][][] doubleArray2 = new double[4][3][8];
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = null;
      try {
        mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution(doubleArray0, doubleArray1, doubleArray2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 3 != 4
         //
         verifyException("org.apache.commons.math4.distribution.MultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution0 = null;
      try {
        mixtureMultivariateNormalDistribution0 = new MixtureMultivariateNormalDistribution((List<Pair<Double, MultivariateNormalDistribution>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.distribution.MixtureMultivariateRealDistribution", e);
      }
  }
}
