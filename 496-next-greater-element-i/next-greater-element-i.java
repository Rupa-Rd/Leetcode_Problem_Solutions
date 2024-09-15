class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length, m = nums1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            // Condition for monotonically increasing stack
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                map.put(nums2[i], -1);
            }else{
                map.put(nums2[i], st.peek());
            }
            
            st.push(nums2[i]);
        }
        System.out.println(map);
        // Result arr
        int[] res = new int[m];
        
        for(int j = 0; j < m; j++){
            res[j] = map.get(nums1[j]);
        }
        return res;
    }
}