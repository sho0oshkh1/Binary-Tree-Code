public class treedriver{
  
  public static void main(String[]args){
  
  
   System.out.println("creating tree");
   btree tree=new btree();
   
   System.out.println("count nodes in empty tree");
   System.out.println(tree.countnodes());
   
   System.out.println("creat nodes with data 1");
   Node root = new Node(1);
   
   System.out.println("Set node as root");
   tree.setroot(root);
   
   System.out.println("count nodes in tree with only root added");
   System.out.println(tree.countnodes());
   
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
   
   
   System.out.println("set the current node to be the root");
   tree.setcurrent(tree.getroot());
   
   System.out.println("display the current node");
   System.out.println(tree.getcurrent().getdata());
   
   Node currentnode = tree.getcurrent();
   
   System.out.println("count nodes in tree with 7 nodes added");
   System.out.println(tree.countnodes());
   
   System.out.println("in order print");
   tree.printinorder();
   
   System.out.println("\npre order print");
   tree.printpreorder();
   
   System.out.println("\npost order print");
   tree.printpostorder();
   
   System.out.println("\ndisplay the nodes as tree diagram");
   tree.print();
}
}