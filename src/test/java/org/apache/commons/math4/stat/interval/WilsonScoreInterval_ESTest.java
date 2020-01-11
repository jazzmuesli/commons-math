/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:29:24 GMT 2019
 */

package org.apache.commons.math4.stat.interval;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.stat.interval.ConfidenceInterval;
import org.apache.commons.math4.stat.interval.WilsonScoreInterval;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WilsonScoreInterval_ESTest extends WilsonScoreInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WilsonScoreInterval wilsonScoreInterval0 = new WilsonScoreInterval();
      ConfidenceInterval confidenceInterval0 = wilsonScoreInterval0.createInterval(6465, 0, 0.5);
      assertEquals(0.0, confidenceInterval0.getLowerBound(), 0.01);
      assertEquals(7.036417817355584E-5, confidenceInterval0.getUpperBound(), 0.01);
      assertEquals(0.5, confidenceInterval0.getConfidenceLevel(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WilsonScoreInterval wilsonScoreInterval0 = new WilsonScoreInterval();
      ConfidenceInterval confidenceInterval0 = wilsonScoreInterval0.createInterval(35, 0, 1.0512122733215323E-9);
      assertEquals(4.9594400077723714E-20, confidenceInterval0.getUpperBound(), 0.01);
      assertEquals((-3.009265538105056E-36), confidenceInterval0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WilsonScoreInterval wilsonScoreInterval0 = new WilsonScoreInterval();
      ConfidenceInterval confidenceInterval0 = wilsonScoreInterval0.createInterval(6465, 1, 0.07490822288864472);
      assertEquals(1.4080438657300648E-4, confidenceInterval0.getLowerBound(), 0.01);
      assertEquals(1.6992065083005624E-4, confidenceInterval0.getUpperBound(), 0.01);
      assertEquals(0.07490822288864472, confidenceInterval0.getConfidenceLevel(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WilsonScoreInterval wilsonScoreInterval0 = new WilsonScoreInterval();
      // Undeclared exception!
      try { 
        wilsonScoreInterval0.createInterval(904, 904, 1.9699272335463627E-8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // lower bound (1) must be strictly less than upper bound (1)
         //
         verifyException("org.apache.commons.math4.stat.interval.ConfidenceInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WilsonScoreInterval wilsonScoreInterval0 = new WilsonScoreInterval();
      // Undeclared exception!
      try { 
        wilsonScoreInterval0.createInterval(1, 6465, (-5005.23189));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // number of successes (6,465) must be less than or equal to population size (1)
         //
         verifyException("org.apache.commons.math4.stat.interval.IntervalUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WilsonScoreInterval wilsonScoreInterval0 = new WilsonScoreInterval();
      // Undeclared exception!
      try { 
        wilsonScoreInterval0.createInterval(0, (-3456), 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // number of trials (0)
         //
         verifyException("org.apache.commons.math4.stat.interval.IntervalUtils", e);
      }
  }
}
