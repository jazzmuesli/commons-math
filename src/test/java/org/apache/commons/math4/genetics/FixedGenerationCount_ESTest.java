/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:21:56 GMT 2019
 */

package org.apache.commons.math4.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.genetics.FixedGenerationCount;
import org.apache.commons.math4.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FixedGenerationCount_ESTest extends FixedGenerationCount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedGenerationCount fixedGenerationCount0 = new FixedGenerationCount(1);
      Population population0 = mock(Population.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = fixedGenerationCount0.isSatisfied(population0);
      assertFalse(boolean0);
      
      int int0 = fixedGenerationCount0.getNumGenerations();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FixedGenerationCount fixedGenerationCount0 = new FixedGenerationCount(1);
      Population population0 = mock(Population.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = fixedGenerationCount0.isSatisfied(population0);
      assertFalse(boolean0);
      
      Population population1 = mock(Population.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = fixedGenerationCount0.isSatisfied(population1);
      assertEquals(1, fixedGenerationCount0.getNumGenerations());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FixedGenerationCount fixedGenerationCount0 = null;
      try {
        fixedGenerationCount0 = new FixedGenerationCount((-3001));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -3,001 is smaller than the minimum (1)
         //
         verifyException("org.apache.commons.math4.genetics.FixedGenerationCount", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FixedGenerationCount fixedGenerationCount0 = new FixedGenerationCount(1);
      int int0 = fixedGenerationCount0.getNumGenerations();
      assertEquals(0, int0);
  }
}
