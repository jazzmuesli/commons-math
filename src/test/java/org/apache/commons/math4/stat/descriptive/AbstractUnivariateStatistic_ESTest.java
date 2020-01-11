/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:15:49 GMT 2019
 */

package org.apache.commons.math4.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.stat.descriptive.DescriptiveStatisticsTest;
import org.apache.commons.math4.stat.descriptive.rank.Percentile;
import org.apache.commons.math4.stat.ranking.NaNStrategy;
import org.apache.commons.math4.util.KthSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractUnivariateStatistic_ESTest extends AbstractUnivariateStatistic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[1];
      descriptiveStatisticsTest_subPercentile0.setData(doubleArray0, 0, 1);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = descriptiveStatisticsTest_subPercentile0.getDataRef();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[1];
      descriptiveStatisticsTest_subPercentile0.setData(doubleArray0);
      double[] doubleArray1 = descriptiveStatisticsTest_subPercentile0.getDataRef();
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[0];
      descriptiveStatisticsTest_subPercentile0.setData(doubleArray0, 0, 0);
      double[] doubleArray1 = descriptiveStatisticsTest_subPercentile0.getDataRef();
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[0];
      descriptiveStatisticsTest_subPercentile0.setData(doubleArray0);
      double[] doubleArray1 = descriptiveStatisticsTest_subPercentile0.getData();
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double double0 = descriptiveStatisticsTest_subPercentile0.evaluate((double[]) null, 0, 0);
      assertEquals(50.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withNaNStrategy(naNStrategy0);
      double[] doubleArray0 = new double[7];
      double double0 = percentile0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[2];
      double double0 = descriptiveStatisticsTest_subPercentile0.evaluate(doubleArray0);
      assertEquals(50.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      Percentile.EstimationType percentile_EstimationType0 = Percentile.EstimationType.R_3;
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withEstimationType(percentile_EstimationType0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3552.7);
      doubleArray0[2] = (-2972.323);
      double double0 = percentile0.evaluate(doubleArray0);
      assertEquals((-2972.323), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      Percentile.EstimationType percentile_EstimationType0 = Percentile.EstimationType.LEGACY;
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withEstimationType(percentile_EstimationType0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-3.5772520976568485);
      doubleArray0[1] = (-3.5772520976568485);
      percentile0.setData(doubleArray0);
      double double0 = percentile0.evaluate();
      assertEquals((-3.5772520976568485), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile1 = (DescriptiveStatisticsTest.subPercentile)descriptiveStatisticsTest_subPercentile0.copy();
      assertEquals(50.0, descriptiveStatisticsTest_subPercentile1.getQuantile(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[2];
      try { 
        descriptiveStatisticsTest_subPercentile0.setData(doubleArray0, 1724, 1724);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math4.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      KthSelector kthSelector0 = descriptiveStatisticsTest_subPercentile0.getKthSelector();
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withKthSelector(kthSelector0);
      // Undeclared exception!
      try { 
        percentile0.evaluate((double[]) null, 100, 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withNaNStrategy(naNStrategy0);
      double[] doubleArray0 = new double[6];
      try { 
        percentile0.evaluate(doubleArray0, 1, (-1890));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // length (-1,890)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      NaNStrategy naNStrategy0 = NaNStrategy.FAILED;
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withNaNStrategy(naNStrategy0);
      double[] doubleArray0 = new double[1];
      try { 
        percentile0.evaluate(doubleArray0, 1483, 2481);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      KthSelector kthSelector0 = descriptiveStatisticsTest_subPercentile0.getKthSelector();
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withKthSelector(kthSelector0);
      // Undeclared exception!
      try { 
        percentile0.evaluate((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[2];
      try { 
        descriptiveStatisticsTest_subPercentile0.setData(doubleArray0, 0, 1457);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math4.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[1];
      try { 
        descriptiveStatisticsTest_subPercentile0.setData(doubleArray0, 42, (-3670));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // length (-3,670)
         //
         verifyException("org.apache.commons.math4.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[10];
      try { 
        descriptiveStatisticsTest_subPercentile0.setData(doubleArray0, (-1830), 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // start position (-1,830)
         //
         verifyException("org.apache.commons.math4.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      // Undeclared exception!
      try { 
        descriptiveStatisticsTest_subPercentile0.setData((double[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[7];
      descriptiveStatisticsTest_subPercentile0.setData(doubleArray0, 0, 0);
      assertEquals(7, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = descriptiveStatisticsTest_subPercentile0.getData();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double[] doubleArray0 = new double[4];
      descriptiveStatisticsTest_subPercentile0.setData(doubleArray0);
      double[] doubleArray1 = descriptiveStatisticsTest_subPercentile0.getData();
      assertEquals(4, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      descriptiveStatisticsTest_subPercentile0.setData((double[]) null);
      assertEquals(NaNStrategy.REMOVED, descriptiveStatisticsTest_subPercentile0.getNaNStrategy());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      Percentile.EstimationType percentile_EstimationType0 = Percentile.EstimationType.LEGACY;
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withEstimationType(percentile_EstimationType0);
      double[] doubleArray0 = new double[22];
      percentile0.setData(doubleArray0);
      double double0 = percentile0.evaluate();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      NaNStrategy naNStrategy0 = NaNStrategy.FAILED;
      Percentile percentile0 = descriptiveStatisticsTest_subPercentile0.withNaNStrategy(naNStrategy0);
      // Undeclared exception!
      try { 
        percentile0.evaluate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DescriptiveStatisticsTest.subPercentile descriptiveStatisticsTest_subPercentile0 = new DescriptiveStatisticsTest.subPercentile();
      double double0 = descriptiveStatisticsTest_subPercentile0.evaluate();
      assertEquals(50.0, double0, 0.01);
  }
}
