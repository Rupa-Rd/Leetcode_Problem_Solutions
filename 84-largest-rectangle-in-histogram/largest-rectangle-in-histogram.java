class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // Traverse through all the bars
        for (int i = 0; i <= n; i++) {
            // When reaching the end, we pretend the current height is 0 to flush out the stack
            int currentHeight = (i == n) ? 0 : heights[i];

            // Calculate the area with the height of the bar at the top of the stack
            while (!st.isEmpty() && currentHeight < heights[st.peek()]) {
                int height = heights[st.pop()];  // Height of the popped element
                int width = st.isEmpty() ? i : i - st.peek() - 1;  // Width is the distance between current index and stack's top
                maxArea = Math.max(maxArea, height * width);  // Update maxArea
            }

            // Push the current index to the stack
            st.push(i);
        }

        return maxArea;
    }
}
