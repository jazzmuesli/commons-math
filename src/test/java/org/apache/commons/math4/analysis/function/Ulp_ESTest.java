/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:40:52 GMT 2019
 */

package org.apache.commons.math4.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math4.analysis.function.Ulp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Ulp_ESTest extends Ulp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Ulp ulp0 = new Ulp();
      double double0 = ulp0.value(0.0);
      assertEquals(4.9E-324, double0, 0.01);
  }
}
