import java.util.ArrayList;
import java.util.List;

class Node {}

class AssignNode extends Node {

    private Node left;
    private Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "=\n"+
                "Left node: " + getLeft().toString() + "\n" +
                "Right node: " + getRight().toString() + "\n";
    }
}

class PlusNode extends Node {

    private Node left;
    private Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "+\n"+
                "Left node: " + getLeft().toString() + "\n" +
                "Right node: " + getRight().toString() + "\n";
    }

}


class BlockNode extends Node {
    List<Node> nodeList = new ArrayList<>();

    public void addNode(Node node){
        nodeList.add(node);
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public String toString() {
        return "Block Node\n";
    }
}

class SemiNode extends Node {

    private Node left;
    private Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Block node\n"+
                "Left node: " + getLeft().toString() + "\n" +
                "Right node: " + getRight().toString() + "\n";
    }
}

class NumNode extends Node {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NUM: " + value;
    }
}

class IDNode extends Node {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ID: " + value;
    }
}