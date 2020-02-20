//Min Stack

class MinStack {

    Stack<Integer> stack= new Stack();
    Stack<Integer> min_vals= new Stack();
    
    /** initialize your data structure here. */
    
    public void push(int x) {
          if(min_vals.isEmpty() || x<=min_vals.peek())
        {
            min_vals.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.peek().equals(min_vals.peek()))
        {
            min_vals.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return min_vals.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */