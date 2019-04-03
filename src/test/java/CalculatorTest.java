import java.math.BigInteger;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void getSumm() {
        Calculator calc = new Calculator();
        assertEquals( "132", calc.getSumm( BigInteger.valueOf(100), BigInteger.valueOf(32) ).toString());
        assertEquals( "100", calc.getSumm( BigInteger.valueOf(50), BigInteger.valueOf(50) ).toString());
        assertEquals( "13", calc.getSumm( BigInteger.valueOf(10), BigInteger.valueOf(3) ).toString());
    }

    @org.junit.Test
    public void getMultiply() {
        Calculator calc = new Calculator();
        //assertEquals("200", calc.getMul( BigInteger.valueOf(20),  BigInteger.valueOf(10)).toString(), "20 x 10 must be 200");
    }
}