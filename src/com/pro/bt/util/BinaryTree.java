package src.com.pro.bt.util;

public class BinaryTree{
    private Node root;

    public void addNode(int value){
        root=addRecursive(root, value);
    }

    public Node addRecursive(Node node, int value){
        if(node==null){
            return new Node(value);
        }
        if(value<node.getValue()){
            node.setLeft(addRecursive(node.getLeft(), value));
        }else{
            node.setRight(addRecursive(node.getRight(), value));
        }

        return node;
    }

    public void traverseOrder(Node node){
        if(node.getLeft()!=null){
            traverseOrder(node.getLeft());
        }
        System.out.println(node.getValue());
        if(node.getRight()!=null){
            traverseOrder(node.getRight());
        }
    }

    public void printTree(){
        traverseOrder(root);
    }
}