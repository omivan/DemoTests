import java.math.BigInteger;

public class Program {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        BigInteger c = calc.getSumm(BigInteger.valueOf(2) ,BigInteger.valueOf(5));
        System.out.println(c);
    }
}
