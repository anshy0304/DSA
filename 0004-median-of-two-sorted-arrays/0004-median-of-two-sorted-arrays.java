class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[k++]=nums1[i++];
            }
            else
            {
                arr[k++]=nums2[j++];
            }
        }
        while(i<n)
        {
            arr[k++]=nums1[i++];
        }
        while(j<m)
        {
            arr[k++]=nums2[j++];
        }
        int a=arr.length;
        if(a%2==0)
        {
            int mid1=a/2;
            int mid2=(a/2)-1;
            int s=arr[mid1]+arr[mid2];
            return s/2.0;
        }
        int mid=a/2;
        return arr[mid];
    }
}