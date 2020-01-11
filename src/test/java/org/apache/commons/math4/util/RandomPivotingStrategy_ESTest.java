/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:24:33 GMT 2019
 */

package org.apache.commons.math4.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.util.RandomPivotingStrategy;
import org.apache.commons.rng.simple.RandomSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class RandomPivotingStrategy_ESTest extends RandomPivotingStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.MT_64;
      RandomPivotingStrategy randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 0L);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        randomPivotingStrategy0.pivotIndex(doubleArray0, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be strictly positive: -1
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.WELL_19937_A;
      RandomPivotingStrategy randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 2147483647L);
      double[] doubleArray0 = new double[8];
      int int0 = randomPivotingStrategy0.pivotIndex(doubleArray0, 0, 2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.WELL_44497_B;
      RandomPivotingStrategy randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 3024L);
      // Undeclared exception!
      try { 
        randomPivotingStrategy0.pivotIndex((double[]) null, 0, 5323);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.WELL_19937_A;
      RandomPivotingStrategy randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 2147483647L);
      double[] doubleArray0 = new double[8];
      try { 
        randomPivotingStrategy0.pivotIndex(doubleArray0, (-1851), 302);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // start position (-1,851)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.ISAAC;
      RandomPivotingStrategy randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 569L);
      double[] doubleArray0 = new double[0];
      try { 
        randomPivotingStrategy0.pivotIndex(doubleArray0, 832, 832);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RandomPivotingStrategy randomPivotingStrategy0 = null;
      try {
        randomPivotingStrategy0 = new RandomPivotingStrategy((RandomSource) null, (-10L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.RandomSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES;
      RandomPivotingStrategy randomPivotingStrategy0 = null;
      try {
        randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 65535L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Internal error: Please file a bug report
         //
         verifyException("org.apache.commons.rng.simple.internal.ProviderBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES_SELECT;
      RandomPivotingStrategy randomPivotingStrategy0 = null;
      try {
        randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.ISAAC;
      RandomPivotingStrategy randomPivotingStrategy0 = new RandomPivotingStrategy(randomSource0, 0);
      double[] doubleArray0 = new double[8];
      int int0 = randomPivotingStrategy0.pivotIndex(doubleArray0, 0, 5);
      assertEquals(3, int0);
  }
}
