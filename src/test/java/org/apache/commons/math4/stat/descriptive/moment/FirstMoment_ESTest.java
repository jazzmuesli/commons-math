/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:21:19 GMT 2019
 */

package org.apache.commons.math4.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.stat.descriptive.moment.FirstMoment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FirstMoment_ESTest extends FirstMoment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.n = (-592L);
      firstMoment0.increment(0.0);
      assertEquals((-591L), firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(0.0);
      double double0 = firstMoment0.getResult();
      assertEquals(1L, firstMoment0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(4429.89879);
      double double0 = firstMoment0.getResult();
      assertEquals(1L, firstMoment0.getN());
      assertEquals(4429.89879, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1033.495083774864);
      firstMoment0.incrementAll(doubleArray0);
      double double0 = firstMoment0.getResult();
      assertEquals(1L, firstMoment0.getN());
      assertEquals((-1033.495083774864), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(0.0);
      long long0 = firstMoment0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.n = (-592L);
      long long0 = firstMoment0.getN();
      assertEquals((-592L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment((-5385.419840124086));
      firstMoment0.copy();
      assertEquals(1L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(0.0);
      firstMoment0.copy();
      assertEquals(1L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        FirstMoment.copy((FirstMoment) null, (FirstMoment) null);
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
      FirstMoment firstMoment0 = null;
      try {
        firstMoment0 = new FirstMoment((FirstMoment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.increment(0L);
      firstMoment0.increment(0.0);
      assertEquals(2L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      firstMoment0.clear();
      assertEquals(0L, firstMoment0.getN());
      assertEquals(Double.NaN, firstMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      FirstMoment.copy(firstMoment0, firstMoment0);
      assertEquals(Double.NaN, firstMoment0.getResult(), 0.01);
      assertEquals(0L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      long long0 = firstMoment0.getN();
      assertEquals(Double.NaN, firstMoment0.getResult(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      FirstMoment firstMoment1 = new FirstMoment(firstMoment0);
      assertTrue(firstMoment1.equals((Object)firstMoment0));
      
      firstMoment1.n = (-445L);
      firstMoment1.copy();
      assertEquals(0L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      double double0 = firstMoment0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, firstMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FirstMoment firstMoment0 = new FirstMoment();
      FirstMoment firstMoment1 = firstMoment0.copy();
      assertNotSame(firstMoment1, firstMoment0);
      assertEquals(0L, firstMoment1.getN());
      assertEquals(Double.NaN, firstMoment1.getResult(), 0.01);
  }
}
