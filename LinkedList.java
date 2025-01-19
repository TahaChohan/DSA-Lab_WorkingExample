public class LinkedList {

    Node head ; //head of the list 
    /*Link list node.This inner class is made 
     * static so that main() can access it
     */
    class Node{
        int data;
        Node next ; 
        /* constructor to create a new node 
         * next is by default initialized as null.
         */
        //Constructor 
         Node(int d){
            data = d ; 
            next = null;
        }
    }
    /*TRAVERSING A LINKED LIST */
    public void printList() {
        Node n = head;
        while (n != null) { // Traverse until the end of the list
            System.out.print(n.data + " ");
            n = n.next; // Move to the next node
        }
    }

    /*INSERTING IN LINK LIST AT START */
    public void push(int new_data){
        /*1. Allocate the node 
         * 2.Put in the data 
         */
        Node new_node = new Node(new_data);
    }
    /*Mehtod to create a singly link list with 3 nodes*/
    public static void main(String[] args) {
        /*Start with empty list  */
        //syntax 
        /*classname obj = new classname() */
        LinkedList llist = new LinkedList();
        /*Three nodes are created with data in them carrying null
         * in the next the frist is set as head of the list
         */
    
        llist.head = llist.new Node(1);
        Node second = llist.new Node(2);
        Node third = llist.new Node(3);

        //linking forst node with the second 
        llist.head.next = second; 
        //now the first points to second node  means 
        //fisrt have th addresss of the second
        second.next = third ; //Link second node woith the third 
        llist.printList();

    }
        
}