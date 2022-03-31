package dictionary;

public class Node {
    public char data;
    public boolean isTerminating;
    public Node children [];

    public Node(char data){
        this.data = data;
        this.isTerminating = false;
        this.children = new Node[26];
    }

}
