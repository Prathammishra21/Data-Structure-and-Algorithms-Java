package Stack;

public class Stack_Implementation {
    private static int[] arr;
    private static int top;
    private static int capacity;

    Stack_Implementation(int size) {
        arr = new int[size];                         //  Creating a stack
        capacity = size;
        top = -1;
    }

    public static void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
            System.exit(1);                   // Add elements into stack
        } else {
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty");      // Remove elements from stack
            System.exit(1);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;                            // Function to return size of stack
    }

    private static boolean isEmpty() {
        return top == -1;                          // Check if stack is empty
    }

    private static boolean isFull() {
        return top == capacity - 1;                // Check if stack is full
    }

    public static void printStack() {
        for (int i = 0; i <= top; i++) {          // using loop for printing stack
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack_Implementation stack = new Stack_Implementation(5);
        Stack_Implementation.push(1);
        Stack_Implementation.push(14);
        Stack_Implementation.push(51);
        Stack_Implementation.push(144);
        Stack_Implementation.push(132);
        Stack_Implementation.printStack();

        int poppedelement = Stack_Implementation.pop();
        System.out.println("Popped element: " + poppedelement);
        System.out.println("After Popping element: ");

        Stack_Implementation.printStack();
    }
}
