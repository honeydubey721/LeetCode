import java.util.*;

class MinStack {

    Stack<Integer> mainStack;   // stores all values
    Stack<Integer> minStack;    // stores minimum values

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);

        // Push to minStack if it's empty or new val is smaller/equal
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = mainStack.pop();

        // If removed element is the current min, remove from minStack
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}