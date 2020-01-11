/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Dec 11 22:07:45 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class EulerFieldIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math4.ode.nonstiff.EulerFieldIntegrator"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/projects/commons-math"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EulerFieldIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math4.ode.nonstiff.FieldButcherArrayProvider",
      "org.apache.commons.math4.ode.FieldEquationsMapper",
      "org.apache.commons.math4.exception.NoDataException",
      "org.apache.commons.math4.util.FastMath",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor$1",
      "org.apache.commons.math4.exception.MathArithmeticException",
      "org.apache.commons.math4.dfp.Dfp",
      "org.apache.commons.math4.exception.MathIllegalStateException",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math4.exception.NumberIsTooSmallException",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator",
      "org.apache.commons.math4.exception.util.Localizable",
      "org.apache.commons.math4.exception.ZeroException",
      "org.apache.commons.math4.ode.sampling.AbstractFieldStepInterpolator",
      "org.apache.commons.math4.ode.AbstractFieldIntegrator",
      "org.apache.commons.math4.exception.NullArgumentException",
      "org.apache.commons.math4.exception.NotANumberException",
      "org.apache.commons.math4.util.Decimal64",
      "org.apache.commons.math4.ode.sampling.FieldStepInterpolator",
      "org.apache.commons.math4.FieldElement",
      "org.apache.commons.math4.ode.events.FieldEventHandler",
      "org.apache.commons.math4.ode.FieldODEStateAndDerivative",
      "org.apache.commons.math4.exception.MaxCountExceededException",
      "org.apache.commons.math4.dfp.DfpField$RoundingMode",
      "org.apache.commons.math4.ode.nonstiff.EulerFieldStepInterpolator",
      "org.apache.commons.math4.exception.NotStrictlyPositiveException",
      "org.apache.commons.math4.exception.NonMonotonicSequenceException",
      "org.apache.commons.math4.dfp.Decimal10",
      "org.apache.commons.math4.ode.FieldExpandableODE",
      "org.apache.commons.math4.dfp.DfpField",
      "org.apache.commons.math4.ode.FirstOrderFieldDifferentialEquations",
      "org.apache.commons.math4.ode.FieldODEState",
      "org.apache.commons.math4.Field",
      "org.apache.commons.math4.exception.NoBracketingException",
      "org.apache.commons.math4.exception.MathIllegalArgumentException",
      "org.apache.commons.math4.analysis.solvers.BracketedRealFieldUnivariateSolver",
      "org.apache.commons.math4.exception.util.ExceptionContextProvider",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldIntegrator",
      "org.apache.commons.math4.util.MathArrays",
      "org.apache.commons.math4.ode.sampling.FieldStepHandler",
      "org.apache.commons.math4.ode.nonstiff.EulerFieldIntegrator",
      "org.apache.commons.math4.exception.MathInternalError",
      "org.apache.commons.math4.exception.NotPositiveException",
      "org.apache.commons.math4.exception.MathRuntimeException",
      "org.apache.commons.math4.ode.FirstOrderFieldIntegrator",
      "org.apache.commons.math4.RealFieldElement",
      "org.apache.commons.math4.exception.MathIllegalNumberException",
      "org.apache.commons.math4.dfp.DfpDec",
      "org.apache.commons.math4.exception.MathUnsupportedOperationException",
      "org.apache.commons.math4.exception.NumberIsTooLargeException",
      "org.apache.commons.math4.exception.DimensionMismatchException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math4.Field", false, EulerFieldIntegrator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math4.dfp.Dfp", false, EulerFieldIntegrator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math4.ode.FieldEquationsMapper", false, EulerFieldIntegrator_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EulerFieldIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math4.ode.AbstractFieldIntegrator",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldIntegrator",
      "org.apache.commons.math4.ode.nonstiff.EulerFieldIntegrator",
      "org.apache.commons.math4.util.Decimal64",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor$1",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor",
      "org.apache.commons.math4.util.MathArrays",
      "org.apache.commons.math4.dfp.Dfp",
      "org.apache.commons.math4.ode.FieldEquationsMapper",
      "org.apache.commons.math4.util.FastMath",
      "org.apache.commons.math4.ode.sampling.AbstractFieldStepInterpolator",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldStepInterpolator",
      "org.apache.commons.math4.ode.nonstiff.EulerFieldStepInterpolator",
      "org.apache.commons.math4.ode.FieldExpandableODE",
      "org.apache.commons.math4.ode.FieldODEState",
      "org.apache.commons.math4.ode.events.FieldEventState",
      "org.apache.commons.math4.ode.events.Action",
      "org.apache.commons.math4.analysis.solvers.FieldBracketingNthOrderBrentSolver"
    );
  }
}
