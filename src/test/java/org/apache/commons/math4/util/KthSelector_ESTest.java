/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:35:13 GMT 2019
 */

package org.apache.commons.math4.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.util.KthSelector;
import org.apache.commons.math4.util.PivotingStrategyInterface;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KthSelector_ESTest extends KthSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PivotingStrategyInterface pivotingStrategyInterface0 = mock(PivotingStrategyInterface.class, new ViolatedAssumptionAnswer());
      doReturn(11).when(pivotingStrategyInterface0).pivotIndex(any(double[].class) , anyInt() , anyInt());
      KthSelector kthSelector0 = new KthSelector(pivotingStrategyInterface0);
      double[] doubleArray0 = new double[22];
      doubleArray0[0] = (double) 11;
      doubleArray0[1] = (-964.1011792910284);
      int[] intArray0 = new int[2];
      intArray0[0] = (-2971);
      kthSelector0.select(doubleArray0, intArray0, 11);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PivotingStrategyInterface pivotingStrategyInterface0 = mock(PivotingStrategyInterface.class, new ViolatedAssumptionAnswer());
      doReturn(11, 0).when(pivotingStrategyInterface0).pivotIndex(any(double[].class) , anyInt() , anyInt());
      KthSelector kthSelector0 = new KthSelector(pivotingStrategyInterface0);
      double[] doubleArray0 = new double[22];
      doubleArray0[0] = (double) 11;
      int[] intArray0 = new int[2];
      kthSelector0.select(doubleArray0, intArray0, 11);
      // Undeclared exception!
      try { 
        kthSelector0.select(doubleArray0, intArray0, 191);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 191
         //
         verifyException("org.apache.commons.math4.util.KthSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KthSelector kthSelector0 = new KthSelector();
      double[] doubleArray0 = new double[15];
      // Undeclared exception!
      try { 
        kthSelector0.select(doubleArray0, (int[]) null, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math4.util.KthSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PivotingStrategyInterface pivotingStrategyInterface0 = mock(PivotingStrategyInterface.class, new ViolatedAssumptionAnswer());
      KthSelector kthSelector0 = new KthSelector(pivotingStrategyInterface0);
      double[] doubleArray0 = new double[22];
      doubleArray0[0] = (double) 11;
      int[] intArray0 = new int[2];
      kthSelector0.select(doubleArray0, intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KthSelector kthSelector0 = new KthSelector();
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-206.50628437);
      int[] intArray0 = new int[4];
      kthSelector0.select(doubleArray0, intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KthSelector kthSelector0 = new KthSelector();
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        kthSelector0.select((double[]) null, intArray0, 2030);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.KthSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PivotingStrategyInterface pivotingStrategyInterface0 = mock(PivotingStrategyInterface.class, new ViolatedAssumptionAnswer());
      KthSelector kthSelector0 = new KthSelector(pivotingStrategyInterface0);
      double[] doubleArray0 = new double[22];
      int[] intArray0 = new int[4];
      intArray0[0] = 989;
      // Undeclared exception!
      try { 
        kthSelector0.select(doubleArray0, intArray0, 3206);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(990) > toIndex(22)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KthSelector kthSelector0 = null;
      try {
        kthSelector0 = new KthSelector((PivotingStrategyInterface) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PivotingStrategyInterface pivotingStrategyInterface0 = mock(PivotingStrategyInterface.class, new ViolatedAssumptionAnswer());
      doReturn(11, 0, 0).when(pivotingStrategyInterface0).pivotIndex(any(double[].class) , anyInt() , anyInt());
      KthSelector kthSelector0 = new KthSelector(pivotingStrategyInterface0);
      double[] doubleArray0 = new double[22];
      doubleArray0[1] = (-964.1011792910284);
      int[] intArray0 = new int[2];
      intArray0[0] = (-2971);
      kthSelector0.select(doubleArray0, intArray0, 11);
      int[] intArray1 = new int[4];
      // Undeclared exception!
      try { 
        kthSelector0.select(doubleArray0, intArray1, 191);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 191
         //
         verifyException("org.apache.commons.math4.util.KthSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PivotingStrategyInterface pivotingStrategyInterface0 = mock(PivotingStrategyInterface.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(pivotingStrategyInterface0).pivotIndex(any(double[].class) , anyInt() , anyInt());
      KthSelector kthSelector0 = new KthSelector(pivotingStrategyInterface0);
      double[] doubleArray0 = new double[22];
      // Undeclared exception!
      try { 
        kthSelector0.select(doubleArray0, (int[]) null, 314);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 314
         //
         verifyException("org.apache.commons.math4.util.KthSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KthSelector kthSelector0 = new KthSelector();
      double[] doubleArray0 = new double[22];
      int[] intArray0 = new int[12];
      intArray0[0] = 989;
      intArray0[1] = 314;
      intArray0[3] = (-1);
      // Undeclared exception!
      try { 
        kthSelector0.select(doubleArray0, intArray0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KthSelector kthSelector0 = new KthSelector();
      double[] doubleArray0 = new double[18];
      // Undeclared exception!
      try { 
        kthSelector0.select(doubleArray0, (int[]) null, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math4.util.KthSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PivotingStrategyInterface pivotingStrategyInterface0 = mock(PivotingStrategyInterface.class, new ViolatedAssumptionAnswer());
      doReturn("py}R aK ").when(pivotingStrategyInterface0).toString();
      KthSelector kthSelector0 = new KthSelector(pivotingStrategyInterface0);
      PivotingStrategyInterface pivotingStrategyInterface1 = kthSelector0.getPivotingStrategy();
      assertSame(pivotingStrategyInterface1, pivotingStrategyInterface0);
  }
}
