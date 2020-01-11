/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Dec 11 22:26:29 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AdamsFieldIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math4.ode.nonstiff.AdamsFieldIntegrator"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AdamsFieldIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math4.ode.MultistepFieldIntegrator$InitializationCompletedMarkerException",
      "org.apache.commons.math4.ode.sampling.FieldStepHandler",
      "org.apache.commons.math4.exception.MathRuntimeException",
      "org.apache.commons.math4.ode.FirstOrderFieldIntegrator",
      "org.apache.commons.math4.ode.sampling.FieldStepInterpolator",
      "org.apache.commons.math4.exception.MathIllegalStateException",
      "org.apache.commons.math4.exception.NumberIsTooSmallException",
      "org.apache.commons.math4.exception.util.Localizable",
      "org.apache.commons.math4.exception.MathIllegalNumberException",
      "org.apache.commons.math4.ode.FieldODEState",
      "org.apache.commons.math4.ode.FieldODEStateAndDerivative",
      "org.apache.commons.math4.ode.AbstractFieldIntegrator",
      "org.apache.commons.math4.ode.nonstiff.AdamsFieldIntegrator",
      "org.apache.commons.math4.exception.MathIllegalArgumentException",
      "org.apache.commons.math4.analysis.solvers.BracketedRealFieldUnivariateSolver",
      "org.apache.commons.math4.exception.util.ExceptionContextProvider",
      "org.apache.commons.math4.exception.DimensionMismatchException",
      "org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeFieldIntegrator",
      "org.apache.commons.math4.ode.MultistepFieldIntegrator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AdamsFieldIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math4.ode.AbstractFieldIntegrator",
      "org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeFieldIntegrator",
      "org.apache.commons.math4.ode.MultistepFieldIntegrator",
      "org.apache.commons.math4.ode.nonstiff.AdamsFieldIntegrator",
      "org.apache.commons.math4.ode.nonstiff.AdamsNordsieckFieldTransformer",
      "org.apache.commons.math4.ode.nonstiff.AdamsBashforthFieldIntegrator",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor$1",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor",
      "org.apache.commons.math4.util.FastMath",
      "org.apache.commons.math4.ode.nonstiff.AdamsMoultonFieldIntegrator",
      "org.apache.commons.math4.linear.AbstractFieldMatrix",
      "org.apache.commons.math4.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math4.util.Decimal64",
      "org.apache.commons.math4.dfp.Dfp",
      "org.apache.commons.math4.ode.FieldExpandableODE",
      "org.apache.commons.math4.ode.FieldODEState"
    );
  }
}
