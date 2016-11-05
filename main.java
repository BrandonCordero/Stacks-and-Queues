public class main {
  public static void main (String [] args) {
   Queue myQueue = new Queue();
    Stack myStack = new Stack();
    
    // test
     myStack.push("Brandon");
     myStack.push("Irene");
     myStack.push("Martin");
     myStack.push("Emily");
     myStack.push("Alec");
     
     myStack.print();
     
    myStack.pop().print();
      System.out.println("\nPOP WAS HERE");
      
    myStack.peek().print();
        System.out.println("\nPEEK WAS HERE");
        
       System.out.println("Done with stack");
       
        myQueue.enqueue("Brandon");
    myQueue.enqueue("Irene");
    myQueue.enqueue("Martin");
    myQueue.enqueue("Emily");
    myQueue.enqueue("Alec");
    myQueue.print();
    
    System.out.println("Done enqueueing");
      
    myQueue.dequeue().print();
    
    System.out.println("\nDequeue was used here");
    
    myQueue.peek().print();
    
    System.out.println("\nPeek was used here");
    
    myQueue.print();
      
  }
}
   
 
