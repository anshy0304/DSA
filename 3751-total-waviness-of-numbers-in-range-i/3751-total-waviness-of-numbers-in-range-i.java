class Solution {
    public int totalWaviness(int num1, int num2) {
        int wave = 0;
        for(int j=num1;j<=num2;j++){
            int i = j;
            while(i >= 100){
                int n1 = i % 10;
                int n2 = (i / 10) % 10;
                int n3 = (i / 100) % 10;

                if(n2 > n1 && n2 > n3) wave++;
                else if(n2 < n1 && n2 < n3) wave++;
                i /= 10;
            }
        }
        return wave;
    }
}