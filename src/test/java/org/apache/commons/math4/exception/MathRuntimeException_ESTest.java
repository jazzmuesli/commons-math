/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:33:44 GMT 2019
 */

package org.apache.commons.math4.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.exception.MathRuntimeException;
import org.apache.commons.math4.exception.util.ExceptionContext;
import org.apache.commons.math4.exception.util.Localizable;
import org.apache.commons.math4.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathRuntimeException_ESTest extends MathRuntimeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(localizedFormats0, (Object[]) null);
      String string0 = mathRuntimeException0.getMessage();
      assertEquals("cannot normalize a zero norm vector", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NUMBER_OF_INTERPOLATION_POINTS;
      Object[] objectArray0 = new Object[0];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(localizedFormats0, objectArray0);
      String string0 = mathRuntimeException0.getLocalizedMessage();
      assertEquals("number of interpolation points ({0})", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      LocalizedFormats localizedFormats0 = LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mockThrowable0;
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(mockThrowable0, localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      LocalizedFormats localizedFormats0 = LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) localizedFormats0;
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(mockThrowable0, localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getLocalizedMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Localizable localizable0 = mock(Localizable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) objectArray0;
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(localizable0, objectArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("X;H<Y");
      Object[] objectArray0 = new Object[9];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(mockThrowable0, (Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getLocalizedMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.exception.util.ExceptionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NOT_POSITIVE_ELEMENT_AT_INDEX;
      Object[] objectArray0 = new Object[0];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(localizedFormats0, objectArray0);
      ExceptionContext exceptionContext0 = mathRuntimeException0.getContext();
      assertNotNull(exceptionContext0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      Object[] objectArray0 = new Object[8];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(mockThrowable0, (Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.exception.util.ExceptionContext", e);
      }
  }
}
