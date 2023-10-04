class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> minVal ;
    public MinStack() {
        stack = new Stack();
        minVal = new Stack();
    }
    
    public void push(int val) {
        if(minVal.isEmpty()||val<=minVal.peek()){
            minVal.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
     if(stack.peek().equals(minVal.peek())){
         minVal.pop();
     }
     stack.pop();   
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minVal.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */