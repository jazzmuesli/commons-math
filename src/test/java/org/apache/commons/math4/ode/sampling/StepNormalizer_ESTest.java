/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:40:52 GMT 2019
 */

package org.apache.commons.math4.ode.sampling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.ode.sampling.FixedStepHandler;
import org.apache.commons.math4.ode.sampling.StepInterpolator;
import org.apache.commons.math4.ode.sampling.StepNormalizer;
import org.apache.commons.math4.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math4.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StepNormalizer_ESTest extends StepNormalizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(6.8, 2468.0, (-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedDerivatives();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-506.51652693), 6.8).when(stepInterpolator0).getPreviousTime();
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-506.51652693), fixedStepHandler0, stepNormalizerMode0);
      stepNormalizer0.handleStep(stepInterpolator0, true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer(1105.104918, (FixedStepHandler) null, stepNormalizerBounds0);
      // Undeclared exception!
      try { 
        stepNormalizer0.init(1105.104918, (double[]) null, 560.9730471929);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.sampling.StepNormalizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 6.8;
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.LAST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(6.8, fixedStepHandler0, stepNormalizerMode0, stepNormalizerBounds0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 6.8;
      doubleArray0[1] = 6.8;
      doubleArray0[2] = 6.8;
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(stepInterpolator0).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedDerivatives();
      doReturn((Object) doubleArray0, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(6.8, 6.8).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        stepNormalizer0.handleStep(stepInterpolator0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-3838.0), fixedStepHandler0);
      double[] doubleArray0 = new double[3];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(stepInterpolator0).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedDerivatives();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0, 0.0).when(stepInterpolator0).getPreviousTime();
      stepNormalizer0.handleStep(stepInterpolator0, true);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator1).getCurrentTime();
      stepNormalizer0.handleStep(stepInterpolator1, false);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-1.0), fixedStepHandler0, stepNormalizerMode0);
      double[] doubleArray0 = new double[4];
      stepNormalizer0.init(636.313382326, doubleArray0, (-1036.3287321801188));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-1.0), fixedStepHandler0, stepNormalizerMode0);
      double[] doubleArray0 = new double[4];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double[]) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0, 0.0).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        stepNormalizer0.handleStep(stepInterpolator0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.sampling.StepNormalizer", e);
      }
  }
}
