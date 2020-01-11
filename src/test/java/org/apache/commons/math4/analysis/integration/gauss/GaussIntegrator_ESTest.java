/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:25:22 GMT 2019
 */

package org.apache.commons.math4.analysis.integration.gauss;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.UnivariateFunction;
import org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator;
import org.apache.commons.math4.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GaussIntegrator_ESTest extends GaussIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1345.1553233477557);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 5.0;
      doubleArray0[3] = Double.NaN;
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1345.1553233477557), 1331.495043, 1.0, 1331.495043).when(univariateFunction0).value(anyDouble());
      double double0 = gaussIntegrator0.integrate(univariateFunction0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-930.21803);
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-930.21803)).when(univariateFunction0).value(anyDouble());
      double double0 = gaussIntegrator0.integrate(univariateFunction0);
      assertEquals(865305.5833370809, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2669.0);
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(4016.6).when(univariateFunction0).value(anyDouble());
      double double0 = gaussIntegrator0.integrate(univariateFunction0);
      assertEquals((-1.07203054E7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      double double0 = gaussIntegrator0.getWeight(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2907.649580839;
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      double double0 = gaussIntegrator0.getWeight(0);
      assertEquals(2907.649580839, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-5514.88025042);
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      double double0 = gaussIntegrator0.getWeight(0);
      assertEquals((-5514.88025042), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      double double0 = gaussIntegrator0.getPoint(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2907.649580839;
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      double double0 = gaussIntegrator0.getPoint(0);
      assertEquals(2907.649580839, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-5514.88025042);
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      double double0 = gaussIntegrator0.getPoint(0);
      assertEquals((-5514.88025042), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        gaussIntegrator0.integrate((UnivariateFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GaussIntegrator gaussIntegrator0 = null;
      try {
        gaussIntegrator0 = new GaussIntegrator((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GaussIntegrator gaussIntegrator0 = null;
      try {
        gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Pair<double[], double[]> pair0 = (Pair<double[], double[]>) mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pair0).getFirst();
      doReturn(doubleArray0).when(pair0).getSecond();
      GaussIntegrator gaussIntegrator0 = null;
      try {
        gaussIntegrator0 = new GaussIntegrator(pair0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // points 0 and 1 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pair<double[], double[]> pair0 = (Pair<double[], double[]>) mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(pair0).getFirst();
      doReturn((Object) null).when(pair0).getSecond();
      GaussIntegrator gaussIntegrator0 = null;
      try {
        gaussIntegrator0 = new GaussIntegrator(pair0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Pair<double[], double[]> pair0 = (Pair<double[], double[]>) mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pair0).getFirst();
      doReturn(doubleArray0).when(pair0).getSecond();
      GaussIntegrator gaussIntegrator0 = null;
      try {
        gaussIntegrator0 = new GaussIntegrator(pair0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      GaussIntegrator gaussIntegrator0 = null;
      try {
        gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Pair<double[], double[]> pair0 = (Pair<double[], double[]>) mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pair0).getFirst();
      doReturn(doubleArray0).when(pair0).getSecond();
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(pair0);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1).when(univariateFunction0).value(anyDouble());
      double double0 = gaussIntegrator0.integrate(univariateFunction0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[8];
      Pair<double[], double[]> pair0 = (Pair<double[], double[]>) mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pair0).getFirst();
      doReturn(doubleArray1).when(pair0).getSecond();
      GaussIntegrator gaussIntegrator0 = null;
      try {
        gaussIntegrator0 = new GaussIntegrator(pair0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 8
         //
         verifyException("org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Pair<double[], double[]> pair0 = (Pair<double[], double[]>) mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pair0).getFirst();
      doReturn(doubleArray0).when(pair0).getSecond();
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(pair0);
      int int0 = gaussIntegrator0.getNumberOfPoints();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        gaussIntegrator0.getWeight(3173);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3173
         //
         verifyException("org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Pair<double[], double[]> pair0 = (Pair<double[], double[]>) mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(pair0).getFirst();
      doReturn(doubleArray0).when(pair0).getSecond();
      GaussIntegrator gaussIntegrator0 = new GaussIntegrator(pair0);
      // Undeclared exception!
      try { 
        gaussIntegrator0.getPoint(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator", e);
      }
  }
}
