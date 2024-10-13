package MinStack;

import java.util.Objects;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack();
    }

    public void push(int val){
        stack.push(val);
        if (minStack.isEmpty()){
            minStack.push(val);
            return;
        } else if (minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop(){
        if (Objects.equals(minStack.peek(), stack.peek())){
            stack.pop();
            minStack.pop();
            return;
        }
        stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}
