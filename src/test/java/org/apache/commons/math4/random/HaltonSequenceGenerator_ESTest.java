/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:01:15 GMT 2019
 */

package org.apache.commons.math4.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.random.HaltonSequenceGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HaltonSequenceGenerator_ESTest extends HaltonSequenceGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(6);
      haltonSequenceGenerator0.skipTo((-12));
      haltonSequenceGenerator0.getNextIndex();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 2;
      intArray0[2] = 2;
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(2, intArray0, intArray0);
      haltonSequenceGenerator0.nextVector();
      // Undeclared exception!
      try { 
        haltonSequenceGenerator0.nextVector();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 8;
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(8);
      haltonSequenceGenerator0.getNextIndex();
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.skipTo(52);
      haltonSequenceGenerator0.scramble(0, 0, (-1), 3084);
      haltonSequenceGenerator0.skipTo(3084);
      haltonSequenceGenerator0.nextVector();
      // Undeclared exception!
      try { 
        haltonSequenceGenerator0.scramble(0, 1078, 0, 2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 21;
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(21);
      haltonSequenceGenerator0.skipTo(21);
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.skipTo(21);
      haltonSequenceGenerator0.skipTo(21);
      haltonSequenceGenerator0.nextVector();
      int int1 = (-347);
      haltonSequenceGenerator0.skipTo((-347));
      haltonSequenceGenerator0.scramble(21, 21, 21, 0);
      haltonSequenceGenerator0.nextVector();
      int int2 = (-3049);
      haltonSequenceGenerator0.skipTo(0);
      haltonSequenceGenerator0.nextVector();
      // Undeclared exception!
      try { 
        haltonSequenceGenerator0.scramble(21, 0, 0, (-3049));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1272;
      intArray0[1] = 1;
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(1, intArray0, intArray0);
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.getNextIndex();
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.getNextIndex();
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.scramble(0, (-1041), 2, 900);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(2);
      haltonSequenceGenerator0.skipTo(2);
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.getNextIndex();
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.skipTo(5);
      haltonSequenceGenerator0.scramble(0, 5, 5788, 5);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(2);
      int int0 = (-2548);
      haltonSequenceGenerator0.skipTo((-2548));
      haltonSequenceGenerator0.skipTo(2825);
      haltonSequenceGenerator0.nextVector();
      haltonSequenceGenerator0.skipTo((-200));
      haltonSequenceGenerator0.skipTo(2);
      // Undeclared exception!
      try { 
        haltonSequenceGenerator0.scramble(2825, (-1397), (-1397), (-2548));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 2;
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = (-1);
      intArray0[2] = 2;
      intArray0[3] = 2;
      intArray0[4] = 2;
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(2, intArray0, intArray0);
      // Undeclared exception!
      try { 
        haltonSequenceGenerator0.skipTo(2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 3846;
      intArray0[1] = 3846;
      intArray0[2] = 3846;
      intArray0[3] = 3846;
      intArray0[4] = 3846;
      intArray0[5] = 3846;
      intArray0[6] = 3846;
      HaltonSequenceGenerator haltonSequenceGenerator0 = null;
      try {
        haltonSequenceGenerator0 = new HaltonSequenceGenerator(3846, (int[]) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      intArray0[1] = 2;
      intArray0[2] = 2;
      intArray0[3] = 2;
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(2, intArray0, intArray0);
      haltonSequenceGenerator0.skipTo(499);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(35);
      haltonSequenceGenerator0.scramble(35, 35, 35, (-451));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 2;
      int[] intArray0 = new int[0];
      HaltonSequenceGenerator haltonSequenceGenerator0 = null;
      try {
        haltonSequenceGenerator0 = new HaltonSequenceGenerator(2, intArray0, intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 2 out of [1, 40] range
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = (-2112);
      HaltonSequenceGenerator haltonSequenceGenerator0 = null;
      try {
        haltonSequenceGenerator0 = new HaltonSequenceGenerator((-2112));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -2,112 out of [1, 40] range
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = (-1);
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      intArray0[5] = (-1);
      intArray0[6] = (-1);
      intArray0[7] = (-1);
      HaltonSequenceGenerator haltonSequenceGenerator0 = null;
      try {
        haltonSequenceGenerator0 = new HaltonSequenceGenerator((-1), intArray0, intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1 out of [1, 40] range
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(6);
      haltonSequenceGenerator0.skipTo(14);
      haltonSequenceGenerator0.getNextIndex();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HaltonSequenceGenerator haltonSequenceGenerator0 = null;
      try {
        haltonSequenceGenerator0 = new HaltonSequenceGenerator(98);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 98 out of [1, 40] range
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      intArray0[1] = 2;
      intArray0[0] = 2;
      HaltonSequenceGenerator haltonSequenceGenerator0 = new HaltonSequenceGenerator(2, intArray0, intArray0);
      haltonSequenceGenerator0.skipTo(499);
      assertEquals(500, haltonSequenceGenerator0.getNextIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = (-2694);
      HaltonSequenceGenerator haltonSequenceGenerator0 = null;
      try {
        haltonSequenceGenerator0 = new HaltonSequenceGenerator((-2694));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -2,694 out of [1, 40] range
         //
         verifyException("org.apache.commons.math4.random.HaltonSequenceGenerator", e);
      }
  }
}
