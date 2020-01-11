/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:23:31 GMT 2019
 */

package org.apache.commons.math4.ml.neuralnet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.ml.neuralnet.Neuron;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Neuron_ESTest extends Neuron_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Neuron neuron0 = new Neuron(814L, doubleArray0);
      double[] doubleArray1 = new double[1];
      // Undeclared exception!
      try { 
        neuron0.compareAndSetFeatures(doubleArray1, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 5
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.Neuron", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      double[] doubleArray1 = neuron0.getFeatures();
      boolean boolean0 = neuron0.compareAndSetFeatures(doubleArray0, doubleArray1);
      assertEquals(1L, neuron0.getNumberOfAttemptedUpdates());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Neuron neuron0 = new Neuron(831L, doubleArray0);
      double[] doubleArray1 = new double[6];
      // Undeclared exception!
      try { 
        neuron0.compareAndSetFeatures(doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 6 != 1
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.Neuron", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Neuron neuron0 = new Neuron(4368491638549381120L, doubleArray0);
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        neuron0.compareAndSetFeatures(doubleArray1, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 != 6
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.Neuron", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Neuron neuron0 = new Neuron(2145L, doubleArray0);
      int int0 = neuron0.getSize();
      assertEquals(0, int0);
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
      assertEquals(2145L, neuron0.getIdentifier());
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      neuron0.compareAndSetFeatures(doubleArray0, doubleArray0);
      long long0 = neuron0.getNumberOfSuccessfulUpdates();
      assertEquals(1L, neuron0.getNumberOfAttemptedUpdates());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Neuron neuron0 = new Neuron((-176L), doubleArray0);
      neuron0.compareAndSetFeatures(doubleArray0, doubleArray0);
      long long0 = neuron0.getNumberOfAttemptedUpdates();
      assertEquals(1L, neuron0.getNumberOfSuccessfulUpdates());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      neuron0.getIdentifier();
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Neuron neuron0 = new Neuron(4368491638549381120L, doubleArray0);
      long long0 = neuron0.getIdentifier();
      assertEquals(4368491638549381120L, long0);
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      neuron0.compareAndSetFeatures(doubleArray0, doubleArray0);
      neuron0.copy();
      assertEquals(1L, neuron0.getNumberOfAttemptedUpdates());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      Neuron neuron1 = neuron0.copy();
      assertEquals(0L, neuron1.getNumberOfSuccessfulUpdates());
      assertEquals(0L, neuron1.getNumberOfAttemptedUpdates());
      assertNotSame(neuron1, neuron0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Neuron neuron0 = new Neuron((-1621L), doubleArray0);
      Neuron neuron1 = neuron0.copy();
      assertEquals(0L, neuron1.getNumberOfSuccessfulUpdates());
      assertEquals(0L, neuron1.getNumberOfAttemptedUpdates());
      assertNotSame(neuron1, neuron0);
      assertEquals((-1621L), neuron0.getIdentifier());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Neuron neuron0 = new Neuron(822L, doubleArray0);
      // Undeclared exception!
      try { 
        neuron0.compareAndSetFeatures((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.Neuron", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Neuron neuron0 = null;
      try {
        neuron0 = new Neuron(1L, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.Neuron", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Neuron neuron0 = new Neuron(822L, doubleArray0);
      neuron0.getFeatures();
      assertEquals(822L, neuron0.getIdentifier());
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Neuron neuron0 = new Neuron((-2612L), doubleArray0);
      long long0 = neuron0.getIdentifier();
      assertEquals((-2612L), long0);
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Neuron neuron0 = new Neuron((-4060L), doubleArray0);
      double[] doubleArray1 = new double[20];
      // Undeclared exception!
      try { 
        neuron0.compareAndSetFeatures(doubleArray1, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 20 != 1
         //
         verifyException("org.apache.commons.math4.ml.neuralnet.Neuron", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      double[] doubleArray1 = new double[9];
      doubleArray1[7] = 1578.05;
      boolean boolean0 = neuron0.compareAndSetFeatures(doubleArray1, doubleArray0);
      assertFalse(boolean0);
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      long long0 = neuron0.getNumberOfAttemptedUpdates();
      assertEquals(0L, long0);
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      long long0 = neuron0.getNumberOfSuccessfulUpdates();
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Neuron neuron0 = new Neuron(0L, doubleArray0);
      int int0 = neuron0.getSize();
      assertEquals(0L, neuron0.getNumberOfAttemptedUpdates());
      assertEquals(9, int0);
      assertEquals(0L, neuron0.getNumberOfSuccessfulUpdates());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Neuron neuron0 = new Neuron(822L, doubleArray0);
      Neuron neuron1 = neuron0.copy();
      assertNotSame(neuron1, neuron0);
      assertEquals(822L, neuron0.getIdentifier());
      assertEquals(0L, neuron1.getNumberOfAttemptedUpdates());
      assertEquals(0L, neuron1.getNumberOfSuccessfulUpdates());
  }
}
