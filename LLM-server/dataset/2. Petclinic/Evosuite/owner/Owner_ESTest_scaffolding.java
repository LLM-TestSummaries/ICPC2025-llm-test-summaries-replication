/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Wed Nov 02 12:55:44 GMT 2022
 */

package org.springframework.samples.petclinic.evosuite.owner;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Owner_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() {
    org.evosuite.runtime.RuntimeSettings.className = "org.springframework.samples.petclinic.owner.Owner";
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
    System.setProperties((java.util.Properties) defaultProperties.clone());
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

    System.setProperties((java.util.Properties) defaultProperties.clone());
    System.setProperty("user.dir", "/Users/Software Development/Web Development/Clonned Projects/spring-petclinic");
    System.setProperty("java.io.tmpdir", "/var/folders/yc/kykqf2wd0tgdw_85fbvlyj680000gn/T/");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Owner_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.samples.petclinic.owner.Pet",
      "org.springframework.util.ConcurrentReferenceHashMap$Reference",
      "org.springframework.core.style.DefaultToStringStyler",
      "org.springframework.util.ConcurrentReferenceHashMap$Segment",
      "org.springframework.samples.petclinic.owner.Visit",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceManager",
      "org.springframework.util.ConcurrentReferenceHashMap",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceType",
      "org.springframework.core.style.ValueStyler",
      "org.springframework.util.ConcurrentReferenceHashMap$1",
      "org.springframework.util.ConcurrentReferenceHashMap$2",
      "org.springframework.util.ConcurrentReferenceHashMap$3",
      "org.springframework.samples.petclinic.model.BaseEntity",
      "org.springframework.util.ClassUtils",
      "org.springframework.util.ConcurrentReferenceHashMap$4",
      "org.springframework.util.ObjectUtils",
      "org.springframework.core.style.ToStringCreator",
      "org.springframework.core.style.ToStringStyler",
      "org.springframework.samples.petclinic.model.NamedEntity",
      "org.springframework.core.style.DefaultValueStyler",
      "org.springframework.core.style.StylerUtils",
      "org.springframework.samples.petclinic.owner.Owner",
      "org.springframework.samples.petclinic.model.Person",
      "org.springframework.samples.petclinic.owner.PetType",
      "org.springframework.util.ConcurrentReferenceHashMap$Task",
      "org.springframework.util.ConcurrentReferenceHashMap$5",
      "org.springframework.util.Assert",
      "org.springframework.util.StringUtils"
    );
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Owner_ESTest_scaffolding.class.getClassLoader());

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.samples.petclinic.model.BaseEntity",
      "org.springframework.samples.petclinic.model.Person",
      "org.springframework.samples.petclinic.owner.Owner",
      "org.springframework.format.annotation.DateTimeFormat$ISO",
      "org.springframework.samples.petclinic.owner.Visit",
      "org.springframework.util.Assert",
      "org.springframework.core.style.DefaultToStringStyler",
      "org.springframework.core.style.DefaultValueStyler",
      "org.springframework.core.style.StylerUtils",
      "org.springframework.core.style.ToStringCreator",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceType",
      "org.springframework.util.ConcurrentReferenceHashMap",
      "org.springframework.util.ConcurrentReferenceHashMap$Segment",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceManager",
      "org.springframework.util.ClassUtils",
      "org.springframework.util.StringUtils",
      "org.springframework.util.ObjectUtils",
      "org.springframework.samples.petclinic.model.NamedEntity",
      "org.springframework.samples.petclinic.owner.Pet",
      "org.springframework.samples.petclinic.owner.PetType",
      "org.apache.tomcat.util.buf.Utf8Encoder"
    );
  }
}
