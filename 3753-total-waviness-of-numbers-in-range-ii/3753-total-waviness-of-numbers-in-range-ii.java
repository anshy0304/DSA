class Solution {

    static class Pair {
        long count;
        long wave;

        Pair(long count, long wave) {
            this.count = count;
            this.wave = wave;
        }
    }

    private char[] digits;
    private Pair[][][][] memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long n) {
        if (n < 0) return 0;

        digits = Long.toString(n).toCharArray();

        memo = new Pair[20][11][11][3];

        return dfs(0, 10, 10, 0, true).wave;
    }

    private Pair dfs(int pos,
                     int prev2,
                     int prev1,
                     int state,
                     boolean tight) {

        // Base Case
        if (pos == digits.length) {
            return new Pair(1, 0);
        }

        // Memo Lookup
        if (!tight && memo[pos][prev2][prev1][state] != null) {
            return memo[pos][prev2][prev1][state];
        }

        int limit = tight ? digits[pos] - '0' : 9;

        long totalCount = 0;
        long totalWave = 0;

        for (int d = 0; d <= limit; d++) {

            boolean nextTight =
                    tight && (d == limit);

            int nPrev2 = prev2;
            int nPrev1 = prev1;
            int nState = state;

            int addWave = 0;

            // No digit started yet
            if (state == 0) {

                if (d != 0) {
                    nState = 1;
                    nPrev1 = d;
                }

            }

            // One digit already chosen
            else if (state == 1) {

                nState = 2;
                nPrev2 = prev1;
                nPrev1 = d;

            }

            // At least two digits chosen
            else {

                if ((prev1 > prev2 && prev1 > d) ||
                    (prev1 < prev2 && prev1 < d)) {
                    addWave = 1;
                }

                nPrev2 = prev1;
                nPrev1 = d;
            }

            Pair child = dfs(
                    pos + 1,
                    nPrev2,
                    nPrev1,
                    nState,
                    nextTight
            );

            totalCount += child.count;

            totalWave += child.wave;

            if (addWave == 1) {
                totalWave += child.count;
            }
        }

        Pair ans = new Pair(totalCount, totalWave);

        // Memo Store
        if (!tight) {
            memo[pos][prev2][prev1][state] = ans;
        }

        return ans;
    }
}