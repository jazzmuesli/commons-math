/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:37:57 GMT 2019
 */

package org.apache.commons.math4.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.linear.ConjugateGradient;
import org.apache.commons.math4.linear.RealLinearOperator;
import org.apache.commons.math4.linear.RealVector;
import org.apache.commons.math4.util.IterationManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConjugateGradient_ESTest extends ConjugateGradient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConjugateGradient conjugateGradient0 = new ConjugateGradient(1832, 1832, true);
      RealLinearOperator realLinearOperator0 = mock(RealLinearOperator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realLinearOperator0).getColumnDimension();
      try { 
        conjugateGradient0.solve(realLinearOperator0, (RealVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConjugateGradient conjugateGradient0 = new ConjugateGradient(2, 2, false);
      boolean boolean0 = conjugateGradient0.getCheck();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConjugateGradient conjugateGradient0 = new ConjugateGradient(2776, 3.0, true);
      try { 
        conjugateGradient0.solveInPlace((RealLinearOperator) null, (RealLinearOperator) null, (RealVector) null, (RealVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IterationManager iterationManager0 = mock(IterationManager.class, new ViolatedAssumptionAnswer());
      ConjugateGradient conjugateGradient0 = new ConjugateGradient(iterationManager0, (-2.0), false);
      assertFalse(conjugateGradient0.getCheck());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConjugateGradient conjugateGradient0 = null;
      try {
        conjugateGradient0 = new ConjugateGradient((IterationManager) null, 0.0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConjugateGradient conjugateGradient0 = new ConjugateGradient((-1276), (-1276), true);
      boolean boolean0 = conjugateGradient0.getCheck();
      assertTrue(boolean0);
  }
}
