import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Lab1 {

    public static void main(String[] args) {

        Scanner readN = new Scanner(System.in);
        System.out.print("n= ");
        int n = readN.nextInt();
        readN.close();

         Harmonic series=new Harmonic();
         series.countSum(n);
    }
}