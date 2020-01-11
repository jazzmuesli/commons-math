/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:58:19 GMT 2019
 */

package org.apache.commons.math4.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math4.linear.NonSymmetricMatrixException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NonSymmetricMatrixException_ESTest extends NonSymmetricMatrixException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException((-1675), (-1675), 0.0);
      double double0 = nonSymmetricMatrixException0.getThreshold();
      assertEquals((-1675), nonSymmetricMatrixException0.getRow());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1675), nonSymmetricMatrixException0.getColumn());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(0, 0, 0.9999999999);
      double double0 = nonSymmetricMatrixException0.getThreshold();
      assertEquals(0, nonSymmetricMatrixException0.getColumn());
      assertEquals(0, nonSymmetricMatrixException0.getRow());
      assertEquals(0.9999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(0, 1144, 1144);
      int int0 = nonSymmetricMatrixException0.getRow();
      assertEquals(0, int0);
      assertEquals(1144.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals(1144, nonSymmetricMatrixException0.getColumn());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(201, 201, 201);
      int int0 = nonSymmetricMatrixException0.getRow();
      assertEquals(201, int0);
      assertEquals(201.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals(201, nonSymmetricMatrixException0.getColumn());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(0, 0, 0);
      int int0 = nonSymmetricMatrixException0.getColumn();
      assertEquals(0, nonSymmetricMatrixException0.getRow());
      assertEquals(0.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException(1, 833, 833);
      int int0 = nonSymmetricMatrixException0.getColumn();
      assertEquals(833.0, nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals(833, int0);
      assertEquals(1, nonSymmetricMatrixException0.getRow());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException((-1607), (-1607), (-1607));
      double double0 = nonSymmetricMatrixException0.getThreshold();
      assertEquals((-1607.0), double0, 0.01);
      assertEquals((-1607), nonSymmetricMatrixException0.getColumn());
      assertEquals((-1607), nonSymmetricMatrixException0.getRow());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException((-1607), (-1607), (-1607));
      int int0 = nonSymmetricMatrixException0.getRow();
      assertEquals((-1607), nonSymmetricMatrixException0.getColumn());
      assertEquals((-1607.0), nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals((-1607), int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NonSymmetricMatrixException nonSymmetricMatrixException0 = new NonSymmetricMatrixException((-1607), (-1607), (-1607));
      int int0 = nonSymmetricMatrixException0.getColumn();
      assertEquals((-1607), nonSymmetricMatrixException0.getRow());
      assertEquals((-1607.0), nonSymmetricMatrixException0.getThreshold(), 0.01);
      assertEquals((-1607), int0);
  }
}
