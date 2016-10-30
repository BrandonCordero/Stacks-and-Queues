public class Stacks
{
  // properties
  Node head;

  // Constructors
  Stacks() { 
    this.head = null;
    
 }
  
  // getters & setters
  public Node getHead() {
    return this.head;
  }

  public void setHead(Node newHead) {
    this.head = newHead;
  }

  
  
  // Methods
  // Adds node to the head of the list
  public void push(int newInt) {
    Node newNode = new Node(newInt);
    
    // if list is empty, 
    //add data to new head node
    if (this.isEmpty()) {
      this.head = newNode;
    }
    else 
    {
      newNode.setNext(head);
      head = newNode;
    }
  }
  
  public boolean isEmpty() {
    // tests if the list is empty
    return this.head == null;
  }
  
  // removes & returns top node from stack
  public Node pop() {
    // temporary node (to return)
    Node tmp = this.head;
    this.head = head.getNext();
    // isolate tmp node before returning
    // we wouldn't have to do this if
    // we were returning an int instead of
    // a Node
    tmp.setNext(null);
    // node return the dequeued
    return(tmp);
  }
  
  // deletes entire list
  public void deleteList() {
    this.head = null;
  }
  
  /*public void addNode(Node n){
  }*/
  
  public void print() {
    // local Node variable to keep track of where we are
    // start at the head of the list
    Node current = this.head;
    // loop through until we get to end of list
    while(current != null) {
      current.print(); // print current node
      // move current to the next node
      current = current.getNext();
    }
    System.out.println("");
  }  
  
}
