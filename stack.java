import java.util.Scanner;

public class stack {
    int top = -1;// pointer to the top element of the stack
    int MAX = 66;// size of the stack
    int[] stack = new int[MAX];// declare the array to store the stack

    stack() {
        System.out.println("enter the option\n1.enter the element\n2.display\n3.peek\n4.delete\n");
    }

    public void push() {
        if (top == MAX - 1) { // if the stack is full
            System.out.println("Stack is full");

        } else {
            System.out.println("enter the element to be pushed & enter -1 to exit ");
            int val = 0;
            while (val != -1 && top != MAX - 1) {
                val = new Scanner(System.in).nextInt(); // read the element from the user
                if (val != -1) {
                    top++; // increses the top pointer
                    stack[top] = val; // stores the value in the stack
                }
            }

        }
    }

    public void display() {
        if (top == -1) { // the condition to check if the stack is empty or not
            System.out.println("Stack is empty");
        } else {
            System.out.println("The element in the stack are :");
            for (int i = top; i >= 0; i--) { // printing the stack from top to bottom
                System.out.println(stack[i]);
            }
        }
    }

    public void peek() {
        if (top == -1) { // the condition to check if the stack is empty or not
            System.out.println("Stack is empty");
        } else {
            System.out.println("The top element of the stack is :" + stack[top]);
        }
    }

    public void delete() {
        if (top == -1) { // the condition to check if the stack is empty or not
            System.out.println("Stack is empty");
        } else {
            System.out.println("The element of the stack deleted is:" + stack[top]);
            top--;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        int sc = new Scanner(System.in).nextInt();
        do {
            if (sc == 1) {
                s.push();
            } else if (sc == 2) {
                s.display();
            } else if (sc == 3) {
                s.peek();
            } else if (sc == 4) {
                s.delete();
            } else {
                System.out.println("exit");
                break;
            }
            System.out.println("enter the option\n1.enter the element\n2.display\n3.peek\n4.delete\n5.exit");
            sc = new Scanner(System.in).nextInt();
        } while (sc != -1);
    }
}