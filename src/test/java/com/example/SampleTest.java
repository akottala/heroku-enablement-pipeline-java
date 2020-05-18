package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {

   @Test
   public void testNum() {
     assertEquals(10, Sample.num());
   }

   @Test
   public void testString() {
     assertEquals("Loan Ipsum", Sample.string());
   }

   @Test public void testBiggestPrimeNumberOfInt() {
     assertEquals(true, Sample.isPrime(2147483647));
   }

   @Test public void testHugePrimeNumber() {
     assertEquals(true, Sample.isPrime(1393649));
   }

   @Test public void testBigPrimeNumber() {
     assertEquals(true, Sample.isPrime(3571));
   }

   @Test public void testPrime0() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime1() { assertEquals(false, Sample.isPrime(1)); }
   @Test public void testPrime2() { assertEquals(true, Sample.isPrime(2)); }
   @Test public void testPrime3() { assertEquals(true, Sample.isPrime(3)); }
   @Test public void testPrime4() { assertEquals(false, Sample.isPrime(4)); }
   @Test public void testPrime5() { assertEquals(true, Sample.isPrime(5)); }
   @Test public void testPrime6() { assertEquals(false, Sample.isPrime(6)); }
   @Test public void testPrime7() { assertEquals(true, Sample.isPrime(7)); }
   @Test public void testPrime8() { assertEquals(false, Sample.isPrime(8)); }
   @Test public void testPrime9() { assertEquals(false, Sample.isPrime(9)); }

   @Test public void testPrime10() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime11() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime12() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime13() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime14() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime15() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime16() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime17() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime18() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime19() { assertEquals(false, Sample.isPrime(0)); }

   @Test public void testPrime20() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime21() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime22() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime23() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime24() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime25() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime26() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime27() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime28() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime29() { assertEquals(false, Sample.isPrime(0)); }

   @Test public void testPrime30() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime31() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime32() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime33() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime34() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime35() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime36() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime37() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime38() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime39() { assertEquals(false, Sample.isPrime(0)); }

   @Test public void testPrime40() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime41() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime42() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime43() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime44() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime45() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime46() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime47() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime48() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime49() { assertEquals(false, Sample.isPrime(0)); }

   @Test public void testPrime50() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime51() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime52() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime53() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime54() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime55() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime56() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime57() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime58() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime59() { assertEquals(false, Sample.isPrime(0)); }

   @Test public void testPrime60() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime61() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime62() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime63() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime64() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime65() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime66() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime67() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime68() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime69() { assertEquals(false, Sample.isPrime(0)); }

   @Test public void testPrime70() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime71() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime72() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime73() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime74() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime75() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime76() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime77() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime78() { assertEquals(false, Sample.isPrime(0)); }
   @Test public void testPrime79() { assertEquals(false, Sample.isPrime(0)); }
}
