/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int ab(int target, MountainArray arr,int st,int end){
        while(st<=end){
            int mid = st +(end-st)/2;
            if(arr.get(mid) == target) return mid;
            else if(arr.get(mid) > target) end = mid -1;
            else st = mid+1;
        }
        return -1;
    }
    public int db(int target, MountainArray arr,int st,int end){
        while(st<=end){
            int mid = st +(end-st)/2;
            if(arr.get(mid) == target) return mid;
            else if(arr.get(mid) > target) st = mid+1;
            else end = mid-1;
        }
        return -1;
    }
    public int findPeakElement(MountainArray arr) {
        int n = arr.length();

        if (n == 1)
            return 0;

        if (arr.get(0) > arr.get(1))
            return 0;
        if (arr.get(n - 1) > arr.get(n - 2))
            return n - 1;

        int st = 1;
        int end = n - 2;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int m = arr.get(mid);
            int l = arr.get(mid-1);
            int r = arr.get(mid+1);

            if (m > l && m > r)
                return mid;

            else if (m < l)
                end = mid - 1;

            else
                st = mid + 1;
        }

        return -1;
    }

    public int findInMountainArray(int target, MountainArray arr) {
        int peak = findPeakElement(arr);
        if(arr.get(peak) == target) return peak;
        int left = ab(target,arr,0,peak-1);
        if(left != -1) return left;
        
        return db(target,arr,peak+1,arr.length()-1);
     }
}