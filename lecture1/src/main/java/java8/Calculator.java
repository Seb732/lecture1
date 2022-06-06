package java8;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {

    public long plus(int x, int y) {
        return (long) x + y;
    }

    public BigInteger minus(int x, int y) {
        return BigInteger.valueOf(x).subtract(BigInteger.valueOf(y));
    }

    //TODO add multiple/divide
    public BigDecimal multiple(int x, int y){
        return BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y));
    }

    public BigDecimal divide(int x, int y){
        return BigDecimal.valueOf(x).divide(BigDecimal.valueOf(y));
    }

}

class ImprovedCalculator extends Calculator {
}

