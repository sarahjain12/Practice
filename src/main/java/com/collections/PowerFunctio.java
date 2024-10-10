package com.collections;

/*
Some important concepts related to this approach:

Every number can be written as the sum of powers of 2
We can traverse through all the bits of a number from LSB to MSB in O(log n) time.
Illustration:

 3^10 = 3^8 * 3^2. (10 in binary can be represented as 1010, where from the left side the first 1 represents 3^2 and the second 1 represents 3^8)

3^19 = 3^16 * 3^2 * 3. (19 in binary can be represented as 10011, where from the left side the first 1 represents 3^1 and second 1 represents 3^2 and the third one represents 3^16)

 */

class PowerFunctio {

    static int power(int x, int n)
    {
        int result = 1;
        while (n > 0) {
            if (n % 2 != 0) // y is odd
            {
                result = result * x;
            }
            x = x * x;
            n = n >> 1; // y=y/2;
        }
        return result;
    }

    /*
    static int calculatePower(int x, int n) {
        // Calculate the power using the exp and log functions
        // from the Math library
        double result = Math.exp(Math.log(x) * n);

        // Round the result to the nearest integer
        result = Math.round(result);

        return (int) result;
    }

     */

    // Driver Code
    public static void main(String[] args)
    {
        int x = 2;
        int n = 3;

        // Function call
        System.out.println(power(x, n));
    }
}