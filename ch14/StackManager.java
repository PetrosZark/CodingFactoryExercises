package gr.aueb.cf.ch14;

public class StackManager {
    private static StackManager instance;
    private String[] stack;
    private int top;


    private StackManager(int capacity) {
        stack = new String[capacity];
        top = -1;
    }

    public static StackManager getInstance(int capacity) {
        if (instance == null) {
            instance = new StackManager(capacity);
        }
        return instance;
    }

    public void push(String string) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        stack[top] = string;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        top--;
        return stack[top];
    }

    private boolean isFull() {
        return top == stack.length -1;
    }

    private boolean isEmpty() {
        return top == -1;
    }


}
