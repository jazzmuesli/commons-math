/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:20:30 GMT 2019
 */

package org.apache.commons.math4.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.stat.inference.MannWhitneyUTest;
import org.apache.commons.math4.stat.ranking.NaNStrategy;
import org.apache.commons.math4.stat.ranking.TiesStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MannWhitneyUTest_ESTest extends MannWhitneyUTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
      TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[4];
      double double0 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray1);
      assertEquals(3.7311652082241704E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FAILED;
      TiesStrategy tiesStrategy0 = TiesStrategy.RANDOM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = Double.NaN;
      // Undeclared exception!
      try { 
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // NaN is not allowed
         //
         verifyException("org.apache.commons.math4.stat.ranking.NaturalRanking", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
      TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[7];
      double double0 = mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
      assertEquals(70.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MINIMAL;
      TiesStrategy tiesStrategy0 = TiesStrategy.AVERAGE;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[0];
      try { 
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math4.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
      double[] doubleArray0 = new double[0];
      try { 
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math4.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.RANDOM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[2];
      try { 
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
      double[] doubleArray0 = new double[7];
      try { 
        mannWhitneyUTest0.mannWhitneyUTest((double[]) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest((NaNStrategy) null, (TiesStrategy) null);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.stat.ranking.NaturalRanking", e);
      }
  }
}
