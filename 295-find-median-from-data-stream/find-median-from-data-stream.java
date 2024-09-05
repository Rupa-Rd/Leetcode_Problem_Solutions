class MedianFinder {
    private PriorityQueue<Integer> left;  // Max-Heap (for the smaller half)
    private PriorityQueue<Integer> right; // Min-Heap (for the larger half)

    public MedianFinder() {
        // Max-Heap for the smaller half
        left = new PriorityQueue<>((a, b) -> b - a);
        // Min-Heap for the larger half
        right = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if (left.isEmpty() || num <= left.peek()) {
            left.add(num);
        } else {
            right.add(num);
        }
        
        // Rebalance the heaps if necessary
        if (left.size() > right.size() + 1) {
            right.add(left.poll());
        } else if (right.size() > left.size()) {
            left.add(right.poll());
        }
    }
    
    public double findMedian() {
        if (left.size() > right.size()) {
            return left.peek();
        } else {
            return (left.peek() + right.peek()) / 2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */