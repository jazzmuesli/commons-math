/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:18:30 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.Field;
import org.apache.commons.math4.dfp.Dfp;
import org.apache.commons.math4.ode.nonstiff.DormandPrince54FieldIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DormandPrince54FieldIntegrator_ESTest extends DormandPrince54FieldIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince54FieldIntegrator<Dfp> dormandPrince54FieldIntegrator0 = null;
      try {
        dormandPrince54FieldIntegrator0 = new DormandPrince54FieldIntegrator<Dfp>((Field<Dfp>) null, 608.0781239165, 608.0781239165, 608.0781239165, 608.0781239165);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeFieldIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Field<Dfp> field0 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(field0).getZero();
      double[] doubleArray0 = new double[8];
      DormandPrince54FieldIntegrator<Dfp> dormandPrince54FieldIntegrator0 = null;
      try {
        dormandPrince54FieldIntegrator0 = new DormandPrince54FieldIntegrator<Dfp>(field0, (-4966.5633809949), -0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeFieldIntegrator", e);
      }
  }
}
