class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean ans = true;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0; i < target.length; i++){
            if(arr[i] != target[i]){
                ans = false;
                break;
            }
        }
        
        return ans;
    }
}