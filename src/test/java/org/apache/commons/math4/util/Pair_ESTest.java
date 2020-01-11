/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 21:27:18 GMT 2019
 */

package org.apache.commons.math4.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math4.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Pair_ESTest extends Pair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pair<String, Integer> pair0 = new Pair<String, Integer>((String) null, (Integer) null);
      Pair<Integer, String> pair1 = Pair.create((Integer) null, (String) null);
      pair0.toString();
      Pair<String, Integer> pair2 = new Pair<String, Integer>(pair0);
      pair2.getFirst();
      Integer integer0 = new Integer(1347);
      Pair<Object, Integer> pair3 = new Pair<Object, Integer>(pair2, integer0);
      Pair.create((Object) pair2, (Object) null);
      pair3.toString();
      Integer integer1 = pair3.getValue();
      Pair<Integer, Object> pair4 = new Pair<Integer, Object>(pair1);
      Pair<Object, Object> pair5 = Pair.create((Object) pair4, (Object) "[null, null]");
      Pair<Object, Object> pair6 = Pair.create((Object) pair5, (Object) pair1);
      Object object0 = pair6.getValue();
      Pair<Object, String> pair7 = new Pair<Object, String>(object0, (String) null);
      pair7.getKey();
      Pair.create((String) null, pair2);
      pair6.getFirst();
      Integer integer2 = new Integer(1347);
      Pair<String, Object> pair8 = Pair.create("[null, null]", (Object) null);
      Pair.create(pair8, integer1);
      pair8.toString();
      Pair<Integer, Pair<Object, Object>> pair9 = new Pair<Integer, Pair<Object, Object>>(integer2, pair5);
      Pair<Object, Object> pair10 = pair9.getValue();
      pair10.toString();
      Pair<String, String> pair11 = new Pair<String, String>("yq,y|", "yq,y|");
      pair10.toString();
      pair11.equals((Object) null);
      pair7.hashCode();
      pair10.toString();
      pair2.getFirst();
      pair2.getValue();
      Pair<String, Object> pair12 = new Pair<String, Object>(pair2);
      Pair pair13 = new Pair<Object, Object>((Object) null, integer2);
      pair12.equals(pair13);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pair<String, String> pair0 = new Pair<String, String>("<tV[Z;!=PY@Y=[1kp", "<tV[Z;!=PY@Y=[1kp");
      pair0.getValue();
      Pair<String, Object> pair1 = Pair.create((String) null, (Object) "<tV[Z;!=PY@Y=[1kp");
      Pair<Object, Object> pair2 = new Pair<Object, Object>(pair1);
      Pair<Object, Object> pair3 = Pair.create((Object) pair0, (Object) "");
      pair3.getSecond();
      pair2.toString();
      Pair.create((Object) pair0, "a*?fb.D&;<nf3&g&4t%");
      Integer integer0 = new Integer(16);
      Pair<String, Object> pair4 = new Pair<String, Object>("", pair0);
      pair4.toString();
      Pair<Integer, Object> pair5 = Pair.create(integer0, (Object) pair4);
      Pair.create((Object) pair2, (Object) pair4);
      Pair<Object, String> pair6 = new Pair<Object, String>("", "");
      Pair<String, Integer> pair7 = new Pair<String, Integer>("", integer0);
      Pair.create((String) null, pair7);
      pair6.getValue();
      pair2.equals("");
      pair6.getValue();
      Integer integer1 = new Integer(16);
      Pair<String, Integer> pair8 = Pair.create("BoV41\"Vj<5,zHqH", integer1);
      Integer integer2 = pair8.getSecond();
      Pair<Pair<Integer, Object>, String> pair9 = Pair.create(pair5, "");
      Pair<Object, String> pair10 = new Pair<Object, String>(pair9, "[, [<tV[Z;!=PY@Y=[1kp, <tV[Z;!=PY@Y=[1kp]]");
      pair1.equals(pair10);
      Integer integer3 = new Integer(16);
      Pair<Integer, Integer> pair11 = new Pair<Integer, Integer>(integer2, integer3);
      pair11.getValue();
      pair1.hashCode();
      Pair.create("4Zqv+>r/92Gvh", (String) null);
      pair2.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pair<String, String> pair0 = new Pair<String, String>("|7Y&G|ESYo6obmn", "|7Y&G|ESYo6obmn");
      Pair<Object, String> pair1 = new Pair<Object, String>(pair0);
      pair1.equals(pair0);
      Pair<String, Object> pair2 = new Pair<String, Object>(pair0);
      Pair<String, String> pair3 = Pair.create("|7Y&G|ESYo6obmn", "|7Y&G|ESYo6obmn");
      Pair<Object, String> pair4 = new Pair<Object, String>(pair3, "|7Y&G|ESYo6obmn");
      Integer integer0 = new Integer(0);
      Pair.create((Object) pair4, integer0);
      Pair<String, Pair<String, Object>> pair5 = Pair.create("|7Y&G|ESYo6obmn", pair2);
      Integer integer1 = new Integer(1);
      Pair<String, Integer> pair6 = Pair.create("*7rRgV$f?\")&i", integer1);
      pair6.toString();
      pair5.toString();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Pair<String, Integer> pair0 = Pair.create("%oXU", integer0);
      Pair<Object, String> pair1 = new Pair<Object, String>("%oXU", "%oXU");
      pair1.hashCode();
      Pair<String, String> pair2 = new Pair<String, String>("%oXU", "%oXU");
      pair2.equals(pair0);
      Integer integer1 = new Integer(1);
      Integer integer2 = new Integer(1264);
      Pair.create(integer1, integer2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pair<String, Integer> pair0 = new Pair<String, Integer>((String) null, (Integer) null);
      Pair<Integer, String> pair1 = Pair.create((Integer) null, (String) null);
      pair0.toString();
      Pair<String, Integer> pair2 = new Pair<String, Integer>(pair0);
      pair2.getFirst();
      Integer integer0 = new Integer(1347);
      Pair<Object, Integer> pair3 = new Pair<Object, Integer>(pair2, integer0);
      Pair.create((Object) pair2, (Object) null);
      pair3.toString();
      pair3.getValue();
      Pair<Integer, Object> pair4 = new Pair<Integer, Object>(pair1);
      Pair<Object, Object> pair5 = Pair.create((Object) pair4, (Object) "[null, null]");
      Pair<Object, Object> pair6 = Pair.create((Object) pair5, (Object) pair1);
      Object object0 = pair6.getValue();
      Pair<Object, String> pair7 = new Pair<Object, String>(object0, (String) null);
      pair7.getKey();
      Pair.create((String) null, pair2);
      pair6.getFirst();
      Integer integer1 = new Integer(1347);
      Pair<Integer, Pair<Object, Object>> pair8 = new Pair<Integer, Pair<Object, Object>>(integer1, pair5);
      Pair<Object, Object> pair9 = pair8.getValue();
      pair9.toString();
      Pair<String, String> pair10 = new Pair<String, String>("yq,y|", "yq,y|");
      pair9.toString();
      pair10.equals((Object) null);
      pair7.hashCode();
      pair9.toString();
      pair2.getFirst();
      pair2.getValue();
      Pair<String, Object> pair11 = new Pair<String, Object>(pair2);
      Pair<Object, String> pair12 = new Pair<Object, String>(pair7);
      Object object1 = pair12.getKey();
      pair11.equals(object1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, (Object) null);
      pair0.getKey();
      Pair<String, String> pair1 = Pair.create((String) null, (String) null);
      Pair.create("QzLwG#tS5C", (Object) null);
      Pair<Object, String> pair2 = Pair.create((Object) pair1, "&Hdipr ");
      pair0.getFirst();
      pair2.getKey();
      pair1.getValue();
      Pair.create((Object) pair1, "[");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pair<Object, String> pair0 = new Pair<Object, String>(")", ")");
      Pair<Pair<Object, String>, Integer> pair1 = Pair.create(pair0, (Integer) null);
      Pair<Object, Integer> pair2 = new Pair<Object, Integer>(pair1);
      pair2.getValue();
      Pair<Integer, Object> pair3 = new Pair<Integer, Object>((Integer) null, (Object) null);
      pair3.getSecond();
      Pair.create((Integer) null, (Object) null);
      pair1.getValue();
      Pair<Object, Object> pair4 = new Pair<Object, Object>(pair0);
      pair4.getValue();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-2227));
      Pair<String, String> pair0 = Pair.create("]", "Y51,Qnb!N");
      Pair<String, String> pair1 = new Pair<String, String>(pair0);
      Pair<Integer, Pair<String, String>> pair2 = new Pair<Integer, Pair<String, String>>(integer0, pair1);
      Pair<String, Object> pair3 = new Pair<String, Object>(pair0);
      Pair<Object, Pair<String, Object>> pair4 = new Pair<Object, Pair<String, Object>>(pair3, pair3);
      Object object0 = pair4.getKey();
      Pair.create("", "@b])_");
      Pair<Object, String> pair5 = Pair.create((Object) object0, "R+qLy.gY");
      pair5.toString();
      Pair<Integer, Object> pair6 = Pair.create(integer0, (Object) "Y51,Qnb!N");
      pair6.hashCode();
      pair1.toString();
      Pair<Object, Object> pair7 = new Pair<Object, Object>(pair3);
      Pair<Pair<Object, Object>, Pair<Object, String>> pair8 = Pair.create(pair7, pair5);
      Object object1 = pair8.getFirst();
      pair7.equals(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(998);
      Pair<Integer, String> pair0 = Pair.create(integer0, "");
      pair0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pair<String, Integer> pair0 = Pair.create("OYh)rLQ\"PtxGiH", (Integer) null);
      pair0.getSecond();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Object, Integer> pair0 = new Pair<Object, Integer>((Object) null, integer0);
      Pair<Object, Integer> pair1 = new Pair<Object, Integer>(pair0);
      pair1.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pair<String, String> pair0 = Pair.create("org.apache.commons.math4.util.Pair", "");
      pair0.getValue();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(47);
      Pair<Object, String> pair0 = Pair.create((Object) integer0, "l\"6KE8C");
      pair0.toString();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pair<String, Object> pair0 = Pair.create("", (Object) "");
      pair0.getKey();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<String, Integer> pair0 = Pair.create("", integer0);
      Pair<String, Integer> pair1 = new Pair<String, Integer>(pair0);
      pair1.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pair<Integer, Integer> pair0 = null;
      Pair<Integer, Integer> pair1 = null;
      try {
        pair1 = new Pair<Integer, Integer>((Pair<? extends Integer, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.util.Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Integer, Object> pair0 = Pair.create(integer0, (Object) integer0);
      pair0.getFirst();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(1264);
      Pair.create(integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer((-2227));
      Pair<String, String> pair0 = Pair.create("]", "Y51,Qnb!N");
      Pair<String, String> pair1 = new Pair<String, String>(pair0);
      Pair<Integer, Pair<String, String>> pair2 = new Pair<Integer, Pair<String, String>>(integer0, pair1);
      Pair<String, Object> pair3 = new Pair<String, Object>(pair0);
      Pair<Object, Pair<String, Object>> pair4 = new Pair<Object, Pair<String, Object>>(pair3, pair3);
      Object object0 = pair4.getKey();
      Pair.create(":#c", "@b])_");
      Pair<Object, String> pair5 = Pair.create((Object) object0, "R+qLy.gY");
      pair5.toString();
      Pair<Integer, Object> pair6 = Pair.create(integer0, (Object) "Y51,Qnb!N");
      pair6.hashCode();
      pair1.toString();
      Pair<Object, Object> pair7 = new Pair<Object, Object>(pair3);
      Pair<Pair<Object, Object>, Pair<Object, String>> pair8 = Pair.create(pair7, pair5);
      Object object1 = pair8.getFirst();
      pair7.equals(object1);
      pair5.equals("[[], Y51,Qnb!N], R+qLy.gY]");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pair<String, String> pair0 = new Pair<String, String>("|7Y&G|ESYo6obmn", "|7Y&G|ESYo6obmn");
      Pair<Object, String> pair1 = new Pair<Object, String>(pair0);
      pair1.equals(pair0);
      Pair<String, Object> pair2 = new Pair<String, Object>(pair0);
      Pair<String, String> pair3 = Pair.create("|7Y&G|ESYo6obmn", "|7Y&G|ESYo6obmn");
      Pair<Object, String> pair4 = new Pair<Object, String>(pair3, "|7Y&G|ESYo6obmn");
      Pair<String, Pair<String, Object>> pair5 = Pair.create("|7Y&G|ESYo6obmn", pair2);
      Integer integer0 = new Integer(1);
      pair5.toString();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Pair<String, Object> pair0 = new Pair<String, Object>("", "");
      pair0.getKey();
      pair0.toString();
      Integer integer0 = new Integer(0);
      Pair<Object, Integer> pair1 = Pair.create((Object) "", integer0);
      Integer integer1 = new Integer(0);
      Pair<Object, String> pair2 = Pair.create((Object) integer1, "");
      pair1.getKey();
      pair0.toString();
      Pair.create("[, ]", (Object) "[, ]");
      Integer integer2 = new Integer((-2266));
      Pair.create(integer2, (Object) pair2);
      Pair<Pair<String, Object>, Pair<Object, Integer>> pair3 = new Pair<Pair<String, Object>, Pair<Object, Integer>>(pair0, pair1);
      Pair<String, Object> pair4 = Pair.create("[, ]", (Object) "");
      pair4.getValue();
      Pair.create((Object) "", "tM/a[jOd#");
      pair3.toString();
      pair2.getKey();
      Pair<Integer, Object> pair5 = Pair.create(integer0, (Object) null);
      pair5.hashCode();
      Integer integer3 = new Integer(5247);
      Pair<Object, Object> pair6 = Pair.create((Object) "", (Object) integer3);
      pair2.equals(pair5);
      pair6.hashCode();
      Pair.create("", (Integer) null);
      pair6.toString();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pair<String, Object> pair0 = new Pair<String, Object>("}a)~|nJc_|tD<$", "}a)~|nJc_|tD<$");
      Pair<Object, Object> pair1 = new Pair<Object, Object>(pair0);
      pair1.toString();
      Pair<String, String> pair2 = Pair.create("[}a)~|nJc_|tD<$, }a)~|nJc_|tD<$]", "");
      Integer integer0 = new Integer((-670));
      Pair<Object, Integer> pair3 = new Pair<Object, Integer>(pair1, integer0);
      pair3.toString();
      pair3.getKey();
      Integer integer1 = new Integer(1058);
      Pair<Object, Integer> pair4 = Pair.create((Object) "[[}a)~|nJc_|tD<$, }a)~|nJc_|tD<$], -670]", integer1);
      Integer integer2 = new Integer((-670));
      Pair<Integer, String> pair5 = new Pair<Integer, String>(integer2, "");
      Pair<Integer, String> pair6 = new Pair<Integer, String>(pair5);
      Integer integer3 = new Integer((-670));
      pair6.equals(integer3);
      pair2.getSecond();
      Pair<Object, Pair<Object, String>> pair7 = Pair.create((Object) "[[}a)~|nJc_|tD<$, }a)~|nJc_|tD<$], -670]", (Pair<Object, String>) null);
      pair7.hashCode();
      pair4.equals(pair5);
      Pair<Object, Integer> pair8 = new Pair<Object, Integer>(pair4);
      Pair<Pair<Object, Integer>, Pair<Object, Object>> pair9 = Pair.create(pair8, pair1);
      pair9.getValue();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pair<String, Integer> pair0 = new Pair<String, Integer>((String) null, (Integer) null);
      Pair<Integer, String> pair1 = Pair.create((Integer) null, (String) null);
      pair0.toString();
      Pair<String, Integer> pair2 = new Pair<String, Integer>(pair0);
      pair2.getFirst();
      Integer integer0 = new Integer(1314);
      Pair<Object, Integer> pair3 = new Pair<Object, Integer>(pair2, integer0);
      Pair.create((Object) pair2, (Object) null);
      String string0 = pair3.toString();
      assertEquals("[[null, null], 1314]", string0);
      
      pair3.getValue();
      Pair<Integer, Object> pair4 = new Pair<Integer, Object>(pair1);
      Pair<Object, Object> pair5 = Pair.create((Object) pair4, (Object) "[null, null]");
      Pair<Object, Object> pair6 = Pair.create((Object) pair5, (Object) pair1);
      Object object0 = pair6.getValue();
      Pair<Object, String> pair7 = new Pair<Object, String>(object0, (String) null);
      pair7.getKey();
      Pair<String, Pair<String, Integer>> pair8 = Pair.create((String) null, pair2);
      String string1 = pair8.toString();
      assertEquals("[null, [null, null]]", string1);
      
      pair6.getFirst();
      Integer integer1 = new Integer(1314);
      Pair<Integer, Pair<Object, Object>> pair9 = new Pair<Integer, Pair<Object, Object>>(integer1, pair5);
      Pair<Object, Object> pair10 = pair9.getValue();
      pair10.toString();
      pair10.toString();
      pair7.hashCode();
      pair10.toString();
      pair2.getFirst();
      pair2.getValue();
      Pair<String, Object> pair11 = new Pair<String, Object>(pair2);
      Pair<Object, String> pair12 = new Pair<Object, String>(pair7);
      Object object1 = pair12.getKey();
      boolean boolean0 = pair11.equals(object1);
      boolean boolean1 = pair4.equals(pair12);
      assertFalse(boolean1 == boolean0);
      assertTrue(pair7.equals((Object)pair12));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pair<Integer, String> pair0 = new Pair<Integer, String>((Integer) null, "[o4H|0xUO!FP");
      Pair<Object, String> pair1 = new Pair<Object, String>(pair0);
      Integer integer0 = new Integer(37);
      Pair<Object, Pair<Object, String>> pair2 = new Pair<Object, Pair<Object, String>>(integer0, pair1);
      pair2.getKey();
      Integer integer1 = new Integer(37);
      Pair<Integer, Integer> pair3 = new Pair<Integer, Integer>((Integer) null, integer1);
      pair3.hashCode();
  }
}
