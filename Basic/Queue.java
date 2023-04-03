//This file is to handle events closest related to the queue

public class Queue {
    //creating attributes
    int front, rear, size;
    LinkedList list;

    //constructor
    public Queue() {
        //setting values to 0
        front = rear = 0;
        size = 0;
        //initializing a linked list
        list = new LinkedList();
    }

    //checking if queue is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    //adding item to queue
    public void enQueue(int item) {
        //updating vars
        rear++;
        size++;
        //if node is first
        if (size == 1) {
            //updating var
            front++;
            //setting head of list
            list.setHead(list,item);
        //node is not first
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
        
        System.out.println("Ticket #"+item+" has been enqueued to the queue.");
    }

    //removing item from queue
    public Node deQueue() {
        //if queue is empty
        if (isEmpty()) {
            System.out.println("Empty - Queue is already empty");
            //creating empty node object
            Node n = new Node();
            return n;
        //queue is not empty
        } else {
            //setting attribute
            Node discarded = list.getNode(list, front);
            //decreasing size by 1
            size--;
            //adding 1 to front
            front++;
            //if size is not 0
            if (size != 0) {
                //updating head value of linked list
                list.reHead(list);
            }
            System.out.println("Ticket #"+discarded.data+" has been dequeued from the queue.");
            return (list.getNode(list, front));
        }
    }

    //getting front val
    public Node Front() {
        //if queue is empty
        if (isEmpty()) {
            //creating empty node object
            Node n = new Node();
            return n;
        //queue is not empty
        } else {
            return (list.getNode(list,front));
        }
    }

    //getting rear val
    public Node Rear() {
        //if this queue is empty
        if (isEmpty()) {
            //creating empty node object
            Node n = new Node();
            return n;
        //this queue is not empty
        } else {
            return (list.getNode(list,rear));
        }
    }
}