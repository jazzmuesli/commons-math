/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:37:10 GMT 2019
 */

package org.apache.commons.math4.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.util.Incrementor;
import org.apache.commons.math4.util.IterationEvent;
import org.apache.commons.math4.util.IterationListener;
import org.apache.commons.math4.util.IterationManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IterationManager_ESTest extends IterationManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = null;
      try {
        iterationManager0 = new IterationManager((-2401), (Incrementor.MaxCountExceededCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.Incrementor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(208, incrementor_MaxCountExceededCallback0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireIterationPerformedEvent(iterationEvent0);
      IterationEvent iterationEvent1 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireIterationPerformedEvent(iterationEvent1);
      iterationManager0.incrementIterationCount();
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.removeIterationListener(iterationListener0);
      iterationManager0.removeIterationListener((IterationListener) null);
      IterationEvent iterationEvent2 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      IterationEvent iterationEvent3 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener((IterationListener) null);
      // Undeclared exception!
      try { 
        iterationManager0.fireIterationStartedEvent(iterationEvent3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(0, incrementor_MaxCountExceededCallback0);
      assertEquals(0, iterationManager0.getMaxIterations());
      
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.removeIterationListener(iterationListener0);
      iterationManager0.resetIterationCount();
      int int0 = iterationManager0.getMaxIterations();
      assertEquals(0, int0);
      
      IterationListener iterationListener1 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.removeIterationListener(iterationListener1);
      assertEquals(0, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(0, incrementor_MaxCountExceededCallback0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireIterationStartedEvent(iterationEvent0);
      iterationManager0.incrementIterationCount();
      iterationManager0.incrementIterationCount();
      iterationManager0.resetIterationCount();
      IterationEvent iterationEvent1 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireTerminationEvent(iterationEvent1);
      iterationManager0.resetIterationCount();
      iterationManager0.resetIterationCount();
      IterationEvent iterationEvent2 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireInitializationEvent(iterationEvent2);
      iterationManager0.getMaxIterations();
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      IterationListener iterationListener1 = null;
      iterationManager0.addIterationListener((IterationListener) null);
      IterationEvent iterationEvent3 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        iterationManager0.fireTerminationEvent(iterationEvent3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager((-2857), incrementor_MaxCountExceededCallback0);
      iterationManager0.incrementIterationCount();
      int int0 = iterationManager0.getMaxIterations();
      assertEquals((-2857), int0);
      
      iterationManager0.getIterations();
      assertEquals((-2857), iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(42);
      int int0 = iterationManager0.getMaxIterations();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager((-1394));
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      IterationEvent iterationEvent1 = null;
      iterationManager0.addIterationListener((IterationListener) null);
      // Undeclared exception!
      try { 
        iterationManager0.fireIterationPerformedEvent((IterationEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.resetIterationCount();
      try { 
        iterationManager0.incrementIterationCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math4.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(401);
      iterationManager0.incrementIterationCount();
      IterationListener iterationListener0 = null;
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireTerminationEvent(iterationEvent0);
      IterationEvent iterationEvent1 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireInitializationEvent(iterationEvent1);
      iterationManager0.incrementIterationCount();
      iterationManager0.addIterationListener((IterationListener) null);
      IterationEvent iterationEvent2 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.incrementIterationCount();
      // Undeclared exception!
      try { 
        iterationManager0.fireInitializationEvent(iterationEvent2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.IterationManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager((-2229));
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.removeIterationListener(iterationListener0);
      int int0 = iterationManager0.getMaxIterations();
      assertEquals((-2229), int0);
      
      iterationManager0.getIterations();
      assertEquals((-2229), iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(1680, incrementor_MaxCountExceededCallback0);
      iterationManager0.fireIterationStartedEvent((IterationEvent) null);
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireTerminationEvent(iterationEvent0);
      iterationManager0.fireIterationPerformedEvent((IterationEvent) null);
      iterationManager0.fireIterationStartedEvent((IterationEvent) null);
      iterationManager0.incrementIterationCount();
      assertEquals(1680, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(580, incrementor_MaxCountExceededCallback0);
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      IterationListener iterationListener1 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener1);
      iterationManager0.fireIterationStartedEvent(iterationEvent0);
      iterationManager0.removeIterationListener(iterationListener0);
      int int0 = iterationManager0.getMaxIterations();
      assertEquals(580, int0);
      
      iterationManager0.incrementIterationCount();
      assertEquals(580, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(0, incrementor_MaxCountExceededCallback0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.resetIterationCount();
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      iterationManager0.fireIterationPerformedEvent(iterationEvent0);
      iterationManager0.resetIterationCount();
      assertEquals(0, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(1);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireIterationPerformedEvent(iterationEvent0);
      assertEquals(1, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(753);
      iterationManager0.resetIterationCount();
      assertEquals(753, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(1, incrementor_MaxCountExceededCallback0);
      iterationManager0.incrementIterationCount();
      assertEquals(1, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(2574, incrementor_MaxCountExceededCallback0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireTerminationEvent(iterationEvent0);
      assertEquals(2574, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireInitializationEvent(iterationEvent0);
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      IterationEvent iterationEvent1 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireInitializationEvent(iterationEvent1);
      assertEquals(0, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(3161);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireInitializationEvent(iterationEvent0);
      assertEquals(3161, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(0, incrementor_MaxCountExceededCallback0);
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      assertEquals(0, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(0);
      try { 
        iterationManager0.incrementIterationCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math4.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Incrementor.MaxCountExceededCallback incrementor_MaxCountExceededCallback0 = mock(Incrementor.MaxCountExceededCallback.class, new ViolatedAssumptionAnswer());
      IterationManager iterationManager0 = new IterationManager(32, incrementor_MaxCountExceededCallback0);
      IterationEvent iterationEvent0 = mock(IterationEvent.class, new ViolatedAssumptionAnswer());
      iterationManager0.fireIterationStartedEvent(iterationEvent0);
      assertEquals(32, iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager((-2601));
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.addIterationListener(iterationListener0);
      iterationManager0.fireInitializationEvent((IterationEvent) null);
      iterationManager0.getIterations();
      iterationManager0.getIterations();
      assertEquals((-2601), iterationManager0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IterationManager iterationManager0 = new IterationManager(2513);
      int int0 = iterationManager0.getMaxIterations();
      assertEquals(2513, int0);
      
      IterationListener iterationListener0 = mock(IterationListener.class, new ViolatedAssumptionAnswer());
      iterationManager0.removeIterationListener(iterationListener0);
      iterationManager0.resetIterationCount();
      assertEquals(2513, iterationManager0.getMaxIterations());
  }
}
