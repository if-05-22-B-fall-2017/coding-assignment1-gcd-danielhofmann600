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
        System.out.printf("Gcd of 345 and 678");
        int num1 = 345;
        int num2 = 678;
        gcdPrimeFactors(num1,num2);
        gcdEuclid(num1,num2);
    }

    private static int gcdPrimeFactors(int num1, int num2) {
        int[] primeFactors1 = getPrimeFactors(num1);
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
        return gcd;
    }

    private static int gcdEuclid(int num1, int num2) {
        while(true){
            if(num2 == 0)return num1;
            num2 = num1 % num2;
            num1 = num2;
        }
    }

    private static int[] getPrimeFactors(int num) {
        int quotient = 1;
        int[] primes = new int[1];
        int[] help = new int[1];
        while(num != 1){
            if(num % quotient == 0){
                num /= quotient;
                
            }
        }
    }
}
