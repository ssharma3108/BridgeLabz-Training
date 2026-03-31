class Stack {
    private int size;
    private int top;
    private int[] array;

    public Stack(int size) {
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! " + value);
        } else {
            array[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!.");
            return -1;
        } else {
            int popV = array[top--];
            return popV;
        }
    }

    public int peek() {
        if (top == -1) {
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Peek Elemet -: " + myStack.peek());

        myStack.pop();
        myStack.pop();
        myStack.pop();

        if (myStack.isEmpty()) {
            System.out.println("Stack is empty..");
        }

    }
}
