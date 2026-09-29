
//2. Develop a stack class to hold a maximum of 10 integers with suitable methods. 
// Develop a Java main method to illustrate Stack operations.   
import java.util.Scanner;

class Stack {
    int[] s = new int[10];
    int top;

    Stack() {
        top = -1;

    }

    // initialize top-of-stack
    void push(int item) {
        if (top != 9) {
            // Push only if there are free slots
            s[++top] = item;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            System.out.println("Popped item is:" + s[top]);
            // Display the popped item
            return s[top--];
            // Update the top of the stack
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty, no item to display");
        } else {
            System.out.println("Item in stack are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    } // end of display module
}

// end of class module (class Stack module ends here)
class Main {
    public static void main(String[] args) {
        int ch;
        Stack stk = new Stack();
        Scanner ob = new Scanner(System.in);
        while (true) {
            System.out.println("Stack operation demo");
            System.out.println("1:push, 2:pop, 3:display item, 4:exit");
            ch = ob.nextInt();
            switch (ch) {
                case 1:
                    if (stk.top == 9) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Enter the item to be pushed");
                        int item = ob.nextInt();
                        stk.push(item);
                    }
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("enter the valid choice");
            } // End of switch
        }
        // End of while(true) for menu display    
        }
    // End of main function
}
// // End of class module