/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:59:43 GMT 2019
 */

package org.apache.commons.math4.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math4.analysis.function.Tan;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tan_ESTest extends Tan_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tan tan0 = new Tan();
      DerivativeStructure derivativeStructure0 = mock(DerivativeStructure.class, new ViolatedAssumptionAnswer());
      doReturn((DerivativeStructure) null).when(derivativeStructure0).tan();
      DerivativeStructure derivativeStructure1 = tan0.value(derivativeStructure0);
      assertNull(derivativeStructure1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tan tan0 = new Tan();
      double double0 = tan0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tan tan0 = new Tan();
      double double0 = tan0.value(2201.240142);
      assertEquals((-1.6147327042686093), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        tan0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.function.Tan", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tan tan0 = new Tan();
      double double0 = tan0.value(1241.7028323833833);
      assertEquals(0.9769400285808558, double0, 0.01);
  }
}
