/**
 * Problem: Valid Anagram
 * Platform: LeetCode
 * Category: Arrays / Hashing
 *
 * Approach:
 * - First, check if both strings have equal length.
 * - Use an integer array of size 26 to store character frequencies.
 * - Increment count for characters in the first string.
 * - Decrement count for characters in the second string.
 * - If all values in the frequency array are 0, the strings are anagrams.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] charCounts= new int[26];

        for(int i=0;i<s.length();i++){
            charCounts[s.charAt(i)-'a']++;
            charCounts[t.charAt(i)-'a']--;
        }
        for(int count:charCounts){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}