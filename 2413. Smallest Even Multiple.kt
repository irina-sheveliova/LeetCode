// https://leetcode.com/problems/smallest-even-multiple/

class Solution {
    fun smallestEvenMultiple(n: Int): Int {
        return if (n % 2 == 0) n else n * 2
    } 
}
