/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:40:52 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.Field;
import org.apache.commons.math4.RealFieldElement;
import org.apache.commons.math4.dfp.Decimal10;
import org.apache.commons.math4.dfp.Dfp;
import org.apache.commons.math4.ode.FieldEquationsMapper;
import org.apache.commons.math4.ode.FieldODEStateAndDerivative;
import org.apache.commons.math4.ode.nonstiff.ThreeEighthesFieldStepInterpolator;
import org.apache.commons.math4.util.Decimal64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ThreeEighthesFieldStepInterpolator_ESTest extends ThreeEighthesFieldStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Decimal64> class0 = Decimal64.class;
      Decimal64 decimal64_0 = new Decimal64((-1935.937349746037));
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0).when(field0).getZero();
      Decimal64[][] decimal64Array0 = new Decimal64[0][3];
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative0 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      FieldEquationsMapper<Decimal64> fieldEquationsMapper0 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Decimal64>(field0, false, decimal64Array0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldEquationsMapper0);
      Field<Decimal64> field1 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0, (Class) null).when(field1).getRuntimeClass();
      doReturn(decimal64_0).when(field1).getZero();
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative1 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      FieldEquationsMapper<Decimal64> fieldEquationsMapper1 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator1 = threeEighthesFieldStepInterpolator0.create(field1, false, decimal64Array0, fieldODEStateAndDerivative1, fieldODEStateAndDerivative1, fieldODEStateAndDerivative1, fieldODEStateAndDerivative1, fieldEquationsMapper1);
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative2 = threeEighthesFieldStepInterpolator0.getGlobalCurrentState();
      // Undeclared exception!
      try { 
        threeEighthesFieldStepInterpolator1.restrictStep(fieldODEStateAndDerivative2, fieldODEStateAndDerivative2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Decimal64> class0 = Decimal64.class;
      Decimal64 decimal64_0 = new Decimal64((-1935.937349746037));
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0).when(field0).getZero();
      Decimal64[][] decimal64Array0 = new Decimal64[0][3];
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative0 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      FieldEquationsMapper<Decimal64> fieldEquationsMapper0 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Decimal64>(field0, false, decimal64Array0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldEquationsMapper0);
      Field<Decimal64> field1 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field1).getRuntimeClass();
      doReturn((Object) null).when(field1).getZero();
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative1 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative2 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      FieldEquationsMapper<Decimal64> fieldEquationsMapper1 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator1 = threeEighthesFieldStepInterpolator0.create(field1, true, decimal64Array0, fieldODEStateAndDerivative1, fieldODEStateAndDerivative2, fieldODEStateAndDerivative1, fieldODEStateAndDerivative2, fieldEquationsMapper1);
      assertTrue(threeEighthesFieldStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Decimal64> class0 = Decimal64.class;
      Decimal64 decimal64_0 = new Decimal64(292.11152);
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0).when(field0).getZero();
      Decimal64[][] decimal64Array0 = new Decimal64[0][3];
      Decimal64[] decimal64Array1 = new Decimal64[0];
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative0 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      doReturn(decimal64Array1).when(fieldODEStateAndDerivative0).getState();
      FieldEquationsMapper<Decimal64> fieldEquationsMapper0 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Decimal64>(field0, false, decimal64Array0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldEquationsMapper0);
      FieldEquationsMapper<Decimal64> fieldEquationsMapper1 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        threeEighthesFieldStepInterpolator0.computeInterpolatedStateAndDerivatives(fieldEquationsMapper1, decimal64_0, decimal64_0, decimal64_0, decimal64_0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Decimal64> class0 = Decimal64.class;
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null).when(field0).getZero();
      Decimal64[][] decimal64Array0 = new Decimal64[0][3];
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative0 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      FieldEquationsMapper<Decimal64> fieldEquationsMapper0 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Decimal64>(field0, false, decimal64Array0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldEquationsMapper0);
      Field<Decimal64> field1 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(field1).getRuntimeClass();
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative1 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      FieldEquationsMapper<Decimal64> fieldEquationsMapper1 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        threeEighthesFieldStepInterpolator0.create(field1, false, decimal64Array0, fieldODEStateAndDerivative1, fieldODEStateAndDerivative1, fieldODEStateAndDerivative1, fieldODEStateAndDerivative1, fieldEquationsMapper1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Dfp> class0 = Dfp.class;
      Dfp dfp0 = mock(Dfp.class, new ViolatedAssumptionAnswer());
      Field<Dfp> field0 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(dfp0).when(field0).getZero();
      Dfp[][] dfpArray0 = new Dfp[1][2];
      FieldEquationsMapper<Dfp> fieldEquationsMapper0 = (FieldEquationsMapper<Dfp>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Dfp> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Dfp>(field0, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, fieldEquationsMapper0);
      Class<Decimal10> class1 = Decimal10.class;
      Field<Dfp> field1 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(field1).getRuntimeClass();
      doReturn((Object) null).when(field1).getZero();
      FieldEquationsMapper<Dfp> fieldEquationsMapper1 = (FieldEquationsMapper<Dfp>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        threeEighthesFieldStepInterpolator0.create(field1, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, fieldEquationsMapper1);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // [Lorg.apache.commons.math4.dfp.Dfp;
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Decimal64> class0 = Decimal64.class;
      Decimal64 decimal64_0 = new Decimal64((-330.23));
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0).when(field0).getZero();
      Decimal64[][] decimal64Array0 = new Decimal64[2][8];
      Decimal64[] decimal64Array1 = new Decimal64[5];
      decimal64Array1[0] = decimal64_0;
      decimal64Array0[0] = decimal64Array1;
      decimal64Array0[1] = decimal64Array0[0];
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative0 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      doReturn((RealFieldElement[]) null).when(fieldODEStateAndDerivative0).getState();
      FieldEquationsMapper<Decimal64> fieldEquationsMapper0 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Decimal64>(field0, false, decimal64Array0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldEquationsMapper0);
      FieldEquationsMapper<Decimal64> fieldEquationsMapper1 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        threeEighthesFieldStepInterpolator0.computeInterpolatedStateAndDerivatives(fieldEquationsMapper1, decimal64Array1[1], decimal64_0, decimal64_0, decimal64Array1[4]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Field<Dfp> field0 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(field0).getRuntimeClass();
      Dfp[][] dfpArray0 = new Dfp[5][0];
      ThreeEighthesFieldStepInterpolator<Dfp> threeEighthesFieldStepInterpolator0 = null;
      try {
        threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Dfp>(field0, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldEquationsMapper<Dfp>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Decimal64> class0 = Decimal64.class;
      Decimal64 decimal64_0 = new Decimal64(2047.68399279);
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0).when(field0).getZero();
      Decimal64[][] decimal64Array0 = new Decimal64[2][8];
      Decimal64 decimal64_1 = new Decimal64(0.0);
      Decimal64[] decimal64Array1 = new Decimal64[2];
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative0 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      doReturn(decimal64Array1).when(fieldODEStateAndDerivative0).getState();
      FieldEquationsMapper<Decimal64> fieldEquationsMapper0 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Decimal64>(field0, false, decimal64Array0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldODEStateAndDerivative0, fieldEquationsMapper0);
      FieldEquationsMapper<Decimal64> fieldEquationsMapper1 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        threeEighthesFieldStepInterpolator0.computeInterpolatedStateAndDerivatives(fieldEquationsMapper1, (Decimal64) null, decimal64_1, decimal64_0, decimal64_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.Decimal64", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Decimal64> class0 = Decimal64.class;
      Decimal64 decimal64_0 = new Decimal64(2581.1);
      Field<Decimal64> field0 = (Field<Decimal64>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(decimal64_0).when(field0).getZero();
      Decimal64[][] decimal64Array0 = new Decimal64[0][3];
      FieldODEStateAndDerivative<Decimal64> fieldODEStateAndDerivative0 = (FieldODEStateAndDerivative<Decimal64>) mock(FieldODEStateAndDerivative.class, new ViolatedAssumptionAnswer());
      doReturn((RealFieldElement[]) null).when(fieldODEStateAndDerivative0).getState();
      FieldEquationsMapper<Decimal64> fieldEquationsMapper0 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Decimal64> threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Decimal64>(field0, false, decimal64Array0, (FieldODEStateAndDerivative<Decimal64>) null, fieldODEStateAndDerivative0, (FieldODEStateAndDerivative<Decimal64>) null, fieldODEStateAndDerivative0, fieldEquationsMapper0);
      FieldEquationsMapper<Decimal64> fieldEquationsMapper1 = (FieldEquationsMapper<Decimal64>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        threeEighthesFieldStepInterpolator0.computeInterpolatedStateAndDerivatives(fieldEquationsMapper1, decimal64_0, decimal64_0, decimal64_0, decimal64_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Class<Decimal10> class0 = Decimal10.class;
      Field<Dfp> field0 = (Field<Dfp>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null).when(field0).getZero();
      Dfp[][] dfpArray0 = new Dfp[3][3];
      FieldEquationsMapper<Dfp> fieldEquationsMapper0 = (FieldEquationsMapper<Dfp>) mock(FieldEquationsMapper.class, new ViolatedAssumptionAnswer());
      ThreeEighthesFieldStepInterpolator<Dfp> threeEighthesFieldStepInterpolator0 = null;
      try {
        threeEighthesFieldStepInterpolator0 = new ThreeEighthesFieldStepInterpolator<Dfp>(field0, true, dfpArray0, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, (FieldODEStateAndDerivative<Dfp>) null, fieldEquationsMapper0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // [Lorg.apache.commons.math4.dfp.Dfp;
         //
         verifyException("org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator", e);
      }
  }
}
