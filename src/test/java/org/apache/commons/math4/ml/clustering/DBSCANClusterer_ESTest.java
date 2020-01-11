/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 22:24:10 GMT 2019
 */

package org.apache.commons.math4.ml.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math4.ml.clustering.DBSCANClusterer;
import org.apache.commons.math4.ml.clustering.DoublePoint;
import org.apache.commons.math4.ml.distance.DistanceMeasure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DBSCANClusterer_ESTest extends DBSCANClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = null;
      try {
        dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>((-853.399475567), 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -853.399 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math4.ml.clustering.DBSCANClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(1980.0, 1);
      assertEquals(1, dBSCANClusterer0.getMinPts());
      assertEquals(1980.0, dBSCANClusterer0.getEps(), 0.01);
      assertNotNull(dBSCANClusterer0);
      
      int int0 = dBSCANClusterer0.getMinPts();
      assertEquals(1, int0);
      assertEquals(1, dBSCANClusterer0.getMinPts());
      assertEquals(1980.0, dBSCANClusterer0.getEps(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(0.0, 0);
      assertEquals(0, dBSCANClusterer0.getMinPts());
      assertEquals(0.0, dBSCANClusterer0.getEps(), 0.01);
      assertNotNull(dBSCANClusterer0);
      
      double double0 = dBSCANClusterer0.getEps();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, dBSCANClusterer0.getMinPts());
      assertEquals(0.0, dBSCANClusterer0.getEps(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(0.0, 2);
      assertEquals(2, dBSCANClusterer0.getMinPts());
      assertEquals(0.0, dBSCANClusterer0.getEps(), 0.01);
      assertNotNull(dBSCANClusterer0);
      
      try { 
        dBSCANClusterer0.cluster((Collection<DoublePoint>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math4.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = null;
      try {
        dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(0.0, (-1712), (DistanceMeasure) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1,712 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math4.ml.clustering.DBSCANClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DistanceMeasure distanceMeasure0 = mock(DistanceMeasure.class, new ViolatedAssumptionAnswer());
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(1.0, 651, distanceMeasure0);
      assertEquals(651, dBSCANClusterer0.getMinPts());
      assertEquals(1.0, dBSCANClusterer0.getEps(), 0.01);
      assertNotNull(dBSCANClusterer0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(0.0, 119);
      DistanceMeasure distanceMeasure0 = dBSCANClusterer0.getDistanceMeasure();
      DBSCANClusterer<DoublePoint> dBSCANClusterer1 = null;
      try {
        dBSCANClusterer1 = new DBSCANClusterer<DoublePoint>((-1.0), (-43), distanceMeasure0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math4.ml.clustering.DBSCANClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(1.0, 0);
      int int0 = dBSCANClusterer0.getMinPts();
      assertEquals(0, int0);
      assertEquals(1.0, dBSCANClusterer0.getEps(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(1.0, 0);
      double double0 = dBSCANClusterer0.getEps();
      assertEquals(0, dBSCANClusterer0.getMinPts());
      assertEquals(1.0, double0, 0.01);
  }
}
