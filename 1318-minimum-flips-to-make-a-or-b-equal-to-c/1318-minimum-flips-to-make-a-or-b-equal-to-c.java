class Solution {
    public int minFlips(int a, int b, int c) {
        int temp = (a|b)^c;
        return Integer.bitCount(temp) + Integer.bitCount((a&b)&temp);
    }
}