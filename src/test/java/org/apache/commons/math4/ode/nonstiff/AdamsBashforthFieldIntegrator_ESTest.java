/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:52:37 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.Field;
import org.apache.commons.math4.ode.nonstiff.AdamsBashforthFieldIntegrator;
import org.apache.commons.math4.util.Decimal64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AdamsBashforthFieldIntegrator_ESTest extends AdamsBashforthFieldIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Decimal64 decimal64_0 = new Decimal64(805);
      Class<Decimal64> class0 = Decimal64.class;
      Decimal64 decimal64_1 = new Decimal64(805);
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(decimal64_0, decimal64_0, decimal64_0, (Object) null).when(field0).getOne();
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0, decimal64_0, decimal64_1, decimal64_0, (Object) null).when(field0).getZero();
      AdamsBashforthFieldIntegrator<Decimal64> adamsBashforthFieldIntegrator0 = null;
      try {
        adamsBashforthFieldIntegrator0 = new AdamsBashforthFieldIntegrator<Decimal64>(field0, 805, 0.0, (-29.3210075982153), 805, 805);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.EmbeddedRungeKuttaFieldIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Decimal64 decimal64_0 = new Decimal64(2);
      Class<Decimal64> class0 = Decimal64.class;
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(decimal64_0, decimal64_0, decimal64_0, (Object) null).when(field0).getOne();
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0, decimal64_0, decimal64_0, decimal64_0, (Object) null).when(field0).getZero();
      AdamsBashforthFieldIntegrator<Decimal64> adamsBashforthFieldIntegrator0 = null;
      try {
        adamsBashforthFieldIntegrator0 = new AdamsBashforthFieldIntegrator<Decimal64>(field0, 2, 0.0, (-29.3210075982153), 2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.EmbeddedRungeKuttaFieldIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(field0).getZero();
      AdamsBashforthFieldIntegrator<Decimal64> adamsBashforthFieldIntegrator0 = null;
      try {
        adamsBashforthFieldIntegrator0 = new AdamsBashforthFieldIntegrator<Decimal64>(field0, 2712, 0.0, 2712, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeFieldIntegrator", e);
      }
  }
}
