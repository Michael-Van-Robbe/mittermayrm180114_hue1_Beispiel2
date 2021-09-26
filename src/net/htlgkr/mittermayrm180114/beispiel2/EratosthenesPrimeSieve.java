package net.htlgkr.mittermayrm180114.beispiel2;

public class EratosthenesPrimeSieve implements PrimeSieve
{
    int upperLimit;
    public EratosthenesPrimeSieve(int upperLimit)
    {
        this.upperLimit = upperLimit;
    }

    @Override
    public boolean isPrime(int p)
    {
        boolean isPrime = true;

        if(p <= 1)
        {
            isPrime = false;
        }

        for(int i = 2; i < p; i++)
        {
            if(p % i == 0)
            {
                isPrime = false;
            }
        }

        return isPrime;
    }

    @Override
    public void printPrimes()
    {
        boolean isPrime = true;

        for(int i = 0; i < upperLimit; i++)
        {
            isPrime = isPrime(i);

            if(isPrime == true)
            {
                System.out.println(i);
            }
        }
    }
}
