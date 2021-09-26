package net.htlgkr.mittermayrm180114.beispiel2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int upperLimit = 100;
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(upperLimit);
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        boolean isPrime = true;
        for(int i = 0; i < upperLimit; i++)
        {
            isPrime = eps.isPrime(i);

            if(isPrime == true)
            {
                primeNumbers.add(i);
            }
        }

        for(int i = 4; i < upperLimit; i+=2)
        {
            evenNumbers.add(i);
        }
    }
}
