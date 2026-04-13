// Problem 58: Length of Last Word
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We traverse the string from the end.
// First, we skip all trailing spaces (if any).
// Then, we count characters until we encounter a space.
// The count gives the length of the last word.

// Time Complexity: O(n)
// Space Complexity: O(1)

package String;

public class Len_of_Last_Word {
    
    public int lengthOfLastWord(String s) {
        int length=0;
        int i= s.length()-1;

        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ')
        {
            length++;
            i--;
        }

        return length;
    }
}

