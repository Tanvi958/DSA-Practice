// Problem 67: Add Binary
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We simulate binary addition similar to how we add numbers manually.
// Start from the end of both strings and move towards the beginning.
// At each step, add corresponding digits along with the carry.
// Store the result of sum % 2 and update carry as sum / 2.
// Continue until all digits and carry are processed.
// Finally, reverse the result to get the correct binary sum.

// Time Complexity: O(max(n, m))
// Space Complexity: O(max(n, m))

package String;

class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);   // remainder
            carry = sum / 2;          // carry
        }

        return result.reverse().toString();
    }
}