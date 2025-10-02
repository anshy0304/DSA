class Solution {
    public void helper(int arr[],List<Integer> temp,List<List<Integer>> result,int k){
        if(temp.size() == k){
            result.add(new ArrayList(temp));
            return;
        }
        
        for(int num:arr){
            if(temp.contains(num)) return;
            temp.add(num);
            helper(arr,temp,result,k);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int i = 1;i<=n;i++){
            arr[i-1] = i;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(arr,temp,result,k);
        return result;

    }
}