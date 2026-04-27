// Problem 7: Reverse Integer
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We reverse the digits of the integer by repeatedly extracting the last digit
// using modulo (%) and building the reversed number step by step.
//
// In each iteration:
// - Extract the last digit (x % 10)
// - Remove the last digit from x (x / 10)
// - Append the digit to the reversed number (rev * 10 + digit)
//
// Before updating the reversed number, we must check for overflow.
// If rev exceeds Integer.MAX_VALUE / 10 or goes below Integer.MIN_VALUE / 10,
// adding the next digit would cause overflow.
//
// In such cases, we return 0 as required by the problem.
//
// Finally, return the reversed integer.

// Time Complexity: O(log₁₀ n)
// Space Complexity: O(1)

package Simple_Problem;

public class Reverse_Integer {
    public int reverse(int x) {
        int rev=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(x!=0)
        {
            int digit=x%10;
            x=x/10;
        
        if(rev>max/10||rev==max/10 && digit>7 )
        {
            return 0;
        }
         if(rev<min/10||rev==max/10 && digit<-8 )
        {
            return 0;
        }
        rev=rev*10+digit;
        }
        return rev;
    } 
}

