public class Queue
{
  // properties
  Node head;
  Node tail;

  // Constructors
    Queue() { 
    this.head = null;
    this.tail = null;
  }
  // getters and setters
   public Node getHead() {
    return this.head;
  }
  public Node getTail() {
    return this.tail;
  }
  public void setHead(Node newHead) {
    if (this.head == this.tail)
      this.tail = newHead;
    this.head = newHead;
  }
  public void setTail(Node newTail) {
    if (this.head == this.tail)
      this.head = newTail;
    this.tail = newTail;
  }
  
  // methods
   public void enqueue(String newString) {
    Node newNode = new Node(newString);
   if (this.isEmpty()) {
      this.head = newNode;
      this.tail = newNode;
    }
    else 
    // compare nodes & put new node in order
    {
      // start at the head of the list
      Node current = this.head;
      
      while(current != null) {
        
          if (current.getNext() == null) {
          current.setNext(newNode);
          newNode.setPrev(current);
          this.tail = newNode;
          break;
        }
        current = current.getNext();
      }
    }
  }
   
   public boolean isEmpty() {
    // tests if the list is empty
    return this.head == null;
  
}
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
  
  public void printReverse() {
    // traverses and prints from tail
    // local Node variable to keep track of where we are
    // start at the tail of the list
    Node current = this.tail;
    // loop through until we get to end of list
    while(current != null) {
      current.print(); // print current node
      // move current to the next node
      current = current.getPrev();
    }
    System.out.println("");
  }
   public boolean deleteNode(String data) {
    Node current = this.head;
    while(current != null) {
      if (current.getNext() != null && current.getNext().getData() == data) {
        current.setNext(current.getNext().getNext());
        current.getNext().setPrev(current);
        return(true);
      }
      current = current.getNext();
    }
    return(false);
  }
  
 public void deleteList() {
    this.head = null;
    this.tail = null;
  }
}
 
 
 
  