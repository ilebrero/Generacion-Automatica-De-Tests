
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    java.lang.Object obj7 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


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
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    java.lang.Object obj5 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
    java.lang.String str3 = stackAr2.toString();
    int i4 = stackAr2.size();
    stackAr2.push((java.lang.Object)"hi!");
    java.lang.String str7 = stackAr2.toString();
    stackAr0.push((java.lang.Object)str7);
    java.lang.Object obj9 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    java.lang.Object obj6 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    java.lang.Object obj6 = stackAr1.top();
    java.lang.Object obj7 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    stackAr0.push((java.lang.Object)"hi!");
    boolean b10 = stackAr0.isFull();
    java.lang.Object obj11 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


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
    java.lang.Object obj21 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


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
    java.lang.Object obj30 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    stackAr1.push((java.lang.Object)true);
    java.lang.Object obj9 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    java.lang.Object obj7 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


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
    boolean b16 = stackAr3.equals((java.lang.Object)(byte)(-1));
    java.lang.Object obj17 = stackAr3.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b8 = stackAr0.equals((java.lang.Object)1L);
    java.lang.Object obj9 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    int i7 = stackAr0.size();
    java.lang.Object obj8 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


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
    java.lang.Object obj15 = stackAr8.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr8", stackAr8.repOK());

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.Object obj5 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    boolean b8 = stackAr0.isEmpty();
    java.lang.Object obj9 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    stackAr0.push((java.lang.Object)(short)(-1));
    java.lang.Object obj8 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


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
    boolean b18 = stackAr6.isFull();
    java.lang.Object obj19 = stackAr6.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int)(short)10);
    boolean b8 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)b8);
    java.lang.Object obj10 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


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
    java.lang.Object obj13 = stackAr3.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


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
    java.lang.Object obj14 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    stackAr0.push((java.lang.Object)(short)(-1));
    boolean b8 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
    boolean b10 = stackAr9.isEmpty();
    boolean b12 = stackAr9.equals((java.lang.Object)1);
    boolean b13 = stackAr9.isFull();
    stackAr0.push((java.lang.Object)stackAr9);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
    java.lang.String str16 = stackAr15.toString();
    int i17 = stackAr15.size();
    java.lang.String str18 = stackAr15.toString();
    stackAr15.push((java.lang.Object)(-1));
    java.lang.Object obj21 = stackAr15.top();
    int i22 = stackAr15.size();
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
    java.lang.String str24 = stackAr23.toString();
    stackAr15.push((java.lang.Object)stackAr23);
    java.lang.Object obj26 = stackAr15.top();
    org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int)(byte)10);
    boolean b29 = stackAr28.isFull();
    stackAr28.push((java.lang.Object)'4');
    java.lang.Object obj32 = stackAr28.top();
    boolean b33 = stackAr15.equals((java.lang.Object)stackAr28);
    java.lang.Object obj34 = stackAr15.top();
    stackAr9.push(obj34);
    java.lang.Object obj36 = stackAr9.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


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
    java.lang.Object obj19 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


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
    boolean b26 = stackAr0.isEmpty();
    java.lang.Object obj27 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr(2);
    stackAr0.push((java.lang.Object)stackAr6);
    stackAr0.push((java.lang.Object)"[4]");
    java.lang.Object obj10 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


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
    java.lang.Object obj46 = stackAr28.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr28", stackAr28.repOK());

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


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
    java.lang.Object obj26 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    java.lang.Object obj5 = stackAr1.top();
    boolean b6 = stackAr1.isFull();
    java.lang.String str7 = stackAr1.toString();
    java.lang.Object obj8 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


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
    java.lang.Object obj33 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    java.lang.Object obj7 = stackAr0.top();
    java.lang.Object obj8 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


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
    boolean b21 = stackAr1.isFull();
    org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
    java.lang.String str23 = stackAr22.toString();
    int i24 = stackAr22.size();
    java.lang.String str25 = stackAr22.toString();
    stackAr22.push((java.lang.Object)(-1));
    int i28 = stackAr22.size();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
    boolean b30 = stackAr29.isEmpty();
    boolean b32 = stackAr29.equals((java.lang.Object)1);
    boolean b33 = stackAr29.isFull();
    stackAr22.push((java.lang.Object)stackAr29);
    stackAr1.push((java.lang.Object)stackAr22);
    java.lang.Object obj36 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


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
    java.lang.Object obj22 = stackAr3.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    stackAr0.push((java.lang.Object)(short)(-1));
    boolean b8 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str11 = stackAr10.toString();
    stackAr10.push((java.lang.Object)"[-1]");
    boolean b14 = stackAr0.equals((java.lang.Object)stackAr10);
    java.lang.Object obj15 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


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
    int i12 = stackAr3.size();
    java.lang.Object obj13 = stackAr3.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


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
    java.lang.Object obj19 = stackAr0.top();
    java.lang.Object obj20 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


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
    java.lang.String str11 = stackAr0.toString();
    java.lang.Object obj12 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


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
    java.lang.Object obj18 = stackAr6.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.String str6 = stackAr0.toString();
    java.lang.String str7 = stackAr0.toString();
    boolean b8 = stackAr0.isEmpty();
    boolean b9 = stackAr0.isFull();
    boolean b10 = stackAr0.isEmpty();
    java.lang.Object obj11 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    int i5 = stackAr0.size();
    int i6 = stackAr0.size();
    java.lang.Object obj7 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


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
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    stackAr18.push((java.lang.Object)"hi!");
    boolean b23 = stackAr18.isEmpty();
    stackAr5.push((java.lang.Object)b23);
    java.lang.Object obj25 = stackAr5.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b7 = stackAr0.isFull();
    boolean b8 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int)'a');
    boolean b11 = stackAr10.isEmpty();
    boolean b12 = stackAr0.equals((java.lang.Object)stackAr10);
    java.lang.Object obj13 = stackAr0.top();
    java.lang.Object obj14 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    int i6 = stackAr0.size();
    java.lang.Object obj7 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    java.lang.Object obj3 = null;
    stackAr0.push(obj3);
    int i5 = stackAr0.size();
    stackAr0.push((java.lang.Object)(short)(-1));
    org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int)(byte)0);
    boolean b10 = stackAr9.isFull();
    boolean b11 = stackAr9.isFull();
    boolean b12 = stackAr0.equals((java.lang.Object)b11);
    java.lang.Object obj13 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


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
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
    java.lang.String str19 = stackAr18.toString();
    int i20 = stackAr18.size();
    stackAr18.push((java.lang.Object)"hi!");
    boolean b23 = stackAr18.isEmpty();
    stackAr5.push((java.lang.Object)b23);
    org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
    boolean b26 = stackAr25.isEmpty();
    java.lang.String str27 = stackAr25.toString();
    java.lang.Object obj28 = null;
    stackAr25.push(obj28);
    int i30 = stackAr25.size();
    stackAr25.push((java.lang.Object)(short)(-1));
    boolean b33 = stackAr25.isEmpty();
    org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
    boolean b35 = stackAr34.isEmpty();
    boolean b37 = stackAr34.equals((java.lang.Object)1);
    boolean b38 = stackAr34.isFull();
    stackAr25.push((java.lang.Object)stackAr34);
    boolean b40 = stackAr5.equals((java.lang.Object)stackAr25);
    java.lang.Object obj41 = stackAr5.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


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
    org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
    boolean b34 = stackAr33.isEmpty();
    java.lang.String str35 = stackAr33.toString();
    java.lang.Object obj36 = null;
    stackAr33.push(obj36);
    int i38 = stackAr33.size();
    stackAr33.push((java.lang.Object)(short)(-1));
    boolean b41 = stackAr33.isEmpty();
    org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
    boolean b43 = stackAr42.isEmpty();
    boolean b45 = stackAr42.equals((java.lang.Object)1);
    boolean b46 = stackAr42.isFull();
    stackAr33.push((java.lang.Object)stackAr42);
    org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
    java.lang.String str49 = stackAr48.toString();
    int i50 = stackAr48.size();
    java.lang.String str51 = stackAr48.toString();
    stackAr48.push((java.lang.Object)(-1));
    java.lang.Object obj54 = stackAr48.top();
    int i55 = stackAr48.size();
    org.autotest.StackAr stackAr56 = new org.autotest.StackAr();
    java.lang.String str57 = stackAr56.toString();
    stackAr48.push((java.lang.Object)stackAr56);
    java.lang.Object obj59 = stackAr48.top();
    org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int)(byte)10);
    boolean b62 = stackAr61.isFull();
    stackAr61.push((java.lang.Object)'4');
    java.lang.Object obj65 = stackAr61.top();
    boolean b66 = stackAr48.equals((java.lang.Object)stackAr61);
    java.lang.Object obj67 = stackAr48.top();
    stackAr42.push(obj67);
    boolean b69 = stackAr0.equals(obj67);
    java.lang.Object obj70 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


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
    boolean b18 = stackAr6.isFull();
    boolean b19 = stackAr6.isEmpty();
    stackAr6.push((java.lang.Object)"[null]");
    java.lang.Object obj22 = stackAr6.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


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
    java.lang.Object obj14 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


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
    java.lang.Object obj44 = stackAr13.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr13", stackAr13.repOK());

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)'a');
    boolean b2 = stackAr1.isEmpty();
    int i3 = stackAr1.size();
    org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int)(short)1);
    boolean b6 = stackAr5.isFull();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    stackAr7.push((java.lang.Object)"hi!");
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
    boolean b23 = stackAr12.isEmpty();
    stackAr7.push((java.lang.Object)stackAr12);
    boolean b25 = stackAr5.equals((java.lang.Object)stackAr7);
    org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
    boolean b27 = stackAr26.isEmpty();
    java.lang.String str28 = stackAr26.toString();
    java.lang.Object obj29 = null;
    stackAr26.push(obj29);
    int i31 = stackAr26.size();
    stackAr26.push((java.lang.Object)(short)(-1));
    boolean b34 = stackAr26.isEmpty();
    boolean b35 = stackAr5.equals((java.lang.Object)stackAr26);
    stackAr1.push((java.lang.Object)stackAr26);
    java.lang.Object obj37 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isEmpty();
    boolean b6 = stackAr0.isEmpty();
    java.lang.Object obj7 = stackAr0.top();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    boolean b9 = stackAr8.isEmpty();
    java.lang.String str10 = stackAr8.toString();
    java.lang.Object obj11 = null;
    stackAr8.push(obj11);
    int i13 = stackAr8.size();
    int i14 = stackAr8.size();
    boolean b15 = stackAr8.isEmpty();
    boolean b16 = stackAr8.isFull();
    org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int)(short)100);
    boolean b19 = stackAr18.isEmpty();
    boolean b20 = stackAr8.equals((java.lang.Object)stackAr18);
    boolean b21 = stackAr0.equals((java.lang.Object)b20);
    java.lang.Object obj22 = stackAr0.top();
    int i23 = stackAr0.size();
    java.lang.Object obj24 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


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
    boolean b12 = stackAr0.isEmpty();
    java.lang.Object obj13 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


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
    java.lang.Object obj28 = stackAr9.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    boolean b2 = stackAr1.isFull();
    stackAr1.push((java.lang.Object)'4');
    boolean b6 = stackAr1.equals((java.lang.Object)100.0d);
    java.lang.Object obj7 = null;
    boolean b8 = stackAr1.equals(obj7);
    java.lang.Object obj9 = stackAr1.top();
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int)(short)1);
    boolean b12 = stackAr11.isFull();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    stackAr13.push((java.lang.Object)"hi!");
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
    boolean b29 = stackAr18.isEmpty();
    stackAr13.push((java.lang.Object)stackAr18);
    boolean b31 = stackAr11.equals((java.lang.Object)stackAr13);
    org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
    boolean b33 = stackAr32.isEmpty();
    java.lang.String str34 = stackAr32.toString();
    java.lang.Object obj35 = null;
    stackAr32.push(obj35);
    int i37 = stackAr32.size();
    stackAr32.push((java.lang.Object)(short)(-1));
    boolean b40 = stackAr32.isEmpty();
    boolean b41 = stackAr11.equals((java.lang.Object)stackAr32);
    stackAr1.push((java.lang.Object)stackAr11);
    java.lang.Object obj43 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


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
    java.lang.Object obj42 = stackAr1.top();
    java.lang.Object obj43 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


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
    java.lang.Object obj19 = stackAr0.top();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    int i22 = stackAr20.size();
    java.lang.String str23 = stackAr20.toString();
    stackAr20.push((java.lang.Object)(-1));
    java.lang.Object obj26 = stackAr20.top();
    int i27 = stackAr20.size();
    org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int)(byte)10);
    boolean b30 = stackAr29.isFull();
    stackAr29.push((java.lang.Object)'4');
    java.lang.Object obj33 = stackAr29.top();
    boolean b34 = stackAr29.isFull();
    stackAr20.push((java.lang.Object)stackAr29);
    stackAr0.push((java.lang.Object)stackAr29);
    java.lang.Object obj37 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


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
    java.lang.Object obj52 = stackAr28.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr28", stackAr28.repOK());

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    boolean b1 = stackAr0.isEmpty();
    java.lang.String str2 = stackAr0.toString();
    boolean b4 = stackAr0.equals((java.lang.Object)(short)0);
    int i5 = stackAr0.size();
    boolean b6 = stackAr0.isFull();
    boolean b7 = stackAr0.isFull();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
    java.lang.String str9 = stackAr8.toString();
    int i10 = stackAr8.size();
    java.lang.String str11 = stackAr8.toString();
    stackAr8.push((java.lang.Object)(-1));
    java.lang.String str14 = stackAr8.toString();
    java.lang.String str15 = stackAr8.toString();
    boolean b16 = stackAr8.isEmpty();
    stackAr0.push((java.lang.Object)b16);
    java.lang.Object obj18 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


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
    java.lang.Object obj16 = stackAr9.top();
    java.lang.Object obj17 = stackAr9.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


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
    java.lang.String str52 = stackAr28.toString();
    java.lang.Object obj53 = stackAr28.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr28", stackAr28.repOK());

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    int i5 = stackAr0.size();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    stackAr6.push((java.lang.Object)"hi!");
    org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
    boolean b12 = stackAr11.isEmpty();
    java.lang.String str13 = stackAr11.toString();
    org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
    java.lang.String str15 = stackAr14.toString();
    int i16 = stackAr14.size();
    java.lang.String str17 = stackAr14.toString();
    stackAr14.push((java.lang.Object)(-1));
    java.lang.Object obj20 = stackAr14.top();
    boolean b21 = stackAr11.equals((java.lang.Object)stackAr14);
    boolean b22 = stackAr11.isEmpty();
    stackAr6.push((java.lang.Object)stackAr11);
    int i24 = stackAr6.size();
    boolean b25 = stackAr0.equals((java.lang.Object)stackAr6);
    java.lang.Object obj26 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


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
    boolean b18 = stackAr6.isFull();
    boolean b19 = stackAr6.isFull();
    java.lang.Object obj20 = stackAr6.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    java.lang.String str5 = stackAr0.toString();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int)(short)10);
    boolean b8 = stackAr7.isFull();
    stackAr0.push((java.lang.Object)b8);
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
    boolean b11 = stackAr10.isEmpty();
    java.lang.String str12 = stackAr10.toString();
    stackAr0.push((java.lang.Object)str12);
    org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int)(short)1);
    boolean b16 = stackAr15.isFull();
    boolean b17 = stackAr15.isFull();
    boolean b18 = stackAr0.equals((java.lang.Object)b17);
    java.lang.Object obj19 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    int i5 = stackAr0.size();
    java.lang.String str6 = stackAr0.toString();
    java.lang.Object obj7 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


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
    boolean b21 = stackAr1.isFull();
    java.lang.Object obj22 = stackAr1.top();
    java.lang.Object obj23 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isEmpty();
    boolean b6 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
    java.lang.String str8 = stackAr7.toString();
    int i9 = stackAr7.size();
    stackAr7.push((java.lang.Object)"hi!");
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
    boolean b23 = stackAr12.isEmpty();
    stackAr7.push((java.lang.Object)stackAr12);
    int i25 = stackAr7.size();
    boolean b26 = stackAr0.equals((java.lang.Object)stackAr7);
    org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
    java.lang.String str28 = stackAr27.toString();
    int i29 = stackAr27.size();
    java.lang.String str30 = stackAr27.toString();
    stackAr27.push((java.lang.Object)(-1));
    java.lang.Object obj33 = stackAr27.top();
    boolean b35 = stackAr27.equals((java.lang.Object)1L);
    boolean b36 = stackAr27.isFull();
    boolean b37 = stackAr27.isEmpty();
    java.lang.Object obj38 = stackAr27.top();
    stackAr7.push((java.lang.Object)stackAr27);
    java.lang.Object obj40 = stackAr7.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    boolean b7 = stackAr0.equals((java.lang.Object)'a');
    stackAr0.push((java.lang.Object)"hi!");
    int i10 = stackAr0.size();
    java.lang.Object obj11 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isEmpty();
    boolean b6 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int)(short)100);
    boolean b9 = stackAr8.isFull();
    stackAr0.push((java.lang.Object)stackAr8);
    boolean b11 = stackAr0.isFull();
    java.lang.Object obj12 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


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
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


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
    int i35 = stackAr18.size();
    java.lang.Object obj36 = stackAr18.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr18", stackAr18.repOK());

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


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
    java.lang.Object obj21 = stackAr1.top();
    java.lang.Object obj22 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


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
    java.lang.Object obj19 = stackAr13.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr13", stackAr13.repOK());

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


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
    boolean b34 = stackAr26.isEmpty();
    int i35 = stackAr26.size();
    java.lang.Object obj36 = stackAr26.top();
    boolean b37 = stackAr1.equals((java.lang.Object)stackAr26);
    boolean b38 = stackAr26.isEmpty();
    java.lang.Object obj39 = stackAr26.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr26", stackAr26.repOK());

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


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
    boolean b12 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1));
    java.lang.Object obj19 = stackAr13.top();
    boolean b20 = stackAr13.isFull();
    boolean b21 = stackAr13.isEmpty();
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int)'a');
    boolean b24 = stackAr23.isEmpty();
    boolean b25 = stackAr13.equals((java.lang.Object)stackAr23);
    boolean b26 = stackAr0.equals((java.lang.Object)stackAr13);
    java.lang.Object obj27 = stackAr0.top();
    java.lang.Object obj28 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


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
    boolean b34 = stackAr18.isFull();
    java.lang.Object obj35 = stackAr18.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr18", stackAr18.repOK());

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


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
    java.lang.Object obj14 = stackAr3.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


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
    boolean b12 = stackAr0.isEmpty();
    org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
    java.lang.String str14 = stackAr13.toString();
    int i15 = stackAr13.size();
    java.lang.String str16 = stackAr13.toString();
    stackAr13.push((java.lang.Object)(-1));
    java.lang.Object obj19 = stackAr13.top();
    boolean b20 = stackAr13.isFull();
    boolean b21 = stackAr13.isEmpty();
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int)'a');
    boolean b24 = stackAr23.isEmpty();
    boolean b25 = stackAr13.equals((java.lang.Object)stackAr23);
    boolean b26 = stackAr0.equals((java.lang.Object)stackAr13);
    java.lang.Object obj27 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


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
    boolean b27 = stackAr0.isFull();
    java.lang.String str28 = stackAr0.toString();
    int i29 = stackAr0.size();
    java.lang.Object obj30 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


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
    java.lang.Object obj27 = stackAr9.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


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
    int i22 = stackAr3.size();
    java.lang.Object obj23 = stackAr3.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr3", stackAr3.repOK());

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


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
    java.lang.Object obj44 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


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
    java.lang.Object obj55 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


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
    java.lang.Object obj12 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int)(byte)10);
    boolean b8 = stackAr7.isFull();
    boolean b9 = stackAr7.isFull();
    stackAr1.push((java.lang.Object)stackAr7);
    java.lang.Object obj11 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


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
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int)(byte)10);
    boolean b48 = stackAr47.isFull();
    java.lang.String str49 = stackAr47.toString();
    boolean b50 = stackAr47.isEmpty();
    boolean b51 = stackAr47.isEmpty();
    stackAr28.push((java.lang.Object)stackAr47);
    java.lang.Object obj53 = stackAr28.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr28", stackAr28.repOK());

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    boolean b2 = stackAr0.isFull();
    org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
    java.lang.String str4 = stackAr3.toString();
    boolean b5 = stackAr3.isFull();
    int i6 = stackAr3.size();
    stackAr0.push((java.lang.Object)i6);
    boolean b8 = stackAr0.isFull();
    java.lang.Object obj9 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


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
    java.lang.Object obj30 = stackAr0.top();
    java.lang.Object obj31 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    java.lang.String str3 = stackAr0.toString();
    stackAr0.push((java.lang.Object)(-1));
    java.lang.Object obj6 = stackAr0.top();
    boolean b8 = stackAr0.equals((java.lang.Object)1L);
    java.lang.Object obj9 = stackAr0.top();
    java.lang.Object obj10 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


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
    java.lang.Object obj20 = stackAr0.top();
    java.lang.Object obj21 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


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
    org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
    boolean b33 = stackAr32.isEmpty();
    java.lang.String str34 = stackAr32.toString();
    java.lang.Object obj35 = null;
    stackAr32.push(obj35);
    int i37 = stackAr32.size();
    int i38 = stackAr32.size();
    boolean b39 = stackAr32.isEmpty();
    boolean b40 = stackAr32.isFull();
    org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int)(short)100);
    boolean b43 = stackAr42.isEmpty();
    boolean b44 = stackAr32.equals((java.lang.Object)stackAr42);
    stackAr18.push((java.lang.Object)stackAr32);
    boolean b46 = stackAr18.isEmpty();
    org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
    java.lang.String str48 = stackAr47.toString();
    int i49 = stackAr47.size();
    stackAr47.push((java.lang.Object)"hi!");
    boolean b52 = stackAr47.isEmpty();
    boolean b53 = stackAr47.isEmpty();
    java.lang.Object obj54 = stackAr47.top();
    boolean b55 = stackAr18.equals((java.lang.Object)stackAr47);
    java.lang.Object obj56 = stackAr47.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr47", stackAr47.repOK());

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


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
    java.lang.String str37 = stackAr0.toString();
    boolean b38 = stackAr0.isFull();
    java.lang.Object obj39 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int)(byte)10);
    boolean b5 = stackAr4.isFull();
    stackAr4.push((java.lang.Object)'4');
    java.lang.Object obj8 = stackAr4.top();
    boolean b9 = stackAr4.isFull();
    java.lang.String str10 = stackAr4.toString();
    stackAr1.push((java.lang.Object)str10);
    int i12 = stackAr1.size();
    java.lang.Object obj13 = stackAr1.top();
    java.lang.Object obj14 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str2 = stackAr1.toString();
    boolean b3 = stackAr1.isEmpty();
    stackAr1.push((java.lang.Object)100.0f);
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    boolean b7 = stackAr6.isEmpty();
    java.lang.String str8 = stackAr6.toString();
    java.lang.Object obj9 = null;
    stackAr6.push(obj9);
    int i11 = stackAr6.size();
    java.lang.Object obj12 = stackAr6.pop();
    int i13 = stackAr6.size();
    stackAr1.push((java.lang.Object)stackAr6);
    boolean b15 = stackAr1.isEmpty();
    java.lang.Object obj16 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


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
    java.lang.String str29 = stackAr28.toString();
    int i30 = stackAr28.size();
    boolean b32 = stackAr28.equals((java.lang.Object)(short)100);
    java.lang.String str33 = stackAr28.toString();
    boolean b34 = stackAr20.equals((java.lang.Object)stackAr28);
    stackAr0.push((java.lang.Object)stackAr28);
    boolean b36 = stackAr0.isFull();
    java.lang.Object obj37 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


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
    java.lang.Object obj44 = stackAr28.top();
    java.lang.Object obj45 = stackAr28.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr28", stackAr28.repOK());

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


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
    java.lang.String str14 = stackAr0.toString();
    java.lang.Object obj15 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


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
    java.lang.Object obj13 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


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
    java.lang.String str12 = stackAr0.toString();
    java.lang.String str13 = stackAr0.toString();
    java.lang.Object obj14 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


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
    java.lang.Object obj43 = stackAr28.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr28", stackAr28.repOK());

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isFull();
    boolean b6 = stackAr0.isFull();
    java.lang.Object obj7 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


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
    boolean b21 = stackAr1.isFull();
    org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int)(byte)10);
    boolean b24 = stackAr23.isFull();
    int i25 = stackAr23.size();
    stackAr1.push((java.lang.Object)i25);
    java.lang.Object obj27 = stackAr1.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int)(byte)10);
    java.lang.String str5 = stackAr4.toString();
    stackAr4.push((java.lang.Object)(short)(-1));
    stackAr0.push((java.lang.Object)(short)(-1));
    java.lang.Object obj9 = stackAr0.top();
    org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
    boolean b11 = stackAr10.isEmpty();
    java.lang.String str12 = stackAr10.toString();
    java.lang.Object obj13 = null;
    stackAr10.push(obj13);
    int i15 = stackAr10.size();
    java.lang.String str16 = stackAr10.toString();
    boolean b17 = stackAr10.isEmpty();
    boolean b18 = stackAr10.isFull();
    boolean b19 = stackAr0.equals((java.lang.Object)stackAr10);
    java.lang.Object obj20 = stackAr0.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


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
    java.lang.Object obj23 = stackAr9.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
    java.lang.String str1 = stackAr0.toString();
    int i2 = stackAr0.size();
    stackAr0.push((java.lang.Object)"hi!");
    boolean b5 = stackAr0.isFull();
    org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
    java.lang.String str7 = stackAr6.toString();
    int i8 = stackAr6.size();
    java.lang.String str9 = stackAr6.toString();
    stackAr6.push((java.lang.Object)(-1));
    org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
    java.lang.String str13 = stackAr12.toString();
    int i14 = stackAr12.size();
    java.lang.String str15 = stackAr12.toString();
    stackAr12.push((java.lang.Object)(-1));
    java.lang.Object obj18 = stackAr12.top();
    int i19 = stackAr12.size();
    org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
    java.lang.String str21 = stackAr20.toString();
    stackAr12.push((java.lang.Object)stackAr20);
    boolean b23 = stackAr6.equals((java.lang.Object)stackAr12);
    stackAr0.push((java.lang.Object)stackAr6);
    boolean b25 = stackAr6.isFull();
    java.lang.Object obj26 = stackAr6.pop();
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());

  }

}
