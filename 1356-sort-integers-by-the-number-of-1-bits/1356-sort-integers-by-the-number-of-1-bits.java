class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {

            int cA = Integer.bitCount(a);
            int cB = Integer.bitCount(b);

            if (cA == cB) {
                return a - b;
            }

            return cA - cB;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}