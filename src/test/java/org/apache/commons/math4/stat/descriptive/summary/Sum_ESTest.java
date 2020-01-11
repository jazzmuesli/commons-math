/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:20:24 GMT 2019
 */

package org.apache.commons.math4.stat.descriptive.summary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.stat.descriptive.summary.Sum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sum_ESTest extends Sum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 4768.4719;
      sum0.evaluate(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1755.70314657303;
      sum0.incrementAll(doubleArray0);
      sum0.getResult();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2512.010197);
      sum0.incrementAll(doubleArray0);
      sum0.getResult();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sum sum0 = new Sum();
      sum0.increment(0L);
      sum0.getN();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1572.67544;
      sum0.evaluate(doubleArray0, 0, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-3070.7300586);
      sum0.evaluate(doubleArray0, 2, 4);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3638.45801611;
      sum0.incrementAll(doubleArray0);
      sum0.copy();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2512.010197);
      sum0.incrementAll(doubleArray0);
      sum0.copy();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[1];
      sum0.incrementAll(doubleArray0);
      sum0.copy();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sum sum0 = new Sum();
      // Undeclared exception!
      try { 
        sum0.evaluate((double[]) null, (double[]) null, 440, 440);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[3];
      try { 
        sum0.evaluate(doubleArray0, doubleArray0, 9, (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[8];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try { 
        sum0.evaluate(doubleArray0, doubleArray1, (-2416), (-2416));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 8 != 1
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        sum0.evaluate(doubleArray0, doubleArray0, 194, 194);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 194
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        sum0.evaluate(doubleArray0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[3];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try { 
        sum0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 3 != 5
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
      assertNotNull(sum0);
      
      // Undeclared exception!
      try { 
        sum0.evaluate((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.stat.descriptive.summary.Sum", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertNotNull(sum0);
      
      // Undeclared exception!
      try { 
        sum0.evaluate((double[]) null, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[2];
      try { 
        sum0.evaluate(doubleArray0, 0, (-943));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // length (-943)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[8];
      try { 
        sum0.evaluate(doubleArray0, 734, 339);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertNotNull(sum0);
      
      try { 
        Sum.copy((Sum) null, sum0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sum sum0 = null;
      try {
        sum0 = new Sum((Sum) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sum sum0 = new Sum();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
      assertNotNull(sum0);
      
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      double double0 = sum0.evaluate(doubleArray0, doubleArray0, 1, 1);
      assertEquals(4, doubleArray0.length);
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[6];
      double double0 = sum0.evaluate(doubleArray0, 0, 1);
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, sum0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Sum sum0 = new Sum();
      Sum.copy(sum0, sum0);
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[11];
      doubleArray0[2] = 1.7347307230816436;
      double double0 = sum0.evaluate(doubleArray0, doubleArray0);
      assertEquals(3.0092906816033618, double0, 0.01);
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sum sum0 = new Sum();
      double double0 = sum0.getResult();
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Sum sum0 = new Sum();
      sum0.clear();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, sum0.getN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[5];
      try { 
        sum0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sum sum0 = new Sum();
      Sum sum1 = sum0.copy();
      assertEquals(0.0, sum1.getResult(), 0.01);
      assertEquals(0L, sum1.getN());
      assertNotSame(sum1, sum0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Sum sum0 = new Sum();
      Sum sum1 = new Sum(sum0);
      assertEquals(0L, sum1.getN());
      assertEquals(0.0, sum1.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sum sum0 = new Sum();
      long long0 = sum0.getN();
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertEquals(0L, long0);
  }
}
