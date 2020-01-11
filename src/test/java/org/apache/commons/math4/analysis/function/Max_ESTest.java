/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:33:44 GMT 2019
 */

package org.apache.commons.math4.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math4.analysis.function.Max;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Max_ESTest extends Max_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Max max0 = new Max();
      double double0 = max0.value(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Max max0 = new Max();
      double double0 = max0.value((-592.9), (-1233.73824691611));
      assertEquals((-592.9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
      double double0 = max0.value(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}
