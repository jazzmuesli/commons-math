/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:46:44 GMT 2019
 */

package org.apache.commons.math4.ml.neuralnet.sofm.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.ml.neuralnet.sofm.util.QuasiSigmoidDecayFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class QuasiSigmoidDecayFunction_ESTest extends QuasiSigmoidDecayFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuasiSigmoidDecayFunction quasiSigmoidDecayFunction0 = new QuasiSigmoidDecayFunction(1.0, (-1058.6774), 834L);
      double double0 = quasiSigmoidDecayFunction0.value(1111L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuasiSigmoidDecayFunction quasiSigmoidDecayFunction0 = null;
      try {
        quasiSigmoidDecayFunction0 = new QuasiSigmoidDecayFunction(913.0, (-1956.2713914), 1L);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.sofm.util.QuasiSigmoidDecayFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuasiSigmoidDecayFunction quasiSigmoidDecayFunction0 = null;
      try {
        quasiSigmoidDecayFunction0 = new QuasiSigmoidDecayFunction(4.0, 4.0, 4285L);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 4 is larger than, or equal to, the maximum (0)
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.sofm.util.QuasiSigmoidDecayFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuasiSigmoidDecayFunction quasiSigmoidDecayFunction0 = null;
      try {
        quasiSigmoidDecayFunction0 = new QuasiSigmoidDecayFunction((-953L), (-953L), (-953L));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -953 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.sofm.util.QuasiSigmoidDecayFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuasiSigmoidDecayFunction quasiSigmoidDecayFunction0 = new QuasiSigmoidDecayFunction(2500L, (-2423L), 2500L);
      double double0 = quasiSigmoidDecayFunction0.value(2500L);
      assertEquals(1250.0, double0, 0.01);
  }
}
