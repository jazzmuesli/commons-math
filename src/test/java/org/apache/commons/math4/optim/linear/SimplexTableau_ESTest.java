/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:46:15 GMT 2019
 */

package org.apache.commons.math4.optim.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math4.linear.RealVector;
import org.apache.commons.math4.optim.linear.LinearConstraint;
import org.apache.commons.math4.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math4.optim.linear.SimplexTableau;
import org.apache.commons.math4.optim.nonlinear.scalar.GoalType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexTableau_ESTest extends SimplexTableau_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realVector0).getDimension();
      LinearObjectiveFunction linearObjectiveFunction0 = mock(LinearObjectiveFunction.class, new ViolatedAssumptionAnswer());
      doReturn(realVector0).when(linearObjectiveFunction0).getCoefficients();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, (Collection<LinearConstraint>) null, goalType0, false, 2390.38933, 19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.optim.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[23];
      doubleArray0[1] = (-704.1973039377892);
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(realVector0).toArray();
      double double0 = SimplexTableau.getInvertedCoefficientSum(realVector0);
      assertEquals(704.1973039377892, double0, 0.01);
      assertEquals(23, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      doubleArray0[1] = 0.8230067981540441;
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(realVector0).toArray();
      double double0 = SimplexTableau.getInvertedCoefficientSum(realVector0);
      assertEquals((-0.8230067981540441), double0, 0.01);
      assertEquals(16, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      doReturn((double[]) null).when(realVector0).toArray();
      // Undeclared exception!
      try { 
        SimplexTableau.getInvertedCoefficientSum(realVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.optim.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[23];
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(realVector0).toArray();
      double double0 = SimplexTableau.getInvertedCoefficientSum(realVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = mock(LinearObjectiveFunction.class, new ViolatedAssumptionAnswer());
      doReturn((RealVector) null).when(linearObjectiveFunction0).getCoefficients();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, (Collection<LinearConstraint>) null, goalType0, false, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.optim.linear.SimplexTableau", e);
      }
  }
}
