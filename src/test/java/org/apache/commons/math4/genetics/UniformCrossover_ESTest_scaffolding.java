/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Dec 11 21:25:21 GMT 2019
 */

package org.apache.commons.math4.genetics;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class UniformCrossover_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math4.genetics.UniformCrossover"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UniformCrossover_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math4.exception.MathRuntimeException",
      "org.apache.commons.math4.genetics.AbstractListChromosome",
      "org.apache.commons.math4.genetics.PermutationChromosome",
      "org.apache.commons.math4.exception.OutOfRangeException",
      "org.apache.commons.math4.exception.util.Localizable",
      "org.apache.commons.math4.exception.MathIllegalNumberException",
      "org.apache.commons.math4.genetics.ChromosomePair",
      "org.apache.commons.math4.exception.util.LocalizedFormats",
      "org.apache.commons.math4.genetics.RandomKey",
      "org.apache.commons.math4.genetics.CrossoverPolicy",
      "org.apache.commons.math4.exception.MathIllegalArgumentException",
      "org.apache.commons.math4.genetics.DummyRandomKey",
      "org.apache.commons.math4.genetics.Chromosome",
      "org.apache.commons.math4.genetics.Population",
      "org.apache.commons.math4.exception.util.ExceptionContextProvider",
      "org.apache.commons.math4.exception.DimensionMismatchException",
      "org.apache.commons.math4.exception.util.ExceptionContext",
      "org.apache.commons.math4.exception.util.ArgUtils",
      "org.apache.commons.math4.genetics.UniformCrossover",
      "org.apache.commons.math4.genetics.Fitness"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math4.genetics.Chromosome", false, UniformCrossover_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UniformCrossover_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math4.genetics.UniformCrossover",
      "org.apache.commons.math4.exception.util.LocalizedFormats",
      "org.apache.commons.rng.simple.internal.ProviderBuilder$RandomSourceInternal",
      "org.apache.commons.rng.simple.RandomSource",
      "org.apache.commons.rng.simple.internal.Long2Int",
      "org.apache.commons.rng.simple.internal.Int2Long",
      "org.apache.commons.rng.simple.internal.Long2IntArray",
      "org.apache.commons.rng.simple.internal.Long2LongArray",
      "org.apache.commons.rng.simple.internal.LongArray2Long",
      "org.apache.commons.rng.simple.internal.IntArray2Int",
      "org.apache.commons.rng.simple.internal.LongArray2IntArray",
      "org.apache.commons.rng.simple.internal.IntArray2LongArray",
      "org.apache.commons.rng.simple.internal.ByteArray2IntArray",
      "org.apache.commons.rng.simple.internal.ByteArray2LongArray",
      "org.apache.commons.rng.simple.internal.NoOpConverter",
      "org.apache.commons.rng.simple.internal.SeedConverterComposer",
      "org.apache.commons.rng.simple.internal.ProviderBuilder",
      "org.apache.commons.rng.core.util.NumberFactory",
      "org.apache.commons.rng.core.BaseProvider",
      "org.apache.commons.rng.core.source64.LongProvider",
      "org.apache.commons.rng.core.source64.SplitMix64",
      "org.apache.commons.rng.core.source32.IntProvider",
      "org.apache.commons.rng.core.source32.AbstractWell",
      "org.apache.commons.rng.core.source32.AbstractWell$IndexTable",
      "org.apache.commons.rng.core.source32.Well44497a",
      "org.apache.commons.rng.core.source32.Well44497b",
      "org.apache.commons.rng.simple.internal.SeedFactory",
      "org.apache.commons.rng.core.source32.Well19937a",
      "org.apache.commons.rng.core.source32.Well19937c",
      "org.apache.commons.math4.genetics.GeneticAlgorithm",
      "org.apache.commons.math4.exception.MathRuntimeException",
      "org.apache.commons.math4.exception.MathIllegalArgumentException",
      "org.apache.commons.math4.exception.MathIllegalNumberException",
      "org.apache.commons.math4.exception.OutOfRangeException",
      "org.apache.commons.math4.exception.util.ExceptionContext",
      "org.apache.commons.math4.exception.util.ArgUtils",
      "org.apache.commons.math4.genetics.Chromosome"
    );
  }
}
