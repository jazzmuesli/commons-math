/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:35:30 GMT 2019
 */

package org.apache.commons.math4.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math4.analysis.function.Tanh;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Tanh_ESTest extends Tanh_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      DerivativeStructure derivativeStructure0 = mock(DerivativeStructure.class, new ViolatedAssumptionAnswer());
      doReturn((DerivativeStructure) null).when(derivativeStructure0).tanh();
      DerivativeStructure derivativeStructure1 = tanh0.value(derivativeStructure0);
      assertNull(derivativeStructure1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      double double0 = tanh0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      double double0 = tanh0.value(1995.1517);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      // Undeclared exception!
      try { 
        tanh0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.function.Tanh", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      double double0 = tanh0.value((-1.5528388936015862));
      assertEquals((-0.9142526832088232), double0, 0.01);
  }
}
