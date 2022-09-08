// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class MinStack {
    Stack<Integer> stk,minstk;
    int min;

    public MinStack() {
        stk= new Stack<Integer>();
        minstk=new Stack<Integer>();
        min=Integer.MAX_VALUE;
        minstk.push(min);
        
    }
    
    public void push(int val) {
        stk.push(val);
        if(val<=minstk.peek()){
            minstk.push(val);
        }
        
        
        
    }
    
    public void pop() {
        if(stk.peek().equals(minstk.peek()))

        {
            minstk.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
        
    }
    
    public int getMin() {
        return minstk.peek();
        
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
