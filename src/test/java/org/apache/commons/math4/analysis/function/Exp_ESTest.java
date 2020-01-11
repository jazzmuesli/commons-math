/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:31:47 GMT 2019
 */

package org.apache.commons.math4.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math4.analysis.function.Exp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Exp_ESTest extends Exp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Exp exp0 = new Exp();
      DerivativeStructure derivativeStructure0 = mock(DerivativeStructure.class, new ViolatedAssumptionAnswer());
      doReturn((DerivativeStructure) null).when(derivativeStructure0).exp();
      DerivativeStructure derivativeStructure1 = exp0.value(derivativeStructure0);
      assertNull(derivativeStructure1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Exp exp0 = new Exp();
      double double0 = exp0.value((-1146.9420015713));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Exp exp0 = new Exp();
      // Undeclared exception!
      try { 
        exp0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.function.Exp", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Exp exp0 = new Exp();
      double double0 = exp0.value(2092.7342160764274);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }
}
