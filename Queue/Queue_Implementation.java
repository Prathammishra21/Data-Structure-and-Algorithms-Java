package Queue;

public class Queue_Implementation {
    int size = 10;
    int[] items = new int[size];
    int front, rear;

    Queue_Implementation() {
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return front == 0 & rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted -> " + element);
            return (element);
        }
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + "  ");
            }
            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        Queue_Implementation queue = new Queue_Implementation();
        queue.enqueue(12);
        queue.enqueue(21);
        queue.enqueue(19);
        queue.enqueue(96);
        queue.enqueue(56);
        queue.dequeue();
        queue.display();
    }
}
