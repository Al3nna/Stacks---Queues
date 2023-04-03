//This file is to handle events closest related to the linked lists

public class LinkedList {
    //creating attributes
    Node head;
    Node tail;
    Node node;
    int TTLindex = 0;

    //adding node to linked list
    public void addNode(LinkedList list,int Data) {
        //setting node data
        list.node = new Node(Data);
        //adding index to total indexes
        list.TTLindex++;
        //setting current node's index
        list.node.ind = list.TTLindex;

        //creating attribute
        Node previousNode = getNode(list, node.ind-1);
        
        //setting previous node
        list.node.previous = previousNode;
        /*node.next will be set when next node is added*/

        //setting previous node's next node
        previousNode.next = list.node;
    }

    //adding first node to linked list
    public void setHead(LinkedList list,int Data) {
        //setting head data
        list.head = new Node(Data);
        //adding index to total indexes
        list.TTLindex++;
        //setting specific node's index
        list.head.ind = list.TTLindex;
        
        /*node.next will be set when next node is added*/
    }

    //setting tail node of linked list
    public void setTail(LinkedList list) {
        //setting attribute
        Node n = list.head;

        //looping while n.next is not null
        while (n.next != null) {
            //switching to next item
            n = n.next;
        }

        //recognizing tail (the tail's "next" value is null)
        list.tail = n;
    }

    //updating head node
    public void reHead(LinkedList list) {
        //setting head to next node
        list.head = getNode(list, list.head.ind+1);

            //detatching previous head from list
        //setting the next node's "previous" var to null
        list.head.previous = null;
    }

    //updating tail node
    public void reTail(LinkedList list) {
        //setting tail to next node
        list.tail = getNode(list,list.tail.ind+1);
    }

    //getting node from index
    public Node getNode(LinkedList list,int index) {
        //setting attribute
        Node n = list.head;

        //looping while node index is not the specified index
        while (n.ind != index && n.next != null) {
            //switching to next node
            n = n.next;
        }

        return n;
    }
}

//This section of the file is to handle events for individual nodes

class Node {
    //setting attributes
    Node previous;
    Node next;
    int data;
    int ind;

    //constructor (empty input)
    public Node() {
        this.previous = null;
        this.next = null;
        this.data = 0;
    }

    //constructor (filled input)
    public Node(int Data) {
        this.previous = null;
        this.next = null;
        this.data = Data;
    }

    //putting attributes into string
    public String toString() {
        //setting attribute
        String full = this.data+", at index "+this.ind;

        //if previous node is not null
        if (this.previous != null) {
            //adding previous node to full info
            full = full+"\nPrevious: "+this.previous.data;
        }

        //if next node is not null
        if(this.next != null) {
            //adding next node to full info
            full = full+"\nNext: "+this.next.data;
        }

        return full;
    }
}