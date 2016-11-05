public class Node {
  // properties
  private String data;
  
  private Node next;

  // Constructors
  Node(String d) { 
    this.data = d; 
    this.next = null;
    
  }
  public String getData(){
    return this.data;
  }
  
  public Node getNext() {
    return this.next;
  }
  
  public void setData(String newData) {
    this.data = newData;
  }
  
  public void setNext(Node newNext) {
    this.next = newNext;
  }
  //Methods
   public void print() {
    System.out.print(data + " " );
 }
 }
