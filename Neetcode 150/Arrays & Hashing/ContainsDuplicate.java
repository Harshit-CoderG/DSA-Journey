import java.util.HashSet;

/**
 * Problem: Contains Duplicate
 * Platform: LeetCode
 * Category: Arrays / Hashing
 *
 * Approach:
 * - Use a HashSet to store visited elements.
 * - If an element already exists in the set, return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> seenNumbers=new HashSet<>();
         for(int num:nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
         }
         return false;
    }
}