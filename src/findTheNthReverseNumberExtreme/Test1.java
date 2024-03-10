package findTheNthReverseNumberExtreme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class Test1 {
	
	@Test
    void testFixed() {
        assertEquals(new BigInteger("0"), Palindrome.findReverseNumber(1));
        assertEquals(new BigInteger("1"), Palindrome.findReverseNumber(2));
        assertEquals(new BigInteger("9"), Palindrome.findReverseNumber(10));
        assertEquals(new BigInteger("909"), Palindrome.findReverseNumber(100));
        assertEquals(new BigInteger("900000000000000000009"), Palindrome.findReverseNumber(100000000000L));
    }


}
