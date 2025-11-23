import java.util.*;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        for (int num : nums) {
            sum += num;
            if (num % 3 == 1) r1.add(num);
            else if (num % 3 == 2) r2.add(num);
        }

        Collections.sort(r1);
        Collections.sort(r2);

        int mod = sum % 3;
        if (mod == 0) return sum;

        int ans = 0;

        if (mod == 1) {
            int option1 = r1.size() > 0 ? sum - r1.get(0) : Integer.MIN_VALUE;
            int option2 = r2.size() > 1 ? sum - r2.get(0) - r2.get(1) : Integer.MIN_VALUE;
            ans = Math.max(option1, option2);
        } else { 
            int option1 = r2.size() > 0 ? sum - r2.get(0) : Integer.MIN_VALUE;
            int option2 = r1.size() > 1 ? sum - r1.get(0) - r1.get(1) : Integer.MIN_VALUE;
            ans = Math.max(option1, option2);
        }

        return Math.max(ans, 0);
    }
}
