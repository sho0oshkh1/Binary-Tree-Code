public class Node{
 int data;
 Node left;
 Node right;
 
   public Node(int data){
     this.data=data;
     left=null;
     right=null;
   }
   
   public void setleft(Node node){
    left=node;
   }
   
   public void setright(Node node){
    right=node;
   }
   
   public Node getleft(){
    return left;
   }
   
   public Node getright(){
    return right;
   }
   
   public void setdata(int data){
    this.data=data;
   }
   
   public int getdata(){
    return data;
   }
   
   public String print(){
    return this.print("",true,"");
   } 
   
   public String print(String prefix, boolean istail, String sb){
     
     if(right != null){
      right.print(prefix + (istail ? "|   " : "    "), false,sb);
     }
     
     System.out.println(prefix+(istail ? "\\-- " : "/-- ")+data);
      
      if(left != null){
        left.print(prefix+(istail ? "    " : "|   "),true, sb);
      }
    return sb;
   }
   
   public static void printpreorder(Node node){
     
     if(node==null)
       return;
      
      System.out.print(node.data + " ");
      printpreorder(node.left);
      printpreorder(node.right);
   }
   
   public static void printpostorder(Node node){
     
     if(node==null)
       return;
      
      printpreorder(node.left);
      printpreorder(node.right);
      System.out.print(node.data + " ");
    
   }
   
   public static void printinorder(Node node){
    
    if(node==null)
       return;
      
      printpreorder(node.left);
      System.out.print(node.data + " ");
      printpreorder(node.right);
      
   }
   
   
   
   
   
   
   
   
   
   
}