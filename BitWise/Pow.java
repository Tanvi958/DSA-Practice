// Problem 50: Pow(x, n)
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use Binary Exponentiation (Fast Power) to compute x^n efficiently.
// First, convert n to long to handle overflow cases.
// If n is negative, we take reciprocal of x and make n positive.
// Then, we repeatedly square x and reduce n by half using bit operations.
// If the current bit of n is 1, we multiply result with x.
// This reduces the time complexity significantly compared to naive multiplication.

// Time Complexity: O(log n)
// Space Complexity: O(1)

//For Pow(x, n), the best method is : Binary Exponentiation (Fast Power)

/*1. Very Fast
Instead of multiplying x n times (O(n))
It reduces operations using powers of 2
Time Complexity becomes O(log n)

2. Uses Bit Manipulation
(N & 1) → checks if current power is odd
N >> 1 → divides power by 2

Efficient and commonly asked in interviews


3. Handles Edge Cases
Negative powers (n < 0)
Large values of n (avoids overflow using long)
*/

package BitWise;

public class Pow {
    public double myPow(double x, int n) {
        long N = n;
        if(N<0){
            x=1/x;
            N=-N;
        }

        double result =1;
        while(N>0)
            {
                if((N&1)==1){
                    result*=x;
                }

                x*=x;
                N>>=1;
            }

        return result;
    }
}
