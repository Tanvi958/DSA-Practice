// Problem 3658: GCD of Odd and Even Sums
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// The first n odd numbers are:
//      1, 3, 5, ..., (2n - 1)
//
// Their sum is:
//      n²
//
// The first n even numbers are:
//      2, 4, 6, ..., 2n
//
// Their sum is:
//      n(n + 1)
//
// We need:
//      gcd(n², n(n + 1))
//
// Factor out n:
//      gcd(n², n(n + 1))
//    = n × gcd(n, n + 1)
//
// Since consecutive numbers are always coprime:
//
//      gcd(n, n + 1) = 1
//
// Therefore:
//
//      gcd(n², n(n + 1)) = n
//
// So the answer is simply n.
//
// Example:
// Input: n = 4
//
// Odd Sum  = 1 + 3 + 5 + 7 = 16
// Even Sum = 2 + 4 + 6 + 8 = 20
//
// gcd(16, 20) = 4
//
// Output:
// 4
//
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {

    public int gcdOfOddEvenSums(int n) {

        return n;
    }
}
