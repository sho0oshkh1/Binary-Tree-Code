public class btree{
 
 private Node root;
 private Node currentnode;
 
 
  public btree(){
   root=null;
  }
  
  public boolean search(int data){
  
    return search(root, data);
  }
   
  private boolean search(Node node, int data){
  
   if(node.getdata()==data)
    return true;
   
   if(node.getleft() != null)
   
   if(search(node.getleft(),data))
       return true;
   if(node.getright() != null)
   
   if(search(node.getright(),data))
       return true;
   
   return false;
  }
  
  public void printinorder(){
   root.printinorder(root);
  }
  
  public void printpreorder(){
   root.printpreorder(root);
  }
  
  public void printpostorder(){
   root.printpostorder(root);
  }
  
  public Node getroot(){
   return root;
  }
  
  public void setroot(Node root){
   this.root=root;
  }
  
  public boolean isempty(){
   
    return root == null;
  }
  
  public int countnodes(){
   
   return countnodes(root);
  }
  
  public int countnodes(Node node){
    
    int count=1;
    if(node == null){
      return 0;
    }
    
    else{ 
       count += countnodes(node.getleft());
       count += countnodes(node.getright());
    return count;
    }
  
  }
  
  public void print(){
    root.print();
  }
  
  public Node getcurrent(){
   return currentnode;
  }
  
  public void setcurrent(Node node){
   this.currentnode=node;
  }
  
}