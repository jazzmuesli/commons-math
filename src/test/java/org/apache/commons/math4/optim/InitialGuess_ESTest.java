/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:38:42 GMT 2019
 */

package org.apache.commons.math4.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.optim.InitialGuess;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InitialGuess_ESTest extends InitialGuess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      double[] doubleArray1 = initialGuess0.getInitialGuess();
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InitialGuess initialGuess0 = null;
      try {
        initialGuess0 = new InitialGuess((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.optim.InitialGuess", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      double[] doubleArray1 = initialGuess0.getInitialGuess();
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }
}
