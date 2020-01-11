/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:21:18 GMT 2019
 */

package org.apache.commons.math4.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math4.exception.MathIllegalArgumentException;
import org.apache.commons.math4.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathIllegalArgumentException_ESTest extends MathIllegalArgumentException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_FORMAT_OBJECT_TO_FRACTION;
      Object[] objectArray0 = new Object[8];
      MathIllegalArgumentException mathIllegalArgumentException0 = new MathIllegalArgumentException(localizedFormats0, objectArray0);
  }
}
