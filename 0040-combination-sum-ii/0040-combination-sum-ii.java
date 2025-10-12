class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,target,path,result,0);
        return result;

    }
    public void backtrack(int[] candidates,int target,List<Integer> path,List<List<Integer>> result,int start){
        if(target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if(target < 0) {
            return;
        }
        for(int  i = start;i<candidates.length;i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            path.add(candidates[i]);
            backtrack(candidates,target - candidates[i],path,result,i+1);
            path.remove(path.size()-1);
        }
    }
}