//This file is to handle events closest related to the stack

public class Stack {
    //creating attributes
    int top, size;
    LinkedList list;

    //constructor
    public Stack() {
        //setting values to 0
        top = size = 0;
        //initiallizing linked list
        list = new LinkedList();
    }

    //checking if stack is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    //adding item to stack
    public void push(int item) {
        //adding 1 to size & top
        size++;
        top++;
        //if size is 1
        if (size == 1) {
            //setting head of list
            list.setHead(list, item);
        //size is not 1
        } else {
            //adding item to list
            list.addNode(list, item);
            //if size is 2
            if (size == 2) {
                //setting tail of list
                list.setTail(list);
            //size is not 2
            } else {
                //updating tail of linked list
                list.reTail(list);
            }
        }

        System.out.println("Ticket #"+item+" has been pushed into the stack.");
    }

    //removing item from stack
    public Node pop() {
        //if stack is empty
        if (isEmpty()) {
            System.out.println("Empty - Stack is already empty");
            //creating empty node object
            Node n = new Node();
            return n;
        //stack is not empty
        } else {
            //setting attribute
            Node discarded = list.getNode(list, top);
            //decreasing top & size by 1
            size--;
            top--;
            //if size is not 0
            if (size != 0) {
                //updating tail value of linked list
                list.reTail(list);
            }
            System.out.println("Ticket #"+discarded.data+" has been popped from the stack.");
            return (list.getNode(list, top));
        }
    }

    //returning top item
    public Node peek() {
        //if stack is empty
        if (isEmpty()) {
            //creating empty node object
            Node n = new Node();
            return n;
        //stack is not empty
        } else {
            return (list.getNode(list, top));
        }
    }
}
