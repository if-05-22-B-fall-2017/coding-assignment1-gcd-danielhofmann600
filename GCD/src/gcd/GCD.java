/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;
import java.util.List;


/**
 *
 * @author Daniel
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Gcd of 345 and 678:\n"); /*Sollte mit allen Zahlen funktionieren */
        int num1 = 345;
        int num2 = 678;
        int primeFactors = gcdPrimeFactors(num1,num2);
        int euclid = gcdEuclid(num1,num2);
        
    }

    private static int gcdPrimeFactors(int num1, int num2) {
        System.out.printf("Prime facrors of first number\n");
        int[] primeFactors1 = getPrimeFactors(num1);
        System.out.printf("Prime facrors of second number\n");
        int[] primeFactors2 = getPrimeFactors(num2);
        int gcd = 1;
        boolean addet = false;
        if(primeFactors1.length >= primeFactors2.length){
            for (int i = 0; i < primeFactors1.length; i++) {
                for (int j = 0; j < primeFactors2.length; j++) {
                    if(primeFactors2[j] == primeFactors1[i] && addet == false){
                        gcd *= primeFactors2[j];
                        addet = true;
                    }
                }
                addet = false;
            }
        }
        else{
            for (int i = 0; i < primeFactors2.length; i++) {
                for (int j = 0; j < primeFactors1.length; j++) {
                    if (primeFactors1[j] == primeFactors2[i] && addet == false) {
                        gcd *= primeFactors1[j];
                        addet = true;
                    }
                }
                addet = false;
            }
        }
        System.out.printf("%d is the gcd of 345 and 678\n", gcd);
        return gcd;
    }

    private static int gcdEuclid(int num1, int num2) {
        System.out.printf("Euclidian Formular:\n");
        while(true){
            int x = num1;
            num1 = num2;
            num2 = x % num2;
            System.out.printf("%d and %d\n",num1,num2);
            if(num2 == 0){
                System.out.printf("%d is the gcd of 345 and 678\n", num1);
                return num1;
            }
        }
    }

    private static int[] getPrimeFactors(int num) {
        int quotient = 2;
        int[] primes = new int[0];
        int[] help = new int[0];
        while(num != 1){
            if(num % quotient == 0){
                System.out.printf("Prime Factor: %d\n",quotient);
                num /= quotient;
                help = primes;
                primes = new int[help.length + 1];
                for (int i = 0; i < help.length; i++) {
                    primes[i] = help[i];
                }
                primes[primes.length-1] = quotient;
                help = new int[primes.length];
                quotient = 1;
            }
            quotient++;
        }
        return primes;
    }
}
