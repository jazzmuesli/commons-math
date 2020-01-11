/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:13:57 GMT 2019
 */

package org.apache.commons.math4.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.util.IterationEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IterationEvent_ESTest extends IterationEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IterationEvent iterationEvent0 = new IterationEvent("org.apache.commons.math4.util.IterationEvent", 0);
      int int0 = iterationEvent0.getIterations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IterationEvent iterationEvent0 = new IterationEvent("ZL3Vsud`xAFf]J}", 1);
      int int0 = iterationEvent0.getIterations();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IterationEvent iterationEvent0 = null;
      try {
        iterationEvent0 = new IterationEvent((Object) null, 1511);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IterationEvent iterationEvent0 = new IterationEvent(";M=,n", (-3812));
      int int0 = iterationEvent0.getIterations();
      assertEquals((-3812), int0);
  }
}
