import java.util.*;

 public class Nodedriver {

   public static Scanner input = new Scanner(System.in);
 
     public static void main(String[] args) {
     
      Node root = new Node(1);
      Node node2 = new Node(2);
      Node node3 = new Node(3); 
      Node node4 = new Node(4);
      Node node5 = new Node(5); 
      Node node6 = new Node(6);
      Node node7 = new Node(7);
     
     
     root.setleft(node2);
     node2.setleft(node4);
     node2.setright(node5);
     node5.setleft(node7);
     root.setright(node3);
     node3.setright(node6);
     
     root.printinorder(root);
     System.out.println();
     root.printpostorder(root);
     System.out.println();
     root.printpreorder(root);
     
     
  System.out.println();
  root.print();
  }
  

}
