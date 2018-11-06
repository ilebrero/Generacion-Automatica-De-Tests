
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    java.lang.Object obj12 = stackAr6.top();
    int i13 = stackAr6.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    stackAr6.push((java.lang.Object)stackAr14);
    boolean b17 = stackAr0.equals((java.lang.Object)stackAr6);
    boolean b18 = stackAr0.isFull();
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
    boolean b20 = stackAr19.isEmpty();
    java.lang.String str21 = stackAr19.toString();
    java.lang.Object obj22 = null;
    stackAr19.push(obj22);
    int i24 = stackAr19.size();
    int i25 = stackAr19.size();
    boolean b26 = stackAr19.isEmpty();
    boolean b27 = stackAr19.isFull();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int)(short)100);
    boolean b30 = stackAr29.isEmpty();
    boolean b31 = stackAr19.equals((java.lang.Object)stackAr29);
    stackAr0.push((java.lang.Object)stackAr29);
    boolean b33 = stackAr29.isFull();
    org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str36 = stackAr35.toString();
    stackAr35.push((java.lang.Object)(short)(-1));
    java.lang.Object obj39 = stackAr35.top();
    java.lang.Object obj40 = stackAr35.top();
    boolean b41 = stackAr35.isFull();
    stackAr29.push((java.lang.Object)b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short)(-1)+ "'", obj39.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short)(-1)+ "'", obj40.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    boolean b6 = stackAr0.equals((java.lang.Object)(-1));
    boolean b7 = stackAr0.isEmpty();
    boolean b8 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    boolean b2 = stackAr0.isFull();
    int i3 = stackAr0.size();
    boolean b4 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    int i6 = stackAr0.size();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    boolean b8 = stackAr7.isEmpty();
    boolean b10 = stackAr7.equals((java.lang.Object)1);
    boolean b11 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)stackAr7);
    stackAr7.push((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(byte)10);
    boolean b10 = stackAr9.isFull();
    stackAr9.push((java.lang.Object)'4');
    java.lang.Object obj13 = stackAr9.top();
    boolean b14 = stackAr9.isFull();
    stackAr0.push((java.lang.Object)stackAr9);
    boolean b16 = stackAr9.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '4'+ "'", obj13.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    java.lang.Object obj12 = stackAr6.top();
    int i13 = stackAr6.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    stackAr6.push((java.lang.Object)stackAr14);
    boolean b17 = stackAr0.equals((java.lang.Object)stackAr6);
    int i18 = stackAr0.size();
    java.lang.String str19 = stackAr0.toString();
    java.lang.String str20 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1]"+ "'", str19.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[-1]"+ "'", str20.equals("[-1]"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)1);
    boolean b2 = stackAr1.isFull();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    stackAr3.push((java.lang.Object)"hi!");
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
    boolean b19 = stackAr8.isEmpty();
    stackAr3.push((java.lang.Object)stackAr8);
    boolean b21 = stackAr1.equals((java.lang.Object)stackAr3);
    boolean b22 = stackAr3.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
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
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    stackAr8.push((java.lang.Object)"hi!");
    boolean b13 = stackAr8.isEmpty();
    stackAr0.push((java.lang.Object)stackAr8);
    int i15 = stackAr8.size();
    java.lang.String str16 = stackAr8.toString();
    boolean b17 = stackAr8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[hi!]"+ "'", str16.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int)(byte)10);
    boolean b8 = stackAr7.isFull();
    boolean b9 = stackAr7.isFull();
    stackAr1.push((java.lang.Object)stackAr7);
    int i11 = stackAr7.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    stackAr1.push((java.lang.Object)true);
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    java.lang.String str10 = stackAr9.toString();
    int i11 = stackAr9.size();
    java.lang.String str12 = stackAr9.toString();
    stackAr9.push((java.lang.Object)(-1));
    java.lang.Object obj15 = stackAr9.top();
    int i16 = stackAr9.size();
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
    java.lang.String str18 = stackAr17.toString();
    stackAr9.push((java.lang.Object)stackAr17);
    boolean b20 = stackAr9.isEmpty();
    int i21 = stackAr9.size();
    boolean b22 = stackAr1.equals((java.lang.Object)stackAr9);
    java.lang.Object obj23 = stackAr9.top();
    org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int)(byte)0);
    boolean b26 = stackAr9.equals((java.lang.Object)stackAr25);
    boolean b27 = stackAr25.isEmpty();
    int i28 = stackAr25.size();
    java.lang.String str29 = stackAr25.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1)+ "'", obj15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }


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
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    java.lang.String str18 = stackAr15.toString();
    stackAr15.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    java.lang.String str24 = stackAr21.toString();
    stackAr21.push((java.lang.Object)(-1));
    java.lang.Object obj27 = stackAr21.top();
    int i28 = stackAr21.size();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    java.lang.String str30 = stackAr29.toString();
    stackAr21.push((java.lang.Object)stackAr29);
    boolean b32 = stackAr15.equals((java.lang.Object)stackAr21);
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    java.lang.String str34 = stackAr33.toString();
    int i35 = stackAr33.size();
    java.lang.String str36 = stackAr33.toString();
    stackAr33.push((java.lang.Object)(-1));
    java.lang.Object obj39 = stackAr33.top();
    int i40 = stackAr33.size();
    org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
    java.lang.String str42 = stackAr41.toString();
    stackAr33.push((java.lang.Object)stackAr41);
    boolean b44 = stackAr15.equals((java.lang.Object)stackAr33);
    boolean b45 = stackAr12.equals((java.lang.Object)stackAr33);
    java.lang.String str46 = stackAr12.toString();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    int i49 = stackAr47.size();
    java.lang.String str50 = stackAr47.toString();
    stackAr47.push((java.lang.Object)(-1));
    java.lang.Object obj53 = stackAr47.top();
    int i54 = stackAr47.size();
    org.autotest.StackAr stackAr55 = new org.autotest.StackAr();
    java.lang.String str56 = stackAr55.toString();
    stackAr47.push((java.lang.Object)stackAr55);
    java.lang.Object obj58 = stackAr47.top();
    org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int)(byte)10);
    boolean b61 = stackAr60.isFull();
    stackAr60.push((java.lang.Object)'4');
    java.lang.Object obj64 = stackAr60.top();
    boolean b65 = stackAr47.equals((java.lang.Object)stackAr60);
    java.lang.Object obj66 = stackAr47.top();
    org.autotest.StackAr stackAr67 = new org.autotest.StackAr();
    java.lang.String str68 = stackAr67.toString();
    int i69 = stackAr67.size();
    java.lang.String str70 = stackAr67.toString();
    stackAr67.push((java.lang.Object)(-1));
    java.lang.Object obj73 = stackAr67.top();
    int i74 = stackAr67.size();
    org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int)(byte)10);
    boolean b77 = stackAr76.isFull();
    stackAr76.push((java.lang.Object)'4');
    java.lang.Object obj80 = stackAr76.top();
    boolean b81 = stackAr76.isFull();
    stackAr67.push((java.lang.Object)stackAr76);
    stackAr47.push((java.lang.Object)stackAr76);
    boolean b84 = stackAr12.equals((java.lang.Object)stackAr47);
    int i85 = stackAr12.size();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1)+ "'", obj27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1)+ "'", obj39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]"+ "'", str42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]"+ "'", str46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (-1)+ "'", obj53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]"+ "'", str56.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj64 + "' != '" + '4'+ "'", obj64.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "[]"+ "'", str68.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[]"+ "'", str70.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (-1)+ "'", obj73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj80 + "' != '" + '4'+ "'", obj80.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test13"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    java.lang.Object obj12 = stackAr6.top();
    int i13 = stackAr6.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    stackAr6.push((java.lang.Object)stackAr14);
    java.lang.Object obj17 = stackAr6.top();
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int)(byte)10);
    boolean b20 = stackAr19.isFull();
    stackAr19.push((java.lang.Object)'4');
    java.lang.Object obj23 = stackAr19.top();
    boolean b24 = stackAr6.equals((java.lang.Object)stackAr19);
    stackAr0.push((java.lang.Object)stackAr19);
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int)(byte)10);
    boolean b28 = stackAr27.isFull();
    stackAr27.push((java.lang.Object)'4');
    boolean b32 = stackAr27.equals((java.lang.Object)100.0d);
    boolean b33 = stackAr27.isFull();
    boolean b34 = stackAr27.isFull();
    java.lang.Object obj35 = stackAr27.top();
    stackAr0.push(obj35);
    org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
    java.lang.String str38 = stackAr37.toString();
    int i39 = stackAr37.size();
    java.lang.String str40 = stackAr37.toString();
    stackAr37.push((java.lang.Object)(-1));
    java.lang.Object obj43 = stackAr37.top();
    int i44 = stackAr37.size();
    org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
    java.lang.String str46 = stackAr45.toString();
    stackAr37.push((java.lang.Object)stackAr45);
    java.lang.Object obj48 = stackAr37.top();
    boolean b49 = stackAr37.isFull();
    java.lang.String str50 = stackAr37.toString();
    int i51 = stackAr37.size();
    stackAr0.push((java.lang.Object)i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '4'+ "'", obj23.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + '4'+ "'", obj35.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (-1)+ "'", obj43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]"+ "'", str46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[-1,[]]"+ "'", str50.equals("[-1,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test14"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    boolean b8 = stackAr7.isEmpty();
    java.lang.String str9 = stackAr7.toString();
    java.lang.Object obj10 = null;
    stackAr7.push(obj10);
    int i12 = stackAr7.size();
    boolean b13 = stackAr7.isFull();
    int i14 = stackAr7.size();
    boolean b15 = stackAr0.equals((java.lang.Object)stackAr7);
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    java.lang.String str17 = stackAr16.toString();
    int i18 = stackAr16.size();
    java.lang.String str19 = stackAr16.toString();
    stackAr16.push((java.lang.Object)(-1));
    java.lang.Object obj22 = stackAr16.top();
    int i23 = stackAr16.size();
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    java.lang.String str25 = stackAr24.toString();
    stackAr16.push((java.lang.Object)stackAr24);
    java.lang.Object obj27 = stackAr16.top();
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
    boolean b29 = stackAr28.isEmpty();
    java.lang.String str30 = stackAr28.toString();
    org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
    java.lang.String str32 = stackAr31.toString();
    int i33 = stackAr31.size();
    java.lang.String str34 = stackAr31.toString();
    stackAr31.push((java.lang.Object)(-1));
    java.lang.Object obj37 = stackAr31.top();
    boolean b38 = stackAr28.equals((java.lang.Object)stackAr31);
    java.lang.Object obj39 = stackAr31.top();
    boolean b40 = stackAr31.isFull();
    boolean b41 = stackAr16.equals((java.lang.Object)stackAr31);
    java.lang.String str42 = stackAr16.toString();
    boolean b43 = stackAr16.isFull();
    boolean b44 = stackAr0.equals((java.lang.Object)stackAr16);
    int i45 = stackAr0.size();
    int i46 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
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
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (-1)+ "'", obj37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1)+ "'", obj39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[-1,[]]"+ "'", str42.equals("[-1,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    java.lang.Object obj12 = stackAr6.top();
    int i13 = stackAr6.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    stackAr6.push((java.lang.Object)stackAr14);
    boolean b17 = stackAr0.equals((java.lang.Object)stackAr6);
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    int i25 = stackAr18.size();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    stackAr18.push((java.lang.Object)stackAr26);
    boolean b29 = stackAr0.equals((java.lang.Object)stackAr18);
    int i30 = stackAr18.size();
    org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
    java.lang.String str32 = stackAr31.toString();
    int i33 = stackAr31.size();
    stackAr31.push((java.lang.Object)"hi!");
    boolean b36 = stackAr31.isEmpty();
    boolean b37 = stackAr31.isEmpty();
    org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int)(short)100);
    boolean b40 = stackAr39.isFull();
    stackAr31.push((java.lang.Object)stackAr39);
    stackAr18.push((java.lang.Object)stackAr39);
    java.lang.String str43 = stackAr39.toString();
    org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
    java.lang.String str45 = stackAr44.toString();
    int i46 = stackAr44.size();
    stackAr44.push((java.lang.Object)"hi!");
    boolean b49 = stackAr44.isEmpty();
    boolean b50 = stackAr44.isEmpty();
    java.lang.Object obj51 = stackAr44.top();
    org.autotest.StackAr stackAr52 = new org.autotest.StackAr();
    boolean b53 = stackAr52.isEmpty();
    java.lang.String str54 = stackAr52.toString();
    java.lang.Object obj55 = null;
    stackAr52.push(obj55);
    int i57 = stackAr52.size();
    int i58 = stackAr52.size();
    boolean b59 = stackAr52.isEmpty();
    boolean b60 = stackAr52.isFull();
    org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int)(short)100);
    boolean b63 = stackAr62.isEmpty();
    boolean b64 = stackAr52.equals((java.lang.Object)stackAr62);
    boolean b65 = stackAr44.equals((java.lang.Object)b64);
    java.lang.Object obj66 = stackAr44.top();
    java.lang.Object obj67 = stackAr44.top();
    stackAr39.push(obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
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
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]"+ "'", str43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]"+ "'", str45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "hi!"+ "'", obj51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]"+ "'", str54.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "hi!"+ "'", obj66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "hi!"+ "'", obj67.equals("hi!"));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)1);
    boolean b2 = stackAr1.isFull();
    boolean b3 = stackAr1.isFull();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int)(byte)0);
    boolean b6 = stackAr5.isFull();
    boolean b7 = stackAr5.isFull();
    int i8 = stackAr5.size();
    stackAr1.push((java.lang.Object)i8);
    boolean b10 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'#');
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str5 = stackAr4.toString();
    stackAr4.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    stackAr8.push((java.lang.Object)"hi!");
    boolean b13 = stackAr8.isEmpty();
    boolean b14 = stackAr8.isEmpty();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    stackAr15.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    boolean b21 = stackAr20.isEmpty();
    java.lang.String str22 = stackAr20.toString();
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
    java.lang.String str24 = stackAr23.toString();
    int i25 = stackAr23.size();
    java.lang.String str26 = stackAr23.toString();
    stackAr23.push((java.lang.Object)(-1));
    java.lang.Object obj29 = stackAr23.top();
    boolean b30 = stackAr20.equals((java.lang.Object)stackAr23);
    boolean b31 = stackAr20.isEmpty();
    stackAr15.push((java.lang.Object)stackAr20);
    int i33 = stackAr15.size();
    boolean b34 = stackAr8.equals((java.lang.Object)stackAr15);
    stackAr4.push((java.lang.Object)stackAr15);
    boolean b36 = stackAr4.isEmpty();
    stackAr1.push((java.lang.Object)b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
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
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    boolean b8 = stackAr0.isFull();
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
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    java.lang.Object obj7 = null;
    boolean b8 = stackAr1.equals(obj7);
    java.lang.Object obj9 = null;
    stackAr1.push(obj9);
    java.lang.Object obj11 = stackAr1.pop();
    boolean b12 = stackAr1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }


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
    int i11 = stackAr0.size();
    
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
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }


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
    int i12 = stackAr0.size();
    boolean b13 = stackAr0.isEmpty();
    java.lang.String str14 = stackAr0.toString();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    boolean b16 = stackAr15.isEmpty();
    java.lang.String str17 = stackAr15.toString();
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    boolean b25 = stackAr15.equals((java.lang.Object)stackAr18);
    boolean b26 = stackAr18.isEmpty();
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int)(byte)10);
    boolean b29 = stackAr28.isFull();
    stackAr28.push((java.lang.Object)'4');
    boolean b33 = stackAr28.equals((java.lang.Object)100.0d);
    stackAr28.push((java.lang.Object)true);
    org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
    java.lang.String str37 = stackAr36.toString();
    int i38 = stackAr36.size();
    java.lang.String str39 = stackAr36.toString();
    stackAr36.push((java.lang.Object)(-1));
    java.lang.Object obj42 = stackAr36.top();
    boolean b44 = stackAr36.equals((java.lang.Object)1L);
    boolean b45 = stackAr36.isFull();
    java.lang.String str46 = stackAr36.toString();
    stackAr28.push((java.lang.Object)stackAr36);
    stackAr18.push((java.lang.Object)stackAr36);
    boolean b49 = stackAr0.equals((java.lang.Object)stackAr36);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
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
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]"+ "'", str39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (-1)+ "'", obj42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[-1]"+ "'", str46.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'#');
    int i2 = stackAr1.size();
    boolean b3 = stackAr1.isEmpty();
    boolean b4 = stackAr1.isEmpty();
    boolean b5 = stackAr1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    boolean b11 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    java.lang.String str15 = stackAr12.toString();
    stackAr12.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    int i25 = stackAr18.size();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    stackAr18.push((java.lang.Object)stackAr26);
    boolean b29 = stackAr12.equals((java.lang.Object)stackAr18);
    org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
    java.lang.String str31 = stackAr30.toString();
    int i32 = stackAr30.size();
    java.lang.String str33 = stackAr30.toString();
    stackAr30.push((java.lang.Object)(-1));
    java.lang.Object obj36 = stackAr30.top();
    int i37 = stackAr30.size();
    org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
    java.lang.String str39 = stackAr38.toString();
    stackAr30.push((java.lang.Object)stackAr38);
    boolean b41 = stackAr12.equals((java.lang.Object)stackAr30);
    stackAr0.push((java.lang.Object)b41);
    java.lang.Object obj43 = stackAr0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1)+ "'", obj24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (-1)+ "'", obj36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]"+ "'", str39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false+ "'", obj43.equals(false));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
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
    boolean b16 = stackAr5.isEmpty();
    stackAr0.push((java.lang.Object)stackAr5);
    int i18 = stackAr5.size();
    boolean b19 = stackAr5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test25"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    java.lang.Object obj12 = stackAr6.top();
    int i13 = stackAr6.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    stackAr6.push((java.lang.Object)stackAr14);
    boolean b17 = stackAr0.equals((java.lang.Object)stackAr6);
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    int i25 = stackAr18.size();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    stackAr18.push((java.lang.Object)stackAr26);
    boolean b29 = stackAr0.equals((java.lang.Object)stackAr18);
    int i30 = stackAr18.size();
    boolean b31 = stackAr18.isFull();
    int i32 = stackAr18.size();
    int i33 = stackAr18.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
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
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test26"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.Object obj11 = stackAr0.top();
    boolean b12 = stackAr0.isFull();
    java.lang.String str13 = stackAr0.toString();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int)(byte)0);
    boolean b16 = stackAr15.isFull();
    boolean b17 = stackAr0.equals((java.lang.Object)stackAr15);
    java.lang.String str18 = stackAr0.toString();
    stackAr0.push((java.lang.Object)"[null,-1]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[-1,[]]"+ "'", str13.equals("[-1,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,[]]"+ "'", str18.equals("[-1,[]]"));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test27"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    java.lang.String str3 = stackAr1.toString();
    boolean b4 = stackAr1.isEmpty();
    boolean b5 = stackAr1.isEmpty();
    java.lang.String str6 = stackAr1.toString();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    java.lang.String str10 = stackAr7.toString();
    stackAr7.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1));
    java.lang.Object obj19 = stackAr13.top();
    int i20 = stackAr13.size();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    stackAr13.push((java.lang.Object)stackAr21);
    boolean b24 = stackAr7.equals((java.lang.Object)stackAr13);
    boolean b25 = stackAr13.isFull();
    java.lang.String str26 = stackAr13.toString();
    int i27 = stackAr13.size();
    stackAr1.push((java.lang.Object)stackAr13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[-1,[]]"+ "'", str26.equals("[-1,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test28"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    boolean b2 = stackAr0.isEmpty();
    boolean b3 = stackAr0.isFull();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
    java.lang.String str5 = stackAr4.toString();
    int i6 = stackAr4.size();
    java.lang.String str7 = stackAr4.toString();
    stackAr4.push((java.lang.Object)(-1));
    java.lang.Object obj10 = stackAr4.top();
    int i11 = stackAr4.size();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    stackAr4.push((java.lang.Object)stackAr12);
    stackAr0.push((java.lang.Object)stackAr12);
    boolean b16 = stackAr0.isEmpty();
    java.lang.Object obj17 = stackAr0.top();
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    boolean b19 = stackAr18.isEmpty();
    java.lang.String str20 = stackAr18.toString();
    java.lang.Object obj21 = null;
    stackAr18.push(obj21);
    int i23 = stackAr18.size();
    boolean b24 = stackAr18.isFull();
    stackAr0.push((java.lang.Object)stackAr18);
    int i26 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test29"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.Object obj11 = stackAr0.top();
    boolean b12 = stackAr0.isFull();
    int i13 = stackAr0.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    int i16 = stackAr14.size();
    stackAr14.push((java.lang.Object)"hi!");
    java.lang.String str19 = stackAr14.toString();
    java.lang.Object obj20 = stackAr14.top();
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    boolean b22 = stackAr21.isEmpty();
    java.lang.String str23 = stackAr21.toString();
    java.lang.Object obj24 = null;
    stackAr21.push(obj24);
    int i26 = stackAr21.size();
    boolean b27 = stackAr21.isFull();
    int i28 = stackAr21.size();
    boolean b29 = stackAr14.equals((java.lang.Object)stackAr21);
    boolean b30 = stackAr0.equals((java.lang.Object)b29);
    boolean b31 = stackAr0.isEmpty();
    boolean b32 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[hi!]"+ "'", str19.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!"+ "'", obj20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test30"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    boolean b6 = stackAr0.equals((java.lang.Object)(-1));
    java.lang.Object obj7 = stackAr0.top();
    java.lang.Object obj8 = stackAr0.pop();
    java.lang.String str9 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test31"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    boolean b6 = stackAr0.isEmpty();
    java.lang.Object obj7 = stackAr0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!"+ "'", obj7.equals("hi!"));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test32"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    int i7 = stackAr0.size();
    java.lang.Object obj8 = stackAr0.top();
    java.lang.String str9 = stackAr0.toString();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
    java.lang.String str11 = stackAr10.toString();
    int i12 = stackAr10.size();
    stackAr10.push((java.lang.Object)"hi!");
    int i15 = stackAr10.size();
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    java.lang.String str17 = stackAr16.toString();
    int i18 = stackAr16.size();
    stackAr16.push((java.lang.Object)"hi!");
    boolean b21 = stackAr16.isFull();
    stackAr10.push((java.lang.Object)stackAr16);
    int i23 = stackAr10.size();
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    java.lang.String str25 = stackAr24.toString();
    int i26 = stackAr24.size();
    java.lang.String str27 = stackAr24.toString();
    stackAr24.push((java.lang.Object)(-1));
    java.lang.Object obj30 = stackAr24.top();
    int i31 = stackAr24.size();
    org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
    java.lang.String str33 = stackAr32.toString();
    stackAr24.push((java.lang.Object)stackAr32);
    java.lang.Object obj35 = stackAr24.top();
    org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int)(byte)10);
    boolean b38 = stackAr37.isFull();
    stackAr37.push((java.lang.Object)'4');
    java.lang.Object obj41 = stackAr37.top();
    boolean b42 = stackAr24.equals((java.lang.Object)stackAr37);
    org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int)(byte)10);
    boolean b45 = stackAr44.isFull();
    stackAr44.push((java.lang.Object)'4');
    boolean b49 = stackAr44.equals((java.lang.Object)100.0d);
    stackAr44.push((java.lang.Object)true);
    org.autotest.StackAr stackAr52 = new org.autotest.StackAr();
    java.lang.String str53 = stackAr52.toString();
    int i54 = stackAr52.size();
    java.lang.String str55 = stackAr52.toString();
    stackAr52.push((java.lang.Object)(-1));
    java.lang.Object obj58 = stackAr52.top();
    int i59 = stackAr52.size();
    org.autotest.StackAr stackAr60 = new org.autotest.StackAr();
    java.lang.String str61 = stackAr60.toString();
    stackAr52.push((java.lang.Object)stackAr60);
    boolean b63 = stackAr52.isEmpty();
    int i64 = stackAr52.size();
    boolean b65 = stackAr44.equals((java.lang.Object)stackAr52);
    java.lang.Object obj66 = stackAr52.top();
    stackAr37.push((java.lang.Object)stackAr52);
    int i68 = stackAr37.size();
    boolean b69 = stackAr10.equals((java.lang.Object)stackAr37);
    stackAr0.push((java.lang.Object)stackAr37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]"+ "'", str6.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1]"+ "'", str9.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1)+ "'", obj30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '4'+ "'", obj41.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]"+ "'", str53.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]"+ "'", str55.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (-1)+ "'", obj58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[]"+ "'", str61.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test33"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b8 = stackAr0.equals((java.lang.Object)1L);
    boolean b9 = stackAr0.isFull();
    boolean b10 = stackAr0.isEmpty();
    java.lang.Object obj11 = stackAr0.top();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    java.lang.String str15 = stackAr12.toString();
    stackAr12.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    int i25 = stackAr18.size();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    stackAr18.push((java.lang.Object)stackAr26);
    boolean b29 = stackAr12.equals((java.lang.Object)stackAr18);
    boolean b30 = stackAr18.isFull();
    boolean b31 = stackAr18.isFull();
    stackAr0.push((java.lang.Object)stackAr18);
    int i33 = stackAr18.size();
    int i34 = stackAr18.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1)+ "'", obj24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test34"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
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
    boolean b16 = stackAr5.isEmpty();
    stackAr0.push((java.lang.Object)stackAr5);
    java.lang.String str18 = stackAr5.toString();
    java.lang.String str19 = stackAr5.toString();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    int i22 = stackAr20.size();
    stackAr20.push((java.lang.Object)"hi!");
    int i25 = stackAr20.size();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    int i28 = stackAr26.size();
    stackAr26.push((java.lang.Object)"hi!");
    boolean b31 = stackAr26.isFull();
    stackAr20.push((java.lang.Object)stackAr26);
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    boolean b34 = stackAr33.isEmpty();
    java.lang.String str35 = stackAr33.toString();
    java.lang.Object obj36 = null;
    stackAr33.push(obj36);
    int i38 = stackAr33.size();
    int i39 = stackAr33.size();
    boolean b40 = stackAr33.isFull();
    java.lang.Object obj41 = null;
    boolean b42 = stackAr33.equals(obj41);
    org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
    boolean b44 = stackAr43.isEmpty();
    boolean b45 = stackAr43.isEmpty();
    boolean b46 = stackAr43.isFull();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    int i49 = stackAr47.size();
    java.lang.String str50 = stackAr47.toString();
    stackAr47.push((java.lang.Object)(-1));
    java.lang.Object obj53 = stackAr47.top();
    int i54 = stackAr47.size();
    org.autotest.StackAr stackAr55 = new org.autotest.StackAr();
    java.lang.String str56 = stackAr55.toString();
    stackAr47.push((java.lang.Object)stackAr55);
    stackAr43.push((java.lang.Object)stackAr55);
    boolean b59 = stackAr43.isFull();
    boolean b60 = stackAr33.equals((java.lang.Object)b59);
    stackAr20.push((java.lang.Object)b60);
    stackAr5.push((java.lang.Object)stackAr20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (-1)+ "'", obj53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]"+ "'", str56.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test35"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
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
    boolean b16 = stackAr5.isEmpty();
    stackAr0.push((java.lang.Object)stackAr5);
    org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str20 = stackAr19.toString();
    stackAr19.push((java.lang.Object)(short)(-1));
    java.lang.String str23 = stackAr19.toString();
    boolean b24 = stackAr5.equals((java.lang.Object)str23);
    org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
    java.lang.String str26 = stackAr25.toString();
    int i27 = stackAr25.size();
    java.lang.String str28 = stackAr25.toString();
    stackAr25.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
    java.lang.String str32 = stackAr31.toString();
    int i33 = stackAr31.size();
    java.lang.String str34 = stackAr31.toString();
    stackAr31.push((java.lang.Object)(-1));
    java.lang.Object obj37 = stackAr31.top();
    int i38 = stackAr31.size();
    org.autotest.StackAr stackAr39 = new org.autotest.StackAr();
    java.lang.String str40 = stackAr39.toString();
    stackAr31.push((java.lang.Object)stackAr39);
    boolean b42 = stackAr25.equals((java.lang.Object)stackAr31);
    boolean b43 = stackAr31.isFull();
    boolean b44 = stackAr5.equals((java.lang.Object)stackAr31);
    boolean b45 = stackAr31.isFull();
    int i46 = stackAr31.size();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    int i49 = stackAr47.size();
    java.lang.String str50 = stackAr47.toString();
    stackAr47.push((java.lang.Object)(-1));
    java.lang.Object obj53 = stackAr47.top();
    boolean b55 = stackAr47.equals((java.lang.Object)1L);
    boolean b56 = stackAr47.isFull();
    boolean b57 = stackAr47.isEmpty();
    boolean b58 = stackAr47.isFull();
    java.lang.Object obj59 = stackAr47.top();
    org.autotest.StackAr stackAr60 = new org.autotest.StackAr();
    boolean b61 = stackAr60.isEmpty();
    java.lang.String str62 = stackAr60.toString();
    java.lang.Object obj63 = null;
    stackAr60.push(obj63);
    int i65 = stackAr60.size();
    stackAr60.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr68 = new org.autotest.StackAr();
    java.lang.String str69 = stackAr68.toString();
    int i70 = stackAr68.size();
    stackAr68.push((java.lang.Object)"hi!");
    int i73 = stackAr68.size();
    org.autotest.StackAr stackAr74 = new org.autotest.StackAr();
    java.lang.String str75 = stackAr74.toString();
    int i76 = stackAr74.size();
    stackAr74.push((java.lang.Object)"hi!");
    boolean b79 = stackAr74.isFull();
    stackAr68.push((java.lang.Object)stackAr74);
    int i81 = stackAr74.size();
    stackAr60.push((java.lang.Object)i81);
    boolean b83 = stackAr47.equals((java.lang.Object)stackAr60);
    stackAr31.push((java.lang.Object)b83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[-1]"+ "'", str23.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (-1)+ "'", obj37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (-1)+ "'", obj53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (-1)+ "'", obj59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]"+ "'", str62.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]"+ "'", str69.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "[]"+ "'", str75.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test36"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isFull();
    boolean b6 = stackAr0.isFull();
    boolean b7 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test37"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    int i6 = stackAr0.size();
    boolean b7 = stackAr0.isEmpty();
    boolean b8 = stackAr0.isFull();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int)(short)100);
    boolean b11 = stackAr10.isEmpty();
    boolean b12 = stackAr0.equals((java.lang.Object)stackAr10);
    java.lang.String str13 = stackAr0.toString();
    boolean b14 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    java.lang.String str18 = stackAr15.toString();
    stackAr15.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    java.lang.String str24 = stackAr21.toString();
    stackAr21.push((java.lang.Object)(-1));
    java.lang.Object obj27 = stackAr21.top();
    int i28 = stackAr21.size();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    java.lang.String str30 = stackAr29.toString();
    stackAr21.push((java.lang.Object)stackAr29);
    boolean b32 = stackAr15.equals((java.lang.Object)stackAr21);
    boolean b33 = stackAr21.isFull();
    boolean b34 = stackAr0.equals((java.lang.Object)stackAr21);
    org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
    java.lang.String str36 = stackAr35.toString();
    int i37 = stackAr35.size();
    java.lang.String str38 = stackAr35.toString();
    stackAr35.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
    java.lang.String str42 = stackAr41.toString();
    int i43 = stackAr41.size();
    java.lang.String str44 = stackAr41.toString();
    stackAr41.push((java.lang.Object)(-1));
    java.lang.Object obj47 = stackAr41.top();
    int i48 = stackAr41.size();
    org.autotest.StackAr stackAr49 = new org.autotest.StackAr();
    java.lang.String str50 = stackAr49.toString();
    stackAr41.push((java.lang.Object)stackAr49);
    boolean b52 = stackAr35.equals((java.lang.Object)stackAr41);
    int i53 = stackAr35.size();
    boolean b54 = stackAr21.equals((java.lang.Object)i53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]"+ "'", str13.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1)+ "'", obj27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]"+ "'", str42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]"+ "'", str44.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (-1)+ "'", obj47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test38"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isEmpty();
    boolean b6 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    boolean b9 = stackAr7.isFull();
    java.lang.String str10 = stackAr7.toString();
    stackAr0.push((java.lang.Object)str10);
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
    boolean b26 = stackAr24.isEmpty();
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int)(byte)10);
    boolean b29 = stackAr28.isFull();
    boolean b30 = stackAr28.isFull();
    boolean b31 = stackAr24.equals((java.lang.Object)b30);
    org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
    boolean b33 = stackAr32.isEmpty();
    java.lang.String str34 = stackAr32.toString();
    org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
    java.lang.String str36 = stackAr35.toString();
    int i37 = stackAr35.size();
    java.lang.String str38 = stackAr35.toString();
    stackAr35.push((java.lang.Object)(-1));
    java.lang.Object obj41 = stackAr35.top();
    boolean b42 = stackAr32.equals((java.lang.Object)stackAr35);
    boolean b43 = stackAr35.isEmpty();
    org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
    stackAr35.push((java.lang.Object)stackAr44);
    boolean b46 = stackAr44.isEmpty();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    int i49 = stackAr47.size();
    java.lang.String str50 = stackAr47.toString();
    stackAr47.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
    java.lang.String str54 = stackAr53.toString();
    int i55 = stackAr53.size();
    java.lang.String str56 = stackAr53.toString();
    stackAr53.push((java.lang.Object)(-1));
    java.lang.Object obj59 = stackAr53.top();
    int i60 = stackAr53.size();
    org.autotest.StackAr stackAr61 = new org.autotest.StackAr();
    java.lang.String str62 = stackAr61.toString();
    stackAr53.push((java.lang.Object)stackAr61);
    boolean b64 = stackAr47.equals((java.lang.Object)stackAr53);
    org.autotest.StackAr stackAr65 = new org.autotest.StackAr();
    java.lang.String str66 = stackAr65.toString();
    int i67 = stackAr65.size();
    java.lang.String str68 = stackAr65.toString();
    stackAr65.push((java.lang.Object)(-1));
    java.lang.Object obj71 = stackAr65.top();
    int i72 = stackAr65.size();
    org.autotest.StackAr stackAr73 = new org.autotest.StackAr();
    java.lang.String str74 = stackAr73.toString();
    stackAr65.push((java.lang.Object)stackAr73);
    boolean b76 = stackAr47.equals((java.lang.Object)stackAr65);
    boolean b77 = stackAr44.equals((java.lang.Object)stackAr65);
    stackAr24.push((java.lang.Object)stackAr44);
    boolean b79 = stackAr44.isFull();
    stackAr0.push((java.lang.Object)stackAr44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (-1)+ "'", obj41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]"+ "'", str54.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]"+ "'", str56.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (-1)+ "'", obj59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]"+ "'", str62.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]"+ "'", str66.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "[]"+ "'", str68.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (-1)+ "'", obj71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "[]"+ "'", str74.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test39"); }


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
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    java.lang.String str18 = stackAr15.toString();
    stackAr15.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    java.lang.String str24 = stackAr21.toString();
    stackAr21.push((java.lang.Object)(-1));
    java.lang.Object obj27 = stackAr21.top();
    int i28 = stackAr21.size();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    java.lang.String str30 = stackAr29.toString();
    stackAr21.push((java.lang.Object)stackAr29);
    boolean b32 = stackAr15.equals((java.lang.Object)stackAr21);
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    java.lang.String str34 = stackAr33.toString();
    int i35 = stackAr33.size();
    java.lang.String str36 = stackAr33.toString();
    stackAr33.push((java.lang.Object)(-1));
    java.lang.Object obj39 = stackAr33.top();
    int i40 = stackAr33.size();
    org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
    java.lang.String str42 = stackAr41.toString();
    stackAr33.push((java.lang.Object)stackAr41);
    boolean b44 = stackAr15.equals((java.lang.Object)stackAr33);
    boolean b45 = stackAr12.equals((java.lang.Object)stackAr33);
    java.lang.String str46 = stackAr12.toString();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    int i49 = stackAr47.size();
    java.lang.String str50 = stackAr47.toString();
    stackAr47.push((java.lang.Object)(-1));
    java.lang.Object obj53 = stackAr47.top();
    int i54 = stackAr47.size();
    org.autotest.StackAr stackAr55 = new org.autotest.StackAr();
    java.lang.String str56 = stackAr55.toString();
    stackAr47.push((java.lang.Object)stackAr55);
    java.lang.Object obj58 = stackAr47.top();
    org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int)(byte)10);
    boolean b61 = stackAr60.isFull();
    stackAr60.push((java.lang.Object)'4');
    java.lang.Object obj64 = stackAr60.top();
    boolean b65 = stackAr47.equals((java.lang.Object)stackAr60);
    java.lang.Object obj66 = stackAr47.top();
    org.autotest.StackAr stackAr67 = new org.autotest.StackAr();
    java.lang.String str68 = stackAr67.toString();
    int i69 = stackAr67.size();
    java.lang.String str70 = stackAr67.toString();
    stackAr67.push((java.lang.Object)(-1));
    java.lang.Object obj73 = stackAr67.top();
    int i74 = stackAr67.size();
    org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int)(byte)10);
    boolean b77 = stackAr76.isFull();
    stackAr76.push((java.lang.Object)'4');
    java.lang.Object obj80 = stackAr76.top();
    boolean b81 = stackAr76.isFull();
    stackAr67.push((java.lang.Object)stackAr76);
    stackAr47.push((java.lang.Object)stackAr76);
    boolean b84 = stackAr12.equals((java.lang.Object)stackAr47);
    boolean b85 = stackAr47.isEmpty();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1)+ "'", obj27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1)+ "'", obj39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]"+ "'", str42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]"+ "'", str46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (-1)+ "'", obj53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]"+ "'", str56.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj64 + "' != '" + '4'+ "'", obj64.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "[]"+ "'", str68.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[]"+ "'", str70.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (-1)+ "'", obj73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj80 + "' != '" + '4'+ "'", obj80.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test40"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'#');
    int i2 = stackAr1.size();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    boolean b4 = stackAr3.isEmpty();
    java.lang.String str5 = stackAr3.toString();
    java.lang.Object obj6 = null;
    stackAr3.push(obj6);
    int i8 = stackAr3.size();
    stackAr3.push((java.lang.Object)(short)(-1));
    boolean b11 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str14 = stackAr13.toString();
    stackAr13.push((java.lang.Object)"[-1]");
    boolean b17 = stackAr3.equals((java.lang.Object)stackAr13);
    boolean b18 = stackAr1.equals((java.lang.Object)stackAr13);
    java.lang.String str19 = stackAr13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[-1]]"+ "'", str19.equals("[[-1]]"));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test41"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    java.lang.Object obj12 = stackAr6.top();
    int i13 = stackAr6.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    stackAr6.push((java.lang.Object)stackAr14);
    boolean b17 = stackAr0.equals((java.lang.Object)stackAr6);
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    int i25 = stackAr18.size();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    stackAr18.push((java.lang.Object)stackAr26);
    boolean b29 = stackAr0.equals((java.lang.Object)stackAr18);
    int i30 = stackAr18.size();
    boolean b31 = stackAr18.isFull();
    int i32 = stackAr18.size();
    java.lang.String str33 = stackAr18.toString();
    java.lang.String str34 = stackAr18.toString();
    java.lang.String str35 = stackAr18.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
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
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[-1,[]]"+ "'", str33.equals("[-1,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[-1,[]]"+ "'", str34.equals("[-1,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[-1,[]]"+ "'", str35.equals("[-1,[]]"));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test42"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    java.lang.String str3 = stackAr1.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
    boolean b5 = stackAr4.isEmpty();
    java.lang.String str6 = stackAr4.toString();
    java.lang.Object obj7 = null;
    stackAr4.push(obj7);
    int i9 = stackAr4.size();
    stackAr4.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    java.lang.String str15 = stackAr12.toString();
    stackAr12.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    java.lang.String str21 = stackAr18.toString();
    stackAr18.push((java.lang.Object)(-1));
    java.lang.Object obj24 = stackAr18.top();
    int i25 = stackAr18.size();
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    java.lang.String str27 = stackAr26.toString();
    stackAr18.push((java.lang.Object)stackAr26);
    boolean b29 = stackAr12.equals((java.lang.Object)stackAr18);
    java.lang.Object obj30 = stackAr12.top();
    boolean b31 = stackAr4.equals((java.lang.Object)stackAr12);
    boolean b32 = stackAr1.equals((java.lang.Object)stackAr12);
    boolean b33 = stackAr1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj34 = stackAr1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1)+ "'", obj24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1)+ "'", obj30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test43"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    int i2 = stackAr1.size();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    boolean b4 = stackAr3.isEmpty();
    java.lang.String str5 = stackAr3.toString();
    java.lang.Object obj6 = null;
    stackAr3.push(obj6);
    int i8 = stackAr3.size();
    java.lang.Object obj9 = stackAr3.pop();
    int i10 = stackAr3.size();
    stackAr1.push((java.lang.Object)i10);
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str14 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
    java.lang.String str18 = stackAr17.toString();
    int i19 = stackAr17.size();
    stackAr17.push((java.lang.Object)"hi!");
    boolean b22 = stackAr17.isEmpty();
    boolean b23 = stackAr17.isEmpty();
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
    java.lang.String str25 = stackAr24.toString();
    int i26 = stackAr24.size();
    stackAr24.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    boolean b30 = stackAr29.isEmpty();
    java.lang.String str31 = stackAr29.toString();
    org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
    java.lang.String str33 = stackAr32.toString();
    int i34 = stackAr32.size();
    java.lang.String str35 = stackAr32.toString();
    stackAr32.push((java.lang.Object)(-1));
    java.lang.Object obj38 = stackAr32.top();
    boolean b39 = stackAr29.equals((java.lang.Object)stackAr32);
    boolean b40 = stackAr29.isEmpty();
    stackAr24.push((java.lang.Object)stackAr29);
    int i42 = stackAr24.size();
    boolean b43 = stackAr17.equals((java.lang.Object)stackAr24);
    stackAr13.push((java.lang.Object)stackAr24);
    org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
    boolean b46 = stackAr45.isEmpty();
    java.lang.String str47 = stackAr45.toString();
    java.lang.Object obj48 = null;
    stackAr45.push(obj48);
    boolean b51 = stackAr45.equals((java.lang.Object)(-1));
    java.lang.Object obj52 = stackAr45.pop();
    stackAr13.push((java.lang.Object)stackAr45);
    boolean b54 = stackAr1.equals((java.lang.Object)stackAr13);
    java.lang.String str55 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (-1)+ "'", obj38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]"+ "'", str47.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[0]"+ "'", str55.equals("[0]"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test44"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    boolean b3 = stackAr1.isFull();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
    java.lang.String str5 = stackAr4.toString();
    int i6 = stackAr4.size();
    java.lang.String str7 = stackAr4.toString();
    stackAr4.push((java.lang.Object)(-1));
    java.lang.Object obj10 = stackAr4.top();
    boolean b12 = stackAr4.equals((java.lang.Object)1L);
    java.lang.Object obj13 = stackAr4.top();
    boolean b14 = stackAr1.equals((java.lang.Object)stackAr4);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    boolean b16 = stackAr15.isEmpty();
    java.lang.String str17 = stackAr15.toString();
    java.lang.Object obj18 = null;
    stackAr15.push(obj18);
    int i20 = stackAr15.size();
    int i21 = stackAr15.size();
    boolean b22 = stackAr15.isEmpty();
    org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int)(short)100);
    boolean b25 = stackAr24.isFull();
    boolean b26 = stackAr15.equals((java.lang.Object)b25);
    java.lang.Object obj27 = stackAr15.top();
    int i28 = stackAr15.size();
    boolean b29 = stackAr1.equals((java.lang.Object)stackAr15);
    java.lang.String str30 = stackAr15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[null]"+ "'", str30.equals("[null]"));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test45"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    int i5 = stackAr0.size();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    stackAr6.push((java.lang.Object)"hi!");
    boolean b11 = stackAr6.isFull();
    stackAr0.push((java.lang.Object)stackAr6);
    int i13 = stackAr0.size();
    boolean b14 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test46"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    stackAr1.push((java.lang.Object)true);
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    java.lang.String str10 = stackAr9.toString();
    int i11 = stackAr9.size();
    java.lang.String str12 = stackAr9.toString();
    stackAr9.push((java.lang.Object)(-1));
    java.lang.Object obj15 = stackAr9.top();
    boolean b17 = stackAr9.equals((java.lang.Object)1L);
    boolean b18 = stackAr9.isFull();
    java.lang.String str19 = stackAr9.toString();
    stackAr1.push((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
    java.lang.String str22 = stackAr21.toString();
    int i23 = stackAr21.size();
    boolean b25 = stackAr21.equals((java.lang.Object)(short)100);
    boolean b26 = stackAr21.isFull();
    boolean b27 = stackAr9.equals((java.lang.Object)stackAr21);
    boolean b28 = stackAr9.isFull();
    boolean b29 = stackAr9.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1)+ "'", obj15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1]"+ "'", str19.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test47"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    boolean b11 = stackAr0.isEmpty();
    java.lang.Object obj12 = stackAr0.top();
    boolean b13 = stackAr0.isFull();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    int i16 = stackAr14.size();
    stackAr14.push((java.lang.Object)"hi!");
    int i19 = stackAr14.size();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    int i22 = stackAr20.size();
    stackAr20.push((java.lang.Object)"hi!");
    boolean b25 = stackAr20.isFull();
    stackAr14.push((java.lang.Object)stackAr20);
    int i27 = stackAr20.size();
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
    boolean b29 = stackAr28.isEmpty();
    java.lang.String str30 = stackAr28.toString();
    java.lang.Object obj31 = null;
    stackAr28.push(obj31);
    int i33 = stackAr28.size();
    stackAr28.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int)(byte)0);
    boolean b38 = stackAr37.isFull();
    boolean b39 = stackAr37.isFull();
    boolean b40 = stackAr28.equals((java.lang.Object)b39);
    stackAr20.push((java.lang.Object)stackAr28);
    stackAr0.push((java.lang.Object)stackAr28);
    int i43 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 3);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test48"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)"[-1]");
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    java.lang.String str8 = stackAr5.toString();
    stackAr5.push((java.lang.Object)(-1));
    java.lang.String str11 = stackAr5.toString();
    java.lang.String str12 = stackAr5.toString();
    boolean b13 = stackAr1.equals((java.lang.Object)str12);
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    boolean b15 = stackAr14.isEmpty();
    java.lang.String str16 = stackAr14.toString();
    java.lang.Object obj17 = null;
    stackAr14.push(obj17);
    int i19 = stackAr14.size();
    int i20 = stackAr14.size();
    boolean b21 = stackAr1.equals((java.lang.Object)stackAr14);
    java.lang.Object obj22 = null;
    boolean b23 = stackAr14.equals(obj22);
    org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int)'#');
    java.lang.String str26 = stackAr25.toString();
    stackAr14.push((java.lang.Object)stackAr25);
    java.lang.String str28 = stackAr25.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1]"+ "'", str12.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test49"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(short)1);
    boolean b2 = stackAr1.isFull();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    int i5 = stackAr3.size();
    stackAr3.push((java.lang.Object)"hi!");
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
    boolean b19 = stackAr8.isEmpty();
    stackAr3.push((java.lang.Object)stackAr8);
    boolean b21 = stackAr1.equals((java.lang.Object)stackAr3);
    boolean b22 = stackAr3.isEmpty();
    java.lang.String str23 = stackAr3.toString();
    int i24 = stackAr3.size();
    int i25 = stackAr3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
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
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[hi!,[]]"+ "'", str23.equals("[hi!,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test50"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    int i3 = stackAr0.size();
    boolean b4 = stackAr0.isEmpty();
    boolean b5 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test51"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    int i6 = stackAr0.size();
    boolean b7 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(short)100);
    boolean b10 = stackAr9.isFull();
    boolean b11 = stackAr0.equals((java.lang.Object)b10);
    int i12 = stackAr0.size();
    java.lang.Object obj13 = stackAr0.top();
    int i14 = stackAr0.size();
    int i15 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test52"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    stackAr1.push((java.lang.Object)true);
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    java.lang.String str10 = stackAr9.toString();
    int i11 = stackAr9.size();
    java.lang.String str12 = stackAr9.toString();
    stackAr9.push((java.lang.Object)(-1));
    java.lang.Object obj15 = stackAr9.top();
    int i16 = stackAr9.size();
    org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
    java.lang.String str18 = stackAr17.toString();
    stackAr9.push((java.lang.Object)stackAr17);
    boolean b20 = stackAr9.isEmpty();
    int i21 = stackAr9.size();
    boolean b22 = stackAr1.equals((java.lang.Object)stackAr9);
    java.lang.Object obj23 = stackAr9.top();
    org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int)(byte)0);
    boolean b26 = stackAr9.equals((java.lang.Object)stackAr25);
    boolean b27 = stackAr9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1)+ "'", obj15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test53"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    java.lang.Object obj8 = stackAr0.top();
    boolean b9 = stackAr0.isEmpty();
    java.lang.Object obj10 = stackAr0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test54"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    java.lang.Object obj12 = stackAr6.top();
    int i13 = stackAr6.size();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    stackAr6.push((java.lang.Object)stackAr14);
    boolean b17 = stackAr0.equals((java.lang.Object)stackAr6);
    int i18 = stackAr0.size();
    java.lang.Object obj19 = stackAr0.top();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    int i22 = stackAr20.size();
    java.lang.String str23 = stackAr20.toString();
    stackAr20.push((java.lang.Object)(-1));
    java.lang.String str26 = stackAr20.toString();
    java.lang.Object obj27 = stackAr20.top();
    stackAr0.push((java.lang.Object)stackAr20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[-1]"+ "'", str26.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1)+ "'", obj27.equals((-1)));

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test55"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    java.lang.String str3 = stackAr1.toString();
    int i4 = stackAr1.size();
    java.lang.String str5 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test56"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    boolean b8 = stackAr0.isEmpty();
    int i9 = stackAr0.size();
    boolean b10 = stackAr0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test57"); }


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
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test58"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    stackAr5.push((java.lang.Object)"hi!");
    boolean b10 = stackAr5.isEmpty();
    boolean b11 = stackAr5.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    stackAr12.push((java.lang.Object)"hi!");
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
    boolean b28 = stackAr17.isEmpty();
    stackAr12.push((java.lang.Object)stackAr17);
    int i30 = stackAr12.size();
    boolean b31 = stackAr5.equals((java.lang.Object)stackAr12);
    stackAr1.push((java.lang.Object)stackAr12);
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    boolean b34 = stackAr33.isEmpty();
    java.lang.String str35 = stackAr33.toString();
    java.lang.Object obj36 = null;
    stackAr33.push(obj36);
    boolean b39 = stackAr33.equals((java.lang.Object)(-1));
    java.lang.Object obj40 = stackAr33.pop();
    stackAr1.push((java.lang.Object)stackAr33);
    java.lang.String str42 = stackAr33.toString();
    boolean b43 = stackAr33.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
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
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]"+ "'", str42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test59"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    java.lang.Object obj6 = stackAr0.top();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    boolean b8 = stackAr7.isEmpty();
    java.lang.String str9 = stackAr7.toString();
    java.lang.Object obj10 = null;
    stackAr7.push(obj10);
    int i12 = stackAr7.size();
    boolean b13 = stackAr7.isFull();
    int i14 = stackAr7.size();
    boolean b15 = stackAr0.equals((java.lang.Object)stackAr7);
    java.lang.Object obj16 = stackAr7.top();
    boolean b17 = stackAr7.isEmpty();
    java.lang.Object obj18 = stackAr7.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]"+ "'", str5.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!"+ "'", obj6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test60"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    java.lang.Object obj8 = stackAr0.top();
    boolean b9 = stackAr0.isFull();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
    java.lang.String str11 = stackAr10.toString();
    int i12 = stackAr10.size();
    java.lang.String str13 = stackAr10.toString();
    stackAr10.push((java.lang.Object)(-1));
    java.lang.Object obj16 = stackAr10.top();
    boolean b18 = stackAr10.equals((java.lang.Object)1L);
    boolean b19 = stackAr0.equals((java.lang.Object)stackAr10);
    int i20 = stackAr0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test61"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    boolean b3 = stackAr0.isFull();
    int i4 = stackAr0.size();
    boolean b5 = stackAr0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test62"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
    java.lang.String str3 = stackAr2.toString();
    int i4 = stackAr2.size();
    java.lang.String str5 = stackAr2.toString();
    stackAr2.push((java.lang.Object)(-1));
    java.lang.Object obj8 = stackAr2.top();
    int i9 = stackAr2.size();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
    java.lang.String str11 = stackAr10.toString();
    stackAr2.push((java.lang.Object)stackAr10);
    java.lang.Object obj13 = stackAr2.top();
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int)(byte)10);
    boolean b16 = stackAr15.isFull();
    stackAr15.push((java.lang.Object)'4');
    java.lang.Object obj19 = stackAr15.top();
    boolean b20 = stackAr2.equals((java.lang.Object)stackAr15);
    boolean b21 = stackAr0.equals((java.lang.Object)stackAr2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '4'+ "'", obj19.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test63"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)0);
    boolean b2 = stackAr1.isFull();
    boolean b3 = stackAr1.isFull();
    boolean b4 = stackAr1.isEmpty();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int)(byte)0);
    boolean b7 = stackAr6.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    stackAr8.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    boolean b14 = stackAr13.isEmpty();
    java.lang.String str15 = stackAr13.toString();
    org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
    java.lang.String str17 = stackAr16.toString();
    int i18 = stackAr16.size();
    java.lang.String str19 = stackAr16.toString();
    stackAr16.push((java.lang.Object)(-1));
    java.lang.Object obj22 = stackAr16.top();
    boolean b23 = stackAr13.equals((java.lang.Object)stackAr16);
    boolean b24 = stackAr13.isEmpty();
    stackAr8.push((java.lang.Object)stackAr13);
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str28 = stackAr27.toString();
    stackAr27.push((java.lang.Object)(short)(-1));
    java.lang.String str31 = stackAr27.toString();
    boolean b32 = stackAr13.equals((java.lang.Object)str31);
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    java.lang.String str34 = stackAr33.toString();
    int i35 = stackAr33.size();
    java.lang.String str36 = stackAr33.toString();
    stackAr33.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr39 = new org.autotest.StackAr();
    java.lang.String str40 = stackAr39.toString();
    int i41 = stackAr39.size();
    java.lang.String str42 = stackAr39.toString();
    stackAr39.push((java.lang.Object)(-1));
    java.lang.Object obj45 = stackAr39.top();
    int i46 = stackAr39.size();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    stackAr39.push((java.lang.Object)stackAr47);
    boolean b50 = stackAr33.equals((java.lang.Object)stackAr39);
    boolean b51 = stackAr39.isFull();
    boolean b52 = stackAr13.equals((java.lang.Object)stackAr39);
    boolean b53 = stackAr39.isFull();
    boolean b54 = stackAr6.equals((java.lang.Object)b53);
    boolean b55 = stackAr1.equals((java.lang.Object)b54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
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
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[-1]"+ "'", str31.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]"+ "'", str42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1)+ "'", obj45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test64"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.Object obj11 = stackAr0.top();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int)(byte)10);
    boolean b14 = stackAr13.isFull();
    stackAr13.push((java.lang.Object)'4');
    java.lang.Object obj17 = stackAr13.top();
    boolean b18 = stackAr0.equals((java.lang.Object)stackAr13);
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int)(byte)10);
    boolean b21 = stackAr20.isFull();
    stackAr20.push((java.lang.Object)'4');
    boolean b25 = stackAr20.equals((java.lang.Object)100.0d);
    stackAr20.push((java.lang.Object)true);
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
    java.lang.String str29 = stackAr28.toString();
    int i30 = stackAr28.size();
    java.lang.String str31 = stackAr28.toString();
    stackAr28.push((java.lang.Object)(-1));
    java.lang.Object obj34 = stackAr28.top();
    int i35 = stackAr28.size();
    org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
    java.lang.String str37 = stackAr36.toString();
    stackAr28.push((java.lang.Object)stackAr36);
    boolean b39 = stackAr28.isEmpty();
    int i40 = stackAr28.size();
    boolean b41 = stackAr20.equals((java.lang.Object)stackAr28);
    java.lang.Object obj42 = stackAr28.top();
    stackAr13.push((java.lang.Object)stackAr28);
    int i44 = stackAr28.size();
    int i45 = stackAr28.size();
    java.lang.Object obj46 = stackAr28.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '4'+ "'", obj17.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1)+ "'", obj34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj46);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test65"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.Object obj11 = stackAr0.top();
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
    java.lang.Object obj23 = stackAr15.top();
    boolean b24 = stackAr15.isFull();
    boolean b25 = stackAr0.equals((java.lang.Object)stackAr15);
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int)(byte)10);
    boolean b28 = stackAr27.isFull();
    stackAr27.push((java.lang.Object)'4');
    boolean b32 = stackAr27.equals((java.lang.Object)100.0d);
    java.lang.Object obj33 = null;
    boolean b34 = stackAr27.equals(obj33);
    stackAr0.push((java.lang.Object)b34);
    boolean b36 = stackAr0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
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
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (-1)+ "'", obj23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test66"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b8 = stackAr0.equals((java.lang.Object)1L);
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int)(byte)10);
    boolean b11 = stackAr10.isEmpty();
    boolean b12 = stackAr10.isEmpty();
    boolean b13 = stackAr0.equals((java.lang.Object)stackAr10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj14 = stackAr10.top();
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test67"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.Object obj11 = stackAr0.top();
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
    java.lang.Object obj23 = stackAr15.top();
    boolean b24 = stackAr15.isFull();
    boolean b25 = stackAr0.equals((java.lang.Object)stackAr15);
    java.lang.String str26 = stackAr0.toString();
    java.lang.String str27 = stackAr0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
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
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (-1)+ "'", obj23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[-1,[]]"+ "'", str26.equals("[-1,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[-1,[]]"+ "'", str27.equals("[-1,[]]"));

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test68"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    stackAr5.push((java.lang.Object)"hi!");
    boolean b10 = stackAr5.isEmpty();
    boolean b11 = stackAr5.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    stackAr12.push((java.lang.Object)"hi!");
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
    boolean b28 = stackAr17.isEmpty();
    stackAr12.push((java.lang.Object)stackAr17);
    int i30 = stackAr12.size();
    boolean b31 = stackAr5.equals((java.lang.Object)stackAr12);
    stackAr1.push((java.lang.Object)stackAr12);
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    boolean b34 = stackAr33.isEmpty();
    java.lang.String str35 = stackAr33.toString();
    java.lang.Object obj36 = null;
    stackAr33.push(obj36);
    boolean b39 = stackAr33.equals((java.lang.Object)(-1));
    java.lang.Object obj40 = stackAr33.pop();
    stackAr1.push((java.lang.Object)stackAr33);
    java.lang.String str42 = stackAr1.toString();
    java.lang.String str43 = stackAr1.toString();
    java.lang.String str44 = stackAr1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
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
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[-1,[hi!,[]],[]]"+ "'", str42.equals("[-1,[hi!,[]],[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[-1,[hi!,[]],[]]"+ "'", str43.equals("[-1,[hi!,[]],[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[-1,[hi!,[]],[]]"+ "'", str44.equals("[-1,[hi!,[]],[]]"));

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test69"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    stackAr1.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
    java.lang.String str6 = stackAr5.toString();
    int i7 = stackAr5.size();
    stackAr5.push((java.lang.Object)"hi!");
    boolean b10 = stackAr5.isEmpty();
    boolean b11 = stackAr5.isEmpty();
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    stackAr12.push((java.lang.Object)"hi!");
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
    boolean b28 = stackAr17.isEmpty();
    stackAr12.push((java.lang.Object)stackAr17);
    int i30 = stackAr12.size();
    boolean b31 = stackAr5.equals((java.lang.Object)stackAr12);
    stackAr1.push((java.lang.Object)stackAr12);
    boolean b33 = stackAr1.isEmpty();
    org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int)(byte)10);
    boolean b36 = stackAr35.isEmpty();
    boolean b37 = stackAr35.isEmpty();
    org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int)'4');
    boolean b40 = stackAr35.equals((java.lang.Object)stackAr39);
    stackAr1.push((java.lang.Object)stackAr39);
    java.lang.Object obj42 = stackAr1.top();
    int i43 = stackAr1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
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
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 3);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test70"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    int i7 = stackAr0.size();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    stackAr0.push((java.lang.Object)stackAr8);
    java.lang.Object obj11 = stackAr0.top();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int)(byte)10);
    boolean b14 = stackAr13.isFull();
    stackAr13.push((java.lang.Object)'4');
    java.lang.Object obj17 = stackAr13.top();
    boolean b18 = stackAr0.equals((java.lang.Object)stackAr13);
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int)(byte)10);
    boolean b21 = stackAr20.isFull();
    stackAr20.push((java.lang.Object)'4');
    boolean b25 = stackAr20.equals((java.lang.Object)100.0d);
    stackAr20.push((java.lang.Object)true);
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
    java.lang.String str29 = stackAr28.toString();
    int i30 = stackAr28.size();
    java.lang.String str31 = stackAr28.toString();
    stackAr28.push((java.lang.Object)(-1));
    java.lang.Object obj34 = stackAr28.top();
    int i35 = stackAr28.size();
    org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
    java.lang.String str37 = stackAr36.toString();
    stackAr28.push((java.lang.Object)stackAr36);
    boolean b39 = stackAr28.isEmpty();
    int i40 = stackAr28.size();
    boolean b41 = stackAr20.equals((java.lang.Object)stackAr28);
    java.lang.Object obj42 = stackAr28.top();
    stackAr13.push((java.lang.Object)stackAr28);
    int i44 = stackAr28.size();
    java.lang.Object obj45 = stackAr28.top();
    int i46 = stackAr28.size();
    org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int)(byte)0);
    boolean b49 = stackAr48.isFull();
    boolean b50 = stackAr48.isFull();
    boolean b51 = stackAr28.equals((java.lang.Object)stackAr48);
    java.lang.Object obj52 = stackAr28.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1)+ "'", obj6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '4'+ "'", obj17.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1)+ "'", obj34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj52);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test71"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    boolean b6 = stackAr0.isEmpty();
    boolean b7 = stackAr0.isEmpty();
    java.lang.Object obj8 = stackAr0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test72"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    boolean b6 = stackAr0.equals((java.lang.Object)(-1));
    java.lang.Object obj7 = stackAr0.pop();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(short)100);
    boolean b10 = stackAr9.isFull();
    boolean b11 = stackAr0.equals((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    stackAr12.push((java.lang.Object)"hi!");
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
    boolean b28 = stackAr17.isEmpty();
    stackAr12.push((java.lang.Object)stackAr17);
    boolean b31 = stackAr12.equals((java.lang.Object)100);
    java.lang.String str32 = stackAr12.toString();
    boolean b33 = stackAr9.equals((java.lang.Object)stackAr12);
    org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
    java.lang.String str35 = stackAr34.toString();
    int i36 = stackAr34.size();
    java.lang.String str37 = stackAr34.toString();
    stackAr34.push((java.lang.Object)(-1));
    java.lang.Object obj40 = stackAr34.top();
    boolean b42 = stackAr34.equals((java.lang.Object)1L);
    boolean b43 = stackAr34.isFull();
    boolean b44 = stackAr34.isEmpty();
    org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
    boolean b46 = stackAr45.isEmpty();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    int i49 = stackAr47.size();
    stackAr47.push((java.lang.Object)"hi!");
    java.lang.String str52 = stackAr47.toString();
    stackAr45.push((java.lang.Object)str52);
    java.lang.Object obj54 = stackAr45.top();
    stackAr34.push((java.lang.Object)stackAr45);
    stackAr9.push((java.lang.Object)stackAr34);
    int i57 = stackAr34.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
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
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[hi!,[]]"+ "'", str32.equals("[hi!,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (-1)+ "'", obj40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[hi!]"+ "'", str52.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "[hi!]"+ "'", obj54.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 2);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test73"); }


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
    java.lang.Object obj11 = stackAr3.top();
    int i12 = stackAr3.size();
    boolean b13 = stackAr3.isEmpty();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    int i16 = stackAr14.size();
    java.lang.String str17 = stackAr14.toString();
    stackAr14.push((java.lang.Object)(-1));
    java.lang.Object obj20 = stackAr14.top();
    int i21 = stackAr14.size();
    org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
    java.lang.String str23 = stackAr22.toString();
    stackAr14.push((java.lang.Object)stackAr22);
    boolean b25 = stackAr14.isEmpty();
    java.lang.Object obj26 = stackAr14.top();
    java.lang.Object obj27 = stackAr14.top();
    boolean b28 = stackAr14.isFull();
    org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int)(byte)10);
    boolean b31 = stackAr30.isFull();
    stackAr30.push((java.lang.Object)'4');
    boolean b35 = stackAr30.equals((java.lang.Object)100.0d);
    java.lang.String str36 = stackAr30.toString();
    boolean b37 = stackAr14.equals((java.lang.Object)str36);
    stackAr3.push((java.lang.Object)stackAr14);
    
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
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1)+ "'", obj20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[4]"+ "'", str36.equals("[4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test74"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int)(byte)10);
    boolean b8 = stackAr7.isFull();
    boolean b9 = stackAr7.isFull();
    stackAr1.push((java.lang.Object)stackAr7);
    java.lang.Object obj11 = stackAr1.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

}
