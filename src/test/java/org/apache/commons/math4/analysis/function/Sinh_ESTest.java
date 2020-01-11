/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:59:07 GMT 2019
 */

package org.apache.commons.math4.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math4.analysis.function.Sinh;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sinh_ESTest extends Sinh_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sinh sinh0 = new Sinh();
      DerivativeStructure derivativeStructure0 = mock(DerivativeStructure.class, new ViolatedAssumptionAnswer());
      doReturn((DerivativeStructure) null).when(derivativeStructure0).sinh();
      DerivativeStructure derivativeStructure1 = sinh0.value(derivativeStructure0);
      assertNull(derivativeStructure1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sinh sinh0 = new Sinh();
      double double0 = sinh0.value(612.6);
      assertEquals(5.594607436424011E265, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sinh sinh0 = new Sinh();
      double double0 = sinh0.value((-2303.656));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Sinh sinh0 = new Sinh();
      double double0 = sinh0.value(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        sinh0.value((DerivativeStructure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.analysis.function.Sinh", e);
      }
  }
}
