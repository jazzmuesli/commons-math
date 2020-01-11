/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:19:33 GMT 2019
 */

package org.apache.commons.math4.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.filter.KalmanFilter;
import org.apache.commons.math4.filter.MeasurementModel;
import org.apache.commons.math4.filter.ProcessModel;
import org.apache.commons.math4.linear.RealMatrix;
import org.apache.commons.math4.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class KalmanFilter_ESTest extends KalmanFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn((RealMatrix) null).when(realMatrix1).multiply(any(org.apache.commons.math4.linear.RealMatrix.class));
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix2).getColumnDimension();
      doReturn(0).when(realMatrix2).getRowDimension();
      doReturn(true).when(realMatrix2).isSquare();
      doReturn(realMatrix1).when(realMatrix2).multiply(any(org.apache.commons.math4.linear.RealMatrix.class));
      doReturn(realVector0).when(realMatrix2).operate(any(org.apache.commons.math4.linear.RealVector.class));
      doReturn(realMatrix0).when(realMatrix2).transpose();
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix3).getRowDimension();
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealVector realVector1 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      RealVector realVector2 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realVector2).getDimension();
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix3, (RealMatrix) null).when(processModel0).getControlMatrix();
      doReturn(realMatrix6, realMatrix4).when(processModel0).getInitialErrorCovariance();
      doReturn(realVector1, realVector2).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix5, (RealMatrix) null).when(processModel0).getProcessNoise();
      doReturn(realMatrix2).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix7 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix8 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix8).getColumnDimension();
      doReturn(164).when(realMatrix8).getRowDimension();
      doReturn(realMatrix7).when(realMatrix8).transpose();
      RealMatrix realMatrix9 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(164).when(realMatrix9).getRowDimension();
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix8).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix9).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
      // Undeclared exception!
      try { 
        kalmanFilter0.predict();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix1).getColumnDimension();
      doReturn(realMatrix0).when(realMatrix1).transpose();
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix2, realMatrix3).when(processModel0).getControlMatrix();
      doReturn(realVector0, (RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix3).when(processModel0).getProcessNoise();
      doReturn(realMatrix1).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix4).when(realMatrix5).transpose();
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix5).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix6).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(1689, 1689).when(realMatrix1).getColumnDimension();
      doReturn(2086).when(realMatrix1).getRowDimension();
      doReturn(true).when(realMatrix1).isSquare();
      doReturn(realMatrix0).when(realMatrix1).transpose();
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix4).getColumnDimension();
      doReturn(1689).when(realMatrix4).getRowDimension();
      doReturn(realMatrix3).when(realMatrix4).copy();
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix2, realMatrix4).when(processModel0).getControlMatrix();
      doReturn((RealMatrix) null).when(processModel0).getInitialErrorCovariance();
      doReturn((RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix4).when(processModel0).getProcessNoise();
      doReturn(realMatrix1).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(2086).when(realMatrix6).getColumnDimension();
      doReturn(1689, 1689).when(realMatrix6).getRowDimension();
      doReturn(realMatrix5).when(realMatrix6).transpose();
      RealMatrix realMatrix7 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(realMatrix7).getColumnDimension();
      doReturn(0, 0).when(realMatrix7).getRowDimension();
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix6).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix7).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // got 0x0 but expected 1,689x0
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(1689, 1689).when(realMatrix1).getColumnDimension();
      doReturn(2086, 1689).when(realMatrix1).getRowDimension();
      doReturn(true).when(realMatrix1).isSquare();
      doReturn(realMatrix0).when(realMatrix1).transpose();
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix2).getRowDimension();
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix3).when(realMatrix4).copy();
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix2, (RealMatrix) null).when(processModel0).getControlMatrix();
      doReturn((RealMatrix) null).when(processModel0).getInitialErrorCovariance();
      doReturn((RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix4).when(processModel0).getProcessNoise();
      doReturn(realMatrix1).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(4600, 1).when(realMatrix6).getColumnDimension();
      doReturn(1689, 1).when(realMatrix6).getRowDimension();
      doReturn(realMatrix5).when(realMatrix6).transpose();
      RealMatrix realMatrix7 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix6).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix7).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // got 1,689x1 but expected 1x1,689
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(realMatrix1).getColumnDimension();
      doReturn(0).when(realMatrix1).getRowDimension();
      doReturn(false).when(realMatrix1).isSquare();
      doReturn(realMatrix0).when(realMatrix1).transpose();
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn((RealMatrix) null).when(realMatrix3).copy();
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix2, (RealMatrix) null).when(processModel0).getControlMatrix();
      doReturn((RealMatrix) null).when(processModel0).getInitialErrorCovariance();
      doReturn((RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix3).when(processModel0).getProcessNoise();
      doReturn(realMatrix1).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix4).when(realMatrix5).transpose();
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix5).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix6).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // non square (0x0) matrix
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(1689, 1689).when(realMatrix1).getColumnDimension();
      doReturn(2086, (-3757)).when(realMatrix1).getRowDimension();
      doReturn(true).when(realMatrix1).isSquare();
      doReturn(realMatrix0).when(realMatrix1).transpose();
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix2).getRowDimension();
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix3).when(realMatrix4).copy();
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix2, (RealMatrix) null).when(processModel0).getControlMatrix();
      doReturn((RealMatrix) null).when(processModel0).getInitialErrorCovariance();
      doReturn((RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix4).when(processModel0).getProcessNoise();
      doReturn(realMatrix1).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(realMatrix6).getColumnDimension();
      doReturn(0, 0).when(realMatrix6).getRowDimension();
      doReturn(realMatrix5).when(realMatrix6).transpose();
      RealMatrix realMatrix7 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix6).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix7).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // got 0x0 but expected 0x-3,757
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(457, (-1), (-3233)).when(realMatrix1).getColumnDimension();
      doReturn(realMatrix0).when(realMatrix1).transpose();
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix2, realMatrix3).when(processModel0).getControlMatrix();
      doReturn((RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix3).when(processModel0).getProcessNoise();
      doReturn(realMatrix1).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix4).when(realMatrix5).transpose();
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix5).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix6).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -3,233 != 457
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn((-2136)).when(realMatrix1).getColumnDimension();
      doReturn(realMatrix0).when(realMatrix1).transpose();
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix2, realMatrix3).when(processModel0).getControlMatrix();
      doReturn((RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix3).when(processModel0).getProcessNoise();
      doReturn(realMatrix1).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix4).when(realMatrix5).transpose();
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix5).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix6).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn((RealMatrix) null).when(realMatrix0).transpose();
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn((RealMatrix) null).when(processModel0).getControlMatrix();
      doReturn(realMatrix0).when(processModel0).getStateTransitionMatrix();
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn((RealMatrix) null).when(measurementModel0).getMeasurementMatrix();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix2).getColumnDimension();
      doReturn(realMatrix0).when(realMatrix2).transpose();
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix3, (RealMatrix) null).when(processModel0).getControlMatrix();
      doReturn(realVector0, (RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix5).when(processModel0).getProcessNoise();
      doReturn(realMatrix2).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix7 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix8 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix7).when(realMatrix8).transpose();
      RealMatrix realMatrix9 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix8).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix9).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix2).getColumnDimension();
      doReturn(realMatrix0).when(realMatrix2).transpose();
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix3, realMatrix5).when(processModel0).getControlMatrix();
      doReturn(realVector0, (RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix5).when(processModel0).getProcessNoise();
      doReturn(realMatrix2).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix7 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix8 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix7).when(realMatrix8).transpose();
      RealMatrix realMatrix9 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix8).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix9).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RealMatrix realMatrix0 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix1 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix2 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(realMatrix2).getColumnDimension();
      doReturn(realMatrix0).when(realMatrix2).transpose();
      RealMatrix realMatrix3 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix4 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix5 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix6 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealVector realVector0 = mock(RealVector.class, new ViolatedAssumptionAnswer());
      ProcessModel processModel0 = mock(ProcessModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix3, (RealMatrix) null).when(processModel0).getControlMatrix();
      doReturn(realVector0, (RealVector) null).when(processModel0).getInitialStateEstimate();
      doReturn(realMatrix5).when(processModel0).getProcessNoise();
      doReturn(realMatrix2).when(processModel0).getStateTransitionMatrix();
      RealMatrix realMatrix7 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      RealMatrix realMatrix8 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix7).when(realMatrix8).transpose();
      RealMatrix realMatrix9 = mock(RealMatrix.class, new ViolatedAssumptionAnswer());
      MeasurementModel measurementModel0 = mock(MeasurementModel.class, new ViolatedAssumptionAnswer());
      doReturn(realMatrix8).when(measurementModel0).getMeasurementMatrix();
      doReturn(realMatrix9).when(measurementModel0).getMeasurementNoise();
      KalmanFilter kalmanFilter0 = null;
      try {
        kalmanFilter0 = new KalmanFilter(processModel0, measurementModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.filter.KalmanFilter", e);
      }
  }
}
