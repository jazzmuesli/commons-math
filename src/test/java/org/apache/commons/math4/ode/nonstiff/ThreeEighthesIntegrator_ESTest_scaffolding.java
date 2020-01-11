/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Dec 11 22:18:20 GMT 2019
 */

package org.apache.commons.math4.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ThreeEighthesIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math4.ode.nonstiff.ThreeEighthesIntegrator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ThreeEighthesIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math4.ode.nonstiff.ThreeEighthesStepInterpolator",
      "org.apache.commons.math4.util.FastMath",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor$1",
      "org.apache.commons.math4.exception.MathArithmeticException",
      "org.apache.commons.math4.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math4.ode.sampling.StepInterpolator",
      "org.apache.commons.math4.exception.MathIllegalStateException",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math4.exception.NumberIsTooSmallException",
      "org.apache.commons.math4.exception.util.Localizable",
      "org.apache.commons.math4.ode.events.EventHandler",
      "org.apache.commons.math4.exception.ZeroException",
      "org.apache.commons.math4.analysis.solvers.BaseUnivariateSolver",
      "org.apache.commons.math4.exception.NoBracketingException",
      "org.apache.commons.math4.ode.ODEIntegrator",
      "org.apache.commons.math4.exception.MathIllegalArgumentException",
      "org.apache.commons.math4.exception.util.ExceptionContextProvider",
      "org.apache.commons.math4.exception.NullArgumentException",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaIntegrator",
      "org.apache.commons.math4.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math4.ode.ExpandableStatefulODE",
      "org.apache.commons.math4.ode.FirstOrderIntegrator",
      "org.apache.commons.math4.ode.AbstractIntegrator",
      "org.apache.commons.math4.exception.MathRuntimeException",
      "org.apache.commons.math4.analysis.solvers.UnivariateSolver",
      "org.apache.commons.math4.exception.MathIllegalNumberException",
      "org.apache.commons.math4.ode.nonstiff.ThreeEighthesIntegrator",
      "org.apache.commons.math4.exception.MathUnsupportedOperationException",
      "org.apache.commons.math4.exception.MaxCountExceededException",
      "org.apache.commons.math4.exception.DimensionMismatchException",
      "org.apache.commons.math4.exception.NotStrictlyPositiveException",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math4.ode.sampling.StepHandler"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ThreeEighthesIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math4.ode.AbstractIntegrator",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaIntegrator",
      "org.apache.commons.math4.ode.nonstiff.ThreeEighthesIntegrator",
      "org.apache.commons.math4.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math4.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math4.ode.nonstiff.ThreeEighthesStepInterpolator",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor$1",
      "org.apache.commons.math4.util.IntegerSequence$Incrementor",
      "org.apache.commons.math4.util.FastMath",
      "org.apache.commons.math4.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math4.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math4.util.Incrementor",
      "org.apache.commons.math4.util.Incrementor$1",
      "org.apache.commons.math4.analysis.solvers.AllowedSolution",
      "org.apache.commons.math4.ode.events.EventState",
      "org.apache.commons.math4.ode.events.EventHandler$Action",
      "org.apache.commons.math4.exception.MathRuntimeException",
      "org.apache.commons.math4.exception.MathIllegalArgumentException",
      "org.apache.commons.math4.exception.MathIllegalNumberException",
      "org.apache.commons.math4.exception.DimensionMismatchException",
      "org.apache.commons.math4.exception.util.LocalizedFormats",
      "org.apache.commons.math4.exception.util.ExceptionContext",
      "org.apache.commons.math4.exception.util.ArgUtils",
      "org.apache.commons.math4.ode.ExpandableStatefulODE",
      "org.apache.commons.math4.ode.EquationsMapper",
      "org.apache.commons.math4.exception.NumberIsTooSmallException",
      "org.apache.commons.math4.ode.AbstractIntegrator$1",
      "org.apache.commons.numbers.core.Precision",
      "org.apache.commons.math4.exception.MathIllegalStateException",
      "org.apache.commons.math4.exception.MaxCountExceededException"
    );
  }
}
