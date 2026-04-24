// Problem 43: Multiply Strings
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// The given numbers are in string format, so we cannot directly multiply them as integers.
// We simulate the traditional multiplication method (as done manually).
//
// Start multiplying digits from right to left for both strings.
// For each pair of digits, multiply them and store the result in an array
// at the correct position based on their indices.
//
// We use an array of size (m + n) because the maximum length of the result
// can be the sum of lengths of both numbers.
//
// While storing the result, handle carry by distributing it to the left position.
//
// Finally, skip leading zeros and convert the array into a string to get the answer.

// Time Complexity: O(m × n)
// Space Complexity: O(m + n)

package String;

public class Multiple_String {
    public String multiply(String num1, String num2) {
        // Edge case
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length();
        int n = num2.length();

        int[] res = new int[m + n];

        // Multiply from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = mul + res[p2];

                res[p2] = sum % 10;      // store digit
                res[p1] += sum / 10;     // carry
            }
        }

        // Build result string
        StringBuilder result = new StringBuilder();

        for (int num : res) {
            // skip leading zeros
            if (!(result.length() == 0 && num == 0)) {
                result.append(num);
            }
        }

        return result.toString();
    }

}
