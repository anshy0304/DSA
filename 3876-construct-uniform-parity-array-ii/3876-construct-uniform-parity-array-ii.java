class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];

        for (int num : nums1) {
            min = Math.min(min, num);

            if (num % 2 == 0) {
                continue;
            }
        }

        boolean allEven = true;
        for (int num : nums1) {
            if (num % 2 != 0) {
                allEven = false;
                break;
            }
        }

        return allEven || min % 2 != 0;
    }
}