/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:22:33 GMT 2019
 */

package org.apache.commons.math4.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math4.linear.NonSquareOperatorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NonSquareOperatorException_ESTest extends NonSquareOperatorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonSquareOperatorException nonSquareOperatorException0 = new NonSquareOperatorException(3104, 3104);
  }
}
