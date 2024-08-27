class MyStack {

    ArrayList<Integer> q = new ArrayList<>();
    int rear = -1, front = -1;
    public MyStack() {
        int rear = -1;
        int front = -1;
    }
    
    public void push(int x) {
        if(empty()){
            q.add(x);
            rear = front = 0;
        }else{
            q.add(x);
            rear ++;
        }
    }
    
    public int pop() {
        int popedEle = q.remove(rear);
        rear --;
        return popedEle;
        
    }
    
    public int top() {
        return q.get(rear);
    }
    
    public boolean empty() {
        return rear == -1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */