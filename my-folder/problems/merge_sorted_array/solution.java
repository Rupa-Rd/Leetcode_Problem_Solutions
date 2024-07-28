class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if(n == 0)
        //     return nums1;
        // if(m == 0)
        //     return nums2;
            
        int j =0;
        for(int i = m; i < nums1.length; i ++){
            nums1[i] = nums2[j];
            j ++;
        }
            
        Arrays.sort(nums1);
        
    }
}