/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:30:49 GMT 2019
 */

package org.apache.commons.math4.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math4.genetics.AbstractListChromosome;
import org.apache.commons.math4.genetics.BinaryChromosome;
import org.apache.commons.math4.genetics.DummyBinaryChromosome;
import org.apache.commons.math4.genetics.DummyListChromosome;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractListChromosome_ESTest extends AbstractListChromosome_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<Integer> list0 = BinaryChromosome.randomBinaryRepresentation(0);
      DummyListChromosome dummyListChromosome0 = new DummyListChromosome(list0);
      AbstractListChromosome<Integer> abstractListChromosome0 = dummyListChromosome0.newFixedLengthChromosome(list0);
      assertEquals(0, abstractListChromosome0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      Integer integer0 = new Integer(0);
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      integerArray0[2] = integerArray0[1];
      integerArray0[3] = integer0;
      integerArray0[4] = integerArray0[1];
      DummyListChromosome dummyListChromosome0 = new DummyListChromosome(integerArray0);
      List<Integer> list0 = dummyListChromosome0.getRepresentation();
      DummyBinaryChromosome dummyBinaryChromosome0 = new DummyBinaryChromosome(list0);
      AbstractListChromosome<Integer> abstractListChromosome0 = dummyBinaryChromosome0.newFixedLengthChromosome(list0);
      assertEquals(5, abstractListChromosome0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<Integer> list0 = BinaryChromosome.randomBinaryRepresentation(0);
      DummyListChromosome dummyListChromosome0 = new DummyListChromosome(list0);
      int int0 = dummyListChromosome0.getLength();
      assertFalse(list0.contains(int0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      int int0 = 5;
      Integer integer0 = new Integer(5);
      integerArray0[0] = integer0;
      DummyListChromosome dummyListChromosome0 = new DummyListChromosome(integerArray0);
      List<Integer> list0 = BinaryChromosome.randomBinaryRepresentation(int0);
      DummyBinaryChromosome dummyBinaryChromosome0 = new DummyBinaryChromosome(list0);
      List<Integer> list1 = dummyListChromosome0.getRepresentation();
      // Undeclared exception!
      try { 
        dummyBinaryChromosome0.newFixedLengthChromosome(list1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid binary digit: 5
         //
         verifyException("org.apache.commons.math4.genetics.BinaryChromosome", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer[] integerArray0 = new Integer[6];
      DummyListChromosome dummyListChromosome0 = new DummyListChromosome(integerArray0);
      // Undeclared exception!
      try { 
        dummyListChromosome0.newFixedLengthChromosome((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 0;
      List<Integer> list0 = BinaryChromosome.randomBinaryRepresentation(int0);
      DummyBinaryChromosome dummyBinaryChromosome0 = new DummyBinaryChromosome(list0);
      String string0 = dummyBinaryChromosome0.toString();
      assertEquals("(f=0.0 [])", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      DummyListChromosome dummyListChromosome0 = new DummyListChromosome(integerArray0);
      int int0 = dummyListChromosome0.getLength();
      assertEquals(5, int0);
  }
}
