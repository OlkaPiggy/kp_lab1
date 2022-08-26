import java.math.BigDecimal;
import java.util.Scanner;

public class Harmonic {
    private int N;
    private double Sum;
    private BigDecimal SumB;
    public void countSum(int n)
    {
        int curN=1;
        double add=0;
        Sum=0;
        SumB = new BigDecimal("0");

        if(n<15) {
            for (int i = 0; i < n; ++i) {
                add = (1.0 / curN);
                Sum += add;
                curN++;
            }
            System.out.printf("%f", Sum);
        }
        else {
            for (int i = 0; i < n; ++i) {
                add = (1.0 / curN);

                BigDecimal Add = new BigDecimal(add);
                SumB=SumB.add(Add);
                // BigInteger result = integer.add(BigInteger.valueOf(long(add));
                curN++;
            }
            System.out.println(SumB);
        }
    }
}
