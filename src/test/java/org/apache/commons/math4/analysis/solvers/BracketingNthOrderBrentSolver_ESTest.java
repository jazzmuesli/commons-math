/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:25:00 GMT 2019
 */

package org.apache.commons.math4.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.UnivariateFunction;
import org.apache.commons.math4.analysis.solvers.AllowedSolution;
import org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 211;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(211, 211, 211, 211);
      int int1 = 1705;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(295574.0228662875, (double)211, (-563.8818348), 0.0625, 0.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.solve(1705, univariateFunction0, (double) 211, 295574.0228662875, (double) 1705, allowedSolution0);
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double0 = (-2331.585045);
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      bracketingNthOrderBrentSolver0.doSolve();
      try { 
        bracketingNthOrderBrentSolver0.verifySequence((-2331.585045), 1705.0, 0.0625);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [1,705, 0.062]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = 0.0625;
      int int0 = 211;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int1 = 1705;
      double double1 = 1.0;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(295576.9303468041, (double)211, (-563.8818348), (double)1705, 1.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.solve(1705, univariateFunction0, (double) 211, 295576.9303468041, (double) 1705, allowedSolution0);
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double2 = (-2331.585045);
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [211, 295,576.93], values: [1, 1]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 4;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-543.669872576), (-1424.7720106), (-3479.400643508564)).when(univariateFunction0).value(anyDouble());
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(4, univariateFunction0, (-3479.400643508564), (-566.47646), allowedSolution0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-3,479.401, -566.476], values: [-1,424.772, -3,479.401]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 2;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, (-64.08871), 2);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-416.5), (-1.0), 0.0).when(univariateFunction1).value(anyDouble());
      double double0 = 0.5;
      bracketingNthOrderBrentSolver0.solve(4, univariateFunction1, 0.5);
      double double1 = (-2613.126415);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-2613.126415), (-64.08871), allowedSolution0);
      int int1 = 112;
      UnivariateFunction univariateFunction2 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double2 = 0.0;
      AllowedSolution allowedSolution1 = AllowedSolution.LEFT_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(112, univariateFunction2, 0.0, 0.0, allowedSolution1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 2;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, (-64.08871), 2);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-543.669872576), 875.9, 0.0).when(univariateFunction1).value(anyDouble());
      double double0 = (-826.4);
      bracketingNthOrderBrentSolver0.solve(4, univariateFunction1, (-826.4));
      double double1 = (-2613.126415);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-2613.126415), (-64.08871), allowedSolution0);
      int int1 = 112;
      UnivariateFunction univariateFunction2 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double2 = 0.0;
      AllowedSolution allowedSolution1 = AllowedSolution.ANY_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(112, univariateFunction2, 0.0, 0.0, allowedSolution1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      bracketingNthOrderBrentSolver0.solve(869, univariateFunction0, (-1222.7988717830924), 1.0, (-243.06397), allowedSolution0);
      UnivariateFunction univariateFunction2 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction3 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction4 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction5 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 2;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, (-64.08871), 2);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      int int1 = 4;
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(173472.25, 0.0).when(univariateFunction1).value(anyDouble());
      double double0 = (-826.4);
      bracketingNthOrderBrentSolver0.solve(4, univariateFunction1, (-826.4));
      double double1 = (-2613.126415);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-2613.126415), (-64.08871), allowedSolution0);
      int int2 = 112;
      UnivariateFunction univariateFunction2 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double2 = 0.0;
      AllowedSolution allowedSolution1 = AllowedSolution.LEFT_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(112, univariateFunction2, 0.0, 0.0, allowedSolution1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = 0.0625;
      int int0 = 211;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(295576.9303468041, 295576.9303468041, 0.0625, 211);
      int int1 = 1705;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(295576.9303468041, 0.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(1705, univariateFunction0, (double) 211, 295576.9303468041, (double) 1705, allowedSolution0);
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double2 = (-2331.585045);
      try { 
        bracketingNthOrderBrentSolver0.verifySequence(double2, double1, double0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [211, 0.062]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 3391;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(551.486281, (-3246.34), (-3246.34), 3391);
      bracketingNthOrderBrentSolver0.isSequence((-3246.34), 3391, 295576.9303468041);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateFunction0).value(anyDouble());
      bracketingNthOrderBrentSolver0.solve(1262, univariateFunction0, (-974.468));
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      bracketingNthOrderBrentSolver0.doSolve();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve((-453), univariateFunction1, 641.9484707218477, 641.9484707218477, allowedSolution0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [641.948, 641.948]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 211;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(295576.9303468041, 295576.9303468041, 0.0625, 211);
      int int1 = 1705;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.solve(1705, univariateFunction0, (double) 211, 295576.9303468041, (double) 1705, allowedSolution0);
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double0 = (-2331.585045);
      try { 
        bracketingNthOrderBrentSolver0.verifySequence((-2331.585045), 1705.0, 0.0625);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [1,705, 0.062]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int0 = 4;
      double double0 = (-1136.53677043865);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)252, 0.0, 0.0).when(univariateFunction0).value(anyDouble());
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(252, univariateFunction0, (-1136.53677043865));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, \uFFFD], values: [252, 252]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = (-662.272);
      int int0 = 3;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-662.272), 1666.6541600316646, (-662.272), 3);
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      bracketingNthOrderBrentSolver0.setup(0, univariateFunction1, 3, 1666.6541600316646, 3);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      bracketingNthOrderBrentSolver0.solve(3, univariateFunction0, 0.0, 860.817661812302, allowedSolution0);
      UnivariateFunction univariateFunction2 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double1 = 1564.5;
      double double2 = 0.0;
      AllowedSolution allowedSolution1 = AllowedSolution.ABOVE_SIDE;
      UnivariateFunction univariateFunction3 = null;
      double double3 = 0.0625;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) null, (double) 3, 0.0625);
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
      int int0 = 4130;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 4130);
      UnivariateFunction univariateFunction0 = null;
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(4130, (UnivariateFunction) null, (double) 4130, (double) 4130, 0.0, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 1623;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, Double.NaN, 1623);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(0, univariateFunction0, (-840.9553898), (double) 1623, allowedSolution0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 1732;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(808.23652574406, 808.23652574406, 1732);
      int int1 = 0;
      UnivariateFunction univariateFunction0 = null;
      double double0 = 0.0;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) null, 0.0, 808.23652574406, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-247.61864096411156), 3);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(0, univariateFunction0, (double) 0, 0.0, allowedSolution0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(Double.NaN, (-743));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -743 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-283.61682458783), (-283.61682458783), 2218);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, 2765);
      bracketingNthOrderBrentSolver0.getEvaluations();
      bracketingNthOrderBrentSolver0.isSequence(0, (-355.05), 0.0625);
      bracketingNthOrderBrentSolver0.isSequence(0.0, 2765, 879.2131288134526);
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-30.2), 0.0, 227.3, 381);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(0, univariateFunction0, (double) 381, 0.0, 0.0, allowedSolution0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [381, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = (-1.0);
      double double1 = 2052.007;
      int int0 = (-3875);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.0), 2052.007, (-1.0), (-3875));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -3,875 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-122), (UnivariateFunction) null, (double) (-122), 1.0, (double) (-122), allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-761.0391958), (-761.0391958), (-761.0391958), 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = 0.0;
      int int0 = (-856);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, (-560.2376945501), (-856));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -856 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double double0 = (-2.356194490192345);
      double double1 = 1553.304439428761;
      int int0 = 88;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2.356194490192345), 1553.304439428761, 88);
      int int1 = (-1196);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      int int2 = 208;
      UnivariateFunction univariateFunction1 = null;
      bracketingNthOrderBrentSolver0.isSequence(3.00926215200625E10, 291902.6787642296, 208);
      try { 
        bracketingNthOrderBrentSolver0.setup(208, (UnivariateFunction) null, 0.3936265707015991, (-2.356194490192345), 1553.304439428761);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 211;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int1 = 1705;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(295576.9303468041, (double)211, (-563.8818348), 0.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.solve(1705, univariateFunction0, (double) 211, 295576.9303468041, (double) 1705, allowedSolution0);
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double0 = (-2331.585045);
      try { 
        bracketingNthOrderBrentSolver0.verifySequence((-2331.585045), 1705.0, 0.0625);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [1,705, 0.062]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 2;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, (-64.08871), 2);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction1).value(anyDouble());
      double double0 = (-826.4);
      bracketingNthOrderBrentSolver0.solve(4, univariateFunction1, (-826.4));
      double double1 = (-2613.126415);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-2613.126415), (-64.08871), allowedSolution0);
      int int1 = 112;
      UnivariateFunction univariateFunction2 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double2 = 0.0;
      AllowedSolution allowedSolution1 = AllowedSolution.LEFT_SIDE;
      try { 
        bracketingNthOrderBrentSolver0.solve(112, univariateFunction2, 0.0, 0.0, allowedSolution1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double double0 = 0.0;
      double double1 = (-64.08871);
      int int0 = 2;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, (-64.08871), 2);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-543.669872576), (double)2, 0.0, 0.0).when(univariateFunction1).value(anyDouble());
      double double2 = (-826.4);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(4, univariateFunction1, (-826.4));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state: maximal count (4) exceeded: evaluations
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 132;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, 0.0625, 132);
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction2 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction3 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction4 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3283.147, 2639);
      int int0 = 5;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3283.147, 3283.147, (-1858.2660272327)).when(univariateFunction0).value(anyDouble());
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (-5676.4022717238), 3283.147, 62.686099086);
      try { 
        bracketingNthOrderBrentSolver0.verifySequence(1203.123825, 1203.123825, 1.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endpoints do not specify an interval: [1,203.124, 1,203.124]
         //
         verifyException("org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3908.275477, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }
}
