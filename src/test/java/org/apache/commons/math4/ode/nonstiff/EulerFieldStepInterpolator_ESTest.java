/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:34:50 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.Field;
import org.apache.commons.math4.dfp.Decimal10;
import org.apache.commons.math4.dfp.Dfp;
import org.apache.commons.math4.ode.FieldEquationsMapper;
import org.apache.commons.math4.ode.FieldODEStateAndDerivative;
import org.apache.commons.math4.ode.nonstiff.EulerFieldStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EulerFieldStepInterpolator_ESTest extends EulerFieldStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dfp[][] dfpArray0 = new Dfp[5][7];
      FieldEquationsMapper<Dfp> fieldEquationsMapper0 = (FieldEquationsMapper<Dfp>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      EulerFieldStepInterpolator<Dfp> eulerFieldStepInterpolator0 = null;
      try {
        eulerFieldStepInterpolator0 = new EulerFieldStepInterpolator<Dfp>((Field<Dfp>) null, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, fieldEquationsMapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Decimal10> class0 = Decimal10.class;
      Field<Dfp> field0 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null).when(field0).getZero();
      Dfp[][] dfpArray0 = new Dfp[0][0];
      FieldEquationsMapper<Dfp> fieldEquationsMapper0 = (FieldEquationsMapper<Dfp>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      EulerFieldStepInterpolator<Dfp> eulerFieldStepInterpolator0 = new EulerFieldStepInterpolator<Dfp>(field0, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, fieldEquationsMapper0);
      Field<Dfp> field1 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(field1).getRuntimeClass();
      FieldEquationsMapper<Dfp> fieldEquationsMapper1 = (FieldEquationsMapper<Dfp>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        eulerFieldStepInterpolator0.create(field1, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, fieldEquationsMapper1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Decimal10> class0 = Decimal10.class;
      Field<Dfp> field0 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null).when(field0).getZero();
      Dfp[][] dfpArray0 = new Dfp[5][5];
      FieldEquationsMapper<Dfp> fieldEquationsMapper0 = (FieldEquationsMapper<Dfp>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      EulerFieldStepInterpolator<Dfp> eulerFieldStepInterpolator0 = null;
      try {
        eulerFieldStepInterpolator0 = new EulerFieldStepInterpolator<Dfp>(field0, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, fieldEquationsMapper0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // [Lorg.apache.commons.math4.dfp.Dfp;
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator", e);
      }
  }
}
