/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:58:46 GMT 2019
 */

package org.apache.commons.math4.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.List;
import org.apache.commons.math4.fitting.WeightedObservedPoint;
import org.apache.commons.math4.fitting.WeightedObservedPoints;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class WeightedObservedPoints_ESTest extends WeightedObservedPoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeightedObservedPoints weightedObservedPoints0 = new WeightedObservedPoints();
      weightedObservedPoints0.add(0.0, (-264.593383));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WeightedObservedPoints weightedObservedPoints0 = new WeightedObservedPoints();
      weightedObservedPoints0.add((-1.0), (-337.31), 0.0);
      List<WeightedObservedPoint> list0 = weightedObservedPoints0.toList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeightedObservedPoints weightedObservedPoints0 = new WeightedObservedPoints();
      weightedObservedPoints0.clear();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WeightedObservedPoints weightedObservedPoints0 = new WeightedObservedPoints();
      List<WeightedObservedPoint> list0 = weightedObservedPoints0.toList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WeightedObservedPoints weightedObservedPoints0 = new WeightedObservedPoints();
      WeightedObservedPoint weightedObservedPoint0 = mock(WeightedObservedPoint.class, new ViolatedAssumptionAnswer());
      weightedObservedPoints0.add(weightedObservedPoint0);
  }
}
