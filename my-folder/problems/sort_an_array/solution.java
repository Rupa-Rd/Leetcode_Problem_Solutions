class Solution {
    public int[] sortArray(int[] nums) {
        // Time complexities
        // Bubble sort: O(n^2)
        // Insertion sort: O(n^2)
        // Selection sort: O(n^2)
        // Merge sort: O(nlogn) --> Chosen
        // Quick sort: O(n^2)
        mergeSort(nums, nums.length);
        return nums;
    }
    public void mergeSort(int[] nums, int n){
        if(n < 2){
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        // Spliting left array
        for(int i = 0; i < mid; i ++){
            left[i] = nums[i];
        }
        // Splitting right array
        for(int i = mid; i < n; i ++){
            right[i - mid] = nums[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);
        
        merge(nums, left, right, mid, n - mid);
    }
    public void merge(int[] nums, int[] left, int[] right, int n, int m){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(left[i] < right[j]){
                nums[k++] = left[i++];
            }else{
                nums[k++] = right[j++];
            }
        }
        while(i < n){
            nums[k++] = left[i++];
           
        }
        while(j < m){
            nums[k++] = right[j++];
        }
    }
}