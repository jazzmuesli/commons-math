/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:05:17 GMT 2019
 */

package org.apache.commons.math4.stat.interval;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.stat.interval.ConfidenceInterval;
import org.apache.commons.math4.stat.interval.NormalApproximationInterval;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NormalApproximationInterval_ESTest extends NormalApproximationInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NormalApproximationInterval normalApproximationInterval0 = new NormalApproximationInterval();
      ConfidenceInterval confidenceInterval0 = normalApproximationInterval0.createInterval(4254, 114, 0.2333320416368196);
      assertEquals(0.027533035863657778, confidenceInterval0.getUpperBound(), 0.01);
      assertEquals(0.2333320416368196, confidenceInterval0.getConfidenceLevel(), 0.01);
      assertEquals(0.02606357908697692, confidenceInterval0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NormalApproximationInterval normalApproximationInterval0 = new NormalApproximationInterval();
      ConfidenceInterval confidenceInterval0 = normalApproximationInterval0.createInterval(485, 1, 0.6931470632553101);
      assertEquals((-4.287384661040691E-5), confidenceInterval0.getLowerBound(), 0.01);
      assertEquals(0.6931470632553101, confidenceInterval0.getConfidenceLevel(), 0.01);
      assertEquals(0.004166585186816592, confidenceInterval0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NormalApproximationInterval normalApproximationInterval0 = new NormalApproximationInterval();
      // Undeclared exception!
      try { 
        normalApproximationInterval0.createInterval(0, 0, (-3323.907537));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // number of trials (0)
         //
         verifyException("org.apache.commons.math4.stat.interval.IntervalUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NormalApproximationInterval normalApproximationInterval0 = new NormalApproximationInterval();
      // Undeclared exception!
      try { 
        normalApproximationInterval0.createInterval(1675, 1675, 1675);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // out of bounds confidence level 1,675, must be between 0 and 1
         //
         verifyException("org.apache.commons.math4.stat.interval.IntervalUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NormalApproximationInterval normalApproximationInterval0 = new NormalApproximationInterval();
      // Undeclared exception!
      try { 
        normalApproximationInterval0.createInterval(285, 0, 0.087);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // lower bound (0) must be strictly less than upper bound (0)
         //
         verifyException("org.apache.commons.math4.stat.interval.ConfidenceInterval", e);
      }
  }
}
