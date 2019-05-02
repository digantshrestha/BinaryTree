package src.com.pro.bt;

import src.com.pro.bt.util.BinaryTree;

public class Program{
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();

        tree.addNode(45);
        tree.addNode(78);
        tree.addNode(89);
        tree.addNode(54);
        tree.addNode(32);
        tree.printTree();
    }
}