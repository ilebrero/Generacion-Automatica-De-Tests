
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    // The following exception was thrown during execution in test generation
    try {
    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    int i1 = stackAr0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    int i1 = stackAr0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b6 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    boolean b4 = stackAr0.equals((java.lang.Object)(short)100);
    boolean b6 = stackAr0.equals((java.lang.Object)0.0f);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    stackAr0.push((java.lang.Object)"hi!");
    int i10 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj14 = stackAr9.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    boolean b4 = stackAr0.equals((java.lang.Object)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    boolean b2 = stackAr0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    // The following exception was thrown during execution in test generation
    try {
    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
    boolean b3 = stackAr2.isEmpty();
    java.lang.String str4 = stackAr2.toString();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.Object obj11 = stackAr5.top();
    boolean b12 = stackAr2.equals((java.lang.Object)stackAr5);
    boolean b13 = stackAr5.isEmpty();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    stackAr5.push((java.lang.Object)stackAr14);
    // The following exception was thrown during execution in test generation
    try {
    stackAr1.push((java.lang.Object)stackAr14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    int i14 = stackAr3.size();
    java.lang.Object obj15 = stackAr3.pop();
    boolean b16 = stackAr3.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    boolean b2 = stackAr0.isEmpty();
    int i3 = stackAr0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr12.isEmpty();
    java.lang.String str15 = stackAr12.toString();
    int i16 = stackAr12.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj17 = stackAr12.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.String str8 = stackAr0.toString();
    java.lang.Object obj9 = stackAr0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "hi!"+ "'", obj9.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isEmpty();
    java.lang.String str8 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    int i8 = stackAr0.size();
    boolean b9 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    java.lang.Object obj13 = stackAr7.top();
    boolean b14 = stackAr7.isFull();
    java.lang.String str15 = stackAr7.toString();
    boolean b16 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)stackAr7);
    java.lang.Object obj18 = stackAr0.top();
    int i19 = stackAr0.size();
    int i20 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1]"+ "'", str15.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    java.lang.String str4 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj12 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isEmpty();
    boolean b6 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    int i11 = stackAr3.size();
    java.lang.Object obj12 = stackAr3.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr(0);
    java.lang.String str14 = stackAr13.toString();
    boolean b15 = stackAr13.isEmpty();
    boolean b16 = stackAr3.equals((java.lang.Object)stackAr13);
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
    boolean b18 = stackAr17.isEmpty();
    java.lang.String str19 = stackAr17.toString();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    int i22 = stackAr20.size();
    java.lang.String str23 = stackAr20.toString();
    stackAr20.push((java.lang.Object)(-1));
    java.lang.Object obj26 = stackAr20.top();
    boolean b27 = stackAr17.equals((java.lang.Object)stackAr20);
    boolean b28 = stackAr20.isEmpty();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    stackAr20.push((java.lang.Object)stackAr29);
    boolean b31 = stackAr20.isEmpty();
    java.lang.Object obj32 = stackAr20.pop();
    boolean b33 = stackAr3.equals(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1)+ "'", obj26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    int i14 = stackAr3.size();
    int i15 = stackAr3.size();
    java.lang.Object obj16 = stackAr3.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    java.lang.String str14 = stackAr3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1,[]]"+ "'", str14.equals("[-1,[]]"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    boolean b6 = stackAr1.equals((java.lang.Object)100.0f);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
    boolean b5 = stackAr4.isEmpty();
    java.lang.String str6 = stackAr4.toString();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    java.lang.Object obj13 = stackAr7.top();
    boolean b14 = stackAr4.equals((java.lang.Object)stackAr7);
    boolean b15 = stackAr7.isEmpty();
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    stackAr7.push((java.lang.Object)stackAr16);
    int i18 = stackAr7.size();
    java.lang.Object obj19 = stackAr7.pop();
    stackAr0.push(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    java.lang.String str3 = stackAr1.toString();
    java.lang.String str4 = stackAr1.toString();
    boolean b5 = stackAr1.isFull();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr(0);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    boolean b18 = stackAr0.equals((java.lang.Object)b17);
    int i19 = stackAr0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj20 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    java.lang.Object obj7 = stackAr1.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4'+ "'", obj7.equals('4'));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    boolean b7 = stackAr1.isFull();
    boolean b8 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    int i2 = stackAr1.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    boolean b2 = stackAr0.isFull();
    boolean b3 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr(0);
    java.lang.String str14 = stackAr13.toString();
    boolean b15 = stackAr13.isEmpty();
    boolean b16 = stackAr3.equals((java.lang.Object)stackAr13);
    boolean b17 = stackAr13.isFull();
    boolean b18 = stackAr13.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    java.lang.Object obj7 = stackAr0.pop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    java.lang.Object obj7 = stackAr0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'a');
    int i2 = stackAr1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    boolean b2 = stackAr0.isFull();
    java.lang.String str3 = stackAr0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    stackAr15.push((java.lang.Object)100.0f);
    boolean b20 = stackAr15.isFull();
    boolean b21 = stackAr3.equals((java.lang.Object)stackAr15);
    boolean b22 = stackAr15.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    java.lang.Object obj12 = stackAr3.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1.0d));
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isFull();
    java.lang.String str9 = stackAr6.toString();
    stackAr0.push((java.lang.Object)stackAr6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    java.lang.Object obj12 = stackAr0.top();
    java.lang.String str13 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "hi!"+ "'", obj12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[hi!]"+ "'", str13.equals("[hi!]"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    java.lang.String str3 = stackAr1.toString();
    boolean b4 = stackAr1.isEmpty();
    boolean b5 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj14 = stackAr12.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr(0);
    java.lang.String str14 = stackAr13.toString();
    boolean b15 = stackAr13.isEmpty();
    boolean b16 = stackAr3.equals((java.lang.Object)stackAr13);
    int i17 = stackAr3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int)(byte)0);
    int i5 = stackAr4.size();
    boolean b6 = stackAr1.equals((java.lang.Object)stackAr4);
    int i7 = stackAr1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    boolean b2 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'#');
    boolean b2 = stackAr1.isEmpty();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    stackAr3.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str10 = stackAr9.toString();
    boolean b11 = stackAr9.isEmpty();
    stackAr9.push((java.lang.Object)100.0f);
    boolean b14 = stackAr3.equals((java.lang.Object)stackAr9);
    boolean b15 = stackAr1.equals((java.lang.Object)b14);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj16 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)100);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.Object obj5 = stackAr0.pop();
    boolean b6 = stackAr0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(10);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)0);
    java.lang.String str2 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
    java.lang.String str3 = stackAr2.toString();
    int i4 = stackAr2.size();
    stackAr2.push((java.lang.Object)"hi!");
    java.lang.String str7 = stackAr2.toString();
    stackAr0.push((java.lang.Object)str7);
    java.lang.Object obj9 = stackAr0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[hi!]"+ "'", str7.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "[hi!]"+ "'", obj9.equals("[hi!]"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isEmpty();
    boolean b7 = stackAr0.equals((java.lang.Object)"[-1,[]]");
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str10 = stackAr9.toString();
    java.lang.String str11 = stackAr9.toString();
    boolean b12 = stackAr0.equals((java.lang.Object)str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    java.lang.String str3 = stackAr1.toString();
    boolean b4 = stackAr1.isFull();
    java.lang.String str5 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    boolean b3 = stackAr0.isFull();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    int i11 = stackAr3.size();
    boolean b12 = stackAr3.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
    java.lang.String str3 = stackAr2.toString();
    int i4 = stackAr2.size();
    stackAr2.push((java.lang.Object)"hi!");
    java.lang.String str7 = stackAr2.toString();
    stackAr0.push((java.lang.Object)str7);
    java.lang.Object obj9 = stackAr0.top();
    java.lang.String str10 = stackAr0.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    boolean b12 = stackAr11.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    stackAr13.push((java.lang.Object)"hi!");
    java.lang.String str18 = stackAr13.toString();
    stackAr11.push((java.lang.Object)str18);
    java.lang.Object obj20 = stackAr11.top();
    boolean b21 = stackAr0.equals((java.lang.Object)stackAr11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[hi!]"+ "'", str7.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "[hi!]"+ "'", obj9.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[hi!]]"+ "'", str10.equals("[[hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[hi!]"+ "'", str18.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "[hi!]"+ "'", obj20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1.0d));
    java.lang.Object obj6 = stackAr0.pop();
    boolean b7 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr(0);
    java.lang.String str22 = stackAr21.toString();
    boolean b23 = stackAr21.isEmpty();
    boolean b24 = stackAr11.equals((java.lang.Object)stackAr21);
    boolean b25 = stackAr21.isFull();
    int i26 = stackAr21.size();
    boolean b27 = stackAr0.equals((java.lang.Object)stackAr21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1.0d)+ "'", obj6.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b22 = stackAr0.equals((java.lang.Object)(-1.0f));
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
    java.lang.String str24 = stackAr23.toString();
    int i25 = stackAr23.size();
    java.lang.String str26 = stackAr23.toString();
    stackAr23.push((java.lang.Object)(-1));
    java.lang.Object obj29 = stackAr23.top();
    boolean b30 = stackAr23.isFull();
    stackAr0.push((java.lang.Object)stackAr23);
    org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
    java.lang.String str33 = stackAr32.toString();
    int i34 = stackAr32.size();
    int i35 = stackAr32.size();
    boolean b36 = stackAr32.isFull();
    boolean b37 = stackAr23.equals((java.lang.Object)stackAr32);
    int i38 = stackAr32.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-1)+ "'", obj29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    boolean b2 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int)(byte)10);
    boolean b18 = stackAr17.isFull();
    java.lang.String str19 = stackAr17.toString();
    stackAr3.push((java.lang.Object)str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    java.lang.String str3 = stackAr1.toString();
    java.lang.String str4 = stackAr1.toString();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.Object obj11 = stackAr5.top();
    boolean b12 = stackAr5.isFull();
    java.lang.Object obj13 = stackAr5.pop();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    boolean b15 = stackAr14.isEmpty();
    boolean b16 = stackAr14.isEmpty();
    int i17 = stackAr14.size();
    boolean b18 = stackAr5.equals((java.lang.Object)stackAr14);
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr(0);
    java.lang.String str21 = stackAr20.toString();
    boolean b22 = stackAr20.isEmpty();
    boolean b23 = stackAr5.equals((java.lang.Object)b22);
    boolean b24 = stackAr1.equals((java.lang.Object)b22);
    java.lang.String str25 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b21 = stackAr0.isEmpty();
    java.lang.String str22 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[-1]"+ "'", str22.equals("[-1]"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)(short)(-1));
    java.lang.String str5 = stackAr1.toString();
    java.lang.Object obj6 = stackAr1.pop();
    boolean b7 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1]"+ "'", str5.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short)(-1)+ "'", obj6.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    int i2 = stackAr1.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    boolean b8 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    int i2 = stackAr1.size();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.String str9 = stackAr3.toString();
    java.lang.Object obj10 = stackAr3.pop();
    // The following exception was thrown during execution in test generation
    try {
    stackAr1.push(obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1]"+ "'", str9.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    stackAr3.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str10 = stackAr9.toString();
    boolean b11 = stackAr9.isEmpty();
    stackAr9.push((java.lang.Object)100.0f);
    boolean b14 = stackAr3.equals((java.lang.Object)stackAr9);
    boolean b15 = stackAr1.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    java.lang.String str17 = stackAr16.toString();
    int i18 = stackAr16.size();
    java.lang.String str19 = stackAr16.toString();
    stackAr16.push((java.lang.Object)(-1));
    java.lang.Object obj22 = stackAr16.top();
    boolean b23 = stackAr16.isFull();
    java.lang.Object obj24 = stackAr16.pop();
    org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
    boolean b26 = stackAr25.isEmpty();
    boolean b27 = stackAr25.isEmpty();
    int i28 = stackAr25.size();
    boolean b29 = stackAr16.equals((java.lang.Object)stackAr25);
    stackAr9.push((java.lang.Object)stackAr16);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj31 = stackAr16.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1)+ "'", obj22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1)+ "'", obj24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    java.lang.String str2 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    java.lang.Object obj12 = stackAr0.top();
    java.lang.Object obj13 = stackAr0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "hi!"+ "'", obj12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!"+ "'", obj13.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    int i5 = stackAr1.size();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    stackAr6.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str13 = stackAr12.toString();
    boolean b14 = stackAr12.isEmpty();
    stackAr12.push((java.lang.Object)100.0f);
    boolean b17 = stackAr6.equals((java.lang.Object)stackAr12);
    java.lang.Object obj18 = stackAr6.top();
    boolean b19 = stackAr1.equals(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!"+ "'", obj18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str11 = stackAr10.toString();
    boolean b12 = stackAr10.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    boolean b14 = stackAr13.isEmpty();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    stackAr15.push((java.lang.Object)"hi!");
    java.lang.String str20 = stackAr15.toString();
    stackAr13.push((java.lang.Object)str20);
    stackAr10.push((java.lang.Object)stackAr13);
    stackAr0.push((java.lang.Object)stackAr10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int)(byte)0);
    int i5 = stackAr4.size();
    boolean b6 = stackAr1.equals((java.lang.Object)stackAr4);
    boolean b7 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    boolean b9 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    java.lang.String str12 = stackAr0.toString();
    java.lang.String str13 = stackAr0.toString();
    int i14 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[hi!]"+ "'", str12.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[hi!]"+ "'", str13.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.String str11 = stackAr5.toString();
    java.lang.Object obj12 = stackAr5.pop();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1));
    java.lang.Object obj19 = stackAr13.top();
    stackAr5.push((java.lang.Object)stackAr13);
    java.lang.String str21 = stackAr13.toString();
    boolean b22 = stackAr13.isFull();
    stackAr1.push((java.lang.Object)b22);
    boolean b24 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1]"+ "'", str21.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int)'#');
    boolean b16 = stackAr15.isEmpty();
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
    java.lang.String str18 = stackAr17.toString();
    int i19 = stackAr17.size();
    stackAr17.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str24 = stackAr23.toString();
    boolean b25 = stackAr23.isEmpty();
    stackAr23.push((java.lang.Object)100.0f);
    boolean b28 = stackAr17.equals((java.lang.Object)stackAr23);
    boolean b29 = stackAr15.equals((java.lang.Object)b28);
    stackAr3.push((java.lang.Object)b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int)(byte)10);
    boolean b18 = stackAr17.isFull();
    stackAr17.push((java.lang.Object)'4');
    boolean b22 = stackAr17.equals((java.lang.Object)100.0d);
    java.lang.Object obj23 = stackAr17.top();
    java.lang.Object obj24 = stackAr17.pop();
    stackAr3.push(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '4'+ "'", obj23.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '4'+ "'", obj24.equals('4'));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    java.lang.String str3 = stackAr1.toString();
    boolean b4 = stackAr1.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.Object obj11 = stackAr5.top();
    boolean b12 = stackAr5.isFull();
    java.lang.Object obj13 = stackAr5.pop();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    boolean b15 = stackAr14.isEmpty();
    boolean b16 = stackAr14.isEmpty();
    int i17 = stackAr14.size();
    boolean b18 = stackAr5.equals((java.lang.Object)stackAr14);
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr(0);
    java.lang.String str21 = stackAr20.toString();
    boolean b22 = stackAr20.isEmpty();
    boolean b23 = stackAr5.equals((java.lang.Object)b22);
    boolean b24 = stackAr1.equals((java.lang.Object)b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    java.lang.Object obj16 = stackAr3.top();
    java.lang.Object obj17 = stackAr3.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    boolean b16 = stackAr3.isFull();
    int i17 = stackAr3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    boolean b4 = stackAr0.equals((java.lang.Object)(short)100);
    boolean b6 = stackAr0.equals((java.lang.Object)(byte)10);
    int i7 = stackAr0.size();
    int i8 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b21 = stackAr0.isEmpty();
    boolean b23 = stackAr0.equals((java.lang.Object)10L);
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    java.lang.String str25 = stackAr24.toString();
    int i26 = stackAr24.size();
    java.lang.String str27 = stackAr24.toString();
    stackAr24.push((java.lang.Object)(-1));
    boolean b31 = stackAr24.equals((java.lang.Object)'a');
    stackAr0.push((java.lang.Object)b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj14 = stackAr9.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    int i3 = stackAr0.size();
    boolean b4 = stackAr0.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    stackAr5.push((java.lang.Object)"hi!");
    java.lang.String str10 = stackAr5.toString();
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj12 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[hi!]"+ "'", str10.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int)(byte)10);
    boolean b6 = stackAr5.isFull();
    stackAr5.push((java.lang.Object)'4');
    int i9 = stackAr5.size();
    stackAr1.push((java.lang.Object)i9);
    java.lang.Object obj11 = stackAr1.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1+ "'", obj11.equals(1));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.String str11 = stackAr5.toString();
    java.lang.Object obj12 = stackAr5.pop();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1));
    java.lang.Object obj19 = stackAr13.top();
    stackAr5.push((java.lang.Object)stackAr13);
    java.lang.String str21 = stackAr13.toString();
    boolean b22 = stackAr13.isFull();
    stackAr1.push((java.lang.Object)b22);
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    boolean b25 = stackAr24.isEmpty();
    java.lang.String str26 = stackAr24.toString();
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
    java.lang.String str28 = stackAr27.toString();
    int i29 = stackAr27.size();
    java.lang.String str30 = stackAr27.toString();
    stackAr27.push((java.lang.Object)(-1));
    java.lang.Object obj33 = stackAr27.top();
    boolean b34 = stackAr24.equals((java.lang.Object)stackAr27);
    boolean b35 = stackAr27.isEmpty();
    org.autotest.StackAr stackAr37 = new org.autotest.StackAr(0);
    java.lang.String str38 = stackAr37.toString();
    boolean b39 = stackAr37.isEmpty();
    boolean b40 = stackAr27.equals((java.lang.Object)stackAr37);
    boolean b41 = stackAr37.isFull();
    boolean b42 = stackAr1.equals((java.lang.Object)b41);
    java.lang.Object obj43 = stackAr1.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1]"+ "'", str21.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1)+ "'", obj33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false+ "'", obj43.equals(false));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b21 = stackAr0.isEmpty();
    boolean b23 = stackAr0.equals((java.lang.Object)10L);
    java.lang.String str24 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[-1]"+ "'", str24.equals("[-1]"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr(0);
    java.lang.String str14 = stackAr13.toString();
    boolean b15 = stackAr13.isEmpty();
    boolean b16 = stackAr3.equals((java.lang.Object)stackAr13);
    boolean b17 = stackAr13.isFull();
    java.lang.String str18 = stackAr13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.String str11 = stackAr5.toString();
    java.lang.Object obj12 = stackAr5.pop();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1));
    java.lang.Object obj19 = stackAr13.top();
    stackAr5.push((java.lang.Object)stackAr13);
    java.lang.String str21 = stackAr13.toString();
    boolean b22 = stackAr13.isFull();
    stackAr1.push((java.lang.Object)b22);
    java.lang.Object obj24 = stackAr1.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1]"+ "'", str21.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false+ "'", obj24.equals(false));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    boolean b4 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)10);
    java.lang.String str2 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    int i3 = stackAr0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr(0);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    boolean b18 = stackAr0.equals((java.lang.Object)b17);
    int i19 = stackAr0.size();
    java.lang.String str20 = stackAr0.toString();
    boolean b21 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    boolean b3 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    java.lang.Object obj7 = stackAr1.top();
    java.lang.Object obj8 = stackAr1.pop();
    boolean b9 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4'+ "'", obj7.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    java.lang.String str17 = stackAr16.toString();
    int i18 = stackAr16.size();
    stackAr16.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str23 = stackAr22.toString();
    boolean b24 = stackAr22.isEmpty();
    stackAr22.push((java.lang.Object)100.0f);
    boolean b27 = stackAr16.equals((java.lang.Object)stackAr22);
    boolean b28 = stackAr16.isFull();
    org.autotest.StackAr stackAr30 = new org.autotest.StackAr(0);
    java.lang.String str31 = stackAr30.toString();
    boolean b32 = stackAr30.isEmpty();
    stackAr16.push((java.lang.Object)stackAr30);
    boolean b34 = stackAr3.equals((java.lang.Object)stackAr30);
    int i35 = stackAr30.size();
    boolean b36 = stackAr30.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    int i14 = stackAr3.size();
    java.lang.Object obj15 = stackAr3.pop();
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    java.lang.String str17 = stackAr16.toString();
    int i18 = stackAr16.size();
    java.lang.String str19 = stackAr16.toString();
    stackAr16.push((java.lang.Object)(-1));
    java.lang.Object obj22 = stackAr16.top();
    boolean b23 = stackAr16.isFull();
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    boolean b25 = stackAr24.isEmpty();
    java.lang.String str26 = stackAr24.toString();
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
    java.lang.String str28 = stackAr27.toString();
    int i29 = stackAr27.size();
    java.lang.String str30 = stackAr27.toString();
    stackAr27.push((java.lang.Object)(-1));
    java.lang.Object obj33 = stackAr27.top();
    boolean b34 = stackAr24.equals((java.lang.Object)stackAr27);
    boolean b35 = stackAr27.isEmpty();
    boolean b36 = stackAr16.equals((java.lang.Object)b35);
    boolean b37 = stackAr16.isEmpty();
    boolean b38 = stackAr3.equals((java.lang.Object)b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1)+ "'", obj22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1)+ "'", obj33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    int i14 = stackAr3.size();
    java.lang.Object obj15 = stackAr3.top();
    boolean b16 = stackAr3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    java.lang.String str3 = stackAr1.toString();
    boolean b4 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    int i12 = stackAr6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    java.lang.Object obj16 = stackAr3.top();
    boolean b17 = stackAr3.isEmpty();
    java.lang.Object obj18 = stackAr3.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1)+ "'", obj18.equals((-1)));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    // The following exception was thrown during execution in test generation
    try {
    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    boolean b6 = stackAr1.equals((java.lang.Object)100.0f);
    boolean b7 = stackAr1.isFull();
    java.lang.String str8 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr12.isFull();
    boolean b15 = stackAr12.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    java.lang.String str12 = stackAr0.toString();
    java.lang.String str13 = stackAr0.toString();
    java.lang.Object obj14 = stackAr0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[hi!]"+ "'", str12.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[hi!]"+ "'", str13.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!"+ "'", obj14.equals("hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr(0);
    java.lang.String str9 = stackAr8.toString();
    java.lang.String str10 = stackAr8.toString();
    java.lang.String str11 = stackAr8.toString();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    java.lang.String str15 = stackAr12.toString();
    stackAr12.push((java.lang.Object)(-1));
    java.lang.Object obj18 = stackAr12.top();
    boolean b19 = stackAr12.isFull();
    java.lang.Object obj20 = stackAr12.pop();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    boolean b22 = stackAr21.isEmpty();
    boolean b23 = stackAr21.isEmpty();
    int i24 = stackAr21.size();
    boolean b25 = stackAr12.equals((java.lang.Object)stackAr21);
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr(0);
    java.lang.String str28 = stackAr27.toString();
    boolean b29 = stackAr27.isEmpty();
    boolean b30 = stackAr12.equals((java.lang.Object)b29);
    boolean b31 = stackAr8.equals((java.lang.Object)b29);
    boolean b32 = stackAr0.equals((java.lang.Object)b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1)+ "'", obj18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1)+ "'", obj20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    boolean b3 = stackAr0.equals((java.lang.Object)1);
    boolean b5 = stackAr0.equals((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    java.lang.String str6 = stackAr1.toString();
    java.lang.Object obj7 = stackAr1.pop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100.0]"+ "'", str6.equals("[100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100.0f+ "'", obj7.equals(100.0f));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    java.lang.String str12 = stackAr0.toString();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int)(byte)10);
    boolean b15 = stackAr14.isFull();
    stackAr14.push((java.lang.Object)'4');
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str20 = stackAr19.toString();
    boolean b21 = stackAr19.isEmpty();
    org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
    boolean b23 = stackAr22.isEmpty();
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    java.lang.String str25 = stackAr24.toString();
    int i26 = stackAr24.size();
    stackAr24.push((java.lang.Object)"hi!");
    java.lang.String str29 = stackAr24.toString();
    stackAr22.push((java.lang.Object)str29);
    stackAr19.push((java.lang.Object)stackAr22);
    boolean b32 = stackAr14.equals((java.lang.Object)stackAr22);
    stackAr0.push((java.lang.Object)stackAr14);
    boolean b34 = stackAr14.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[hi!]"+ "'", str12.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[hi!]"+ "'", str29.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b21 = stackAr0.isEmpty();
    int i22 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    boolean b2 = stackAr1.isEmpty();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stackAr1.push((java.lang.Object)"[-1]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    boolean b14 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int)(byte)0);
    int i5 = stackAr4.size();
    boolean b6 = stackAr1.equals((java.lang.Object)stackAr4);
    boolean b7 = stackAr1.isEmpty();
    boolean b8 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    int i14 = stackAr3.size();
    java.lang.Object obj15 = stackAr3.pop();
    java.lang.Object obj16 = stackAr3.top();
    boolean b17 = stackAr3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'a');
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr(1);
    stackAr1.push((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    boolean b12 = stackAr0.isFull();
    int i13 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    stackAr3.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str10 = stackAr9.toString();
    boolean b11 = stackAr9.isEmpty();
    stackAr9.push((java.lang.Object)100.0f);
    boolean b14 = stackAr3.equals((java.lang.Object)stackAr9);
    boolean b15 = stackAr1.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    java.lang.String str17 = stackAr16.toString();
    int i18 = stackAr16.size();
    java.lang.String str19 = stackAr16.toString();
    stackAr16.push((java.lang.Object)(-1));
    java.lang.Object obj22 = stackAr16.top();
    boolean b23 = stackAr16.isFull();
    java.lang.Object obj24 = stackAr16.pop();
    org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
    boolean b26 = stackAr25.isEmpty();
    boolean b27 = stackAr25.isEmpty();
    int i28 = stackAr25.size();
    boolean b29 = stackAr16.equals((java.lang.Object)stackAr25);
    stackAr9.push((java.lang.Object)stackAr16);
    boolean b31 = stackAr16.isEmpty();
    org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
    boolean b33 = stackAr32.isEmpty();
    java.lang.String str34 = stackAr32.toString();
    java.lang.Object obj35 = null;
    stackAr32.push(obj35);
    stackAr16.push(obj35);
    java.lang.Object obj38 = stackAr16.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1)+ "'", obj22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1)+ "'", obj24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr(0);
    java.lang.String str14 = stackAr13.toString();
    boolean b15 = stackAr13.isEmpty();
    boolean b16 = stackAr3.equals((java.lang.Object)stackAr13);
    boolean b17 = stackAr13.isFull();
    int i18 = stackAr13.size();
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
    boolean b20 = stackAr19.isEmpty();
    java.lang.String str21 = stackAr19.toString();
    java.lang.Object obj22 = null;
    stackAr19.push(obj22);
    boolean b24 = stackAr13.equals(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    java.lang.Object obj13 = stackAr7.top();
    boolean b14 = stackAr7.isFull();
    java.lang.String str15 = stackAr7.toString();
    boolean b16 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)stackAr7);
    java.lang.Object obj18 = stackAr0.pop();
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
    java.lang.String str20 = stackAr19.toString();
    int i21 = stackAr19.size();
    stackAr19.push((java.lang.Object)"hi!");
    java.lang.String str24 = stackAr19.toString();
    java.lang.Object obj25 = stackAr19.top();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    int i28 = stackAr26.size();
    java.lang.String str29 = stackAr26.toString();
    stackAr26.push((java.lang.Object)(-1));
    java.lang.Object obj32 = stackAr26.top();
    boolean b33 = stackAr26.isFull();
    java.lang.String str34 = stackAr26.toString();
    boolean b35 = stackAr26.isFull();
    stackAr19.push((java.lang.Object)stackAr26);
    java.lang.Object obj37 = stackAr19.top();
    int i38 = stackAr19.size();
    stackAr0.push((java.lang.Object)i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1]"+ "'", str15.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[hi!]"+ "'", str24.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (-1)+ "'", obj32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[-1]"+ "'", str34.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 2);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)(short)(-1));
    java.lang.String str5 = stackAr1.toString();
    java.lang.Object obj6 = stackAr1.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1]"+ "'", str5.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short)(-1)+ "'", obj6.equals((short)(-1)));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    int i2 = stackAr1.size();
    boolean b3 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr(0);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    boolean b18 = stackAr0.equals((java.lang.Object)b17);
    int i19 = stackAr0.size();
    boolean b20 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    boolean b3 = stackAr0.isFull();
    int i4 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isEmpty();
    boolean b7 = stackAr0.equals((java.lang.Object)"[-1,[]]");
    boolean b8 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    int i11 = stackAr3.size();
    java.lang.Object obj12 = null;
    stackAr3.push(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b22 = stackAr0.equals((java.lang.Object)(-1.0f));
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
    java.lang.String str24 = stackAr23.toString();
    int i25 = stackAr23.size();
    java.lang.String str26 = stackAr23.toString();
    stackAr23.push((java.lang.Object)(-1));
    java.lang.Object obj29 = stackAr23.top();
    boolean b30 = stackAr23.isFull();
    stackAr0.push((java.lang.Object)stackAr23);
    boolean b32 = stackAr23.isFull();
    java.lang.Object obj33 = stackAr23.pop();
    boolean b35 = stackAr23.equals((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-1)+ "'", obj29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1)+ "'", obj33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    java.lang.Object obj12 = stackAr0.top();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1.0d));
    java.lang.Object obj19 = stackAr13.pop();
    java.lang.Object obj20 = null;
    boolean b21 = stackAr13.equals(obj20);
    boolean b22 = stackAr0.equals((java.lang.Object)b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "hi!"+ "'", obj12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0d)+ "'", obj19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    boolean b9 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.String str11 = stackAr5.toString();
    java.lang.Object obj12 = stackAr5.pop();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1));
    java.lang.Object obj19 = stackAr13.top();
    stackAr5.push((java.lang.Object)stackAr13);
    java.lang.String str21 = stackAr13.toString();
    boolean b22 = stackAr13.isFull();
    stackAr1.push((java.lang.Object)b22);
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    boolean b25 = stackAr24.isEmpty();
    java.lang.String str26 = stackAr24.toString();
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
    java.lang.String str28 = stackAr27.toString();
    int i29 = stackAr27.size();
    java.lang.String str30 = stackAr27.toString();
    stackAr27.push((java.lang.Object)(-1));
    java.lang.Object obj33 = stackAr27.top();
    boolean b34 = stackAr24.equals((java.lang.Object)stackAr27);
    boolean b35 = stackAr27.isEmpty();
    org.autotest.StackAr stackAr37 = new org.autotest.StackAr(0);
    java.lang.String str38 = stackAr37.toString();
    boolean b39 = stackAr37.isEmpty();
    boolean b40 = stackAr27.equals((java.lang.Object)stackAr37);
    boolean b41 = stackAr37.isFull();
    boolean b42 = stackAr1.equals((java.lang.Object)b41);
    boolean b43 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1]"+ "'", str21.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1)+ "'", obj33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'#');
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    java.lang.String str11 = stackAr0.toString();
    boolean b13 = stackAr0.equals((java.lang.Object)100.0f);
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    boolean b15 = stackAr14.isEmpty();
    java.lang.String str16 = stackAr14.toString();
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
    java.lang.String str18 = stackAr17.toString();
    int i19 = stackAr17.size();
    java.lang.String str20 = stackAr17.toString();
    stackAr17.push((java.lang.Object)(-1));
    java.lang.Object obj23 = stackAr17.top();
    boolean b24 = stackAr14.equals((java.lang.Object)stackAr17);
    boolean b25 = stackAr17.isEmpty();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    stackAr17.push((java.lang.Object)stackAr26);
    boolean b28 = stackAr17.isEmpty();
    boolean b29 = stackAr17.isFull();
    org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
    boolean b31 = stackAr30.isEmpty();
    java.lang.String str32 = stackAr30.toString();
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    java.lang.String str34 = stackAr33.toString();
    int i35 = stackAr33.size();
    java.lang.String str36 = stackAr33.toString();
    stackAr33.push((java.lang.Object)(-1));
    java.lang.Object obj39 = stackAr33.top();
    boolean b40 = stackAr30.equals((java.lang.Object)stackAr33);
    boolean b41 = stackAr33.isEmpty();
    org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
    stackAr33.push((java.lang.Object)stackAr42);
    int i44 = stackAr33.size();
    boolean b45 = stackAr17.equals((java.lang.Object)stackAr33);
    java.lang.Object obj46 = stackAr33.top();
    java.lang.Object obj47 = stackAr33.top();
    stackAr0.push(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (-1)+ "'", obj23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1)+ "'", obj39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj47);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    boolean b6 = stackAr1.equals((java.lang.Object)100.0f);
    java.lang.String str7 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    stackAr11.push((java.lang.Object)"hi!");
    java.lang.String str16 = stackAr11.toString();
    stackAr9.push((java.lang.Object)str16);
    stackAr6.push((java.lang.Object)stackAr9);
    boolean b19 = stackAr1.equals((java.lang.Object)stackAr9);
    boolean b20 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[hi!]"+ "'", str16.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'4');

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)(short)(-1));
    java.lang.Object obj5 = stackAr1.top();
    boolean b6 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short)(-1)+ "'", obj5.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1.0d));
    java.lang.Object obj6 = stackAr0.pop();
    int i7 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1.0d)+ "'", obj6.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1.0d));
    java.lang.Object obj6 = stackAr0.pop();
    java.lang.Object obj7 = null;
    boolean b8 = stackAr0.equals(obj7);
    boolean b9 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1.0d)+ "'", obj6.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
    boolean b5 = stackAr4.isEmpty();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    stackAr6.push((java.lang.Object)"hi!");
    java.lang.String str11 = stackAr6.toString();
    stackAr4.push((java.lang.Object)str11);
    stackAr1.push((java.lang.Object)stackAr4);
    boolean b14 = stackAr4.isFull();
    java.lang.Object obj15 = stackAr4.top();
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    boolean b17 = stackAr16.isEmpty();
    java.lang.String str18 = stackAr16.toString();
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
    java.lang.String str20 = stackAr19.toString();
    int i21 = stackAr19.size();
    java.lang.String str22 = stackAr19.toString();
    stackAr19.push((java.lang.Object)(-1));
    java.lang.Object obj25 = stackAr19.top();
    boolean b26 = stackAr16.equals((java.lang.Object)stackAr19);
    boolean b27 = stackAr19.isEmpty();
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
    stackAr19.push((java.lang.Object)stackAr28);
    org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str32 = stackAr31.toString();
    boolean b33 = stackAr31.isEmpty();
    stackAr31.push((java.lang.Object)100.0f);
    boolean b36 = stackAr31.isFull();
    boolean b37 = stackAr19.equals((java.lang.Object)stackAr31);
    boolean b38 = stackAr4.equals((java.lang.Object)b37);
    boolean b39 = stackAr4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[hi!]"+ "'", str11.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "[hi!]"+ "'", obj15.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1)+ "'", obj25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.Object obj5 = stackAr0.pop();
    boolean b6 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr(0);
    java.lang.String str9 = stackAr8.toString();
    java.lang.String str10 = stackAr8.toString();
    boolean b11 = stackAr8.isEmpty();
    boolean b12 = stackAr0.equals((java.lang.Object)stackAr8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(100);
    java.lang.Object obj2 = null;
    stackAr1.push(obj2);
    boolean b4 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    int i3 = stackAr0.size();
    boolean b4 = stackAr0.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    stackAr5.push((java.lang.Object)"hi!");
    java.lang.String str10 = stackAr5.toString();
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr5);
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    boolean b13 = stackAr12.isEmpty();
    java.lang.String str14 = stackAr12.toString();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    java.lang.String str18 = stackAr15.toString();
    stackAr15.push((java.lang.Object)(-1));
    java.lang.Object obj21 = stackAr15.top();
    boolean b22 = stackAr12.equals((java.lang.Object)stackAr15);
    boolean b23 = stackAr15.isEmpty();
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    stackAr15.push((java.lang.Object)stackAr24);
    int i26 = stackAr15.size();
    java.lang.Object obj27 = stackAr15.pop();
    java.lang.Object obj28 = stackAr15.top();
    java.lang.Object obj29 = stackAr15.pop();
    org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int)(byte)0);
    int i32 = stackAr31.size();
    stackAr15.push((java.lang.Object)i32);
    boolean b34 = stackAr5.equals((java.lang.Object)stackAr15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[hi!]"+ "'", str10.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (-1)+ "'", obj21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (-1)+ "'", obj28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-1)+ "'", obj29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    boolean b2 = stackAr1.isEmpty();
    java.lang.String str3 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
    java.lang.String str3 = stackAr2.toString();
    int i4 = stackAr2.size();
    stackAr2.push((java.lang.Object)"hi!");
    java.lang.String str7 = stackAr2.toString();
    stackAr0.push((java.lang.Object)str7);
    java.lang.Object obj9 = stackAr0.top();
    java.lang.String str10 = stackAr0.toString();
    java.lang.String str11 = stackAr0.toString();
    boolean b12 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[hi!]"+ "'", str7.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "[hi!]"+ "'", obj9.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[hi!]]"+ "'", str10.equals("[[hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[[hi!]]"+ "'", str11.equals("[[hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    boolean b3 = stackAr0.isEmpty();
    boolean b4 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)'#');
    boolean b7 = stackAr0.equals((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    java.lang.Object obj13 = stackAr7.top();
    boolean b14 = stackAr7.isFull();
    java.lang.String str15 = stackAr7.toString();
    boolean b16 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)stackAr7);
    boolean b18 = stackAr7.isFull();
    java.lang.Object obj19 = stackAr7.pop();
    int i20 = stackAr7.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1]"+ "'", str15.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    java.lang.Object obj16 = stackAr3.top();
    int i17 = stackAr3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)100);
    boolean b2 = stackAr1.isEmpty();
    java.lang.String str3 = stackAr1.toString();
    boolean b4 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    boolean b6 = stackAr1.isEmpty();
    java.lang.String str7 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[100.0]"+ "'", str7.equals("[100.0]"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)100.0f);
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr6);
    boolean b12 = stackAr0.isFull();
    boolean b13 = stackAr0.isFull();
    java.lang.Object obj14 = stackAr0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!"+ "'", obj14.equals("hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)(short)(-1));
    java.lang.Object obj5 = stackAr1.top();
    java.lang.String str6 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short)(-1)+ "'", obj5.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    int i14 = stackAr3.size();
    java.lang.Object obj15 = stackAr3.top();
    boolean b16 = stackAr3.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    java.lang.Object obj13 = stackAr7.top();
    boolean b14 = stackAr7.isFull();
    java.lang.String str15 = stackAr7.toString();
    boolean b16 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)stackAr7);
    java.lang.Object obj18 = stackAr0.pop();
    boolean b19 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1]"+ "'", str15.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr(0);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    boolean b18 = stackAr0.equals((java.lang.Object)b17);
    int i19 = stackAr0.size();
    java.lang.String str20 = stackAr0.toString();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    java.lang.String str24 = stackAr21.toString();
    stackAr21.push((java.lang.Object)(-1));
    java.lang.String str27 = stackAr21.toString();
    java.lang.Object obj28 = stackAr21.pop();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    java.lang.String str30 = stackAr29.toString();
    int i31 = stackAr29.size();
    java.lang.String str32 = stackAr29.toString();
    stackAr29.push((java.lang.Object)(-1));
    java.lang.Object obj35 = stackAr29.top();
    stackAr21.push((java.lang.Object)stackAr29);
    java.lang.String str37 = stackAr29.toString();
    stackAr0.push((java.lang.Object)str37);
    boolean b39 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[-1]"+ "'", str27.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (-1)+ "'", obj28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (-1)+ "'", obj35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[-1]"+ "'", str37.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)' ');

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    java.lang.Object obj15 = stackAr3.pop();
    java.lang.Object obj16 = stackAr3.top();
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str19 = stackAr18.toString();
    boolean b20 = stackAr18.isEmpty();
    stackAr3.push((java.lang.Object)stackAr18);
    java.lang.Object obj22 = stackAr3.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    boolean b2 = stackAr0.isEmpty();
    int i3 = stackAr0.size();
    int i4 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    java.lang.String str12 = stackAr3.toString();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    stackAr13.push((java.lang.Object)"hi!");
    java.lang.String str18 = stackAr13.toString();
    java.lang.Object obj19 = stackAr13.top();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    int i22 = stackAr20.size();
    java.lang.String str23 = stackAr20.toString();
    stackAr20.push((java.lang.Object)(-1));
    java.lang.Object obj26 = stackAr20.top();
    boolean b27 = stackAr20.isFull();
    java.lang.String str28 = stackAr20.toString();
    boolean b29 = stackAr20.isFull();
    stackAr13.push((java.lang.Object)stackAr20);
    java.lang.Object obj31 = stackAr13.top();
    int i32 = stackAr13.size();
    stackAr3.push((java.lang.Object)stackAr13);
    boolean b34 = stackAr13.isFull();
    int i35 = stackAr13.size();
    boolean b36 = stackAr13.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1]"+ "'", str12.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[hi!]"+ "'", str18.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1)+ "'", obj26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[-1]"+ "'", str28.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    java.lang.Object obj13 = stackAr7.top();
    boolean b14 = stackAr7.isFull();
    java.lang.String str15 = stackAr7.toString();
    boolean b16 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)stackAr7);
    boolean b18 = stackAr7.isFull();
    boolean b19 = stackAr7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1]"+ "'", str15.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'#');
    java.lang.String str2 = stackAr1.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = stackAr1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b21 = stackAr0.isEmpty();
    boolean b23 = stackAr0.equals((java.lang.Object)10L);
    int i24 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr3.isEmpty();
    boolean b15 = stackAr3.isFull();
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    boolean b17 = stackAr16.isEmpty();
    java.lang.String str18 = stackAr16.toString();
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
    java.lang.String str20 = stackAr19.toString();
    int i21 = stackAr19.size();
    java.lang.String str22 = stackAr19.toString();
    stackAr19.push((java.lang.Object)(-1));
    java.lang.Object obj25 = stackAr19.top();
    boolean b26 = stackAr16.equals((java.lang.Object)stackAr19);
    boolean b27 = stackAr19.isEmpty();
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
    stackAr19.push((java.lang.Object)stackAr28);
    int i30 = stackAr19.size();
    boolean b31 = stackAr3.equals((java.lang.Object)stackAr19);
    int i32 = stackAr3.size();
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    boolean b34 = stackAr33.isEmpty();
    java.lang.String str35 = stackAr33.toString();
    java.lang.Object obj36 = null;
    stackAr33.push(obj36);
    org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
    boolean b39 = stackAr38.isEmpty();
    java.lang.String str40 = stackAr38.toString();
    boolean b41 = stackAr38.isEmpty();
    int i42 = stackAr38.size();
    org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
    int i44 = stackAr43.size();
    stackAr38.push((java.lang.Object)i44);
    boolean b46 = stackAr33.equals((java.lang.Object)i44);
    stackAr3.push((java.lang.Object)i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1)+ "'", obj25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.Object obj10 = stackAr0.pop();
    boolean b11 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "hi!"+ "'", obj10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    java.lang.Object obj13 = stackAr7.top();
    boolean b14 = stackAr7.isFull();
    java.lang.String str15 = stackAr7.toString();
    boolean b16 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)stackAr7);
    boolean b18 = stackAr7.isFull();
    java.lang.Object obj19 = stackAr7.pop();
    boolean b20 = stackAr7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1]"+ "'", str15.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr(0);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    boolean b18 = stackAr0.equals((java.lang.Object)b17);
    int i19 = stackAr0.size();
    java.lang.String str20 = stackAr0.toString();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    java.lang.String str24 = stackAr21.toString();
    stackAr21.push((java.lang.Object)(-1));
    java.lang.String str27 = stackAr21.toString();
    java.lang.Object obj28 = stackAr21.pop();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    java.lang.String str30 = stackAr29.toString();
    int i31 = stackAr29.size();
    java.lang.String str32 = stackAr29.toString();
    stackAr29.push((java.lang.Object)(-1));
    java.lang.Object obj35 = stackAr29.top();
    stackAr21.push((java.lang.Object)stackAr29);
    java.lang.String str37 = stackAr29.toString();
    stackAr0.push((java.lang.Object)str37);
    int i39 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[-1]"+ "'", str27.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (-1)+ "'", obj28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (-1)+ "'", obj35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[-1]"+ "'", str37.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    int i14 = stackAr3.size();
    java.lang.Object obj15 = stackAr3.pop();
    java.lang.Object obj16 = stackAr3.top();
    java.lang.Object obj17 = stackAr3.pop();
    stackAr3.push((java.lang.Object)(short)0);
    java.lang.Object obj20 = stackAr3.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short)0+ "'", obj20.equals((short)0));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    java.lang.Object obj7 = stackAr0.pop();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    java.lang.String str11 = stackAr8.toString();
    stackAr8.push((java.lang.Object)(-1));
    java.lang.Object obj14 = stackAr8.top();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.String str16 = stackAr8.toString();
    boolean b17 = stackAr8.isFull();
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    boolean b25 = stackAr18.isFull();
    java.lang.Object obj26 = stackAr18.pop();
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
    boolean b28 = stackAr27.isEmpty();
    boolean b29 = stackAr27.isEmpty();
    int i30 = stackAr27.size();
    boolean b31 = stackAr18.equals((java.lang.Object)stackAr27);
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr(0);
    java.lang.String str34 = stackAr33.toString();
    boolean b35 = stackAr33.isEmpty();
    boolean b36 = stackAr18.equals((java.lang.Object)b35);
    int i37 = stackAr18.size();
    java.lang.String str38 = stackAr18.toString();
    org.autotest.StackAr stackAr39 = new org.autotest.StackAr();
    java.lang.String str40 = stackAr39.toString();
    int i41 = stackAr39.size();
    java.lang.String str42 = stackAr39.toString();
    stackAr39.push((java.lang.Object)(-1));
    java.lang.Object obj45 = stackAr39.top();
    boolean b46 = stackAr39.isFull();
    java.lang.Object obj47 = stackAr39.pop();
    org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
    boolean b49 = stackAr48.isEmpty();
    boolean b50 = stackAr48.isEmpty();
    int i51 = stackAr48.size();
    boolean b52 = stackAr39.equals((java.lang.Object)stackAr48);
    org.autotest.StackAr stackAr54 = new org.autotest.StackAr(0);
    java.lang.String str55 = stackAr54.toString();
    boolean b56 = stackAr54.isEmpty();
    boolean b57 = stackAr39.equals((java.lang.Object)b56);
    int i58 = stackAr39.size();
    stackAr18.push((java.lang.Object)i58);
    org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int)(short)100);
    boolean b62 = stackAr61.isEmpty();
    java.lang.String str63 = stackAr61.toString();
    stackAr18.push((java.lang.Object)stackAr61);
    stackAr8.push((java.lang.Object)stackAr61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1)+ "'", obj14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1]"+ "'", str16.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1)+ "'", obj24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1)+ "'", obj26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]"+ "'", str42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1)+ "'", obj45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (-1)+ "'", obj47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]"+ "'", str55.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[]"+ "'", str63.equals("[]"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)10);
    boolean b2 = stackAr1.isEmpty();
    java.lang.String str3 = stackAr1.toString();
    java.lang.String str4 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr12.isEmpty();
    java.lang.String str15 = stackAr12.toString();
    boolean b16 = stackAr12.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    java.lang.Object obj8 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b11 = stackAr9.isEmpty();
    int i12 = stackAr9.size();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr(0);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    boolean b18 = stackAr0.equals((java.lang.Object)b17);
    int i19 = stackAr0.size();
    java.lang.String str20 = stackAr0.toString();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    stackAr21.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str28 = stackAr27.toString();
    boolean b29 = stackAr27.isEmpty();
    stackAr27.push((java.lang.Object)100.0f);
    boolean b32 = stackAr21.equals((java.lang.Object)stackAr27);
    boolean b33 = stackAr21.isFull();
    org.autotest.StackAr stackAr35 = new org.autotest.StackAr(0);
    java.lang.String str36 = stackAr35.toString();
    boolean b37 = stackAr35.isEmpty();
    stackAr21.push((java.lang.Object)stackAr35);
    stackAr0.push((java.lang.Object)stackAr21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    boolean b6 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int)(short)10);
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)1);
    org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
    boolean b3 = stackAr2.isEmpty();
    java.lang.String str4 = stackAr2.toString();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.Object obj11 = stackAr5.top();
    boolean b12 = stackAr2.equals((java.lang.Object)stackAr5);
    boolean b13 = stackAr5.isEmpty();
    java.lang.String str14 = stackAr5.toString();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    stackAr15.push((java.lang.Object)"hi!");
    java.lang.String str20 = stackAr15.toString();
    java.lang.Object obj21 = stackAr15.top();
    org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
    java.lang.String str23 = stackAr22.toString();
    int i24 = stackAr22.size();
    java.lang.String str25 = stackAr22.toString();
    stackAr22.push((java.lang.Object)(-1));
    java.lang.Object obj28 = stackAr22.top();
    boolean b29 = stackAr22.isFull();
    java.lang.String str30 = stackAr22.toString();
    boolean b31 = stackAr22.isFull();
    stackAr15.push((java.lang.Object)stackAr22);
    java.lang.Object obj33 = stackAr15.top();
    int i34 = stackAr15.size();
    stackAr5.push((java.lang.Object)stackAr15);
    stackAr1.push((java.lang.Object)stackAr15);
    java.lang.Object obj37 = stackAr15.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1]"+ "'", str14.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!"+ "'", obj21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (-1)+ "'", obj28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[-1]"+ "'", str30.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj37);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    java.lang.Object obj7 = stackAr0.pop();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    java.lang.String str11 = stackAr8.toString();
    stackAr8.push((java.lang.Object)(-1));
    java.lang.Object obj14 = stackAr8.top();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.String str16 = stackAr8.toString();
    boolean b17 = stackAr8.isFull();
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    boolean b19 = stackAr18.isEmpty();
    java.lang.String str20 = stackAr18.toString();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    java.lang.String str24 = stackAr21.toString();
    stackAr21.push((java.lang.Object)(-1));
    java.lang.Object obj27 = stackAr21.top();
    boolean b28 = stackAr18.equals((java.lang.Object)stackAr21);
    boolean b29 = stackAr21.isEmpty();
    org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
    stackAr21.push((java.lang.Object)stackAr30);
    boolean b32 = stackAr21.isEmpty();
    boolean b33 = stackAr21.isFull();
    org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
    boolean b35 = stackAr34.isEmpty();
    java.lang.String str36 = stackAr34.toString();
    org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
    java.lang.String str38 = stackAr37.toString();
    int i39 = stackAr37.size();
    java.lang.String str40 = stackAr37.toString();
    stackAr37.push((java.lang.Object)(-1));
    java.lang.Object obj43 = stackAr37.top();
    boolean b44 = stackAr34.equals((java.lang.Object)stackAr37);
    boolean b45 = stackAr37.isEmpty();
    org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
    stackAr37.push((java.lang.Object)stackAr46);
    int i48 = stackAr37.size();
    boolean b49 = stackAr21.equals((java.lang.Object)stackAr37);
    boolean b50 = stackAr8.equals((java.lang.Object)stackAr37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1)+ "'", obj14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1]"+ "'", str16.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1)+ "'", obj27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (-1)+ "'", obj43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str16 = stackAr15.toString();
    boolean b17 = stackAr15.isEmpty();
    stackAr15.push((java.lang.Object)100.0f);
    boolean b20 = stackAr15.isFull();
    boolean b21 = stackAr3.equals((java.lang.Object)stackAr15);
    int i22 = stackAr15.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    java.lang.Object obj7 = stackAr0.pop();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    java.lang.String str11 = stackAr8.toString();
    stackAr8.push((java.lang.Object)(-1));
    java.lang.Object obj14 = stackAr8.top();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.Object obj16 = stackAr0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1)+ "'", obj14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
    java.lang.String str2 = stackAr1.toString();
    java.lang.String str3 = stackAr1.toString();
    boolean b4 = stackAr1.isEmpty();
    int i5 = stackAr1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str7 = stackAr6.toString();
    boolean b8 = stackAr6.isEmpty();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    stackAr11.push((java.lang.Object)"hi!");
    java.lang.String str16 = stackAr11.toString();
    stackAr9.push((java.lang.Object)str16);
    stackAr6.push((java.lang.Object)stackAr9);
    boolean b19 = stackAr1.equals((java.lang.Object)stackAr9);
    java.lang.Object obj20 = stackAr1.top();
    java.lang.String str21 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[hi!]"+ "'", str16.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + '4'+ "'", obj20.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[4]"+ "'", str21.equals("[4]"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    java.lang.Object obj14 = stackAr3.pop();
    java.lang.Object obj15 = stackAr3.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1)+ "'", obj15.equals((-1)));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    int i7 = stackAr1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    java.lang.Object obj7 = stackAr0.pop();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    java.lang.String str11 = stackAr8.toString();
    stackAr8.push((java.lang.Object)(-1));
    java.lang.Object obj14 = stackAr8.top();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.String str16 = stackAr8.toString();
    boolean b17 = stackAr8.isFull();
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str20 = stackAr19.toString();
    boolean b21 = stackAr19.isEmpty();
    boolean b22 = stackAr19.isFull();
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
    boolean b24 = stackAr23.isEmpty();
    java.lang.String str25 = stackAr23.toString();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    int i28 = stackAr26.size();
    java.lang.String str29 = stackAr26.toString();
    stackAr26.push((java.lang.Object)(-1));
    java.lang.Object obj32 = stackAr26.top();
    boolean b33 = stackAr23.equals((java.lang.Object)stackAr26);
    java.lang.Object obj34 = stackAr26.top();
    java.lang.String str35 = stackAr26.toString();
    stackAr19.push((java.lang.Object)str35);
    stackAr8.push((java.lang.Object)stackAr19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1)+ "'", obj14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1]"+ "'", str16.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (-1)+ "'", obj32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1)+ "'", obj34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[-1]"+ "'", str35.equals("[-1]"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    stackAr3.push((java.lang.Object)stackAr12);
    boolean b14 = stackAr12.isEmpty();
    java.lang.String str15 = stackAr12.toString();
    stackAr12.push((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    java.lang.String str12 = stackAr11.toString();
    int i13 = stackAr11.size();
    java.lang.String str14 = stackAr11.toString();
    stackAr11.push((java.lang.Object)(-1));
    java.lang.Object obj17 = stackAr11.top();
    boolean b18 = stackAr8.equals((java.lang.Object)stackAr11);
    boolean b19 = stackAr11.isEmpty();
    boolean b20 = stackAr0.equals((java.lang.Object)b19);
    boolean b22 = stackAr0.equals((java.lang.Object)(-1.0f));
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
    java.lang.String str24 = stackAr23.toString();
    int i25 = stackAr23.size();
    java.lang.String str26 = stackAr23.toString();
    stackAr23.push((java.lang.Object)(-1));
    java.lang.Object obj29 = stackAr23.top();
    boolean b30 = stackAr23.isFull();
    stackAr0.push((java.lang.Object)stackAr23);
    boolean b32 = stackAr23.isFull();
    java.lang.Object obj33 = stackAr23.top();
    java.lang.Object obj34 = stackAr23.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1)+ "'", obj17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-1)+ "'", obj29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1)+ "'", obj33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1)+ "'", obj34.equals((-1)));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    java.lang.String str6 = stackAr3.toString();
    stackAr3.push((java.lang.Object)(-1));
    java.lang.Object obj9 = stackAr3.top();
    boolean b10 = stackAr0.equals((java.lang.Object)stackAr3);
    boolean b11 = stackAr3.isEmpty();
    java.lang.String str12 = stackAr3.toString();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    stackAr13.push((java.lang.Object)"hi!");
    java.lang.String str18 = stackAr13.toString();
    java.lang.Object obj19 = stackAr13.top();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    int i22 = stackAr20.size();
    java.lang.String str23 = stackAr20.toString();
    stackAr20.push((java.lang.Object)(-1));
    java.lang.Object obj26 = stackAr20.top();
    boolean b27 = stackAr20.isFull();
    java.lang.String str28 = stackAr20.toString();
    boolean b29 = stackAr20.isFull();
    stackAr13.push((java.lang.Object)stackAr20);
    java.lang.Object obj31 = stackAr13.top();
    int i32 = stackAr13.size();
    stackAr3.push((java.lang.Object)stackAr13);
    org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
    java.lang.String str35 = stackAr34.toString();
    int i36 = stackAr34.size();
    java.lang.String str37 = stackAr34.toString();
    stackAr34.push((java.lang.Object)(-1));
    java.lang.String str40 = stackAr34.toString();
    java.lang.Object obj41 = stackAr34.pop();
    org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
    java.lang.String str43 = stackAr42.toString();
    int i44 = stackAr42.size();
    java.lang.String str45 = stackAr42.toString();
    stackAr42.push((java.lang.Object)(-1));
    java.lang.Object obj48 = stackAr42.top();
    stackAr34.push((java.lang.Object)stackAr42);
    stackAr3.push((java.lang.Object)stackAr34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1]"+ "'", str12.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[hi!]"+ "'", str18.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1)+ "'", obj26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[-1]"+ "'", str28.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[-1]"+ "'", str40.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (-1)+ "'", obj41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]"+ "'", str43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]"+ "'", str45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (-1)+ "'", obj48.equals((-1)));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)1);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    boolean b6 = stackAr5.isEmpty();
    java.lang.String str7 = stackAr5.toString();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    java.lang.String str11 = stackAr8.toString();
    stackAr8.push((java.lang.Object)(-1));
    java.lang.Object obj14 = stackAr8.top();
    boolean b15 = stackAr5.equals((java.lang.Object)stackAr8);
    java.lang.Object obj16 = stackAr8.top();
    java.lang.String str17 = stackAr8.toString();
    stackAr1.push((java.lang.Object)str17);
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
    java.lang.String str20 = stackAr19.toString();
    int i21 = stackAr19.size();
    java.lang.String str22 = stackAr19.toString();
    stackAr19.push((java.lang.Object)(-1));
    java.lang.Object obj25 = stackAr19.top();
    boolean b26 = stackAr19.isFull();
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
    boolean b28 = stackAr27.isEmpty();
    java.lang.String str29 = stackAr27.toString();
    org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
    java.lang.String str31 = stackAr30.toString();
    int i32 = stackAr30.size();
    java.lang.String str33 = stackAr30.toString();
    stackAr30.push((java.lang.Object)(-1));
    java.lang.Object obj36 = stackAr30.top();
    boolean b37 = stackAr27.equals((java.lang.Object)stackAr30);
    boolean b38 = stackAr30.isEmpty();
    boolean b39 = stackAr19.equals((java.lang.Object)b38);
    boolean b41 = stackAr19.equals((java.lang.Object)(-1.0f));
    org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
    java.lang.String str43 = stackAr42.toString();
    int i44 = stackAr42.size();
    java.lang.String str45 = stackAr42.toString();
    stackAr42.push((java.lang.Object)(-1));
    java.lang.Object obj48 = stackAr42.top();
    boolean b49 = stackAr42.isFull();
    stackAr19.push((java.lang.Object)stackAr42);
    boolean b51 = stackAr19.isFull();
    boolean b52 = stackAr1.equals((java.lang.Object)b51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1)+ "'", obj14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[-1]"+ "'", str17.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1)+ "'", obj25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (-1)+ "'", obj36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]"+ "'", str43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]"+ "'", str45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (-1)+ "'", obj48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

}
