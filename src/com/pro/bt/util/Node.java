package src.com.pro.bt.util;

public class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int value){
        this.value=value;
        left=null;
        right=null;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * @return the left
     */
    public Node getLeft() {
        return left;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * @return the right
     */
    public Node getRight() {
        return right;
    }
}